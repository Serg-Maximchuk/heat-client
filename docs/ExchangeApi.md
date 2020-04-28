# ExchangeApi

All URIs are relative to *http://heatwallet.com:7734/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetBalances**](ExchangeApi.md#assetBalances) | **GET** exchange/asset/accounts/{asset}/{from}/{to} | Returns asset balances (requires replicator)
[**assetCertification**](ExchangeApi.md#assetCertification) | **GET** exchange/asset/certification/{asset}/{certifierAccount} | Returns asset certification info (requires replicator)
[**assetCertify**](ExchangeApi.md#assetCertify) | **POST** exchange/asset/certification | Sets asset certification info (requires replicator)
[**assetProperties**](ExchangeApi.md#assetProperties) | **POST** exchange/asset/properties | Sets the asset properties for the given protocol (requires replicator)
[**assetProperties_0**](ExchangeApi.md#assetProperties_0) | **GET** exchange/asset/properties/{asset}/{propertiesAccount}/{propertiesProtocol} | Find asset properties by numeric id, properties account and protocol (requires replicator)
[**assetProtocol1**](ExchangeApi.md#assetProtocol1) | **GET** exchange/asset/protocol1/{symbol} | Finds protocol 1 asset by symbol (requires replicator)
[**assetsProtocol1**](ExchangeApi.md#assetsProtocol1) | **GET** exchange/assets/protocol1/{from}/{to} | Lists all protocol 1 assets (requires replicator)
[**chartdata**](ExchangeApi.md#chartdata) | **GET** exchange/chartdata/{currency}/{asset}/{window} | Retrieves OHLC chart data for trading pair (requires replicator)
[**issue**](ExchangeApi.md#issue) | **POST** exchange/asset/issue | Create an asset on the exchange
[**issueMore**](ExchangeApi.md#issueMore) | **POST** exchange/asset/issuemore | Issue extra assets, assign those extra assets to transaction recipient
[**market**](ExchangeApi.md#market) | **GET** exchange/market/{currency}/{asset}/{propertiesAccountId}/{propertiesProtocol} | Finds a market for a currency and asset (requires replicator)
[**markets**](ExchangeApi.md#markets) | **GET** exchange/markets/{currency}/{sort}/{asc}/{propertiesAccountId}/{propertiesProtocol}/{from}/{to} | Lists all markets for a currency (requires replicator)
[**marketsAll**](ExchangeApi.md#marketsAll) | **GET** exchange/markets/all/{sort}/{asc}/{propertiesAccountId}/{propertiesProtocol}/{from}/{to} | Lists all markets (requires replicator)
[**transfer**](ExchangeApi.md#transfer) | **POST** exchange/transfer | Transfer a quantity of an asset from one account to another

<a name="assetBalances"></a>
# **assetBalances**
> List&lt;AccountAsset&gt; assetBalances(asset, from, to)

Returns asset balances (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String asset = "asset_example"; // String | The asset numeric id
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<AccountAsset> result = apiInstance.assetBalances(asset, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#assetBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | **String**| The asset numeric id |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;AccountAsset&gt;**](AccountAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assetCertification"></a>
# **assetCertification**
> JSONAssetCertification assetCertification(asset, certifierAccount)

Returns asset certification info (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String asset = "asset_example"; // String | 
String certifierAccount = "certifierAccount_example"; // String | 
try {
    JSONAssetCertification result = apiInstance.assetCertification(asset, certifierAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#assetCertification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | **String**|  |
 **certifierAccount** | **String**|  |

### Return type

[**JSONAssetCertification**](JSONAssetCertification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assetCertify"></a>
# **assetCertify**
> TransactionCreate assetCertify(asset, certified, symbol, name, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature)

Sets asset certification info (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String asset = "asset_example"; // String | 
String certified = "certified_example"; // String | 
String symbol = "symbol_example"; // String | 
String name = "name_example"; // String | 
String fee = "fee_example"; // String | 
String deadline = "deadline_example"; // String | 
String secretPhrase = "secretPhrase_example"; // String | 
String publicKey = "publicKey_example"; // String | 
String recipient = "recipient_example"; // String | 
String recipientPublicKey = "recipientPublicKey_example"; // String | 
String broadcast = "broadcast_example"; // String | 
String privateNameAnnouncement = "privateNameAnnouncement_example"; // String | 
String publicNameAnnouncement = "publicNameAnnouncement_example"; // String | 
String message = "message_example"; // String | 
String messageIsText = "messageIsText_example"; // String | 
String messageToEncrypt = "messageToEncrypt_example"; // String | 
String messageToEncryptIsText = "messageToEncryptIsText_example"; // String | 
String encryptedMessageData = "encryptedMessageData_example"; // String | 
String encryptedMessageNonce = "encryptedMessageNonce_example"; // String | 
String messageToEncryptToSelf = "messageToEncryptToSelf_example"; // String | 
String messageToEncryptToSelfIsText = "messageToEncryptToSelfIsText_example"; // String | 
String encryptToSelfMessageData = "encryptToSelfMessageData_example"; // String | 
String encryptToSelfMessageNonce = "encryptToSelfMessageNonce_example"; // String | 
String privateNameAssignment = "privateNameAssignment_example"; // String | 
String privateNameAssignmentSignature = "privateNameAssignmentSignature_example"; // String | 
String publicNameAssignment = "publicNameAssignment_example"; // String | 
String publicNameAssignmentSignature = "publicNameAssignmentSignature_example"; // String | 
try {
    TransactionCreate result = apiInstance.assetCertify(asset, certified, symbol, name, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#assetCertify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | **String**|  |
 **certified** | **String**|  | [enum: true, false]
 **symbol** | **String**|  |
 **name** | **String**|  |
 **fee** | **String**|  |
 **deadline** | **String**|  |
 **secretPhrase** | **String**|  |
 **publicKey** | **String**|  |
 **recipient** | **String**|  |
 **recipientPublicKey** | **String**|  |
 **broadcast** | **String**|  | [enum: true, false]
 **privateNameAnnouncement** | **String**|  |
 **publicNameAnnouncement** | **String**|  |
 **message** | **String**|  |
 **messageIsText** | **String**|  | [enum: true, false]
 **messageToEncrypt** | **String**|  |
 **messageToEncryptIsText** | **String**|  | [enum: true, false]
 **encryptedMessageData** | **String**|  |
 **encryptedMessageNonce** | **String**|  |
 **messageToEncryptToSelf** | **String**|  |
 **messageToEncryptToSelfIsText** | **String**|  | [enum: true, false]
 **encryptToSelfMessageData** | **String**|  |
 **encryptToSelfMessageNonce** | **String**|  |
 **privateNameAssignment** | **String**|  |
 **privateNameAssignmentSignature** | **String**|  |
 **publicNameAssignment** | **String**|  |
 **publicNameAssignmentSignature** | **String**|  |

### Return type

[**TransactionCreate**](TransactionCreate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="assetProperties"></a>
# **assetProperties**
> TransactionCreate assetProperties(asset, protocol, value, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature)

Sets the asset properties for the given protocol (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String asset = "asset_example"; // String | 
String protocol = "protocol_example"; // String | 
String value = "value_example"; // String | 
String fee = "fee_example"; // String | 
String deadline = "deadline_example"; // String | 
String secretPhrase = "secretPhrase_example"; // String | 
String publicKey = "publicKey_example"; // String | 
String recipient = "recipient_example"; // String | 
String recipientPublicKey = "recipientPublicKey_example"; // String | 
String broadcast = "broadcast_example"; // String | 
String privateNameAnnouncement = "privateNameAnnouncement_example"; // String | 
String publicNameAnnouncement = "publicNameAnnouncement_example"; // String | 
String message = "message_example"; // String | 
String messageIsText = "messageIsText_example"; // String | 
String messageToEncrypt = "messageToEncrypt_example"; // String | 
String messageToEncryptIsText = "messageToEncryptIsText_example"; // String | 
String encryptedMessageData = "encryptedMessageData_example"; // String | 
String encryptedMessageNonce = "encryptedMessageNonce_example"; // String | 
String messageToEncryptToSelf = "messageToEncryptToSelf_example"; // String | 
String messageToEncryptToSelfIsText = "messageToEncryptToSelfIsText_example"; // String | 
String encryptToSelfMessageData = "encryptToSelfMessageData_example"; // String | 
String encryptToSelfMessageNonce = "encryptToSelfMessageNonce_example"; // String | 
String privateNameAssignment = "privateNameAssignment_example"; // String | 
String privateNameAssignmentSignature = "privateNameAssignmentSignature_example"; // String | 
String publicNameAssignment = "publicNameAssignment_example"; // String | 
String publicNameAssignmentSignature = "publicNameAssignmentSignature_example"; // String | 
try {
    TransactionCreate result = apiInstance.assetProperties(asset, protocol, value, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#assetProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | **String**|  |
 **protocol** | **String**|  |
 **value** | **String**|  |
 **fee** | **String**|  |
 **deadline** | **String**|  |
 **secretPhrase** | **String**|  |
 **publicKey** | **String**|  |
 **recipient** | **String**|  |
 **recipientPublicKey** | **String**|  |
 **broadcast** | **String**|  | [enum: true, false]
 **privateNameAnnouncement** | **String**|  |
 **publicNameAnnouncement** | **String**|  |
 **message** | **String**|  |
 **messageIsText** | **String**|  | [enum: true, false]
 **messageToEncrypt** | **String**|  |
 **messageToEncryptIsText** | **String**|  | [enum: true, false]
 **encryptedMessageData** | **String**|  |
 **encryptedMessageNonce** | **String**|  |
 **messageToEncryptToSelf** | **String**|  |
 **messageToEncryptToSelfIsText** | **String**|  | [enum: true, false]
 **encryptToSelfMessageData** | **String**|  |
 **encryptToSelfMessageNonce** | **String**|  |
 **privateNameAssignment** | **String**|  |
 **privateNameAssignmentSignature** | **String**|  |
 **publicNameAssignment** | **String**|  |
 **publicNameAssignmentSignature** | **String**|  |

### Return type

[**TransactionCreate**](TransactionCreate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="assetProperties_0"></a>
# **assetProperties_0**
> AssetProperties assetProperties_0(asset, propertiesAccount, propertiesProtocol)

Find asset properties by numeric id, properties account and protocol (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String asset = "asset_example"; // String | 
String propertiesAccount = "propertiesAccount_example"; // String | Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer
String propertiesProtocol = "propertiesProtocol_example"; // String | Asset properties protocol, a value of 0 means not to include asset properties in the result
try {
    AssetProperties result = apiInstance.assetProperties_0(asset, propertiesAccount, propertiesProtocol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#assetProperties_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | **String**|  |
 **propertiesAccount** | **String**| Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer |
 **propertiesProtocol** | **String**| Asset properties protocol, a value of 0 means not to include asset properties in the result |

### Return type

[**AssetProperties**](AssetProperties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assetProtocol1"></a>
# **assetProtocol1**
> JSONAssetProtocol1 assetProtocol1(symbol)

Finds protocol 1 asset by symbol (requires replicator)

Protocol 1 assets enforce unique symbol names

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String symbol = "symbol_example"; // String | Asset symbol
try {
    JSONAssetProtocol1 result = apiInstance.assetProtocol1(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#assetProtocol1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Asset symbol |

### Return type

[**JSONAssetProtocol1**](JSONAssetProtocol1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assetsProtocol1"></a>
# **assetsProtocol1**
> List&lt;JSONAssetProtocol1&gt; assetsProtocol1(from, to)

Lists all protocol 1 assets (requires replicator)

Protocol 1 assets enforce unique symbol names

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<JSONAssetProtocol1> result = apiInstance.assetsProtocol1(from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#assetsProtocol1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;JSONAssetProtocol1&gt;**](JSONAssetProtocol1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chartdata"></a>
# **chartdata**
> ChartData chartdata(currency, asset, window)

Retrieves OHLC chart data for trading pair (requires replicator)

Chartdata entries in the &#x27;data&#x27; property are arrays with indexed properties.&lt;br&gt;[&lt;br&gt;&amp;nbsp;&amp;nbsp;timestamp, // number timestamp in HEAT epoch format&lt;br&gt;&amp;nbsp;&amp;nbsp;avg,       // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsp;&amp;nbsp;low,       // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsp;&amp;nbsp;high,      // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsp;&amp;nbsp;vol,       // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsp;&amp;nbsp;open,      // string or number if &lt; 9007199254740991&lt;br&gt;&amp;nbsps;&amp;nbsp;close     // string or number if &lt; 9007199254740991&lt;br&gt;]

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String currency = "currency_example"; // String | Currency ID (0 indicates HEAT, every other number indicates an asset)
String asset = "asset_example"; // String | Asset ID
String window = "window_example"; // String | Charting interval window
try {
    ChartData result = apiInstance.chartdata(currency, asset, window);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#chartdata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency ID (0 indicates HEAT, every other number indicates an asset) |
 **asset** | **String**| Asset ID |
 **window** | **String**| Charting interval window | [enum: ONE_MINUTE, FIVE_MINUTES, TEN_MINUTES, HOUR, DAY, WEEK]

### Return type

[**ChartData**](ChartData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="issue"></a>
# **issue**
> TransactionCreate issue(quantity, decimals, descriptionUrl, descriptionHash, dillutable, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement)

Create an asset on the exchange

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String quantity = "quantity_example"; // String | 
String decimals = "decimals_example"; // String | 
String descriptionUrl = "descriptionUrl_example"; // String | 
String descriptionHash = "descriptionHash_example"; // String | 
String dillutable = "dillutable_example"; // String | 
String fee = "fee_example"; // String | 
String deadline = "deadline_example"; // String | 
String secretPhrase = "secretPhrase_example"; // String | 
String publicKey = "publicKey_example"; // String | 
String recipient = "recipient_example"; // String | 
String recipientPublicKey = "recipientPublicKey_example"; // String | 
String broadcast = "broadcast_example"; // String | 
String privateNameAnnouncement = "privateNameAnnouncement_example"; // String | 
String publicNameAnnouncement = "publicNameAnnouncement_example"; // String | 
try {
    TransactionCreate result = apiInstance.issue(quantity, decimals, descriptionUrl, descriptionHash, dillutable, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#issue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quantity** | **String**|  |
 **decimals** | **String**|  |
 **descriptionUrl** | **String**|  |
 **descriptionHash** | **String**|  |
 **dillutable** | **String**|  | [enum: true, false]
 **fee** | **String**|  |
 **deadline** | **String**|  |
 **secretPhrase** | **String**|  |
 **publicKey** | **String**|  |
 **recipient** | **String**|  |
 **recipientPublicKey** | **String**|  |
 **broadcast** | **String**|  | [enum: true, false]
 **privateNameAnnouncement** | **String**|  |
 **publicNameAnnouncement** | **String**|  |

### Return type

[**TransactionCreate**](TransactionCreate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="issueMore"></a>
# **issueMore**
> TransactionCreate issueMore(asset, quantity, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement)

Issue extra assets, assign those extra assets to transaction recipient

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String asset = "asset_example"; // String | 
String quantity = "quantity_example"; // String | 
String fee = "fee_example"; // String | 
String deadline = "deadline_example"; // String | 
String secretPhrase = "secretPhrase_example"; // String | 
String publicKey = "publicKey_example"; // String | 
String recipient = "recipient_example"; // String | 
String recipientPublicKey = "recipientPublicKey_example"; // String | 
String broadcast = "broadcast_example"; // String | 
String privateNameAnnouncement = "privateNameAnnouncement_example"; // String | 
String publicNameAnnouncement = "publicNameAnnouncement_example"; // String | 
try {
    TransactionCreate result = apiInstance.issueMore(asset, quantity, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#issueMore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | **String**|  |
 **quantity** | **String**|  |
 **fee** | **String**|  |
 **deadline** | **String**|  |
 **secretPhrase** | **String**|  |
 **publicKey** | **String**|  |
 **recipient** | **String**|  |
 **recipientPublicKey** | **String**|  |
 **broadcast** | **String**|  | [enum: true, false]
 **privateNameAnnouncement** | **String**|  |
 **publicNameAnnouncement** | **String**|  |

### Return type

[**TransactionCreate**](TransactionCreate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="market"></a>
# **market**
> List&lt;Market&gt; market(currency, asset, propertiesAccountId, propertiesProtocol)

Finds a market for a currency and asset (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String currency = "currency_example"; // String | Currency ID
String asset = "asset_example"; // String | Asset ID
String propertiesAccountId = "propertiesAccountId_example"; // String | Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer
String propertiesProtocol = "propertiesProtocol_example"; // String | Asset properties protocol, a value of 0 means not to include asset properties in the result
try {
    List<Market> result = apiInstance.market(currency, asset, propertiesAccountId, propertiesProtocol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#market");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency ID |
 **asset** | **String**| Asset ID |
 **propertiesAccountId** | **String**| Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer |
 **propertiesProtocol** | **String**| Asset properties protocol, a value of 0 means not to include asset properties in the result |

### Return type

[**List&lt;Market&gt;**](Market.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="markets"></a>
# **markets**
> List&lt;Market&gt; markets(currency, sort, asc, propertiesAccountId, propertiesProtocol, from, to)

Lists all markets for a currency (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String currency = "currency_example"; // String | Currency
String sort = "sort_example"; // String | Sort order, sort is either by 24hr percentage change (default), 24hr volume, price or none (database natural order)
String asc = "asc_example"; // String | Sort ascending
String propertiesAccountId = "propertiesAccountId_example"; // String | Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer
String propertiesProtocol = "propertiesProtocol_example"; // String | Asset properties protocol, a value of 0 means not to include asset properties in the result
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Market> result = apiInstance.markets(currency, sort, asc, propertiesAccountId, propertiesProtocol, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#markets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency |
 **sort** | **String**| Sort order, sort is either by 24hr percentage change (default), 24hr volume, price or none (database natural order) | [enum: change, volume, price, none]
 **asc** | **String**| Sort ascending | [enum: true, false]
 **propertiesAccountId** | **String**| Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer |
 **propertiesProtocol** | **String**| Asset properties protocol, a value of 0 means not to include asset properties in the result |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Market&gt;**](Market.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="marketsAll"></a>
# **marketsAll**
> List&lt;Market&gt; marketsAll(sort, asc, propertiesAccountId, propertiesProtocol, from, to)

Lists all markets (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String sort = "sort_example"; // String | Sort order, sort is either by 24hr percentage change (default), 24hr volume, price or none (database natural order)
String asc = "asc_example"; // String | Sort ascending
String propertiesAccountId = "propertiesAccountId_example"; // String | Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer
String propertiesProtocol = "propertiesProtocol_example"; // String | Asset properties protocol, a value of 0 means not to include asset properties in the result
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Market> result = apiInstance.marketsAll(sort, asc, propertiesAccountId, propertiesProtocol, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#marketsAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Sort order, sort is either by 24hr percentage change (default), 24hr volume, price or none (database natural order) | [enum: change, volume, price, none]
 **asc** | **String**| Sort ascending | [enum: true, false]
 **propertiesAccountId** | **String**| Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer |
 **propertiesProtocol** | **String**| Asset properties protocol, a value of 0 means not to include asset properties in the result |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Market&gt;**](Market.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="transfer"></a>
# **transfer**
> TransactionCreate transfer(asset, quantity, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature)

Transfer a quantity of an asset from one account to another

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String asset = "asset_example"; // String | 
String quantity = "quantity_example"; // String | 
String fee = "fee_example"; // String | 
String deadline = "deadline_example"; // String | 
String secretPhrase = "secretPhrase_example"; // String | 
String publicKey = "publicKey_example"; // String | 
String recipient = "recipient_example"; // String | 
String recipientPublicKey = "recipientPublicKey_example"; // String | 
String broadcast = "broadcast_example"; // String | 
String privateNameAnnouncement = "privateNameAnnouncement_example"; // String | 
String publicNameAnnouncement = "publicNameAnnouncement_example"; // String | 
String message = "message_example"; // String | 
String messageIsText = "messageIsText_example"; // String | 
String messageToEncrypt = "messageToEncrypt_example"; // String | 
String messageToEncryptIsText = "messageToEncryptIsText_example"; // String | 
String encryptedMessageData = "encryptedMessageData_example"; // String | 
String encryptedMessageNonce = "encryptedMessageNonce_example"; // String | 
String messageToEncryptToSelf = "messageToEncryptToSelf_example"; // String | 
String messageToEncryptToSelfIsText = "messageToEncryptToSelfIsText_example"; // String | 
String encryptToSelfMessageData = "encryptToSelfMessageData_example"; // String | 
String encryptToSelfMessageNonce = "encryptToSelfMessageNonce_example"; // String | 
String privateNameAssignment = "privateNameAssignment_example"; // String | 
String privateNameAssignmentSignature = "privateNameAssignmentSignature_example"; // String | 
String publicNameAssignment = "publicNameAssignment_example"; // String | 
String publicNameAssignmentSignature = "publicNameAssignmentSignature_example"; // String | 
try {
    TransactionCreate result = apiInstance.transfer(asset, quantity, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#transfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | **String**|  |
 **quantity** | **String**|  |
 **fee** | **String**|  |
 **deadline** | **String**|  |
 **secretPhrase** | **String**|  |
 **publicKey** | **String**|  |
 **recipient** | **String**|  |
 **recipientPublicKey** | **String**|  |
 **broadcast** | **String**|  | [enum: true, false]
 **privateNameAnnouncement** | **String**|  |
 **publicNameAnnouncement** | **String**|  |
 **message** | **String**|  |
 **messageIsText** | **String**|  | [enum: true, false]
 **messageToEncrypt** | **String**|  |
 **messageToEncryptIsText** | **String**|  | [enum: true, false]
 **encryptedMessageData** | **String**|  |
 **encryptedMessageNonce** | **String**|  |
 **messageToEncryptToSelf** | **String**|  |
 **messageToEncryptToSelfIsText** | **String**|  | [enum: true, false]
 **encryptToSelfMessageData** | **String**|  |
 **encryptToSelfMessageNonce** | **String**|  |
 **privateNameAssignment** | **String**|  |
 **privateNameAssignmentSignature** | **String**|  |
 **publicNameAssignment** | **String**|  |
 **publicNameAssignmentSignature** | **String**|  |

### Return type

[**TransactionCreate**](TransactionCreate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

