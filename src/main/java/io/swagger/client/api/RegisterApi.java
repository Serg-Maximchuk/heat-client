package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RegisterApi {
  /**
   * Register a new account
   * 
   * @param publicKey Public key (required)
   * @param captcha Captcha (required)
   * @param name Account name (required)
   * @param isprivate If true assign a private name, public otherwise (required)
   * @param signature User signature required to assign the name (required)
   * @return Call&lt;Value&gt;
   */
  @GET("register/now/{publicKey}/{captcha}/{name}/{isprivate}/{signature}")
  Call<Value> add(
            @retrofit2.http.Path("publicKey") String publicKey            ,         @retrofit2.http.Path("captcha") String captcha            ,         @retrofit2.http.Path("name") String name            ,         @retrofit2.http.Path("isprivate") String isprivate            ,         @retrofit2.http.Path("signature") String signature            
  );

}
