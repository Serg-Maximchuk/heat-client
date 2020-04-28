package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.DecryptedData;
import io.swagger.client.model.EncryptedData;
import io.swagger.client.model.Hallmark;
import io.swagger.client.model.HallmarkResponse;
import io.swagger.client.model.PeerRejection;
import io.swagger.client.model.PeerStateIndicator;
import io.swagger.client.model.PeerTelemetry;
import io.swagger.client.model.SHA256Hash;
import io.swagger.client.model.Value;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ToolsApi
 */
public class ToolsApiTest {

    private ToolsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ToolsApi.class);
    }


    /**
     * Creates a signature to use for assigning public or private account name
     *
     * 
     */
    @Test
    public void assignTest() {
        String fullNameUTF8 = null;
        String secretPhrase = null;
        // Value response = api.assign(fullNameUTF8, secretPhrase);

        // TODO: test validations
    }

    /**
     * Creates a signature to use for assigning public or private account name
     *
     * 
     */
    @Test
    public void assignPostTest() {
        Object body = null;
        // Value response = api.assignPost(body);

        // TODO: test validations
    }

    /**
     * Peer hashes of all balances and hashes of block balances in heights range. 0 means equality or mismatch is unknown
     *
     * 
     */
    @Test
    public void balancesHashesTest() {
        Integer fromHeight = null;
        Integer toHeight = null;
        // Value response = api.balancesHashes(fromHeight, toHeight);

        // TODO: test validations
    }

    /**
     * Peer hash of all balances and hash of block balances at height. 0 means the hash is not calculated
     *
     * 
     */
    @Test
    public void balancesHashes_0Test() {
        Integer height = null;
        // Value response = api.balancesHashes_0(height);

        // TODO: test validations
    }

    /**
     * Decode a node hallmark
     *
     * 
     */
    @Test
    public void decodeTest() {
        String hallmark = null;
        // Hallmark response = api.decode(hallmark);

        // TODO: test validations
    }

    /**
     * Encrypt a message using AES without sending it
     *
     * 
     */
    @Test
    public void decryptTest() {
        String recipient = null;
        String data = null;
        String nonce = null;
        String isText = null;
        String uncompress = null;
        String secretPhrase = null;
        // DecryptedData response = api.decrypt(recipient, data, nonce, isText, uncompress, secretPhrase);

        // TODO: test validations
    }

    /**
     * Decrypt message bytes using AES (use with payments API)
     *
     * 
     */
    @Test
    public void decryptMessageBytesTest() {
        String messageBytesHex = null;
        String recipientPublicKey = null;
        String secretPhrase = null;
        // DecryptedData response = api.decryptMessageBytes(messageBytesHex, recipientPublicKey, secretPhrase);

        // TODO: test validations
    }

    /**
     * Encrypt a message using AES without sending it
     *
     * 
     */
    @Test
    public void decryptPostTest() {
        Object body = null;
        // DecryptedData response = api.decryptPost(body);

        // TODO: test validations
    }

    /**
     * Generates a node hallmark
     *
     * 
     */
    @Test
    public void encodeTest() {
        String host = null;
        String weight = null;
        String date = null;
        String secretPhrase = null;
        // HallmarkResponse response = api.encode(host, weight, date, secretPhrase);

        // TODO: test validations
    }

    /**
     * Encrypt a message using AES without sending it
     *
     * 
     */
    @Test
    public void encryptTest() {
        String recipient = null;
        String message = null;
        String isText = null;
        String compress = null;
        String secretPhrase = null;
        // EncryptedData response = api.encrypt(recipient, message, isText, compress, secretPhrase);

        // TODO: test validations
    }

    /**
     * Decrypt a message using AES
     *
     * 
     */
    @Test
    public void encryptPostTest() {
        Object body = null;
        // EncryptedData response = api.encryptPost(body);

        // TODO: test validations
    }

    /**
     * Info about happened forks
     *
     * 
     */
    @Test
    public void forksTelemetryTest() {
        // List<PeerTelemetry> response = api.forksTelemetry();

        // TODO: test validations
    }

    /**
     * Creates a SHA256 hash of the input, input could be plain UTF-8 text or if isText&#x3D;true can be binary data encoded as HEX
     *
     * 
     */
    @Test
    public void hashTest() {
        String isText = null;
        String message = null;
        // SHA256Hash response = api.hash(isText, message);

        // TODO: test validations
    }

    /**
     * Creates a SHA256 hash of the input, input could be plain UTF-8 text or if isText&#x3D;true can be binary data encoded as HEX
     *
     * 
     */
    @Test
    public void hashPostTest() {
        Object body = null;
        // SHA256Hash response = api.hashPost(body);

        // TODO: test validations
    }

    /**
     * Indicators to estimate server health to compare to other servers
     *
     * 
     */
    @Test
    public void healthStateTest() {
        // List<PeerTelemetry> response = api.healthState();

        // TODO: test validations
    }

    /**
     * Calculates an account id from a secretphrase, result is an unsigned long
     *
     * 
     */
    @Test
    public void idTest() {
        String secretPhrase = null;
        // Value response = api.id(secretPhrase);

        // TODO: test validations
    }

    /**
     * Peers rejections
     *
     * 
     */
    @Test
    public void peersRejectionsTest() {
        String scope = null;
        // List<PeerRejection> response = api.peersRejections(scope);

        // TODO: test validations
    }

    /**
     * Peers state
     *
     * 
     */
    @Test
    public void peersStateTest() {
        // List<PeerStateIndicator> response = api.peersState();

        // TODO: test validations
    }

    /**
     * Peers telemetry data. Balances equality means 0 - mismatch, 1 - equals, 2 - unknown
     *
     * 
     */
    @Test
    public void peersTelemetryTest() {
        // List<PeerTelemetry> response = api.peersTelemetry();

        // TODO: test validations
    }

    /**
     * Calculates a publickey from a secretphrase, result is a HEX string
     *
     * 
     */
    @Test
    public void publickeyTest() {
        String secretPhrase = null;
        // Value response = api.publickey(secretPhrase);

        // TODO: test validations
    }
}
