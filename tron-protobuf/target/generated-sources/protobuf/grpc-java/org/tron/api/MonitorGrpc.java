package org.tron.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api/api.proto")
public final class MonitorGrpc {

  private MonitorGrpc() {}

  public static final String SERVICE_NAME = "protocol.Monitor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.protos.Protocol.MetricsInfo> getGetStatsInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatsInfo",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.protos.Protocol.MetricsInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.protos.Protocol.MetricsInfo> getGetStatsInfoMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.protos.Protocol.MetricsInfo> getGetStatsInfoMethod;
    if ((getGetStatsInfoMethod = MonitorGrpc.getGetStatsInfoMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getGetStatsInfoMethod = MonitorGrpc.getGetStatsInfoMethod) == null) {
          MonitorGrpc.getGetStatsInfoMethod = getGetStatsInfoMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.protos.Protocol.MetricsInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Monitor", "GetStatsInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.MetricsInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("GetStatsInfo"))
                  .build();
          }
        }
     }
     return getGetStatsInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MonitorStub newStub(io.grpc.Channel channel) {
    return new MonitorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MonitorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MonitorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MonitorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MonitorFutureStub(channel);
  }

  /**
   */
  public static abstract class MonitorImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStatsInfo(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MetricsInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatsInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStatsInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.protos.Protocol.MetricsInfo>(
                  this, METHODID_GET_STATS_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class MonitorStub extends io.grpc.stub.AbstractStub<MonitorStub> {
    private MonitorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitorStub(channel, callOptions);
    }

    /**
     */
    public void getStatsInfo(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MetricsInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatsInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MonitorBlockingStub extends io.grpc.stub.AbstractStub<MonitorBlockingStub> {
    private MonitorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitorBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.tron.protos.Protocol.MetricsInfo getStatsInfo(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetStatsInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MonitorFutureStub extends io.grpc.stub.AbstractStub<MonitorFutureStub> {
    private MonitorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.MetricsInfo> getStatsInfo(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatsInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATS_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MonitorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MonitorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATS_INFO:
          serviceImpl.getStatsInfo((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MetricsInfo>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MonitorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.tron.api.GrpcAPI.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Monitor");
    }
  }

  private static final class MonitorFileDescriptorSupplier
      extends MonitorBaseDescriptorSupplier {
    MonitorFileDescriptorSupplier() {}
  }

  private static final class MonitorMethodDescriptorSupplier
      extends MonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MonitorMethodDescriptorSupplier(String methodName) {
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
      synchronized (MonitorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MonitorFileDescriptorSupplier())
              .addMethod(getGetStatsInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
