package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.DecryptedData;
import io.swagger.client.model.EncryptedData;
import io.swagger.client.model.Hallmark;
import io.swagger.client.model.HallmarkResponse;
import io.swagger.client.model.PeerRejection;
import io.swagger.client.model.PeerStateIndicator;
import io.swagger.client.model.PeerTelemetry;
import io.swagger.client.model.SHA256Hash;
import io.swagger.client.model.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ToolsApi {
  /**
   * Creates a signature to use for assigning public or private account name
   * 
   * @param fullNameUTF8 The account name you wish to assign (required)
   * @param secretPhrase The secret phrase of the account we are assigning the name to (required)
   * @return Call&lt;Value&gt;
   */
  @GET("tools/assign/name/signature/{fullNameUTF8}/{secretPhrase}")
  Call<Value> assign(
            @retrofit2.http.Path("fullNameUTF8") String fullNameUTF8            ,         @retrofit2.http.Path("secretPhrase") String secretPhrase            
  );

  /**
   * Creates a signature to use for assigning public or private account name
   * 
   * @param body  (required)
   * @return Call&lt;Value&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tools/assign/name/signature")
  Call<Value> assignPost(
                    @retrofit2.http.Body Object body    
  );

  /**
   * Peer hashes of all balances and hashes of block balances in heights range. 0 means equality or mismatch is unknown
   * 
   * @param fromHeight from height (required)
   * @param toHeight from height (required)
   * @return Call&lt;Value&gt;
   */
  @GET("tools/telemetry/balancesHash/{fromHeight}/{toHeight}")
  Call<Value> balancesHashes(
            @retrofit2.http.Path("fromHeight") Integer fromHeight            ,         @retrofit2.http.Path("toHeight") Integer toHeight            
  );

  /**
   * Peer hash of all balances and hash of block balances at height. 0 means the hash is not calculated
   * 
   * @param height At height (required)
   * @return Call&lt;Value&gt;
   */
  @GET("tools/telemetry/balancesHash/{height}")
  Call<Value> balancesHashes_0(
            @retrofit2.http.Path("height") Integer height            
  );

  /**
   * Decode a node hallmark
   * 
   * @param hallmark The hallmark value (required)
   * @return Call&lt;Hallmark&gt;
   */
  @GET("tools/hallmark/decode/{hallmark}")
  Call<Hallmark> decode(
            @retrofit2.http.Path("hallmark") String hallmark            
  );

  /**
   * Encrypt a message using AES without sending it
   * 
   * @param recipient Either the numeric account id of the recipient, or the recipient public key as HEX encoded string (required)
   * @param data AES-encrypted data as HEX string (required)
   * @param nonce The unique nonce associated with the encrypted data (required)
   * @param isText Indicates if the message is to be considered UTF-8 text or if its HEX encoded binary data (required)
   * @param uncompress If &#x60;true&#x60; the encrypted data is GZIP compressed and thus needs to be decompressed (required)
   * @param secretPhrase The secret passphrase of the sender (required)
   * @return Call&lt;DecryptedData&gt;
   */
  @GET("tools/aes/decrypt/{recipient}/{data}/{nonce}/{isText}/{uncompress}/{secretPhrase}")
  Call<DecryptedData> decrypt(
            @retrofit2.http.Path("recipient") String recipient            ,         @retrofit2.http.Path("data") String data            ,         @retrofit2.http.Path("nonce") String nonce            ,         @retrofit2.http.Path("isText") String isText            ,         @retrofit2.http.Path("uncompress") String uncompress            ,         @retrofit2.http.Path("secretPhrase") String secretPhrase            
  );

  /**
   * Decrypt message bytes using AES (use with payments API)
   * 
   * @param messageBytesHex Message bytes HEX encoded (required)
   * @param recipientPublicKey Recipient public key HEX encoded (required)
   * @param secretPhrase Secret phrase UTF-8 (WARNING! your secret phrase will be sent to the server) (required)
   * @return Call&lt;DecryptedData&gt;
   */
  @GET("tools/aes/decryptMessageBytes/{messageBytesHex}/{recipientPublicKey}/{secretPhrase}")
  Call<DecryptedData> decryptMessageBytes(
            @retrofit2.http.Path("messageBytesHex") String messageBytesHex            ,         @retrofit2.http.Path("recipientPublicKey") String recipientPublicKey            ,         @retrofit2.http.Path("secretPhrase") String secretPhrase            
  );

  /**
   * Encrypt a message using AES without sending it
   * 
   * @param body  (required)
   * @return Call&lt;DecryptedData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tools/aes/decrypt")
  Call<DecryptedData> decryptPost(
                    @retrofit2.http.Body Object body    
  );

  /**
   * Generates a node hallmark
   * 
   * @param host IP address or domain name of the node (required)
   * @param weight The weight to assign to the node (required)
   * @param date The current date in YYYY-MM-DD format (required)
   * @param secretPhrase The secret passphrase for the account that will be hallmarked on the node (required)
   * @return Call&lt;HallmarkResponse&gt;
   */
  @GET("tools/hallmark/encode/{host}/{weight}/{date}/{secretPhrase}")
  Call<HallmarkResponse> encode(
            @retrofit2.http.Path("host") String host            ,         @retrofit2.http.Path("weight") String weight            ,         @retrofit2.http.Path("date") String date            ,         @retrofit2.http.Path("secretPhrase") String secretPhrase            
  );

  /**
   * Encrypt a message using AES without sending it
   * 
   * @param recipient Either the numeric account id of the recipient, or the recipient public key as HEX encoded string (required)
   * @param message Either UTF-8 text or a string of hex digits to be compressed and converted into a 1000 byte maximum bytecode then encrypted using AES (required)
   * @param isText Indicates if the message is to be considered UTF-8 text or if its HEX encoded binary data (required)
   * @param compress If &#x60;true&#x60; the encrypted data is GZIP compressed (required)
   * @param secretPhrase The secret passphrase of the sender (required)
   * @return Call&lt;EncryptedData&gt;
   */
  @GET("tools/aes/encrypt/{recipient}/{message}/{isText}/{compress}/{secretPhrase}")
  Call<EncryptedData> encrypt(
            @retrofit2.http.Path("recipient") String recipient            ,         @retrofit2.http.Path("message") String message            ,         @retrofit2.http.Path("isText") String isText            ,         @retrofit2.http.Path("compress") String compress            ,         @retrofit2.http.Path("secretPhrase") String secretPhrase            
  );

  /**
   * Decrypt a message using AES
   * 
   * @param body  (required)
   * @return Call&lt;EncryptedData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tools/aes/encrypt")
  Call<EncryptedData> encryptPost(
                    @retrofit2.http.Body Object body    
  );

  /**
   * Info about happened forks
   * 
   * @return Call&lt;List&lt;PeerTelemetry&gt;&gt;
   */
  @GET("tools/telemetry/forks")
  Call<List<PeerTelemetry>> forksTelemetry();
    

  /**
   * Creates a SHA256 hash of the input, input could be plain UTF-8 text or if isText&#x3D;true can be binary data encoded as HEX
   * 
   * @param isText Indicates if the input is to be considered UTF-8 text or if its HEX encoded binary data (required)
   * @param message Input data for the hashing function (required)
   * @return Call&lt;SHA256Hash&gt;
   */
  @GET("tools/SHA256/{isText}/{message}")
  Call<SHA256Hash> hash(
            @retrofit2.http.Path("isText") String isText            ,         @retrofit2.http.Path("message") String message            
  );

  /**
   * Creates a SHA256 hash of the input, input could be plain UTF-8 text or if isText&#x3D;true can be binary data encoded as HEX
   * 
   * @param body  (required)
   * @return Call&lt;SHA256Hash&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tools/SHA256")
  Call<SHA256Hash> hashPost(
                    @retrofit2.http.Body Object body    
  );

  /**
   * Indicators to estimate server health to compare to other servers
   * 
   * @return Call&lt;List&lt;PeerTelemetry&gt;&gt;
   */
  @GET("tools/telemetry/health")
  Call<List<PeerTelemetry>> healthState();
    

  /**
   * Calculates an account id from a secretphrase, result is an unsigned long
   * 
   * @param secretPhrase The secret passphrase (required)
   * @return Call&lt;Value&gt;
   */
  @GET("tools/id/{secretPhrase}")
  Call<Value> id(
            @retrofit2.http.Path("secretPhrase") String secretPhrase            
  );

  /**
   * Peers rejections
   * 
   * @param scope Possible values: &#x27;all&#x27; - returns all rejections, &#x27;last&#x27; returns only last rejections for each peer (required)
   * @return Call&lt;List&lt;PeerRejection&gt;&gt;
   */
  @GET("tools/telemetry/peers/rejections/{scope}")
  Call<List<PeerRejection>> peersRejections(
            @retrofit2.http.Path("scope") String scope            
  );

  /**
   * Peers state
   * 
   * @return Call&lt;List&lt;PeerStateIndicator&gt;&gt;
   */
  @GET("tools/telemetry/peers/state")
  Call<List<PeerStateIndicator>> peersState();
    

  /**
   * Peers telemetry data. Balances equality means 0 - mismatch, 1 - equals, 2 - unknown
   * 
   * @return Call&lt;List&lt;PeerTelemetry&gt;&gt;
   */
  @GET("tools/telemetry/peers")
  Call<List<PeerTelemetry>> peersTelemetry();
    

  /**
   * Calculates a publickey from a secretphrase, result is a HEX string
   * 
   * @param secretPhrase The secret passphrase (required)
   * @return Call&lt;Value&gt;
   */
  @GET("tools/publickey/{secretPhrase}")
  Call<Value> publickey(
            @retrofit2.http.Path("secretPhrase") String secretPhrase            
  );

}
