package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Peer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PeersApi
 */
public class PeersApiTest {

    private PeersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PeersApi.class);
    }


    /**
     * Add a peer to the list of known peers and attempt to connect to it
     *
     * 
     */
    @Test
    public void addNewPeerTest() {
        String address = null;
        // Peer response = api.addNewPeer(address);

        // TODO: test validations
    }

    /**
     * Get all peers
     *
     * 
     */
    @Test
    public void allPeersTest() {
        String state = null;
        // List<Peer> response = api.allPeers(state);

        // TODO: test validations
    }

    /**
     * Blacklist a peer for the default blacklisting period
     *
     * 
     */
    @Test
    public void blacklistTest() {
        String address = null;
        // Peer response = api.blacklist(address);

        // TODO: test validations
    }

    /**
     * Get information about a given peer
     *
     * 
     */
    @Test
    public void peerTest() {
        String address = null;
        // Peer response = api.peer(address);

        // TODO: test validations
    }
}
