package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Value;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RegisterApi
 */
public class RegisterApiTest {

    private RegisterApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RegisterApi.class);
    }


    /**
     * Register a new account
     *
     * 
     */
    @Test
    public void addTest() {
        String publicKey = null;
        String captcha = null;
        String name = null;
        String isprivate = null;
        String signature = null;
        // Value response = api.add(publicKey, captcha, name, isprivate, signature);

        // TODO: test validations
    }
}
