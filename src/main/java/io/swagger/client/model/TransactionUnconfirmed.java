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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Unconfirmed Transaction class
 */
@Schema(description = "Unconfirmed Transaction class")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-28T22:39:51.557155300+03:00[Europe/Helsinki]")
public class TransactionUnconfirmed {
  @SerializedName("type")
  private Integer type = null;

  @SerializedName("subtype")
  private Integer subtype = null;

  @SerializedName("timestamp")
  private Integer timestamp = null;

  @SerializedName("deadline")
  private Integer deadline = null;

  @SerializedName("senderPublicKey")
  private String senderPublicKey = null;

  @SerializedName("recipient")
  private String recipient = null;

  @SerializedName("recipientPublicKey")
  private String recipientPublicKey = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("fee")
  private String fee = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("signatureHash")
  private String signatureHash = null;

  @SerializedName("fullHash")
  private String fullHash = null;

  @SerializedName("transaction")
  private String transaction = null;

  @SerializedName("attachment")
  private Map<String, Object> attachment = new HashMap<String, Object>();

  @SerializedName("sender")
  private String sender = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("ecBlockId")
  private String ecBlockId = null;

  @SerializedName("ecBlockHeight")
  private Integer ecBlockHeight = null;

  @SerializedName("messageBytes")
  private String messageBytes = null;

  @SerializedName("messageIsText")
  private Boolean messageIsText = false;

  @SerializedName("messageIsEncrypted")
  private Boolean messageIsEncrypted = false;

  @SerializedName("messageIsEncryptedToSelf")
  private Boolean messageIsEncryptedToSelf = false;

  public TransactionUnconfirmed type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * The transaction type
   * @return type
  **/
  @Schema(required = true, description = "The transaction type")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public TransactionUnconfirmed subtype(Integer subtype) {
    this.subtype = subtype;
    return this;
  }

   /**
   * The transaction subtype
   * @return subtype
  **/
  @Schema(required = true, description = "The transaction subtype")
  public Integer getSubtype() {
    return subtype;
  }

  public void setSubtype(Integer subtype) {
    this.subtype = subtype;
  }

  public TransactionUnconfirmed timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The time (in seconds since 24 november 2013 00:00 UTC) of the transaction
   * @return timestamp
  **/
  @Schema(required = true, description = "The time (in seconds since 24 november 2013 00:00 UTC) of the transaction")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public TransactionUnconfirmed deadline(Integer deadline) {
    this.deadline = deadline;
    return this;
  }

   /**
   * The deadline (in minutes) for the transaction to be confirmed
   * @return deadline
  **/
  @Schema(required = true, description = "The deadline (in minutes) for the transaction to be confirmed")
  public Integer getDeadline() {
    return deadline;
  }

  public void setDeadline(Integer deadline) {
    this.deadline = deadline;
  }

  public TransactionUnconfirmed senderPublicKey(String senderPublicKey) {
    this.senderPublicKey = senderPublicKey;
    return this;
  }

   /**
   * The public key of the sending account for the transaction
   * @return senderPublicKey
  **/
  @Schema(required = true, description = "The public key of the sending account for the transaction")
  public String getSenderPublicKey() {
    return senderPublicKey;
  }

  public void setSenderPublicKey(String senderPublicKey) {
    this.senderPublicKey = senderPublicKey;
  }

  public TransactionUnconfirmed recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * The account number of the recipient, if applicable
   * @return recipient
  **/
  @Schema(required = true, description = "The account number of the recipient, if applicable")
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public TransactionUnconfirmed recipientPublicKey(String recipientPublicKey) {
    this.recipientPublicKey = recipientPublicKey;
    return this;
  }

   /**
   * Recipient public key as HEX string
   * @return recipientPublicKey
  **/
  @Schema(required = true, description = "Recipient public key as HEX string")
  public String getRecipientPublicKey() {
    return recipientPublicKey;
  }

  public void setRecipientPublicKey(String recipientPublicKey) {
    this.recipientPublicKey = recipientPublicKey;
  }

  public TransactionUnconfirmed amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount in HQT (1 HQT equals 0.00000001 HEAT) of the transaction
   * @return amount
  **/
  @Schema(required = true, description = "The amount in HQT (1 HQT equals 0.00000001 HEAT) of the transaction")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public TransactionUnconfirmed fee(String fee) {
    this.fee = fee;
    return this;
  }

