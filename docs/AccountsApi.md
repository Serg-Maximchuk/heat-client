# AccountsApi

All URIs are relative to *http://heatwallet.com:7734/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**account**](AccountsApi.md#account) | **GET** account/find/{numericId} | Find account by numeric id
[**balance**](AccountsApi.md#balance) | **GET** account/balance/{account}/{asset} | Returns account asset balance, balance with asset&#x3D;0 is your HEAT balance
[**balanceVirtual**](AccountsApi.md#balanceVirtual) | **GET** account/balance/virtual/{account}/{asset}/{propertiesAccountId}/{propertiesProtocol} | Returns account asset balance, balance with asset&#x3D;0 is your HEAT balance. This includes your virtual balance (requires replicator)
[**balances**](AccountsApi.md#balances) | **GET** account/balances/{account}/{propertiesAccountId}/{propertiesProtocol}/{from}/{to} | Returns account HEAT balance and all asset balances, balance with asset&#x3D;0 is your HEAT balance (requires replicator)
[**findHash**](AccountsApi.md#findHash) | **GET** account/find/hash/{hash} | Find account by numeric name hash
[**getPublickey**](AccountsApi.md#getPublickey) | **GET** account/publickey/{account} | Returns account publickey
[**internetAddress**](AccountsApi.md#internetAddress) | **GET** account/internetaddress/{account} | Returns account registered internet address (the host of node on which account is forging)
[**list**](AccountsApi.md#list) | **GET** account/list/{assigner}/{from}/{to} | List accounts with public name (requires replicator)
[**name**](AccountsApi.md#name) | **GET** account/find/name/{name} | Find account by name
[**payments**](AccountsApi.md#payments) | **GET** account/payments/{account}/{currency}/{sort}/{asc}/{from}/{to} | Returns payments from and to an account, includes asset payments (requires replicator)
[**paymentsCount**](AccountsApi.md#paymentsCount) | **GET** account/payments/count/{account}/{currency} | Returns payments count from and to an account, includes asset payments (requires replicator)
[**publicKeyFind**](AccountsApi.md#publicKeyFind) | **GET** account/find/publickey/{publicKey} | Find account by public key
[**search**](AccountsApi.md#search) | **GET** account/search/{assigner}/{query}/{from}/{to} | Search accounts with public name by name (requires replicator)
[**secretPhrase**](AccountsApi.md#secretPhrase) | **GET** account/find/secretphrase/{secretPhrase} | Find account by secret phrase

<a name="account"></a>
# **account**
> Account account(numericId)

Find account by numeric id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String numericId = "numericId_example"; // String | The account numeric id
try {
    Account result = apiInstance.account(numericId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#account");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numericId** | **String**| The account numeric id |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="balance"></a>
# **balance**
> AccountBalance balance(account, asset)

Returns account asset balance, balance with asset&#x3D;0 is your HEAT balance

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String account = "account_example"; // String | The account numeric id
String asset = "asset_example"; // String | Asset id, asset=0 is your HEAT balance
try {
    AccountBalance result = apiInstance.balance(account, asset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#balance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| The account numeric id |
 **asset** | **String**| Asset id, asset&#x3D;0 is your HEAT balance |

### Return type

[**AccountBalance**](AccountBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="balanceVirtual"></a>
# **balanceVirtual**
> AccountBalance balanceVirtual(account, asset, propertiesAccountId, propertiesProtocol)

Returns account asset balance, balance with asset&#x3D;0 is your HEAT balance. This includes your virtual balance (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String account = "account_example"; // String | The account numeric id
String asset = "asset_example"; // String | Asset id, asset=0 is your HEAT balance
String propertiesAccountId = "propertiesAccountId_example"; // String | Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer
String propertiesProtocol = "propertiesProtocol_example"; // String | Asset properties protocol, a value of 0 means not to include asset properties in the result
try {
    AccountBalance result = apiInstance.balanceVirtual(account, asset, propertiesAccountId, propertiesProtocol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#balanceVirtual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| The account numeric id |
 **asset** | **String**| Asset id, asset&#x3D;0 is your HEAT balance |
 **propertiesAccountId** | **String**| Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer |
 **propertiesProtocol** | **String**| Asset properties protocol, a value of 0 means not to include asset properties in the result |

### Return type

[**AccountBalance**](AccountBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="balances"></a>
# **balances**
> List&lt;AccountBalance&gt; balances(account, propertiesAccountId, propertiesProtocol, from, to)

Returns account HEAT balance and all asset balances, balance with asset&#x3D;0 is your HEAT balance (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String account = "account_example"; // String | The account numeric id
String propertiesAccountId = "propertiesAccountId_example"; // String | Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer
String propertiesProtocol = "propertiesProtocol_example"; // String | Asset properties protocol, a value of 0 means not to include asset properties in the result
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<AccountBalance> result = apiInstance.balances(account, propertiesAccountId, propertiesProtocol, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#balances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| The account numeric id |
 **propertiesAccountId** | **String**| Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer |
 **propertiesProtocol** | **String**| Asset properties protocol, a value of 0 means not to include asset properties in the result |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;AccountBalance&gt;**](AccountBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findHash"></a>
# **findHash**
> Account findHash(hash)

Find account by numeric name hash

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String hash = "hash_example"; // String | Account name numeric hash
try {
    Account result = apiInstance.findHash(hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#findHash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **String**| Account name numeric hash |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPublickey"></a>
# **getPublickey**
> Value getPublickey(account)

Returns account publickey

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String account = "account_example"; // String | The account numeric id
try {
    Value result = apiInstance.getPublickey(account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getPublickey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| The account numeric id |

### Return type

[**Value**](Value.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="internetAddress"></a>
# **internetAddress**
> AccountInternetAddress internetAddress(account)

Returns account registered internet address (the host of node on which account is forging)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String account = "account_example"; // String | The account numeric id
try {
    AccountInternetAddress result = apiInstance.internetAddress(account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#internetAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| The account numeric id |

### Return type

[**AccountInternetAddress**](AccountInternetAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="list"></a>
# **list**
> List&lt;Account&gt; list(assigner, from, to)

List accounts with public name (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String assigner = "assigner_example"; // String | Account that assigned the name (pass 0 to include all assigners)
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Account> result = apiInstance.list(assigner, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assigner** | **String**| Account that assigned the name (pass 0 to include all assigners) |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Account&gt;**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="name"></a>
# **name**
> Account name(name)

Find account by name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String name = "name_example"; // String | The account name (UTF-8)
try {
    Account result = apiInstance.name(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#name");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The account name (UTF-8) |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="payments"></a>
# **payments**
> List&lt;Payment&gt; payments(account, currency, sort, asc, from, to)

Returns payments from and to an account, includes asset payments (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String account = "account_example"; // String | Account id to returns payments from and to from
String currency = "currency_example"; // String | Currency ID or pass 'all' to indicate all currencies
String sort = "sort_example"; // String | Sort on this property
String asc = "asc_example"; // String | Sort is ascending or descending
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Payment> result = apiInstance.payments(account, currency, sort, asc, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#payments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account id to returns payments from and to from |
 **currency** | **String**| Currency ID or pass &#x27;all&#x27; to indicate all currencies |
 **sort** | **String**| Sort on this property | [enum: timestamp, sender, recipient, amount]
 **asc** | **String**| Sort is ascending or descending | [enum: true, false]
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Payment&gt;**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentsCount"></a>
# **paymentsCount**
> Count paymentsCount(account, currency)

Returns payments count from and to an account, includes asset payments (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String account = "account_example"; // String | Account id to returns payments from and to from
String currency = "currency_example"; // String | Currency ID or pass 'all' to indicate all currencies
try {
    Count result = apiInstance.paymentsCount(account, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#paymentsCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account id to returns payments from and to from |
 **currency** | **String**| Currency ID or pass &#x27;all&#x27; to indicate all currencies |

### Return type

[**Count**](Count.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicKeyFind"></a>
# **publicKeyFind**
> Account publicKeyFind(publicKey)

Find account by public key

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String publicKey = "publicKey_example"; // String | The account public key in HEX format
try {
    Account result = apiInstance.publicKeyFind(publicKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#publicKeyFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **publicKey** | **String**| The account public key in HEX format |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="search"></a>
# **search**
> List&lt;Account&gt; search(assigner, query, from, to)

Search accounts with public name by name (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String assigner = "assigner_example"; // String | Account that assigned the name (pass 0 to include all assigners)
String query = "query_example"; // String | The account name (UTF-8)
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Account> result = apiInstance.search(assigner, query, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assigner** | **String**| Account that assigned the name (pass 0 to include all assigners) |
 **query** | **String**| The account name (UTF-8) |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Account&gt;**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="secretPhrase"></a>
# **secretPhrase**
> Account secretPhrase(secretPhrase)

Find account by secret phrase

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String secretPhrase = "secretPhrase_example"; // String | The account secret phrase
try {
    Account result = apiInstance.secretPhrase(secretPhrase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#secretPhrase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretPhrase** | **String**| The account secret phrase |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

