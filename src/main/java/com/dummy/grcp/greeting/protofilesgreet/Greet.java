// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet/greet.proto

package com.dummy.grcp.greeting.protofilesgreet;

public final class Greet {
  private Greet() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_Greeting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_Greeting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_GreetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_GreetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_GreetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_GreetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_GreetManyTimesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_GreetManyTimesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_GreetManyTimesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_GreetManyTimesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_LongGreetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_LongGreetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_LongGreetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_LongGreetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_GreetEveryoneRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_GreetEveryoneRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_GreetEveryoneResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_GreetEveryoneResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_TestGreetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_TestGreetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_TestGreetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_TestGreetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_GreetDeadlineRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_GreetDeadlineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_GreetDeadlineResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_GreetDeadlineResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021greet/greet.proto\022\005greet\"/\n\010Greeting\022\021" +
      "\n\tfirstName\030\001 \001(\t\022\020\n\010lastName\030\002 \001(\t\"1\n\014G" +
      "reetRequest\022!\n\010greeting\030\001 \001(\0132\017.greet.Gr" +
      "eeting\"\037\n\rGreetResponse\022\016\n\006result\030\001 \001(\t\"" +
      ":\n\025GreetManyTimesRequest\022!\n\010greeting\030\001 \001" +
      "(\0132\017.greet.Greeting\"(\n\026GreetManyTimesRes" +
      "ponse\022\016\n\006result\030\001 \001(\t\"5\n\020LongGreetReques" +
      "t\022!\n\010greeting\030\001 \001(\0132\017.greet.Greeting\"#\n\021" +
      "LongGreetResponse\022\016\n\006result\030\001 \001(\t\"9\n\024Gre" +
      "etEveryoneRequest\022!\n\010greeting\030\001 \001(\0132\017.gr" +
      "eet.Greeting\"\'\n\025GreetEveryoneResponse\022\016\n" +
      "\006result\030\001 \001(\t\"\"\n\020TestGreetRequest\022\016\n\006num" +
      "ber\030\001 \001(\005\"#\n\021TestGreetResponse\022\016\n\006number" +
      "\030\001 \001(\005\"9\n\024GreetDeadlineRequest\022!\n\010greeti" +
      "ng\030\001 \001(\0132\017.greet.Greeting\"\'\n\025GreetDeadli" +
      "neResponse\022\016\n\006result\030\001 \001(\t2\301\003\n\014GreetServ" +
      "ice\0224\n\005Greet\022\023.greet.GreetRequest\032\024.gree" +
      "t.GreetResponse\"\000\022Q\n\016GreetManyTimes\022\034.gr" +
      "eet.GreetManyTimesRequest\032\035.greet.GreetM" +
      "anyTimesResponse\"\0000\001\022B\n\tLongGreet\022\027.gree" +
      "t.LongGreetRequest\032\030.greet.LongGreetResp" +
      "onse\"\000(\001\022P\n\rGreetEveryone\022\033.greet.GreetE" +
      "veryoneRequest\032\034.greet.GreetEveryoneResp" +
      "onse\"\000(\0010\001\022D\n\tGreetTest\022\027.greet.TestGree" +
      "tRequest\032\030.greet.TestGreetResponse\"\000(\0010\001" +
      "\022L\n\rGreetDeadline\022\033.greet.GreetDeadlineR" +
      "equest\032\034.greet.GreetDeadlineResponse\"\000B+" +
      "\n\'com.dummy.grcp.greeting.protofilesgree" +
      "tP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_greet_Greeting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greet_Greeting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_Greeting_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_greet_GreetRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_greet_GreetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_GreetRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_greet_GreetResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_greet_GreetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_GreetResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_greet_GreetManyTimesRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_greet_GreetManyTimesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_GreetManyTimesRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_greet_GreetManyTimesResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_greet_GreetManyTimesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_GreetManyTimesResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_greet_LongGreetRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_greet_LongGreetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_LongGreetRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_greet_LongGreetResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_greet_LongGreetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_LongGreetResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_greet_GreetEveryoneRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_greet_GreetEveryoneRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_GreetEveryoneRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_greet_GreetEveryoneResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_greet_GreetEveryoneResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_GreetEveryoneResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_greet_TestGreetRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_greet_TestGreetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_TestGreetRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_greet_TestGreetResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_greet_TestGreetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_TestGreetResponse_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_greet_GreetDeadlineRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_greet_GreetDeadlineRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_GreetDeadlineRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_greet_GreetDeadlineResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_greet_GreetDeadlineResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_GreetDeadlineResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
