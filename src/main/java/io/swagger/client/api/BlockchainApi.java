package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Block;
import io.swagger.client.model.BlockCondensed;
import io.swagger.client.model.BlockchainStatus;
import io.swagger.client.model.Count;
import io.swagger.client.model.Fees;
import io.swagger.client.model.JSONStake;
import io.swagger.client.model.State;
import io.swagger.client.model.Transaction;
import io.swagger.client.model.TransactionExtended;
import io.swagger.client.model.TransactionUnconfirmed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BlockchainApi {
  /**
   * Get a list of block objects for an account from start index to end index (requires replicator)
   * 
   * @param account Account (required)
   * @param firstIndex First block to retrieve (optional, default is zero or the last block on the blockchain) (required)
   * @param lastIndex The last block to retrieve (optional, default is firstIndex + 99) (required)
   * @param includeTransactions True to include transaction details, if false &#x60;transactions&#x60; will hold only transaction ids, if null NO transactions are returned (required)
   * @return Call&lt;List&lt;BlockCondensed&gt;&gt;
   */
  @GET("blockchain/blocks/account/{account}/{firstIndex}/{lastIndex}/{includeTransactions}")
  Call<List<BlockCondensed>> accountBlocks(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("firstIndex") String firstIndex            ,         @retrofit2.http.Path("lastIndex") String lastIndex            ,         @retrofit2.http.Path("includeTransactions") String includeTransactions            
  );

  /**
   * Counts all blocks generated by account (requires replicator)
   * 
   * @param account Account (required)
   * @return Call&lt;Count&gt;
   */
  @GET("blockchain/blocks/account/count/{account}")
  Call<Count> accountBlocksCount(
            @retrofit2.http.Path("account") String account            
  );

  /**
   * Get a block object given a numeric block id
   * 
   * @param numericId The block ID (required)
   * @param includeTransactions True to include transaction details, if false &#x60;transactions&#x60; will hold only transaction ids (required)
   * @return Call&lt;Block&gt;
   */
  @GET("blockchain/block/{numericId}/{includeTransactions}")
  Call<Block> block(
            @retrofit2.http.Path("numericId") String numericId            ,         @retrofit2.http.Path("includeTransactions") String includeTransactions            
  );

  /**
   * Get a list of block objects from start index to end index (requires replicator)
   * 
   * @param firstIndex First block to retrieve (optional, default is zero or the last block on the blockchain) (required)
   * @param lastIndex The last block to retrieve (optional, default is firstIndex + 99) (required)
   * @param includeTransactions True to include transaction details, if false &#x60;transactions&#x60; will hold only transaction ids, if null NO transactions are returned (required)
   * @return Call&lt;List&lt;BlockCondensed&gt;&gt;
   */
  @GET("blockchain/blocks/{firstIndex}/{lastIndex}/{includeTransactions}")
  Call<List<BlockCondensed>> blocks(
            @retrofit2.http.Path("firstIndex") String firstIndex            ,         @retrofit2.http.Path("lastIndex") String lastIndex            ,         @retrofit2.http.Path("includeTransactions") String includeTransactions            
  );

  /**
   * Get the Economic Clustering block based on timestamp
   * 
   * @param timestamp Timestamp (required)
   * @return Call&lt;Block&gt;
   */
  @GET("blockchain/ecblock/{timestamp}")
  Call<Block> ecblock(
            @retrofit2.http.Path("timestamp") String timestamp            
  );

  /**
   * Returns all current fees
   * 
   * @return Call&lt;Fees&gt;
   */
  @GET("blockchain/fees")
  Call<Fees> fees();
    

  /**
   * Get a block object given its height
   * 
   * @param height  (required)
   * @param includeTransactions True to include transaction details, if false &#x60;transactions&#x60; will hold only transaction ids (required)
   * @return Call&lt;Block&gt;
   */
  @GET("blockchain/block/height/{height}/{includeTransactions}")
  Call<Block> height(
            @retrofit2.http.Path("height") String height            ,         @retrofit2.http.Path("includeTransactions") String includeTransactions            
  );

  /**
   * Returns the combined stake for the past N(min 1, max 1440) block generators
   * 
   * @param blockCount Number of blocks (required)
   * @return Call&lt;JSONStake&gt;
   */
  @GET("blockchain/stake/{blockCount}")
  Call<JSONStake> stake(
            @retrofit2.http.Path("blockCount") String blockCount            
  );

  /**
   * Get the state of the server node and network
   * 
   * @return Call&lt;BlockchainStatus&gt;
   */
  @GET("blockchain/status")
  Call<BlockchainStatus> status();
    

  /**
   * Returns extended state info (slower)
   * 
   * @return Call&lt;State&gt;
   */
  @GET("blockchain/status2")
  Call<State> status2();
    

  /**
   * Get a transaction given its numeric transaction id
   * 
   * @param numericId The transaction ID (required)
   * @return Call&lt;Transaction&gt;
   */
  @GET("blockchain/transaction/{numericId}")
  Call<Transaction> transaction(
            @retrofit2.http.Path("numericId") String numericId            
  );

  /**
   * Lists all transactions for a account (requires replicator)
   * 
   * @param account Account id (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;TransactionExtended&gt;&gt;
   */
  @GET("blockchain/transactions/account/{account}/{from}/{to}")
  Call<List<TransactionExtended>> transactionsAccount(
            @retrofit2.http.Path("account") String account            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Counts all all transactions for a account (requires replicator)
   * 
   * @param account Account id (required)
   * @return Call&lt;Count&gt;
   */
  @GET("blockchain/transactions/account/count/{account}")
  Call<Count> transactionsAccountCount(
            @retrofit2.http.Path("account") String account            
  );

  /**
   * Lists all transactions (requires replicator)
   * 
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;TransactionExtended&gt;&gt;
   */
  @GET("blockchain/transactions/all/{from}/{to}")
  Call<List<TransactionExtended>> transactionsAll(
            @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Counts all all transactions (requires replicator)
   * 
   * @return Call&lt;Count&gt;
   */
  @GET("blockchain/transactions/all/count")
  Call<Count> transactionsAllCount();
    

  /**
   * Lists all transactions for a block (requires replicator)
   * 
   * @param block Block id (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;TransactionExtended&gt;&gt;
   */
  @GET("blockchain/transactions/block/{block}/{from}/{to}")
  Call<List<TransactionExtended>> transactionsBlock(
            @retrofit2.http.Path("block") String block            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Counts all all transactions for a block (requires replicator)
   * 
   * @param block Block id (required)
   * @return Call&lt;Count&gt;
   */
  @GET("blockchain/transactions/block/count/{block}")
  Call<Count> transactionsBlockCount(
            @retrofit2.http.Path("block") String block            
  );

  /**
   * Lists all transactions from sender to recipient (requires replicator)
   * 
   * @param sender Sender account id (required)
   * @param recipient Recipient account id (required)
   * @param from From index (required)
   * @param to To index (required)
   * @return Call&lt;List&lt;TransactionExtended&gt;&gt;
   */
  @GET("blockchain/transactions/list/{sender}/{recipient}/{from}/{to}")
  Call<List<TransactionExtended>> transactionsFromTo(
            @retrofit2.http.Path("sender") String sender            ,         @retrofit2.http.Path("recipient") String recipient            ,         @retrofit2.http.Path("from") String from            ,         @retrofit2.http.Path("to") String to            
  );

  /**
   * Get a list of unconfirmed transaction ids
   * 
   * @param sender If provided only unconfirmed transaction ids sent from this account are returned (optional, pass 0 to accept any sender) (required)
   * @param recipient If provided only unconfirmed transaction ids sent to this account are returned (optional, pass 0 to accept any recipient) (required)
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @GET("blockchain/unconfirmedids/{sender}/{recipient}")
  Call<List<String>> unconfirmedIds(
            @retrofit2.http.Path("sender") String sender            ,         @retrofit2.http.Path("recipient") String recipient            
  );

  /**
   * Get a list of unconfirmed transactions
   * 
   * @param sender If provided only unconfirmed transactions sent from this account are returned (optional, pass 0 to accept any sender) (required)
   * @param recipient If provided only unconfirmed transactions sent to this account are returned (optional, pass 0 to accept any recipient) (required)
   * @return Call&lt;List&lt;TransactionUnconfirmed&gt;&gt;
   */
  @GET("blockchain/unconfirmed/{sender}/{recipient}")
  Call<List<TransactionUnconfirmed>> unconfirmedTransactions(
            @retrofit2.http.Path("sender") String sender            ,         @retrofit2.http.Path("recipient") String recipient            
  );

}
