package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.AccountAsset;
import io.swagger.client.model.AssetProperties;
import io.swagger.client.model.ChartData;
import io.swagger.client.model.JSONAssetCertification;
import io.swagger.client.model.JSONAssetProtocol1;
import io.swagger.client.model.Market;
import io.swagger.client.model.TransactionCreate;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExchangeApi
 */
public class ExchangeApiTest {

    private ExchangeApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ExchangeApi.class);
    }


    /**
     * Returns asset balances (requires replicator)
     *
     * 
     */
    @Test
    public void assetBalancesTest() {
        String asset = null;
        String from = null;
        String to = null;
        // List<AccountAsset> response = api.assetBalances(asset, from, to);

        // TODO: test validations
    }

    /**
     * Returns asset certification info (requires replicator)
     *
     * 
     */
    @Test
    public void assetCertificationTest() {
        String asset = null;
        String certifierAccount = null;
        // JSONAssetCertification response = api.assetCertification(asset, certifierAccount);

        // TODO: test validations
    }

    /**
     * Sets asset certification info (requires replicator)
     *
     * 
     */
    @Test
    public void assetCertifyTest() {
        String asset = null;
        String certified = null;
        String symbol = null;
        String name = null;
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
        // TransactionCreate response = api.assetCertify(asset, certified, symbol, name, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature);

        // TODO: test validations
    }

    /**
     * Sets the asset properties for the given protocol (requires replicator)
     *
     * 
     */
    @Test
    public void assetPropertiesTest() {
        String asset = null;
        String protocol = null;
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
        // TransactionCreate response = api.assetProperties(asset, protocol, value, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature);

        // TODO: test validations
    }

    /**
     * Find asset properties by numeric id, properties account and protocol (requires replicator)
     *
     * 
     */
    @Test
    public void assetProperties_0Test() {
        String asset = null;
        String propertiesAccount = null;
        String propertiesProtocol = null;
        // AssetProperties response = api.assetProperties_0(asset, propertiesAccount, propertiesProtocol);

        // TODO: test validations
    }

    /**
     * Finds protocol 1 asset by symbol (requires replicator)
     *
     * Protocol 1 assets enforce unique symbol names
     */
    @Test
    public void assetProtocol1Test() {
        String symbol = null;
        // JSONAssetProtocol1 response = api.assetProtocol1(symbol);

        // TODO: test validations
    }

    /**
     * Lists all protocol 1 assets (requires replicator)
     *
     * Protocol 1 assets enforce unique symbol names
     */
    @Test
    public void assetsProtocol1Test() {
        String from = null;
        String to = null;
        // List<JSONAssetProtocol1> response = api.assetsProtocol1(from, to);

        // TODO: test validations
    }

    /**
     * Retrieves OHLC chart data for trading pair (requires replicator)
     *
     * Chartdata entries in the &#x27;data&#x27; property are arrays with indexed properties.&lt;br&gt;[&lt;br&gt;&amp;nbsp;&amp;nbsp;timestamp, // number timestamp in HEAT epoch format&lt;br&gt;&amp;nbsp;&amp;nbsp;avg,       // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsp;&amp;nbsp;low,       // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsp;&amp;nbsp;high,      // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsp;&amp;nbsp;vol,       // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsp;&amp;nbsp;open,      // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsps;&amp;nbsp;close     // string or number if &lt; 9007199254740991&lt;br&gt;]
     */
    @Test
    public void chartdataTest() {
        String currency = null;
        String asset = null;
        String window = null;
        // ChartData response = api.chartdata(currency, asset, window);

        // TODO: test validations
    }

    /**
     * Create an asset on the exchange
     *
     * 
     */
    @Test
    public void issueTest() {
        String quantity = null;
        String decimals = null;
        String descriptionUrl = null;
        String descriptionHash = null;
        String dillutable = null;
        String fee = null;
        String deadline = null;
        String secretPhrase = null;
        String publicKey = null;
        String recipient = null;
        String recipientPublicKey = null;
        String broadcast = null;
        String privateNameAnnouncement = null;
        String publicNameAnnouncement = null;
        // TransactionCreate response = api.issue(quantity, decimals, descriptionUrl, descriptionHash, dillutable, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);

        // TODO: test validations
    }

    /**
     * Issue extra assets, assign those extra assets to transaction recipient
     *
     * 
     */
    @Test
    public void issueMoreTest() {
        String asset = null;
        String quantity = null;
        String fee = null;
        String deadline = null;
        String secretPhrase = null;
        String publicKey = null;
        String recipient = null;
        String recipientPublicKey = null;
        String broadcast = null;
        String privateNameAnnouncement = null;
        String publicNameAnnouncement = null;
        // TransactionCreate response = api.issueMore(asset, quantity, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);

        // TODO: test validations
    }

    /**
     * Finds a market for a currency and asset (requires replicator)
     *
     * 
     */
    @Test
    public void marketTest() {
        String currency = null;
        String asset = null;
        String propertiesAccountId = null;
        String propertiesProtocol = null;
        // List<Market> response = api.market(currency, asset, propertiesAccountId, propertiesProtocol);

        // TODO: test validations
    }

    /**
     * Lists all markets for a currency (requires replicator)
     *
     * 
     */
    @Test
    public void marketsTest() {
        String currency = null;
        String sort = null;
        String asc = null;
        String propertiesAccountId = null;
        String propertiesProtocol = null;
        String from = null;
        String to = null;
        // List<Market> response = api.markets(currency, sort, asc, propertiesAccountId, propertiesProtocol, from, to);

        // TODO: test validations
    }

    /**
     * Lists all markets (requires replicator)
     *
     * 
     */
    @Test
    public void marketsAllTest() {
        String sort = null;
        String asc = null;
        String propertiesAccountId = null;
        String propertiesProtocol = null;
        String from = null;
        String to = null;
        // List<Market> response = api.marketsAll(sort, asc, propertiesAccountId, propertiesProtocol, from, to);

        // TODO: test validations
    }

    /**
     * Transfer a quantity of an asset from one account to another
     *
     * 
     */
    @Test
    public void transferTest() {
        String asset = null;
        String quantity = null;
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
        // TransactionCreate response = api.transfer(asset, quantity, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature);

        // TODO: test validations
    }
}
