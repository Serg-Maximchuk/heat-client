package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Count;
import io.swagger.client.model.Trade;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TradeApi
 */
public class TradeApiTest {

    private TradeApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TradeApi.class);
    }


    /**
     * Counts all trades for an account (requires replicator)
     *
     * 
     */
    @Test
    public void accountCountTest() {
        String account = null;
        // Count response = api.accountCount(account);

        // TODO: test validations
    }

    /**
     * Lists all trades for an account (requires replicator)
     *
     * 
     */
    @Test
    public void accountTradesTest() {
        String account = null;
        String propertiesAccount = null;
        String propertiesProtocol = null;
        String from = null;
        String to = null;
        // List<Trade> response = api.accountTrades(account, propertiesAccount, propertiesProtocol, from, to);

        // TODO: test validations
    }

    /**
     * Lists all trades for all trading pairs (requires replicator)
     *
     * 
     */
    @Test
    public void allTest() {
        String from = null;
        String to = null;
        // List<Trade> response = api.all(from, to);

        // TODO: test validations
    }

    /**
     * Lists trades for an ask order (requires replicator)
     *
     * 
     */
    @Test
    public void askTradesTest() {
        String order = null;
        String from = null;
        String to = null;
        // List<Trade> response = api.askTrades(order, from, to);

        // TODO: test validations
    }

    /**
     * Counts trades for an asset order (requires replicator)
     *
     * 
     */
    @Test
    public void askTradesCountTest() {
        String order = null;
        // Count response = api.askTradesCount(order);

        // TODO: test validations
    }

    /**
     * Lists trades for an bid order (requires replicator)
     *
     * 
     */
    @Test
    public void bidTradesTest() {
        String order = null;
        String from = null;
        String to = null;
        // List<Trade> response = api.bidTrades(order, from, to);

        // TODO: test validations
    }

    /**
     * Counts trades for an asset order (requires replicator)
     *
     * 
     */
    @Test
    public void bidTradesCountTest() {
        String order = null;
        // Count response = api.bidTradesCount(order);

        // TODO: test validations
    }

    /**
     * Find trade by ask order id and bid order id (requires replicator)
     *
     * 
     */
    @Test
    public void tradeTest() {
        String ask = null;
        String bid = null;
        // Trade response = api.trade(ask, bid);

        // TODO: test validations
    }

    /**
     * Lists account trades for a trading pair (requires replicator)
     *
     * 
     */
    @Test
    public void tradeAccountPairTest() {
        String account = null;
        String currency = null;
        String asset = null;
        String from = null;
        String to = null;
        // List<Trade> response = api.tradeAccountPair(account, currency, asset, from, to);

        // TODO: test validations
    }

    /**
     * Counts account trades for a trading pair (requires replicator)
     *
     * 
     */
    @Test
    public void tradeAccountPairCountTest() {
        String account = null;
        String currency = null;
        String asset = null;
        // Count response = api.tradeAccountPairCount(account, currency, asset);

        // TODO: test validations
    }

    /**
     * Counts all trades for a trading pair (requires replicator)
     *
     * 
     */
    @Test
    public void tradeCountTest() {
        String currency = null;
        String asset = null;
        // Count response = api.tradeCount(currency, asset);

        // TODO: test validations
    }

    /**
     * Lists all trades for a trading pair (requires replicator)
     *
     * 
     */
    @Test
    public void tradesTest() {
        String currency = null;
        String asset = null;
        String from = null;
        String to = null;
        // List<Trade> response = api.trades(currency, asset, from, to);

        // TODO: test validations
    }
}
