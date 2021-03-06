// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: a_v.proto

package com.xiaomi.mimcdemo.proto;

public final class AV {
  private AV() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  /**
   * Protobuf enum {@code MIMC_RTS_TYPE}
   */
  public enum MIMC_RTS_TYPE
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>AUDIO = 1;</code>
     */
    AUDIO(1),
    /**
     * <code>VIDEO = 2;</code>
     */
    VIDEO(2),
    ;

    /**
     * <code>AUDIO = 1;</code>
     */
    public static final int AUDIO_VALUE = 1;
    /**
     * <code>VIDEO = 2;</code>
     */
    public static final int VIDEO_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MIMC_RTS_TYPE valueOf(int value) {
      return forNumber(value);
    }

    public static MIMC_RTS_TYPE forNumber(int value) {
      switch (value) {
        case 1: return AUDIO;
        case 2: return VIDEO;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MIMC_RTS_TYPE>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MIMC_RTS_TYPE> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MIMC_RTS_TYPE>() {
            public MIMC_RTS_TYPE findValueByNumber(int number) {
              return MIMC_RTS_TYPE.forNumber(number);
            }
          };

    private final int value;

    private MIMC_RTS_TYPE(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MIMC_RTS_TYPE)
  }

  /**
   * Protobuf enum {@code MIMC_RTS_CODEC_TYPE}
   */
  public enum MIMC_RTS_CODEC_TYPE
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>OS_CODEC = 1;</code>
     */
    OS_CODEC(1),
    /**
     * <code>FFMPEG = 2;</code>
     */
    FFMPEG(2),
    /**
     * <code>SPEEX = 3;</code>
     */
    SPEEX(3),
    ;

    /**
     * <code>OS_CODEC = 1;</code>
     */
    public static final int OS_CODEC_VALUE = 1;
    /**
     * <code>FFMPEG = 2;</code>
     */
    public static final int FFMPEG_VALUE = 2;
    /**
     * <code>SPEEX = 3;</code>
     */
    public static final int SPEEX_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MIMC_RTS_CODEC_TYPE valueOf(int value) {
      return forNumber(value);
    }

    public static MIMC_RTS_CODEC_TYPE forNumber(int value) {
      switch (value) {
        case 1: return OS_CODEC;
        case 2: return FFMPEG;
        case 3: return SPEEX;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MIMC_RTS_CODEC_TYPE>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MIMC_RTS_CODEC_TYPE> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MIMC_RTS_CODEC_TYPE>() {
            public MIMC_RTS_CODEC_TYPE findValueByNumber(int number) {
              return MIMC_RTS_CODEC_TYPE.forNumber(number);
            }
          };

    private final int value;

    private MIMC_RTS_CODEC_TYPE(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MIMC_RTS_CODEC_TYPE)
  }

  public interface MIMCRtsPacketOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MIMCRtsPacket)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .MIMC_RTS_TYPE type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>optional .MIMC_RTS_TYPE type = 1;</code>
     */
    com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_TYPE getType();

    /**
     * <code>optional .MIMC_RTS_CODEC_TYPE codecType = 2;</code>
     */
    boolean hasCodecType();
    /**
     * <code>optional .MIMC_RTS_CODEC_TYPE codecType = 2;</code>
     */
    com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_CODEC_TYPE getCodecType();

    /**
     * <code>optional uint64 sequence = 3;</code>
     */
    boolean hasSequence();
    /**
     * <code>optional uint64 sequence = 3;</code>
     */
    long getSequence();

    /**
     * <code>optional bytes payload = 4;</code>
     */
    boolean hasPayload();
    /**
     * <code>optional bytes payload = 4;</code>
     */
    com.google.protobuf.ByteString getPayload();
  }
  /**
   * Protobuf type {@code MIMCRtsPacket}
   */
  public  static final class MIMCRtsPacket extends
      com.google.protobuf.GeneratedMessageLite<
          MIMCRtsPacket, MIMCRtsPacket.Builder> implements
      // @@protoc_insertion_point(message_implements:MIMCRtsPacket)
      MIMCRtsPacketOrBuilder {
    private MIMCRtsPacket() {
      type_ = 1;
      codecType_ = 1;
      payload_ = com.google.protobuf.ByteString.EMPTY;
    }
    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>optional .MIMC_RTS_TYPE type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .MIMC_RTS_TYPE type = 1;</code>
     */
    public com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_TYPE getType() {
      com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_TYPE result = com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_TYPE.forNumber(type_);
      return result == null ? com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_TYPE.AUDIO : result;
    }
    /**
     * <code>optional .MIMC_RTS_TYPE type = 1;</code>
     */
    private void setType(com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_TYPE value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
    }
    /**
     * <code>optional .MIMC_RTS_TYPE type = 1;</code>
     */
    private void clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 1;
    }

