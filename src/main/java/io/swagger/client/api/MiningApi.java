package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Count;
import io.swagger.client.model.JSONRewardsInfo;
import io.swagger.client.model.Mining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MiningApi {
  /**
   * Get current mining info for all miners (if secret phrase ommitted) or for a single miner
   * 
   * @param secretPhrase The secret passphrase of the account (optional, if ommitted will return all mining info) (required)
   * @return Call&lt;List&lt;Mining&gt;&gt;
   */
  @GET("mining/info/{secretPhrase}")
  Call<List<Mining>> info(
            @retrofit2.http.Path("secretPhrase") String secretPhrase            
  );

  /**
   * Get current mining info for all miners (if secret phrase ommitted) or for a single miner
   * 
   * @param secretPhrase  (optional)
   * @return Call&lt;List&lt;Mining&gt;&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("mining/info")
  Call<List<Mining>> info2(
                        @retrofit2.http.Field("secretPhrase") String secretPhrase
  );

  /**
   * Find reward info for account
   * 
   * @param account The account numeric id (required)
   * @return Call&lt;JSONRewardsInfo&gt;
   */
  @GET("mining/rewards/account/{account}")
  Call<JSONRewardsInfo> rewardsAccount(
            @retrofit2.http.Path("account") String account            
  );

  /**
   * List all reward info
   * 
   * @param firstIndex First index (required)
   * @param lastIndex Last index (optional, default is firstIndex + 99) (required)
   * @return Call&lt;List&lt;JSONRewardsInfo&gt;&gt;
   */
  @GET("mining/rewards/list/{firstIndex}/{lastIndex}")
  Call<List<JSONRewardsInfo>> rewardsList(
            @retrofit2.http.Path("firstIndex") String firstIndex            ,         @retrofit2.http.Path("lastIndex") String lastIndex            
  );

  /**
   * Count number of reward info entries
   * 
   * @return Call&lt;Count&gt;
   */
  @GET("mining/rewards/list/count")
  Call<Count> rewardsListCount();
    

  /**
   * Start mining blocks with an account
   * 
   * @param secretPhrase The secret passphrase of the account  (required)
   * @return Call&lt;Mining&gt;
   */
  @GET("mining/start/{secretPhrase}")
  Call<Mining> start(
            @retrofit2.http.Path("secretPhrase") String secretPhrase            
  );

  /**
   * Start mining blocks with an account
   * 
   * @param secretPhrase  (required)
   * @return Call&lt;Mining&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("mining/start")
  Call<Mining> start2(
                        @retrofit2.http.Field("secretPhrase") String secretPhrase
  );

  /**
   * Stop mining blocks
   * 
   * @param secretPhrase The secret passphrase of the account (optional, if ommitted will stop all mining activity) (required)
   * @return Call&lt;Mining&gt;
   */
  @GET("mining/stop/{secretPhrase}")
  Call<Mining> stop(
            @retrofit2.http.Path("secretPhrase") String secretPhrase            
  );

  /**
   * Stop mining blocks
   * 
   * @param secretPhrase  (optional)
   * @return Call&lt;Mining&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("mining/stop")
  Call<Mining> stop2(
                        @retrofit2.http.Field("secretPhrase") String secretPhrase
  );

}
