package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.AccountAsset;
import io.swagger.client.model.AssetProperties;
import io.swagger.client.model.ChartData;
import io.swagger.client.model.JSONAssetCertification;
import io.swagger.client.model.JSONAssetProtocol1;
import io.swagger.client.model.Market;
import io.swagger.client.model.TransactionCreate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ExchangeApi {
  /**
   * Returns asset balances (requires replicator)
   * 
   * @param asset The asset numeric id (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;AccountAsset&gt;&gt;
   */
  @GET("exchange/asset/accounts/{asset}/{from}/{to}")
  Call<List<AccountAsset>> assetBalances(
            @retrofit2.http.Path("asset") String asset            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Returns asset certification info (requires replicator)
   * 
   * @param asset  (required)
   * @param certifierAccount  (required)
   * @return Call&lt;JSONAssetCertification&gt;
   */
  @GET("exchange/asset/certification/{asset}/{certifierAccount}")
  Call<JSONAssetCertification> assetCertification(
            @retrofit2.http.Path("asset") String asset            ,         @retrofit2.http.Path("certifierAccount") String certifierAccount            
  );

  /**
   * Sets asset certification info (requires replicator)
   * 
   * @param asset  (required)
   * @param certified  (required)
   * @param symbol  (required)
   * @param name  (required)
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
  @POST("exchange/asset/certification")
  Call<TransactionCreate> assetCertify(
                        @retrofit2.http.Field("asset") String asset,                     @retrofit2.http.Field("certified") String certified,                     @retrofit2.http.Field("symbol") String symbol,                     @retrofit2.http.Field("name") String name,                     @retrofit2.http.Field("fee") String fee,                     @retrofit2.http.Field("deadline") String deadline,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("publicKey") String publicKey,                     @retrofit2.http.Field("recipient") String recipient,                     @retrofit2.http.Field("recipientPublicKey") String recipientPublicKey,                     @retrofit2.http.Field("broadcast") String broadcast,                     @retrofit2.http.Field("privateNameAnnouncement") String privateNameAnnouncement,                     @retrofit2.http.Field("publicNameAnnouncement") String publicNameAnnouncement,                     @retrofit2.http.Field("message") String message,                     @retrofit2.http.Field("messageIsText") String messageIsText,                     @retrofit2.http.Field("messageToEncrypt") String messageToEncrypt,                     @retrofit2.http.Field("messageToEncryptIsText") String messageToEncryptIsText,                     @retrofit2.http.Field("encryptedMessageData") String encryptedMessageData,                     @retrofit2.http.Field("encryptedMessageNonce") String encryptedMessageNonce,                     @retrofit2.http.Field("messageToEncryptToSelf") String messageToEncryptToSelf,                     @retrofit2.http.Field("messageToEncryptToSelfIsText") String messageToEncryptToSelfIsText,                     @retrofit2.http.Field("encryptToSelfMessageData") String encryptToSelfMessageData,                     @retrofit2.http.Field("encryptToSelfMessageNonce") String encryptToSelfMessageNonce,                     @retrofit2.http.Field("privateNameAssignment") String privateNameAssignment,                     @retrofit2.http.Field("privateNameAssignmentSignature") String privateNameAssignmentSignature,                     @retrofit2.http.Field("publicNameAssignment") String publicNameAssignment,                     @retrofit2.http.Field("publicNameAssignmentSignature") String publicNameAssignmentSignature
  );

  /**
   * Sets the asset properties for the given protocol (requires replicator)
   * 
   * @param asset  (required)
   * @param protocol  (required)
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
  @POST("exchange/asset/properties")
  Call<TransactionCreate> assetProperties(
                        @retrofit2.http.Field("asset") String asset,                     @retrofit2.http.Field("protocol") String protocol,                     @retrofit2.http.Field("value") String value,                     @retrofit2.http.Field("fee") String fee,                     @retrofit2.http.Field("deadline") String deadline,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("publicKey") String publicKey,                     @retrofit2.http.Field("recipient") String recipient,                     @retrofit2.http.Field("recipientPublicKey") String recipientPublicKey,                     @retrofit2.http.Field("broadcast") String broadcast,                     @retrofit2.http.Field("privateNameAnnouncement") String privateNameAnnouncement,                     @retrofit2.http.Field("publicNameAnnouncement") String publicNameAnnouncement,                     @retrofit2.http.Field("message") String message,                     @retrofit2.http.Field("messageIsText") String messageIsText,                     @retrofit2.http.Field("messageToEncrypt") String messageToEncrypt,                     @retrofit2.http.Field("messageToEncryptIsText") String messageToEncryptIsText,                     @retrofit2.http.Field("encryptedMessageData") String encryptedMessageData,                     @retrofit2.http.Field("encryptedMessageNonce") String encryptedMessageNonce,                     @retrofit2.http.Field("messageToEncryptToSelf") String messageToEncryptToSelf,                     @retrofit2.http.Field("messageToEncryptToSelfIsText") String messageToEncryptToSelfIsText,                     @retrofit2.http.Field("encryptToSelfMessageData") String encryptToSelfMessageData,                     @retrofit2.http.Field("encryptToSelfMessageNonce") String encryptToSelfMessageNonce,                     @retrofit2.http.Field("privateNameAssignment") String privateNameAssignment,                     @retrofit2.http.Field("privateNameAssignmentSignature") String privateNameAssignmentSignature,                     @retrofit2.http.Field("publicNameAssignment") String publicNameAssignment,                     @retrofit2.http.Field("publicNameAssignmentSignature") String publicNameAssignmentSignature
  );

  /**
   * Find asset properties by numeric id, properties account and protocol (requires replicator)
   * 
   * @param asset  (required)
   * @param propertiesAccount Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer (required)
   * @param propertiesProtocol Asset properties protocol, a value of 0 means not to include asset properties in the result (required)
   * @return Call&lt;AssetProperties&gt;
   */
  @GET("exchange/asset/properties/{asset}/{propertiesAccount}/{propertiesProtocol}")
  Call<AssetProperties> assetProperties_0(
            @retrofit2.http.Path("asset") String asset            ,         @retrofit2.http.Path("propertiesAccount") String propertiesAccount            ,         @retrofit2.http.Path("propertiesProtocol") String propertiesProtocol            
  );

  /**
   * Finds protocol 1 asset by symbol (requires replicator)
   * Protocol 1 assets enforce unique symbol names
   * @param symbol Asset symbol (required)
   * @return Call&lt;JSONAssetProtocol1&gt;
   */
  @GET("exchange/asset/protocol1/{symbol}")
  Call<JSONAssetProtocol1> assetProtocol1(
            @retrofit2.http.Path("symbol") String symbol            
  );

  /**
   * Lists all protocol 1 assets (requires replicator)
   * Protocol 1 assets enforce unique symbol names
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;JSONAssetProtocol1&gt;&gt;
   */
  @GET("exchange/assets/protocol1/{from}/{to}")
  Call<List<JSONAssetProtocol1>> assetsProtocol1(
            @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Retrieves OHLC chart data for trading pair (requires replicator)
   * Chartdata entries in the &#x27;data&#x27; property are arrays with indexed properties.&lt;br&gt;[&lt;br&gt;&amp;nbsp;&amp;nbsp;timestamp, // number timestamp in HEAT epoch format&lt;br&gt;&amp;nbsp;&amp;nbsp;avg,       // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsp;&amp;nbsp;low,       // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsp;&amp;nbsp;high,      // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsp;&amp;nbsp;vol,       // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsp;&amp;nbsp;open,      // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsps;&amp;nbsp;close     // string or number if &lt; 9007199254740991&lt;br&gt;]
   * @param currency Currency ID (0 indicates HEAT, every other number indicates an asset) (required)
   * @param asset Asset ID (required)
   * @param window Charting interval window (required)
   * @return Call&lt;ChartData&gt;
   */
  @GET("exchange/chartdata/{currency}/{asset}/{window}")
  Call<ChartData> chartdata(
            @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("asset") String asset            ,         @retrofit2.http.Path("window") String window            
  );

  /**
   * Create an asset on the exchange
   * 
   * @param quantity  (required)
   * @param decimals  (required)
   * @param descriptionUrl  (required)
   * @param descriptionHash  (required)
   * @param dillutable  (required)
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
  @POST("exchange/asset/issue")
  Call<TransactionCreate> issue(
                        @retrofit2.http.Field("quantity") String quantity,                     @retrofit2.http.Field("decimals") String decimals,                     @retrofit2.http.Field("descriptionUrl") String descriptionUrl,                     @retrofit2.http.Field("descriptionHash") String descriptionHash,                     @retrofit2.http.Field("dillutable") String dillutable,                     @retrofit2.http.Field("fee") String fee,                     @retrofit2.http.Field("deadline") String deadline,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("publicKey") String publicKey,                     @retrofit2.http.Field("recipient") String recipient,                     @retrofit2.http.Field("recipientPublicKey") String recipientPublicKey,                     @retrofit2.http.Field("broadcast") String broadcast,                     @retrofit2.http.Field("privateNameAnnouncement") String privateNameAnnouncement,                     @retrofit2.http.Field("publicNameAnnouncement") String publicNameAnnouncement
  );

  /**
   * Issue extra assets, assign those extra assets to transaction recipient
   * 
   * @param asset  (required)
   * @param quantity  (required)
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
  @POST("exchange/asset/issuemore")
  Call<TransactionCreate> issueMore(
                        @retrofit2.http.Field("asset") String asset,                     @retrofit2.http.Field("quantity") String quantity,                     @retrofit2.http.Field("fee") String fee,                     @retrofit2.http.Field("deadline") String deadline,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("publicKey") String publicKey,                     @retrofit2.http.Field("recipient") String recipient,                     @retrofit2.http.Field("recipientPublicKey") String recipientPublicKey,                     @retrofit2.http.Field("broadcast") String broadcast,                     @retrofit2.http.Field("privateNameAnnouncement") String privateNameAnnouncement,                     @retrofit2.http.Field("publicNameAnnouncement") String publicNameAnnouncement
  );

  /**
   * Finds a market for a currency and asset (requires replicator)
   * 
   * @param currency Currency ID (required)
   * @param asset Asset ID (required)
   * @param propertiesAccountId Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer (required)
   * @param propertiesProtocol Asset properties protocol, a value of 0 means not to include asset properties in the result (required)
   * @return Call&lt;List&lt;Market&gt;&gt;
   */
  @GET("exchange/market/{currency}/{asset}/{propertiesAccountId}/{propertiesProtocol}")
  Call<List<Market>> market(
            @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("asset") String asset            ,         @retrofit2.http.Path("propertiesAccountId") String propertiesAccountId            ,         @retrofit2.http.Path("propertiesProtocol") String propertiesProtocol            
  );

  /**
   * Lists all markets for a currency (requires replicator)
   * 
   * @param currency Currency (required)
   * @param sort Sort order, sort is either by 24hr percentage change (default), 24hr volume, price or none (database natural order) (required)
   * @param asc Sort ascending (required)
   * @param propertiesAccountId Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer (required)
   * @param propertiesProtocol Asset properties protocol, a value of 0 means not to include asset properties in the result (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Market&gt;&gt;
   */
  @GET("exchange/markets/{currency}/{sort}/{asc}/{propertiesAccountId}/{propertiesProtocol}/{from}/{to}")
  Call<List<Market>> markets(
            @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("sort") String sort            ,         @retrofit2.http.Path("asc") String asc            ,         @retrofit2.http.Path("propertiesAccountId") String propertiesAccountId            ,         @retrofit2.http.Path("propertiesProtocol") String propertiesProtocol            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Lists all markets (requires replicator)
   * 
   * @param sort Sort order, sort is either by 24hr percentage change (default), 24hr volume, price or none (database natural order) (required)
   * @param asc Sort ascending (required)
   * @param propertiesAccountId Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer (required)
   * @param propertiesProtocol Asset properties protocol, a value of 0 means not to include asset properties in the result (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Market&gt;&gt;
   */
  @GET("exchange/markets/all/{sort}/{asc}/{propertiesAccountId}/{propertiesProtocol}/{from}/{to}")
  Call<List<Market>> marketsAll(
            @retrofit2.http.Path("sort") String sort            ,         @retrofit2.http.Path("asc") String asc            ,         @retrofit2.http.Path("propertiesAccountId") String propertiesAccountId            ,         @retrofit2.http.Path("propertiesProtocol") String propertiesProtocol            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Transfer a quantity of an asset from one account to another
   * 
   * @param asset  (required)
   * @param quantity  (required)
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
  @POST("exchange/transfer")
  Call<TransactionCreate> transfer(
                        @retrofit2.http.Field("asset") String asset,                     @retrofit2.http.Field("quantity") String quantity,                     @retrofit2.http.Field("fee") String fee,                     @retrofit2.http.Field("deadline") String deadline,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("publicKey") String publicKey,                     @retrofit2.http.Field("recipient") String recipient,                     @retrofit2.http.Field("recipientPublicKey") String recipientPublicKey,                     @retrofit2.http.Field("broadcast") String broadcast,                     @retrofit2.http.Field("privateNameAnnouncement") String privateNameAnnouncement,                     @retrofit2.http.Field("publicNameAnnouncement") String publicNameAnnouncement,                     @retrofit2.http.Field("message") String message,                     @retrofit2.http.Field("messageIsText") String messageIsText,                     @retrofit2.http.Field("messageToEncrypt") String messageToEncrypt,                     @retrofit2.http.Field("messageToEncryptIsText") String messageToEncryptIsText,                     @retrofit2.http.Field("encryptedMessageData") String encryptedMessageData,                     @retrofit2.http.Field("encryptedMessageNonce") String encryptedMessageNonce,                     @retrofit2.http.Field("messageToEncryptToSelf") String messageToEncryptToSelf,                     @retrofit2.http.Field("messageToEncryptToSelfIsText") String messageToEncryptToSelfIsText,                     @retrofit2.http.Field("encryptToSelfMessageData") String encryptToSelfMessageData,                     @retrofit2.http.Field("encryptToSelfMessageNonce") String encryptToSelfMessageNonce,                     @retrofit2.http.Field("privateNameAssignment") String privateNameAssignment,                     @retrofit2.http.Field("privateNameAssignmentSignature") String privateNameAssignmentSignature,                     @retrofit2.http.Field("publicNameAssignment") String publicNameAssignment,                     @retrofit2.http.Field("publicNameAssignmentSignature") String publicNameAssignmentSignature
  );

}
