/*
 * Copyright 2019 Google LLC
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
// source: google/devtools/containeranalysis/v1beta1/discovery/discovery.proto

package io.grafeas.v1beta1.discovery;

public final class DiscoveryOuterClass {
  private DiscoveryOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_discovery_Discovery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_discovery_Discovery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_discovery_Details_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_discovery_Details_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_discovery_Discovered_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_discovery_Discovered_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/devtools/containeranalysis/v1be"
          + "ta1/discovery/discovery.proto\022\031grafeas.v"
          + "1beta1.discovery\032=google/devtools/contai"
          + "neranalysis/v1beta1/common/common.proto\032"
          + "\037google/protobuf/timestamp.proto\032\027google"
          + "/rpc/status.proto\"=\n\tDiscovery\0220\n\ranalys"
          + "is_kind\030\001 \001(\0162\031.grafeas.v1beta1.NoteKind"
          + "\"D\n\007Details\0229\n\ndiscovered\030\001 \001(\0132%.grafea"
          + "s.v1beta1.discovery.Discovered\"\206\004\n\nDisco"
          + "vered\022U\n\023continuous_analysis\030\001 \001(\01628.gra"
          + "feas.v1beta1.discovery.Discovered.Contin"
          + "uousAnalysis\0226\n\022last_analysis_time\030\002 \001(\013"
          + "2\032.google.protobuf.Timestamp\022M\n\017analysis"
          + "_status\030\003 \001(\01624.grafeas.v1beta1.discover"
          + "y.Discovered.AnalysisStatus\0221\n\025analysis_"
          + "status_error\030\004 \001(\0132\022.google.rpc.Status\"S"
          + "\n\022ContinuousAnalysis\022#\n\037CONTINUOUS_ANALY"
          + "SIS_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\014\n\010INACTIV"
          + "E\020\002\"\221\001\n\016AnalysisStatus\022\037\n\033ANALYSIS_STATU"
          + "S_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\014\n\010SCANNING"
          + "\020\002\022\024\n\020FINISHED_SUCCESS\020\003\022\023\n\017FINISHED_FAI"
          + "LED\020\004\022\030\n\024FINISHED_UNSUPPORTED\020\005B\204\001\n\034io.g"
          + "rafeas.v1beta1.discoveryP\001Z\\google.golan"
          + "g.org/genproto/googleapis/devtools/conta"
          + "ineranalysis/v1beta1/discovery;discovery"
          + "\242\002\003GRAb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grafeas.v1beta1.common.Common.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        },
        assigner);
    internal_static_grafeas_v1beta1_discovery_Discovery_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1beta1_discovery_Discovery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_discovery_Discovery_descriptor,
            new java.lang.String[] {
              "AnalysisKind",
            });
    internal_static_grafeas_v1beta1_discovery_Details_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_grafeas_v1beta1_discovery_Details_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_discovery_Details_descriptor,
            new java.lang.String[] {
              "Discovered",
            });
    internal_static_grafeas_v1beta1_discovery_Discovered_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_grafeas_v1beta1_discovery_Discovered_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_discovery_Discovered_descriptor,
            new java.lang.String[] {
              "ContinuousAnalysis", "LastAnalysisTime", "AnalysisStatus", "AnalysisStatusError",
            });
    io.grafeas.v1beta1.common.Common.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
