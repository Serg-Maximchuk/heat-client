package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Count;
import io.swagger.client.model.Trade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TradeApi {
  /**
   * Counts all trades for an account (requires replicator)
   * 
   * @param account Account whose trades to list (required)
   * @return Call&lt;Count&gt;
   */
  @GET("trade/account/count/{account}")
  Call<Count> accountCount(
            @retrofit2.http.Path("account") String account            
  );

  /**
   * Lists all trades for an account (requires replicator)
   * 
   * @param account Account whose trades to list (required)
   * @param propertiesAccount Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer (required)
   * @param propertiesProtocol Asset properties protocol, a value of 0 means not to include asset properties in the result (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Trade&gt;&gt;
   */
  @GET("trade/account/{account}/{propertiesAccount}/{propertiesProtocol}/{from}/{to}")
  Call<List<Trade>> accountTrades(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("propertiesAccount") String propertiesAccount            ,         @retrofit2.http.Path("propertiesProtocol") String propertiesProtocol            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Lists all trades for all trading pairs (requires replicator)
   * 
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Trade&gt;&gt;
   */
  @GET("trade/all/{from}/{to}")
  Call<List<Trade>> all(
            @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Lists trades for an ask order (requires replicator)
   * 
   * @param order Ask order ID (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Trade&gt;&gt;
   */
  @GET("trade/ask/{order}/{from}/{to}")
  Call<List<Trade>> askTrades(
            @retrofit2.http.Path("order") String order            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Counts trades for an asset order (requires replicator)
   * 
   * @param order Ask order ID (required)
   * @return Call&lt;Count&gt;
   */
  @GET("trade/ask/count/{order}")
  Call<Count> askTradesCount(
            @retrofit2.http.Path("order") String order            
  );

  /**
   * Lists trades for an bid order (requires replicator)
   * 
   * @param order Bid order ID (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Trade&gt;&gt;
   */
  @GET("trade/bid/{order}/{from}/{to}")
  Call<List<Trade>> bidTrades(
            @retrofit2.http.Path("order") String order            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Counts trades for an asset order (requires replicator)
   * 
   * @param order Bid order ID (required)
   * @return Call&lt;Count&gt;
   */
  @GET("trade/bid/count/{order}")
  Call<Count> bidTradesCount(
            @retrofit2.http.Path("order") String order            
  );

  /**
   * Find trade by ask order id and bid order id (requires replicator)
   * 
   * @param ask Ask order numeric id (required)
   * @param bid Bid order numeric id (required)
   * @return Call&lt;Trade&gt;
   */
  @GET("trade/{ask}/{bid}")
  Call<Trade> trade(
            @retrofit2.http.Path("ask") String ask            ,         @retrofit2.http.Path("bid") String bid            
  );

  /**
   * Lists account trades for a trading pair (requires replicator)
   * 
   * @param account Account whose trades to list (required)
   * @param currency Currency ID (0 indicates HEAT, every other number indicates an asset) (required)
   * @param asset Asset ID (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Trade&gt;&gt;
   */
  @GET("trade/account/pair/{account}/{currency}/{asset}/{from}/{to}")
  Call<List<Trade>> tradeAccountPair(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("asset") String asset            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Counts account trades for a trading pair (requires replicator)
   * 
   * @param account Account whose trades to list (required)
   * @param currency Currency ID (0 indicates HEAT, every other number indicates an asset) (required)
   * @param asset Asset ID (required)
   * @return Call&lt;Count&gt;
   */
  @GET("trade/account/pair/count/{account}/{currency}/{asset}")
  Call<Count> tradeAccountPairCount(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("asset") String asset            
  );

  /**
   * Counts all trades for a trading pair (requires replicator)
   * 
   * @param currency Currency ID (0 indicates HEAT, every other number indicates an asset) (required)
   * @param asset Asset ID (required)
   * @return Call&lt;Count&gt;
   */
  @GET("trade/count/{currency}/{asset}")
  Call<Count> tradeCount(
            @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("asset") String asset            
  );

  /**
   * Lists all trades for a trading pair (requires replicator)
   * 
   * @param currency Currency ID (0 indicates HEAT, every other number indicates an asset) (required)
   * @param asset Asset ID (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Trade&gt;&gt;
   */
  @GET("trade/{currency}/{asset}/{from}/{to}")
  Call<List<Trade>> trades(
            @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("asset") String asset            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

}
