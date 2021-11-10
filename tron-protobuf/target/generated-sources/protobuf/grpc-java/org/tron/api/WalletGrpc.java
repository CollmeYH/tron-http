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
public final class WalletGrpc {

  private WalletGrpc() {}

  public static final String SERVICE_NAME = "protocol.Wallet";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account,
      org.tron.protos.Protocol.Account> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = org.tron.protos.Protocol.Account.class,
      responseType = org.tron.protos.Protocol.Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account,
      org.tron.protos.Protocol.Account> getGetAccountMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account, org.tron.protos.Protocol.Account> getGetAccountMethod;
    if ((getGetAccountMethod = WalletGrpc.getGetAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountMethod = WalletGrpc.getGetAccountMethod) == null) {
          WalletGrpc.getGetAccountMethod = getGetAccountMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.Account, org.tron.protos.Protocol.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Account.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Account.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccount"))
                  .build();
          }
        }
     }
     return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account,
      org.tron.protos.Protocol.Account> getGetAccountByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountById",
      requestType = org.tron.protos.Protocol.Account.class,
      responseType = org.tron.protos.Protocol.Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account,
      org.tron.protos.Protocol.Account> getGetAccountByIdMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account, org.tron.protos.Protocol.Account> getGetAccountByIdMethod;
    if ((getGetAccountByIdMethod = WalletGrpc.getGetAccountByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountByIdMethod = WalletGrpc.getGetAccountByIdMethod) == null) {
          WalletGrpc.getGetAccountByIdMethod = getGetAccountByIdMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.Account, org.tron.protos.Protocol.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetAccountById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Account.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Account.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountById"))
                  .build();
          }
        }
     }
     return getGetAccountByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.AccountBalanceRequest,
      org.tron.protos.contract.BalanceContract.AccountBalanceResponse> getGetAccountBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountBalance",
      requestType = org.tron.protos.contract.BalanceContract.AccountBalanceRequest.class,
      responseType = org.tron.protos.contract.BalanceContract.AccountBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.AccountBalanceRequest,
      org.tron.protos.contract.BalanceContract.AccountBalanceResponse> getGetAccountBalanceMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.AccountBalanceRequest, org.tron.protos.contract.BalanceContract.AccountBalanceResponse> getGetAccountBalanceMethod;
    if ((getGetAccountBalanceMethod = WalletGrpc.getGetAccountBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountBalanceMethod = WalletGrpc.getGetAccountBalanceMethod) == null) {
          WalletGrpc.getGetAccountBalanceMethod = getGetAccountBalanceMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.BalanceContract.AccountBalanceRequest, org.tron.protos.contract.BalanceContract.AccountBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetAccountBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.BalanceContract.AccountBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.BalanceContract.AccountBalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountBalance"))
                  .build();
          }
        }
     }
     return getGetAccountBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier,
      org.tron.protos.contract.BalanceContract.BlockBalanceTrace> getGetBlockBalanceTraceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockBalanceTrace",
      requestType = org.tron.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier.class,
      responseType = org.tron.protos.contract.BalanceContract.BlockBalanceTrace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier,
      org.tron.protos.contract.BalanceContract.BlockBalanceTrace> getGetBlockBalanceTraceMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier, org.tron.protos.contract.BalanceContract.BlockBalanceTrace> getGetBlockBalanceTraceMethod;
    if ((getGetBlockBalanceTraceMethod = WalletGrpc.getGetBlockBalanceTraceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockBalanceTraceMethod = WalletGrpc.getGetBlockBalanceTraceMethod) == null) {
          WalletGrpc.getGetBlockBalanceTraceMethod = getGetBlockBalanceTraceMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier, org.tron.protos.contract.BalanceContract.BlockBalanceTrace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetBlockBalanceTrace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.BalanceContract.BlockBalanceTrace.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockBalanceTrace"))
                  .build();
          }
        }
     }
     return getGetBlockBalanceTraceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.TransferContract,
      org.tron.protos.Protocol.Transaction> getCreateTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction",
      requestType = org.tron.protos.contract.BalanceContract.TransferContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.TransferContract,
      org.tron.protos.Protocol.Transaction> getCreateTransactionMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.TransferContract, org.tron.protos.Protocol.Transaction> getCreateTransactionMethod;
    if ((getCreateTransactionMethod = WalletGrpc.getCreateTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateTransactionMethod = WalletGrpc.getCreateTransactionMethod) == null) {
          WalletGrpc.getCreateTransactionMethod = getCreateTransactionMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.BalanceContract.TransferContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.BalanceContract.TransferContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateTransaction"))
                  .build();
          }
        }
     }
     return getCreateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.TransferContract,
      org.tron.api.GrpcAPI.TransactionExtention> getCreateTransaction2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction2",
      requestType = org.tron.protos.contract.BalanceContract.TransferContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.TransferContract,
      org.tron.api.GrpcAPI.TransactionExtention> getCreateTransaction2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.TransferContract, org.tron.api.GrpcAPI.TransactionExtention> getCreateTransaction2Method;
    if ((getCreateTransaction2Method = WalletGrpc.getCreateTransaction2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateTransaction2Method = WalletGrpc.getCreateTransaction2Method) == null) {
          WalletGrpc.getCreateTransaction2Method = getCreateTransaction2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.BalanceContract.TransferContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateTransaction2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.BalanceContract.TransferContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateTransaction2"))
                  .build();
          }
        }
     }
     return getCreateTransaction2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction,
      org.tron.api.GrpcAPI.Return> getBroadcastTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BroadcastTransaction",
      requestType = org.tron.protos.Protocol.Transaction.class,
      responseType = org.tron.api.GrpcAPI.Return.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction,
      org.tron.api.GrpcAPI.Return> getBroadcastTransactionMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction, org.tron.api.GrpcAPI.Return> getBroadcastTransactionMethod;
    if ((getBroadcastTransactionMethod = WalletGrpc.getBroadcastTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getBroadcastTransactionMethod = WalletGrpc.getBroadcastTransactionMethod) == null) {
          WalletGrpc.getBroadcastTransactionMethod = getBroadcastTransactionMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.Transaction, org.tron.api.GrpcAPI.Return>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "BroadcastTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.Return.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("BroadcastTransaction"))
                  .build();
          }
        }
     }
     return getBroadcastTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountUpdateContract,
      org.tron.protos.Protocol.Transaction> getUpdateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccount",
      requestType = org.tron.protos.contract.AccountContract.AccountUpdateContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountUpdateContract,
      org.tron.protos.Protocol.Transaction> getUpdateAccountMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountUpdateContract, org.tron.protos.Protocol.Transaction> getUpdateAccountMethod;
    if ((getUpdateAccountMethod = WalletGrpc.getUpdateAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAccountMethod = WalletGrpc.getUpdateAccountMethod) == null) {
          WalletGrpc.getUpdateAccountMethod = getUpdateAccountMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AccountContract.AccountUpdateContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "UpdateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AccountContract.AccountUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAccount"))
                  .build();
          }
        }
     }
     return getUpdateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.SetAccountIdContract,
      org.tron.protos.Protocol.Transaction> getSetAccountIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccountId",
      requestType = org.tron.protos.contract.AccountContract.SetAccountIdContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.SetAccountIdContract,
      org.tron.protos.Protocol.Transaction> getSetAccountIdMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.SetAccountIdContract, org.tron.protos.Protocol.Transaction> getSetAccountIdMethod;
    if ((getSetAccountIdMethod = WalletGrpc.getSetAccountIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getSetAccountIdMethod = WalletGrpc.getSetAccountIdMethod) == null) {
          WalletGrpc.getSetAccountIdMethod = getSetAccountIdMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AccountContract.SetAccountIdContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "SetAccountId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AccountContract.SetAccountIdContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("SetAccountId"))
                  .build();
          }
        }
     }
     return getSetAccountIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountUpdateContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUpdateAccount2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccount2",
      requestType = org.tron.protos.contract.AccountContract.AccountUpdateContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountUpdateContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUpdateAccount2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountUpdateContract, org.tron.api.GrpcAPI.TransactionExtention> getUpdateAccount2Method;
    if ((getUpdateAccount2Method = WalletGrpc.getUpdateAccount2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAccount2Method = WalletGrpc.getUpdateAccount2Method) == null) {
          WalletGrpc.getUpdateAccount2Method = getUpdateAccount2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AccountContract.AccountUpdateContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "UpdateAccount2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AccountContract.AccountUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAccount2"))
                  .build();
          }
        }
     }
     return getUpdateAccount2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.VoteWitnessContract,
      org.tron.protos.Protocol.Transaction> getVoteWitnessAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteWitnessAccount",
      requestType = org.tron.protos.contract.WitnessContract.VoteWitnessContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.VoteWitnessContract,
      org.tron.protos.Protocol.Transaction> getVoteWitnessAccountMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.VoteWitnessContract, org.tron.protos.Protocol.Transaction> getVoteWitnessAccountMethod;
    if ((getVoteWitnessAccountMethod = WalletGrpc.getVoteWitnessAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getVoteWitnessAccountMethod = WalletGrpc.getVoteWitnessAccountMethod) == null) {
          WalletGrpc.getVoteWitnessAccountMethod = getVoteWitnessAccountMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.WitnessContract.VoteWitnessContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "VoteWitnessAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.WitnessContract.VoteWitnessContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("VoteWitnessAccount"))
                  .build();
          }
        }
     }
     return getVoteWitnessAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.UpdateSettingContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUpdateSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSetting",
      requestType = org.tron.protos.contract.SmartContractOuterClass.UpdateSettingContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.UpdateSettingContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUpdateSettingMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.UpdateSettingContract, org.tron.api.GrpcAPI.TransactionExtention> getUpdateSettingMethod;
    if ((getUpdateSettingMethod = WalletGrpc.getUpdateSettingMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateSettingMethod = WalletGrpc.getUpdateSettingMethod) == null) {
          WalletGrpc.getUpdateSettingMethod = getUpdateSettingMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.SmartContractOuterClass.UpdateSettingContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "UpdateSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.SmartContractOuterClass.UpdateSettingContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateSetting"))
                  .build();
          }
        }
     }
     return getUpdateSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUpdateEnergyLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnergyLimit",
      requestType = org.tron.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUpdateEnergyLimitMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract, org.tron.api.GrpcAPI.TransactionExtention> getUpdateEnergyLimitMethod;
    if ((getUpdateEnergyLimitMethod = WalletGrpc.getUpdateEnergyLimitMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateEnergyLimitMethod = WalletGrpc.getUpdateEnergyLimitMethod) == null) {
          WalletGrpc.getUpdateEnergyLimitMethod = getUpdateEnergyLimitMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "UpdateEnergyLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateEnergyLimit"))
                  .build();
          }
        }
     }
     return getUpdateEnergyLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.VoteWitnessContract,
      org.tron.api.GrpcAPI.TransactionExtention> getVoteWitnessAccount2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteWitnessAccount2",
      requestType = org.tron.protos.contract.WitnessContract.VoteWitnessContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.VoteWitnessContract,
      org.tron.api.GrpcAPI.TransactionExtention> getVoteWitnessAccount2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.VoteWitnessContract, org.tron.api.GrpcAPI.TransactionExtention> getVoteWitnessAccount2Method;
    if ((getVoteWitnessAccount2Method = WalletGrpc.getVoteWitnessAccount2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getVoteWitnessAccount2Method = WalletGrpc.getVoteWitnessAccount2Method) == null) {
          WalletGrpc.getVoteWitnessAccount2Method = getVoteWitnessAccount2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.WitnessContract.VoteWitnessContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "VoteWitnessAccount2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.WitnessContract.VoteWitnessContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("VoteWitnessAccount2"))
                  .build();
          }
        }
     }
     return getVoteWitnessAccount2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract,
      org.tron.protos.Protocol.Transaction> getCreateAssetIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAssetIssue",
      requestType = org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract,
      org.tron.protos.Protocol.Transaction> getCreateAssetIssueMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract, org.tron.protos.Protocol.Transaction> getCreateAssetIssueMethod;
    if ((getCreateAssetIssueMethod = WalletGrpc.getCreateAssetIssueMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAssetIssueMethod = WalletGrpc.getCreateAssetIssueMethod) == null) {
          WalletGrpc.getCreateAssetIssueMethod = getCreateAssetIssueMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateAssetIssue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAssetIssue"))
                  .build();
          }
        }
     }
     return getCreateAssetIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract,
      org.tron.api.GrpcAPI.TransactionExtention> getCreateAssetIssue2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAssetIssue2",
      requestType = org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract,
      org.tron.api.GrpcAPI.TransactionExtention> getCreateAssetIssue2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract, org.tron.api.GrpcAPI.TransactionExtention> getCreateAssetIssue2Method;
    if ((getCreateAssetIssue2Method = WalletGrpc.getCreateAssetIssue2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAssetIssue2Method = WalletGrpc.getCreateAssetIssue2Method) == null) {
          WalletGrpc.getCreateAssetIssue2Method = getCreateAssetIssue2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateAssetIssue2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAssetIssue2"))
                  .build();
          }
        }
     }
     return getCreateAssetIssue2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.WitnessUpdateContract,
      org.tron.protos.Protocol.Transaction> getUpdateWitnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWitness",
      requestType = org.tron.protos.contract.WitnessContract.WitnessUpdateContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.WitnessUpdateContract,
      org.tron.protos.Protocol.Transaction> getUpdateWitnessMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.WitnessUpdateContract, org.tron.protos.Protocol.Transaction> getUpdateWitnessMethod;
    if ((getUpdateWitnessMethod = WalletGrpc.getUpdateWitnessMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateWitnessMethod = WalletGrpc.getUpdateWitnessMethod) == null) {
          WalletGrpc.getUpdateWitnessMethod = getUpdateWitnessMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.WitnessContract.WitnessUpdateContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "UpdateWitness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.WitnessContract.WitnessUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateWitness"))
                  .build();
          }
        }
     }
     return getUpdateWitnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.WitnessUpdateContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUpdateWitness2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWitness2",
      requestType = org.tron.protos.contract.WitnessContract.WitnessUpdateContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.WitnessUpdateContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUpdateWitness2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.WitnessUpdateContract, org.tron.api.GrpcAPI.TransactionExtention> getUpdateWitness2Method;
    if ((getUpdateWitness2Method = WalletGrpc.getUpdateWitness2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateWitness2Method = WalletGrpc.getUpdateWitness2Method) == null) {
          WalletGrpc.getUpdateWitness2Method = getUpdateWitness2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.WitnessContract.WitnessUpdateContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "UpdateWitness2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.WitnessContract.WitnessUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateWitness2"))
                  .build();
          }
        }
     }
     return getUpdateWitness2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountCreateContract,
      org.tron.protos.Protocol.Transaction> getCreateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccount",
      requestType = org.tron.protos.contract.AccountContract.AccountCreateContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountCreateContract,
      org.tron.protos.Protocol.Transaction> getCreateAccountMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountCreateContract, org.tron.protos.Protocol.Transaction> getCreateAccountMethod;
    if ((getCreateAccountMethod = WalletGrpc.getCreateAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAccountMethod = WalletGrpc.getCreateAccountMethod) == null) {
          WalletGrpc.getCreateAccountMethod = getCreateAccountMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AccountContract.AccountCreateContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AccountContract.AccountCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAccount"))
                  .build();
          }
        }
     }
     return getCreateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountCreateContract,
      org.tron.api.GrpcAPI.TransactionExtention> getCreateAccount2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccount2",
      requestType = org.tron.protos.contract.AccountContract.AccountCreateContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountCreateContract,
      org.tron.api.GrpcAPI.TransactionExtention> getCreateAccount2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountCreateContract, org.tron.api.GrpcAPI.TransactionExtention> getCreateAccount2Method;
    if ((getCreateAccount2Method = WalletGrpc.getCreateAccount2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAccount2Method = WalletGrpc.getCreateAccount2Method) == null) {
          WalletGrpc.getCreateAccount2Method = getCreateAccount2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AccountContract.AccountCreateContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateAccount2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AccountContract.AccountCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAccount2"))
                  .build();
          }
        }
     }
     return getCreateAccount2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.WitnessCreateContract,
      org.tron.protos.Protocol.Transaction> getCreateWitnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWitness",
      requestType = org.tron.protos.contract.WitnessContract.WitnessCreateContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.WitnessCreateContract,
      org.tron.protos.Protocol.Transaction> getCreateWitnessMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.WitnessCreateContract, org.tron.protos.Protocol.Transaction> getCreateWitnessMethod;
    if ((getCreateWitnessMethod = WalletGrpc.getCreateWitnessMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateWitnessMethod = WalletGrpc.getCreateWitnessMethod) == null) {
          WalletGrpc.getCreateWitnessMethod = getCreateWitnessMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.WitnessContract.WitnessCreateContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateWitness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.WitnessContract.WitnessCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateWitness"))
                  .build();
          }
        }
     }
     return getCreateWitnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.WitnessCreateContract,
      org.tron.api.GrpcAPI.TransactionExtention> getCreateWitness2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWitness2",
      requestType = org.tron.protos.contract.WitnessContract.WitnessCreateContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.WitnessCreateContract,
      org.tron.api.GrpcAPI.TransactionExtention> getCreateWitness2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.WitnessContract.WitnessCreateContract, org.tron.api.GrpcAPI.TransactionExtention> getCreateWitness2Method;
    if ((getCreateWitness2Method = WalletGrpc.getCreateWitness2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateWitness2Method = WalletGrpc.getCreateWitness2Method) == null) {
          WalletGrpc.getCreateWitness2Method = getCreateWitness2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.WitnessContract.WitnessCreateContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateWitness2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.WitnessContract.WitnessCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateWitness2"))
                  .build();
          }
        }
     }
     return getCreateWitness2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract,
      org.tron.protos.Protocol.Transaction> getTransferAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferAsset",
      requestType = org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract,
      org.tron.protos.Protocol.Transaction> getTransferAssetMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract, org.tron.protos.Protocol.Transaction> getTransferAssetMethod;
    if ((getTransferAssetMethod = WalletGrpc.getTransferAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTransferAssetMethod = WalletGrpc.getTransferAssetMethod) == null) {
          WalletGrpc.getTransferAssetMethod = getTransferAssetMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "TransferAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TransferAsset"))
                  .build();
          }
        }
     }
     return getTransferAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract,
      org.tron.api.GrpcAPI.TransactionExtention> getTransferAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferAsset2",
      requestType = org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract,
      org.tron.api.GrpcAPI.TransactionExtention> getTransferAsset2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract, org.tron.api.GrpcAPI.TransactionExtention> getTransferAsset2Method;
    if ((getTransferAsset2Method = WalletGrpc.getTransferAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTransferAsset2Method = WalletGrpc.getTransferAsset2Method) == null) {
          WalletGrpc.getTransferAsset2Method = getTransferAsset2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "TransferAsset2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TransferAsset2"))
                  .build();
          }
        }
     }
     return getTransferAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract,
      org.tron.protos.Protocol.Transaction> getParticipateAssetIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParticipateAssetIssue",
      requestType = org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract,
      org.tron.protos.Protocol.Transaction> getParticipateAssetIssueMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract, org.tron.protos.Protocol.Transaction> getParticipateAssetIssueMethod;
    if ((getParticipateAssetIssueMethod = WalletGrpc.getParticipateAssetIssueMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getParticipateAssetIssueMethod = WalletGrpc.getParticipateAssetIssueMethod) == null) {
          WalletGrpc.getParticipateAssetIssueMethod = getParticipateAssetIssueMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ParticipateAssetIssue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ParticipateAssetIssue"))
                  .build();
          }
        }
     }
     return getParticipateAssetIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract,
      org.tron.api.GrpcAPI.TransactionExtention> getParticipateAssetIssue2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParticipateAssetIssue2",
      requestType = org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract,
      org.tron.api.GrpcAPI.TransactionExtention> getParticipateAssetIssue2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract, org.tron.api.GrpcAPI.TransactionExtention> getParticipateAssetIssue2Method;
    if ((getParticipateAssetIssue2Method = WalletGrpc.getParticipateAssetIssue2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getParticipateAssetIssue2Method = WalletGrpc.getParticipateAssetIssue2Method) == null) {
          WalletGrpc.getParticipateAssetIssue2Method = getParticipateAssetIssue2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ParticipateAssetIssue2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ParticipateAssetIssue2"))
                  .build();
          }
        }
     }
     return getParticipateAssetIssue2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.FreezeBalanceContract,
      org.tron.protos.Protocol.Transaction> getFreezeBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FreezeBalance",
      requestType = org.tron.protos.contract.BalanceContract.FreezeBalanceContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.FreezeBalanceContract,
      org.tron.protos.Protocol.Transaction> getFreezeBalanceMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.FreezeBalanceContract, org.tron.protos.Protocol.Transaction> getFreezeBalanceMethod;
    if ((getFreezeBalanceMethod = WalletGrpc.getFreezeBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getFreezeBalanceMethod = WalletGrpc.getFreezeBalanceMethod) == null) {
          WalletGrpc.getFreezeBalanceMethod = getFreezeBalanceMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.BalanceContract.FreezeBalanceContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "FreezeBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.BalanceContract.FreezeBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("FreezeBalance"))
                  .build();
          }
        }
     }
     return getFreezeBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.FreezeBalanceContract,
      org.tron.api.GrpcAPI.TransactionExtention> getFreezeBalance2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FreezeBalance2",
      requestType = org.tron.protos.contract.BalanceContract.FreezeBalanceContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.FreezeBalanceContract,
      org.tron.api.GrpcAPI.TransactionExtention> getFreezeBalance2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.FreezeBalanceContract, org.tron.api.GrpcAPI.TransactionExtention> getFreezeBalance2Method;
    if ((getFreezeBalance2Method = WalletGrpc.getFreezeBalance2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getFreezeBalance2Method = WalletGrpc.getFreezeBalance2Method) == null) {
          WalletGrpc.getFreezeBalance2Method = getFreezeBalance2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.BalanceContract.FreezeBalanceContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "FreezeBalance2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.BalanceContract.FreezeBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("FreezeBalance2"))
                  .build();
          }
        }
     }
     return getFreezeBalance2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract,
      org.tron.protos.Protocol.Transaction> getUnfreezeBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfreezeBalance",
      requestType = org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract,
      org.tron.protos.Protocol.Transaction> getUnfreezeBalanceMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract, org.tron.protos.Protocol.Transaction> getUnfreezeBalanceMethod;
    if ((getUnfreezeBalanceMethod = WalletGrpc.getUnfreezeBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeBalanceMethod = WalletGrpc.getUnfreezeBalanceMethod) == null) {
          WalletGrpc.getUnfreezeBalanceMethod = getUnfreezeBalanceMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "UnfreezeBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeBalance"))
                  .build();
          }
        }
     }
     return getUnfreezeBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUnfreezeBalance2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfreezeBalance2",
      requestType = org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUnfreezeBalance2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract, org.tron.api.GrpcAPI.TransactionExtention> getUnfreezeBalance2Method;
    if ((getUnfreezeBalance2Method = WalletGrpc.getUnfreezeBalance2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeBalance2Method = WalletGrpc.getUnfreezeBalance2Method) == null) {
          WalletGrpc.getUnfreezeBalance2Method = getUnfreezeBalance2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "UnfreezeBalance2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeBalance2"))
                  .build();
          }
        }
     }
     return getUnfreezeBalance2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract,
      org.tron.protos.Protocol.Transaction> getUnfreezeAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfreezeAsset",
      requestType = org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract,
      org.tron.protos.Protocol.Transaction> getUnfreezeAssetMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract, org.tron.protos.Protocol.Transaction> getUnfreezeAssetMethod;
    if ((getUnfreezeAssetMethod = WalletGrpc.getUnfreezeAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeAssetMethod = WalletGrpc.getUnfreezeAssetMethod) == null) {
          WalletGrpc.getUnfreezeAssetMethod = getUnfreezeAssetMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "UnfreezeAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeAsset"))
                  .build();
          }
        }
     }
     return getUnfreezeAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUnfreezeAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfreezeAsset2",
      requestType = org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUnfreezeAsset2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract, org.tron.api.GrpcAPI.TransactionExtention> getUnfreezeAsset2Method;
    if ((getUnfreezeAsset2Method = WalletGrpc.getUnfreezeAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeAsset2Method = WalletGrpc.getUnfreezeAsset2Method) == null) {
          WalletGrpc.getUnfreezeAsset2Method = getUnfreezeAsset2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "UnfreezeAsset2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeAsset2"))
                  .build();
          }
        }
     }
     return getUnfreezeAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.WithdrawBalanceContract,
      org.tron.protos.Protocol.Transaction> getWithdrawBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawBalance",
      requestType = org.tron.protos.contract.BalanceContract.WithdrawBalanceContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.WithdrawBalanceContract,
      org.tron.protos.Protocol.Transaction> getWithdrawBalanceMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.WithdrawBalanceContract, org.tron.protos.Protocol.Transaction> getWithdrawBalanceMethod;
    if ((getWithdrawBalanceMethod = WalletGrpc.getWithdrawBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getWithdrawBalanceMethod = WalletGrpc.getWithdrawBalanceMethod) == null) {
          WalletGrpc.getWithdrawBalanceMethod = getWithdrawBalanceMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.BalanceContract.WithdrawBalanceContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "WithdrawBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.BalanceContract.WithdrawBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("WithdrawBalance"))
                  .build();
          }
        }
     }
     return getWithdrawBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.WithdrawBalanceContract,
      org.tron.api.GrpcAPI.TransactionExtention> getWithdrawBalance2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawBalance2",
      requestType = org.tron.protos.contract.BalanceContract.WithdrawBalanceContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.WithdrawBalanceContract,
      org.tron.api.GrpcAPI.TransactionExtention> getWithdrawBalance2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.BalanceContract.WithdrawBalanceContract, org.tron.api.GrpcAPI.TransactionExtention> getWithdrawBalance2Method;
    if ((getWithdrawBalance2Method = WalletGrpc.getWithdrawBalance2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getWithdrawBalance2Method = WalletGrpc.getWithdrawBalance2Method) == null) {
          WalletGrpc.getWithdrawBalance2Method = getWithdrawBalance2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.BalanceContract.WithdrawBalanceContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "WithdrawBalance2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.BalanceContract.WithdrawBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("WithdrawBalance2"))
                  .build();
          }
        }
     }
     return getWithdrawBalance2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract,
      org.tron.protos.Protocol.Transaction> getUpdateAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAsset",
      requestType = org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract,
      org.tron.protos.Protocol.Transaction> getUpdateAssetMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract, org.tron.protos.Protocol.Transaction> getUpdateAssetMethod;
    if ((getUpdateAssetMethod = WalletGrpc.getUpdateAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAssetMethod = WalletGrpc.getUpdateAssetMethod) == null) {
          WalletGrpc.getUpdateAssetMethod = getUpdateAssetMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "UpdateAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAsset"))
                  .build();
          }
        }
     }
     return getUpdateAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUpdateAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAsset2",
      requestType = org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUpdateAsset2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract, org.tron.api.GrpcAPI.TransactionExtention> getUpdateAsset2Method;
    if ((getUpdateAsset2Method = WalletGrpc.getUpdateAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAsset2Method = WalletGrpc.getUpdateAsset2Method) == null) {
          WalletGrpc.getUpdateAsset2Method = getUpdateAsset2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "UpdateAsset2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAsset2"))
                  .build();
          }
        }
     }
     return getUpdateAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.ProposalContract.ProposalCreateContract,
      org.tron.api.GrpcAPI.TransactionExtention> getProposalCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalCreate",
      requestType = org.tron.protos.contract.ProposalContract.ProposalCreateContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.ProposalContract.ProposalCreateContract,
      org.tron.api.GrpcAPI.TransactionExtention> getProposalCreateMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.ProposalContract.ProposalCreateContract, org.tron.api.GrpcAPI.TransactionExtention> getProposalCreateMethod;
    if ((getProposalCreateMethod = WalletGrpc.getProposalCreateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalCreateMethod = WalletGrpc.getProposalCreateMethod) == null) {
          WalletGrpc.getProposalCreateMethod = getProposalCreateMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.ProposalContract.ProposalCreateContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ProposalCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.ProposalContract.ProposalCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalCreate"))
                  .build();
          }
        }
     }
     return getProposalCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.ProposalContract.ProposalApproveContract,
      org.tron.api.GrpcAPI.TransactionExtention> getProposalApproveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalApprove",
      requestType = org.tron.protos.contract.ProposalContract.ProposalApproveContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.ProposalContract.ProposalApproveContract,
      org.tron.api.GrpcAPI.TransactionExtention> getProposalApproveMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.ProposalContract.ProposalApproveContract, org.tron.api.GrpcAPI.TransactionExtention> getProposalApproveMethod;
    if ((getProposalApproveMethod = WalletGrpc.getProposalApproveMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalApproveMethod = WalletGrpc.getProposalApproveMethod) == null) {
          WalletGrpc.getProposalApproveMethod = getProposalApproveMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.ProposalContract.ProposalApproveContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ProposalApprove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.ProposalContract.ProposalApproveContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalApprove"))
                  .build();
          }
        }
     }
     return getProposalApproveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.ProposalContract.ProposalDeleteContract,
      org.tron.api.GrpcAPI.TransactionExtention> getProposalDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalDelete",
      requestType = org.tron.protos.contract.ProposalContract.ProposalDeleteContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.ProposalContract.ProposalDeleteContract,
      org.tron.api.GrpcAPI.TransactionExtention> getProposalDeleteMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.ProposalContract.ProposalDeleteContract, org.tron.api.GrpcAPI.TransactionExtention> getProposalDeleteMethod;
    if ((getProposalDeleteMethod = WalletGrpc.getProposalDeleteMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalDeleteMethod = WalletGrpc.getProposalDeleteMethod) == null) {
          WalletGrpc.getProposalDeleteMethod = getProposalDeleteMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.ProposalContract.ProposalDeleteContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ProposalDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.ProposalContract.ProposalDeleteContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalDelete"))
                  .build();
          }
        }
     }
     return getProposalDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.StorageContract.BuyStorageContract,
      org.tron.api.GrpcAPI.TransactionExtention> getBuyStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyStorage",
      requestType = org.tron.protos.contract.StorageContract.BuyStorageContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.StorageContract.BuyStorageContract,
      org.tron.api.GrpcAPI.TransactionExtention> getBuyStorageMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.StorageContract.BuyStorageContract, org.tron.api.GrpcAPI.TransactionExtention> getBuyStorageMethod;
    if ((getBuyStorageMethod = WalletGrpc.getBuyStorageMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getBuyStorageMethod = WalletGrpc.getBuyStorageMethod) == null) {
          WalletGrpc.getBuyStorageMethod = getBuyStorageMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.StorageContract.BuyStorageContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "BuyStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.StorageContract.BuyStorageContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("BuyStorage"))
                  .build();
          }
        }
     }
     return getBuyStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.StorageContract.BuyStorageBytesContract,
      org.tron.api.GrpcAPI.TransactionExtention> getBuyStorageBytesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyStorageBytes",
      requestType = org.tron.protos.contract.StorageContract.BuyStorageBytesContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.StorageContract.BuyStorageBytesContract,
      org.tron.api.GrpcAPI.TransactionExtention> getBuyStorageBytesMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.StorageContract.BuyStorageBytesContract, org.tron.api.GrpcAPI.TransactionExtention> getBuyStorageBytesMethod;
    if ((getBuyStorageBytesMethod = WalletGrpc.getBuyStorageBytesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getBuyStorageBytesMethod = WalletGrpc.getBuyStorageBytesMethod) == null) {
          WalletGrpc.getBuyStorageBytesMethod = getBuyStorageBytesMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.StorageContract.BuyStorageBytesContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "BuyStorageBytes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.StorageContract.BuyStorageBytesContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("BuyStorageBytes"))
                  .build();
          }
        }
     }
     return getBuyStorageBytesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.StorageContract.SellStorageContract,
      org.tron.api.GrpcAPI.TransactionExtention> getSellStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellStorage",
      requestType = org.tron.protos.contract.StorageContract.SellStorageContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.StorageContract.SellStorageContract,
      org.tron.api.GrpcAPI.TransactionExtention> getSellStorageMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.StorageContract.SellStorageContract, org.tron.api.GrpcAPI.TransactionExtention> getSellStorageMethod;
    if ((getSellStorageMethod = WalletGrpc.getSellStorageMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getSellStorageMethod = WalletGrpc.getSellStorageMethod) == null) {
          WalletGrpc.getSellStorageMethod = getSellStorageMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.StorageContract.SellStorageContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "SellStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.StorageContract.SellStorageContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("SellStorage"))
                  .build();
          }
        }
     }
     return getSellStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.ExchangeContract.ExchangeCreateContract,
      org.tron.api.GrpcAPI.TransactionExtention> getExchangeCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeCreate",
      requestType = org.tron.protos.contract.ExchangeContract.ExchangeCreateContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.ExchangeContract.ExchangeCreateContract,
      org.tron.api.GrpcAPI.TransactionExtention> getExchangeCreateMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.ExchangeContract.ExchangeCreateContract, org.tron.api.GrpcAPI.TransactionExtention> getExchangeCreateMethod;
    if ((getExchangeCreateMethod = WalletGrpc.getExchangeCreateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeCreateMethod = WalletGrpc.getExchangeCreateMethod) == null) {
          WalletGrpc.getExchangeCreateMethod = getExchangeCreateMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.ExchangeContract.ExchangeCreateContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ExchangeCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.ExchangeContract.ExchangeCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeCreate"))
                  .build();
          }
        }
     }
     return getExchangeCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.ExchangeContract.ExchangeInjectContract,
      org.tron.api.GrpcAPI.TransactionExtention> getExchangeInjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeInject",
      requestType = org.tron.protos.contract.ExchangeContract.ExchangeInjectContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.ExchangeContract.ExchangeInjectContract,
      org.tron.api.GrpcAPI.TransactionExtention> getExchangeInjectMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.ExchangeContract.ExchangeInjectContract, org.tron.api.GrpcAPI.TransactionExtention> getExchangeInjectMethod;
    if ((getExchangeInjectMethod = WalletGrpc.getExchangeInjectMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeInjectMethod = WalletGrpc.getExchangeInjectMethod) == null) {
          WalletGrpc.getExchangeInjectMethod = getExchangeInjectMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.ExchangeContract.ExchangeInjectContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ExchangeInject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.ExchangeContract.ExchangeInjectContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeInject"))
                  .build();
          }
        }
     }
     return getExchangeInjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.ExchangeContract.ExchangeWithdrawContract,
      org.tron.api.GrpcAPI.TransactionExtention> getExchangeWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeWithdraw",
      requestType = org.tron.protos.contract.ExchangeContract.ExchangeWithdrawContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.ExchangeContract.ExchangeWithdrawContract,
      org.tron.api.GrpcAPI.TransactionExtention> getExchangeWithdrawMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.ExchangeContract.ExchangeWithdrawContract, org.tron.api.GrpcAPI.TransactionExtention> getExchangeWithdrawMethod;
    if ((getExchangeWithdrawMethod = WalletGrpc.getExchangeWithdrawMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeWithdrawMethod = WalletGrpc.getExchangeWithdrawMethod) == null) {
          WalletGrpc.getExchangeWithdrawMethod = getExchangeWithdrawMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.ExchangeContract.ExchangeWithdrawContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ExchangeWithdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.ExchangeContract.ExchangeWithdrawContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeWithdraw"))
                  .build();
          }
        }
     }
     return getExchangeWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.ExchangeContract.ExchangeTransactionContract,
      org.tron.api.GrpcAPI.TransactionExtention> getExchangeTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeTransaction",
      requestType = org.tron.protos.contract.ExchangeContract.ExchangeTransactionContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.ExchangeContract.ExchangeTransactionContract,
      org.tron.api.GrpcAPI.TransactionExtention> getExchangeTransactionMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.ExchangeContract.ExchangeTransactionContract, org.tron.api.GrpcAPI.TransactionExtention> getExchangeTransactionMethod;
    if ((getExchangeTransactionMethod = WalletGrpc.getExchangeTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeTransactionMethod = WalletGrpc.getExchangeTransactionMethod) == null) {
          WalletGrpc.getExchangeTransactionMethod = getExchangeTransactionMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.ExchangeContract.ExchangeTransactionContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ExchangeTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.ExchangeContract.ExchangeTransactionContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeTransaction"))
                  .build();
          }
        }
     }
     return getExchangeTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.MarketContract.MarketSellAssetContract,
      org.tron.api.GrpcAPI.TransactionExtention> getMarketSellAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketSellAsset",
      requestType = org.tron.protos.contract.MarketContract.MarketSellAssetContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.MarketContract.MarketSellAssetContract,
      org.tron.api.GrpcAPI.TransactionExtention> getMarketSellAssetMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.MarketContract.MarketSellAssetContract, org.tron.api.GrpcAPI.TransactionExtention> getMarketSellAssetMethod;
    if ((getMarketSellAssetMethod = WalletGrpc.getMarketSellAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getMarketSellAssetMethod = WalletGrpc.getMarketSellAssetMethod) == null) {
          WalletGrpc.getMarketSellAssetMethod = getMarketSellAssetMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.MarketContract.MarketSellAssetContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "MarketSellAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.MarketContract.MarketSellAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("MarketSellAsset"))
                  .build();
          }
        }
     }
     return getMarketSellAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.MarketContract.MarketCancelOrderContract,
      org.tron.api.GrpcAPI.TransactionExtention> getMarketCancelOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketCancelOrder",
      requestType = org.tron.protos.contract.MarketContract.MarketCancelOrderContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.MarketContract.MarketCancelOrderContract,
      org.tron.api.GrpcAPI.TransactionExtention> getMarketCancelOrderMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.MarketContract.MarketCancelOrderContract, org.tron.api.GrpcAPI.TransactionExtention> getMarketCancelOrderMethod;
    if ((getMarketCancelOrderMethod = WalletGrpc.getMarketCancelOrderMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getMarketCancelOrderMethod = WalletGrpc.getMarketCancelOrderMethod) == null) {
          WalletGrpc.getMarketCancelOrderMethod = getMarketCancelOrderMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.MarketContract.MarketCancelOrderContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "MarketCancelOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.MarketContract.MarketCancelOrderContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("MarketCancelOrder"))
                  .build();
          }
        }
     }
     return getMarketCancelOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.MarketOrder> getGetMarketOrderByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderById",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.protos.Protocol.MarketOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.MarketOrder> getGetMarketOrderByIdMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.MarketOrder> getGetMarketOrderByIdMethod;
    if ((getGetMarketOrderByIdMethod = WalletGrpc.getGetMarketOrderByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderByIdMethod = WalletGrpc.getGetMarketOrderByIdMethod) == null) {
          WalletGrpc.getGetMarketOrderByIdMethod = getGetMarketOrderByIdMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.MarketOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetMarketOrderById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.MarketOrder.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderById"))
                  .build();
          }
        }
     }
     return getGetMarketOrderByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.MarketOrderList> getGetMarketOrderByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderByAccount",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.protos.Protocol.MarketOrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.MarketOrderList> getGetMarketOrderByAccountMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.MarketOrderList> getGetMarketOrderByAccountMethod;
    if ((getGetMarketOrderByAccountMethod = WalletGrpc.getGetMarketOrderByAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderByAccountMethod = WalletGrpc.getGetMarketOrderByAccountMethod) == null) {
          WalletGrpc.getGetMarketOrderByAccountMethod = getGetMarketOrderByAccountMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.MarketOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetMarketOrderByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.MarketOrderList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderByAccount"))
                  .build();
          }
        }
     }
     return getGetMarketOrderByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.MarketOrderPair,
      org.tron.protos.Protocol.MarketPriceList> getGetMarketPriceByPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketPriceByPair",
      requestType = org.tron.protos.Protocol.MarketOrderPair.class,
      responseType = org.tron.protos.Protocol.MarketPriceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.MarketOrderPair,
      org.tron.protos.Protocol.MarketPriceList> getGetMarketPriceByPairMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.MarketOrderPair, org.tron.protos.Protocol.MarketPriceList> getGetMarketPriceByPairMethod;
    if ((getGetMarketPriceByPairMethod = WalletGrpc.getGetMarketPriceByPairMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketPriceByPairMethod = WalletGrpc.getGetMarketPriceByPairMethod) == null) {
          WalletGrpc.getGetMarketPriceByPairMethod = getGetMarketPriceByPairMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.MarketOrderPair, org.tron.protos.Protocol.MarketPriceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetMarketPriceByPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.MarketOrderPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.MarketPriceList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketPriceByPair"))
                  .build();
          }
        }
     }
     return getGetMarketPriceByPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.MarketOrderPair,
      org.tron.protos.Protocol.MarketOrderList> getGetMarketOrderListByPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderListByPair",
      requestType = org.tron.protos.Protocol.MarketOrderPair.class,
      responseType = org.tron.protos.Protocol.MarketOrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.MarketOrderPair,
      org.tron.protos.Protocol.MarketOrderList> getGetMarketOrderListByPairMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.MarketOrderPair, org.tron.protos.Protocol.MarketOrderList> getGetMarketOrderListByPairMethod;
    if ((getGetMarketOrderListByPairMethod = WalletGrpc.getGetMarketOrderListByPairMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderListByPairMethod = WalletGrpc.getGetMarketOrderListByPairMethod) == null) {
          WalletGrpc.getGetMarketOrderListByPairMethod = getGetMarketOrderListByPairMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.MarketOrderPair, org.tron.protos.Protocol.MarketOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetMarketOrderListByPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.MarketOrderPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.MarketOrderList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderListByPair"))
                  .build();
          }
        }
     }
     return getGetMarketOrderListByPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.protos.Protocol.MarketOrderPairList> getGetMarketPairListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketPairList",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.protos.Protocol.MarketOrderPairList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.protos.Protocol.MarketOrderPairList> getGetMarketPairListMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.protos.Protocol.MarketOrderPairList> getGetMarketPairListMethod;
    if ((getGetMarketPairListMethod = WalletGrpc.getGetMarketPairListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketPairListMethod = WalletGrpc.getGetMarketPairListMethod) == null) {
          WalletGrpc.getGetMarketPairListMethod = getGetMarketPairListMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.protos.Protocol.MarketOrderPairList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetMarketPairList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.MarketOrderPairList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketPairList"))
                  .build();
          }
        }
     }
     return getGetMarketPairListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.NodeList> getListNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNodes",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.api.GrpcAPI.NodeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.NodeList> getListNodesMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.NodeList> getListNodesMethod;
    if ((getListNodesMethod = WalletGrpc.getListNodesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListNodesMethod = WalletGrpc.getListNodesMethod) == null) {
          WalletGrpc.getListNodesMethod = getListNodesMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.NodeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ListNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NodeList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListNodes"))
                  .build();
          }
        }
     }
     return getListNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account,
      org.tron.api.GrpcAPI.AssetIssueList> getGetAssetIssueByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueByAccount",
      requestType = org.tron.protos.Protocol.Account.class,
      responseType = org.tron.api.GrpcAPI.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account,
      org.tron.api.GrpcAPI.AssetIssueList> getGetAssetIssueByAccountMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account, org.tron.api.GrpcAPI.AssetIssueList> getGetAssetIssueByAccountMethod;
    if ((getGetAssetIssueByAccountMethod = WalletGrpc.getGetAssetIssueByAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByAccountMethod = WalletGrpc.getGetAssetIssueByAccountMethod) == null) {
          WalletGrpc.getGetAssetIssueByAccountMethod = getGetAssetIssueByAccountMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.Account, org.tron.api.GrpcAPI.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetAssetIssueByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Account.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.AssetIssueList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueByAccount"))
                  .build();
          }
        }
     }
     return getGetAssetIssueByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account,
      org.tron.api.GrpcAPI.AccountNetMessage> getGetAccountNetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountNet",
      requestType = org.tron.protos.Protocol.Account.class,
      responseType = org.tron.api.GrpcAPI.AccountNetMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account,
      org.tron.api.GrpcAPI.AccountNetMessage> getGetAccountNetMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account, org.tron.api.GrpcAPI.AccountNetMessage> getGetAccountNetMethod;
    if ((getGetAccountNetMethod = WalletGrpc.getGetAccountNetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountNetMethod = WalletGrpc.getGetAccountNetMethod) == null) {
          WalletGrpc.getGetAccountNetMethod = getGetAccountNetMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.Account, org.tron.api.GrpcAPI.AccountNetMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetAccountNet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Account.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.AccountNetMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountNet"))
                  .build();
          }
        }
     }
     return getGetAccountNetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account,
      org.tron.api.GrpcAPI.AccountResourceMessage> getGetAccountResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountResource",
      requestType = org.tron.protos.Protocol.Account.class,
      responseType = org.tron.api.GrpcAPI.AccountResourceMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account,
      org.tron.api.GrpcAPI.AccountResourceMessage> getGetAccountResourceMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.Account, org.tron.api.GrpcAPI.AccountResourceMessage> getGetAccountResourceMethod;
    if ((getGetAccountResourceMethod = WalletGrpc.getGetAccountResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountResourceMethod = WalletGrpc.getGetAccountResourceMethod) == null) {
          WalletGrpc.getGetAccountResourceMethod = getGetAccountResourceMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.Account, org.tron.api.GrpcAPI.AccountResourceMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetAccountResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Account.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.AccountResourceMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountResource"))
                  .build();
          }
        }
     }
     return getGetAccountResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getGetAssetIssueByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueByName",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getGetAssetIssueByNameMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getGetAssetIssueByNameMethod;
    if ((getGetAssetIssueByNameMethod = WalletGrpc.getGetAssetIssueByNameMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByNameMethod = WalletGrpc.getGetAssetIssueByNameMethod) == null) {
          WalletGrpc.getGetAssetIssueByNameMethod = getGetAssetIssueByNameMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetAssetIssueByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueByName"))
                  .build();
          }
        }
     }
     return getGetAssetIssueByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.api.GrpcAPI.AssetIssueList> getGetAssetIssueListByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueListByName",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.api.GrpcAPI.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.api.GrpcAPI.AssetIssueList> getGetAssetIssueListByNameMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.api.GrpcAPI.AssetIssueList> getGetAssetIssueListByNameMethod;
    if ((getGetAssetIssueListByNameMethod = WalletGrpc.getGetAssetIssueListByNameMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueListByNameMethod = WalletGrpc.getGetAssetIssueListByNameMethod) == null) {
          WalletGrpc.getGetAssetIssueListByNameMethod = getGetAssetIssueListByNameMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.api.GrpcAPI.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetAssetIssueListByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.AssetIssueList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueListByName"))
                  .build();
          }
        }
     }
     return getGetAssetIssueListByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getGetAssetIssueByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueById",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getGetAssetIssueByIdMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getGetAssetIssueByIdMethod;
    if ((getGetAssetIssueByIdMethod = WalletGrpc.getGetAssetIssueByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByIdMethod = WalletGrpc.getGetAssetIssueByIdMethod) == null) {
          WalletGrpc.getGetAssetIssueByIdMethod = getGetAssetIssueByIdMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetAssetIssueById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueById"))
                  .build();
          }
        }
     }
     return getGetAssetIssueByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.protos.Protocol.Block> getGetNowBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNowBlock",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.protos.Protocol.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.protos.Protocol.Block> getGetNowBlockMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.protos.Protocol.Block> getGetNowBlockMethod;
    if ((getGetNowBlockMethod = WalletGrpc.getGetNowBlockMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNowBlockMethod = WalletGrpc.getGetNowBlockMethod) == null) {
          WalletGrpc.getGetNowBlockMethod = getGetNowBlockMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.protos.Protocol.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetNowBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Block.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNowBlock"))
                  .build();
          }
        }
     }
     return getGetNowBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.BlockExtention> getGetNowBlock2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNowBlock2",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.api.GrpcAPI.BlockExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.BlockExtention> getGetNowBlock2Method() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.BlockExtention> getGetNowBlock2Method;
    if ((getGetNowBlock2Method = WalletGrpc.getGetNowBlock2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNowBlock2Method = WalletGrpc.getGetNowBlock2Method) == null) {
          WalletGrpc.getGetNowBlock2Method = getGetNowBlock2Method = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetNowBlock2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BlockExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNowBlock2"))
                  .build();
          }
        }
     }
     return getGetNowBlock2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage,
      org.tron.protos.Protocol.Block> getGetBlockByNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum",
      requestType = org.tron.api.GrpcAPI.NumberMessage.class,
      responseType = org.tron.protos.Protocol.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage,
      org.tron.protos.Protocol.Block> getGetBlockByNumMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage, org.tron.protos.Protocol.Block> getGetBlockByNumMethod;
    if ((getGetBlockByNumMethod = WalletGrpc.getGetBlockByNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByNumMethod = WalletGrpc.getGetBlockByNumMethod) == null) {
          WalletGrpc.getGetBlockByNumMethod = getGetBlockByNumMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.NumberMessage, org.tron.protos.Protocol.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetBlockByNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Block.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByNum"))
                  .build();
          }
        }
     }
     return getGetBlockByNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage,
      org.tron.api.GrpcAPI.BlockExtention> getGetBlockByNum2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum2",
      requestType = org.tron.api.GrpcAPI.NumberMessage.class,
      responseType = org.tron.api.GrpcAPI.BlockExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage,
      org.tron.api.GrpcAPI.BlockExtention> getGetBlockByNum2Method() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage, org.tron.api.GrpcAPI.BlockExtention> getGetBlockByNum2Method;
    if ((getGetBlockByNum2Method = WalletGrpc.getGetBlockByNum2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByNum2Method = WalletGrpc.getGetBlockByNum2Method) == null) {
          WalletGrpc.getGetBlockByNum2Method = getGetBlockByNum2Method = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.NumberMessage, org.tron.api.GrpcAPI.BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetBlockByNum2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BlockExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByNum2"))
                  .build();
          }
        }
     }
     return getGetBlockByNum2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage,
      org.tron.api.GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionCountByBlockNum",
      requestType = org.tron.api.GrpcAPI.NumberMessage.class,
      responseType = org.tron.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage,
      org.tron.api.GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage, org.tron.api.GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod;
    if ((getGetTransactionCountByBlockNumMethod = WalletGrpc.getGetTransactionCountByBlockNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionCountByBlockNumMethod = WalletGrpc.getGetTransactionCountByBlockNumMethod) == null) {
          WalletGrpc.getGetTransactionCountByBlockNumMethod = getGetTransactionCountByBlockNumMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.NumberMessage, org.tron.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetTransactionCountByBlockNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionCountByBlockNum"))
                  .build();
          }
        }
     }
     return getGetTransactionCountByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.Block> getGetBlockByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockById",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.protos.Protocol.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.Block> getGetBlockByIdMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.Block> getGetBlockByIdMethod;
    if ((getGetBlockByIdMethod = WalletGrpc.getGetBlockByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByIdMethod = WalletGrpc.getGetBlockByIdMethod) == null) {
          WalletGrpc.getGetBlockByIdMethod = getGetBlockByIdMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetBlockById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Block.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockById"))
                  .build();
          }
        }
     }
     return getGetBlockByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BlockLimit,
      org.tron.api.GrpcAPI.BlockList> getGetBlockByLimitNextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLimitNext",
      requestType = org.tron.api.GrpcAPI.BlockLimit.class,
      responseType = org.tron.api.GrpcAPI.BlockList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BlockLimit,
      org.tron.api.GrpcAPI.BlockList> getGetBlockByLimitNextMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BlockLimit, org.tron.api.GrpcAPI.BlockList> getGetBlockByLimitNextMethod;
    if ((getGetBlockByLimitNextMethod = WalletGrpc.getGetBlockByLimitNextMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLimitNextMethod = WalletGrpc.getGetBlockByLimitNextMethod) == null) {
          WalletGrpc.getGetBlockByLimitNextMethod = getGetBlockByLimitNextMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BlockLimit, org.tron.api.GrpcAPI.BlockList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetBlockByLimitNext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BlockLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BlockList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLimitNext"))
                  .build();
          }
        }
     }
     return getGetBlockByLimitNextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BlockLimit,
      org.tron.api.GrpcAPI.BlockListExtention> getGetBlockByLimitNext2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLimitNext2",
      requestType = org.tron.api.GrpcAPI.BlockLimit.class,
      responseType = org.tron.api.GrpcAPI.BlockListExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BlockLimit,
      org.tron.api.GrpcAPI.BlockListExtention> getGetBlockByLimitNext2Method() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BlockLimit, org.tron.api.GrpcAPI.BlockListExtention> getGetBlockByLimitNext2Method;
    if ((getGetBlockByLimitNext2Method = WalletGrpc.getGetBlockByLimitNext2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLimitNext2Method = WalletGrpc.getGetBlockByLimitNext2Method) == null) {
          WalletGrpc.getGetBlockByLimitNext2Method = getGetBlockByLimitNext2Method = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BlockLimit, org.tron.api.GrpcAPI.BlockListExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetBlockByLimitNext2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BlockLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BlockListExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLimitNext2"))
                  .build();
          }
        }
     }
     return getGetBlockByLimitNext2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage,
      org.tron.api.GrpcAPI.BlockList> getGetBlockByLatestNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLatestNum",
      requestType = org.tron.api.GrpcAPI.NumberMessage.class,
      responseType = org.tron.api.GrpcAPI.BlockList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage,
      org.tron.api.GrpcAPI.BlockList> getGetBlockByLatestNumMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage, org.tron.api.GrpcAPI.BlockList> getGetBlockByLatestNumMethod;
    if ((getGetBlockByLatestNumMethod = WalletGrpc.getGetBlockByLatestNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLatestNumMethod = WalletGrpc.getGetBlockByLatestNumMethod) == null) {
          WalletGrpc.getGetBlockByLatestNumMethod = getGetBlockByLatestNumMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.NumberMessage, org.tron.api.GrpcAPI.BlockList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetBlockByLatestNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BlockList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLatestNum"))
                  .build();
          }
        }
     }
     return getGetBlockByLatestNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage,
      org.tron.api.GrpcAPI.BlockListExtention> getGetBlockByLatestNum2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLatestNum2",
      requestType = org.tron.api.GrpcAPI.NumberMessage.class,
      responseType = org.tron.api.GrpcAPI.BlockListExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage,
      org.tron.api.GrpcAPI.BlockListExtention> getGetBlockByLatestNum2Method() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage, org.tron.api.GrpcAPI.BlockListExtention> getGetBlockByLatestNum2Method;
    if ((getGetBlockByLatestNum2Method = WalletGrpc.getGetBlockByLatestNum2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLatestNum2Method = WalletGrpc.getGetBlockByLatestNum2Method) == null) {
          WalletGrpc.getGetBlockByLatestNum2Method = getGetBlockByLatestNum2Method = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.NumberMessage, org.tron.api.GrpcAPI.BlockListExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetBlockByLatestNum2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BlockListExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLatestNum2"))
                  .build();
          }
        }
     }
     return getGetBlockByLatestNum2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.Transaction> getGetTransactionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionById",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.Transaction> getGetTransactionByIdMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.Transaction> getGetTransactionByIdMethod;
    if ((getGetTransactionByIdMethod = WalletGrpc.getGetTransactionByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionByIdMethod = WalletGrpc.getGetTransactionByIdMethod) == null) {
          WalletGrpc.getGetTransactionByIdMethod = getGetTransactionByIdMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetTransactionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionById"))
                  .build();
          }
        }
     }
     return getGetTransactionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.CreateSmartContract,
      org.tron.api.GrpcAPI.TransactionExtention> getDeployContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployContract",
      requestType = org.tron.protos.contract.SmartContractOuterClass.CreateSmartContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.CreateSmartContract,
      org.tron.api.GrpcAPI.TransactionExtention> getDeployContractMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.CreateSmartContract, org.tron.api.GrpcAPI.TransactionExtention> getDeployContractMethod;
    if ((getDeployContractMethod = WalletGrpc.getDeployContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getDeployContractMethod = WalletGrpc.getDeployContractMethod) == null) {
          WalletGrpc.getDeployContractMethod = getDeployContractMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.SmartContractOuterClass.CreateSmartContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "DeployContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.SmartContractOuterClass.CreateSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("DeployContract"))
                  .build();
          }
        }
     }
     return getDeployContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.contract.SmartContractOuterClass.SmartContract> getGetContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContract",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.protos.contract.SmartContractOuterClass.SmartContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.contract.SmartContractOuterClass.SmartContract> getGetContractMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.contract.SmartContractOuterClass.SmartContract> getGetContractMethod;
    if ((getGetContractMethod = WalletGrpc.getGetContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetContractMethod = WalletGrpc.getGetContractMethod) == null) {
          WalletGrpc.getGetContractMethod = getGetContractMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.contract.SmartContractOuterClass.SmartContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.SmartContractOuterClass.SmartContract.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetContract"))
                  .build();
          }
        }
     }
     return getGetContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.contract.SmartContractOuterClass.SmartContractDataWrapper> getGetContractInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContractInfo",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.protos.contract.SmartContractOuterClass.SmartContractDataWrapper.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.contract.SmartContractOuterClass.SmartContractDataWrapper> getGetContractInfoMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.contract.SmartContractOuterClass.SmartContractDataWrapper> getGetContractInfoMethod;
    if ((getGetContractInfoMethod = WalletGrpc.getGetContractInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetContractInfoMethod = WalletGrpc.getGetContractInfoMethod) == null) {
          WalletGrpc.getGetContractInfoMethod = getGetContractInfoMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.contract.SmartContractOuterClass.SmartContractDataWrapper>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetContractInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.SmartContractOuterClass.SmartContractDataWrapper.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetContractInfo"))
                  .build();
          }
        }
     }
     return getGetContractInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract,
      org.tron.api.GrpcAPI.TransactionExtention> getTriggerContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerContract",
      requestType = org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract,
      org.tron.api.GrpcAPI.TransactionExtention> getTriggerContractMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract, org.tron.api.GrpcAPI.TransactionExtention> getTriggerContractMethod;
    if ((getTriggerContractMethod = WalletGrpc.getTriggerContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerContractMethod = WalletGrpc.getTriggerContractMethod) == null) {
          WalletGrpc.getTriggerContractMethod = getTriggerContractMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "TriggerContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerContract"))
                  .build();
          }
        }
     }
     return getTriggerContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract,
      org.tron.api.GrpcAPI.TransactionExtention> getTriggerConstantContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerConstantContract",
      requestType = org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract,
      org.tron.api.GrpcAPI.TransactionExtention> getTriggerConstantContractMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract, org.tron.api.GrpcAPI.TransactionExtention> getTriggerConstantContractMethod;
    if ((getTriggerConstantContractMethod = WalletGrpc.getTriggerConstantContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerConstantContractMethod = WalletGrpc.getTriggerConstantContractMethod) == null) {
          WalletGrpc.getTriggerConstantContractMethod = getTriggerConstantContractMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "TriggerConstantContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerConstantContract"))
                  .build();
          }
        }
     }
     return getTriggerConstantContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.ClearABIContract,
      org.tron.api.GrpcAPI.TransactionExtention> getClearContractABIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearContractABI",
      requestType = org.tron.protos.contract.SmartContractOuterClass.ClearABIContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.ClearABIContract,
      org.tron.api.GrpcAPI.TransactionExtention> getClearContractABIMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.SmartContractOuterClass.ClearABIContract, org.tron.api.GrpcAPI.TransactionExtention> getClearContractABIMethod;
    if ((getClearContractABIMethod = WalletGrpc.getClearContractABIMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getClearContractABIMethod = WalletGrpc.getClearContractABIMethod) == null) {
          WalletGrpc.getClearContractABIMethod = getClearContractABIMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.SmartContractOuterClass.ClearABIContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ClearContractABI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.SmartContractOuterClass.ClearABIContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ClearContractABI"))
                  .build();
          }
        }
     }
     return getClearContractABIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.WitnessList> getListWitnessesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWitnesses",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.api.GrpcAPI.WitnessList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.WitnessList> getListWitnessesMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.WitnessList> getListWitnessesMethod;
    if ((getListWitnessesMethod = WalletGrpc.getListWitnessesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListWitnessesMethod = WalletGrpc.getListWitnessesMethod) == null) {
          WalletGrpc.getListWitnessesMethod = getListWitnessesMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.WitnessList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ListWitnesses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.WitnessList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListWitnesses"))
                  .build();
          }
        }
     }
     return getListWitnessesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.DelegatedResourceMessage,
      org.tron.api.GrpcAPI.DelegatedResourceList> getGetDelegatedResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResource",
      requestType = org.tron.api.GrpcAPI.DelegatedResourceMessage.class,
      responseType = org.tron.api.GrpcAPI.DelegatedResourceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.DelegatedResourceMessage,
      org.tron.api.GrpcAPI.DelegatedResourceList> getGetDelegatedResourceMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.DelegatedResourceMessage, org.tron.api.GrpcAPI.DelegatedResourceList> getGetDelegatedResourceMethod;
    if ((getGetDelegatedResourceMethod = WalletGrpc.getGetDelegatedResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceMethod = WalletGrpc.getGetDelegatedResourceMethod) == null) {
          WalletGrpc.getGetDelegatedResourceMethod = getGetDelegatedResourceMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.DelegatedResourceMessage, org.tron.api.GrpcAPI.DelegatedResourceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetDelegatedResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.DelegatedResourceMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.DelegatedResourceList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResource"))
                  .build();
          }
        }
     }
     return getGetDelegatedResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResourceAccountIndex",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.protos.Protocol.DelegatedResourceAccountIndex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod;
    if ((getGetDelegatedResourceAccountIndexMethod = WalletGrpc.getGetDelegatedResourceAccountIndexMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceAccountIndexMethod = WalletGrpc.getGetDelegatedResourceAccountIndexMethod) == null) {
          WalletGrpc.getGetDelegatedResourceAccountIndexMethod = getGetDelegatedResourceAccountIndexMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.DelegatedResourceAccountIndex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetDelegatedResourceAccountIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.DelegatedResourceAccountIndex.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResourceAccountIndex"))
                  .build();
          }
        }
     }
     return getGetDelegatedResourceAccountIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.ProposalList> getListProposalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProposals",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.api.GrpcAPI.ProposalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.ProposalList> getListProposalsMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.ProposalList> getListProposalsMethod;
    if ((getListProposalsMethod = WalletGrpc.getListProposalsMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListProposalsMethod = WalletGrpc.getListProposalsMethod) == null) {
          WalletGrpc.getListProposalsMethod = getListProposalsMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.ProposalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ListProposals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.ProposalList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListProposals"))
                  .build();
          }
        }
     }
     return getListProposalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PaginatedMessage,
      org.tron.api.GrpcAPI.ProposalList> getGetPaginatedProposalListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedProposalList",
      requestType = org.tron.api.GrpcAPI.PaginatedMessage.class,
      responseType = org.tron.api.GrpcAPI.ProposalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PaginatedMessage,
      org.tron.api.GrpcAPI.ProposalList> getGetPaginatedProposalListMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PaginatedMessage, org.tron.api.GrpcAPI.ProposalList> getGetPaginatedProposalListMethod;
    if ((getGetPaginatedProposalListMethod = WalletGrpc.getGetPaginatedProposalListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedProposalListMethod = WalletGrpc.getGetPaginatedProposalListMethod) == null) {
          WalletGrpc.getGetPaginatedProposalListMethod = getGetPaginatedProposalListMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.PaginatedMessage, org.tron.api.GrpcAPI.ProposalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetPaginatedProposalList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.ProposalList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedProposalList"))
                  .build();
          }
        }
     }
     return getGetPaginatedProposalListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.Proposal> getGetProposalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProposalById",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.protos.Protocol.Proposal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.Proposal> getGetProposalByIdMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.Proposal> getGetProposalByIdMethod;
    if ((getGetProposalByIdMethod = WalletGrpc.getGetProposalByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetProposalByIdMethod = WalletGrpc.getGetProposalByIdMethod) == null) {
          WalletGrpc.getGetProposalByIdMethod = getGetProposalByIdMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.Proposal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetProposalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Proposal.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetProposalById"))
                  .build();
          }
        }
     }
     return getGetProposalByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.ExchangeList> getListExchangesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExchanges",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.api.GrpcAPI.ExchangeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.ExchangeList> getListExchangesMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.ExchangeList> getListExchangesMethod;
    if ((getListExchangesMethod = WalletGrpc.getListExchangesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListExchangesMethod = WalletGrpc.getListExchangesMethod) == null) {
          WalletGrpc.getListExchangesMethod = getListExchangesMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.ExchangeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ListExchanges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.ExchangeList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListExchanges"))
                  .build();
          }
        }
     }
     return getListExchangesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PaginatedMessage,
      org.tron.api.GrpcAPI.ExchangeList> getGetPaginatedExchangeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedExchangeList",
      requestType = org.tron.api.GrpcAPI.PaginatedMessage.class,
      responseType = org.tron.api.GrpcAPI.ExchangeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PaginatedMessage,
      org.tron.api.GrpcAPI.ExchangeList> getGetPaginatedExchangeListMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PaginatedMessage, org.tron.api.GrpcAPI.ExchangeList> getGetPaginatedExchangeListMethod;
    if ((getGetPaginatedExchangeListMethod = WalletGrpc.getGetPaginatedExchangeListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedExchangeListMethod = WalletGrpc.getGetPaginatedExchangeListMethod) == null) {
          WalletGrpc.getGetPaginatedExchangeListMethod = getGetPaginatedExchangeListMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.PaginatedMessage, org.tron.api.GrpcAPI.ExchangeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetPaginatedExchangeList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.ExchangeList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedExchangeList"))
                  .build();
          }
        }
     }
     return getGetPaginatedExchangeListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.Exchange> getGetExchangeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExchangeById",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.protos.Protocol.Exchange.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.Exchange> getGetExchangeByIdMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.Exchange> getGetExchangeByIdMethod;
    if ((getGetExchangeByIdMethod = WalletGrpc.getGetExchangeByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetExchangeByIdMethod = WalletGrpc.getGetExchangeByIdMethod) == null) {
          WalletGrpc.getGetExchangeByIdMethod = getGetExchangeByIdMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.Exchange>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetExchangeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Exchange.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetExchangeById"))
                  .build();
          }
        }
     }
     return getGetExchangeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.protos.Protocol.ChainParameters> getGetChainParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChainParameters",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.protos.Protocol.ChainParameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.protos.Protocol.ChainParameters> getGetChainParametersMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.protos.Protocol.ChainParameters> getGetChainParametersMethod;
    if ((getGetChainParametersMethod = WalletGrpc.getGetChainParametersMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetChainParametersMethod = WalletGrpc.getGetChainParametersMethod) == null) {
          WalletGrpc.getGetChainParametersMethod = getGetChainParametersMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.protos.Protocol.ChainParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetChainParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.ChainParameters.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetChainParameters"))
                  .build();
          }
        }
     }
     return getGetChainParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.AssetIssueList> getGetAssetIssueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueList",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.api.GrpcAPI.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.AssetIssueList> getGetAssetIssueListMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.AssetIssueList> getGetAssetIssueListMethod;
    if ((getGetAssetIssueListMethod = WalletGrpc.getGetAssetIssueListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueListMethod = WalletGrpc.getGetAssetIssueListMethod) == null) {
          WalletGrpc.getGetAssetIssueListMethod = getGetAssetIssueListMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetAssetIssueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.AssetIssueList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueList"))
                  .build();
          }
        }
     }
     return getGetAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PaginatedMessage,
      org.tron.api.GrpcAPI.AssetIssueList> getGetPaginatedAssetIssueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedAssetIssueList",
      requestType = org.tron.api.GrpcAPI.PaginatedMessage.class,
      responseType = org.tron.api.GrpcAPI.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PaginatedMessage,
      org.tron.api.GrpcAPI.AssetIssueList> getGetPaginatedAssetIssueListMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PaginatedMessage, org.tron.api.GrpcAPI.AssetIssueList> getGetPaginatedAssetIssueListMethod;
    if ((getGetPaginatedAssetIssueListMethod = WalletGrpc.getGetPaginatedAssetIssueListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedAssetIssueListMethod = WalletGrpc.getGetPaginatedAssetIssueListMethod) == null) {
          WalletGrpc.getGetPaginatedAssetIssueListMethod = getGetPaginatedAssetIssueListMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.PaginatedMessage, org.tron.api.GrpcAPI.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetPaginatedAssetIssueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.AssetIssueList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedAssetIssueList"))
                  .build();
          }
        }
     }
     return getGetPaginatedAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.NumberMessage> getTotalTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalTransaction",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.NumberMessage> getTotalTransactionMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.NumberMessage> getTotalTransactionMethod;
    if ((getTotalTransactionMethod = WalletGrpc.getTotalTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTotalTransactionMethod = WalletGrpc.getTotalTransactionMethod) == null) {
          WalletGrpc.getTotalTransactionMethod = getTotalTransactionMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "TotalTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TotalTransaction"))
                  .build();
          }
        }
     }
     return getTotalTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNextMaintenanceTime",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod;
    if ((getGetNextMaintenanceTimeMethod = WalletGrpc.getGetNextMaintenanceTimeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNextMaintenanceTimeMethod = WalletGrpc.getGetNextMaintenanceTimeMethod) == null) {
          WalletGrpc.getGetNextMaintenanceTimeMethod = getGetNextMaintenanceTimeMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetNextMaintenanceTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNextMaintenanceTime"))
                  .build();
          }
        }
     }
     return getGetNextMaintenanceTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.TransactionSign,
      org.tron.protos.Protocol.Transaction> getGetTransactionSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSign",
      requestType = org.tron.protos.Protocol.TransactionSign.class,
      responseType = org.tron.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.TransactionSign,
      org.tron.protos.Protocol.Transaction> getGetTransactionSignMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.TransactionSign, org.tron.protos.Protocol.Transaction> getGetTransactionSignMethod;
    if ((getGetTransactionSignMethod = WalletGrpc.getGetTransactionSignMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSignMethod = WalletGrpc.getGetTransactionSignMethod) == null) {
          WalletGrpc.getGetTransactionSignMethod = getGetTransactionSignMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.TransactionSign, org.tron.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetTransactionSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSign"))
                  .build();
          }
        }
     }
     return getGetTransactionSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.TransactionSign,
      org.tron.api.GrpcAPI.TransactionExtention> getGetTransactionSign2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSign2",
      requestType = org.tron.protos.Protocol.TransactionSign.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.TransactionSign,
      org.tron.api.GrpcAPI.TransactionExtention> getGetTransactionSign2Method() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.TransactionSign, org.tron.api.GrpcAPI.TransactionExtention> getGetTransactionSign2Method;
    if ((getGetTransactionSign2Method = WalletGrpc.getGetTransactionSign2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSign2Method = WalletGrpc.getGetTransactionSign2Method) == null) {
          WalletGrpc.getGetTransactionSign2Method = getGetTransactionSign2Method = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.TransactionSign, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetTransactionSign2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSign2"))
                  .build();
          }
        }
     }
     return getGetTransactionSign2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.api.GrpcAPI.BytesMessage> getCreateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAddress",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.api.GrpcAPI.BytesMessage> getCreateAddressMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.api.GrpcAPI.BytesMessage> getCreateAddressMethod;
    if ((getCreateAddressMethod = WalletGrpc.getCreateAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAddressMethod = WalletGrpc.getCreateAddressMethod) == null) {
          WalletGrpc.getCreateAddressMethod = getCreateAddressMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAddress"))
                  .build();
          }
        }
     }
     return getCreateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EasyTransferAssetMessage,
      org.tron.api.GrpcAPI.EasyTransferResponse> getEasyTransferAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferAsset",
      requestType = org.tron.api.GrpcAPI.EasyTransferAssetMessage.class,
      responseType = org.tron.api.GrpcAPI.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EasyTransferAssetMessage,
      org.tron.api.GrpcAPI.EasyTransferResponse> getEasyTransferAssetMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EasyTransferAssetMessage, org.tron.api.GrpcAPI.EasyTransferResponse> getEasyTransferAssetMethod;
    if ((getEasyTransferAssetMethod = WalletGrpc.getEasyTransferAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferAssetMethod = WalletGrpc.getEasyTransferAssetMethod) == null) {
          WalletGrpc.getEasyTransferAssetMethod = getEasyTransferAssetMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EasyTransferAssetMessage, org.tron.api.GrpcAPI.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "EasyTransferAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EasyTransferAssetMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EasyTransferResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferAsset"))
                  .build();
          }
        }
     }
     return getEasyTransferAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EasyTransferAssetByPrivateMessage,
      org.tron.api.GrpcAPI.EasyTransferResponse> getEasyTransferAssetByPrivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferAssetByPrivate",
      requestType = org.tron.api.GrpcAPI.EasyTransferAssetByPrivateMessage.class,
      responseType = org.tron.api.GrpcAPI.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EasyTransferAssetByPrivateMessage,
      org.tron.api.GrpcAPI.EasyTransferResponse> getEasyTransferAssetByPrivateMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EasyTransferAssetByPrivateMessage, org.tron.api.GrpcAPI.EasyTransferResponse> getEasyTransferAssetByPrivateMethod;
    if ((getEasyTransferAssetByPrivateMethod = WalletGrpc.getEasyTransferAssetByPrivateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferAssetByPrivateMethod = WalletGrpc.getEasyTransferAssetByPrivateMethod) == null) {
          WalletGrpc.getEasyTransferAssetByPrivateMethod = getEasyTransferAssetByPrivateMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EasyTransferAssetByPrivateMessage, org.tron.api.GrpcAPI.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "EasyTransferAssetByPrivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EasyTransferAssetByPrivateMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EasyTransferResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferAssetByPrivate"))
                  .build();
          }
        }
     }
     return getEasyTransferAssetByPrivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EasyTransferMessage,
      org.tron.api.GrpcAPI.EasyTransferResponse> getEasyTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransfer",
      requestType = org.tron.api.GrpcAPI.EasyTransferMessage.class,
      responseType = org.tron.api.GrpcAPI.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EasyTransferMessage,
      org.tron.api.GrpcAPI.EasyTransferResponse> getEasyTransferMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EasyTransferMessage, org.tron.api.GrpcAPI.EasyTransferResponse> getEasyTransferMethod;
    if ((getEasyTransferMethod = WalletGrpc.getEasyTransferMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferMethod = WalletGrpc.getEasyTransferMethod) == null) {
          WalletGrpc.getEasyTransferMethod = getEasyTransferMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EasyTransferMessage, org.tron.api.GrpcAPI.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "EasyTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EasyTransferMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EasyTransferResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransfer"))
                  .build();
          }
        }
     }
     return getEasyTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EasyTransferByPrivateMessage,
      org.tron.api.GrpcAPI.EasyTransferResponse> getEasyTransferByPrivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferByPrivate",
      requestType = org.tron.api.GrpcAPI.EasyTransferByPrivateMessage.class,
      responseType = org.tron.api.GrpcAPI.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EasyTransferByPrivateMessage,
      org.tron.api.GrpcAPI.EasyTransferResponse> getEasyTransferByPrivateMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EasyTransferByPrivateMessage, org.tron.api.GrpcAPI.EasyTransferResponse> getEasyTransferByPrivateMethod;
    if ((getEasyTransferByPrivateMethod = WalletGrpc.getEasyTransferByPrivateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferByPrivateMethod = WalletGrpc.getEasyTransferByPrivateMethod) == null) {
          WalletGrpc.getEasyTransferByPrivateMethod = getEasyTransferByPrivateMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EasyTransferByPrivateMessage, org.tron.api.GrpcAPI.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "EasyTransferByPrivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EasyTransferByPrivateMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EasyTransferResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferByPrivate"))
                  .build();
          }
        }
     }
     return getEasyTransferByPrivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.AddressPrKeyPairMessage> getGenerateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAddress",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.api.GrpcAPI.AddressPrKeyPairMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.AddressPrKeyPairMessage> getGenerateAddressMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.AddressPrKeyPairMessage> getGenerateAddressMethod;
    if ((getGenerateAddressMethod = WalletGrpc.getGenerateAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGenerateAddressMethod = WalletGrpc.getGenerateAddressMethod) == null) {
          WalletGrpc.getGenerateAddressMethod = getGenerateAddressMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.AddressPrKeyPairMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GenerateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.AddressPrKeyPairMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GenerateAddress"))
                  .build();
          }
        }
     }
     return getGenerateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.TransactionInfo> getGetTransactionInfoByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionInfoById",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.protos.Protocol.TransactionInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.protos.Protocol.TransactionInfo> getGetTransactionInfoByIdMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.TransactionInfo> getGetTransactionInfoByIdMethod;
    if ((getGetTransactionInfoByIdMethod = WalletGrpc.getGetTransactionInfoByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionInfoByIdMethod = WalletGrpc.getGetTransactionInfoByIdMethod) == null) {
          WalletGrpc.getGetTransactionInfoByIdMethod = getGetTransactionInfoByIdMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.protos.Protocol.TransactionInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetTransactionInfoById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.TransactionInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionInfoById"))
                  .build();
          }
        }
     }
     return getGetTransactionInfoByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountPermissionUpdateContract,
      org.tron.api.GrpcAPI.TransactionExtention> getAccountPermissionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountPermissionUpdate",
      requestType = org.tron.protos.contract.AccountContract.AccountPermissionUpdateContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountPermissionUpdateContract,
      org.tron.api.GrpcAPI.TransactionExtention> getAccountPermissionUpdateMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.AccountContract.AccountPermissionUpdateContract, org.tron.api.GrpcAPI.TransactionExtention> getAccountPermissionUpdateMethod;
    if ((getAccountPermissionUpdateMethod = WalletGrpc.getAccountPermissionUpdateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getAccountPermissionUpdateMethod = WalletGrpc.getAccountPermissionUpdateMethod) == null) {
          WalletGrpc.getAccountPermissionUpdateMethod = getAccountPermissionUpdateMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.AccountContract.AccountPermissionUpdateContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "AccountPermissionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.AccountContract.AccountPermissionUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("AccountPermissionUpdate"))
                  .build();
          }
        }
     }
     return getAccountPermissionUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.TransactionSign,
      org.tron.api.GrpcAPI.TransactionExtention> getAddSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSign",
      requestType = org.tron.protos.Protocol.TransactionSign.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.TransactionSign,
      org.tron.api.GrpcAPI.TransactionExtention> getAddSignMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.TransactionSign, org.tron.api.GrpcAPI.TransactionExtention> getAddSignMethod;
    if ((getAddSignMethod = WalletGrpc.getAddSignMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getAddSignMethod = WalletGrpc.getAddSignMethod) == null) {
          WalletGrpc.getAddSignMethod = getAddSignMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.TransactionSign, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "AddSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("AddSign"))
                  .build();
          }
        }
     }
     return getAddSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction,
      org.tron.api.GrpcAPI.TransactionSignWeight> getGetTransactionSignWeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSignWeight",
      requestType = org.tron.protos.Protocol.Transaction.class,
      responseType = org.tron.api.GrpcAPI.TransactionSignWeight.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction,
      org.tron.api.GrpcAPI.TransactionSignWeight> getGetTransactionSignWeightMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction, org.tron.api.GrpcAPI.TransactionSignWeight> getGetTransactionSignWeightMethod;
    if ((getGetTransactionSignWeightMethod = WalletGrpc.getGetTransactionSignWeightMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSignWeightMethod = WalletGrpc.getGetTransactionSignWeightMethod) == null) {
          WalletGrpc.getGetTransactionSignWeightMethod = getGetTransactionSignWeightMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.Transaction, org.tron.api.GrpcAPI.TransactionSignWeight>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetTransactionSignWeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionSignWeight.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSignWeight"))
                  .build();
          }
        }
     }
     return getGetTransactionSignWeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction,
      org.tron.api.GrpcAPI.TransactionApprovedList> getGetTransactionApprovedListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionApprovedList",
      requestType = org.tron.protos.Protocol.Transaction.class,
      responseType = org.tron.api.GrpcAPI.TransactionApprovedList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction,
      org.tron.api.GrpcAPI.TransactionApprovedList> getGetTransactionApprovedListMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction, org.tron.api.GrpcAPI.TransactionApprovedList> getGetTransactionApprovedListMethod;
    if ((getGetTransactionApprovedListMethod = WalletGrpc.getGetTransactionApprovedListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionApprovedListMethod = WalletGrpc.getGetTransactionApprovedListMethod) == null) {
          WalletGrpc.getGetTransactionApprovedListMethod = getGetTransactionApprovedListMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.Transaction, org.tron.api.GrpcAPI.TransactionApprovedList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetTransactionApprovedList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionApprovedList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionApprovedList"))
                  .build();
          }
        }
     }
     return getGetTransactionApprovedListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.protos.Protocol.NodeInfo> getGetNodeInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNodeInfo",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.protos.Protocol.NodeInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.protos.Protocol.NodeInfo> getGetNodeInfoMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.protos.Protocol.NodeInfo> getGetNodeInfoMethod;
    if ((getGetNodeInfoMethod = WalletGrpc.getGetNodeInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNodeInfoMethod = WalletGrpc.getGetNodeInfoMethod) == null) {
          WalletGrpc.getGetNodeInfoMethod = getGetNodeInfoMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.protos.Protocol.NodeInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetNodeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.NodeInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNodeInfo"))
                  .build();
          }
        }
     }
     return getGetNodeInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRewardInfo",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod;
    if ((getGetRewardInfoMethod = WalletGrpc.getGetRewardInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetRewardInfoMethod = WalletGrpc.getGetRewardInfoMethod) == null) {
          WalletGrpc.getGetRewardInfoMethod = getGetRewardInfoMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetRewardInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetRewardInfo"))
                  .build();
          }
        }
     }
     return getGetRewardInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBrokerageInfo",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod;
    if ((getGetBrokerageInfoMethod = WalletGrpc.getGetBrokerageInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBrokerageInfoMethod = WalletGrpc.getGetBrokerageInfoMethod) == null) {
          WalletGrpc.getGetBrokerageInfoMethod = getGetBrokerageInfoMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetBrokerageInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBrokerageInfo"))
                  .build();
          }
        }
     }
     return getGetBrokerageInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.StorageContract.UpdateBrokerageContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUpdateBrokerageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBrokerage",
      requestType = org.tron.protos.contract.StorageContract.UpdateBrokerageContract.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.StorageContract.UpdateBrokerageContract,
      org.tron.api.GrpcAPI.TransactionExtention> getUpdateBrokerageMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.StorageContract.UpdateBrokerageContract, org.tron.api.GrpcAPI.TransactionExtention> getUpdateBrokerageMethod;
    if ((getUpdateBrokerageMethod = WalletGrpc.getUpdateBrokerageMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateBrokerageMethod = WalletGrpc.getUpdateBrokerageMethod) == null) {
          WalletGrpc.getUpdateBrokerageMethod = getUpdateBrokerageMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.StorageContract.UpdateBrokerageContract, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "UpdateBrokerage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.StorageContract.UpdateBrokerageContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateBrokerage"))
                  .build();
          }
        }
     }
     return getUpdateBrokerageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PrivateParameters,
      org.tron.api.GrpcAPI.TransactionExtention> getCreateShieldedTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedTransaction",
      requestType = org.tron.api.GrpcAPI.PrivateParameters.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PrivateParameters,
      org.tron.api.GrpcAPI.TransactionExtention> getCreateShieldedTransactionMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PrivateParameters, org.tron.api.GrpcAPI.TransactionExtention> getCreateShieldedTransactionMethod;
    if ((getCreateShieldedTransactionMethod = WalletGrpc.getCreateShieldedTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedTransactionMethod = WalletGrpc.getCreateShieldedTransactionMethod) == null) {
          WalletGrpc.getCreateShieldedTransactionMethod = getCreateShieldedTransactionMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.PrivateParameters, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateShieldedTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.PrivateParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedTransaction"))
                  .build();
          }
        }
     }
     return getCreateShieldedTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.contract.ShieldContract.OutputPointInfo,
      org.tron.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo> getGetMerkleTreeVoucherInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMerkleTreeVoucherInfo",
      requestType = org.tron.protos.contract.ShieldContract.OutputPointInfo.class,
      responseType = org.tron.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.contract.ShieldContract.OutputPointInfo,
      org.tron.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo> getGetMerkleTreeVoucherInfoMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.contract.ShieldContract.OutputPointInfo, org.tron.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo> getGetMerkleTreeVoucherInfoMethod;
    if ((getGetMerkleTreeVoucherInfoMethod = WalletGrpc.getGetMerkleTreeVoucherInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMerkleTreeVoucherInfoMethod = WalletGrpc.getGetMerkleTreeVoucherInfoMethod) == null) {
          WalletGrpc.getGetMerkleTreeVoucherInfoMethod = getGetMerkleTreeVoucherInfoMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.contract.ShieldContract.OutputPointInfo, org.tron.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetMerkleTreeVoucherInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.ShieldContract.OutputPointInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMerkleTreeVoucherInfo"))
                  .build();
          }
        }
     }
     return getGetMerkleTreeVoucherInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.IvkDecryptParameters,
      org.tron.api.GrpcAPI.DecryptNotes> getScanNoteByIvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanNoteByIvk",
      requestType = org.tron.api.GrpcAPI.IvkDecryptParameters.class,
      responseType = org.tron.api.GrpcAPI.DecryptNotes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.IvkDecryptParameters,
      org.tron.api.GrpcAPI.DecryptNotes> getScanNoteByIvkMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.IvkDecryptParameters, org.tron.api.GrpcAPI.DecryptNotes> getScanNoteByIvkMethod;
    if ((getScanNoteByIvkMethod = WalletGrpc.getScanNoteByIvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanNoteByIvkMethod = WalletGrpc.getScanNoteByIvkMethod) == null) {
          WalletGrpc.getScanNoteByIvkMethod = getScanNoteByIvkMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.IvkDecryptParameters, org.tron.api.GrpcAPI.DecryptNotes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ScanNoteByIvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.IvkDecryptParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.DecryptNotes.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanNoteByIvk"))
                  .build();
          }
        }
     }
     return getScanNoteByIvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.IvkDecryptAndMarkParameters,
      org.tron.api.GrpcAPI.DecryptNotesMarked> getScanAndMarkNoteByIvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanAndMarkNoteByIvk",
      requestType = org.tron.api.GrpcAPI.IvkDecryptAndMarkParameters.class,
      responseType = org.tron.api.GrpcAPI.DecryptNotesMarked.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.IvkDecryptAndMarkParameters,
      org.tron.api.GrpcAPI.DecryptNotesMarked> getScanAndMarkNoteByIvkMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.IvkDecryptAndMarkParameters, org.tron.api.GrpcAPI.DecryptNotesMarked> getScanAndMarkNoteByIvkMethod;
    if ((getScanAndMarkNoteByIvkMethod = WalletGrpc.getScanAndMarkNoteByIvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanAndMarkNoteByIvkMethod = WalletGrpc.getScanAndMarkNoteByIvkMethod) == null) {
          WalletGrpc.getScanAndMarkNoteByIvkMethod = getScanAndMarkNoteByIvkMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.IvkDecryptAndMarkParameters, org.tron.api.GrpcAPI.DecryptNotesMarked>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ScanAndMarkNoteByIvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.IvkDecryptAndMarkParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.DecryptNotesMarked.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanAndMarkNoteByIvk"))
                  .build();
          }
        }
     }
     return getScanAndMarkNoteByIvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.OvkDecryptParameters,
      org.tron.api.GrpcAPI.DecryptNotes> getScanNoteByOvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanNoteByOvk",
      requestType = org.tron.api.GrpcAPI.OvkDecryptParameters.class,
      responseType = org.tron.api.GrpcAPI.DecryptNotes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.OvkDecryptParameters,
      org.tron.api.GrpcAPI.DecryptNotes> getScanNoteByOvkMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.OvkDecryptParameters, org.tron.api.GrpcAPI.DecryptNotes> getScanNoteByOvkMethod;
    if ((getScanNoteByOvkMethod = WalletGrpc.getScanNoteByOvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanNoteByOvkMethod = WalletGrpc.getScanNoteByOvkMethod) == null) {
          WalletGrpc.getScanNoteByOvkMethod = getScanNoteByOvkMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.OvkDecryptParameters, org.tron.api.GrpcAPI.DecryptNotes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ScanNoteByOvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.OvkDecryptParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.DecryptNotes.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanNoteByOvk"))
                  .build();
          }
        }
     }
     return getScanNoteByOvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.BytesMessage> getGetSpendingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpendingKey",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.BytesMessage> getGetSpendingKeyMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.BytesMessage> getGetSpendingKeyMethod;
    if ((getGetSpendingKeyMethod = WalletGrpc.getGetSpendingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetSpendingKeyMethod = WalletGrpc.getGetSpendingKeyMethod) == null) {
          WalletGrpc.getGetSpendingKeyMethod = getGetSpendingKeyMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetSpendingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetSpendingKey"))
                  .build();
          }
        }
     }
     return getGetSpendingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.api.GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExpandedSpendingKey",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.api.GrpcAPI.ExpandedSpendingKeyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.api.GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.api.GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod;
    if ((getGetExpandedSpendingKeyMethod = WalletGrpc.getGetExpandedSpendingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetExpandedSpendingKeyMethod = WalletGrpc.getGetExpandedSpendingKeyMethod) == null) {
          WalletGrpc.getGetExpandedSpendingKeyMethod = getGetExpandedSpendingKeyMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.api.GrpcAPI.ExpandedSpendingKeyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetExpandedSpendingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.ExpandedSpendingKeyMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetExpandedSpendingKey"))
                  .build();
          }
        }
     }
     return getGetExpandedSpendingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.api.GrpcAPI.BytesMessage> getGetAkFromAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAkFromAsk",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.api.GrpcAPI.BytesMessage> getGetAkFromAskMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.api.GrpcAPI.BytesMessage> getGetAkFromAskMethod;
    if ((getGetAkFromAskMethod = WalletGrpc.getGetAkFromAskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAkFromAskMethod = WalletGrpc.getGetAkFromAskMethod) == null) {
          WalletGrpc.getGetAkFromAskMethod = getGetAkFromAskMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetAkFromAsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAkFromAsk"))
                  .build();
          }
        }
     }
     return getGetAkFromAskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.api.GrpcAPI.BytesMessage> getGetNkFromNskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNkFromNsk",
      requestType = org.tron.api.GrpcAPI.BytesMessage.class,
      responseType = org.tron.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage,
      org.tron.api.GrpcAPI.BytesMessage> getGetNkFromNskMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.BytesMessage, org.tron.api.GrpcAPI.BytesMessage> getGetNkFromNskMethod;
    if ((getGetNkFromNskMethod = WalletGrpc.getGetNkFromNskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNkFromNskMethod = WalletGrpc.getGetNkFromNskMethod) == null) {
          WalletGrpc.getGetNkFromNskMethod = getGetNkFromNskMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.BytesMessage, org.tron.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetNkFromNsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNkFromNsk"))
                  .build();
          }
        }
     }
     return getGetNkFromNskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.ViewingKeyMessage,
      org.tron.api.GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIncomingViewingKey",
      requestType = org.tron.api.GrpcAPI.ViewingKeyMessage.class,
      responseType = org.tron.api.GrpcAPI.IncomingViewingKeyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.ViewingKeyMessage,
      org.tron.api.GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.ViewingKeyMessage, org.tron.api.GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod;
    if ((getGetIncomingViewingKeyMethod = WalletGrpc.getGetIncomingViewingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetIncomingViewingKeyMethod = WalletGrpc.getGetIncomingViewingKeyMethod) == null) {
          WalletGrpc.getGetIncomingViewingKeyMethod = getGetIncomingViewingKeyMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.ViewingKeyMessage, org.tron.api.GrpcAPI.IncomingViewingKeyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetIncomingViewingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.ViewingKeyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.IncomingViewingKeyMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetIncomingViewingKey"))
                  .build();
          }
        }
     }
     return getGetIncomingViewingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.DiversifierMessage> getGetDiversifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDiversifier",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.api.GrpcAPI.DiversifierMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.DiversifierMessage> getGetDiversifierMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.DiversifierMessage> getGetDiversifierMethod;
    if ((getGetDiversifierMethod = WalletGrpc.getGetDiversifierMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDiversifierMethod = WalletGrpc.getGetDiversifierMethod) == null) {
          WalletGrpc.getGetDiversifierMethod = getGetDiversifierMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.DiversifierMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetDiversifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.DiversifierMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDiversifier"))
                  .build();
          }
        }
     }
     return getGetDiversifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNewShieldedAddress",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.api.GrpcAPI.ShieldedAddressInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod;
    if ((getGetNewShieldedAddressMethod = WalletGrpc.getGetNewShieldedAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNewShieldedAddressMethod = WalletGrpc.getGetNewShieldedAddressMethod) == null) {
          WalletGrpc.getGetNewShieldedAddressMethod = getGetNewShieldedAddressMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.ShieldedAddressInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetNewShieldedAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.ShieldedAddressInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNewShieldedAddress"))
                  .build();
          }
        }
     }
     return getGetNewShieldedAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.IncomingViewingKeyDiversifierMessage,
      org.tron.api.GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZenPaymentAddress",
      requestType = org.tron.api.GrpcAPI.IncomingViewingKeyDiversifierMessage.class,
      responseType = org.tron.api.GrpcAPI.PaymentAddressMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.IncomingViewingKeyDiversifierMessage,
      org.tron.api.GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.IncomingViewingKeyDiversifierMessage, org.tron.api.GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod;
    if ((getGetZenPaymentAddressMethod = WalletGrpc.getGetZenPaymentAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetZenPaymentAddressMethod = WalletGrpc.getGetZenPaymentAddressMethod) == null) {
          WalletGrpc.getGetZenPaymentAddressMethod = getGetZenPaymentAddressMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.IncomingViewingKeyDiversifierMessage, org.tron.api.GrpcAPI.PaymentAddressMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetZenPaymentAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.IncomingViewingKeyDiversifierMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.PaymentAddressMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetZenPaymentAddress"))
                  .build();
          }
        }
     }
     return getGetZenPaymentAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.BytesMessage> getGetRcmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRcm",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.BytesMessage> getGetRcmMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.BytesMessage> getGetRcmMethod;
    if ((getGetRcmMethod = WalletGrpc.getGetRcmMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetRcmMethod = WalletGrpc.getGetRcmMethod) == null) {
          WalletGrpc.getGetRcmMethod = getGetRcmMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetRcm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetRcm"))
                  .build();
          }
        }
     }
     return getGetRcmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NoteParameters,
      org.tron.api.GrpcAPI.SpendResult> getIsSpendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsSpend",
      requestType = org.tron.api.GrpcAPI.NoteParameters.class,
      responseType = org.tron.api.GrpcAPI.SpendResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NoteParameters,
      org.tron.api.GrpcAPI.SpendResult> getIsSpendMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NoteParameters, org.tron.api.GrpcAPI.SpendResult> getIsSpendMethod;
    if ((getIsSpendMethod = WalletGrpc.getIsSpendMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getIsSpendMethod = WalletGrpc.getIsSpendMethod) == null) {
          WalletGrpc.getIsSpendMethod = getIsSpendMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.NoteParameters, org.tron.api.GrpcAPI.SpendResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "IsSpend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NoteParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.SpendResult.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("IsSpend"))
                  .build();
          }
        }
     }
     return getIsSpendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PrivateParametersWithoutAsk,
      org.tron.api.GrpcAPI.TransactionExtention> getCreateShieldedTransactionWithoutSpendAuthSigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedTransactionWithoutSpendAuthSig",
      requestType = org.tron.api.GrpcAPI.PrivateParametersWithoutAsk.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PrivateParametersWithoutAsk,
      org.tron.api.GrpcAPI.TransactionExtention> getCreateShieldedTransactionWithoutSpendAuthSigMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PrivateParametersWithoutAsk, org.tron.api.GrpcAPI.TransactionExtention> getCreateShieldedTransactionWithoutSpendAuthSigMethod;
    if ((getCreateShieldedTransactionWithoutSpendAuthSigMethod = WalletGrpc.getCreateShieldedTransactionWithoutSpendAuthSigMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedTransactionWithoutSpendAuthSigMethod = WalletGrpc.getCreateShieldedTransactionWithoutSpendAuthSigMethod) == null) {
          WalletGrpc.getCreateShieldedTransactionWithoutSpendAuthSigMethod = getCreateShieldedTransactionWithoutSpendAuthSigMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.PrivateParametersWithoutAsk, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateShieldedTransactionWithoutSpendAuthSig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.PrivateParametersWithoutAsk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedTransactionWithoutSpendAuthSig"))
                  .build();
          }
        }
     }
     return getCreateShieldedTransactionWithoutSpendAuthSigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction,
      org.tron.api.GrpcAPI.BytesMessage> getGetShieldTransactionHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetShieldTransactionHash",
      requestType = org.tron.protos.Protocol.Transaction.class,
      responseType = org.tron.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction,
      org.tron.api.GrpcAPI.BytesMessage> getGetShieldTransactionHashMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction, org.tron.api.GrpcAPI.BytesMessage> getGetShieldTransactionHashMethod;
    if ((getGetShieldTransactionHashMethod = WalletGrpc.getGetShieldTransactionHashMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetShieldTransactionHashMethod = WalletGrpc.getGetShieldTransactionHashMethod) == null) {
          WalletGrpc.getGetShieldTransactionHashMethod = getGetShieldTransactionHashMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.Transaction, org.tron.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetShieldTransactionHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetShieldTransactionHash"))
                  .build();
          }
        }
     }
     return getGetShieldTransactionHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.SpendAuthSigParameters,
      org.tron.api.GrpcAPI.BytesMessage> getCreateSpendAuthSigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSpendAuthSig",
      requestType = org.tron.api.GrpcAPI.SpendAuthSigParameters.class,
      responseType = org.tron.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.SpendAuthSigParameters,
      org.tron.api.GrpcAPI.BytesMessage> getCreateSpendAuthSigMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.SpendAuthSigParameters, org.tron.api.GrpcAPI.BytesMessage> getCreateSpendAuthSigMethod;
    if ((getCreateSpendAuthSigMethod = WalletGrpc.getCreateSpendAuthSigMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateSpendAuthSigMethod = WalletGrpc.getCreateSpendAuthSigMethod) == null) {
          WalletGrpc.getCreateSpendAuthSigMethod = getCreateSpendAuthSigMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.SpendAuthSigParameters, org.tron.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateSpendAuthSig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.SpendAuthSigParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateSpendAuthSig"))
                  .build();
          }
        }
     }
     return getCreateSpendAuthSigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NfParameters,
      org.tron.api.GrpcAPI.BytesMessage> getCreateShieldNullifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldNullifier",
      requestType = org.tron.api.GrpcAPI.NfParameters.class,
      responseType = org.tron.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NfParameters,
      org.tron.api.GrpcAPI.BytesMessage> getCreateShieldNullifierMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NfParameters, org.tron.api.GrpcAPI.BytesMessage> getCreateShieldNullifierMethod;
    if ((getCreateShieldNullifierMethod = WalletGrpc.getCreateShieldNullifierMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldNullifierMethod = WalletGrpc.getCreateShieldNullifierMethod) == null) {
          WalletGrpc.getCreateShieldNullifierMethod = getCreateShieldNullifierMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.NfParameters, org.tron.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateShieldNullifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NfParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldNullifier"))
                  .build();
          }
        }
     }
     return getCreateShieldNullifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PrivateShieldedTRC20Parameters,
      org.tron.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedContractParameters",
      requestType = org.tron.api.GrpcAPI.PrivateShieldedTRC20Parameters.class,
      responseType = org.tron.api.GrpcAPI.ShieldedTRC20Parameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PrivateShieldedTRC20Parameters,
      org.tron.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PrivateShieldedTRC20Parameters, org.tron.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod;
    if ((getCreateShieldedContractParametersMethod = WalletGrpc.getCreateShieldedContractParametersMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedContractParametersMethod = WalletGrpc.getCreateShieldedContractParametersMethod) == null) {
          WalletGrpc.getCreateShieldedContractParametersMethod = getCreateShieldedContractParametersMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.PrivateShieldedTRC20Parameters, org.tron.api.GrpcAPI.ShieldedTRC20Parameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateShieldedContractParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.PrivateShieldedTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.ShieldedTRC20Parameters.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedContractParameters"))
                  .build();
          }
        }
     }
     return getCreateShieldedContractParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
      org.tron.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedContractParametersWithoutAsk",
      requestType = org.tron.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk.class,
      responseType = org.tron.api.GrpcAPI.ShieldedTRC20Parameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
      org.tron.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk, org.tron.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod;
    if ((getCreateShieldedContractParametersWithoutAskMethod = WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedContractParametersWithoutAskMethod = WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod) == null) {
          WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod = getCreateShieldedContractParametersWithoutAskMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk, org.tron.api.GrpcAPI.ShieldedTRC20Parameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateShieldedContractParametersWithoutAsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.ShieldedTRC20Parameters.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedContractParametersWithoutAsk"))
                  .build();
          }
        }
     }
     return getCreateShieldedContractParametersWithoutAskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.IvkDecryptTRC20Parameters,
      org.tron.api.GrpcAPI.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanShieldedTRC20NotesByIvk",
      requestType = org.tron.api.GrpcAPI.IvkDecryptTRC20Parameters.class,
      responseType = org.tron.api.GrpcAPI.DecryptNotesTRC20.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.IvkDecryptTRC20Parameters,
      org.tron.api.GrpcAPI.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.IvkDecryptTRC20Parameters, org.tron.api.GrpcAPI.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod;
    if ((getScanShieldedTRC20NotesByIvkMethod = WalletGrpc.getScanShieldedTRC20NotesByIvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanShieldedTRC20NotesByIvkMethod = WalletGrpc.getScanShieldedTRC20NotesByIvkMethod) == null) {
          WalletGrpc.getScanShieldedTRC20NotesByIvkMethod = getScanShieldedTRC20NotesByIvkMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.IvkDecryptTRC20Parameters, org.tron.api.GrpcAPI.DecryptNotesTRC20>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ScanShieldedTRC20NotesByIvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.IvkDecryptTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.DecryptNotesTRC20.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanShieldedTRC20NotesByIvk"))
                  .build();
          }
        }
     }
     return getScanShieldedTRC20NotesByIvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.OvkDecryptTRC20Parameters,
      org.tron.api.GrpcAPI.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanShieldedTRC20NotesByOvk",
      requestType = org.tron.api.GrpcAPI.OvkDecryptTRC20Parameters.class,
      responseType = org.tron.api.GrpcAPI.DecryptNotesTRC20.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.OvkDecryptTRC20Parameters,
      org.tron.api.GrpcAPI.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.OvkDecryptTRC20Parameters, org.tron.api.GrpcAPI.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod;
    if ((getScanShieldedTRC20NotesByOvkMethod = WalletGrpc.getScanShieldedTRC20NotesByOvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanShieldedTRC20NotesByOvkMethod = WalletGrpc.getScanShieldedTRC20NotesByOvkMethod) == null) {
          WalletGrpc.getScanShieldedTRC20NotesByOvkMethod = getScanShieldedTRC20NotesByOvkMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.OvkDecryptTRC20Parameters, org.tron.api.GrpcAPI.DecryptNotesTRC20>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "ScanShieldedTRC20NotesByOvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.OvkDecryptTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.DecryptNotesTRC20.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanShieldedTRC20NotesByOvk"))
                  .build();
          }
        }
     }
     return getScanShieldedTRC20NotesByOvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NfTRC20Parameters,
      org.tron.api.GrpcAPI.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsShieldedTRC20ContractNoteSpent",
      requestType = org.tron.api.GrpcAPI.NfTRC20Parameters.class,
      responseType = org.tron.api.GrpcAPI.NullifierResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NfTRC20Parameters,
      org.tron.api.GrpcAPI.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NfTRC20Parameters, org.tron.api.GrpcAPI.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod;
    if ((getIsShieldedTRC20ContractNoteSpentMethod = WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getIsShieldedTRC20ContractNoteSpentMethod = WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod) == null) {
          WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod = getIsShieldedTRC20ContractNoteSpentMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.NfTRC20Parameters, org.tron.api.GrpcAPI.NullifierResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "IsShieldedTRC20ContractNoteSpent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NfTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NullifierResult.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("IsShieldedTRC20ContractNoteSpent"))
                  .build();
          }
        }
     }
     return getIsShieldedTRC20ContractNoteSpentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.ShieldedTRC20TriggerContractParameters,
      org.tron.api.GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTriggerInputForShieldedTRC20Contract",
      requestType = org.tron.api.GrpcAPI.ShieldedTRC20TriggerContractParameters.class,
      responseType = org.tron.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.ShieldedTRC20TriggerContractParameters,
      org.tron.api.GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.ShieldedTRC20TriggerContractParameters, org.tron.api.GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod;
    if ((getGetTriggerInputForShieldedTRC20ContractMethod = WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTriggerInputForShieldedTRC20ContractMethod = WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod) == null) {
          WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod = getGetTriggerInputForShieldedTRC20ContractMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.ShieldedTRC20TriggerContractParameters, org.tron.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetTriggerInputForShieldedTRC20Contract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.ShieldedTRC20TriggerContractParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.BytesMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTriggerInputForShieldedTRC20Contract"))
                  .build();
          }
        }
     }
     return getGetTriggerInputForShieldedTRC20ContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction,
      org.tron.api.GrpcAPI.TransactionExtention> getCreateCommonTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCommonTransaction",
      requestType = org.tron.protos.Protocol.Transaction.class,
      responseType = org.tron.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction,
      org.tron.api.GrpcAPI.TransactionExtention> getCreateCommonTransactionMethod() {
    io.grpc.MethodDescriptor<org.tron.protos.Protocol.Transaction, org.tron.api.GrpcAPI.TransactionExtention> getCreateCommonTransactionMethod;
    if ((getCreateCommonTransactionMethod = WalletGrpc.getCreateCommonTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateCommonTransactionMethod = WalletGrpc.getCreateCommonTransactionMethod) == null) {
          WalletGrpc.getCreateCommonTransactionMethod = getCreateCommonTransactionMethod = 
              io.grpc.MethodDescriptor.<org.tron.protos.Protocol.Transaction, org.tron.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "CreateCommonTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.protos.Protocol.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateCommonTransaction"))
                  .build();
          }
        }
     }
     return getCreateCommonTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage,
      org.tron.api.GrpcAPI.TransactionInfoList> getGetTransactionInfoByBlockNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionInfoByBlockNum",
      requestType = org.tron.api.GrpcAPI.NumberMessage.class,
      responseType = org.tron.api.GrpcAPI.TransactionInfoList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage,
      org.tron.api.GrpcAPI.TransactionInfoList> getGetTransactionInfoByBlockNumMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.NumberMessage, org.tron.api.GrpcAPI.TransactionInfoList> getGetTransactionInfoByBlockNumMethod;
    if ((getGetTransactionInfoByBlockNumMethod = WalletGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionInfoByBlockNumMethod = WalletGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
          WalletGrpc.getGetTransactionInfoByBlockNumMethod = getGetTransactionInfoByBlockNumMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.NumberMessage, org.tron.api.GrpcAPI.TransactionInfoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetTransactionInfoByBlockNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.TransactionInfoList.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionInfoByBlockNum"))
                  .build();
          }
        }
     }
     return getGetTransactionInfoByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.NumberMessage> getGetBurnTrxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBurnTrx",
      requestType = org.tron.api.GrpcAPI.EmptyMessage.class,
      responseType = org.tron.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage,
      org.tron.api.GrpcAPI.NumberMessage> getGetBurnTrxMethod() {
    io.grpc.MethodDescriptor<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.NumberMessage> getGetBurnTrxMethod;
    if ((getGetBurnTrxMethod = WalletGrpc.getGetBurnTrxMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBurnTrxMethod = WalletGrpc.getGetBurnTrxMethod) == null) {
          WalletGrpc.getGetBurnTrxMethod = getGetBurnTrxMethod = 
              io.grpc.MethodDescriptor.<org.tron.api.GrpcAPI.EmptyMessage, org.tron.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protocol.Wallet", "GetBurnTrx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.api.GrpcAPI.NumberMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBurnTrx"))
                  .build();
          }
        }
     }
     return getGetBurnTrxMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletStub newStub(io.grpc.Channel channel) {
    return new WalletStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WalletBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WalletFutureStub(channel);
  }

  /**
   */
  public static abstract class WalletImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAccount(org.tron.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Account> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAccountById(org.tron.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Account> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAccountBalance(org.tron.protos.contract.BalanceContract.AccountBalanceRequest request,
        io.grpc.stub.StreamObserver<org.tron.protos.contract.BalanceContract.AccountBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountBalanceMethod(), responseObserver);
    }

    /**
     */
    public void getBlockBalanceTrace(org.tron.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier request,
        io.grpc.stub.StreamObserver<org.tron.protos.contract.BalanceContract.BlockBalanceTrace> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockBalanceTraceMethod(), responseObserver);
    }

    /**
     * <pre>
     *Please use CreateTransaction2 instead of this function.
     * </pre>
     */
    public void createTransaction(org.tron.protos.contract.BalanceContract.TransferContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateTransaction.
     * </pre>
     */
    public void createTransaction2(org.tron.protos.contract.BalanceContract.TransferContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTransaction2Method(), responseObserver);
    }

    /**
     */
    public void broadcastTransaction(org.tron.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.Return> responseObserver) {
      asyncUnimplementedUnaryCall(getBroadcastTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     *Please use UpdateAccount2 instead of this function.
     * </pre>
     */
    public void updateAccount(org.tron.protos.contract.AccountContract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccountMethod(), responseObserver);
    }

    /**
     */
    public void setAccountId(org.tron.protos.contract.AccountContract.SetAccountIdContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccountIdMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAccount.
     * </pre>
     */
    public void updateAccount2(org.tron.protos.contract.AccountContract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccount2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use VoteWitnessAccount2 instead of this function.
     * </pre>
     */
    public void voteWitnessAccount(org.tron.protos.contract.WitnessContract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getVoteWitnessAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     *modify the consume_user_resource_percent
     * </pre>
     */
    public void updateSetting(org.tron.protos.contract.SmartContractOuterClass.UpdateSettingContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSettingMethod(), responseObserver);
    }

    /**
     * <pre>
     *modify the energy_limit
     * </pre>
     */
    public void updateEnergyLimit(org.tron.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateEnergyLimitMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of VoteWitnessAccount.
     * </pre>
     */
    public void voteWitnessAccount2(org.tron.protos.contract.WitnessContract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getVoteWitnessAccount2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use CreateAssetIssue2 instead of this function.
     * </pre>
     */
    public void createAssetIssue(org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAssetIssueMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateAssetIssue.
     * </pre>
     */
    public void createAssetIssue2(org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAssetIssue2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use UpdateWitness2 instead of this function.
     * </pre>
     */
    public void updateWitness(org.tron.protos.contract.WitnessContract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateWitnessMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UpdateWitness.
     * </pre>
     */
    public void updateWitness2(org.tron.protos.contract.WitnessContract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateWitness2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use CreateAccount2 instead of this function.
     * </pre>
     */
    public void createAccount(org.tron.protos.contract.AccountContract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateAccount.
     * </pre>
     */
    public void createAccount2(org.tron.protos.contract.AccountContract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAccount2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use CreateWitness2 instead of this function.
     * </pre>
     */
    public void createWitness(org.tron.protos.contract.WitnessContract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateWitnessMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateWitness.
     * </pre>
     */
    public void createWitness2(org.tron.protos.contract.WitnessContract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateWitness2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use TransferAsset2 instead of this function.
     * </pre>
     */
    public void transferAsset(org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of TransferAsset.
     * </pre>
     */
    public void transferAsset2(org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferAsset2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use ParticipateAssetIssue2 instead of this function.
     * </pre>
     */
    public void participateAssetIssue(org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getParticipateAssetIssueMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of ParticipateAssetIssue.
     * </pre>
     */
    public void participateAssetIssue2(org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getParticipateAssetIssue2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use FreezeBalance2 instead of this function.
     * </pre>
     */
    public void freezeBalance(org.tron.protos.contract.BalanceContract.FreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getFreezeBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of FreezeBalance.
     * </pre>
     */
    public void freezeBalance2(org.tron.protos.contract.BalanceContract.FreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getFreezeBalance2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use UnfreezeBalance2 instead of this function.
     * </pre>
     */
    public void unfreezeBalance(org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUnfreezeBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeBalance.
     * </pre>
     */
    public void unfreezeBalance2(org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUnfreezeBalance2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use UnfreezeAsset2 instead of this function.
     * </pre>
     */
    public void unfreezeAsset(org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUnfreezeAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeAsset.
     * </pre>
     */
    public void unfreezeAsset2(org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUnfreezeAsset2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use WithdrawBalance2 instead of this function.
     * </pre>
     */
    public void withdrawBalance(org.tron.protos.contract.BalanceContract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of WithdrawBalance.
     * </pre>
     */
    public void withdrawBalance2(org.tron.protos.contract.BalanceContract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawBalance2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use UpdateAsset2 instead of this function.
     * </pre>
     */
    public void updateAsset(org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAsset.
     * </pre>
     */
    public void updateAsset2(org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAsset2Method(), responseObserver);
    }

    /**
     */
    public void proposalCreate(org.tron.protos.contract.ProposalContract.ProposalCreateContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getProposalCreateMethod(), responseObserver);
    }

    /**
     */
    public void proposalApprove(org.tron.protos.contract.ProposalContract.ProposalApproveContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getProposalApproveMethod(), responseObserver);
    }

    /**
     */
    public void proposalDelete(org.tron.protos.contract.ProposalContract.ProposalDeleteContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getProposalDeleteMethod(), responseObserver);
    }

    /**
     */
    public void buyStorage(org.tron.protos.contract.StorageContract.BuyStorageContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getBuyStorageMethod(), responseObserver);
    }

    /**
     */
    public void buyStorageBytes(org.tron.protos.contract.StorageContract.BuyStorageBytesContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getBuyStorageBytesMethod(), responseObserver);
    }

    /**
     */
    public void sellStorage(org.tron.protos.contract.StorageContract.SellStorageContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getSellStorageMethod(), responseObserver);
    }

    /**
     */
    public void exchangeCreate(org.tron.protos.contract.ExchangeContract.ExchangeCreateContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeCreateMethod(), responseObserver);
    }

    /**
     */
    public void exchangeInject(org.tron.protos.contract.ExchangeContract.ExchangeInjectContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeInjectMethod(), responseObserver);
    }

    /**
     */
    public void exchangeWithdraw(org.tron.protos.contract.ExchangeContract.ExchangeWithdrawContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeWithdrawMethod(), responseObserver);
    }

    /**
     */
    public void exchangeTransaction(org.tron.protos.contract.ExchangeContract.ExchangeTransactionContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeTransactionMethod(), responseObserver);
    }

    /**
     */
    public void marketSellAsset(org.tron.protos.contract.MarketContract.MarketSellAssetContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getMarketSellAssetMethod(), responseObserver);
    }

    /**
     */
    public void marketCancelOrder(org.tron.protos.contract.MarketContract.MarketCancelOrderContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getMarketCancelOrderMethod(), responseObserver);
    }

    /**
     */
    public void getMarketOrderById(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketOrder> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketOrderByIdMethod(), responseObserver);
    }

    /**
     */
    public void getMarketOrderByAccount(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketOrderList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketOrderByAccountMethod(), responseObserver);
    }

    /**
     */
    public void getMarketPriceByPair(org.tron.protos.Protocol.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketPriceList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketPriceByPairMethod(), responseObserver);
    }

    /**
     */
    public void getMarketOrderListByPair(org.tron.protos.Protocol.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketOrderList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketOrderListByPairMethod(), responseObserver);
    }

    /**
     */
    public void getMarketPairList(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketOrderPairList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketPairListMethod(), responseObserver);
    }

    /**
     */
    public void listNodes(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NodeList> responseObserver) {
      asyncUnimplementedUnaryCall(getListNodesMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueByAccount(org.tron.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueByAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAccountNet(org.tron.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AccountNetMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountNetMethod(), responseObserver);
    }

    /**
     */
    public void getAccountResource(org.tron.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AccountResourceMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountResourceMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueByName(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueByNameMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueListByName(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueListByNameMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueById(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     *Please use GetNowBlock2 instead of this function.
     * </pre>
     */
    public void getNowBlock(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNowBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetNowBlock.
     * </pre>
     */
    public void getNowBlock2(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNowBlock2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use GetBlockByNum2 instead of this function.
     * </pre>
     */
    public void getBlockByNum(org.tron.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByNumMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public void getBlockByNum2(org.tron.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByNum2Method(), responseObserver);
    }

    /**
     */
    public void getTransactionCountByBlockNum(org.tron.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionCountByBlockNumMethod(), responseObserver);
    }

    /**
     */
    public void getBlockById(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     *Please use GetBlockByLimitNext2 instead of this function.
     * </pre>
     */
    public void getBlockByLimitNext(org.tron.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLimitNextMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLimitNext.
     * </pre>
     */
    public void getBlockByLimitNext2(org.tron.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockListExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLimitNext2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use GetBlockByLatestNum2 instead of this function.
     * </pre>
     */
    public void getBlockByLatestNum(org.tron.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLatestNumMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLatestNum.
     * </pre>
     */
    public void getBlockByLatestNum2(org.tron.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockListExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLatestNum2Method(), responseObserver);
    }

    /**
     */
    public void getTransactionById(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionByIdMethod(), responseObserver);
    }

    /**
     */
    public void deployContract(org.tron.protos.contract.SmartContractOuterClass.CreateSmartContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getDeployContractMethod(), responseObserver);
    }

    /**
     */
    public void getContract(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.contract.SmartContractOuterClass.SmartContract> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContractMethod(), responseObserver);
    }

    /**
     */
    public void getContractInfo(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.contract.SmartContractOuterClass.SmartContractDataWrapper> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContractInfoMethod(), responseObserver);
    }

    /**
     */
    public void triggerContract(org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getTriggerContractMethod(), responseObserver);
    }

    /**
     */
    public void triggerConstantContract(org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getTriggerConstantContractMethod(), responseObserver);
    }

    /**
     */
    public void clearContractABI(org.tron.protos.contract.SmartContractOuterClass.ClearABIContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getClearContractABIMethod(), responseObserver);
    }

    /**
     */
    public void listWitnesses(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.WitnessList> responseObserver) {
      asyncUnimplementedUnaryCall(getListWitnessesMethod(), responseObserver);
    }

    /**
     */
    public void getDelegatedResource(org.tron.api.GrpcAPI.DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DelegatedResourceList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDelegatedResourceMethod(), responseObserver);
    }

    /**
     */
    public void getDelegatedResourceAccountIndex(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.DelegatedResourceAccountIndex> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDelegatedResourceAccountIndexMethod(), responseObserver);
    }

    /**
     */
    public void listProposals(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ProposalList> responseObserver) {
      asyncUnimplementedUnaryCall(getListProposalsMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedProposalList(org.tron.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ProposalList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPaginatedProposalListMethod(), responseObserver);
    }

    /**
     */
    public void getProposalById(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Proposal> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProposalByIdMethod(), responseObserver);
    }

    /**
     */
    public void listExchanges(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ExchangeList> responseObserver) {
      asyncUnimplementedUnaryCall(getListExchangesMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedExchangeList(org.tron.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ExchangeList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPaginatedExchangeListMethod(), responseObserver);
    }

    /**
     */
    public void getExchangeById(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Exchange> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExchangeByIdMethod(), responseObserver);
    }

    /**
     */
    public void getChainParameters(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.ChainParameters> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChainParametersMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueList(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueListMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedAssetIssueList(org.tron.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPaginatedAssetIssueListMethod(), responseObserver);
    }

    /**
     */
    public void totalTransaction(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getTotalTransactionMethod(), responseObserver);
    }

    /**
     */
    public void getNextMaintenanceTime(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNextMaintenanceTimeMethod(), responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     *Please use GetTransactionSign2 instead of this function.
     * </pre>
     */
    public void getTransactionSign(org.tron.protos.Protocol.TransactionSign request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionSignMethod(), responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     *Use this function instead of GetTransactionSign.
     * </pre>
     */
    public void getTransactionSign2(org.tron.protos.Protocol.TransactionSign request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionSign2Method(), responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public void createAddress(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public void easyTransferAsset(org.tron.api.GrpcAPI.EasyTransferAssetMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public void easyTransferAssetByPrivate(org.tron.api.GrpcAPI.EasyTransferAssetByPrivateMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferAssetByPrivateMethod(), responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public void easyTransfer(org.tron.api.GrpcAPI.EasyTransferMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferMethod(), responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public void easyTransferByPrivate(org.tron.api.GrpcAPI.EasyTransferByPrivateMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferByPrivateMethod(), responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public void generateAddress(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AddressPrKeyPairMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateAddressMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionInfoById(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.TransactionInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionInfoByIdMethod(), responseObserver);
    }

    /**
     */
    public void accountPermissionUpdate(org.tron.protos.contract.AccountContract.AccountPermissionUpdateContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountPermissionUpdateMethod(), responseObserver);
    }

    /**
     */
    public void addSign(org.tron.protos.Protocol.TransactionSign request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getAddSignMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionSignWeight(org.tron.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionSignWeight> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionSignWeightMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionApprovedList(org.tron.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionApprovedList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionApprovedListMethod(), responseObserver);
    }

    /**
     */
    public void getNodeInfo(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.NodeInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNodeInfoMethod(), responseObserver);
    }

    /**
     */
    public void getRewardInfo(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRewardInfoMethod(), responseObserver);
    }

    /**
     */
    public void getBrokerageInfo(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBrokerageInfoMethod(), responseObserver);
    }

    /**
     */
    public void updateBrokerage(org.tron.protos.contract.StorageContract.UpdateBrokerageContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBrokerageMethod(), responseObserver);
    }

    /**
     * <pre>
     * for shiededTransaction
     * </pre>
     */
    public void createShieldedTransaction(org.tron.api.GrpcAPI.PrivateParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateShieldedTransactionMethod(), responseObserver);
    }

    /**
     */
    public void getMerkleTreeVoucherInfo(org.tron.protos.contract.ShieldContract.OutputPointInfo request,
        io.grpc.stub.StreamObserver<org.tron.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMerkleTreeVoucherInfoMethod(), responseObserver);
    }

    /**
     */
    public void scanNoteByIvk(org.tron.api.GrpcAPI.IvkDecryptParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotes> responseObserver) {
      asyncUnimplementedUnaryCall(getScanNoteByIvkMethod(), responseObserver);
    }

    /**
     */
    public void scanAndMarkNoteByIvk(org.tron.api.GrpcAPI.IvkDecryptAndMarkParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotesMarked> responseObserver) {
      asyncUnimplementedUnaryCall(getScanAndMarkNoteByIvkMethod(), responseObserver);
    }

    /**
     */
    public void scanNoteByOvk(org.tron.api.GrpcAPI.OvkDecryptParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotes> responseObserver) {
      asyncUnimplementedUnaryCall(getScanNoteByOvkMethod(), responseObserver);
    }

    /**
     */
    public void getSpendingKey(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSpendingKeyMethod(), responseObserver);
    }

    /**
     */
    public void getExpandedSpendingKey(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ExpandedSpendingKeyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExpandedSpendingKeyMethod(), responseObserver);
    }

    /**
     */
    public void getAkFromAsk(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAkFromAskMethod(), responseObserver);
    }

    /**
     */
    public void getNkFromNsk(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNkFromNskMethod(), responseObserver);
    }

    /**
     */
    public void getIncomingViewingKey(org.tron.api.GrpcAPI.ViewingKeyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.IncomingViewingKeyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIncomingViewingKeyMethod(), responseObserver);
    }

    /**
     */
    public void getDiversifier(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DiversifierMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDiversifierMethod(), responseObserver);
    }

    /**
     */
    public void getNewShieldedAddress(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ShieldedAddressInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNewShieldedAddressMethod(), responseObserver);
    }

    /**
     */
    public void getZenPaymentAddress(org.tron.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.PaymentAddressMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetZenPaymentAddressMethod(), responseObserver);
    }

    /**
     */
    public void getRcm(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRcmMethod(), responseObserver);
    }

    /**
     */
    public void isSpend(org.tron.api.GrpcAPI.NoteParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.SpendResult> responseObserver) {
      asyncUnimplementedUnaryCall(getIsSpendMethod(), responseObserver);
    }

    /**
     */
    public void createShieldedTransactionWithoutSpendAuthSig(org.tron.api.GrpcAPI.PrivateParametersWithoutAsk request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateShieldedTransactionWithoutSpendAuthSigMethod(), responseObserver);
    }

    /**
     */
    public void getShieldTransactionHash(org.tron.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetShieldTransactionHashMethod(), responseObserver);
    }

    /**
     */
    public void createSpendAuthSig(org.tron.api.GrpcAPI.SpendAuthSigParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSpendAuthSigMethod(), responseObserver);
    }

    /**
     */
    public void createShieldNullifier(org.tron.api.GrpcAPI.NfParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateShieldNullifierMethod(), responseObserver);
    }

    /**
     * <pre>
     *for shielded contract
     * </pre>
     */
    public void createShieldedContractParameters(org.tron.api.GrpcAPI.PrivateShieldedTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateShieldedContractParametersMethod(), responseObserver);
    }

    /**
     */
    public void createShieldedContractParametersWithoutAsk(org.tron.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateShieldedContractParametersWithoutAskMethod(), responseObserver);
    }

    /**
     */
    public void scanShieldedTRC20NotesByIvk(org.tron.api.GrpcAPI.IvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotesTRC20> responseObserver) {
      asyncUnimplementedUnaryCall(getScanShieldedTRC20NotesByIvkMethod(), responseObserver);
    }

    /**
     */
    public void scanShieldedTRC20NotesByOvk(org.tron.api.GrpcAPI.OvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotesTRC20> responseObserver) {
      asyncUnimplementedUnaryCall(getScanShieldedTRC20NotesByOvkMethod(), responseObserver);
    }

    /**
     */
    public void isShieldedTRC20ContractNoteSpent(org.tron.api.GrpcAPI.NfTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NullifierResult> responseObserver) {
      asyncUnimplementedUnaryCall(getIsShieldedTRC20ContractNoteSpentMethod(), responseObserver);
    }

    /**
     */
    public void getTriggerInputForShieldedTRC20Contract(org.tron.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTriggerInputForShieldedTRC20ContractMethod(), responseObserver);
    }

    /**
     */
    public void createCommonTransaction(org.tron.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCommonTransactionMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionInfoByBlockNum(org.tron.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionInfoList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionInfoByBlockNumMethod(), responseObserver);
    }

    /**
     */
    public void getBurnTrx(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBurnTrxMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.Account,
                org.tron.protos.Protocol.Account>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetAccountByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.Account,
                org.tron.protos.Protocol.Account>(
                  this, METHODID_GET_ACCOUNT_BY_ID)))
          .addMethod(
            getGetAccountBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.BalanceContract.AccountBalanceRequest,
                org.tron.protos.contract.BalanceContract.AccountBalanceResponse>(
                  this, METHODID_GET_ACCOUNT_BALANCE)))
          .addMethod(
            getGetBlockBalanceTraceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier,
                org.tron.protos.contract.BalanceContract.BlockBalanceTrace>(
                  this, METHODID_GET_BLOCK_BALANCE_TRACE)))
          .addMethod(
            getCreateTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.BalanceContract.TransferContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_CREATE_TRANSACTION)))
          .addMethod(
            getCreateTransaction2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.BalanceContract.TransferContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_CREATE_TRANSACTION2)))
          .addMethod(
            getBroadcastTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.Transaction,
                org.tron.api.GrpcAPI.Return>(
                  this, METHODID_BROADCAST_TRANSACTION)))
          .addMethod(
            getUpdateAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AccountContract.AccountUpdateContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_UPDATE_ACCOUNT)))
          .addMethod(
            getSetAccountIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AccountContract.SetAccountIdContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_SET_ACCOUNT_ID)))
          .addMethod(
            getUpdateAccount2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AccountContract.AccountUpdateContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_UPDATE_ACCOUNT2)))
          .addMethod(
            getVoteWitnessAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.WitnessContract.VoteWitnessContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_VOTE_WITNESS_ACCOUNT)))
          .addMethod(
            getUpdateSettingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.SmartContractOuterClass.UpdateSettingContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_UPDATE_SETTING)))
          .addMethod(
            getUpdateEnergyLimitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_UPDATE_ENERGY_LIMIT)))
          .addMethod(
            getVoteWitnessAccount2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.WitnessContract.VoteWitnessContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_VOTE_WITNESS_ACCOUNT2)))
          .addMethod(
            getCreateAssetIssueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_CREATE_ASSET_ISSUE)))
          .addMethod(
            getCreateAssetIssue2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_CREATE_ASSET_ISSUE2)))
          .addMethod(
            getUpdateWitnessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.WitnessContract.WitnessUpdateContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_UPDATE_WITNESS)))
          .addMethod(
            getUpdateWitness2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.WitnessContract.WitnessUpdateContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_UPDATE_WITNESS2)))
          .addMethod(
            getCreateAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AccountContract.AccountCreateContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_CREATE_ACCOUNT)))
          .addMethod(
            getCreateAccount2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AccountContract.AccountCreateContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_CREATE_ACCOUNT2)))
          .addMethod(
            getCreateWitnessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.WitnessContract.WitnessCreateContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_CREATE_WITNESS)))
          .addMethod(
            getCreateWitness2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.WitnessContract.WitnessCreateContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_CREATE_WITNESS2)))
          .addMethod(
            getTransferAssetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_TRANSFER_ASSET)))
          .addMethod(
            getTransferAsset2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_TRANSFER_ASSET2)))
          .addMethod(
            getParticipateAssetIssueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_PARTICIPATE_ASSET_ISSUE)))
          .addMethod(
            getParticipateAssetIssue2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_PARTICIPATE_ASSET_ISSUE2)))
          .addMethod(
            getFreezeBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.BalanceContract.FreezeBalanceContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_FREEZE_BALANCE)))
          .addMethod(
            getFreezeBalance2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.BalanceContract.FreezeBalanceContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_FREEZE_BALANCE2)))
          .addMethod(
            getUnfreezeBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_UNFREEZE_BALANCE)))
          .addMethod(
            getUnfreezeBalance2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_UNFREEZE_BALANCE2)))
          .addMethod(
            getUnfreezeAssetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_UNFREEZE_ASSET)))
          .addMethod(
            getUnfreezeAsset2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_UNFREEZE_ASSET2)))
          .addMethod(
            getWithdrawBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.BalanceContract.WithdrawBalanceContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_WITHDRAW_BALANCE)))
          .addMethod(
            getWithdrawBalance2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.BalanceContract.WithdrawBalanceContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_WITHDRAW_BALANCE2)))
          .addMethod(
            getUpdateAssetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_UPDATE_ASSET)))
          .addMethod(
            getUpdateAsset2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_UPDATE_ASSET2)))
          .addMethod(
            getProposalCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.ProposalContract.ProposalCreateContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_PROPOSAL_CREATE)))
          .addMethod(
            getProposalApproveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.ProposalContract.ProposalApproveContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_PROPOSAL_APPROVE)))
          .addMethod(
            getProposalDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.ProposalContract.ProposalDeleteContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_PROPOSAL_DELETE)))
          .addMethod(
            getBuyStorageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.StorageContract.BuyStorageContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_BUY_STORAGE)))
          .addMethod(
            getBuyStorageBytesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.StorageContract.BuyStorageBytesContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_BUY_STORAGE_BYTES)))
          .addMethod(
            getSellStorageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.StorageContract.SellStorageContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_SELL_STORAGE)))
          .addMethod(
            getExchangeCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.ExchangeContract.ExchangeCreateContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_EXCHANGE_CREATE)))
          .addMethod(
            getExchangeInjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.ExchangeContract.ExchangeInjectContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_EXCHANGE_INJECT)))
          .addMethod(
            getExchangeWithdrawMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.ExchangeContract.ExchangeWithdrawContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_EXCHANGE_WITHDRAW)))
          .addMethod(
            getExchangeTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.ExchangeContract.ExchangeTransactionContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_EXCHANGE_TRANSACTION)))
          .addMethod(
            getMarketSellAssetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.MarketContract.MarketSellAssetContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_MARKET_SELL_ASSET)))
          .addMethod(
            getMarketCancelOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.MarketContract.MarketCancelOrderContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_MARKET_CANCEL_ORDER)))
          .addMethod(
            getGetMarketOrderByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.protos.Protocol.MarketOrder>(
                  this, METHODID_GET_MARKET_ORDER_BY_ID)))
          .addMethod(
            getGetMarketOrderByAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.protos.Protocol.MarketOrderList>(
                  this, METHODID_GET_MARKET_ORDER_BY_ACCOUNT)))
          .addMethod(
            getGetMarketPriceByPairMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.MarketOrderPair,
                org.tron.protos.Protocol.MarketPriceList>(
                  this, METHODID_GET_MARKET_PRICE_BY_PAIR)))
          .addMethod(
            getGetMarketOrderListByPairMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.MarketOrderPair,
                org.tron.protos.Protocol.MarketOrderList>(
                  this, METHODID_GET_MARKET_ORDER_LIST_BY_PAIR)))
          .addMethod(
            getGetMarketPairListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.protos.Protocol.MarketOrderPairList>(
                  this, METHODID_GET_MARKET_PAIR_LIST)))
          .addMethod(
            getListNodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.api.GrpcAPI.NodeList>(
                  this, METHODID_LIST_NODES)))
          .addMethod(
            getGetAssetIssueByAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.Account,
                org.tron.api.GrpcAPI.AssetIssueList>(
                  this, METHODID_GET_ASSET_ISSUE_BY_ACCOUNT)))
          .addMethod(
            getGetAccountNetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.Account,
                org.tron.api.GrpcAPI.AccountNetMessage>(
                  this, METHODID_GET_ACCOUNT_NET)))
          .addMethod(
            getGetAccountResourceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.Account,
                org.tron.api.GrpcAPI.AccountResourceMessage>(
                  this, METHODID_GET_ACCOUNT_RESOURCE)))
          .addMethod(
            getGetAssetIssueByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract>(
                  this, METHODID_GET_ASSET_ISSUE_BY_NAME)))
          .addMethod(
            getGetAssetIssueListByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.api.GrpcAPI.AssetIssueList>(
                  this, METHODID_GET_ASSET_ISSUE_LIST_BY_NAME)))
          .addMethod(
            getGetAssetIssueByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract>(
                  this, METHODID_GET_ASSET_ISSUE_BY_ID)))
          .addMethod(
            getGetNowBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.protos.Protocol.Block>(
                  this, METHODID_GET_NOW_BLOCK)))
          .addMethod(
            getGetNowBlock2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.api.GrpcAPI.BlockExtention>(
                  this, METHODID_GET_NOW_BLOCK2)))
          .addMethod(
            getGetBlockByNumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.NumberMessage,
                org.tron.protos.Protocol.Block>(
                  this, METHODID_GET_BLOCK_BY_NUM)))
          .addMethod(
            getGetBlockByNum2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.NumberMessage,
                org.tron.api.GrpcAPI.BlockExtention>(
                  this, METHODID_GET_BLOCK_BY_NUM2)))
          .addMethod(
            getGetTransactionCountByBlockNumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.NumberMessage,
                org.tron.api.GrpcAPI.NumberMessage>(
                  this, METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM)))
          .addMethod(
            getGetBlockByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.protos.Protocol.Block>(
                  this, METHODID_GET_BLOCK_BY_ID)))
          .addMethod(
            getGetBlockByLimitNextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BlockLimit,
                org.tron.api.GrpcAPI.BlockList>(
                  this, METHODID_GET_BLOCK_BY_LIMIT_NEXT)))
          .addMethod(
            getGetBlockByLimitNext2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BlockLimit,
                org.tron.api.GrpcAPI.BlockListExtention>(
                  this, METHODID_GET_BLOCK_BY_LIMIT_NEXT2)))
          .addMethod(
            getGetBlockByLatestNumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.NumberMessage,
                org.tron.api.GrpcAPI.BlockList>(
                  this, METHODID_GET_BLOCK_BY_LATEST_NUM)))
          .addMethod(
            getGetBlockByLatestNum2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.NumberMessage,
                org.tron.api.GrpcAPI.BlockListExtention>(
                  this, METHODID_GET_BLOCK_BY_LATEST_NUM2)))
          .addMethod(
            getGetTransactionByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_GET_TRANSACTION_BY_ID)))
          .addMethod(
            getDeployContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.SmartContractOuterClass.CreateSmartContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_DEPLOY_CONTRACT)))
          .addMethod(
            getGetContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.protos.contract.SmartContractOuterClass.SmartContract>(
                  this, METHODID_GET_CONTRACT)))
          .addMethod(
            getGetContractInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.protos.contract.SmartContractOuterClass.SmartContractDataWrapper>(
                  this, METHODID_GET_CONTRACT_INFO)))
          .addMethod(
            getTriggerContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_TRIGGER_CONTRACT)))
          .addMethod(
            getTriggerConstantContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_TRIGGER_CONSTANT_CONTRACT)))
          .addMethod(
            getClearContractABIMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.SmartContractOuterClass.ClearABIContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_CLEAR_CONTRACT_ABI)))
          .addMethod(
            getListWitnessesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.api.GrpcAPI.WitnessList>(
                  this, METHODID_LIST_WITNESSES)))
          .addMethod(
            getGetDelegatedResourceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.DelegatedResourceMessage,
                org.tron.api.GrpcAPI.DelegatedResourceList>(
                  this, METHODID_GET_DELEGATED_RESOURCE)))
          .addMethod(
            getGetDelegatedResourceAccountIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.protos.Protocol.DelegatedResourceAccountIndex>(
                  this, METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX)))
          .addMethod(
            getListProposalsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.api.GrpcAPI.ProposalList>(
                  this, METHODID_LIST_PROPOSALS)))
          .addMethod(
            getGetPaginatedProposalListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.PaginatedMessage,
                org.tron.api.GrpcAPI.ProposalList>(
                  this, METHODID_GET_PAGINATED_PROPOSAL_LIST)))
          .addMethod(
            getGetProposalByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.protos.Protocol.Proposal>(
                  this, METHODID_GET_PROPOSAL_BY_ID)))
          .addMethod(
            getListExchangesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.api.GrpcAPI.ExchangeList>(
                  this, METHODID_LIST_EXCHANGES)))
          .addMethod(
            getGetPaginatedExchangeListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.PaginatedMessage,
                org.tron.api.GrpcAPI.ExchangeList>(
                  this, METHODID_GET_PAGINATED_EXCHANGE_LIST)))
          .addMethod(
            getGetExchangeByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.protos.Protocol.Exchange>(
                  this, METHODID_GET_EXCHANGE_BY_ID)))
          .addMethod(
            getGetChainParametersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.protos.Protocol.ChainParameters>(
                  this, METHODID_GET_CHAIN_PARAMETERS)))
          .addMethod(
            getGetAssetIssueListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.api.GrpcAPI.AssetIssueList>(
                  this, METHODID_GET_ASSET_ISSUE_LIST)))
          .addMethod(
            getGetPaginatedAssetIssueListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.PaginatedMessage,
                org.tron.api.GrpcAPI.AssetIssueList>(
                  this, METHODID_GET_PAGINATED_ASSET_ISSUE_LIST)))
          .addMethod(
            getTotalTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.api.GrpcAPI.NumberMessage>(
                  this, METHODID_TOTAL_TRANSACTION)))
          .addMethod(
            getGetNextMaintenanceTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.api.GrpcAPI.NumberMessage>(
                  this, METHODID_GET_NEXT_MAINTENANCE_TIME)))
          .addMethod(
            getGetTransactionSignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.TransactionSign,
                org.tron.protos.Protocol.Transaction>(
                  this, METHODID_GET_TRANSACTION_SIGN)))
          .addMethod(
            getGetTransactionSign2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.TransactionSign,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_GET_TRANSACTION_SIGN2)))
          .addMethod(
            getCreateAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.api.GrpcAPI.BytesMessage>(
                  this, METHODID_CREATE_ADDRESS)))
          .addMethod(
            getEasyTransferAssetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EasyTransferAssetMessage,
                org.tron.api.GrpcAPI.EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER_ASSET)))
          .addMethod(
            getEasyTransferAssetByPrivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EasyTransferAssetByPrivateMessage,
                org.tron.api.GrpcAPI.EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE)))
          .addMethod(
            getEasyTransferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EasyTransferMessage,
                org.tron.api.GrpcAPI.EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER)))
          .addMethod(
            getEasyTransferByPrivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EasyTransferByPrivateMessage,
                org.tron.api.GrpcAPI.EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER_BY_PRIVATE)))
          .addMethod(
            getGenerateAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.api.GrpcAPI.AddressPrKeyPairMessage>(
                  this, METHODID_GENERATE_ADDRESS)))
          .addMethod(
            getGetTransactionInfoByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.protos.Protocol.TransactionInfo>(
                  this, METHODID_GET_TRANSACTION_INFO_BY_ID)))
          .addMethod(
            getAccountPermissionUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.AccountContract.AccountPermissionUpdateContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_ACCOUNT_PERMISSION_UPDATE)))
          .addMethod(
            getAddSignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.TransactionSign,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_ADD_SIGN)))
          .addMethod(
            getGetTransactionSignWeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.Transaction,
                org.tron.api.GrpcAPI.TransactionSignWeight>(
                  this, METHODID_GET_TRANSACTION_SIGN_WEIGHT)))
          .addMethod(
            getGetTransactionApprovedListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.Transaction,
                org.tron.api.GrpcAPI.TransactionApprovedList>(
                  this, METHODID_GET_TRANSACTION_APPROVED_LIST)))
          .addMethod(
            getGetNodeInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.protos.Protocol.NodeInfo>(
                  this, METHODID_GET_NODE_INFO)))
          .addMethod(
            getGetRewardInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.api.GrpcAPI.NumberMessage>(
                  this, METHODID_GET_REWARD_INFO)))
          .addMethod(
            getGetBrokerageInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.api.GrpcAPI.NumberMessage>(
                  this, METHODID_GET_BROKERAGE_INFO)))
          .addMethod(
            getUpdateBrokerageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.StorageContract.UpdateBrokerageContract,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_UPDATE_BROKERAGE)))
          .addMethod(
            getCreateShieldedTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.PrivateParameters,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_CREATE_SHIELDED_TRANSACTION)))
          .addMethod(
            getGetMerkleTreeVoucherInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.contract.ShieldContract.OutputPointInfo,
                org.tron.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo>(
                  this, METHODID_GET_MERKLE_TREE_VOUCHER_INFO)))
          .addMethod(
            getScanNoteByIvkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.IvkDecryptParameters,
                org.tron.api.GrpcAPI.DecryptNotes>(
                  this, METHODID_SCAN_NOTE_BY_IVK)))
          .addMethod(
            getScanAndMarkNoteByIvkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.IvkDecryptAndMarkParameters,
                org.tron.api.GrpcAPI.DecryptNotesMarked>(
                  this, METHODID_SCAN_AND_MARK_NOTE_BY_IVK)))
          .addMethod(
            getScanNoteByOvkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.OvkDecryptParameters,
                org.tron.api.GrpcAPI.DecryptNotes>(
                  this, METHODID_SCAN_NOTE_BY_OVK)))
          .addMethod(
            getGetSpendingKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_SPENDING_KEY)))
          .addMethod(
            getGetExpandedSpendingKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.api.GrpcAPI.ExpandedSpendingKeyMessage>(
                  this, METHODID_GET_EXPANDED_SPENDING_KEY)))
          .addMethod(
            getGetAkFromAskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_AK_FROM_ASK)))
          .addMethod(
            getGetNkFromNskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.BytesMessage,
                org.tron.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_NK_FROM_NSK)))
          .addMethod(
            getGetIncomingViewingKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.ViewingKeyMessage,
                org.tron.api.GrpcAPI.IncomingViewingKeyMessage>(
                  this, METHODID_GET_INCOMING_VIEWING_KEY)))
          .addMethod(
            getGetDiversifierMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.api.GrpcAPI.DiversifierMessage>(
                  this, METHODID_GET_DIVERSIFIER)))
          .addMethod(
            getGetNewShieldedAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.api.GrpcAPI.ShieldedAddressInfo>(
                  this, METHODID_GET_NEW_SHIELDED_ADDRESS)))
          .addMethod(
            getGetZenPaymentAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.IncomingViewingKeyDiversifierMessage,
                org.tron.api.GrpcAPI.PaymentAddressMessage>(
                  this, METHODID_GET_ZEN_PAYMENT_ADDRESS)))
          .addMethod(
            getGetRcmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_RCM)))
          .addMethod(
            getIsSpendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.NoteParameters,
                org.tron.api.GrpcAPI.SpendResult>(
                  this, METHODID_IS_SPEND)))
          .addMethod(
            getCreateShieldedTransactionWithoutSpendAuthSigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.PrivateParametersWithoutAsk,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_CREATE_SHIELDED_TRANSACTION_WITHOUT_SPEND_AUTH_SIG)))
          .addMethod(
            getGetShieldTransactionHashMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.Transaction,
                org.tron.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_SHIELD_TRANSACTION_HASH)))
          .addMethod(
            getCreateSpendAuthSigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.SpendAuthSigParameters,
                org.tron.api.GrpcAPI.BytesMessage>(
                  this, METHODID_CREATE_SPEND_AUTH_SIG)))
          .addMethod(
            getCreateShieldNullifierMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.NfParameters,
                org.tron.api.GrpcAPI.BytesMessage>(
                  this, METHODID_CREATE_SHIELD_NULLIFIER)))
          .addMethod(
            getCreateShieldedContractParametersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.PrivateShieldedTRC20Parameters,
                org.tron.api.GrpcAPI.ShieldedTRC20Parameters>(
                  this, METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS)))
          .addMethod(
            getCreateShieldedContractParametersWithoutAskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
                org.tron.api.GrpcAPI.ShieldedTRC20Parameters>(
                  this, METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK)))
          .addMethod(
            getScanShieldedTRC20NotesByIvkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.IvkDecryptTRC20Parameters,
                org.tron.api.GrpcAPI.DecryptNotesTRC20>(
                  this, METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK)))
          .addMethod(
            getScanShieldedTRC20NotesByOvkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.OvkDecryptTRC20Parameters,
                org.tron.api.GrpcAPI.DecryptNotesTRC20>(
                  this, METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK)))
          .addMethod(
            getIsShieldedTRC20ContractNoteSpentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.NfTRC20Parameters,
                org.tron.api.GrpcAPI.NullifierResult>(
                  this, METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT)))
          .addMethod(
            getGetTriggerInputForShieldedTRC20ContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.ShieldedTRC20TriggerContractParameters,
                org.tron.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT)))
          .addMethod(
            getCreateCommonTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.protos.Protocol.Transaction,
                org.tron.api.GrpcAPI.TransactionExtention>(
                  this, METHODID_CREATE_COMMON_TRANSACTION)))
          .addMethod(
            getGetTransactionInfoByBlockNumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.NumberMessage,
                org.tron.api.GrpcAPI.TransactionInfoList>(
                  this, METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM)))
          .addMethod(
            getGetBurnTrxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.tron.api.GrpcAPI.EmptyMessage,
                org.tron.api.GrpcAPI.NumberMessage>(
                  this, METHODID_GET_BURN_TRX)))
          .build();
    }
  }

  /**
   */
  public static final class WalletStub extends io.grpc.stub.AbstractStub<WalletStub> {
    private WalletStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletStub(channel, callOptions);
    }

    /**
     */
    public void getAccount(org.tron.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Account> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountById(org.tron.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Account> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountBalance(org.tron.protos.contract.BalanceContract.AccountBalanceRequest request,
        io.grpc.stub.StreamObserver<org.tron.protos.contract.BalanceContract.AccountBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockBalanceTrace(org.tron.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier request,
        io.grpc.stub.StreamObserver<org.tron.protos.contract.BalanceContract.BlockBalanceTrace> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockBalanceTraceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use CreateTransaction2 instead of this function.
     * </pre>
     */
    public void createTransaction(org.tron.protos.contract.BalanceContract.TransferContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateTransaction.
     * </pre>
     */
    public void createTransaction2(org.tron.protos.contract.BalanceContract.TransferContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTransaction2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void broadcastTransaction(org.tron.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.Return> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use UpdateAccount2 instead of this function.
     * </pre>
     */
    public void updateAccount(org.tron.protos.contract.AccountContract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAccountId(org.tron.protos.contract.AccountContract.SetAccountIdContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccountIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAccount.
     * </pre>
     */
    public void updateAccount2(org.tron.protos.contract.AccountContract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccount2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use VoteWitnessAccount2 instead of this function.
     * </pre>
     */
    public void voteWitnessAccount(org.tron.protos.contract.WitnessContract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoteWitnessAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *modify the consume_user_resource_percent
     * </pre>
     */
    public void updateSetting(org.tron.protos.contract.SmartContractOuterClass.UpdateSettingContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *modify the energy_limit
     * </pre>
     */
    public void updateEnergyLimit(org.tron.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateEnergyLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of VoteWitnessAccount.
     * </pre>
     */
    public void voteWitnessAccount2(org.tron.protos.contract.WitnessContract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoteWitnessAccount2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use CreateAssetIssue2 instead of this function.
     * </pre>
     */
    public void createAssetIssue(org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAssetIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateAssetIssue.
     * </pre>
     */
    public void createAssetIssue2(org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAssetIssue2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use UpdateWitness2 instead of this function.
     * </pre>
     */
    public void updateWitness(org.tron.protos.contract.WitnessContract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateWitnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UpdateWitness.
     * </pre>
     */
    public void updateWitness2(org.tron.protos.contract.WitnessContract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateWitness2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use CreateAccount2 instead of this function.
     * </pre>
     */
    public void createAccount(org.tron.protos.contract.AccountContract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateAccount.
     * </pre>
     */
    public void createAccount2(org.tron.protos.contract.AccountContract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAccount2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use CreateWitness2 instead of this function.
     * </pre>
     */
    public void createWitness(org.tron.protos.contract.WitnessContract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateWitnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateWitness.
     * </pre>
     */
    public void createWitness2(org.tron.protos.contract.WitnessContract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateWitness2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use TransferAsset2 instead of this function.
     * </pre>
     */
    public void transferAsset(org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransferAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of TransferAsset.
     * </pre>
     */
    public void transferAsset2(org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransferAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use ParticipateAssetIssue2 instead of this function.
     * </pre>
     */
    public void participateAssetIssue(org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParticipateAssetIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of ParticipateAssetIssue.
     * </pre>
     */
    public void participateAssetIssue2(org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParticipateAssetIssue2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use FreezeBalance2 instead of this function.
     * </pre>
     */
    public void freezeBalance(org.tron.protos.contract.BalanceContract.FreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFreezeBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of FreezeBalance.
     * </pre>
     */
    public void freezeBalance2(org.tron.protos.contract.BalanceContract.FreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFreezeBalance2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use UnfreezeBalance2 instead of this function.
     * </pre>
     */
    public void unfreezeBalance(org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnfreezeBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeBalance.
     * </pre>
     */
    public void unfreezeBalance2(org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnfreezeBalance2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use UnfreezeAsset2 instead of this function.
     * </pre>
     */
    public void unfreezeAsset(org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnfreezeAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeAsset.
     * </pre>
     */
    public void unfreezeAsset2(org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnfreezeAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use WithdrawBalance2 instead of this function.
     * </pre>
     */
    public void withdrawBalance(org.tron.protos.contract.BalanceContract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of WithdrawBalance.
     * </pre>
     */
    public void withdrawBalance2(org.tron.protos.contract.BalanceContract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawBalance2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use UpdateAsset2 instead of this function.
     * </pre>
     */
    public void updateAsset(org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAsset.
     * </pre>
     */
    public void updateAsset2(org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalCreate(org.tron.protos.contract.ProposalContract.ProposalCreateContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProposalCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalApprove(org.tron.protos.contract.ProposalContract.ProposalApproveContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProposalApproveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalDelete(org.tron.protos.contract.ProposalContract.ProposalDeleteContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProposalDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buyStorage(org.tron.protos.contract.StorageContract.BuyStorageContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBuyStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buyStorageBytes(org.tron.protos.contract.StorageContract.BuyStorageBytesContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBuyStorageBytesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sellStorage(org.tron.protos.contract.StorageContract.SellStorageContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSellStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeCreate(org.tron.protos.contract.ExchangeContract.ExchangeCreateContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeInject(org.tron.protos.contract.ExchangeContract.ExchangeInjectContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeInjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeWithdraw(org.tron.protos.contract.ExchangeContract.ExchangeWithdrawContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeTransaction(org.tron.protos.contract.ExchangeContract.ExchangeTransactionContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void marketSellAsset(org.tron.protos.contract.MarketContract.MarketSellAssetContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMarketSellAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void marketCancelOrder(org.tron.protos.contract.MarketContract.MarketCancelOrderContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMarketCancelOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketOrderById(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketOrder> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketOrderByAccount(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketOrderList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketPriceByPair(org.tron.protos.Protocol.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketPriceList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketPriceByPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketOrderListByPair(org.tron.protos.Protocol.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketOrderList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderListByPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketPairList(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketOrderPairList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketPairListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNodes(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NodeList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueByAccount(org.tron.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AssetIssueList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountNet(org.tron.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AccountNetMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountNetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountResource(org.tron.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AccountResourceMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueByName(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueListByName(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AssetIssueList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueListByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueById(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use GetNowBlock2 instead of this function.
     * </pre>
     */
    public void getNowBlock(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Block> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetNowBlock.
     * </pre>
     */
    public void getNowBlock2(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNowBlock2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use GetBlockByNum2 instead of this function.
     * </pre>
     */
    public void getBlockByNum(org.tron.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Block> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public void getBlockByNum2(org.tron.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByNum2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionCountByBlockNum(org.tron.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionCountByBlockNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockById(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Block> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use GetBlockByLimitNext2 instead of this function.
     * </pre>
     */
    public void getBlockByLimitNext(org.tron.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByLimitNextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLimitNext.
     * </pre>
     */
    public void getBlockByLimitNext2(org.tron.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockListExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByLimitNext2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use GetBlockByLatestNum2 instead of this function.
     * </pre>
     */
    public void getBlockByLatestNum(org.tron.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByLatestNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLatestNum.
     * </pre>
     */
    public void getBlockByLatestNum2(org.tron.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockListExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByLatestNum2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionById(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deployContract(org.tron.protos.contract.SmartContractOuterClass.CreateSmartContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeployContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContract(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.contract.SmartContractOuterClass.SmartContract> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContractInfo(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.contract.SmartContractOuterClass.SmartContractDataWrapper> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContractInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerContract(org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTriggerContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerConstantContract(org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTriggerConstantContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearContractABI(org.tron.protos.contract.SmartContractOuterClass.ClearABIContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearContractABIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWitnesses(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.WitnessList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListWitnessesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResource(org.tron.api.GrpcAPI.DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DelegatedResourceList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResourceAccountIndex(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.DelegatedResourceAccountIndex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProposals(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ProposalList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListProposalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedProposalList(org.tron.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ProposalList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPaginatedProposalListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProposalById(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Proposal> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProposalByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listExchanges(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ExchangeList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListExchangesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedExchangeList(org.tron.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ExchangeList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPaginatedExchangeListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExchangeById(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Exchange> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExchangeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChainParameters(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.ChainParameters> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetChainParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueList(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AssetIssueList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedAssetIssueList(org.tron.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AssetIssueList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPaginatedAssetIssueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalTransaction(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTotalTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNextMaintenanceTime(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNextMaintenanceTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     *Please use GetTransactionSign2 instead of this function.
     * </pre>
     */
    public void getTransactionSign(org.tron.protos.Protocol.TransactionSign request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     *Use this function instead of GetTransactionSign.
     * </pre>
     */
    public void getTransactionSign2(org.tron.protos.Protocol.TransactionSign request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionSign2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public void createAddress(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public void easyTransferAsset(org.tron.api.GrpcAPI.EasyTransferAssetMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEasyTransferAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public void easyTransferAssetByPrivate(org.tron.api.GrpcAPI.EasyTransferAssetByPrivateMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEasyTransferAssetByPrivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public void easyTransfer(org.tron.api.GrpcAPI.EasyTransferMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEasyTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public void easyTransferByPrivate(org.tron.api.GrpcAPI.EasyTransferByPrivateMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEasyTransferByPrivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public void generateAddress(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AddressPrKeyPairMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionInfoById(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.TransactionInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionInfoByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accountPermissionUpdate(org.tron.protos.contract.AccountContract.AccountPermissionUpdateContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountPermissionUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSign(org.tron.protos.Protocol.TransactionSign request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionSignWeight(org.tron.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionSignWeight> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionSignWeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionApprovedList(org.tron.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionApprovedList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionApprovedListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNodeInfo(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.protos.Protocol.NodeInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRewardInfo(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRewardInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBrokerageInfo(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBrokerageInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBrokerage(org.tron.protos.contract.StorageContract.UpdateBrokerageContract request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBrokerageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * for shiededTransaction
     * </pre>
     */
    public void createShieldedTransaction(org.tron.api.GrpcAPI.PrivateParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateShieldedTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMerkleTreeVoucherInfo(org.tron.protos.contract.ShieldContract.OutputPointInfo request,
        io.grpc.stub.StreamObserver<org.tron.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMerkleTreeVoucherInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanNoteByIvk(org.tron.api.GrpcAPI.IvkDecryptParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScanNoteByIvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanAndMarkNoteByIvk(org.tron.api.GrpcAPI.IvkDecryptAndMarkParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotesMarked> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScanAndMarkNoteByIvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanNoteByOvk(org.tron.api.GrpcAPI.OvkDecryptParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScanNoteByOvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSpendingKey(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSpendingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExpandedSpendingKey(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ExpandedSpendingKeyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExpandedSpendingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAkFromAsk(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAkFromAskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNkFromNsk(org.tron.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNkFromNskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIncomingViewingKey(org.tron.api.GrpcAPI.ViewingKeyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.IncomingViewingKeyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIncomingViewingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDiversifier(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DiversifierMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDiversifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNewShieldedAddress(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ShieldedAddressInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNewShieldedAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZenPaymentAddress(org.tron.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.PaymentAddressMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetZenPaymentAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRcm(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRcmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isSpend(org.tron.api.GrpcAPI.NoteParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.SpendResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsSpendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createShieldedTransactionWithoutSpendAuthSig(org.tron.api.GrpcAPI.PrivateParametersWithoutAsk request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateShieldedTransactionWithoutSpendAuthSigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getShieldTransactionHash(org.tron.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetShieldTransactionHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSpendAuthSig(org.tron.api.GrpcAPI.SpendAuthSigParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSpendAuthSigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createShieldNullifier(org.tron.api.GrpcAPI.NfParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateShieldNullifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *for shielded contract
     * </pre>
     */
    public void createShieldedContractParameters(org.tron.api.GrpcAPI.PrivateShieldedTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createShieldedContractParametersWithoutAsk(org.tron.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanShieldedTRC20NotesByIvk(org.tron.api.GrpcAPI.IvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotesTRC20> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByIvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanShieldedTRC20NotesByOvk(org.tron.api.GrpcAPI.OvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotesTRC20> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByOvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isShieldedTRC20ContractNoteSpent(org.tron.api.GrpcAPI.NfTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NullifierResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTriggerInputForShieldedTRC20Contract(org.tron.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCommonTransaction(org.tron.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCommonTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionInfoByBlockNum(org.tron.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionInfoList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionInfoByBlockNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBurnTrx(org.tron.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBurnTrxMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WalletBlockingStub extends io.grpc.stub.AbstractStub<WalletBlockingStub> {
    private WalletBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.tron.protos.Protocol.Account getAccount(org.tron.protos.Protocol.Account request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.Account getAccountById(org.tron.protos.Protocol.Account request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.contract.BalanceContract.AccountBalanceResponse getAccountBalance(org.tron.protos.contract.BalanceContract.AccountBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.contract.BalanceContract.BlockBalanceTrace getBlockBalanceTrace(org.tron.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockBalanceTraceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use CreateTransaction2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction createTransaction(org.tron.protos.contract.BalanceContract.TransferContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateTransaction.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention createTransaction2(org.tron.protos.contract.BalanceContract.TransferContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateTransaction2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.Return broadcastTransaction(org.tron.protos.Protocol.Transaction request) {
      return blockingUnaryCall(
          getChannel(), getBroadcastTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use UpdateAccount2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction updateAccount(org.tron.protos.contract.AccountContract.AccountUpdateContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.Transaction setAccountId(org.tron.protos.contract.AccountContract.SetAccountIdContract request) {
      return blockingUnaryCall(
          getChannel(), getSetAccountIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAccount.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention updateAccount2(org.tron.protos.contract.AccountContract.AccountUpdateContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccount2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use VoteWitnessAccount2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction voteWitnessAccount(org.tron.protos.contract.WitnessContract.VoteWitnessContract request) {
      return blockingUnaryCall(
          getChannel(), getVoteWitnessAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *modify the consume_user_resource_percent
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention updateSetting(org.tron.protos.contract.SmartContractOuterClass.UpdateSettingContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSettingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *modify the energy_limit
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention updateEnergyLimit(org.tron.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateEnergyLimitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of VoteWitnessAccount.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention voteWitnessAccount2(org.tron.protos.contract.WitnessContract.VoteWitnessContract request) {
      return blockingUnaryCall(
          getChannel(), getVoteWitnessAccount2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use CreateAssetIssue2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction createAssetIssue(org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateAssetIssueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateAssetIssue.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention createAssetIssue2(org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateAssetIssue2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use UpdateWitness2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction updateWitness(org.tron.protos.contract.WitnessContract.WitnessUpdateContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateWitnessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of UpdateWitness.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention updateWitness2(org.tron.protos.contract.WitnessContract.WitnessUpdateContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateWitness2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use CreateAccount2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction createAccount(org.tron.protos.contract.AccountContract.AccountCreateContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateAccount.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention createAccount2(org.tron.protos.contract.AccountContract.AccountCreateContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateAccount2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use CreateWitness2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction createWitness(org.tron.protos.contract.WitnessContract.WitnessCreateContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateWitnessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateWitness.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention createWitness2(org.tron.protos.contract.WitnessContract.WitnessCreateContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateWitness2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use TransferAsset2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction transferAsset(org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request) {
      return blockingUnaryCall(
          getChannel(), getTransferAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of TransferAsset.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention transferAsset2(org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request) {
      return blockingUnaryCall(
          getChannel(), getTransferAsset2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use ParticipateAssetIssue2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction participateAssetIssue(org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request) {
      return blockingUnaryCall(
          getChannel(), getParticipateAssetIssueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of ParticipateAssetIssue.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention participateAssetIssue2(org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request) {
      return blockingUnaryCall(
          getChannel(), getParticipateAssetIssue2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use FreezeBalance2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction freezeBalance(org.tron.protos.contract.BalanceContract.FreezeBalanceContract request) {
      return blockingUnaryCall(
          getChannel(), getFreezeBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of FreezeBalance.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention freezeBalance2(org.tron.protos.contract.BalanceContract.FreezeBalanceContract request) {
      return blockingUnaryCall(
          getChannel(), getFreezeBalance2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use UnfreezeBalance2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction unfreezeBalance(org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract request) {
      return blockingUnaryCall(
          getChannel(), getUnfreezeBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeBalance.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention unfreezeBalance2(org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract request) {
      return blockingUnaryCall(
          getChannel(), getUnfreezeBalance2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use UnfreezeAsset2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction unfreezeAsset(org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request) {
      return blockingUnaryCall(
          getChannel(), getUnfreezeAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeAsset.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention unfreezeAsset2(org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request) {
      return blockingUnaryCall(
          getChannel(), getUnfreezeAsset2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use WithdrawBalance2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction withdrawBalance(org.tron.protos.contract.BalanceContract.WithdrawBalanceContract request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of WithdrawBalance.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention withdrawBalance2(org.tron.protos.contract.BalanceContract.WithdrawBalanceContract request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawBalance2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use UpdateAsset2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction updateAsset(org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAsset.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention updateAsset2(org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAsset2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention proposalCreate(org.tron.protos.contract.ProposalContract.ProposalCreateContract request) {
      return blockingUnaryCall(
          getChannel(), getProposalCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention proposalApprove(org.tron.protos.contract.ProposalContract.ProposalApproveContract request) {
      return blockingUnaryCall(
          getChannel(), getProposalApproveMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention proposalDelete(org.tron.protos.contract.ProposalContract.ProposalDeleteContract request) {
      return blockingUnaryCall(
          getChannel(), getProposalDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention buyStorage(org.tron.protos.contract.StorageContract.BuyStorageContract request) {
      return blockingUnaryCall(
          getChannel(), getBuyStorageMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention buyStorageBytes(org.tron.protos.contract.StorageContract.BuyStorageBytesContract request) {
      return blockingUnaryCall(
          getChannel(), getBuyStorageBytesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention sellStorage(org.tron.protos.contract.StorageContract.SellStorageContract request) {
      return blockingUnaryCall(
          getChannel(), getSellStorageMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention exchangeCreate(org.tron.protos.contract.ExchangeContract.ExchangeCreateContract request) {
      return blockingUnaryCall(
          getChannel(), getExchangeCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention exchangeInject(org.tron.protos.contract.ExchangeContract.ExchangeInjectContract request) {
      return blockingUnaryCall(
          getChannel(), getExchangeInjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention exchangeWithdraw(org.tron.protos.contract.ExchangeContract.ExchangeWithdrawContract request) {
      return blockingUnaryCall(
          getChannel(), getExchangeWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention exchangeTransaction(org.tron.protos.contract.ExchangeContract.ExchangeTransactionContract request) {
      return blockingUnaryCall(
          getChannel(), getExchangeTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention marketSellAsset(org.tron.protos.contract.MarketContract.MarketSellAssetContract request) {
      return blockingUnaryCall(
          getChannel(), getMarketSellAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention marketCancelOrder(org.tron.protos.contract.MarketContract.MarketCancelOrderContract request) {
      return blockingUnaryCall(
          getChannel(), getMarketCancelOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.MarketOrder getMarketOrderById(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketOrderByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.MarketOrderList getMarketOrderByAccount(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketOrderByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.MarketPriceList getMarketPriceByPair(org.tron.protos.Protocol.MarketOrderPair request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketPriceByPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.MarketOrderList getMarketOrderListByPair(org.tron.protos.Protocol.MarketOrderPair request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketOrderListByPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.MarketOrderPairList getMarketPairList(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketPairListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.NodeList listNodes(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getListNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.AssetIssueList getAssetIssueByAccount(org.tron.protos.Protocol.Account request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.AccountNetMessage getAccountNet(org.tron.protos.Protocol.Account request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountNetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.AccountResourceMessage getAccountResource(org.tron.protos.Protocol.Account request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract getAssetIssueByName(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.AssetIssueList getAssetIssueListByName(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueListByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract getAssetIssueById(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use GetNowBlock2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Block getNowBlock(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNowBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of GetNowBlock.
     * </pre>
     */
    public org.tron.api.GrpcAPI.BlockExtention getNowBlock2(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNowBlock2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use GetBlockByNum2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Block getBlockByNum(org.tron.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByNumMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public org.tron.api.GrpcAPI.BlockExtention getBlockByNum2(org.tron.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByNum2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.NumberMessage getTransactionCountByBlockNum(org.tron.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionCountByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.Block getBlockById(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use GetBlockByLimitNext2 instead of this function.
     * </pre>
     */
    public org.tron.api.GrpcAPI.BlockList getBlockByLimitNext(org.tron.api.GrpcAPI.BlockLimit request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByLimitNextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLimitNext.
     * </pre>
     */
    public org.tron.api.GrpcAPI.BlockListExtention getBlockByLimitNext2(org.tron.api.GrpcAPI.BlockLimit request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByLimitNext2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use GetBlockByLatestNum2 instead of this function.
     * </pre>
     */
    public org.tron.api.GrpcAPI.BlockList getBlockByLatestNum(org.tron.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByLatestNumMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLatestNum.
     * </pre>
     */
    public org.tron.api.GrpcAPI.BlockListExtention getBlockByLatestNum2(org.tron.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByLatestNum2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.Transaction getTransactionById(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention deployContract(org.tron.protos.contract.SmartContractOuterClass.CreateSmartContract request) {
      return blockingUnaryCall(
          getChannel(), getDeployContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.contract.SmartContractOuterClass.SmartContract getContract(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.contract.SmartContractOuterClass.SmartContractDataWrapper getContractInfo(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetContractInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention triggerContract(org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract request) {
      return blockingUnaryCall(
          getChannel(), getTriggerContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention triggerConstantContract(org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract request) {
      return blockingUnaryCall(
          getChannel(), getTriggerConstantContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention clearContractABI(org.tron.protos.contract.SmartContractOuterClass.ClearABIContract request) {
      return blockingUnaryCall(
          getChannel(), getClearContractABIMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.WitnessList listWitnesses(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getListWitnessesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.DelegatedResourceList getDelegatedResource(org.tron.api.GrpcAPI.DelegatedResourceMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetDelegatedResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.DelegatedResourceAccountIndex getDelegatedResourceAccountIndex(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetDelegatedResourceAccountIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.ProposalList listProposals(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getListProposalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.ProposalList getPaginatedProposalList(org.tron.api.GrpcAPI.PaginatedMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetPaginatedProposalListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.Proposal getProposalById(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetProposalByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.ExchangeList listExchanges(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getListExchangesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.ExchangeList getPaginatedExchangeList(org.tron.api.GrpcAPI.PaginatedMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetPaginatedExchangeListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.Exchange getExchangeById(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetExchangeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.ChainParameters getChainParameters(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetChainParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.AssetIssueList getAssetIssueList(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.AssetIssueList getPaginatedAssetIssueList(org.tron.api.GrpcAPI.PaginatedMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetPaginatedAssetIssueListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.NumberMessage totalTransaction(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getTotalTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.NumberMessage getNextMaintenanceTime(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNextMaintenanceTimeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     *Please use GetTransactionSign2 instead of this function.
     * </pre>
     */
    public org.tron.protos.Protocol.Transaction getTransactionSign(org.tron.protos.Protocol.TransactionSign request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionSignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     *Use this function instead of GetTransactionSign.
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention getTransactionSign2(org.tron.protos.Protocol.TransactionSign request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionSign2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public org.tron.api.GrpcAPI.BytesMessage createAddress(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getCreateAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public org.tron.api.GrpcAPI.EasyTransferResponse easyTransferAsset(org.tron.api.GrpcAPI.EasyTransferAssetMessage request) {
      return blockingUnaryCall(
          getChannel(), getEasyTransferAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public org.tron.api.GrpcAPI.EasyTransferResponse easyTransferAssetByPrivate(org.tron.api.GrpcAPI.EasyTransferAssetByPrivateMessage request) {
      return blockingUnaryCall(
          getChannel(), getEasyTransferAssetByPrivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public org.tron.api.GrpcAPI.EasyTransferResponse easyTransfer(org.tron.api.GrpcAPI.EasyTransferMessage request) {
      return blockingUnaryCall(
          getChannel(), getEasyTransferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public org.tron.api.GrpcAPI.EasyTransferResponse easyTransferByPrivate(org.tron.api.GrpcAPI.EasyTransferByPrivateMessage request) {
      return blockingUnaryCall(
          getChannel(), getEasyTransferByPrivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public org.tron.api.GrpcAPI.AddressPrKeyPairMessage generateAddress(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGenerateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.TransactionInfo getTransactionInfoById(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionInfoByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention accountPermissionUpdate(org.tron.protos.contract.AccountContract.AccountPermissionUpdateContract request) {
      return blockingUnaryCall(
          getChannel(), getAccountPermissionUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention addSign(org.tron.protos.Protocol.TransactionSign request) {
      return blockingUnaryCall(
          getChannel(), getAddSignMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionSignWeight getTransactionSignWeight(org.tron.protos.Protocol.Transaction request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionSignWeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionApprovedList getTransactionApprovedList(org.tron.protos.Protocol.Transaction request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionApprovedListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.Protocol.NodeInfo getNodeInfo(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNodeInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.NumberMessage getRewardInfo(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetRewardInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.NumberMessage getBrokerageInfo(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBrokerageInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention updateBrokerage(org.tron.protos.contract.StorageContract.UpdateBrokerageContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBrokerageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * for shiededTransaction
     * </pre>
     */
    public org.tron.api.GrpcAPI.TransactionExtention createShieldedTransaction(org.tron.api.GrpcAPI.PrivateParameters request) {
      return blockingUnaryCall(
          getChannel(), getCreateShieldedTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo getMerkleTreeVoucherInfo(org.tron.protos.contract.ShieldContract.OutputPointInfo request) {
      return blockingUnaryCall(
          getChannel(), getGetMerkleTreeVoucherInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.DecryptNotes scanNoteByIvk(org.tron.api.GrpcAPI.IvkDecryptParameters request) {
      return blockingUnaryCall(
          getChannel(), getScanNoteByIvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.DecryptNotesMarked scanAndMarkNoteByIvk(org.tron.api.GrpcAPI.IvkDecryptAndMarkParameters request) {
      return blockingUnaryCall(
          getChannel(), getScanAndMarkNoteByIvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.DecryptNotes scanNoteByOvk(org.tron.api.GrpcAPI.OvkDecryptParameters request) {
      return blockingUnaryCall(
          getChannel(), getScanNoteByOvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.BytesMessage getSpendingKey(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetSpendingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.ExpandedSpendingKeyMessage getExpandedSpendingKey(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetExpandedSpendingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.BytesMessage getAkFromAsk(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAkFromAskMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.BytesMessage getNkFromNsk(org.tron.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNkFromNskMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.IncomingViewingKeyMessage getIncomingViewingKey(org.tron.api.GrpcAPI.ViewingKeyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetIncomingViewingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.DiversifierMessage getDiversifier(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetDiversifierMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.ShieldedAddressInfo getNewShieldedAddress(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNewShieldedAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.PaymentAddressMessage getZenPaymentAddress(org.tron.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetZenPaymentAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.BytesMessage getRcm(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetRcmMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.SpendResult isSpend(org.tron.api.GrpcAPI.NoteParameters request) {
      return blockingUnaryCall(
          getChannel(), getIsSpendMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention createShieldedTransactionWithoutSpendAuthSig(org.tron.api.GrpcAPI.PrivateParametersWithoutAsk request) {
      return blockingUnaryCall(
          getChannel(), getCreateShieldedTransactionWithoutSpendAuthSigMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.BytesMessage getShieldTransactionHash(org.tron.protos.Protocol.Transaction request) {
      return blockingUnaryCall(
          getChannel(), getGetShieldTransactionHashMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.BytesMessage createSpendAuthSig(org.tron.api.GrpcAPI.SpendAuthSigParameters request) {
      return blockingUnaryCall(
          getChannel(), getCreateSpendAuthSigMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.BytesMessage createShieldNullifier(org.tron.api.GrpcAPI.NfParameters request) {
      return blockingUnaryCall(
          getChannel(), getCreateShieldNullifierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *for shielded contract
     * </pre>
     */
    public org.tron.api.GrpcAPI.ShieldedTRC20Parameters createShieldedContractParameters(org.tron.api.GrpcAPI.PrivateShieldedTRC20Parameters request) {
      return blockingUnaryCall(
          getChannel(), getCreateShieldedContractParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.ShieldedTRC20Parameters createShieldedContractParametersWithoutAsk(org.tron.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request) {
      return blockingUnaryCall(
          getChannel(), getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.DecryptNotesTRC20 scanShieldedTRC20NotesByIvk(org.tron.api.GrpcAPI.IvkDecryptTRC20Parameters request) {
      return blockingUnaryCall(
          getChannel(), getScanShieldedTRC20NotesByIvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.DecryptNotesTRC20 scanShieldedTRC20NotesByOvk(org.tron.api.GrpcAPI.OvkDecryptTRC20Parameters request) {
      return blockingUnaryCall(
          getChannel(), getScanShieldedTRC20NotesByOvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.NullifierResult isShieldedTRC20ContractNoteSpent(org.tron.api.GrpcAPI.NfTRC20Parameters request) {
      return blockingUnaryCall(
          getChannel(), getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.BytesMessage getTriggerInputForShieldedTRC20Contract(org.tron.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request) {
      return blockingUnaryCall(
          getChannel(), getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionExtention createCommonTransaction(org.tron.protos.Protocol.Transaction request) {
      return blockingUnaryCall(
          getChannel(), getCreateCommonTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.TransactionInfoList getTransactionInfoByBlockNum(org.tron.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionInfoByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.api.GrpcAPI.NumberMessage getBurnTrx(org.tron.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBurnTrxMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WalletFutureStub extends io.grpc.stub.AbstractStub<WalletFutureStub> {
    private WalletFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Account> getAccount(
        org.tron.protos.Protocol.Account request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Account> getAccountById(
        org.tron.protos.Protocol.Account request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.contract.BalanceContract.AccountBalanceResponse> getAccountBalance(
        org.tron.protos.contract.BalanceContract.AccountBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.contract.BalanceContract.BlockBalanceTrace> getBlockBalanceTrace(
        org.tron.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockBalanceTraceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use CreateTransaction2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> createTransaction(
        org.tron.protos.contract.BalanceContract.TransferContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateTransaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> createTransaction2(
        org.tron.protos.contract.BalanceContract.TransferContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTransaction2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.Return> broadcastTransaction(
        org.tron.protos.Protocol.Transaction request) {
      return futureUnaryCall(
          getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use UpdateAccount2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> updateAccount(
        org.tron.protos.contract.AccountContract.AccountUpdateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> setAccountId(
        org.tron.protos.contract.AccountContract.SetAccountIdContract request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccountIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAccount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> updateAccount2(
        org.tron.protos.contract.AccountContract.AccountUpdateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccount2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use VoteWitnessAccount2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> voteWitnessAccount(
        org.tron.protos.contract.WitnessContract.VoteWitnessContract request) {
      return futureUnaryCall(
          getChannel().newCall(getVoteWitnessAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *modify the consume_user_resource_percent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> updateSetting(
        org.tron.protos.contract.SmartContractOuterClass.UpdateSettingContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSettingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *modify the energy_limit
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> updateEnergyLimit(
        org.tron.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateEnergyLimitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of VoteWitnessAccount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> voteWitnessAccount2(
        org.tron.protos.contract.WitnessContract.VoteWitnessContract request) {
      return futureUnaryCall(
          getChannel().newCall(getVoteWitnessAccount2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use CreateAssetIssue2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> createAssetIssue(
        org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAssetIssueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateAssetIssue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> createAssetIssue2(
        org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAssetIssue2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use UpdateWitness2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> updateWitness(
        org.tron.protos.contract.WitnessContract.WitnessUpdateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateWitnessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of UpdateWitness.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> updateWitness2(
        org.tron.protos.contract.WitnessContract.WitnessUpdateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateWitness2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use CreateAccount2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> createAccount(
        org.tron.protos.contract.AccountContract.AccountCreateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateAccount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> createAccount2(
        org.tron.protos.contract.AccountContract.AccountCreateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAccount2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use CreateWitness2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> createWitness(
        org.tron.protos.contract.WitnessContract.WitnessCreateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateWitnessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateWitness.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> createWitness2(
        org.tron.protos.contract.WitnessContract.WitnessCreateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateWitness2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use TransferAsset2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> transferAsset(
        org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request) {
      return futureUnaryCall(
          getChannel().newCall(getTransferAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of TransferAsset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> transferAsset2(
        org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request) {
      return futureUnaryCall(
          getChannel().newCall(getTransferAsset2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use ParticipateAssetIssue2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> participateAssetIssue(
        org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request) {
      return futureUnaryCall(
          getChannel().newCall(getParticipateAssetIssueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of ParticipateAssetIssue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> participateAssetIssue2(
        org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request) {
      return futureUnaryCall(
          getChannel().newCall(getParticipateAssetIssue2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use FreezeBalance2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> freezeBalance(
        org.tron.protos.contract.BalanceContract.FreezeBalanceContract request) {
      return futureUnaryCall(
          getChannel().newCall(getFreezeBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of FreezeBalance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> freezeBalance2(
        org.tron.protos.contract.BalanceContract.FreezeBalanceContract request) {
      return futureUnaryCall(
          getChannel().newCall(getFreezeBalance2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use UnfreezeBalance2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> unfreezeBalance(
        org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUnfreezeBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeBalance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> unfreezeBalance2(
        org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUnfreezeBalance2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use UnfreezeAsset2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> unfreezeAsset(
        org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUnfreezeAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeAsset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> unfreezeAsset2(
        org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUnfreezeAsset2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use WithdrawBalance2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> withdrawBalance(
        org.tron.protos.contract.BalanceContract.WithdrawBalanceContract request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of WithdrawBalance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> withdrawBalance2(
        org.tron.protos.contract.BalanceContract.WithdrawBalanceContract request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawBalance2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use UpdateAsset2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> updateAsset(
        org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAsset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> updateAsset2(
        org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAsset2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> proposalCreate(
        org.tron.protos.contract.ProposalContract.ProposalCreateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getProposalCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> proposalApprove(
        org.tron.protos.contract.ProposalContract.ProposalApproveContract request) {
      return futureUnaryCall(
          getChannel().newCall(getProposalApproveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> proposalDelete(
        org.tron.protos.contract.ProposalContract.ProposalDeleteContract request) {
      return futureUnaryCall(
          getChannel().newCall(getProposalDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> buyStorage(
        org.tron.protos.contract.StorageContract.BuyStorageContract request) {
      return futureUnaryCall(
          getChannel().newCall(getBuyStorageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> buyStorageBytes(
        org.tron.protos.contract.StorageContract.BuyStorageBytesContract request) {
      return futureUnaryCall(
          getChannel().newCall(getBuyStorageBytesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> sellStorage(
        org.tron.protos.contract.StorageContract.SellStorageContract request) {
      return futureUnaryCall(
          getChannel().newCall(getSellStorageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> exchangeCreate(
        org.tron.protos.contract.ExchangeContract.ExchangeCreateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> exchangeInject(
        org.tron.protos.contract.ExchangeContract.ExchangeInjectContract request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeInjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> exchangeWithdraw(
        org.tron.protos.contract.ExchangeContract.ExchangeWithdrawContract request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> exchangeTransaction(
        org.tron.protos.contract.ExchangeContract.ExchangeTransactionContract request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> marketSellAsset(
        org.tron.protos.contract.MarketContract.MarketSellAssetContract request) {
      return futureUnaryCall(
          getChannel().newCall(getMarketSellAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> marketCancelOrder(
        org.tron.protos.contract.MarketContract.MarketCancelOrderContract request) {
      return futureUnaryCall(
          getChannel().newCall(getMarketCancelOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.MarketOrder> getMarketOrderById(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketOrderByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.MarketOrderList> getMarketOrderByAccount(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketOrderByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.MarketPriceList> getMarketPriceByPair(
        org.tron.protos.Protocol.MarketOrderPair request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketPriceByPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.MarketOrderList> getMarketOrderListByPair(
        org.tron.protos.Protocol.MarketOrderPair request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketOrderListByPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.MarketOrderPairList> getMarketPairList(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketPairListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.NodeList> listNodes(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.AssetIssueList> getAssetIssueByAccount(
        org.tron.protos.Protocol.Account request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.AccountNetMessage> getAccountNet(
        org.tron.protos.Protocol.Account request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountNetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.AccountResourceMessage> getAccountResource(
        org.tron.protos.Protocol.Account request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getAssetIssueByName(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.AssetIssueList> getAssetIssueListByName(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueListByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getAssetIssueById(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use GetNowBlock2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Block> getNowBlock(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of GetNowBlock.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BlockExtention> getNowBlock2(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNowBlock2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use GetBlockByNum2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Block> getBlockByNum(
        org.tron.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BlockExtention> getBlockByNum2(
        org.tron.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByNum2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.NumberMessage> getTransactionCountByBlockNum(
        org.tron.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionCountByBlockNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Block> getBlockById(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use GetBlockByLimitNext2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BlockList> getBlockByLimitNext(
        org.tron.api.GrpcAPI.BlockLimit request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByLimitNextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLimitNext.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BlockListExtention> getBlockByLimitNext2(
        org.tron.api.GrpcAPI.BlockLimit request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByLimitNext2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use GetBlockByLatestNum2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BlockList> getBlockByLatestNum(
        org.tron.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByLatestNumMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLatestNum.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BlockListExtention> getBlockByLatestNum2(
        org.tron.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByLatestNum2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> getTransactionById(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> deployContract(
        org.tron.protos.contract.SmartContractOuterClass.CreateSmartContract request) {
      return futureUnaryCall(
          getChannel().newCall(getDeployContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.contract.SmartContractOuterClass.SmartContract> getContract(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.contract.SmartContractOuterClass.SmartContractDataWrapper> getContractInfo(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContractInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> triggerContract(
        org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract request) {
      return futureUnaryCall(
          getChannel().newCall(getTriggerContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> triggerConstantContract(
        org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract request) {
      return futureUnaryCall(
          getChannel().newCall(getTriggerConstantContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> clearContractABI(
        org.tron.protos.contract.SmartContractOuterClass.ClearABIContract request) {
      return futureUnaryCall(
          getChannel().newCall(getClearContractABIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.WitnessList> listWitnesses(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getListWitnessesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.DelegatedResourceList> getDelegatedResource(
        org.tron.api.GrpcAPI.DelegatedResourceMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.DelegatedResourceAccountIndex> getDelegatedResourceAccountIndex(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.ProposalList> listProposals(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getListProposalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.ProposalList> getPaginatedProposalList(
        org.tron.api.GrpcAPI.PaginatedMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPaginatedProposalListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Proposal> getProposalById(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProposalByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.ExchangeList> listExchanges(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getListExchangesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.ExchangeList> getPaginatedExchangeList(
        org.tron.api.GrpcAPI.PaginatedMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPaginatedExchangeListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Exchange> getExchangeById(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExchangeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.ChainParameters> getChainParameters(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChainParametersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.AssetIssueList> getAssetIssueList(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.AssetIssueList> getPaginatedAssetIssueList(
        org.tron.api.GrpcAPI.PaginatedMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPaginatedAssetIssueListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.NumberMessage> totalTransaction(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getTotalTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.NumberMessage> getNextMaintenanceTime(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNextMaintenanceTimeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     *Please use GetTransactionSign2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.Transaction> getTransactionSign(
        org.tron.protos.Protocol.TransactionSign request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionSignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     *Use this function instead of GetTransactionSign.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> getTransactionSign2(
        org.tron.protos.Protocol.TransactionSign request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionSign2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BytesMessage> createAddress(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.EasyTransferResponse> easyTransferAsset(
        org.tron.api.GrpcAPI.EasyTransferAssetMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getEasyTransferAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.EasyTransferResponse> easyTransferAssetByPrivate(
        org.tron.api.GrpcAPI.EasyTransferAssetByPrivateMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getEasyTransferAssetByPrivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.EasyTransferResponse> easyTransfer(
        org.tron.api.GrpcAPI.EasyTransferMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getEasyTransferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.EasyTransferResponse> easyTransferByPrivate(
        org.tron.api.GrpcAPI.EasyTransferByPrivateMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getEasyTransferByPrivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Warning: do not invoke this interface provided by others.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.AddressPrKeyPairMessage> generateAddress(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.TransactionInfo> getTransactionInfoById(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionInfoByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> accountPermissionUpdate(
        org.tron.protos.contract.AccountContract.AccountPermissionUpdateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountPermissionUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> addSign(
        org.tron.protos.Protocol.TransactionSign request) {
      return futureUnaryCall(
          getChannel().newCall(getAddSignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionSignWeight> getTransactionSignWeight(
        org.tron.protos.Protocol.Transaction request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionSignWeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionApprovedList> getTransactionApprovedList(
        org.tron.protos.Protocol.Transaction request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionApprovedListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.Protocol.NodeInfo> getNodeInfo(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.NumberMessage> getRewardInfo(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRewardInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.NumberMessage> getBrokerageInfo(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBrokerageInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> updateBrokerage(
        org.tron.protos.contract.StorageContract.UpdateBrokerageContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBrokerageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * for shiededTransaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> createShieldedTransaction(
        org.tron.api.GrpcAPI.PrivateParameters request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateShieldedTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo> getMerkleTreeVoucherInfo(
        org.tron.protos.contract.ShieldContract.OutputPointInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMerkleTreeVoucherInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.DecryptNotes> scanNoteByIvk(
        org.tron.api.GrpcAPI.IvkDecryptParameters request) {
      return futureUnaryCall(
          getChannel().newCall(getScanNoteByIvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.DecryptNotesMarked> scanAndMarkNoteByIvk(
        org.tron.api.GrpcAPI.IvkDecryptAndMarkParameters request) {
      return futureUnaryCall(
          getChannel().newCall(getScanAndMarkNoteByIvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.DecryptNotes> scanNoteByOvk(
        org.tron.api.GrpcAPI.OvkDecryptParameters request) {
      return futureUnaryCall(
          getChannel().newCall(getScanNoteByOvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BytesMessage> getSpendingKey(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSpendingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.ExpandedSpendingKeyMessage> getExpandedSpendingKey(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExpandedSpendingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BytesMessage> getAkFromAsk(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAkFromAskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BytesMessage> getNkFromNsk(
        org.tron.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNkFromNskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.IncomingViewingKeyMessage> getIncomingViewingKey(
        org.tron.api.GrpcAPI.ViewingKeyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIncomingViewingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.DiversifierMessage> getDiversifier(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDiversifierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.ShieldedAddressInfo> getNewShieldedAddress(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNewShieldedAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.PaymentAddressMessage> getZenPaymentAddress(
        org.tron.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetZenPaymentAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BytesMessage> getRcm(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRcmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.SpendResult> isSpend(
        org.tron.api.GrpcAPI.NoteParameters request) {
      return futureUnaryCall(
          getChannel().newCall(getIsSpendMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> createShieldedTransactionWithoutSpendAuthSig(
        org.tron.api.GrpcAPI.PrivateParametersWithoutAsk request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateShieldedTransactionWithoutSpendAuthSigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BytesMessage> getShieldTransactionHash(
        org.tron.protos.Protocol.Transaction request) {
      return futureUnaryCall(
          getChannel().newCall(getGetShieldTransactionHashMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BytesMessage> createSpendAuthSig(
        org.tron.api.GrpcAPI.SpendAuthSigParameters request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSpendAuthSigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BytesMessage> createShieldNullifier(
        org.tron.api.GrpcAPI.NfParameters request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateShieldNullifierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *for shielded contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.ShieldedTRC20Parameters> createShieldedContractParameters(
        org.tron.api.GrpcAPI.PrivateShieldedTRC20Parameters request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.ShieldedTRC20Parameters> createShieldedContractParametersWithoutAsk(
        org.tron.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.DecryptNotesTRC20> scanShieldedTRC20NotesByIvk(
        org.tron.api.GrpcAPI.IvkDecryptTRC20Parameters request) {
      return futureUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByIvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.DecryptNotesTRC20> scanShieldedTRC20NotesByOvk(
        org.tron.api.GrpcAPI.OvkDecryptTRC20Parameters request) {
      return futureUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByOvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.NullifierResult> isShieldedTRC20ContractNoteSpent(
        org.tron.api.GrpcAPI.NfTRC20Parameters request) {
      return futureUnaryCall(
          getChannel().newCall(getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.BytesMessage> getTriggerInputForShieldedTRC20Contract(
        org.tron.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionExtention> createCommonTransaction(
        org.tron.protos.Protocol.Transaction request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCommonTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.TransactionInfoList> getTransactionInfoByBlockNum(
        org.tron.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionInfoByBlockNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.api.GrpcAPI.NumberMessage> getBurnTrx(
        org.tron.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBurnTrxMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNT = 0;
  private static final int METHODID_GET_ACCOUNT_BY_ID = 1;
  private static final int METHODID_GET_ACCOUNT_BALANCE = 2;
  private static final int METHODID_GET_BLOCK_BALANCE_TRACE = 3;
  private static final int METHODID_CREATE_TRANSACTION = 4;
  private static final int METHODID_CREATE_TRANSACTION2 = 5;
  private static final int METHODID_BROADCAST_TRANSACTION = 6;
  private static final int METHODID_UPDATE_ACCOUNT = 7;
  private static final int METHODID_SET_ACCOUNT_ID = 8;
  private static final int METHODID_UPDATE_ACCOUNT2 = 9;
  private static final int METHODID_VOTE_WITNESS_ACCOUNT = 10;
  private static final int METHODID_UPDATE_SETTING = 11;
  private static final int METHODID_UPDATE_ENERGY_LIMIT = 12;
  private static final int METHODID_VOTE_WITNESS_ACCOUNT2 = 13;
  private static final int METHODID_CREATE_ASSET_ISSUE = 14;
  private static final int METHODID_CREATE_ASSET_ISSUE2 = 15;
  private static final int METHODID_UPDATE_WITNESS = 16;
  private static final int METHODID_UPDATE_WITNESS2 = 17;
  private static final int METHODID_CREATE_ACCOUNT = 18;
  private static final int METHODID_CREATE_ACCOUNT2 = 19;
  private static final int METHODID_CREATE_WITNESS = 20;
  private static final int METHODID_CREATE_WITNESS2 = 21;
  private static final int METHODID_TRANSFER_ASSET = 22;
  private static final int METHODID_TRANSFER_ASSET2 = 23;
  private static final int METHODID_PARTICIPATE_ASSET_ISSUE = 24;
  private static final int METHODID_PARTICIPATE_ASSET_ISSUE2 = 25;
  private static final int METHODID_FREEZE_BALANCE = 26;
  private static final int METHODID_FREEZE_BALANCE2 = 27;
  private static final int METHODID_UNFREEZE_BALANCE = 28;
  private static final int METHODID_UNFREEZE_BALANCE2 = 29;
  private static final int METHODID_UNFREEZE_ASSET = 30;
  private static final int METHODID_UNFREEZE_ASSET2 = 31;
  private static final int METHODID_WITHDRAW_BALANCE = 32;
  private static final int METHODID_WITHDRAW_BALANCE2 = 33;
  private static final int METHODID_UPDATE_ASSET = 34;
  private static final int METHODID_UPDATE_ASSET2 = 35;
  private static final int METHODID_PROPOSAL_CREATE = 36;
  private static final int METHODID_PROPOSAL_APPROVE = 37;
  private static final int METHODID_PROPOSAL_DELETE = 38;
  private static final int METHODID_BUY_STORAGE = 39;
  private static final int METHODID_BUY_STORAGE_BYTES = 40;
  private static final int METHODID_SELL_STORAGE = 41;
  private static final int METHODID_EXCHANGE_CREATE = 42;
  private static final int METHODID_EXCHANGE_INJECT = 43;
  private static final int METHODID_EXCHANGE_WITHDRAW = 44;
  private static final int METHODID_EXCHANGE_TRANSACTION = 45;
  private static final int METHODID_MARKET_SELL_ASSET = 46;
  private static final int METHODID_MARKET_CANCEL_ORDER = 47;
  private static final int METHODID_GET_MARKET_ORDER_BY_ID = 48;
  private static final int METHODID_GET_MARKET_ORDER_BY_ACCOUNT = 49;
  private static final int METHODID_GET_MARKET_PRICE_BY_PAIR = 50;
  private static final int METHODID_GET_MARKET_ORDER_LIST_BY_PAIR = 51;
  private static final int METHODID_GET_MARKET_PAIR_LIST = 52;
  private static final int METHODID_LIST_NODES = 53;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ACCOUNT = 54;
  private static final int METHODID_GET_ACCOUNT_NET = 55;
  private static final int METHODID_GET_ACCOUNT_RESOURCE = 56;
  private static final int METHODID_GET_ASSET_ISSUE_BY_NAME = 57;
  private static final int METHODID_GET_ASSET_ISSUE_LIST_BY_NAME = 58;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ID = 59;
  private static final int METHODID_GET_NOW_BLOCK = 60;
  private static final int METHODID_GET_NOW_BLOCK2 = 61;
  private static final int METHODID_GET_BLOCK_BY_NUM = 62;
  private static final int METHODID_GET_BLOCK_BY_NUM2 = 63;
  private static final int METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM = 64;
  private static final int METHODID_GET_BLOCK_BY_ID = 65;
  private static final int METHODID_GET_BLOCK_BY_LIMIT_NEXT = 66;
  private static final int METHODID_GET_BLOCK_BY_LIMIT_NEXT2 = 67;
  private static final int METHODID_GET_BLOCK_BY_LATEST_NUM = 68;
  private static final int METHODID_GET_BLOCK_BY_LATEST_NUM2 = 69;
  private static final int METHODID_GET_TRANSACTION_BY_ID = 70;
  private static final int METHODID_DEPLOY_CONTRACT = 71;
  private static final int METHODID_GET_CONTRACT = 72;
  private static final int METHODID_GET_CONTRACT_INFO = 73;
  private static final int METHODID_TRIGGER_CONTRACT = 74;
  private static final int METHODID_TRIGGER_CONSTANT_CONTRACT = 75;
  private static final int METHODID_CLEAR_CONTRACT_ABI = 76;
  private static final int METHODID_LIST_WITNESSES = 77;
  private static final int METHODID_GET_DELEGATED_RESOURCE = 78;
  private static final int METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX = 79;
  private static final int METHODID_LIST_PROPOSALS = 80;
  private static final int METHODID_GET_PAGINATED_PROPOSAL_LIST = 81;
  private static final int METHODID_GET_PROPOSAL_BY_ID = 82;
  private static final int METHODID_LIST_EXCHANGES = 83;
  private static final int METHODID_GET_PAGINATED_EXCHANGE_LIST = 84;
  private static final int METHODID_GET_EXCHANGE_BY_ID = 85;
  private static final int METHODID_GET_CHAIN_PARAMETERS = 86;
  private static final int METHODID_GET_ASSET_ISSUE_LIST = 87;
  private static final int METHODID_GET_PAGINATED_ASSET_ISSUE_LIST = 88;
  private static final int METHODID_TOTAL_TRANSACTION = 89;
  private static final int METHODID_GET_NEXT_MAINTENANCE_TIME = 90;
  private static final int METHODID_GET_TRANSACTION_SIGN = 91;
  private static final int METHODID_GET_TRANSACTION_SIGN2 = 92;
  private static final int METHODID_CREATE_ADDRESS = 93;
  private static final int METHODID_EASY_TRANSFER_ASSET = 94;
  private static final int METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE = 95;
  private static final int METHODID_EASY_TRANSFER = 96;
  private static final int METHODID_EASY_TRANSFER_BY_PRIVATE = 97;
  private static final int METHODID_GENERATE_ADDRESS = 98;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_ID = 99;
  private static final int METHODID_ACCOUNT_PERMISSION_UPDATE = 100;
  private static final int METHODID_ADD_SIGN = 101;
  private static final int METHODID_GET_TRANSACTION_SIGN_WEIGHT = 102;
  private static final int METHODID_GET_TRANSACTION_APPROVED_LIST = 103;
  private static final int METHODID_GET_NODE_INFO = 104;
  private static final int METHODID_GET_REWARD_INFO = 105;
  private static final int METHODID_GET_BROKERAGE_INFO = 106;
  private static final int METHODID_UPDATE_BROKERAGE = 107;
  private static final int METHODID_CREATE_SHIELDED_TRANSACTION = 108;
  private static final int METHODID_GET_MERKLE_TREE_VOUCHER_INFO = 109;
  private static final int METHODID_SCAN_NOTE_BY_IVK = 110;
  private static final int METHODID_SCAN_AND_MARK_NOTE_BY_IVK = 111;
  private static final int METHODID_SCAN_NOTE_BY_OVK = 112;
  private static final int METHODID_GET_SPENDING_KEY = 113;
  private static final int METHODID_GET_EXPANDED_SPENDING_KEY = 114;
  private static final int METHODID_GET_AK_FROM_ASK = 115;
  private static final int METHODID_GET_NK_FROM_NSK = 116;
  private static final int METHODID_GET_INCOMING_VIEWING_KEY = 117;
  private static final int METHODID_GET_DIVERSIFIER = 118;
  private static final int METHODID_GET_NEW_SHIELDED_ADDRESS = 119;
  private static final int METHODID_GET_ZEN_PAYMENT_ADDRESS = 120;
  private static final int METHODID_GET_RCM = 121;
  private static final int METHODID_IS_SPEND = 122;
  private static final int METHODID_CREATE_SHIELDED_TRANSACTION_WITHOUT_SPEND_AUTH_SIG = 123;
  private static final int METHODID_GET_SHIELD_TRANSACTION_HASH = 124;
  private static final int METHODID_CREATE_SPEND_AUTH_SIG = 125;
  private static final int METHODID_CREATE_SHIELD_NULLIFIER = 126;
  private static final int METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS = 127;
  private static final int METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK = 128;
  private static final int METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK = 129;
  private static final int METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK = 130;
  private static final int METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT = 131;
  private static final int METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT = 132;
  private static final int METHODID_CREATE_COMMON_TRANSACTION = 133;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM = 134;
  private static final int METHODID_GET_BURN_TRX = 135;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WalletImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((org.tron.protos.Protocol.Account) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_BY_ID:
          serviceImpl.getAccountById((org.tron.protos.Protocol.Account) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_BALANCE:
          serviceImpl.getAccountBalance((org.tron.protos.contract.BalanceContract.AccountBalanceRequest) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.contract.BalanceContract.AccountBalanceResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BALANCE_TRACE:
          serviceImpl.getBlockBalanceTrace((org.tron.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.contract.BalanceContract.BlockBalanceTrace>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION:
          serviceImpl.createTransaction((org.tron.protos.contract.BalanceContract.TransferContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION2:
          serviceImpl.createTransaction2((org.tron.protos.contract.BalanceContract.TransferContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_BROADCAST_TRANSACTION:
          serviceImpl.broadcastTransaction((org.tron.protos.Protocol.Transaction) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.Return>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT:
          serviceImpl.updateAccount((org.tron.protos.contract.AccountContract.AccountUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_SET_ACCOUNT_ID:
          serviceImpl.setAccountId((org.tron.protos.contract.AccountContract.SetAccountIdContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT2:
          serviceImpl.updateAccount2((org.tron.protos.contract.AccountContract.AccountUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_VOTE_WITNESS_ACCOUNT:
          serviceImpl.voteWitnessAccount((org.tron.protos.contract.WitnessContract.VoteWitnessContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_SETTING:
          serviceImpl.updateSetting((org.tron.protos.contract.SmartContractOuterClass.UpdateSettingContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_ENERGY_LIMIT:
          serviceImpl.updateEnergyLimit((org.tron.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_VOTE_WITNESS_ACCOUNT2:
          serviceImpl.voteWitnessAccount2((org.tron.protos.contract.WitnessContract.VoteWitnessContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_ASSET_ISSUE:
          serviceImpl.createAssetIssue((org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_ASSET_ISSUE2:
          serviceImpl.createAssetIssue2((org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_WITNESS:
          serviceImpl.updateWitness((org.tron.protos.contract.WitnessContract.WitnessUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_WITNESS2:
          serviceImpl.updateWitness2((org.tron.protos.contract.WitnessContract.WitnessUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT:
          serviceImpl.createAccount((org.tron.protos.contract.AccountContract.AccountCreateContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT2:
          serviceImpl.createAccount2((org.tron.protos.contract.AccountContract.AccountCreateContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_WITNESS:
          serviceImpl.createWitness((org.tron.protos.contract.WitnessContract.WitnessCreateContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_WITNESS2:
          serviceImpl.createWitness2((org.tron.protos.contract.WitnessContract.WitnessCreateContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRANSFER_ASSET:
          serviceImpl.transferAsset((org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_TRANSFER_ASSET2:
          serviceImpl.transferAsset2((org.tron.protos.contract.AssetIssueContractOuterClass.TransferAssetContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_PARTICIPATE_ASSET_ISSUE:
          serviceImpl.participateAssetIssue((org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_PARTICIPATE_ASSET_ISSUE2:
          serviceImpl.participateAssetIssue2((org.tron.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_FREEZE_BALANCE:
          serviceImpl.freezeBalance((org.tron.protos.contract.BalanceContract.FreezeBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_FREEZE_BALANCE2:
          serviceImpl.freezeBalance2((org.tron.protos.contract.BalanceContract.FreezeBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_UNFREEZE_BALANCE:
          serviceImpl.unfreezeBalance((org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_UNFREEZE_BALANCE2:
          serviceImpl.unfreezeBalance2((org.tron.protos.contract.BalanceContract.UnfreezeBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_UNFREEZE_ASSET:
          serviceImpl.unfreezeAsset((org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_UNFREEZE_ASSET2:
          serviceImpl.unfreezeAsset2((org.tron.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_WITHDRAW_BALANCE:
          serviceImpl.withdrawBalance((org.tron.protos.contract.BalanceContract.WithdrawBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_WITHDRAW_BALANCE2:
          serviceImpl.withdrawBalance2((org.tron.protos.contract.BalanceContract.WithdrawBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_ASSET:
          serviceImpl.updateAsset((org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_ASSET2:
          serviceImpl.updateAsset2((org.tron.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_PROPOSAL_CREATE:
          serviceImpl.proposalCreate((org.tron.protos.contract.ProposalContract.ProposalCreateContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_PROPOSAL_APPROVE:
          serviceImpl.proposalApprove((org.tron.protos.contract.ProposalContract.ProposalApproveContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_PROPOSAL_DELETE:
          serviceImpl.proposalDelete((org.tron.protos.contract.ProposalContract.ProposalDeleteContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_BUY_STORAGE:
          serviceImpl.buyStorage((org.tron.protos.contract.StorageContract.BuyStorageContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_BUY_STORAGE_BYTES:
          serviceImpl.buyStorageBytes((org.tron.protos.contract.StorageContract.BuyStorageBytesContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_SELL_STORAGE:
          serviceImpl.sellStorage((org.tron.protos.contract.StorageContract.SellStorageContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_CREATE:
          serviceImpl.exchangeCreate((org.tron.protos.contract.ExchangeContract.ExchangeCreateContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_INJECT:
          serviceImpl.exchangeInject((org.tron.protos.contract.ExchangeContract.ExchangeInjectContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_WITHDRAW:
          serviceImpl.exchangeWithdraw((org.tron.protos.contract.ExchangeContract.ExchangeWithdrawContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_TRANSACTION:
          serviceImpl.exchangeTransaction((org.tron.protos.contract.ExchangeContract.ExchangeTransactionContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_MARKET_SELL_ASSET:
          serviceImpl.marketSellAsset((org.tron.protos.contract.MarketContract.MarketSellAssetContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_MARKET_CANCEL_ORDER:
          serviceImpl.marketCancelOrder((org.tron.protos.contract.MarketContract.MarketCancelOrderContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_BY_ID:
          serviceImpl.getMarketOrderById((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketOrder>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_BY_ACCOUNT:
          serviceImpl.getMarketOrderByAccount((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketOrderList>) responseObserver);
          break;
        case METHODID_GET_MARKET_PRICE_BY_PAIR:
          serviceImpl.getMarketPriceByPair((org.tron.protos.Protocol.MarketOrderPair) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketPriceList>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_LIST_BY_PAIR:
          serviceImpl.getMarketOrderListByPair((org.tron.protos.Protocol.MarketOrderPair) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketOrderList>) responseObserver);
          break;
        case METHODID_GET_MARKET_PAIR_LIST:
          serviceImpl.getMarketPairList((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.MarketOrderPairList>) responseObserver);
          break;
        case METHODID_LIST_NODES:
          serviceImpl.listNodes((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NodeList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_ACCOUNT:
          serviceImpl.getAssetIssueByAccount((org.tron.protos.Protocol.Account) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_NET:
          serviceImpl.getAccountNet((org.tron.protos.Protocol.Account) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AccountNetMessage>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_RESOURCE:
          serviceImpl.getAccountResource((org.tron.protos.Protocol.Account) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AccountResourceMessage>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_NAME:
          serviceImpl.getAssetIssueByName((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST_BY_NAME:
          serviceImpl.getAssetIssueListByName((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_ID:
          serviceImpl.getAssetIssueById((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.contract.AssetIssueContractOuterClass.AssetIssueContract>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK:
          serviceImpl.getNowBlock((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Block>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK2:
          serviceImpl.getNowBlock2((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM:
          serviceImpl.getBlockByNum((org.tron.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM2:
          serviceImpl.getBlockByNum2((org.tron.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM:
          serviceImpl.getTransactionCountByBlockNum((org.tron.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_ID:
          serviceImpl.getBlockById((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LIMIT_NEXT:
          serviceImpl.getBlockByLimitNext((org.tron.api.GrpcAPI.BlockLimit) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockList>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LIMIT_NEXT2:
          serviceImpl.getBlockByLimitNext2((org.tron.api.GrpcAPI.BlockLimit) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockListExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LATEST_NUM:
          serviceImpl.getBlockByLatestNum((org.tron.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockList>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LATEST_NUM2:
          serviceImpl.getBlockByLatestNum2((org.tron.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BlockListExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_BY_ID:
          serviceImpl.getTransactionById((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_DEPLOY_CONTRACT:
          serviceImpl.deployContract((org.tron.protos.contract.SmartContractOuterClass.CreateSmartContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_CONTRACT:
          serviceImpl.getContract((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.contract.SmartContractOuterClass.SmartContract>) responseObserver);
          break;
        case METHODID_GET_CONTRACT_INFO:
          serviceImpl.getContractInfo((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.contract.SmartContractOuterClass.SmartContractDataWrapper>) responseObserver);
          break;
        case METHODID_TRIGGER_CONTRACT:
          serviceImpl.triggerContract((org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRIGGER_CONSTANT_CONTRACT:
          serviceImpl.triggerConstantContract((org.tron.protos.contract.SmartContractOuterClass.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_CLEAR_CONTRACT_ABI:
          serviceImpl.clearContractABI((org.tron.protos.contract.SmartContractOuterClass.ClearABIContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_LIST_WITNESSES:
          serviceImpl.listWitnesses((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.WitnessList>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE:
          serviceImpl.getDelegatedResource((org.tron.api.GrpcAPI.DelegatedResourceMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DelegatedResourceList>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX:
          serviceImpl.getDelegatedResourceAccountIndex((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.DelegatedResourceAccountIndex>) responseObserver);
          break;
        case METHODID_LIST_PROPOSALS:
          serviceImpl.listProposals((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ProposalList>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_PROPOSAL_LIST:
          serviceImpl.getPaginatedProposalList((org.tron.api.GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ProposalList>) responseObserver);
          break;
        case METHODID_GET_PROPOSAL_BY_ID:
          serviceImpl.getProposalById((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Proposal>) responseObserver);
          break;
        case METHODID_LIST_EXCHANGES:
          serviceImpl.listExchanges((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ExchangeList>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_EXCHANGE_LIST:
          serviceImpl.getPaginatedExchangeList((org.tron.api.GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ExchangeList>) responseObserver);
          break;
        case METHODID_GET_EXCHANGE_BY_ID:
          serviceImpl.getExchangeById((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Exchange>) responseObserver);
          break;
        case METHODID_GET_CHAIN_PARAMETERS:
          serviceImpl.getChainParameters((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.ChainParameters>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST:
          serviceImpl.getAssetIssueList((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_ASSET_ISSUE_LIST:
          serviceImpl.getPaginatedAssetIssueList((org.tron.api.GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AssetIssueList>) responseObserver);
          break;
        case METHODID_TOTAL_TRANSACTION:
          serviceImpl.totalTransaction((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_NEXT_MAINTENANCE_TIME:
          serviceImpl.getNextMaintenanceTime((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN:
          serviceImpl.getTransactionSign((org.tron.protos.Protocol.TransactionSign) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN2:
          serviceImpl.getTransactionSign2((org.tron.protos.Protocol.TransactionSign) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_ADDRESS:
          serviceImpl.createAddress((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_ASSET:
          serviceImpl.easyTransferAsset((org.tron.api.GrpcAPI.EasyTransferAssetMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE:
          serviceImpl.easyTransferAssetByPrivate((org.tron.api.GrpcAPI.EasyTransferAssetByPrivateMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER:
          serviceImpl.easyTransfer((org.tron.api.GrpcAPI.EasyTransferMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_BY_PRIVATE:
          serviceImpl.easyTransferByPrivate((org.tron.api.GrpcAPI.EasyTransferByPrivateMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_GENERATE_ADDRESS:
          serviceImpl.generateAddress((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.AddressPrKeyPairMessage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_ID:
          serviceImpl.getTransactionInfoById((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.TransactionInfo>) responseObserver);
          break;
        case METHODID_ACCOUNT_PERMISSION_UPDATE:
          serviceImpl.accountPermissionUpdate((org.tron.protos.contract.AccountContract.AccountPermissionUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_ADD_SIGN:
          serviceImpl.addSign((org.tron.protos.Protocol.TransactionSign) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN_WEIGHT:
          serviceImpl.getTransactionSignWeight((org.tron.protos.Protocol.Transaction) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionSignWeight>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_APPROVED_LIST:
          serviceImpl.getTransactionApprovedList((org.tron.protos.Protocol.Transaction) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionApprovedList>) responseObserver);
          break;
        case METHODID_GET_NODE_INFO:
          serviceImpl.getNodeInfo((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.Protocol.NodeInfo>) responseObserver);
          break;
        case METHODID_GET_REWARD_INFO:
          serviceImpl.getRewardInfo((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_BROKERAGE_INFO:
          serviceImpl.getBrokerageInfo((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_UPDATE_BROKERAGE:
          serviceImpl.updateBrokerage((org.tron.protos.contract.StorageContract.UpdateBrokerageContract) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_TRANSACTION:
          serviceImpl.createShieldedTransaction((org.tron.api.GrpcAPI.PrivateParameters) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_MERKLE_TREE_VOUCHER_INFO:
          serviceImpl.getMerkleTreeVoucherInfo((org.tron.protos.contract.ShieldContract.OutputPointInfo) request,
              (io.grpc.stub.StreamObserver<org.tron.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo>) responseObserver);
          break;
        case METHODID_SCAN_NOTE_BY_IVK:
          serviceImpl.scanNoteByIvk((org.tron.api.GrpcAPI.IvkDecryptParameters) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotes>) responseObserver);
          break;
        case METHODID_SCAN_AND_MARK_NOTE_BY_IVK:
          serviceImpl.scanAndMarkNoteByIvk((org.tron.api.GrpcAPI.IvkDecryptAndMarkParameters) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotesMarked>) responseObserver);
          break;
        case METHODID_SCAN_NOTE_BY_OVK:
          serviceImpl.scanNoteByOvk((org.tron.api.GrpcAPI.OvkDecryptParameters) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotes>) responseObserver);
          break;
        case METHODID_GET_SPENDING_KEY:
          serviceImpl.getSpendingKey((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_EXPANDED_SPENDING_KEY:
          serviceImpl.getExpandedSpendingKey((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ExpandedSpendingKeyMessage>) responseObserver);
          break;
        case METHODID_GET_AK_FROM_ASK:
          serviceImpl.getAkFromAsk((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_NK_FROM_NSK:
          serviceImpl.getNkFromNsk((org.tron.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_INCOMING_VIEWING_KEY:
          serviceImpl.getIncomingViewingKey((org.tron.api.GrpcAPI.ViewingKeyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.IncomingViewingKeyMessage>) responseObserver);
          break;
        case METHODID_GET_DIVERSIFIER:
          serviceImpl.getDiversifier((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DiversifierMessage>) responseObserver);
          break;
        case METHODID_GET_NEW_SHIELDED_ADDRESS:
          serviceImpl.getNewShieldedAddress((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ShieldedAddressInfo>) responseObserver);
          break;
        case METHODID_GET_ZEN_PAYMENT_ADDRESS:
          serviceImpl.getZenPaymentAddress((org.tron.api.GrpcAPI.IncomingViewingKeyDiversifierMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.PaymentAddressMessage>) responseObserver);
          break;
        case METHODID_GET_RCM:
          serviceImpl.getRcm((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_IS_SPEND:
          serviceImpl.isSpend((org.tron.api.GrpcAPI.NoteParameters) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.SpendResult>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_TRANSACTION_WITHOUT_SPEND_AUTH_SIG:
          serviceImpl.createShieldedTransactionWithoutSpendAuthSig((org.tron.api.GrpcAPI.PrivateParametersWithoutAsk) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_SHIELD_TRANSACTION_HASH:
          serviceImpl.getShieldTransactionHash((org.tron.protos.Protocol.Transaction) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_CREATE_SPEND_AUTH_SIG:
          serviceImpl.createSpendAuthSig((org.tron.api.GrpcAPI.SpendAuthSigParameters) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_CREATE_SHIELD_NULLIFIER:
          serviceImpl.createShieldNullifier((org.tron.api.GrpcAPI.NfParameters) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS:
          serviceImpl.createShieldedContractParameters((org.tron.api.GrpcAPI.PrivateShieldedTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ShieldedTRC20Parameters>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK:
          serviceImpl.createShieldedContractParametersWithoutAsk((org.tron.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.ShieldedTRC20Parameters>) responseObserver);
          break;
        case METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK:
          serviceImpl.scanShieldedTRC20NotesByIvk((org.tron.api.GrpcAPI.IvkDecryptTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotesTRC20>) responseObserver);
          break;
        case METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK:
          serviceImpl.scanShieldedTRC20NotesByOvk((org.tron.api.GrpcAPI.OvkDecryptTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.DecryptNotesTRC20>) responseObserver);
          break;
        case METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT:
          serviceImpl.isShieldedTRC20ContractNoteSpent((org.tron.api.GrpcAPI.NfTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NullifierResult>) responseObserver);
          break;
        case METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT:
          serviceImpl.getTriggerInputForShieldedTRC20Contract((org.tron.api.GrpcAPI.ShieldedTRC20TriggerContractParameters) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_CREATE_COMMON_TRANSACTION:
          serviceImpl.createCommonTransaction((org.tron.protos.Protocol.Transaction) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM:
          serviceImpl.getTransactionInfoByBlockNum((org.tron.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.TransactionInfoList>) responseObserver);
          break;
        case METHODID_GET_BURN_TRX:
          serviceImpl.getBurnTrx((org.tron.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.api.GrpcAPI.NumberMessage>) responseObserver);
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

  private static abstract class WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.tron.api.GrpcAPI.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Wallet");
    }
  }

  private static final class WalletFileDescriptorSupplier
      extends WalletBaseDescriptorSupplier {
    WalletFileDescriptorSupplier() {}
  }

  private static final class WalletMethodDescriptorSupplier
      extends WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletMethodDescriptorSupplier(String methodName) {
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
      synchronized (WalletGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletFileDescriptorSupplier())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetAccountByIdMethod())
              .addMethod(getGetAccountBalanceMethod())
              .addMethod(getGetBlockBalanceTraceMethod())
              .addMethod(getCreateTransactionMethod())
              .addMethod(getCreateTransaction2Method())
              .addMethod(getBroadcastTransactionMethod())
              .addMethod(getUpdateAccountMethod())
              .addMethod(getSetAccountIdMethod())
              .addMethod(getUpdateAccount2Method())
              .addMethod(getVoteWitnessAccountMethod())
              .addMethod(getUpdateSettingMethod())
              .addMethod(getUpdateEnergyLimitMethod())
              .addMethod(getVoteWitnessAccount2Method())
              .addMethod(getCreateAssetIssueMethod())
              .addMethod(getCreateAssetIssue2Method())
              .addMethod(getUpdateWitnessMethod())
              .addMethod(getUpdateWitness2Method())
              .addMethod(getCreateAccountMethod())
              .addMethod(getCreateAccount2Method())
              .addMethod(getCreateWitnessMethod())
              .addMethod(getCreateWitness2Method())
              .addMethod(getTransferAssetMethod())
              .addMethod(getTransferAsset2Method())
              .addMethod(getParticipateAssetIssueMethod())
              .addMethod(getParticipateAssetIssue2Method())
              .addMethod(getFreezeBalanceMethod())
              .addMethod(getFreezeBalance2Method())
              .addMethod(getUnfreezeBalanceMethod())
              .addMethod(getUnfreezeBalance2Method())
              .addMethod(getUnfreezeAssetMethod())
              .addMethod(getUnfreezeAsset2Method())
              .addMethod(getWithdrawBalanceMethod())
              .addMethod(getWithdrawBalance2Method())
              .addMethod(getUpdateAssetMethod())
              .addMethod(getUpdateAsset2Method())
              .addMethod(getProposalCreateMethod())
              .addMethod(getProposalApproveMethod())
              .addMethod(getProposalDeleteMethod())
              .addMethod(getBuyStorageMethod())
              .addMethod(getBuyStorageBytesMethod())
              .addMethod(getSellStorageMethod())
              .addMethod(getExchangeCreateMethod())
              .addMethod(getExchangeInjectMethod())
              .addMethod(getExchangeWithdrawMethod())
              .addMethod(getExchangeTransactionMethod())
              .addMethod(getMarketSellAssetMethod())
              .addMethod(getMarketCancelOrderMethod())
              .addMethod(getGetMarketOrderByIdMethod())
              .addMethod(getGetMarketOrderByAccountMethod())
              .addMethod(getGetMarketPriceByPairMethod())
              .addMethod(getGetMarketOrderListByPairMethod())
              .addMethod(getGetMarketPairListMethod())
              .addMethod(getListNodesMethod())
              .addMethod(getGetAssetIssueByAccountMethod())
              .addMethod(getGetAccountNetMethod())
              .addMethod(getGetAccountResourceMethod())
              .addMethod(getGetAssetIssueByNameMethod())
              .addMethod(getGetAssetIssueListByNameMethod())
              .addMethod(getGetAssetIssueByIdMethod())
              .addMethod(getGetNowBlockMethod())
              .addMethod(getGetNowBlock2Method())
              .addMethod(getGetBlockByNumMethod())
              .addMethod(getGetBlockByNum2Method())
              .addMethod(getGetTransactionCountByBlockNumMethod())
              .addMethod(getGetBlockByIdMethod())
              .addMethod(getGetBlockByLimitNextMethod())
              .addMethod(getGetBlockByLimitNext2Method())
              .addMethod(getGetBlockByLatestNumMethod())
              .addMethod(getGetBlockByLatestNum2Method())
              .addMethod(getGetTransactionByIdMethod())
              .addMethod(getDeployContractMethod())
              .addMethod(getGetContractMethod())
              .addMethod(getGetContractInfoMethod())
              .addMethod(getTriggerContractMethod())
              .addMethod(getTriggerConstantContractMethod())
              .addMethod(getClearContractABIMethod())
              .addMethod(getListWitnessesMethod())
              .addMethod(getGetDelegatedResourceMethod())
              .addMethod(getGetDelegatedResourceAccountIndexMethod())
              .addMethod(getListProposalsMethod())
              .addMethod(getGetPaginatedProposalListMethod())
              .addMethod(getGetProposalByIdMethod())
              .addMethod(getListExchangesMethod())
              .addMethod(getGetPaginatedExchangeListMethod())
              .addMethod(getGetExchangeByIdMethod())
              .addMethod(getGetChainParametersMethod())
              .addMethod(getGetAssetIssueListMethod())
              .addMethod(getGetPaginatedAssetIssueListMethod())
              .addMethod(getTotalTransactionMethod())
              .addMethod(getGetNextMaintenanceTimeMethod())
              .addMethod(getGetTransactionSignMethod())
              .addMethod(getGetTransactionSign2Method())
              .addMethod(getCreateAddressMethod())
              .addMethod(getEasyTransferAssetMethod())
              .addMethod(getEasyTransferAssetByPrivateMethod())
              .addMethod(getEasyTransferMethod())
              .addMethod(getEasyTransferByPrivateMethod())
              .addMethod(getGenerateAddressMethod())
              .addMethod(getGetTransactionInfoByIdMethod())
              .addMethod(getAccountPermissionUpdateMethod())
              .addMethod(getAddSignMethod())
              .addMethod(getGetTransactionSignWeightMethod())
              .addMethod(getGetTransactionApprovedListMethod())
              .addMethod(getGetNodeInfoMethod())
              .addMethod(getGetRewardInfoMethod())
              .addMethod(getGetBrokerageInfoMethod())
              .addMethod(getUpdateBrokerageMethod())
              .addMethod(getCreateShieldedTransactionMethod())
              .addMethod(getGetMerkleTreeVoucherInfoMethod())
              .addMethod(getScanNoteByIvkMethod())
              .addMethod(getScanAndMarkNoteByIvkMethod())
              .addMethod(getScanNoteByOvkMethod())
              .addMethod(getGetSpendingKeyMethod())
              .addMethod(getGetExpandedSpendingKeyMethod())
              .addMethod(getGetAkFromAskMethod())
              .addMethod(getGetNkFromNskMethod())
              .addMethod(getGetIncomingViewingKeyMethod())
              .addMethod(getGetDiversifierMethod())
              .addMethod(getGetNewShieldedAddressMethod())
              .addMethod(getGetZenPaymentAddressMethod())
              .addMethod(getGetRcmMethod())
              .addMethod(getIsSpendMethod())
              .addMethod(getCreateShieldedTransactionWithoutSpendAuthSigMethod())
              .addMethod(getGetShieldTransactionHashMethod())
              .addMethod(getCreateSpendAuthSigMethod())
              .addMethod(getCreateShieldNullifierMethod())
              .addMethod(getCreateShieldedContractParametersMethod())
              .addMethod(getCreateShieldedContractParametersWithoutAskMethod())
              .addMethod(getScanShieldedTRC20NotesByIvkMethod())
              .addMethod(getScanShieldedTRC20NotesByOvkMethod())
              .addMethod(getIsShieldedTRC20ContractNoteSpentMethod())
              .addMethod(getGetTriggerInputForShieldedTRC20ContractMethod())
              .addMethod(getCreateCommonTransactionMethod())
              .addMethod(getGetTransactionInfoByBlockNumMethod())
              .addMethod(getGetBurnTrxMethod())
              .build();
        }
      }
    }
    return result;
  }
}
