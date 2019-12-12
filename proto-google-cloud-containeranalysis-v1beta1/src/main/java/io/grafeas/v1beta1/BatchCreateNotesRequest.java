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
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

package io.grafeas.v1beta1;

/**
 *
 *
 * <pre>
 * Request to create notes in batch.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.BatchCreateNotesRequest}
 */
public final class BatchCreateNotesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.BatchCreateNotesRequest)
    BatchCreateNotesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchCreateNotesRequest.newBuilder() to construct.
  private BatchCreateNotesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchCreateNotesRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchCreateNotesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchCreateNotesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                notes_ =
                    com.google.protobuf.MapField.newMapField(NotesDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.String, io.grafeas.v1beta1.Note> notes__ =
                  input.readMessage(
                      NotesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              notes_.getMutableMap().put(notes__.getKey(), notes__.getValue());
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1beta1.Grafeas
        .internal_static_grafeas_v1beta1_BatchCreateNotesRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 2:
        return internalGetNotes();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.Grafeas
        .internal_static_grafeas_v1beta1_BatchCreateNotesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.BatchCreateNotesRequest.class,
            io.grafeas.v1beta1.BatchCreateNotesRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the notes are to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the notes are to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOTES_FIELD_NUMBER = 2;

  private static final class NotesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, io.grafeas.v1beta1.Note>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, io.grafeas.v1beta1.Note>newDefaultInstance(
                    io.grafeas.v1beta1.Grafeas
                        .internal_static_grafeas_v1beta1_BatchCreateNotesRequest_NotesEntry_descriptor,
                    com.google.protobuf.WireFormat.FieldType.STRING,
                    "",
                    com.google.protobuf.WireFormat.FieldType.MESSAGE,
                    io.grafeas.v1beta1.Note.getDefaultInstance());
  }

  private com.google.protobuf.MapField<java.lang.String, io.grafeas.v1beta1.Note> notes_;

  private com.google.protobuf.MapField<java.lang.String, io.grafeas.v1beta1.Note>
      internalGetNotes() {
    if (notes_ == null) {
      return com.google.protobuf.MapField.emptyMapField(NotesDefaultEntryHolder.defaultEntry);
    }
    return notes_;
  }

  public int getNotesCount() {
    return internalGetNotes().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * The notes to create.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
   */
  public boolean containsNotes(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    return internalGetNotes().getMap().containsKey(key);
  }
  /** Use {@link #getNotesMap()} instead. */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, io.grafeas.v1beta1.Note> getNotes() {
    return getNotesMap();
  }
  /**
   *
   *
   * <pre>
   * The notes to create.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
   */
  public java.util.Map<java.lang.String, io.grafeas.v1beta1.Note> getNotesMap() {
    return internalGetNotes().getMap();
  }
  /**
   *
   *
   * <pre>
   * The notes to create.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
   */
  public io.grafeas.v1beta1.Note getNotesOrDefault(
      java.lang.String key, io.grafeas.v1beta1.Note defaultValue) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, io.grafeas.v1beta1.Note> map = internalGetNotes().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * The notes to create.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
   */
  public io.grafeas.v1beta1.Note getNotesOrThrow(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, io.grafeas.v1beta1.Note> map = internalGetNotes().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetNotes(), NotesDefaultEntryHolder.defaultEntry, 2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    for (java.util.Map.Entry<java.lang.String, io.grafeas.v1beta1.Note> entry :
        internalGetNotes().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, io.grafeas.v1beta1.Note> notes__ =
          NotesDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, notes__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof io.grafeas.v1beta1.BatchCreateNotesRequest)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.BatchCreateNotesRequest other =
        (io.grafeas.v1beta1.BatchCreateNotesRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!internalGetNotes().equals(other.internalGetNotes())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (!internalGetNotes().getMap().isEmpty()) {
      hash = (37 * hash) + NOTES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetNotes().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.BatchCreateNotesRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.BatchCreateNotesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.BatchCreateNotesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.BatchCreateNotesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.BatchCreateNotesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.BatchCreateNotesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.BatchCreateNotesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.BatchCreateNotesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.BatchCreateNotesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.BatchCreateNotesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.BatchCreateNotesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.BatchCreateNotesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(io.grafeas.v1beta1.BatchCreateNotesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request to create notes in batch.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.BatchCreateNotesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.BatchCreateNotesRequest)
      io.grafeas.v1beta1.BatchCreateNotesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.Grafeas
          .internal_static_grafeas_v1beta1_BatchCreateNotesRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetNotes();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 2:
          return internalGetMutableNotes();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.Grafeas
          .internal_static_grafeas_v1beta1_BatchCreateNotesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.BatchCreateNotesRequest.class,
              io.grafeas.v1beta1.BatchCreateNotesRequest.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.BatchCreateNotesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      internalGetMutableNotes().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.Grafeas
          .internal_static_grafeas_v1beta1_BatchCreateNotesRequest_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.BatchCreateNotesRequest getDefaultInstanceForType() {
      return io.grafeas.v1beta1.BatchCreateNotesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.BatchCreateNotesRequest build() {
      io.grafeas.v1beta1.BatchCreateNotesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.BatchCreateNotesRequest buildPartial() {
      io.grafeas.v1beta1.BatchCreateNotesRequest result =
          new io.grafeas.v1beta1.BatchCreateNotesRequest(this);
      int from_bitField0_ = bitField0_;
      result.parent_ = parent_;
      result.notes_ = internalGetNotes();
      result.notes_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1beta1.BatchCreateNotesRequest) {
        return mergeFrom((io.grafeas.v1beta1.BatchCreateNotesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.BatchCreateNotesRequest other) {
      if (other == io.grafeas.v1beta1.BatchCreateNotesRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      internalGetMutableNotes().mergeFrom(other.internalGetNotes());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grafeas.v1beta1.BatchCreateNotesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.BatchCreateNotesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the notes are to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the notes are to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the notes are to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the notes are to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the notes are to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, io.grafeas.v1beta1.Note> notes_;

    private com.google.protobuf.MapField<java.lang.String, io.grafeas.v1beta1.Note>
        internalGetNotes() {
      if (notes_ == null) {
        return com.google.protobuf.MapField.emptyMapField(NotesDefaultEntryHolder.defaultEntry);
      }
      return notes_;
    }

    private com.google.protobuf.MapField<java.lang.String, io.grafeas.v1beta1.Note>
        internalGetMutableNotes() {
      onChanged();
      ;
      if (notes_ == null) {
        notes_ = com.google.protobuf.MapField.newMapField(NotesDefaultEntryHolder.defaultEntry);
      }
      if (!notes_.isMutable()) {
        notes_ = notes_.copy();
      }
      return notes_;
    }

    public int getNotesCount() {
      return internalGetNotes().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * The notes to create.
     * </pre>
     *
     * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
     */
    public boolean containsNotes(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetNotes().getMap().containsKey(key);
    }
    /** Use {@link #getNotesMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.grafeas.v1beta1.Note> getNotes() {
      return getNotesMap();
    }
    /**
     *
     *
     * <pre>
     * The notes to create.
     * </pre>
     *
     * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
     */
    public java.util.Map<java.lang.String, io.grafeas.v1beta1.Note> getNotesMap() {
      return internalGetNotes().getMap();
    }
    /**
     *
     *
     * <pre>
     * The notes to create.
     * </pre>
     *
     * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
     */
    public io.grafeas.v1beta1.Note getNotesOrDefault(
        java.lang.String key, io.grafeas.v1beta1.Note defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, io.grafeas.v1beta1.Note> map = internalGetNotes().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * The notes to create.
     * </pre>
     *
     * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
     */
    public io.grafeas.v1beta1.Note getNotesOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, io.grafeas.v1beta1.Note> map = internalGetNotes().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearNotes() {
      internalGetMutableNotes().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The notes to create.
     * </pre>
     *
     * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
     */
    public Builder removeNotes(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableNotes().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.grafeas.v1beta1.Note> getMutableNotes() {
      return internalGetMutableNotes().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * The notes to create.
     * </pre>
     *
     * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
     */
    public Builder putNotes(java.lang.String key, io.grafeas.v1beta1.Note value) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      if (value == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableNotes().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * The notes to create.
     * </pre>
     *
     * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
     */
    public Builder putAllNotes(java.util.Map<java.lang.String, io.grafeas.v1beta1.Note> values) {
      internalGetMutableNotes().getMutableMap().putAll(values);
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.BatchCreateNotesRequest)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.BatchCreateNotesRequest)
  private static final io.grafeas.v1beta1.BatchCreateNotesRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.BatchCreateNotesRequest();
  }

  public static io.grafeas.v1beta1.BatchCreateNotesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateNotesRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchCreateNotesRequest>() {
        @java.lang.Override
        public BatchCreateNotesRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BatchCreateNotesRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BatchCreateNotesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateNotesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.BatchCreateNotesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
