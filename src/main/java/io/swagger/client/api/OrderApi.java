package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Count;
import io.swagger.client.model.Order;
import io.swagger.client.model.TransactionCreate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OrderApi {
  /**
   * Lists all orders for an account (requires replicator)
   * 
   * @param account Account whose orders to list (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Order&gt;&gt;
   */
  @GET("order/account/all/{account}/{from}/{to}")
  Call<List<Order>> accountAll(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Counts all orders for an account (requires replicator)
   * 
   * @param account Account whose orders to list (required)
   * @return Call&lt;Count&gt;
   */
  @GET("order/account/all/count/{account}")
  Call<Count> accountAllCount(
            @retrofit2.http.Path("account") String account            
  );

  /**
   * Lists all ask orders by account (requires replicator)
   * 
   * @param account Account whose orders to list (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Order&gt;&gt;
   */
  @GET("order/account/asks/{account}/{from}/{to}")
  Call<List<Order>> accountAsks(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Lists all bid orders by account (requires replicator)
   * 
   * @param account Account whose orders to list (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Order&gt;&gt;
   */
  @GET("order/account/bids/{account}/{from}/{to}")
  Call<List<Order>> accountBids(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Lists all ask orders by account and trading pair (requires replicator)
   * 
   * @param account Account whose orders to list (required)
   * @param currency Currency ID (0 indicates HEAT, every other number indicates an asset) (required)
   * @param asset Asset ID (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Order&gt;&gt;
   */
  @GET("order/account/pair/asks/{account}/{currency}/{asset}/{from}/{to}")
  Call<List<Order>> accountPairAsks(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("asset") String asset            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Lists all bid orders by account and trading pair (requires replicator)
   * 
   * @param account Account whose orders to list (required)
   * @param currency Currency ID (0 indicates HEAT, every other number indicates an asset) (required)
   * @param asset Asset ID (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Order&gt;&gt;
   */
  @GET("order/account/pair/bids/{account}/{currency}/{asset}/{from}/{to}")
  Call<List<Order>> accountPairBids(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("asset") String asset            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Finds an ask order by ID (requires replicator)
   * 
   * @param order Ask order numeric id (required)
   * @return Call&lt;Order&gt;
   */
  @GET("order/ask/{order}")
  Call<Order> ask(
            @retrofit2.http.Path("order") String order            
  );

  /**
   * Lists all ask orders (requires replicator)
   * 
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Order&gt;&gt;
   */
  @GET("order/asks/{from}/{to}")
  Call<List<Order>> asks(
            @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Finds an bid order by ID (requires replicator)
   * 
   * @param order Bid order numeric id (required)
   * @return Call&lt;Order&gt;
   */
  @GET("order/bid/{order}")
  Call<Order> bid(
            @retrofit2.http.Path("order") String order            
  );

  /**
   * Lists all bid orders (requires replicator)
   * 
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Order&gt;&gt;
   */
  @GET("order/bids/{from}/{to}")
  Call<List<Order>> bids(
            @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Cancel an existing ask asset order
   * 
   * @param order  (required)
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
  @POST("order/cancel/ask")
  Call<TransactionCreate> cancelAsk(
                        @retrofit2.http.Field("order") String order,                     @retrofit2.http.Field("fee") String fee,                     @retrofit2.http.Field("deadline") String deadline,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("publicKey") String publicKey,                     @retrofit2.http.Field("recipient") String recipient,                     @retrofit2.http.Field("recipientPublicKey") String recipientPublicKey,                     @retrofit2.http.Field("broadcast") String broadcast,                     @retrofit2.http.Field("privateNameAnnouncement") String privateNameAnnouncement,                     @retrofit2.http.Field("publicNameAnnouncement") String publicNameAnnouncement
  );

  /**
   * Cancel an existing bid asset order
   * 
   * @param order  (required)
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
  @POST("order/cancel/bid")
  Call<TransactionCreate> cancelBid(
                        @retrofit2.http.Field("order") String order,                     @retrofit2.http.Field("fee") String fee,                     @retrofit2.http.Field("deadline") String deadline,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("publicKey") String publicKey,                     @retrofit2.http.Field("recipient") String recipient,                     @retrofit2.http.Field("recipientPublicKey") String recipientPublicKey,                     @retrofit2.http.Field("broadcast") String broadcast,                     @retrofit2.http.Field("privateNameAnnouncement") String privateNameAnnouncement,                     @retrofit2.http.Field("publicNameAnnouncement") String publicNameAnnouncement
  );

  /**
   * Lists all orders for an account (requires replicator)
   * 
   * @param account Account whose orders to list (required)
   * @param currency Currency ID (0 indicates HEAT, every other number indicates an asset) (required)
   * @param asset Asset ID (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Order&gt;&gt;
   */
  @GET("order/account/pair/{account}/{currency}/{asset}/{from}/{to}")
  Call<List<Order>> orderAccountPair(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("asset") String asset            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Counts all orders for an account with currency and asset (requires replicator)
   * 
   * @param account Account whose orders to list (required)
   * @param currency Currency ID (0 indicates HEAT, every other number indicates an asset) (required)
   * @param asset Asset ID (required)
   * @return Call&lt;List&lt;Order&gt;&gt;
   */
  @GET("order/account/pair/count/{account}/{currency}/{asset}")
  Call<List<Order>> orderAccountPairCount(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("asset") String asset            
  );

  /**
   * Lists all ask orders by trading pair (requires replicator)
   * 
   * @param currency Currency ID (0 indicates HEAT, every other number indicates an asset) (required)
   * @param asset Asset ID (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Order&gt;&gt;
   */
  @GET("order/pair/asks/{currency}/{asset}/{from}/{to}")
  Call<List<Order>> pairAsks(
            @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("asset") String asset            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Counts all ask orders by trading pair
   * 
   * @param currency Currency ID (0 indicates HEAT, every other number indicates an asset) (required)
   * @param asset Asset ID (required)
   * @return Call&lt;List&lt;Order&gt;&gt;
   */
  @GET("order/pair/asks/count/{currency}/{asset}")
  Call<List<Order>> pairAsksCount(
            @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("asset") String asset            
  );

  /**
   * Lists all bid orders by trading pair
   * 
   * @param currency Currency ID (0 indicates HEAT, every other number indicates an asset) (required)
   * @param asset Asset ID (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Order&gt;&gt;
   */
  @GET("order/pair/bids/{currency}/{asset}/{from}/{to}")
  Call<List<Order>> pairBids(
            @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("asset") String asset            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Counts all bid orders by trading pair
   * 
   * @param currency Currency ID (0 indicates HEAT, every other number indicates an asset) (required)
   * @param asset Asset ID (required)
   * @return Call&lt;List&lt;Order&gt;&gt;
   */
  @GET("order/pair/bids/count/{currency}/{asset}")
  Call<List<Order>> pairBidsCount(
            @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("asset") String asset            
  );

  /**
   * Place an asset ask(sell) order
   * 
   * @param currency  (required)
   * @param asset  (required)
   * @param quantity  (required)
   * @param price  (required)
   * @param expiration  (required)
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
  @POST("order/place/ask")
  Call<TransactionCreate> placeAsk(
                        @retrofit2.http.Field("currency") String currency,                     @retrofit2.http.Field("asset") String asset,                     @retrofit2.http.Field("quantity") String quantity,                     @retrofit2.http.Field("price") String price,                     @retrofit2.http.Field("expiration") String expiration,                     @retrofit2.http.Field("fee") String fee,                     @retrofit2.http.Field("deadline") String deadline,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("publicKey") String publicKey,                     @retrofit2.http.Field("recipient") String recipient,                     @retrofit2.http.Field("recipientPublicKey") String recipientPublicKey,                     @retrofit2.http.Field("broadcast") String broadcast,                     @retrofit2.http.Field("privateNameAnnouncement") String privateNameAnnouncement,                     @retrofit2.http.Field("publicNameAnnouncement") String publicNameAnnouncement
  );

  /**
   * Place an asset bid order
   * 
   * @param currency  (required)
   * @param asset  (required)
   * @param quantity  (required)
   * @param price  (required)
   * @param expiration  (required)
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
  @POST("order/place/bid")
  Call<TransactionCreate> placeBid(
                        @retrofit2.http.Field("currency") String currency,                     @retrofit2.http.Field("asset") String asset,                     @retrofit2.http.Field("quantity") String quantity,                     @retrofit2.http.Field("price") String price,                     @retrofit2.http.Field("expiration") String expiration,                     @retrofit2.http.Field("fee") String fee,                     @retrofit2.http.Field("deadline") String deadline,                     @retrofit2.http.Field("secretPhrase") String secretPhrase,                     @retrofit2.http.Field("publicKey") String publicKey,                     @retrofit2.http.Field("recipient") String recipient,                     @retrofit2.http.Field("recipientPublicKey") String recipientPublicKey,                     @retrofit2.http.Field("broadcast") String broadcast,                     @retrofit2.http.Field("privateNameAnnouncement") String privateNameAnnouncement,                     @retrofit2.http.Field("publicNameAnnouncement") String publicNameAnnouncement
  );

}
