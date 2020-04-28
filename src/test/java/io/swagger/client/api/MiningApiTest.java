package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Count;
import io.swagger.client.model.JSONRewardsInfo;
import io.swagger.client.model.Mining;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MiningApi
 */
public class MiningApiTest {

    private MiningApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MiningApi.class);
    }


    /**
     * Get current mining info for all miners (if secret phrase ommitted) or for a single miner
     *
     * 
     */
    @Test
    public void infoTest() {
        String secretPhrase = null;
        // List<Mining> response = api.info(secretPhrase);

        // TODO: test validations
    }

    /**
     * Get current mining info for all miners (if secret phrase ommitted) or for a single miner
     *
     * 
     */
    @Test
    public void info2Test() {
        String secretPhrase = null;
        // List<Mining> response = api.info2(secretPhrase);

        // TODO: test validations
    }

    /**
     * Find reward info for account
     *
     * 
     */
    @Test
    public void rewardsAccountTest() {
        String account = null;
        // JSONRewardsInfo response = api.rewardsAccount(account);

        // TODO: test validations
    }

    /**
     * List all reward info
     *
     * 
     */
    @Test
    public void rewardsListTest() {
        String firstIndex = null;
        String lastIndex = null;
        // List<JSONRewardsInfo> response = api.rewardsList(firstIndex, lastIndex);

        // TODO: test validations
    }

    /**
     * Count number of reward info entries
     *
     * 
     */
    @Test
    public void rewardsListCountTest() {
        // Count response = api.rewardsListCount();

        // TODO: test validations
    }

    /**
     * Start mining blocks with an account
     *
     * 
     */
    @Test
    public void startTest() {
        String secretPhrase = null;
        // Mining response = api.start(secretPhrase);

        // TODO: test validations
    }

    /**
     * Start mining blocks with an account
     *
     * 
     */
    @Test
    public void start2Test() {
        String secretPhrase = null;
        // Mining response = api.start2(secretPhrase);

        // TODO: test validations
    }

    /**
     * Stop mining blocks
     *
     * 
     */
    @Test
    public void stopTest() {
        String secretPhrase = null;
        // Mining response = api.stop(secretPhrase);

        // TODO: test validations
    }

    /**
     * Stop mining blocks
     *
     * 
     */
    @Test
    public void stop2Test() {
        String secretPhrase = null;
        // Mining response = api.stop2(secretPhrase);

        // TODO: test validations
    }
}