    public static final int CODECTYPE_FIELD_NUMBER = 2;
    private int codecType_;
    /**
     * <code>optional .MIMC_RTS_CODEC_TYPE codecType = 2;</code>
     */
    public boolean hasCodecType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .MIMC_RTS_CODEC_TYPE codecType = 2;</code>
     */
    public com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_CODEC_TYPE getCodecType() {
      com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_CODEC_TYPE result = com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_CODEC_TYPE.forNumber(codecType_);
      return result == null ? com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_CODEC_TYPE.OS_CODEC : result;
    }
    /**
     * <code>optional .MIMC_RTS_CODEC_TYPE codecType = 2;</code>
     */
    private void setCodecType(com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_CODEC_TYPE value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      codecType_ = value.getNumber();
    }
    /**
     * <code>optional .MIMC_RTS_CODEC_TYPE codecType = 2;</code>
     */
    private void clearCodecType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      codecType_ = 1;
    }

    public static final int SEQUENCE_FIELD_NUMBER = 3;
    private long sequence_;
    /**
     * <code>optional uint64 sequence = 3;</code>
     */
    public boolean hasSequence() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint64 sequence = 3;</code>
     */
    public long getSequence() {
      return sequence_;
    }
    /**
     * <code>optional uint64 sequence = 3;</code>
     */
    private void setSequence(long value) {
      bitField0_ |= 0x00000004;
      sequence_ = value;
    }
    /**
     * <code>optional uint64 sequence = 3;</code>
     */
    private void clearSequence() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sequence_ = 0L;
    }

    public static final int PAYLOAD_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString payload_;
    /**
     * <code>optional bytes payload = 4;</code>
     */
    public boolean hasPayload() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bytes payload = 4;</code>
     */
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <code>optional bytes payload = 4;</code>
     */
    private void setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      payload_ = value;
    }
    /**
     * <code>optional bytes payload = 4;</code>
     */
    private void clearPayload() {
      bitField0_ = (bitField0_ & ~0x00000008);
      payload_ = getDefaultInstance().getPayload();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, codecType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, sequence_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, payload_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, codecType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, sequence_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, payload_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code MIMCRtsPacket}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket, Builder> implements
        // @@protoc_insertion_point(builder_implements:MIMCRtsPacket)
        com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacketOrBuilder {
      // Construct using com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .MIMC_RTS_TYPE type = 1;</code>
       */
      public boolean hasType() {
        return instance.hasType();
      }
      /**
       * <code>optional .MIMC_RTS_TYPE type = 1;</code>
       */
      public com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_TYPE getType() {
        return instance.getType();
      }
      /**
       * <code>optional .MIMC_RTS_TYPE type = 1;</code>
       */
      public Builder setType(com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_TYPE value) {
        copyOnWrite();
        instance.setType(value);
        return this;
      }
      /**
       * <code>optional .MIMC_RTS_TYPE type = 1;</code>
       */
      public Builder clearType() {
        copyOnWrite();
        instance.clearType();
        return this;
      }

      /**
       * <code>optional .MIMC_RTS_CODEC_TYPE codecType = 2;</code>
       */
      public boolean hasCodecType() {
        return instance.hasCodecType();
      }
      /**
       * <code>optional .MIMC_RTS_CODEC_TYPE codecType = 2;</code>
       */
      public com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_CODEC_TYPE getCodecType() {
        return instance.getCodecType();
      }
      /**
       * <code>optional .MIMC_RTS_CODEC_TYPE codecType = 2;</code>
       */
      public Builder setCodecType(com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_CODEC_TYPE value) {
        copyOnWrite();
        instance.setCodecType(value);
        return this;
      }
      /**
       * <code>optional .MIMC_RTS_CODEC_TYPE codecType = 2;</code>
       */
      public Builder clearCodecType() {
        copyOnWrite();
        instance.clearCodecType();
        return this;
      }

      /**
       * <code>optional uint64 sequence = 3;</code>
       */
      public boolean hasSequence() {
        return instance.hasSequence();
      }
      /**
       * <code>optional uint64 sequence = 3;</code>
       */
      public long getSequence() {
        return instance.getSequence();
      }
      /**
       * <code>optional uint64 sequence = 3;</code>
       */
      public Builder setSequence(long value) {
        copyOnWrite();
        instance.setSequence(value);
        return this;
      }
      /**
       * <code>optional uint64 sequence = 3;</code>
       */
      public Builder clearSequence() {
        copyOnWrite();
        instance.clearSequence();
        return this;
      }

      /**
       * <code>optional bytes payload = 4;</code>
       */
      public boolean hasPayload() {
        return instance.hasPayload();
      }
      /**
       * <code>optional bytes payload = 4;</code>
       */
      public com.google.protobuf.ByteString getPayload() {
        return instance.getPayload();
      }
      /**
       * <code>optional bytes payload = 4;</code>
       */
      public Builder setPayload(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setPayload(value);
        return this;
      }
      /**
       * <code>optional bytes payload = 4;</code>
       */
      public Builder clearPayload() {
        copyOnWrite();
        instance.clearPayload();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MIMCRtsPacket)
    }
    @java.lang.SuppressWarnings("unchecked")
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket other = (com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket) arg1;
          type_ = visitor.visitInt(hasType(), type_,
              other.hasType(), other.type_);
          codecType_ = visitor.visitInt(hasCodecType(), codecType_,
              other.hasCodecType(), other.codecType_);
          sequence_ = visitor.visitLong(
              hasSequence(), sequence_,
              other.hasSequence(), other.sequence_);
          payload_ = visitor.visitByteString(
              hasPayload(), payload_,
              other.hasPayload(), other.payload_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
                case 8: {
                  int rawValue = input.readEnum();
                  com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_TYPE value = com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_TYPE.forNumber(rawValue);
                  if (value == null) {
                    super.mergeVarintField(1, rawValue);
                  } else {
                    bitField0_ |= 0x00000001;
                    type_ = rawValue;
                  }
                  break;
                }
                case 16: {
                  int rawValue = input.readEnum();
                  com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_CODEC_TYPE value = com.xiaomi.mimcdemo.proto.AV.MIMC_RTS_CODEC_TYPE.forNumber(rawValue);
                  if (value == null) {
                    super.mergeVarintField(2, rawValue);
                  } else {
                    bitField0_ |= 0x00000002;
                    codecType_ = rawValue;
                  }
                  break;
                }
                case 24: {
                  bitField0_ |= 0x00000004;
                  sequence_ = input.readUInt64();
                  break;
                }
                case 34: {
                  bitField0_ |= 0x00000008;
                  payload_ = input.readBytes();
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:MIMCRtsPacket)
    private static final com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MIMCRtsPacket();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static com.xiaomi.mimcdemo.proto.AV.MIMCRtsPacket getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<MIMCRtsPacket> PARSER;

    public static com.google.protobuf.Parser<MIMCRtsPacket> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
