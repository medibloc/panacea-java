package cosmos.staking.v1beta1;

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
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: cosmos/staking/v1beta1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cosmos.staking.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryValidatorsRequest,
      cosmos.staking.v1beta1.QueryValidatorsResponse> getValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Validators",
      requestType = cosmos.staking.v1beta1.QueryValidatorsRequest.class,
      responseType = cosmos.staking.v1beta1.QueryValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryValidatorsRequest,
      cosmos.staking.v1beta1.QueryValidatorsResponse> getValidatorsMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryValidatorsRequest, cosmos.staking.v1beta1.QueryValidatorsResponse> getValidatorsMethod;
    if ((getValidatorsMethod = QueryGrpc.getValidatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorsMethod = QueryGrpc.getValidatorsMethod) == null) {
          QueryGrpc.getValidatorsMethod = getValidatorsMethod = 
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.QueryValidatorsRequest, cosmos.staking.v1beta1.QueryValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.staking.v1beta1.Query", "Validators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryValidatorsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Validators"))
                  .build();
          }
        }
     }
     return getValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryValidatorRequest,
      cosmos.staking.v1beta1.QueryValidatorResponse> getValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Validator",
      requestType = cosmos.staking.v1beta1.QueryValidatorRequest.class,
      responseType = cosmos.staking.v1beta1.QueryValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryValidatorRequest,
      cosmos.staking.v1beta1.QueryValidatorResponse> getValidatorMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryValidatorRequest, cosmos.staking.v1beta1.QueryValidatorResponse> getValidatorMethod;
    if ((getValidatorMethod = QueryGrpc.getValidatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorMethod = QueryGrpc.getValidatorMethod) == null) {
          QueryGrpc.getValidatorMethod = getValidatorMethod = 
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.QueryValidatorRequest, cosmos.staking.v1beta1.QueryValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.staking.v1beta1.Query", "Validator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryValidatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryValidatorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Validator"))
                  .build();
          }
        }
     }
     return getValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryValidatorDelegationsRequest,
      cosmos.staking.v1beta1.QueryValidatorDelegationsResponse> getValidatorDelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorDelegations",
      requestType = cosmos.staking.v1beta1.QueryValidatorDelegationsRequest.class,
      responseType = cosmos.staking.v1beta1.QueryValidatorDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryValidatorDelegationsRequest,
      cosmos.staking.v1beta1.QueryValidatorDelegationsResponse> getValidatorDelegationsMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryValidatorDelegationsRequest, cosmos.staking.v1beta1.QueryValidatorDelegationsResponse> getValidatorDelegationsMethod;
    if ((getValidatorDelegationsMethod = QueryGrpc.getValidatorDelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorDelegationsMethod = QueryGrpc.getValidatorDelegationsMethod) == null) {
          QueryGrpc.getValidatorDelegationsMethod = getValidatorDelegationsMethod = 
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.QueryValidatorDelegationsRequest, cosmos.staking.v1beta1.QueryValidatorDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.staking.v1beta1.Query", "ValidatorDelegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryValidatorDelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryValidatorDelegationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorDelegations"))
                  .build();
          }
        }
     }
     return getValidatorDelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest,
      cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse> getValidatorUnbondingDelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorUnbondingDelegations",
      requestType = cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest.class,
      responseType = cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest,
      cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse> getValidatorUnbondingDelegationsMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest, cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse> getValidatorUnbondingDelegationsMethod;
    if ((getValidatorUnbondingDelegationsMethod = QueryGrpc.getValidatorUnbondingDelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorUnbondingDelegationsMethod = QueryGrpc.getValidatorUnbondingDelegationsMethod) == null) {
          QueryGrpc.getValidatorUnbondingDelegationsMethod = getValidatorUnbondingDelegationsMethod = 
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest, cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.staking.v1beta1.Query", "ValidatorUnbondingDelegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorUnbondingDelegations"))
                  .build();
          }
        }
     }
     return getValidatorUnbondingDelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegationRequest,
      cosmos.staking.v1beta1.QueryDelegationResponse> getDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delegation",
      requestType = cosmos.staking.v1beta1.QueryDelegationRequest.class,
      responseType = cosmos.staking.v1beta1.QueryDelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegationRequest,
      cosmos.staking.v1beta1.QueryDelegationResponse> getDelegationMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegationRequest, cosmos.staking.v1beta1.QueryDelegationResponse> getDelegationMethod;
    if ((getDelegationMethod = QueryGrpc.getDelegationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegationMethod = QueryGrpc.getDelegationMethod) == null) {
          QueryGrpc.getDelegationMethod = getDelegationMethod = 
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.QueryDelegationRequest, cosmos.staking.v1beta1.QueryDelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.staking.v1beta1.Query", "Delegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryDelegationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryDelegationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Delegation"))
                  .build();
          }
        }
     }
     return getDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryUnbondingDelegationRequest,
      cosmos.staking.v1beta1.QueryUnbondingDelegationResponse> getUnbondingDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbondingDelegation",
      requestType = cosmos.staking.v1beta1.QueryUnbondingDelegationRequest.class,
      responseType = cosmos.staking.v1beta1.QueryUnbondingDelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryUnbondingDelegationRequest,
      cosmos.staking.v1beta1.QueryUnbondingDelegationResponse> getUnbondingDelegationMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryUnbondingDelegationRequest, cosmos.staking.v1beta1.QueryUnbondingDelegationResponse> getUnbondingDelegationMethod;
    if ((getUnbondingDelegationMethod = QueryGrpc.getUnbondingDelegationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnbondingDelegationMethod = QueryGrpc.getUnbondingDelegationMethod) == null) {
          QueryGrpc.getUnbondingDelegationMethod = getUnbondingDelegationMethod = 
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.QueryUnbondingDelegationRequest, cosmos.staking.v1beta1.QueryUnbondingDelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.staking.v1beta1.Query", "UnbondingDelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryUnbondingDelegationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryUnbondingDelegationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnbondingDelegation"))
                  .build();
          }
        }
     }
     return getUnbondingDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest,
      cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse> getDelegatorDelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorDelegations",
      requestType = cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest.class,
      responseType = cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest,
      cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse> getDelegatorDelegationsMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest, cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse> getDelegatorDelegationsMethod;
    if ((getDelegatorDelegationsMethod = QueryGrpc.getDelegatorDelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorDelegationsMethod = QueryGrpc.getDelegatorDelegationsMethod) == null) {
          QueryGrpc.getDelegatorDelegationsMethod = getDelegatorDelegationsMethod = 
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest, cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.staking.v1beta1.Query", "DelegatorDelegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorDelegations"))
                  .build();
          }
        }
     }
     return getDelegatorDelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest,
      cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse> getDelegatorUnbondingDelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorUnbondingDelegations",
      requestType = cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest.class,
      responseType = cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest,
      cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse> getDelegatorUnbondingDelegationsMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest, cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse> getDelegatorUnbondingDelegationsMethod;
    if ((getDelegatorUnbondingDelegationsMethod = QueryGrpc.getDelegatorUnbondingDelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorUnbondingDelegationsMethod = QueryGrpc.getDelegatorUnbondingDelegationsMethod) == null) {
          QueryGrpc.getDelegatorUnbondingDelegationsMethod = getDelegatorUnbondingDelegationsMethod = 
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest, cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.staking.v1beta1.Query", "DelegatorUnbondingDelegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorUnbondingDelegations"))
                  .build();
          }
        }
     }
     return getDelegatorUnbondingDelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryRedelegationsRequest,
      cosmos.staking.v1beta1.QueryRedelegationsResponse> getRedelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Redelegations",
      requestType = cosmos.staking.v1beta1.QueryRedelegationsRequest.class,
      responseType = cosmos.staking.v1beta1.QueryRedelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryRedelegationsRequest,
      cosmos.staking.v1beta1.QueryRedelegationsResponse> getRedelegationsMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryRedelegationsRequest, cosmos.staking.v1beta1.QueryRedelegationsResponse> getRedelegationsMethod;
    if ((getRedelegationsMethod = QueryGrpc.getRedelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRedelegationsMethod = QueryGrpc.getRedelegationsMethod) == null) {
          QueryGrpc.getRedelegationsMethod = getRedelegationsMethod = 
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.QueryRedelegationsRequest, cosmos.staking.v1beta1.QueryRedelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.staking.v1beta1.Query", "Redelegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryRedelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryRedelegationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Redelegations"))
                  .build();
          }
        }
     }
     return getRedelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest,
      cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse> getDelegatorValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorValidators",
      requestType = cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest.class,
      responseType = cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest,
      cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse> getDelegatorValidatorsMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest, cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse> getDelegatorValidatorsMethod;
    if ((getDelegatorValidatorsMethod = QueryGrpc.getDelegatorValidatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorValidatorsMethod = QueryGrpc.getDelegatorValidatorsMethod) == null) {
          QueryGrpc.getDelegatorValidatorsMethod = getDelegatorValidatorsMethod = 
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest, cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.staking.v1beta1.Query", "DelegatorValidators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorValidators"))
                  .build();
          }
        }
     }
     return getDelegatorValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegatorValidatorRequest,
      cosmos.staking.v1beta1.QueryDelegatorValidatorResponse> getDelegatorValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorValidator",
      requestType = cosmos.staking.v1beta1.QueryDelegatorValidatorRequest.class,
      responseType = cosmos.staking.v1beta1.QueryDelegatorValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegatorValidatorRequest,
      cosmos.staking.v1beta1.QueryDelegatorValidatorResponse> getDelegatorValidatorMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryDelegatorValidatorRequest, cosmos.staking.v1beta1.QueryDelegatorValidatorResponse> getDelegatorValidatorMethod;
    if ((getDelegatorValidatorMethod = QueryGrpc.getDelegatorValidatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorValidatorMethod = QueryGrpc.getDelegatorValidatorMethod) == null) {
          QueryGrpc.getDelegatorValidatorMethod = getDelegatorValidatorMethod = 
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.QueryDelegatorValidatorRequest, cosmos.staking.v1beta1.QueryDelegatorValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.staking.v1beta1.Query", "DelegatorValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryDelegatorValidatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryDelegatorValidatorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorValidator"))
                  .build();
          }
        }
     }
     return getDelegatorValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryHistoricalInfoRequest,
      cosmos.staking.v1beta1.QueryHistoricalInfoResponse> getHistoricalInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HistoricalInfo",
      requestType = cosmos.staking.v1beta1.QueryHistoricalInfoRequest.class,
      responseType = cosmos.staking.v1beta1.QueryHistoricalInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryHistoricalInfoRequest,
      cosmos.staking.v1beta1.QueryHistoricalInfoResponse> getHistoricalInfoMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryHistoricalInfoRequest, cosmos.staking.v1beta1.QueryHistoricalInfoResponse> getHistoricalInfoMethod;
    if ((getHistoricalInfoMethod = QueryGrpc.getHistoricalInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHistoricalInfoMethod = QueryGrpc.getHistoricalInfoMethod) == null) {
          QueryGrpc.getHistoricalInfoMethod = getHistoricalInfoMethod = 
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.QueryHistoricalInfoRequest, cosmos.staking.v1beta1.QueryHistoricalInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.staking.v1beta1.Query", "HistoricalInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryHistoricalInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryHistoricalInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HistoricalInfo"))
                  .build();
          }
        }
     }
     return getHistoricalInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryPoolRequest,
      cosmos.staking.v1beta1.QueryPoolResponse> getPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pool",
      requestType = cosmos.staking.v1beta1.QueryPoolRequest.class,
      responseType = cosmos.staking.v1beta1.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryPoolRequest,
      cosmos.staking.v1beta1.QueryPoolResponse> getPoolMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryPoolRequest, cosmos.staking.v1beta1.QueryPoolResponse> getPoolMethod;
    if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
          QueryGrpc.getPoolMethod = getPoolMethod = 
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.QueryPoolRequest, cosmos.staking.v1beta1.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.staking.v1beta1.Query", "Pool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryPoolResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pool"))
                  .build();
          }
        }
     }
     return getPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryParamsRequest,
      cosmos.staking.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = cosmos.staking.v1beta1.QueryParamsRequest.class,
      responseType = cosmos.staking.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryParamsRequest,
      cosmos.staking.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.QueryParamsRequest, cosmos.staking.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod = 
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.QueryParamsRequest, cosmos.staking.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.staking.v1beta1.Query", "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.QueryParamsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
                  .build();
          }
        }
     }
     return getParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    return new QueryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueryFutureStub(channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Validators queries all validators that match the given status.
     * </pre>
     */
    public void validators(cosmos.staking.v1beta1.QueryValidatorsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryValidatorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    public void validator(cosmos.staking.v1beta1.QueryValidatorRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryValidatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorDelegations queries delegate info for given validator.
     * </pre>
     */
    public void validatorDelegations(cosmos.staking.v1beta1.QueryValidatorDelegationsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryValidatorDelegationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidatorDelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorUnbondingDelegations queries unbonding delegations of a validator.
     * </pre>
     */
    public void validatorUnbondingDelegations(cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidatorUnbondingDelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delegation queries delegate info for given validator delegator pair.
     * </pre>
     */
    public void delegation(cosmos.staking.v1beta1.QueryDelegationRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnbondingDelegation queries unbonding info for given validator delegator
     * pair.
     * </pre>
     */
    public void unbondingDelegation(cosmos.staking.v1beta1.QueryUnbondingDelegationRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryUnbondingDelegationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnbondingDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegatorDelegations queries all delegations of a given delegator address.
     * </pre>
     */
    public void delegatorDelegations(cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegatorDelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegatorUnbondingDelegations queries all unbonding delegations of a given
     * delegator address.
     * </pre>
     */
    public void delegatorUnbondingDelegations(cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegatorUnbondingDelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Redelegations queries redelegations of given address.
     * </pre>
     */
    public void redelegations(cosmos.staking.v1beta1.QueryRedelegationsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryRedelegationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRedelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegatorValidators queries all validators info for given delegator
     * address.
     * </pre>
     */
    public void delegatorValidators(cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegatorValidatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegatorValidator queries validator info for given delegator validator
     * pair.
     * </pre>
     */
    public void delegatorValidator(cosmos.staking.v1beta1.QueryDelegatorValidatorRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegatorValidatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegatorValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * HistoricalInfo queries the historical info for given height.
     * </pre>
     */
    public void historicalInfo(cosmos.staking.v1beta1.QueryHistoricalInfoRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryHistoricalInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHistoricalInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pool queries the pool info.
     * </pre>
     */
    public void pool(cosmos.staking.v1beta1.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * Parameters queries the staking parameters.
     * </pre>
     */
    public void params(cosmos.staking.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getValidatorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.staking.v1beta1.QueryValidatorsRequest,
                cosmos.staking.v1beta1.QueryValidatorsResponse>(
                  this, METHODID_VALIDATORS)))
          .addMethod(
            getValidatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.staking.v1beta1.QueryValidatorRequest,
                cosmos.staking.v1beta1.QueryValidatorResponse>(
                  this, METHODID_VALIDATOR)))
          .addMethod(
            getValidatorDelegationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.staking.v1beta1.QueryValidatorDelegationsRequest,
                cosmos.staking.v1beta1.QueryValidatorDelegationsResponse>(
                  this, METHODID_VALIDATOR_DELEGATIONS)))
          .addMethod(
            getValidatorUnbondingDelegationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest,
                cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse>(
                  this, METHODID_VALIDATOR_UNBONDING_DELEGATIONS)))
          .addMethod(
            getDelegationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.staking.v1beta1.QueryDelegationRequest,
                cosmos.staking.v1beta1.QueryDelegationResponse>(
                  this, METHODID_DELEGATION)))
          .addMethod(
            getUnbondingDelegationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.staking.v1beta1.QueryUnbondingDelegationRequest,
                cosmos.staking.v1beta1.QueryUnbondingDelegationResponse>(
                  this, METHODID_UNBONDING_DELEGATION)))
          .addMethod(
            getDelegatorDelegationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest,
                cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse>(
                  this, METHODID_DELEGATOR_DELEGATIONS)))
          .addMethod(
            getDelegatorUnbondingDelegationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest,
                cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse>(
                  this, METHODID_DELEGATOR_UNBONDING_DELEGATIONS)))
          .addMethod(
            getRedelegationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.staking.v1beta1.QueryRedelegationsRequest,
                cosmos.staking.v1beta1.QueryRedelegationsResponse>(
                  this, METHODID_REDELEGATIONS)))
          .addMethod(
            getDelegatorValidatorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest,
                cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse>(
                  this, METHODID_DELEGATOR_VALIDATORS)))
          .addMethod(
            getDelegatorValidatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.staking.v1beta1.QueryDelegatorValidatorRequest,
                cosmos.staking.v1beta1.QueryDelegatorValidatorResponse>(
                  this, METHODID_DELEGATOR_VALIDATOR)))
          .addMethod(
            getHistoricalInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.staking.v1beta1.QueryHistoricalInfoRequest,
                cosmos.staking.v1beta1.QueryHistoricalInfoResponse>(
                  this, METHODID_HISTORICAL_INFO)))
          .addMethod(
            getPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.staking.v1beta1.QueryPoolRequest,
                cosmos.staking.v1beta1.QueryPoolResponse>(
                  this, METHODID_POOL)))
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.staking.v1beta1.QueryParamsRequest,
                cosmos.staking.v1beta1.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryStub extends io.grpc.stub.AbstractStub<QueryStub> {
    private QueryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Validators queries all validators that match the given status.
     * </pre>
     */
    public void validators(cosmos.staking.v1beta1.QueryValidatorsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryValidatorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    public void validator(cosmos.staking.v1beta1.QueryValidatorRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryValidatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorDelegations queries delegate info for given validator.
     * </pre>
     */
    public void validatorDelegations(cosmos.staking.v1beta1.QueryValidatorDelegationsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryValidatorDelegationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidatorDelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorUnbondingDelegations queries unbonding delegations of a validator.
     * </pre>
     */
    public void validatorUnbondingDelegations(cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidatorUnbondingDelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delegation queries delegate info for given validator delegator pair.
     * </pre>
     */
    public void delegation(cosmos.staking.v1beta1.QueryDelegationRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnbondingDelegation queries unbonding info for given validator delegator
     * pair.
     * </pre>
     */
    public void unbondingDelegation(cosmos.staking.v1beta1.QueryUnbondingDelegationRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryUnbondingDelegationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnbondingDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegatorDelegations queries all delegations of a given delegator address.
     * </pre>
     */
    public void delegatorDelegations(cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegatorDelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegatorUnbondingDelegations queries all unbonding delegations of a given
     * delegator address.
     * </pre>
     */
    public void delegatorUnbondingDelegations(cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegatorUnbondingDelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Redelegations queries redelegations of given address.
     * </pre>
     */
    public void redelegations(cosmos.staking.v1beta1.QueryRedelegationsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryRedelegationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRedelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegatorValidators queries all validators info for given delegator
     * address.
     * </pre>
     */
    public void delegatorValidators(cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegatorValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegatorValidator queries validator info for given delegator validator
     * pair.
     * </pre>
     */
    public void delegatorValidator(cosmos.staking.v1beta1.QueryDelegatorValidatorRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegatorValidatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegatorValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * HistoricalInfo queries the historical info for given height.
     * </pre>
     */
    public void historicalInfo(cosmos.staking.v1beta1.QueryHistoricalInfoRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryHistoricalInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHistoricalInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pool queries the pool info.
     * </pre>
     */
    public void pool(cosmos.staking.v1beta1.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Parameters queries the staking parameters.
     * </pre>
     */
    public void params(cosmos.staking.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryBlockingStub extends io.grpc.stub.AbstractStub<QueryBlockingStub> {
    private QueryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Validators queries all validators that match the given status.
     * </pre>
     */
    public cosmos.staking.v1beta1.QueryValidatorsResponse validators(cosmos.staking.v1beta1.QueryValidatorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    public cosmos.staking.v1beta1.QueryValidatorResponse validator(cosmos.staking.v1beta1.QueryValidatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorDelegations queries delegate info for given validator.
     * </pre>
     */
    public cosmos.staking.v1beta1.QueryValidatorDelegationsResponse validatorDelegations(cosmos.staking.v1beta1.QueryValidatorDelegationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidatorDelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorUnbondingDelegations queries unbonding delegations of a validator.
     * </pre>
     */
    public cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse validatorUnbondingDelegations(cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidatorUnbondingDelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delegation queries delegate info for given validator delegator pair.
     * </pre>
     */
    public cosmos.staking.v1beta1.QueryDelegationResponse delegation(cosmos.staking.v1beta1.QueryDelegationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnbondingDelegation queries unbonding info for given validator delegator
     * pair.
     * </pre>
     */
    public cosmos.staking.v1beta1.QueryUnbondingDelegationResponse unbondingDelegation(cosmos.staking.v1beta1.QueryUnbondingDelegationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnbondingDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegatorDelegations queries all delegations of a given delegator address.
     * </pre>
     */
    public cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse delegatorDelegations(cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegatorDelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegatorUnbondingDelegations queries all unbonding delegations of a given
     * delegator address.
     * </pre>
     */
    public cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse delegatorUnbondingDelegations(cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegatorUnbondingDelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Redelegations queries redelegations of given address.
     * </pre>
     */
    public cosmos.staking.v1beta1.QueryRedelegationsResponse redelegations(cosmos.staking.v1beta1.QueryRedelegationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getRedelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegatorValidators queries all validators info for given delegator
     * address.
     * </pre>
     */
    public cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse delegatorValidators(cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegatorValidatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegatorValidator queries validator info for given delegator validator
     * pair.
     * </pre>
     */
    public cosmos.staking.v1beta1.QueryDelegatorValidatorResponse delegatorValidator(cosmos.staking.v1beta1.QueryDelegatorValidatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegatorValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * HistoricalInfo queries the historical info for given height.
     * </pre>
     */
    public cosmos.staking.v1beta1.QueryHistoricalInfoResponse historicalInfo(cosmos.staking.v1beta1.QueryHistoricalInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getHistoricalInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pool queries the pool info.
     * </pre>
     */
    public cosmos.staking.v1beta1.QueryPoolResponse pool(cosmos.staking.v1beta1.QueryPoolRequest request) {
      return blockingUnaryCall(
          getChannel(), getPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Parameters queries the staking parameters.
     * </pre>
     */
    public cosmos.staking.v1beta1.QueryParamsResponse params(cosmos.staking.v1beta1.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryFutureStub extends io.grpc.stub.AbstractStub<QueryFutureStub> {
    private QueryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Validators queries all validators that match the given status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.QueryValidatorsResponse> validators(
        cosmos.staking.v1beta1.QueryValidatorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.QueryValidatorResponse> validator(
        cosmos.staking.v1beta1.QueryValidatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorDelegations queries delegate info for given validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.QueryValidatorDelegationsResponse> validatorDelegations(
        cosmos.staking.v1beta1.QueryValidatorDelegationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidatorDelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorUnbondingDelegations queries unbonding delegations of a validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse> validatorUnbondingDelegations(
        cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidatorUnbondingDelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delegation queries delegate info for given validator delegator pair.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.QueryDelegationResponse> delegation(
        cosmos.staking.v1beta1.QueryDelegationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnbondingDelegation queries unbonding info for given validator delegator
     * pair.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.QueryUnbondingDelegationResponse> unbondingDelegation(
        cosmos.staking.v1beta1.QueryUnbondingDelegationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnbondingDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegatorDelegations queries all delegations of a given delegator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse> delegatorDelegations(
        cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegatorDelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegatorUnbondingDelegations queries all unbonding delegations of a given
     * delegator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse> delegatorUnbondingDelegations(
        cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegatorUnbondingDelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Redelegations queries redelegations of given address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.QueryRedelegationsResponse> redelegations(
        cosmos.staking.v1beta1.QueryRedelegationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRedelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegatorValidators queries all validators info for given delegator
     * address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse> delegatorValidators(
        cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegatorValidatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegatorValidator queries validator info for given delegator validator
     * pair.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.QueryDelegatorValidatorResponse> delegatorValidator(
        cosmos.staking.v1beta1.QueryDelegatorValidatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegatorValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * HistoricalInfo queries the historical info for given height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.QueryHistoricalInfoResponse> historicalInfo(
        cosmos.staking.v1beta1.QueryHistoricalInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHistoricalInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pool queries the pool info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.QueryPoolResponse> pool(
        cosmos.staking.v1beta1.QueryPoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Parameters queries the staking parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.QueryParamsResponse> params(
        cosmos.staking.v1beta1.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATORS = 0;
  private static final int METHODID_VALIDATOR = 1;
  private static final int METHODID_VALIDATOR_DELEGATIONS = 2;
  private static final int METHODID_VALIDATOR_UNBONDING_DELEGATIONS = 3;
  private static final int METHODID_DELEGATION = 4;
  private static final int METHODID_UNBONDING_DELEGATION = 5;
  private static final int METHODID_DELEGATOR_DELEGATIONS = 6;
  private static final int METHODID_DELEGATOR_UNBONDING_DELEGATIONS = 7;
  private static final int METHODID_REDELEGATIONS = 8;
  private static final int METHODID_DELEGATOR_VALIDATORS = 9;
  private static final int METHODID_DELEGATOR_VALIDATOR = 10;
  private static final int METHODID_HISTORICAL_INFO = 11;
  private static final int METHODID_POOL = 12;
  private static final int METHODID_PARAMS = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VALIDATORS:
          serviceImpl.validators((cosmos.staking.v1beta1.QueryValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryValidatorsResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR:
          serviceImpl.validator((cosmos.staking.v1beta1.QueryValidatorRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryValidatorResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_DELEGATIONS:
          serviceImpl.validatorDelegations((cosmos.staking.v1beta1.QueryValidatorDelegationsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryValidatorDelegationsResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_UNBONDING_DELEGATIONS:
          serviceImpl.validatorUnbondingDelegations((cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse>) responseObserver);
          break;
        case METHODID_DELEGATION:
          serviceImpl.delegation((cosmos.staking.v1beta1.QueryDelegationRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegationResponse>) responseObserver);
          break;
        case METHODID_UNBONDING_DELEGATION:
          serviceImpl.unbondingDelegation((cosmos.staking.v1beta1.QueryUnbondingDelegationRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryUnbondingDelegationResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_DELEGATIONS:
          serviceImpl.delegatorDelegations((cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_UNBONDING_DELEGATIONS:
          serviceImpl.delegatorUnbondingDelegations((cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse>) responseObserver);
          break;
        case METHODID_REDELEGATIONS:
          serviceImpl.redelegations((cosmos.staking.v1beta1.QueryRedelegationsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryRedelegationsResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_VALIDATORS:
          serviceImpl.delegatorValidators((cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_VALIDATOR:
          serviceImpl.delegatorValidator((cosmos.staking.v1beta1.QueryDelegatorValidatorRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryDelegatorValidatorResponse>) responseObserver);
          break;
        case METHODID_HISTORICAL_INFO:
          serviceImpl.historicalInfo((cosmos.staking.v1beta1.QueryHistoricalInfoRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryHistoricalInfoResponse>) responseObserver);
          break;
        case METHODID_POOL:
          serviceImpl.pool((cosmos.staking.v1beta1.QueryPoolRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((cosmos.staking.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.QueryParamsResponse>) responseObserver);
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

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cosmos.staking.v1beta1.QueryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getValidatorsMethod())
              .addMethod(getValidatorMethod())
              .addMethod(getValidatorDelegationsMethod())
              .addMethod(getValidatorUnbondingDelegationsMethod())
              .addMethod(getDelegationMethod())
              .addMethod(getUnbondingDelegationMethod())
              .addMethod(getDelegatorDelegationsMethod())
              .addMethod(getDelegatorUnbondingDelegationsMethod())
              .addMethod(getRedelegationsMethod())
              .addMethod(getDelegatorValidatorsMethod())
              .addMethod(getDelegatorValidatorMethod())
              .addMethod(getHistoricalInfoMethod())
              .addMethod(getPoolMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
