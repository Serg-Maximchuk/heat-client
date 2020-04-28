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
 * Peer telemetry
 */
@Schema(description = "Peer telemetry")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-28T22:39:51.557155300+03:00[Europe/Helsinki]")
public class PeerTelemetry {
  @SerializedName("peer")
  private String peer = null;

  @SerializedName("time")
  private Long time = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("balancesEquality")
  private Integer balancesEquality = null;

  @SerializedName("blockBalancesEquality")
  private Integer blockBalancesEquality = null;

  public PeerTelemetry peer(String peer) {
    this.peer = peer;
    return this;
  }

   /**
   * Peer
   * @return peer
  **/
  @Schema(description = "Peer")
  public String getPeer() {
    return peer;
  }

  public void setPeer(String peer) {
    this.peer = peer;
  }

  public PeerTelemetry time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * Blockchain time of peer telemetry
   * @return time
  **/
  @Schema(description = "Blockchain time of peer telemetry")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public PeerTelemetry height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height of peer telemetry
   * @return height
  **/
  @Schema(description = "Height of peer telemetry")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PeerTelemetry balancesEquality(Integer balancesEquality) {
    this.balancesEquality = balancesEquality;
    return this;
  }

   /**
   * Balances equality to the peer: 0 - mismatch, 1 - equals, 2 - unknown
   * @return balancesEquality
  **/
  @Schema(description = "Balances equality to the peer: 0 - mismatch, 1 - equals, 2 - unknown")
  public Integer getBalancesEquality() {
    return balancesEquality;
  }

  public void setBalancesEquality(Integer balancesEquality) {
    this.balancesEquality = balancesEquality;
  }

  public PeerTelemetry blockBalancesEquality(Integer blockBalancesEquality) {
    this.blockBalancesEquality = blockBalancesEquality;
    return this;
  }

   /**
   * Block balances equality to the peer: 0 - mismatch, 1 - equals, 2 - unknown
   * @return blockBalancesEquality
  **/
  @Schema(description = "Block balances equality to the peer: 0 - mismatch, 1 - equals, 2 - unknown")
  public Integer getBlockBalancesEquality() {
    return blockBalancesEquality;
  }

  public void setBlockBalancesEquality(Integer blockBalancesEquality) {
    this.blockBalancesEquality = blockBalancesEquality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeerTelemetry peerTelemetry = (PeerTelemetry) o;
    return Objects.equals(this.peer, peerTelemetry.peer) &&
        Objects.equals(this.time, peerTelemetry.time) &&
        Objects.equals(this.height, peerTelemetry.height) &&
        Objects.equals(this.balancesEquality, peerTelemetry.balancesEquality) &&
        Objects.equals(this.blockBalancesEquality, peerTelemetry.blockBalancesEquality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peer, time, height, balancesEquality, blockBalancesEquality);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeerTelemetry {\n");
    
    sb.append("    peer: ").append(toIndentedString(peer)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    balancesEquality: ").append(toIndentedString(balancesEquality)).append("\n");
    sb.append("    blockBalancesEquality: ").append(toIndentedString(blockBalancesEquality)).append("\n");
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