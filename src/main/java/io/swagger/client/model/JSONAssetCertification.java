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
 * JSONAssetCertification
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-28T22:39:51.557155300+03:00[Europe/Helsinki]")
public class JSONAssetCertification {
  @SerializedName("asset")
  private String asset = null;

  @SerializedName("certified")
  private Boolean certified = false;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("certifierAccount")
  private String certifierAccount = null;

  public JSONAssetCertification asset(String asset) {
    this.asset = asset;
    return this;
  }

   /**
   * Asset id
   * @return asset
  **/
  @Schema(required = true, description = "Asset id")
  public String getAsset() {
    return asset;
  }

  public void setAsset(String asset) {
    this.asset = asset;
  }

  public JSONAssetCertification certified(Boolean certified) {
    this.certified = certified;
    return this;
  }

   /**
   * Certified status [true,false]
   * @return certified
  **/
  @Schema(required = true, description = "Certified status [true,false]")
  public Boolean isCertified() {
    return certified;
  }

  public void setCertified(Boolean certified) {
    this.certified = certified;
  }

  public JSONAssetCertification symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Certified asset assigned symbol
   * @return symbol
  **/
  @Schema(required = true, description = "Certified asset assigned symbol")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public JSONAssetCertification name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Certified asset assigned name
   * @return name
  **/
  @Schema(required = true, description = "Certified asset assigned name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JSONAssetCertification certifierAccount(String certifierAccount) {
    this.certifierAccount = certifierAccount;
    return this;
  }

   /**
   * Certifier account id
   * @return certifierAccount
  **/
  @Schema(required = true, description = "Certifier account id")
  public String getCertifierAccount() {
    return certifierAccount;
  }

  public void setCertifierAccount(String certifierAccount) {
    this.certifierAccount = certifierAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JSONAssetCertification jsONAssetCertification = (JSONAssetCertification) o;
    return Objects.equals(this.asset, jsONAssetCertification.asset) &&
        Objects.equals(this.certified, jsONAssetCertification.certified) &&
        Objects.equals(this.symbol, jsONAssetCertification.symbol) &&
        Objects.equals(this.name, jsONAssetCertification.name) &&
        Objects.equals(this.certifierAccount, jsONAssetCertification.certifierAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, certified, symbol, name, certifierAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSONAssetCertification {\n");
    
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    certified: ").append(toIndentedString(certified)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    certifierAccount: ").append(toIndentedString(certifierAccount)).append("\n");
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
