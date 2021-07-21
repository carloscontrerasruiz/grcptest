package com.dummy.grcp.greeting.protofilesgreet;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: greet/greet.proto")
public final class GreetServiceGrpc {

  private GreetServiceGrpc() {}

  public static final String SERVICE_NAME = "greet.GreetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.GreetRequest,
      com.dummy.grcp.greeting.protofilesgreet.GreetResponse> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Greet",
      requestType = com.dummy.grcp.greeting.protofilesgreet.GreetRequest.class,
      responseType = com.dummy.grcp.greeting.protofilesgreet.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.GreetRequest,
      com.dummy.grcp.greeting.protofilesgreet.GreetResponse> getGreetMethod() {
    io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.GreetRequest, com.dummy.grcp.greeting.protofilesgreet.GreetResponse> getGreetMethod;
    if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
          GreetServiceGrpc.getGreetMethod = getGreetMethod =
              io.grpc.MethodDescriptor.<com.dummy.grcp.greeting.protofilesgreet.GreetRequest, com.dummy.grcp.greeting.protofilesgreet.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dummy.grcp.greeting.protofilesgreet.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dummy.grcp.greeting.protofilesgreet.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("Greet"))
              .build();
        }
      }
    }
    return getGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesRequest,
      com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesResponse> getGreetManyTimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetManyTimes",
      requestType = com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesRequest.class,
      responseType = com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesRequest,
      com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesResponse> getGreetManyTimesMethod() {
    io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesRequest, com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesResponse> getGreetManyTimesMethod;
    if ((getGreetManyTimesMethod = GreetServiceGrpc.getGreetManyTimesMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetManyTimesMethod = GreetServiceGrpc.getGreetManyTimesMethod) == null) {
          GreetServiceGrpc.getGreetManyTimesMethod = getGreetManyTimesMethod =
              io.grpc.MethodDescriptor.<com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesRequest, com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetManyTimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetManyTimes"))
              .build();
        }
      }
    }
    return getGreetManyTimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.LongGreetRequest,
      com.dummy.grcp.greeting.protofilesgreet.LongGreetResponse> getLongGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LongGreet",
      requestType = com.dummy.grcp.greeting.protofilesgreet.LongGreetRequest.class,
      responseType = com.dummy.grcp.greeting.protofilesgreet.LongGreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.LongGreetRequest,
      com.dummy.grcp.greeting.protofilesgreet.LongGreetResponse> getLongGreetMethod() {
    io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.LongGreetRequest, com.dummy.grcp.greeting.protofilesgreet.LongGreetResponse> getLongGreetMethod;
    if ((getLongGreetMethod = GreetServiceGrpc.getLongGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getLongGreetMethod = GreetServiceGrpc.getLongGreetMethod) == null) {
          GreetServiceGrpc.getLongGreetMethod = getLongGreetMethod =
              io.grpc.MethodDescriptor.<com.dummy.grcp.greeting.protofilesgreet.LongGreetRequest, com.dummy.grcp.greeting.protofilesgreet.LongGreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LongGreet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dummy.grcp.greeting.protofilesgreet.LongGreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dummy.grcp.greeting.protofilesgreet.LongGreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("LongGreet"))
              .build();
        }
      }
    }
    return getLongGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneRequest,
      com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneResponse> getGreetEveryoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetEveryone",
      requestType = com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneRequest.class,
      responseType = com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneRequest,
      com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneResponse> getGreetEveryoneMethod() {
    io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneRequest, com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneResponse> getGreetEveryoneMethod;
    if ((getGreetEveryoneMethod = GreetServiceGrpc.getGreetEveryoneMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetEveryoneMethod = GreetServiceGrpc.getGreetEveryoneMethod) == null) {
          GreetServiceGrpc.getGreetEveryoneMethod = getGreetEveryoneMethod =
              io.grpc.MethodDescriptor.<com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneRequest, com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetEveryone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetEveryone"))
              .build();
        }
      }
    }
    return getGreetEveryoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.TestGreetRequest,
      com.dummy.grcp.greeting.protofilesgreet.TestGreetResponse> getGreetTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetTest",
      requestType = com.dummy.grcp.greeting.protofilesgreet.TestGreetRequest.class,
      responseType = com.dummy.grcp.greeting.protofilesgreet.TestGreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.TestGreetRequest,
      com.dummy.grcp.greeting.protofilesgreet.TestGreetResponse> getGreetTestMethod() {
    io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.TestGreetRequest, com.dummy.grcp.greeting.protofilesgreet.TestGreetResponse> getGreetTestMethod;
    if ((getGreetTestMethod = GreetServiceGrpc.getGreetTestMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetTestMethod = GreetServiceGrpc.getGreetTestMethod) == null) {
          GreetServiceGrpc.getGreetTestMethod = getGreetTestMethod =
              io.grpc.MethodDescriptor.<com.dummy.grcp.greeting.protofilesgreet.TestGreetRequest, com.dummy.grcp.greeting.protofilesgreet.TestGreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetTest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dummy.grcp.greeting.protofilesgreet.TestGreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dummy.grcp.greeting.protofilesgreet.TestGreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetTest"))
              .build();
        }
      }
    }
    return getGreetTestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineRequest,
      com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineResponse> getGreetDeadlineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetDeadline",
      requestType = com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineRequest.class,
      responseType = com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineRequest,
      com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineResponse> getGreetDeadlineMethod() {
    io.grpc.MethodDescriptor<com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineRequest, com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineResponse> getGreetDeadlineMethod;
    if ((getGreetDeadlineMethod = GreetServiceGrpc.getGreetDeadlineMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetDeadlineMethod = GreetServiceGrpc.getGreetDeadlineMethod) == null) {
          GreetServiceGrpc.getGreetDeadlineMethod = getGreetDeadlineMethod =
              io.grpc.MethodDescriptor.<com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineRequest, com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetDeadline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetDeadline"))
              .build();
        }
      }
    }
    return getGreetDeadlineMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub>() {
        @java.lang.Override
        public GreetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceStub(channel, callOptions);
        }
      };
    return GreetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub>() {
        @java.lang.Override
        public GreetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceBlockingStub(channel, callOptions);
        }
      };
    return GreetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub>() {
        @java.lang.Override
        public GreetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceFutureStub(channel, callOptions);
        }
      };
    return GreetServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public void greet(com.dummy.grcp.greeting.protofilesgreet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.GreetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    /**
     * <pre>
     *Server streaming
     * </pre>
     */
    public void greetManyTimes(com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesRequest request,
        io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetManyTimesMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.LongGreetRequest> longGreet(
        io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.LongGreetResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLongGreetMethod(), responseObserver);
    }

    /**
     * <pre>
     *bidireccional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGreetEveryoneMethod(), responseObserver);
    }

    /**
     * <pre>
     *bidirectional closed by one before stops naturally
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.TestGreetRequest> greetTest(
        io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.TestGreetResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGreetTestMethod(), responseObserver);
    }

    /**
     * <pre>
     *deadline deadline 300ms
     * </pre>
     */
    public void greetDeadline(com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineRequest request,
        io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetDeadlineMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dummy.grcp.greeting.protofilesgreet.GreetRequest,
                com.dummy.grcp.greeting.protofilesgreet.GreetResponse>(
                  this, METHODID_GREET)))
          .addMethod(
            getGreetManyTimesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesRequest,
                com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesResponse>(
                  this, METHODID_GREET_MANY_TIMES)))
          .addMethod(
            getLongGreetMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.dummy.grcp.greeting.protofilesgreet.LongGreetRequest,
                com.dummy.grcp.greeting.protofilesgreet.LongGreetResponse>(
                  this, METHODID_LONG_GREET)))
          .addMethod(
            getGreetEveryoneMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneRequest,
                com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneResponse>(
                  this, METHODID_GREET_EVERYONE)))
          .addMethod(
            getGreetTestMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.dummy.grcp.greeting.protofilesgreet.TestGreetRequest,
                com.dummy.grcp.greeting.protofilesgreet.TestGreetResponse>(
                  this, METHODID_GREET_TEST)))
          .addMethod(
            getGreetDeadlineMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineRequest,
                com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineResponse>(
                  this, METHODID_GREET_DEADLINE)))
          .build();
    }
  }

  /**
   */
  public static final class GreetServiceStub extends io.grpc.stub.AbstractAsyncStub<GreetServiceStub> {
    private GreetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public void greet(com.dummy.grcp.greeting.protofilesgreet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.GreetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Server streaming
     * </pre>
     */
    public void greetManyTimes(com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesRequest request,
        io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGreetManyTimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.LongGreetRequest> longGreet(
        io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.LongGreetResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getLongGreetMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *bidireccional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGreetEveryoneMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *bidirectional closed by one before stops naturally
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.TestGreetRequest> greetTest(
        io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.TestGreetResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGreetTestMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *deadline deadline 300ms
     * </pre>
     */
    public void greetDeadline(com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineRequest request,
        io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetDeadlineMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreetServiceBlockingStub> {
    private GreetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public com.dummy.grcp.greeting.protofilesgreet.GreetResponse greet(com.dummy.grcp.greeting.protofilesgreet.GreetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Server streaming
     * </pre>
     */
    public java.util.Iterator<com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesResponse> greetManyTimes(
        com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGreetManyTimesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *deadline deadline 300ms
     * </pre>
     */
    public com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineResponse greetDeadline(com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetDeadlineMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GreetServiceFutureStub> {
    private GreetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dummy.grcp.greeting.protofilesgreet.GreetResponse> greet(
        com.dummy.grcp.greeting.protofilesgreet.GreetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *deadline deadline 300ms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineResponse> greetDeadline(
        com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetDeadlineMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;
  private static final int METHODID_GREET_MANY_TIMES = 1;
  private static final int METHODID_GREET_DEADLINE = 2;
  private static final int METHODID_LONG_GREET = 3;
  private static final int METHODID_GREET_EVERYONE = 4;
  private static final int METHODID_GREET_TEST = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((com.dummy.grcp.greeting.protofilesgreet.GreetRequest) request,
              (io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.GreetResponse>) responseObserver);
          break;
        case METHODID_GREET_MANY_TIMES:
          serviceImpl.greetManyTimes((com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesRequest) request,
              (io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesResponse>) responseObserver);
          break;
        case METHODID_GREET_DEADLINE:
          serviceImpl.greetDeadline((com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineRequest) request,
              (io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LONG_GREET:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.longGreet(
              (io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.LongGreetResponse>) responseObserver);
        case METHODID_GREET_EVERYONE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetEveryone(
              (io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneResponse>) responseObserver);
        case METHODID_GREET_TEST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetTest(
              (io.grpc.stub.StreamObserver<com.dummy.grcp.greeting.protofilesgreet.TestGreetResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dummy.grcp.greeting.protofilesgreet.Greet.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetService");
    }
  }

  private static final class GreetServiceFileDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier {
    GreetServiceFileDescriptorSupplier() {}
  }

  private static final class GreetServiceMethodDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetServiceFileDescriptorSupplier())
              .addMethod(getGreetMethod())
              .addMethod(getGreetManyTimesMethod())
              .addMethod(getLongGreetMethod())
              .addMethod(getGreetEveryoneMethod())
              .addMethod(getGreetTestMethod())
              .addMethod(getGreetDeadlineMethod())
              .build();
        }
      }
    }
    return result;
  }
}
