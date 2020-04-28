package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Account;
import io.swagger.client.model.Count;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
public class SearchApiTest {

    private SearchApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SearchApi.class);
    }


    /**
     * Search account ids, public keys and email ids
     *
     * 
     */
    @Test
    public void accountsTest() {
        String query = null;
        String from = null;
        String to = null;
        // List<Account> response = api.accounts(query, from, to);

        // TODO: test validations
    }

    /**
     * Count account ids, public keys and email ids
     *
     * 
     */
    @Test
    public void accountsCountTest() {
        String query = null;
        // Count response = api.accountsCount(query);

        // TODO: test validations
    }
}
