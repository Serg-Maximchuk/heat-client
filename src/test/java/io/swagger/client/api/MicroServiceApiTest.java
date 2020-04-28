package io.swagger.client.api;

import io.swagger.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MicroServiceApi
 */
public class MicroServiceApiTest {

    private MicroServiceApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MicroServiceApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void getTest() {
        List<String> params = null;
        // Void response = api.get(params);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postTest() {
        List<String> params = null;
        String body = null;
        // Void response = api.post(params, body);

        // TODO: test validations
    }
}
