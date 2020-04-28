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
 * Hallmark class
 */
@Schema(description = "Hallmark class")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-28T22:39:51.557155300+03:00[Europe/Helsinki]")
public class Hallmark {
  @SerializedName("valid")
  private Boolean valid = false;

  @SerializedName("weight")
  private Integer weight = null;

  @SerializedName("host")
  private String host = null;

  @SerializedName("account")
  private String account = null;

  @SerializedName("date")
  private String date = null;

  public Hallmark valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * True if host is less than 100 characters, weight &gt; 0 and the embedded signature is verified
   * @return valid
  **/
  @Schema(required = true, description = "True if host is less than 100 characters, weight > 0 and the embedded signature is verified")
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Hallmark weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The weight assigned to the hallmark
   * @return weight
  **/
  @Schema(required = true, description = "The weight assigned to the hallmark")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public Hallmark host(String host) {
    this.host = host;
    return this;
  }

   /**
   * The IP address or domain name associated with the hallmark
   * @return host
  **/
  @Schema(required = true, description = "The IP address or domain name associated with the hallmark")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public Hallmark account(String account) {
    this.account = account;
    return this;
  }

   /**
   * The account number associated with the hallmark
   * @return account
  **/
  @Schema(required = true, description = "The account number associated with the hallmark")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public Hallmark date(String date) {
    this.date = date;
    return this;
  }

   /**
   * The date the hallmark was created, in YYYY-MM-DD format
   * @return date
  **/
  @Schema(required = true, description = "The date the hallmark was created, in YYYY-MM-DD format")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hallmark hallmark = (Hallmark) o;
    return Objects.equals(this.valid, hallmark.valid) &&
        Objects.equals(this.weight, hallmark.weight) &&
        Objects.equals(this.host, hallmark.host) &&
        Objects.equals(this.account, hallmark.account) &&
        Objects.equals(this.date, hallmark.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, weight, host, account, date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hallmark {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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