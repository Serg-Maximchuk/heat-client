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
 * AccountBalance class
 */
@Schema(description = "AccountBalance class")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-28T22:39:51.557155300+03:00[Europe/Helsinki]")
public class AccountBalance {
  @SerializedName("asset")
  private String asset = null;

  @SerializedName("balance")
  private String balance = null;

  @SerializedName("unconfirmedBalance")
  private String unconfirmedBalance = null;

  @SerializedName("virtualBalance")
  private String virtualBalance = null;

  @SerializedName("properties")
  private String properties = null;

  @SerializedName("decimals")
  private Integer decimals = null;

  public AccountBalance asset(String asset) {
    this.asset = asset;
    return this;
  }

   /**
   * Asset ID, asset&#x3D;0 is your HEAT balance all others are assets you own
   * @return asset
  **/
  @Schema(required = true, description = "Asset ID, asset=0 is your HEAT balance all others are assets you own")
  public String getAsset() {
    return asset;
  }

  public void setAsset(String asset) {
    this.asset = asset;
  }

  public AccountBalance balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Account balance in QNT (1 QNT equals 0.00000001)
   * @return balance
  **/
  @Schema(required = true, description = "Account balance in QNT (1 QNT equals 0.00000001)")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public AccountBalance unconfirmedBalance(String unconfirmedBalance) {
    this.unconfirmedBalance = unconfirmedBalance;
    return this;
  }

   /**
   * Unconfirmed balance in QNT (1 QNT equals 0.00000001)
   * @return unconfirmedBalance
  **/
  @Schema(required = true, description = "Unconfirmed balance in QNT (1 QNT equals 0.00000001)")
  public String getUnconfirmedBalance() {
    return unconfirmedBalance;
  }

  public void setUnconfirmedBalance(String unconfirmedBalance) {
    this.unconfirmedBalance = unconfirmedBalance;
  }

  public AccountBalance virtualBalance(String virtualBalance) {
    this.virtualBalance = virtualBalance;
    return this;
  }

   /**
   * Virtual balance in QNT (1 QNT equals 0.00000001)
   * @return virtualBalance
  **/
  @Schema(required = true, description = "Virtual balance in QNT (1 QNT equals 0.00000001)")
  public String getVirtualBalance() {
    return virtualBalance;
  }

  public void setVirtualBalance(String virtualBalance) {
    this.virtualBalance = virtualBalance;
  }

  public AccountBalance properties(String properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Currency properties based on protocol and account id
   * @return properties
  **/
  @Schema(description = "Currency properties based on protocol and account id")
  public String getProperties() {
    return properties;
  }

  public void setProperties(String properties) {
    this.properties = properties;
  }

  public AccountBalance decimals(Integer decimals) {
    this.decimals = decimals;
    return this;
  }

   /**
   * Currency decimals
   * @return decimals
  **/
  @Schema(description = "Currency decimals")
  public Integer getDecimals() {
    return decimals;
  }

  public void setDecimals(Integer decimals) {
    this.decimals = decimals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBalance accountBalance = (AccountBalance) o;
    return Objects.equals(this.asset, accountBalance.asset) &&
        Objects.equals(this.balance, accountBalance.balance) &&
        Objects.equals(this.unconfirmedBalance, accountBalance.unconfirmedBalance) &&
        Objects.equals(this.virtualBalance, accountBalance.virtualBalance) &&
        Objects.equals(this.properties, accountBalance.properties) &&
        Objects.equals(this.decimals, accountBalance.decimals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, balance, unconfirmedBalance, virtualBalance, properties, decimals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBalance {\n");
    
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    unconfirmedBalance: ").append(toIndentedString(unconfirmedBalance)).append("\n");
    sb.append("    virtualBalance: ").append(toIndentedString(virtualBalance)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
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
