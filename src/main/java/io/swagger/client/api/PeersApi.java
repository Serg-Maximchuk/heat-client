package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Peer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PeersApi {
  /**
   * Add a peer to the list of known peers and attempt to connect to it
   * 
   * @param address IP address or domain name of the peer (plus optional port) (required)
   * @return Call&lt;Peer&gt;
   */
  @GET("peer/add/{address}")
  Call<Peer> addNewPeer(
            @retrofit2.http.Path("address") String address            
  );

  /**
   * Get all peers
   * 
   * @param state If provided filters on peer state, 0 for NON_CONNECTED, 1 for CONNECTED, 2 for DISCONNECTED or 3 for ALL (required)
   * @return Call&lt;List&lt;Peer&gt;&gt;
   */
  @GET("peer/all/{state}")
  Call<List<Peer>> allPeers(
            @retrofit2.http.Path("state") String state            
  );

  /**
   * Blacklist a peer for the default blacklisting period
   * 
   * @param address IP address or domain name of the peer (plus optional port) (required)
   * @return Call&lt;Peer&gt;
   */
  @GET("peer/blacklist/{address}")
  Call<Peer> blacklist(
            @retrofit2.http.Path("address") String address            
  );

  /**
   * Get information about a given peer
   * 
   * @param address IP address or domain name of the peer (plus optional port) (required)
   * @return Call&lt;Peer&gt;
   */
  @GET("peer/get/{address}")
  Call<Peer> peer(
            @retrofit2.http.Path("address") String address            
  );

}
