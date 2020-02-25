# Copyright 2018 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

"""This script is used to synthesize generated parts of this library."""

import synthtool as s
import synthtool.gcp as gcp
import synthtool.languages.java as java

gapic = gcp.GAPICGenerator()

service = 'containeranalysis'
versions = ['v1beta1', 'v1']
config_pattern = '/google/devtools/containeranalysis/artman_containeranalysis_{version}.yaml'

get_grafeas_code = """
  /**
   * Returns a new GrafeasClient with the same configured settings.
   *
   * @throws IOException
   */
  public GrafeasClient getGrafeasClient() throws IOException {
    return GrafeasClient.create(GrafeasUtils.transformSettings(settings));
  }
"""


for version in versions:
  library = gapic.java_library(
      service=service,
      version=version,
      config_path=config_pattern.format(version=version),
      artman_output_name='')

  if version == 'v1':
      # add GrafeasClient import
      s.replace(
          library / f'gapic-google-cloud-{service}-{version}/src/**/ContainerAnalysisClient.java',
          'import com.google.iam.v1.TestIamPermissionsResponse;',
          'import com.google.iam.v1.TestIamPermissionsResponse;\nimport io.grafeas.v1.GrafeasClient;'
      )

      # add getGrafeasClient()
      s.replace(
          library / f'gapic-google-cloud-{service}-{version}/src/**/ContainerAnalysisClient.java',
          r'(\s+private final ContainerAnalysisStub stub;.*)',
          f'\g<1>{get_grafeas_code}'
      )

  package_name = f'com.google.{service}.{version}'
  java.fix_proto_headers(library / f'proto-google-cloud-{service}-{version}')
  java.fix_grpc_headers(library / f'grpc-google-cloud-{service}-{version}', package_name)
  java.fix_grpc_headers(library / f'grpc-google-cloud-{service}-{version}', f'io.grafeas.{version}')


  s.copy(library / f'gapic-google-cloud-{service}-{version}/src', f'google-cloud-{service}/src')
  s.copy(library / f'grpc-google-cloud-{service}-{version}/src', f'grpc-google-cloud-{service}-{version}/src')
  s.copy(library / f'proto-google-cloud-{service}-{version}/src', f'proto-google-cloud-{service}-{version}/src')

  java.format_code(f'google-cloud-{service}/src')
  java.format_code(f'grpc-google-cloud-{service}-{version}/src')
  java.format_code(f'proto-google-cloud-{service}-{version}/src')

java.common_templates()

