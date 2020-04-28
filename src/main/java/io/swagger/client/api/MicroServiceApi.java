package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MicroServiceApi {
  /**
   * 
   * 
   * @param params  (required)
   * @return Call&lt;Void&gt;
   */
  @GET("microservice/{params}")
  Call<Void> get(
            @retrofit2.http.Path("params") List<String> params            
  );

  /**
   * 
   * 
   * @param params  (required)
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("microservice/{params}")
  Call<Void> post(
            @retrofit2.http.Path("params") List<String> params            ,                 @retrofit2.http.Body String body    
  );

}
