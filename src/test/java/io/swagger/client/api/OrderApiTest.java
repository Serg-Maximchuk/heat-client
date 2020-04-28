package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Count;
import io.swagger.client.model.Order;
import io.swagger.client.model.TransactionCreate;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderApi
 */
public class OrderApiTest {

    private OrderApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(OrderApi.class);
    }


    /**
     * Lists all orders for an account (requires replicator)
     *
     * 
     */
    @Test
    public void accountAllTest() {
        String account = null;
        String from = null;
        String to = null;
        // List<Order> response = api.accountAll(account, from, to);

        // TODO: test validations
    }

    /**
     * Counts all orders for an account (requires replicator)
     *
     * 
     */
    @Test
    public void accountAllCountTest() {
        String account = null;
        // Count response = api.accountAllCount(account);

        // TODO: test validations
    }

    /**
     * Lists all ask orders by account (requires replicator)
     *
     * 
     */
    @Test
    public void accountAsksTest() {
        String account = null;
        String from = null;
        String to = null;
        // List<Order> response = api.accountAsks(account, from, to);

        // TODO: test validations
    }

    /**
     * Lists all bid orders by account (requires replicator)
     *
     * 
     */
    @Test
    public void accountBidsTest() {
        String account = null;
        String from = null;
        String to = null;
        // List<Order> response = api.accountBids(account, from, to);

        // TODO: test validations
    }

    /**
     * Lists all ask orders by account and trading pair (requires replicator)
     *
     * 
     */
    @Test
    public void accountPairAsksTest() {
        String account = null;
        String currency = null;
        String asset = null;
        String from = null;
        String to = null;
        // List<Order> response = api.accountPairAsks(account, currency, asset, from, to);

        // TODO: test validations
    }

    /**
     * Lists all bid orders by account and trading pair (requires replicator)
     *
     * 
     */
    @Test
    public void accountPairBidsTest() {
        String account = null;
        String currency = null;
        String asset = null;
        String from = null;
        String to = null;
        // List<Order> response = api.accountPairBids(account, currency, asset, from, to);

        // TODO: test validations
    }

    /**
     * Finds an ask order by ID (requires replicator)
     *
     * 
     */
    @Test
    public void askTest() {
        String order = null;
        // Order response = api.ask(order);

        // TODO: test validations
    }

    /**
     * Lists all ask orders (requires replicator)
     *
     * 
     */
    @Test
    public void asksTest() {
        String from = null;
        String to = null;
        // List<Order> response = api.asks(from, to);

        // TODO: test validations
    }

    /**
     * Finds an bid order by ID (requires replicator)
     *
     * 
     */
    @Test
    public void bidTest() {
        String order = null;
        // Order response = api.bid(order);

        // TODO: test validations
    }

    /**
     * Lists all bid orders (requires replicator)
     *
     * 
     */
    @Test
    public void bidsTest() {
        String from = null;
        String to = null;
        // List<Order> response = api.bids(from, to);

        // TODO: test validations
    }

    /**
     * Cancel an existing ask asset order
     *
     * 
     */
    @Test
    public void cancelAskTest() {
        String order = null;
        String fee = null;
        String deadline = null;
        String secretPhrase = null;
        String publicKey = null;
        String recipient = null;
        String recipientPublicKey = null;
        String broadcast = null;
        String privateNameAnnouncement = null;
        String publicNameAnnouncement = null;
        // TransactionCreate response = api.cancelAsk(order, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);

        // TODO: test validations
    }

    /**
     * Cancel an existing bid asset order
     *
     * 
     */
    @Test
    public void cancelBidTest() {
        String order = null;
        String fee = null;
        String deadline = null;
        String secretPhrase = null;
        String publicKey = null;
        String recipient = null;
        String recipientPublicKey = null;
        String broadcast = null;
        String privateNameAnnouncement = null;
        String publicNameAnnouncement = null;
        // TransactionCreate response = api.cancelBid(order, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);

        // TODO: test validations
    }

    /**
     * Lists all orders for an account (requires replicator)
     *
     * 
     */
    @Test
    public void orderAccountPairTest() {
        String account = null;
        String currency = null;
        String asset = null;
        String from = null;
        String to = null;
        // List<Order> response = api.orderAccountPair(account, currency, asset, from, to);

        // TODO: test validations
    }

    /**
     * Counts all orders for an account with currency and asset (requires replicator)
     *
     * 
     */
    @Test
    public void orderAccountPairCountTest() {
        String account = null;
        String currency = null;
        String asset = null;
        // List<Order> response = api.orderAccountPairCount(account, currency, asset);

        // TODO: test validations
    }

    /**
     * Lists all ask orders by trading pair (requires replicator)
     *
     * 
     */
    @Test
    public void pairAsksTest() {
        String currency = null;
        String asset = null;
        String from = null;
        String to = null;
        // List<Order> response = api.pairAsks(currency, asset, from, to);

        // TODO: test validations
    }

    /**
     * Counts all ask orders by trading pair
     *
     * 
     */
    @Test
    public void pairAsksCountTest() {
        String currency = null;
        String asset = null;
        // List<Order> response = api.pairAsksCount(currency, asset);

        // TODO: test validations
    }

    /**
     * Lists all bid orders by trading pair
     *
     * 
     */
    @Test
    public void pairBidsTest() {
        String currency = null;
        String asset = null;
        String from = null;
        String to = null;
        // List<Order> response = api.pairBids(currency, asset, from, to);

        // TODO: test validations
    }

    /**
     * Counts all bid orders by trading pair
     *
     * 
     */
    @Test
    public void pairBidsCountTest() {
        String currency = null;
        String asset = null;
        // List<Order> response = api.pairBidsCount(currency, asset);

        // TODO: test validations
    }

    /**
     * Place an asset ask(sell) order
     *
     * 
     */
    @Test
    public void placeAskTest() {
        String currency = null;
        String asset = null;
        String quantity = null;
        String price = null;
        String expiration = null;
        String fee = null;
        String deadline = null;
        String secretPhrase = null;
        String publicKey = null;
        String recipient = null;
        String recipientPublicKey = null;
        String broadcast = null;
        String privateNameAnnouncement = null;
        String publicNameAnnouncement = null;
        // TransactionCreate response = api.placeAsk(currency, asset, quantity, price, expiration, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);

        // TODO: test validations
    }

    /**
     * Place an asset bid order
     *
     * 
     */
    @Test
    public void placeBidTest() {
        String currency = null;
        String asset = null;
        String quantity = null;
        String price = null;
        String expiration = null;
        String fee = null;
        String deadline = null;
        String secretPhrase = null;
        String publicKey = null;
        String recipient = null;
        String recipientPublicKey = null;
        String broadcast = null;
        String privateNameAnnouncement = null;
        String publicNameAnnouncement = null;
        // TransactionCreate response = api.placeBid(currency, asset, quantity, price, expiration, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);

        // TODO: test validations
    }
}
