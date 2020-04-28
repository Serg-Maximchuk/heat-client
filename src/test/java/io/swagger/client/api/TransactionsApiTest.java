package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Broadcast;
import io.swagger.client.model.FullHash;
import io.swagger.client.model.SignResponse;
import io.swagger.client.model.TransactionCreate;
import io.swagger.client.model.TransactionVerify;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionsApi
 */
public class TransactionsApiTest {

    private TransactionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TransactionsApi.class);
    }


    /**
     * Broadcast a transaction to the network
     *
     * 
     */
    @Test
    public void broadcastTest() {
        String transactionBytes = null;
        String transactionJSON = null;
        // Broadcast response = api.broadcast(transactionBytes, transactionJSON);

        // TODO: test validations
    }

    /**
     * Get a transaction object given a (signed or unsigned) transaction bytecode, or re-parse a transaction object. Verify the signature. Check applicability of transaction at moment
     *
     * 
     */
    @Test
    public void checkApplicabilityTest() {
        String transactionJSON = null;
        String transactionBytes = null;
        // TransactionVerify response = api.checkApplicability(transactionJSON, transactionBytes);

        // TODO: test validations
    }

    /**
     * Create and optionally sign and broadcast any type of transaction from a JSON document
     *
     * &lt;code&gt;// Transaction fee in HQT (1 HQT equals 0.00000001 HEAT) default fee is 0.01 HEAT&lt;br&gt;fee: string,&lt;br&gt;&lt;br&gt;// The deadline (in minutes) for the transaction to be confirmed, 1440 minutes maximum&lt;br&gt;deadline: number,&lt;br&gt;&lt;br&gt;// The secret passphrase of the account (optional, but transaction neither signed nor broadcast if omitted)&lt;br&gt;secretPhrase: string,&lt;br&gt;&lt;br&gt;// The public key of the account (optional if secretPhrase provided)&lt;br&gt;publicKey: string,&lt;br&gt;&lt;br&gt;// The account ID of the recipient (optional)&lt;br&gt;recipient: string,&lt;br&gt;&lt;br&gt;// The public key of the receiving account (optional, enhances security of a new account)&lt;br&gt;recipientPublicKey: string,&lt;br&gt;&lt;br&gt;// Set to false to prevent broadcasting the transaction to the network (optional)&lt;br&gt;broadcast: boolean,&lt;br&gt;&lt;br&gt;// Either UTF-8 text or a string of hex digits (perhaps previously encoded using an arbitrary algorithm) to be converted into a bytecode with a maximum length of one kilobyte&lt;br&gt;message: string,&lt;br&gt;&lt;br&gt;// False if the message is a hex string, otherwise the message is text (optional)&lt;br&gt;messageIsText: boolean,&lt;br&gt;&lt;br&gt;// Either UTF-8 text or a string of hex digits to be compressed (unless compressMessageToEncrypt is false) and converted into a bytecode with a maximum length of one kilobyte&lt;br&gt;messageToEncrypt: string,&lt;br&gt;&lt;br&gt;// False if the message to encrypt is a hex string, otherwise the message to encrypt is text (optional)&lt;br&gt;messageToEncryptIsText: string,&lt;br&gt;&lt;br&gt;// Already encrypted data which overrides messageToEncrypt if provided (optional)&lt;br&gt;encryptedMessageData: string,&lt;br&gt;&lt;br&gt;// A unique 32-byte number which cannot be reused (optional unless encryptedMessageData is provided)&lt;br&gt;encryptedMessageNonce: string,&lt;br&gt;&lt;br&gt;// Either UTF-8 text or a string of hex digits to be compressed (unless compressMessageToEncryptToSelf is false) and converted into a one kilobyte maximum bytecode then encrypted with AES, then sent to the sending account (optional)&lt;br&gt;messageToEncryptToSelf: string,&lt;br&gt;&lt;br&gt;// False if the message to self-encrypt is a hex string, otherwise the message to encrypt is text (optional)&lt;br&gt;messageToEncryptToSelfIsText: boolean, &lt;br&gt;&lt;br&gt;// Already encrypted data which overrides messageToEncryptToSelf if provided (optional)&lt;br&gt;encryptToSelfMessageData: string,&lt;br&gt;&lt;br&gt;// A unique 32-byte number which cannot be reused (optional unless encryptToSelfMessageData is provided)&lt;br&gt;public String encryptToSelfMessageNonce;&lt;br&gt;&lt;br&gt;// 8 byte numeric name hash (optional, announces non-public name to your account)&lt;br&gt;privateNameAnnouncement: string,&lt;br&gt;&lt;br&gt;// Account name, UTF-8 min length 3, max length 100 (optional, announces public name to your account)&lt;br&gt;publicNameAnnouncement: string, &lt;br&gt;&lt;br&gt;// 8 byte numeric name hash (optional, assigns non-public name to recipient account)&lt;br&gt;privateNameAssignment: string,&lt;br&gt;&lt;br&gt;// Private name assignment signature (required when privateNameAssignment was given, see /tools/privatename/signature for details)&lt;br&gt;privateNameAssignmentSignature: string,&lt;br&gt;&lt;br&gt;// Account name, UTF-8 min length 3, max length 100 (optional, assigns public name to recipient account)&lt;br&gt;publicNameAssignment: string,&lt;br&gt;&lt;br&gt;// Public name assignment signature (required when publicNameAssignment was given, see /tools/publicname/signature for details)&lt;br&gt;publicNameAssignmentSignature: string,&lt;br&gt;&lt;br&gt;EffectiveBalanceLeasing: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;period: number&lt;br&gt;}&lt;br&gt;AskOrderCancellation: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;orderId: string&lt;br&gt;}&lt;br&gt;BidOrderCancellation: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;orderId: string&lt;br&gt;}&lt;br&gt;AskOrderPlacement: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;currencyId: string,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;assetId: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantity: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;price: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;expiration: number&lt;br&gt;}&lt;br&gt;BidOrderPlacement: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;currencyId: string,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;assetId: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantity: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;price: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;expiration: number&lt;br&gt;}&lt;br&gt;AssetIssuance: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;descriptionUrl: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;descriptionHash: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantityQNT: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;decimals: number, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;dillutable: boolean&lt;br&gt;}&lt;br&gt;AssetIssueMore: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;assetId: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantity: string&lt;br&gt;}&lt;br&gt;AssetTransfer: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;assetId: string,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantity: string&lt;br&gt;}&lt;br&gt;OrdinaryPayment: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;amountHQT: string,&lt;br&gt;}&lt;br&gt;ArbitraryMessage: {}&lt;br&gt;&lt;/code&gt;
     */
    @Test
    public void createTest() {
        String value = null;
        // TransactionCreate response = api.create(value);

        // TODO: test validations
    }

    /**
     * Calculate the full hash of a transaction.
     *
     * 
     */
    @Test
    public void fullhashTest() {
        String unsignedTransactionJSON = null;
        String unsignedTransactionBytes = null;
        String signatureHash = null;
        // FullHash response = api.fullhash(unsignedTransactionJSON, unsignedTransactionBytes, signatureHash);

        // TODO: test validations
    }

    /**
     * Lease the entire guaranteed balance of HEAT to another account, after 1440 confirmations
     *
     * 
     */
    @Test
    public void leaseTest() {
        String period = null;
        String fee = null;
        String deadline = null;
        String secretPhrase = null;
        String publicKey = null;
        String recipient = null;
        String recipientPublicKey = null;
        String broadcast = null;
        String privateNameAnnouncement = null;
        String publicNameAnnouncement = null;
        // TransactionCreate response = api.lease(period, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);

        // TODO: test validations
    }

    /**
     * Get a transaction object given a (signed or unsigned) transaction bytecode, or re-parse a transaction object. Verify the signature
     *
     * 
     */
    @Test
    public void parseTest() {
        String transactionJSON = null;
        String transactionBytes = null;
        // TransactionVerify response = api.parse(transactionJSON, transactionBytes);

        // TODO: test validations
    }

    /**
     * Register internet address for sender account (the host of node on which account is forging)
     *
     * 
     */
    @Test
    public void registerInternetAddressTest() {
        String internetAddress = null;
        String fee = null;
        String deadline = null;
        String secretPhrase = null;
        String publicKey = null;
        String recipient = null;
        String recipientPublicKey = null;
        String broadcast = null;
        String privateNameAnnouncement = null;
        String publicNameAnnouncement = null;
        // TransactionCreate response = api.registerInternetAddress(internetAddress, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);

        // TODO: test validations
    }

    /**
     * Create an Arbitrary Message transaction
     *
     * 
     */
    @Test
    public void sendMessageTest() {
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
        // TransactionCreate response = api.sendMessage(fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature);

        // TODO: test validations
    }

    /**
     * Send HEAT to an account
     *
     * 
     */
    @Test
    public void sendMoneyTest() {
        String amount = null;
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
        // TransactionCreate response = api.sendMoney(amount, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature);

        // TODO: test validations
    }

    /**
     * Calculates the full hash, signature hash, and transaction ID of an unsigned transaction
     *
     * 
     */
    @Test
    public void signTest() {
        String unsignedTransactionJSON = null;
        String unsignedTransactionBytes = null;
        String secretPhrase = null;
        String validate = null;
        // SignResponse response = api.sign(unsignedTransactionJSON, unsignedTransactionBytes, secretPhrase, validate);

        // TODO: test validations
    }
}