   /**
   * The fee in HQT (1 HQT equals 0.00000001 HEAT) of the transaction
   * @return fee
  **/
  @Schema(required = true, description = "The fee in HQT (1 HQT equals 0.00000001 HEAT) of the transaction")
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public TransactionUnconfirmed signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * The digital signature of the transaction
   * @return signature
  **/
  @Schema(required = true, description = "The digital signature of the transaction")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public TransactionUnconfirmed signatureHash(String signatureHash) {
    this.signatureHash = signatureHash;
    return this;
  }

   /**
   * A SHA-256 hash of the transaction signature
   * @return signatureHash
  **/
  @Schema(required = true, description = "A SHA-256 hash of the transaction signature")
  public String getSignatureHash() {
    return signatureHash;
  }

  public void setSignatureHash(String signatureHash) {
    this.signatureHash = signatureHash;
  }

  public TransactionUnconfirmed fullHash(String fullHash) {
    this.fullHash = fullHash;
    return this;
  }

   /**
   * The full hash of the signed transaction
   * @return fullHash
  **/
  @Schema(required = true, description = "The full hash of the signed transaction")
  public String getFullHash() {
    return fullHash;
  }

  public void setFullHash(String fullHash) {
    this.fullHash = fullHash;
  }

  public TransactionUnconfirmed transaction(String transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * The ID of the newly created transaction
   * @return transaction
  **/
  @Schema(required = true, description = "The ID of the newly created transaction")
  public String getTransaction() {
    return transaction;
  }

  public void setTransaction(String transaction) {
    this.transaction = transaction;
  }

  public TransactionUnconfirmed attachment(Map<String, Object> attachment) {
    this.attachment = attachment;
    return this;
  }

  public TransactionUnconfirmed putAttachmentItem(String key, Object attachmentItem) {
    this.attachment.put(key, attachmentItem);
    return this;
  }

   /**
   * An object containing any additional data needed for the transaction, if applicable
   * @return attachment
  **/
  @Schema(required = true, description = "An object containing any additional data needed for the transaction, if applicable")
  public Map<String, Object> getAttachment() {
    return attachment;
  }

  public void setAttachment(Map<String, Object> attachment) {
    this.attachment = attachment;
  }

  public TransactionUnconfirmed sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * The account ID of the sender
   * @return sender
  **/
  @Schema(required = true, description = "The account ID of the sender")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public TransactionUnconfirmed height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height of the block in the blockchain
   * @return height
  **/
  @Schema(required = true, description = "The height of the block in the blockchain")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public TransactionUnconfirmed version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * The transaction version number
   * @return version
  **/
  @Schema(required = true, description = "The transaction version number")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public TransactionUnconfirmed ecBlockId(String ecBlockId) {
    this.ecBlockId = ecBlockId;
    return this;
  }

   /**
   * The economic clustering block ID
   * @return ecBlockId
  **/
  @Schema(required = true, description = "The economic clustering block ID")
  public String getEcBlockId() {
    return ecBlockId;
  }

  public void setEcBlockId(String ecBlockId) {
    this.ecBlockId = ecBlockId;
  }

  public TransactionUnconfirmed ecBlockHeight(Integer ecBlockHeight) {
    this.ecBlockHeight = ecBlockHeight;
    return this;
  }

   /**
   * The economic clustering block height
   * @return ecBlockHeight
  **/
  @Schema(required = true, description = "The economic clustering block height")
  public Integer getEcBlockHeight() {
    return ecBlockHeight;
  }

  public void setEcBlockHeight(Integer ecBlockHeight) {
    this.ecBlockHeight = ecBlockHeight;
  }

  public TransactionUnconfirmed messageBytes(String messageBytes) {
    this.messageBytes = messageBytes;
    return this;
  }

   /**
   * The message bytes as HEX if any
   * @return messageBytes
  **/
  @Schema(required = true, description = "The message bytes as HEX if any")
  public String getMessageBytes() {
    return messageBytes;
  }

  public void setMessageBytes(String messageBytes) {
    this.messageBytes = messageBytes;
  }

  public TransactionUnconfirmed messageIsText(Boolean messageIsText) {
    this.messageIsText = messageIsText;
    return this;
  }

   /**
   * In case the message is a text message (binary otherwise)
   * @return messageIsText
  **/
  @Schema(required = true, description = "In case the message is a text message (binary otherwise)")
  public Boolean isMessageIsText() {
    return messageIsText;
  }

  public void setMessageIsText(Boolean messageIsText) {
    this.messageIsText = messageIsText;
  }

  public TransactionUnconfirmed messageIsEncrypted(Boolean messageIsEncrypted) {
    this.messageIsEncrypted = messageIsEncrypted;
    return this;
  }

   /**
   * Message is encrypted
   * @return messageIsEncrypted
  **/
  @Schema(required = true, description = "Message is encrypted")
  public Boolean isMessageIsEncrypted() {
    return messageIsEncrypted;
  }

  public void setMessageIsEncrypted(Boolean messageIsEncrypted) {
    this.messageIsEncrypted = messageIsEncrypted;
  }

  public TransactionUnconfirmed messageIsEncryptedToSelf(Boolean messageIsEncryptedToSelf) {
    this.messageIsEncryptedToSelf = messageIsEncryptedToSelf;
    return this;
  }

   /**
   * Message is encrypted to self
   * @return messageIsEncryptedToSelf
  **/
  @Schema(required = true, description = "Message is encrypted to self")
  public Boolean isMessageIsEncryptedToSelf() {
    return messageIsEncryptedToSelf;
  }

  public void setMessageIsEncryptedToSelf(Boolean messageIsEncryptedToSelf) {
    this.messageIsEncryptedToSelf = messageIsEncryptedToSelf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionUnconfirmed transactionUnconfirmed = (TransactionUnconfirmed) o;
    return Objects.equals(this.type, transactionUnconfirmed.type) &&
        Objects.equals(this.subtype, transactionUnconfirmed.subtype) &&
        Objects.equals(this.timestamp, transactionUnconfirmed.timestamp) &&
        Objects.equals(this.deadline, transactionUnconfirmed.deadline) &&
        Objects.equals(this.senderPublicKey, transactionUnconfirmed.senderPublicKey) &&
        Objects.equals(this.recipient, transactionUnconfirmed.recipient) &&
        Objects.equals(this.recipientPublicKey, transactionUnconfirmed.recipientPublicKey) &&
        Objects.equals(this.amount, transactionUnconfirmed.amount) &&
        Objects.equals(this.fee, transactionUnconfirmed.fee) &&
        Objects.equals(this.signature, transactionUnconfirmed.signature) &&
        Objects.equals(this.signatureHash, transactionUnconfirmed.signatureHash) &&
        Objects.equals(this.fullHash, transactionUnconfirmed.fullHash) &&
        Objects.equals(this.transaction, transactionUnconfirmed.transaction) &&
        Objects.equals(this.attachment, transactionUnconfirmed.attachment) &&
        Objects.equals(this.sender, transactionUnconfirmed.sender) &&
        Objects.equals(this.height, transactionUnconfirmed.height) &&
        Objects.equals(this.version, transactionUnconfirmed.version) &&
        Objects.equals(this.ecBlockId, transactionUnconfirmed.ecBlockId) &&
        Objects.equals(this.ecBlockHeight, transactionUnconfirmed.ecBlockHeight) &&
        Objects.equals(this.messageBytes, transactionUnconfirmed.messageBytes) &&
        Objects.equals(this.messageIsText, transactionUnconfirmed.messageIsText) &&
        Objects.equals(this.messageIsEncrypted, transactionUnconfirmed.messageIsEncrypted) &&
        Objects.equals(this.messageIsEncryptedToSelf, transactionUnconfirmed.messageIsEncryptedToSelf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subtype, timestamp, deadline, senderPublicKey, recipient, recipientPublicKey, amount, fee, signature, signatureHash, fullHash, transaction, attachment, sender, height, version, ecBlockId, ecBlockHeight, messageBytes, messageIsText, messageIsEncrypted, messageIsEncryptedToSelf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionUnconfirmed {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    senderPublicKey: ").append(toIndentedString(senderPublicKey)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    recipientPublicKey: ").append(toIndentedString(recipientPublicKey)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    signatureHash: ").append(toIndentedString(signatureHash)).append("\n");
    sb.append("    fullHash: ").append(toIndentedString(fullHash)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ecBlockId: ").append(toIndentedString(ecBlockId)).append("\n");
    sb.append("    ecBlockHeight: ").append(toIndentedString(ecBlockHeight)).append("\n");
    sb.append("    messageBytes: ").append(toIndentedString(messageBytes)).append("\n");
    sb.append("    messageIsText: ").append(toIndentedString(messageIsText)).append("\n");
    sb.append("    messageIsEncrypted: ").append(toIndentedString(messageIsEncrypted)).append("\n");
    sb.append("    messageIsEncryptedToSelf: ").append(toIndentedString(messageIsEncryptedToSelf)).append("\n");
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