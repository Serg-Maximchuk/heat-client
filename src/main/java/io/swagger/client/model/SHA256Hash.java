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
 * SHA256Hash class
 */
@Schema(description = "SHA256Hash class")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-28T22:39:51.557155300+03:00[Europe/Helsinki]")
public class SHA256Hash {
  @SerializedName("message")
  private String message = null;

  @SerializedName("isText")
  private Boolean isText = false;

  @SerializedName("digest")
  private String digest = null;

  public SHA256Hash message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The input data, could be either UTF-8 text or binary data encoded as HEX
   * @return message
  **/
  @Schema(required = true, description = "The input data, could be either UTF-8 text or binary data encoded as HEX")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SHA256Hash isText(Boolean isText) {
    this.isText = isText;
    return this;
  }

   /**
   * Indicator if the the input is either text/utf-8 or binary data encoded as HEX
   * @return isText
  **/
  @Schema(required = true, description = "Indicator if the the input is either text/utf-8 or binary data encoded as HEX")
  public Boolean isIsText() {
    return isText;
  }

  public void setIsText(Boolean isText) {
    this.isText = isText;
  }

  public SHA256Hash digest(String digest) {
    this.digest = digest;
    return this;
  }

   /**
   * The hash value encoded as HEX string
   * @return digest
  **/
  @Schema(required = true, description = "The hash value encoded as HEX string")
  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SHA256Hash shA256Hash = (SHA256Hash) o;
    return Objects.equals(this.message, shA256Hash.message) &&
        Objects.equals(this.isText, shA256Hash.isText) &&
        Objects.equals(this.digest, shA256Hash.digest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, isText, digest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SHA256Hash {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    isText: ").append(toIndentedString(isText)).append("\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
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
