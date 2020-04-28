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
 * AccountAsset class
 */
@Schema(description = "AccountAsset class")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-28T22:39:51.557155300+03:00[Europe/Helsinki]")
public class AccountAsset {
  @SerializedName("account")
  private String account = null;

  @SerializedName("asset")
  private String asset = null;

  @SerializedName("quantity")
  private String quantity = null;

  @SerializedName("unconfirmedQuantity")
  private String unconfirmedQuantity = null;

  public AccountAsset account(String account) {
    this.account = account;
    return this;
  }

   /**
   * The account id
   * @return account
  **/
  @Schema(required = true, description = "The account id")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public AccountAsset asset(String asset) {
    this.asset = asset;
    return this;
  }

   /**
   * The asset id
   * @return asset
  **/
  @Schema(required = true, description = "The asset id")
  public String getAsset() {
    return asset;
  }

  public void setAsset(String asset) {
    this.asset = asset;
  }

  public AccountAsset quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Confirmed balance
   * @return quantity
  **/
  @Schema(required = true, description = "Confirmed balance")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public AccountAsset unconfirmedQuantity(String unconfirmedQuantity) {
    this.unconfirmedQuantity = unconfirmedQuantity;
    return this;
  }

   /**
   * Unconfirmed balance
   * @return unconfirmedQuantity
  **/
  @Schema(required = true, description = "Unconfirmed balance")
  public String getUnconfirmedQuantity() {
    return unconfirmedQuantity;
  }

  public void setUnconfirmedQuantity(String unconfirmedQuantity) {
    this.unconfirmedQuantity = unconfirmedQuantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAsset accountAsset = (AccountAsset) o;
    return Objects.equals(this.account, accountAsset.account) &&
        Objects.equals(this.asset, accountAsset.asset) &&
        Objects.equals(this.quantity, accountAsset.quantity) &&
        Objects.equals(this.unconfirmedQuantity, accountAsset.unconfirmedQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, asset, quantity, unconfirmedQuantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAsset {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unconfirmedQuantity: ").append(toIndentedString(unconfirmedQuantity)).append("\n");
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