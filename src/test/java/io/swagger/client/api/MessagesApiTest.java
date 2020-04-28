package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Count;
import io.swagger.client.model.Message;
import io.swagger.client.model.MessageContact;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagesApi
 */
public class MessagesApiTest {

    private MessagesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MessagesApi.class);
    }


    /**
     * Lists messages for a contact (requires replicator)
     *
     * 
     */
    @Test
    public void contactTest() {
        String accountA = null;
        String accountB = null;
        String from = null;
        String to = null;
        // List<Message> response = api.contact(accountA, accountB, from, to);

        // TODO: test validations
    }

    /**
     * Count of all contacts messages (requires replicator)
     *
     * 
     */
    @Test
    public void contactCountTest() {
        String accountA = null;
        String accountB = null;
        // Count response = api.contactCount(accountA, accountB);

        // TODO: test validations
    }

    /**
     * Lists latest message contacts (requires replicator)
     *
     * 
     */
    @Test
    public void latestTest() {
        String account = null;
        String from = null;
        String to = null;
        // List<MessageContact> response = api.latest(account, from, to);

        // TODO: test validations
    }
}
