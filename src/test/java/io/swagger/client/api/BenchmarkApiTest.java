package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.BlockMin;
import io.swagger.client.model.Value;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BenchmarkApi
 */
public class BenchmarkApiTest {

    private BenchmarkApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BenchmarkApi.class);
    }


    /**
     * Get a minimal block object given the block height
     *
     * 
     */
    @Test
    public void blockminTest() {
        String height = null;
        // BlockMin response = api.blockmin(height);

        // TODO: test validations
    }

    /**
     * Get highest transaction id in a block
     *
     * 
     */
    @Test
    public void highestTransactionIdTest() {
        String blockId = null;
        // Value response = api.highestTransactionId(blockId);

        // TODO: test validations
    }

    /**
     * Creates an account
     *
     * 
     */
    @Test
    public void registerAccountTest() {
        String publicKey = null;
        // Value response = api.registerAccount(publicKey);

        // TODO: test validations
    }
}
