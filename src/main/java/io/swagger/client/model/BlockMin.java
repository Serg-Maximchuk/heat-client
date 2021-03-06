/*
 * HEAT API
 * The HEAT <u><b>INTERACTIVE</b></u> REST API, 
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Minimal Block class
 */
@Schema(description = "Minimal Block class")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-28T22:39:51.557155300+03:00[Europe/Helsinki]")
public class BlockMin {
  @SerializedName("numberOfTransactions")
  private Integer numberOfTransactions = null;

  @SerializedName("blockSignature")
  private String blockSignature = null;

  @SerializedName("block")
  private String block = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("timestamp")
  private Integer timestamp = null;

  public BlockMin numberOfTransactions(Integer numberOfTransactions) {
    this.numberOfTransactions = numberOfTransactions;
    return this;
  }

   /**
   * The number of transactions in the block
   * @return numberOfTransactions
  **/
  @Schema(required = true, description = "The number of transactions in the block")
  public Integer getNumberOfTransactions() {
    return numberOfTransactions;
  }

  public void setNumberOfTransactions(Integer numberOfTransactions) {
    this.numberOfTransactions = numberOfTransactions;
  }

  public BlockMin blockSignature(String blockSignature) {
    this.blockSignature = blockSignature;
    return this;
  }

   /**
   * The 64-byte block signature (as HEX string)
   * @return blockSignature
  **/
  @Schema(required = true, description = "The 64-byte block signature (as HEX string)")
  public String getBlockSignature() {
    return blockSignature;
  }

  public void setBlockSignature(String blockSignature) {
    this.blockSignature = blockSignature;
  }

  public BlockMin block(String block) {
    this.block = block;
    return this;
  }

   /**
   * The block ID
   * @return block
  **/
  @Schema(required = true, description = "The block ID")
  public String getBlock() {
    return block;
  }

  public void setBlock(String block) {
    this.block = block;
  }

  public BlockMin height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The zero-based block height
   * @return height
  **/
  @Schema(required = true, description = "The zero-based block height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public BlockMin timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp (in seconds since 24 november 2013 00:00 UTC) of the block
   * @return timestamp
  **/
  @Schema(required = true, description = "The timestamp (in seconds since 24 november 2013 00:00 UTC) of the block")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockMin blockMin = (BlockMin) o;
    return Objects.equals(this.numberOfTransactions, blockMin.numberOfTransactions) &&
        Objects.equals(this.blockSignature, blockMin.blockSignature) &&
        Objects.equals(this.block, blockMin.block) &&
        Objects.equals(this.height, blockMin.height) &&
        Objects.equals(this.timestamp, blockMin.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfTransactions, blockSignature, block, height, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockMin {\n");
    
    sb.append("    numberOfTransactions: ").append(toIndentedString(numberOfTransactions)).append("\n");
    sb.append("    blockSignature: ").append(toIndentedString(blockSignature)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
