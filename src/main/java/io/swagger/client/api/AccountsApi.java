package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Account;
import io.swagger.client.model.AccountBalance;
import io.swagger.client.model.AccountInternetAddress;
import io.swagger.client.model.Count;
import io.swagger.client.model.Payment;
import io.swagger.client.model.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AccountsApi {
  /**
   * Find account by numeric id
   * 
   * @param numericId The account numeric id (required)
   * @return Call&lt;Account&gt;
   */
  @GET("account/find/{numericId}")
  Call<Account> account(
            @retrofit2.http.Path("numericId") String numericId            
  );

  /**
   * Returns account asset balance, balance with asset&#x3D;0 is your HEAT balance
   * 
   * @param account The account numeric id (required)
   * @param asset Asset id, asset&#x3D;0 is your HEAT balance (required)
   * @return Call&lt;AccountBalance&gt;
   */
  @GET("account/balance/{account}/{asset}")
  Call<AccountBalance> balance(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("asset") String asset            
  );

  /**
   * Returns account asset balance, balance with asset&#x3D;0 is your HEAT balance. This includes your virtual balance (requires replicator)
   * 
   * @param account The account numeric id (required)
   * @param asset Asset id, asset&#x3D;0 is your HEAT balance (required)
   * @param propertiesAccountId Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer (required)
   * @param propertiesProtocol Asset properties protocol, a value of 0 means not to include asset properties in the result (required)
   * @return Call&lt;AccountBalance&gt;
   */
  @GET("account/balance/virtual/{account}/{asset}/{propertiesAccountId}/{propertiesProtocol}")
  Call<AccountBalance> balanceVirtual(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("asset") String asset            ,         @retrofit2.http.Path("propertiesAccountId") String propertiesAccountId            ,         @retrofit2.http.Path("propertiesProtocol") String propertiesProtocol            
  );

  /**
   * Returns account HEAT balance and all asset balances, balance with asset&#x3D;0 is your HEAT balance (requires replicator)
   * 
   * @param account The account numeric id (required)
   * @param propertiesAccountId Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer (required)
   * @param propertiesProtocol Asset properties protocol, a value of 0 means not to include asset properties in the result (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;AccountBalance&gt;&gt;
   */
  @GET("account/balances/{account}/{propertiesAccountId}/{propertiesProtocol}/{from}/{to}")
  Call<List<AccountBalance>> balances(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("propertiesAccountId") String propertiesAccountId            ,         @retrofit2.http.Path("propertiesProtocol") String propertiesProtocol            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Find account by numeric name hash
   * 
   * @param hash Account name numeric hash (required)
   * @return Call&lt;Account&gt;
   */
  @GET("account/find/hash/{hash}")
  Call<Account> findHash(
            @retrofit2.http.Path("hash") String hash            
  );

  /**
   * Returns account publickey
   * 
   * @param account The account numeric id (required)
   * @return Call&lt;Value&gt;
   */
  @GET("account/publickey/{account}")
  Call<Value> getPublickey(
            @retrofit2.http.Path("account") String account            
  );

  /**
   * Returns account registered internet address (the host of node on which account is forging)
   * 
   * @param account The account numeric id (required)
   * @return Call&lt;AccountInternetAddress&gt;
   */
  @GET("account/internetaddress/{account}")
  Call<AccountInternetAddress> internetAddress(
            @retrofit2.http.Path("account") String account            
  );

  /**
   * List accounts with public name (requires replicator)
   * 
   * @param assigner Account that assigned the name (pass 0 to include all assigners) (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Account&gt;&gt;
   */
  @GET("account/list/{assigner}/{from}/{to}")
  Call<List<Account>> list(
            @retrofit2.http.Path("assigner") String assigner            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Find account by name
   * 
   * @param name The account name (UTF-8) (required)
   * @return Call&lt;Account&gt;
   */
  @GET("account/find/name/{name}")
  Call<Account> name(
            @retrofit2.http.Path("name") String name            
  );

  /**
   * Returns payments from and to an account, includes asset payments (requires replicator)
   * 
   * @param account Account id to returns payments from and to from (required)
   * @param currency Currency ID or pass &#x27;all&#x27; to indicate all currencies (required)
   * @param sort Sort on this property (required)
   * @param asc Sort is ascending or descending (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Payment&gt;&gt;
   */
  @GET("account/payments/{account}/{currency}/{sort}/{asc}/{from}/{to}")
  Call<List<Payment>> payments(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("currency") String currency            ,         @retrofit2.http.Path("sort") String sort            ,         @retrofit2.http.Path("asc") String asc            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Returns payments count from and to an account, includes asset payments (requires replicator)
   * 
   * @param account Account id to returns payments from and to from (required)
   * @param currency Currency ID or pass &#x27;all&#x27; to indicate all currencies (required)
   * @return Call&lt;Count&gt;
   */
  @GET("account/payments/count/{account}/{currency}")
  Call<Count> paymentsCount(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("currency") String currency            
  );

  /**
   * Find account by public key
   * 
   * @param publicKey The account public key in HEX format (required)
   * @return Call&lt;Account&gt;
   */
  @GET("account/find/publickey/{publicKey}")
  Call<Account> publicKeyFind(
            @retrofit2.http.Path("publicKey") String publicKey            
  );

  /**
   * Search accounts with public name by name (requires replicator)
   * 
   * @param assigner Account that assigned the name (pass 0 to include all assigners) (required)
   * @param query The account name (UTF-8) (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Account&gt;&gt;
   */
  @GET("account/search/{assigner}/{query}/{from}/{to}")
  Call<List<Account>> search(
            @retrofit2.http.Path("assigner") String assigner            ,         @retrofit2.http.Path("query") String query            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Find account by secret phrase
   * 
   * @param secretPhrase The account secret phrase (required)
   * @return Call&lt;Account&gt;
   */
  @GET("account/find/secretphrase/{secretPhrase}")
  Call<Account> secretPhrase(
            @retrofit2.http.Path("secretPhrase") String secretPhrase            
  );

}
