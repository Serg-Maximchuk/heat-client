package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Account;
import io.swagger.client.model.Count;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SearchApi {
  /**
   * Search account ids, public keys and email ids
   * 
   * @param query Query text (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Account&gt;&gt;
   */
  @GET("search/accounts/{query}/{from}/{to}")
  Call<List<Account>> accounts(
            @retrofit2.http.Path("query") String query            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Count account ids, public keys and email ids
   * 
   * @param query Query text (required)
   * @return Call&lt;Count&gt;
   */
  @GET("search/accounts/count/{query}")
  Call<Count> accountsCount(
            @retrofit2.http.Path("query") String query            
  );

}
