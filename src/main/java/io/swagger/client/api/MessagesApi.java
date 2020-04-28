package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Count;
import io.swagger.client.model.Message;
import io.swagger.client.model.MessageContact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MessagesApi {
  /**
   * Lists messages for a contact (requires replicator)
   * 
   * @param accountA Account a (required)
   * @param accountB Account B (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;Message&gt;&gt;
   */
  @GET("messages/contact/{accountA}/{accountB}/{from}/{to}")
  Call<List<Message>> contact(
            @retrofit2.http.Path("accountA") String accountA            ,         @retrofit2.http.Path("accountB") String accountB            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Count of all contacts messages (requires replicator)
   * 
   * @param accountA Account a (required)
   * @param accountB Account B (required)
   * @return Call&lt;Count&gt;
   */
  @GET("messages/contact/count/{accountA}/{accountB}")
  Call<Count> contactCount(
            @retrofit2.http.Path("accountA") String accountA            ,         @retrofit2.http.Path("accountB") String accountB            
  );

  /**
   * Lists latest message contacts (requires replicator)
   * 
   * @param account Account (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;MessageContact&gt;&gt;
   */
  @GET("messages/latest/{account}/{from}/{to}")
  Call<List<MessageContact>> latest(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

}
