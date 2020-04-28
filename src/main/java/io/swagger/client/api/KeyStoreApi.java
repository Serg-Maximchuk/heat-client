package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Count;
import io.swagger.client.model.KeyStoreBundle;
import io.swagger.client.model.TransactionCreate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface KeyStoreApi {
  /**
   * Counts key/value entries for an account (requires replicator)
   * 
   * @param account The account scope (numeric account identifier) (required)
   * @return Call&lt;Count&gt;
   */
  @GET("keystore/count/{account}")
  Call<Count> keyStoreCount(
            @retrofit2.http.Path("account") String account            
  );

  /**
   * Get the value for account key value  (requires replicator)
   * 
   * @param account The account scope (numeric account identifier) (required)
   * @param key Key name (UTF-8, max length when converted to bytes is 100) (required)
   * @return Call&lt;KeyStoreBundle&gt;
   */
  @GET("keystore/get/{account}/{key}")
  Call<KeyStoreBundle> keyStoreGet(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("key") String key            
  );

  /**
   * Lists all keys for account (requires replicator)
   * 
   * @param account The account scope (numeric account identifier) (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;KeyStoreBundle&gt;&gt;
   */
  @GET("keystore/list/{account}/{from}/{to}")
  Call<List<KeyStoreBundle>> keyStoreList(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Sets the value identified by key (requires replicator)
   * 
   * @param key  (required)
   * @param value  (required)
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
  @POST("keystore/put")
  Call<TransactionCreate> keyStorePut(
                        @retrofit2.http.Field("key") String key,                     @retrofit2.http.Field("value") String value,                     @retrofit2.http.Field("fee") String fee,                     @retrofit2.http.Field("deadline") String deadline,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("publicKey") String publicKey,                     @retrofit2.http.Field("recipient") String recipient,                     @retrofit2.http.Field("recipientPublicKey") String recipientPublicKey,                     @retrofit2.http.Field("broadcast") String broadcast,                     @retrofit2.http.Field("privateNameAnnouncement") String privateNameAnnouncement,                     @retrofit2.http.Field("publicNameAnnouncement") String publicNameAnnouncement,                     @retrofit2.http.Field("message") String message,                     @retrofit2.http.Field("messageIsText") String messageIsText,                     @retrofit2.http.Field("messageToEncrypt") String messageToEncrypt,                     @retrofit2.http.Field("messageToEncryptIsText") String messageToEncryptIsText,                     @retrofit2.http.Field("encryptedMessageData") String encryptedMessageData,                     @retrofit2.http.Field("encryptedMessageNonce") String encryptedMessageNonce,                     @retrofit2.http.Field("messageToEncryptToSelf") String messageToEncryptToSelf,                     @retrofit2.http.Field("messageToEncryptToSelfIsText") String messageToEncryptToSelfIsText,                     @retrofit2.http.Field("encryptToSelfMessageData") String encryptToSelfMessageData,                     @retrofit2.http.Field("encryptToSelfMessageNonce") String encryptToSelfMessageNonce,                     @retrofit2.http.Field("privateNameAssignment") String privateNameAssignment,                     @retrofit2.http.Field("privateNameAssignmentSignature") String privateNameAssignmentSignature,                     @retrofit2.http.Field("publicNameAssignment") String publicNameAssignment,                     @retrofit2.http.Field("publicNameAssignmentSignature") String publicNameAssignmentSignature
  );

}
