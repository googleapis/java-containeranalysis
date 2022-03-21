/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1/containeranalysis.proto

package com.google.containeranalysis.v1;

public final class Containeranalysis {
  private Containeranalysis() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_containeranalysis_v1_GetVulnerabilityOccurrencesSummaryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_containeranalysis_v1_GetVulnerabilityOccurrencesSummaryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_containeranalysis_v1_VulnerabilityOccurrencesSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_containeranalysis_v1_VulnerabilityOccurrencesSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_containeranalysis_v1_VulnerabilityOccurrencesSummary_FixableTotalByDigest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_containeranalysis_v1_VulnerabilityOccurrencesSummary_FixableTotalByDigest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/devtools/containeranalysis/v1/c"
          + "ontaineranalysis.proto\022$google.devtools."
          + "containeranalysis.v1\032\034google/api/annotat"
          + "ions.proto\032\027google/api/client.proto\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\032\036google/iam/v1/iam_polic"
          + "y.proto\032\032google/iam/v1/policy.proto\032\037goo"
          + "gle/protobuf/timestamp.proto\032\027grafeas/v1"
          + "/common.proto\032\030grafeas/v1/grafeas.proto\032"
          + "\031grafeas/v1/severity.proto\"\200\001\n)GetVulner"
          + "abilityOccurrencesSummaryRequest\022C\n\006pare"
          + "nt\030\001 \001(\tB3\340A\002\372A-\n+cloudresourcemanager.g"
          + "oogleapis.com/Project\022\016\n\006filter\030\002 \001(\t\"\220\002"
          + "\n\037VulnerabilityOccurrencesSummary\022j\n\006cou"
          + "nts\030\001 \003(\0132Z.google.devtools.containerana"
          + "lysis.v1.VulnerabilityOccurrencesSummary"
          + ".FixableTotalByDigest\032\200\001\n\024FixableTotalBy"
          + "Digest\022\024\n\014resource_uri\030\001 \001(\t\022&\n\010severity"
          + "\030\002 \001(\0162\024.grafeas.v1.Severity\022\025\n\rfixable_"
          + "count\030\003 \001(\003\022\023\n\013total_count\030\004 \001(\0032\242\010\n\021Con"
          + "tainerAnalysis\022\322\001\n\014SetIamPolicy\022\".google"
          + ".iam.v1.SetIamPolicyRequest\032\025.google.iam"
          + ".v1.Policy\"\206\001\202\323\344\223\002n\"./v1/{resource=proje"
          + "cts/*/notes/*}:setIamPolicy:\001*Z9\"4/v1/{r"
          + "esource=projects/*/occurrences/*}:setIam"
          + "Policy:\001*\332A\017resource,policy\022\312\001\n\014GetIamPo"
          + "licy\022\".google.iam.v1.GetIamPolicyRequest"
          + "\032\025.google.iam.v1.Policy\"\177\202\323\344\223\002n\"./v1/{re"
          + "source=projects/*/notes/*}:getIamPolicy:"
          + "\001*Z9\"4/v1/{resource=projects/*/occurrenc"
          + "es/*}:getIamPolicy:\001*\332A\010resource\022\203\002\n\022Tes"
          + "tIamPermissions\022(.google.iam.v1.TestIamP"
          + "ermissionsRequest\032).google.iam.v1.TestIa"
          + "mPermissionsResponse\"\227\001\202\323\344\223\002z\"4/v1/{reso"
          + "urce=projects/*/notes/*}:testIamPermissi"
          + "ons:\001*Z?\":/v1/{resource=projects/*/occur"
          + "rences/*}:testIamPermissions:\001*\332A\024resour"
          + "ce,permissions\022\216\002\n\"GetVulnerabilityOccur"
          + "rencesSummary\022O.google.devtools.containe"
          + "ranalysis.v1.GetVulnerabilityOccurrences"
          + "SummaryRequest\032E.google.devtools.contain"
          + "eranalysis.v1.VulnerabilityOccurrencesSu"
          + "mmary\"P\202\323\344\223\002:\0228/v1/{parent=projects/*}/o"
          + "ccurrences:vulnerabilitySummary\332A\rparent"
          + ",filter\032T\312A containeranalysis.googleapis"
          + ".com\322A.https://www.googleapis.com/auth/c"
          + "loud-platformB\370\001\n\037com.google.containeran"
          + "alysis.v1P\001ZUgoogle.golang.org/genproto/"
          + "googleapis/devtools/containeranalysis/v1"
          + ";containeranalysis\242\002\003GCA\252\002*Google.Cloud."
          + "DevTools.ContainerAnalysis.V1\312\002!Google\\C"
          + "loud\\ContainerAnalysis\\V1\352\002$Google::Clou"
          + "d::ContainerAnalysis::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              io.grafeas.v1.Common.getDescriptor(),
              io.grafeas.v1.GrafeasOuterClass.getDescriptor(),
              io.grafeas.v1.SeverityOuterClass.getDescriptor(),
            });
    internal_static_google_devtools_containeranalysis_v1_GetVulnerabilityOccurrencesSummaryRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_containeranalysis_v1_GetVulnerabilityOccurrencesSummaryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_containeranalysis_v1_GetVulnerabilityOccurrencesSummaryRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter",
            });
    internal_static_google_devtools_containeranalysis_v1_VulnerabilityOccurrencesSummary_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_containeranalysis_v1_VulnerabilityOccurrencesSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_containeranalysis_v1_VulnerabilityOccurrencesSummary_descriptor,
            new java.lang.String[] {
              "Counts",
            });
    internal_static_google_devtools_containeranalysis_v1_VulnerabilityOccurrencesSummary_FixableTotalByDigest_descriptor =
        internal_static_google_devtools_containeranalysis_v1_VulnerabilityOccurrencesSummary_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_devtools_containeranalysis_v1_VulnerabilityOccurrencesSummary_FixableTotalByDigest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_containeranalysis_v1_VulnerabilityOccurrencesSummary_FixableTotalByDigest_descriptor,
            new java.lang.String[] {
              "ResourceUri", "Severity", "FixableCount", "TotalCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    io.grafeas.v1.Common.getDescriptor();
    io.grafeas.v1.GrafeasOuterClass.getDescriptor();
    io.grafeas.v1.SeverityOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
