// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

public interface SimulateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.tx.v1beta1.SimulateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * gas_info is the information about gas used in the simulation.
   * </pre>
   *
   * <code>.cosmos.base.abci.v1beta1.GasInfo gas_info = 1;</code>
   */
  boolean hasGasInfo();
  /**
   * <pre>
   * gas_info is the information about gas used in the simulation.
   * </pre>
   *
   * <code>.cosmos.base.abci.v1beta1.GasInfo gas_info = 1;</code>
   */
  cosmos.base.abci.v1beta1.GasInfo getGasInfo();
  /**
   * <pre>
   * gas_info is the information about gas used in the simulation.
   * </pre>
   *
   * <code>.cosmos.base.abci.v1beta1.GasInfo gas_info = 1;</code>
   */
  cosmos.base.abci.v1beta1.GasInfoOrBuilder getGasInfoOrBuilder();

  /**
   * <pre>
   * result is the result of the simulation.
   * </pre>
   *
   * <code>.cosmos.base.abci.v1beta1.Result result = 2;</code>
   */
  boolean hasResult();
  /**
   * <pre>
   * result is the result of the simulation.
   * </pre>
   *
   * <code>.cosmos.base.abci.v1beta1.Result result = 2;</code>
   */
  cosmos.base.abci.v1beta1.Result getResult();
  /**
   * <pre>
   * result is the result of the simulation.
   * </pre>
   *
   * <code>.cosmos.base.abci.v1beta1.Result result = 2;</code>
   */
  cosmos.base.abci.v1beta1.ResultOrBuilder getResultOrBuilder();
}
