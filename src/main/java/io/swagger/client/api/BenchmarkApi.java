package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.BlockMin;
import io.swagger.client.model.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BenchmarkApi {
  /**
   * Get a minimal block object given the block height
   * 
   * @param height The block height (required)
   * @return Call&lt;BlockMin&gt;
   */
  @GET("benchmark/block/{height}")
  Call<BlockMin> blockmin(
            @retrofit2.http.Path("height") String height            
  );

  /**
   * Get highest transaction id in a block
   * 
   * @param blockId Block id (required)
   * @return Call&lt;Value&gt;
   */
  @GET("benchmark/highestTransactionId/{blockId}")
  Call<Value> highestTransactionId(
            @retrofit2.http.Path("blockId") String blockId            
  );

  /**
   * Creates an account
   * 
   * @param publicKey PublicKey (required)
   * @return Call&lt;Value&gt;
   */
  @GET("benchmark/registerAccount/{publicKey}")
  Call<Value> registerAccount(
            @retrofit2.http.Path("publicKey") String publicKey            
  );

}
