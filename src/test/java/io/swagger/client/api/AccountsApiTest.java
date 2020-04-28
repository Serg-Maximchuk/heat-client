package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Account;
import io.swagger.client.model.AccountBalance;
import io.swagger.client.model.AccountInternetAddress;
import io.swagger.client.model.Count;
import io.swagger.client.model.Payment;
import io.swagger.client.model.Value;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsApi
 */
public class AccountsApiTest {

    private AccountsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountsApi.class);
    }


    /**
     * Find account by numeric id
     *
     * 
     */
    @Test
    public void accountTest() {
        String numericId = null;
        // Account response = api.account(numericId);

        // TODO: test validations
    }

    /**
     * Returns account asset balance, balance with asset&#x3D;0 is your HEAT balance
     *
     * 
     */
    @Test
    public void balanceTest() {
        String account = null;
        String asset = null;
        // AccountBalance response = api.balance(account, asset);

        // TODO: test validations
    }

    /**
     * Returns account asset balance, balance with asset&#x3D;0 is your HEAT balance. This includes your virtual balance (requires replicator)
     *
     * 
     */
    @Test
    public void balanceVirtualTest() {
        String account = null;
        String asset = null;
        String propertiesAccountId = null;
        String propertiesProtocol = null;
        // AccountBalance response = api.balanceVirtual(account, asset, propertiesAccountId, propertiesProtocol);

        // TODO: test validations
    }

    /**
     * Returns account HEAT balance and all asset balances, balance with asset&#x3D;0 is your HEAT balance (requires replicator)
     *
     * 
     */
    @Test
    public void balancesTest() {
        String account = null;
        String propertiesAccountId = null;
        String propertiesProtocol = null;
        String from = null;
        String to = null;
        // List<AccountBalance> response = api.balances(account, propertiesAccountId, propertiesProtocol, from, to);

        // TODO: test validations
    }

    /**
     * Find account by numeric name hash
     *
     * 
     */
    @Test
    public void findHashTest() {
        String hash = null;
        // Account response = api.findHash(hash);

        // TODO: test validations
    }

    /**
     * Returns account publickey
     *
     * 
     */
    @Test
    public void getPublickeyTest() {
        String account = null;
        // Value response = api.getPublickey(account);

        // TODO: test validations
    }

    /**
     * Returns account registered internet address (the host of node on which account is forging)
     *
     * 
     */
    @Test
    public void internetAddressTest() {
        String account = null;
        // AccountInternetAddress response = api.internetAddress(account);

        // TODO: test validations
    }

    /**
     * List accounts with public name (requires replicator)
     *
     * 
     */
    @Test
    public void listTest() {
        String assigner = null;
        String from = null;
        String to = null;
        // List<Account> response = api.list(assigner, from, to);

        // TODO: test validations
    }

    /**
     * Find account by name
     *
     * 
     */
    @Test
    public void nameTest() {
        String name = null;
        // Account response = api.name(name);

        // TODO: test validations
    }

    /**
     * Returns payments from and to an account, includes asset payments (requires replicator)
     *
     * 
     */
    @Test
    public void paymentsTest() {
        String account = null;
        String currency = null;
        String sort = null;
        String asc = null;
        String from = null;
        String to = null;
        // List<Payment> response = api.payments(account, currency, sort, asc, from, to);

        // TODO: test validations
    }

    /**
     * Returns payments count from and to an account, includes asset payments (requires replicator)
     *
     * 
     */
    @Test
    public void paymentsCountTest() {
        String account = null;
        String currency = null;
        // Count response = api.paymentsCount(account, currency);

        // TODO: test validations
    }

    /**
     * Find account by public key
     *
     * 
     */
    @Test
    public void publicKeyFindTest() {
        String publicKey = null;
        // Account response = api.publicKeyFind(publicKey);

        // TODO: test validations
    }

    /**
     * Search accounts with public name by name (requires replicator)
     *
     * 
     */
    @Test
    public void searchTest() {
        String assigner = null;
        String query = null;
        String from = null;
        String to = null;
        // List<Account> response = api.search(assigner, query, from, to);

        // TODO: test validations
    }

    /**
     * Find account by secret phrase
     *
     * 
     */
    @Test
    public void secretPhraseTest() {
        String secretPhrase = null;
        // Account response = api.secretPhrase(secretPhrase);

        // TODO: test validations
    }
}
