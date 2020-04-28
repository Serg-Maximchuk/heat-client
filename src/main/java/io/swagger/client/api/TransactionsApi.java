package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Broadcast;
import io.swagger.client.model.FullHash;
import io.swagger.client.model.SignResponse;
import io.swagger.client.model.TransactionCreate;
import io.swagger.client.model.TransactionVerify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TransactionsApi {
  /**
   * Broadcast a transaction to the network
   * 
   * @param transactionBytes  (optional)
   * @param transactionJSON  (optional)
   * @return Call&lt;Broadcast&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("tx/broadcast")
  Call<Broadcast> broadcast(
                        @retrofit2.http.Field("transactionBytes") String transactionBytes,                     @retrofit2.http.Field("transactionJSON") String transactionJSON
  );

  /**
   * Get a transaction object given a (signed or unsigned) transaction bytecode, or re-parse a transaction object. Verify the signature. Check applicability of transaction at moment
   * 
   * @param transactionJSON  (optional)
   * @param transactionBytes  (optional)
   * @return Call&lt;TransactionVerify&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("tx/check")
  Call<TransactionVerify> checkApplicability(
                        @retrofit2.http.Field("transactionJSON") String transactionJSON,                     @retrofit2.http.Field("transactionBytes") String transactionBytes
  );

  /**
   * Create and optionally sign and broadcast any type of transaction from a JSON document
   * &lt;code&gt;// Transaction fee in HQT (1 HQT equals 0.00000001 HEAT) default fee is 0.01 HEAT&lt;br&gt;fee: string,&lt;br&gt;&lt;br&gt;// The deadline (in minutes) for the transaction to be confirmed, 1440 minutes maximum&lt;br&gt;deadline: number,&lt;br&gt;&lt;br&gt;// The secret passphrase of the account (optional, but transaction neither signed nor broadcast if omitted)&lt;br&gt;secretPhrase: string,&lt;br&gt;&lt;br&gt;// The public key of the account (optional if secretPhrase provided)&lt;br&gt;publicKey: string,&lt;br&gt;&lt;br&gt;// The account ID of the recipient (optional)&lt;br&gt;recipient: string,&lt;br&gt;&lt;br&gt;// The public key of the receiving account (optional, enhances security of a new account)&lt;br&gt;recipientPublicKey: string,&lt;br&gt;&lt;br&gt;// Set to false to prevent broadcasting the transaction to the network (optional)&lt;br&gt;broadcast: boolean,&lt;br&gt;&lt;br&gt;// Either UTF-8 text or a string of hex digits (perhaps previously encoded using an arbitrary algorithm) to be converted into a bytecode with a maximum length of one kilobyte&lt;br&gt;message: string,&lt;br&gt;&lt;br&gt;// False if the message is a hex string, otherwise the message is text (optional)&lt;br&gt;messageIsText: boolean,&lt;br&gt;&lt;br&gt;// Either UTF-8 text or a string of hex digits to be compressed (unless compressMessageToEncrypt is false) and converted into a bytecode with a maximum length of one kilobyte&lt;br&gt;messageToEncrypt: string,&lt;br&gt;&lt;br&gt;// False if the message to encrypt is a hex string, otherwise the message to encrypt is text (optional)&lt;br&gt;messageToEncryptIsText: string,&lt;br&gt;&lt;br&gt;// Already encrypted data which overrides messageToEncrypt if provided (optional)&lt;br&gt;encryptedMessageData: string,&lt;br&gt;&lt;br&gt;// A unique 32-byte number which cannot be reused (optional unless encryptedMessageData is provided)&lt;br&gt;encryptedMessageNonce: string,&lt;br&gt;&lt;br&gt;// Either UTF-8 text or a string of hex digits to be compressed (unless compressMessageToEncryptToSelf is false) and converted into a one kilobyte maximum bytecode then encrypted with AES, then sent to the sending account (optional)&lt;br&gt;messageToEncryptToSelf: string,&lt;br&gt;&lt;br&gt;// False if the message to self-encrypt is a hex string, otherwise the message to encrypt is text (optional)&lt;br&gt;messageToEncryptToSelfIsText: boolean, &lt;br&gt;&lt;br&gt;// Already encrypted data which overrides messageToEncryptToSelf if provided (optional)&lt;br&gt;encryptToSelfMessageData: string,&lt;br&gt;&lt;br&gt;// A unique 32-byte number which cannot be reused (optional unless encryptToSelfMessageData is provided)&lt;br&gt;public String encryptToSelfMessageNonce;&lt;br&gt;&lt;br&gt;// 8 byte numeric name hash (optional, announces non-public name to your account)&lt;br&gt;privateNameAnnouncement: string,&lt;br&gt;&lt;br&gt;// Account name, UTF-8 min length 3, max length 100 (optional, announces public name to your account)&lt;br&gt;publicNameAnnouncement: string, &lt;br&gt;&lt;br&gt;// 8 byte numeric name hash (optional, assigns non-public name to recipient account)&lt;br&gt;privateNameAssignment: string,&lt;br&gt;&lt;br&gt;// Private name assignment signature (required when privateNameAssignment was given, see /tools/privatename/signature for details)&lt;br&gt;privateNameAssignmentSignature: string,&lt;br&gt;&lt;br&gt;// Account name, UTF-8 min length 3, max length 100 (optional, assigns public name to recipient account)&lt;br&gt;publicNameAssignment: string,&lt;br&gt;&lt;br&gt;// Public name assignment signature (required when publicNameAssignment was given, see /tools/publicname/signature for details)&lt;br&gt;publicNameAssignmentSignature: string,&lt;br&gt;&lt;br&gt;EffectiveBalanceLeasing: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;period: number&lt;br&gt;}&lt;br&gt;AskOrderCancellation: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;orderId: string&lt;br&gt;}&lt;br&gt;BidOrderCancellation: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;orderId: string&lt;br&gt;}&lt;br&gt;AskOrderPlacement: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;currencyId: string,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;assetId: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantity: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;price: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;expiration: number&lt;br&gt;}&lt;br&gt;BidOrderPlacement: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;currencyId: string,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;assetId: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantity: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;price: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;expiration: number&lt;br&gt;}&lt;br&gt;AssetIssuance: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;descriptionUrl: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;descriptionHash: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantityQNT: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;decimals: number, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;dillutable: boolean&lt;br&gt;}&lt;br&gt;AssetIssueMore: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;assetId: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantity: string&lt;br&gt;}&lt;br&gt;AssetTransfer: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;assetId: string,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantity: string&lt;br&gt;}&lt;br&gt;OrdinaryPayment: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;amountHQT: string,&lt;br&gt;}&lt;br&gt;ArbitraryMessage: {}&lt;br&gt;&lt;/code&gt;
   * @param value  (required)
   * @return Call&lt;TransactionCreate&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("tx/create")
  Call<TransactionCreate> create(
                        @retrofit2.http.Field("value") String value
  );

  /**
   * Calculate the full hash of a transaction.
   * 
   * @param unsignedTransactionJSON  (optional)
   * @param unsignedTransactionBytes  (optional)
   * @param signatureHash  (optional)
   * @return Call&lt;FullHash&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("tx/fullhash")
  Call<FullHash> fullhash(
                        @retrofit2.http.Field("unsignedTransactionJSON") String unsignedTransactionJSON,                     @retrofit2.http.Field("unsignedTransactionBytes") String unsignedTransactionBytes,                     @retrofit2.http.Field("signatureHash") String signatureHash
  );

  /**
   * Lease the entire guaranteed balance of HEAT to another account, after 1440 confirmations
   * 
   * @param period  (required)
   * @param fee  (required)
   * @param deadline  (required)
   * @param secretPhrase  (required)
   * @param publicKey  (required)
   * @param recipient  (required)
   * @param recipientPublicKey  (required)
   * @param broadcast  (required)
   * @param privateNameAnnouncement  (required)
   * @param publicNameAnnouncement  (required)
   * @return Call&lt;TransactionCreate&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("tx/lease")
  Call<TransactionCreate> lease(
                        @retrofit2.http.Field("period") String period,                     @retrofit2.http.Field("fee") String fee,                     @retrofit2.http.Field("deadline") String deadline,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("publicKey") String publicKey,                     @retrofit2.http.Field("recipient") String recipient,                     @retrofit2.http.Field("recipientPublicKey") String recipientPublicKey,                     @retrofit2.http.Field("broadcast") String broadcast,                     @retrofit2.http.Field("privateNameAnnouncement") String privateNameAnnouncement,                     @retrofit2.http.Field("publicNameAnnouncement") String publicNameAnnouncement
  );

  /**
   * Get a transaction object given a (signed or unsigned) transaction bytecode, or re-parse a transaction object. Verify the signature
   * 
   * @param transactionJSON  (optional)
   * @param transactionBytes  (optional)
   * @return Call&lt;TransactionVerify&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("tx/parse")
  Call<TransactionVerify> parse(
                        @retrofit2.http.Field("transactionJSON") String transactionJSON,                     @retrofit2.http.Field("transactionBytes") String transactionBytes
  );

  /**
   * Register internet address for sender account (the host of node on which account is forging)
   * 
   * @param internetAddress  (required)
   * @param fee  (required)
   * @param deadline  (required)
   * @param secretPhrase  (required)
   * @param publicKey  (required)
   * @param recipient  (required)
   * @param recipientPublicKey  (required)
   * @param broadcast  (required)
   * @param privateNameAnnouncement  (required)
   * @param publicNameAnnouncement  (required)
   * @return Call&lt;TransactionCreate&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("tx/internetaddress")
  Call<TransactionCreate> registerInternetAddress(
                        @retrofit2.http.Field("internetAddress") String internetAddress,                     @retrofit2.http.Field("fee") String fee,                     @retrofit2.http.Field("deadline") String deadline,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("publicKey") String publicKey,                     @retrofit2.http.Field("recipient") String recipient,                     @retrofit2.http.Field("recipientPublicKey") String recipientPublicKey,                     @retrofit2.http.Field("broadcast") String broadcast,                     @retrofit2.http.Field("privateNameAnnouncement") String privateNameAnnouncement,                     @retrofit2.http.Field("publicNameAnnouncement") String publicNameAnnouncement
  );

  /**
   * Create an Arbitrary Message transaction
   * 
   * @param fee  (required)
   * @param deadline  (required)
   * @param secretPhrase  (required)
   * @param publicKey  (required)
   * @param recipient  (required)
   * @param recipientPublicKey  (required)
   * @param broadcast  (required)
   * @param privateNameAnnouncement  (required)
   * @param publicNameAnnouncement  (required)
   * @param message  (required)
   * @param messageIsText  (required)
   * @param messageToEncrypt  (required)
   * @param messageToEncryptIsText  (required)
   * @param encryptedMessageData  (required)
   * @param encryptedMessageNonce  (required)
   * @param messageToEncryptToSelf  (required)
   * @param messageToEncryptToSelfIsText  (required)
   * @param encryptToSelfMessageData  (required)
   * @param encryptToSelfMessageNonce  (required)
   * @param privateNameAssignment  (required)
   * @param privateNameAssignmentSignature  (required)
   * @param publicNameAssignment  (required)
   * @param publicNameAssignmentSignature  (required)
   * @return Call&lt;TransactionCreate&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("tx/sendmessage")
  Call<TransactionCreate> sendMessage(
                        @retrofit2.http.Field("fee") String fee,                     @retrofit2.http.Field("deadline") String deadline,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("publicKey") String publicKey,                     @retrofit2.http.Field("recipient") String recipient,                     @retrofit2.http.Field("recipientPublicKey") String recipientPublicKey,                     @retrofit2.http.Field("broadcast") String broadcast,                     @retrofit2.http.Field("privateNameAnnouncement") String privateNameAnnouncement,                     @retrofit2.http.Field("publicNameAnnouncement") String publicNameAnnouncement,                     @retrofit2.http.Field("message") String message,                     @retrofit2.http.Field("messageIsText") String messageIsText,                     @retrofit2.http.Field("messageToEncrypt") String messageToEncrypt,                     @retrofit2.http.Field("messageToEncryptIsText") String messageToEncryptIsText,                     @retrofit2.http.Field("encryptedMessageData") String encryptedMessageData,                     @retrofit2.http.Field("encryptedMessageNonce") String encryptedMessageNonce,                     @retrofit2.http.Field("messageToEncryptToSelf") String messageToEncryptToSelf,                     @retrofit2.http.Field("messageToEncryptToSelfIsText") String messageToEncryptToSelfIsText,                     @retrofit2.http.Field("encryptToSelfMessageData") String encryptToSelfMessageData,                     @retrofit2.http.Field("encryptToSelfMessageNonce") String encryptToSelfMessageNonce,                     @retrofit2.http.Field("privateNameAssignment") String privateNameAssignment,                     @retrofit2.http.Field("privateNameAssignmentSignature") String privateNameAssignmentSignature,                     @retrofit2.http.Field("publicNameAssignment") String publicNameAssignment,                     @retrofit2.http.Field("publicNameAssignmentSignature") String publicNameAssignmentSignature
  );

  /**
   * Send HEAT to an account
   * 
   * @param amount  (required)
   * @param fee  (required)
   * @param deadline  (required)
   * @param secretPhrase  (required)
   * @param publicKey  (required)
   * @param recipient  (required)
   * @param recipientPublicKey  (required)
   * @param broadcast  (required)
   * @param privateNameAnnouncement  (required)
   * @param publicNameAnnouncement  (required)
   * @param message  (required)
   * @param messageIsText  (required)
   * @param messageToEncrypt  (required)
   * @param messageToEncryptIsText  (required)
   * @param encryptedMessageData  (required)
   * @param encryptedMessageNonce  (required)
   * @param messageToEncryptToSelf  (required)
   * @param messageToEncryptToSelfIsText  (required)
   * @param encryptToSelfMessageData  (required)
   * @param encryptToSelfMessageNonce  (required)
   * @param privateNameAssignment  (required)
   * @param privateNameAssignmentSignature  (required)
   * @param publicNameAssignment  (required)
   * @param publicNameAssignmentSignature  (required)
   * @return Call&lt;TransactionCreate&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("tx/sendmoney")
  Call<TransactionCreate> sendMoney(
                        @retrofit2.http.Field("amount") String amount,                     @retrofit2.http.Field("fee") String fee,                     @retrofit2.http.Field("deadline") String deadline,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("publicKey") String publicKey,                     @retrofit2.http.Field("recipient") String recipient,                     @retrofit2.http.Field("recipientPublicKey") String recipientPublicKey,                     @retrofit2.http.Field("broadcast") String broadcast,                     @retrofit2.http.Field("privateNameAnnouncement") String privateNameAnnouncement,                     @retrofit2.http.Field("publicNameAnnouncement") String publicNameAnnouncement,                     @retrofit2.http.Field("message") String message,                     @retrofit2.http.Field("messageIsText") String messageIsText,                     @retrofit2.http.Field("messageToEncrypt") String messageToEncrypt,                     @retrofit2.http.Field("messageToEncryptIsText") String messageToEncryptIsText,                     @retrofit2.http.Field("encryptedMessageData") String encryptedMessageData,                     @retrofit2.http.Field("encryptedMessageNonce") String encryptedMessageNonce,                     @retrofit2.http.Field("messageToEncryptToSelf") String messageToEncryptToSelf,                     @retrofit2.http.Field("messageToEncryptToSelfIsText") String messageToEncryptToSelfIsText,                     @retrofit2.http.Field("encryptToSelfMessageData") String encryptToSelfMessageData,                     @retrofit2.http.Field("encryptToSelfMessageNonce") String encryptToSelfMessageNonce,                     @retrofit2.http.Field("privateNameAssignment") String privateNameAssignment,                     @retrofit2.http.Field("privateNameAssignmentSignature") String privateNameAssignmentSignature,                     @retrofit2.http.Field("publicNameAssignment") String publicNameAssignment,                     @retrofit2.http.Field("publicNameAssignmentSignature") String publicNameAssignmentSignature
  );

  /**
   * Calculates the full hash, signature hash, and transaction ID of an unsigned transaction
   * 
   * @param unsignedTransactionJSON  (required)
   * @param unsignedTransactionBytes  (required)
   * @param secretPhrase  (required)
   * @param validate  (required)
   * @return Call&lt;SignResponse&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("tx/sign")
  Call<SignResponse> sign(
                        @retrofit2.http.Field("unsignedTransactionJSON") String unsignedTransactionJSON,                     @retrofit2.http.Field("unsignedTransactionBytes") String unsignedTransactionBytes,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("validate") String validate
  );

}
