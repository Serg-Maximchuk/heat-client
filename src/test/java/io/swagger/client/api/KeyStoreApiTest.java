package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Count;
import io.swagger.client.model.KeyStoreBundle;
import io.swagger.client.model.TransactionCreate;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KeyStoreApi
 */
public class KeyStoreApiTest {

    private KeyStoreApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(KeyStoreApi.class);
    }


    /**
     * Counts key/value entries for an account (requires replicator)
     *
     * 
     */
    @Test
    public void keyStoreCountTest() {
        String account = null;
        // Count response = api.keyStoreCount(account);

        // TODO: test validations
    }

    /**
     * Get the value for account key value  (requires replicator)
     *
     * 
     */
    @Test
    public void keyStoreGetTest() {
        String account = null;
        String key = null;
        // KeyStoreBundle response = api.keyStoreGet(account, key);

        // TODO: test validations
    }

    /**
     * Lists all keys for account (requires replicator)
     *
     * 
     */
    @Test
    public void keyStoreListTest() {
        String account = null;
        String from = null;
        String to = null;
        // List<KeyStoreBundle> response = api.keyStoreList(account, from, to);

        // TODO: test validations
    }

    /**
     * Sets the value identified by key (requires replicator)
     *
     * 
     */
    @Test
    public void keyStorePutTest() {
        String key = null;
        String value = null;
        String fee = null;
        String deadline = null;
        String secretPhrase = null;
        String publicKey = null;
        String recipient = null;
        String recipientPublicKey = null;
        String broadcast = null;
        String privateNameAnnouncement = null;
        String publicNameAnnouncement = null;
        String message = null;
        String messageIsText = null;
        String messageToEncrypt = null;
        String messageToEncryptIsText = null;
        String encryptedMessageData = null;
        String encryptedMessageNonce = null;
        String messageToEncryptToSelf = null;
        String messageToEncryptToSelfIsText = null;
        String encryptToSelfMessageData = null;
        String encryptToSelfMessageNonce = null;
        String privateNameAssignment = null;
        String privateNameAssignmentSignature = null;
        String publicNameAssignment = null;
        String publicNameAssignmentSignature = null;
        // TransactionCreate response = api.keyStorePut(key, value, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature);

        // TODO: test validations
    }
}
