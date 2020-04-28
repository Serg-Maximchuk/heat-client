# TradeApi

All URIs are relative to *http://heatwallet.com:7734/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountCount**](TradeApi.md#accountCount) | **GET** trade/account/count/{account} | Counts all trades for an account (requires replicator)
[**accountTrades**](TradeApi.md#accountTrades) | **GET** trade/account/{account}/{propertiesAccount}/{propertiesProtocol}/{from}/{to} | Lists all trades for an account (requires replicator)
[**all**](TradeApi.md#all) | **GET** trade/all/{from}/{to} | Lists all trades for all trading pairs (requires replicator)
[**askTrades**](TradeApi.md#askTrades) | **GET** trade/ask/{order}/{from}/{to} | Lists trades for an ask order (requires replicator)
[**askTradesCount**](TradeApi.md#askTradesCount) | **GET** trade/ask/count/{order} | Counts trades for an asset order (requires replicator)
[**bidTrades**](TradeApi.md#bidTrades) | **GET** trade/bid/{order}/{from}/{to} | Lists trades for an bid order (requires replicator)
[**bidTradesCount**](TradeApi.md#bidTradesCount) | **GET** trade/bid/count/{order} | Counts trades for an asset order (requires replicator)
[**trade**](TradeApi.md#trade) | **GET** trade/{ask}/{bid} | Find trade by ask order id and bid order id (requires replicator)
[**tradeAccountPair**](TradeApi.md#tradeAccountPair) | **GET** trade/account/pair/{account}/{currency}/{asset}/{from}/{to} | Lists account trades for a trading pair (requires replicator)
[**tradeAccountPairCount**](TradeApi.md#tradeAccountPairCount) | **GET** trade/account/pair/count/{account}/{currency}/{asset} | Counts account trades for a trading pair (requires replicator)
[**tradeCount**](TradeApi.md#tradeCount) | **GET** trade/count/{currency}/{asset} | Counts all trades for a trading pair (requires replicator)
[**trades**](TradeApi.md#trades) | **GET** trade/{currency}/{asset}/{from}/{to} | Lists all trades for a trading pair (requires replicator)

<a name="accountCount"></a>
# **accountCount**
> Count accountCount(account)

Counts all trades for an account (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String account = "account_example"; // String | Account whose trades to list
try {
    Count result = apiInstance.accountCount(account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#accountCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account whose trades to list |

### Return type

[**Count**](Count.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountTrades"></a>
# **accountTrades**
> List&lt;Trade&gt; accountTrades(account, propertiesAccount, propertiesProtocol, from, to)

Lists all trades for an account (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String account = "account_example"; // String | Account whose trades to list
String propertiesAccount = "propertiesAccount_example"; // String | Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer
String propertiesProtocol = "propertiesProtocol_example"; // String | Asset properties protocol, a value of 0 means not to include asset properties in the result
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Trade> result = apiInstance.accountTrades(account, propertiesAccount, propertiesProtocol, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#accountTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account whose trades to list |
 **propertiesAccount** | **String**| Asset properties account id determines whose asset properties you want included in the result, a value of 0 means the asset issuer |
 **propertiesProtocol** | **String**| Asset properties protocol, a value of 0 means not to include asset properties in the result |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Trade&gt;**](Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="all"></a>
# **all**
> List&lt;Trade&gt; all(from, to)

Lists all trades for all trading pairs (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Trade> result = apiInstance.all(from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#all");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Trade&gt;**](Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="askTrades"></a>
# **askTrades**
> List&lt;Trade&gt; askTrades(order, from, to)

Lists trades for an ask order (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String order = "order_example"; // String | Ask order ID
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Trade> result = apiInstance.askTrades(order, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#askTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | **String**| Ask order ID |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Trade&gt;**](Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="askTradesCount"></a>
# **askTradesCount**
> Count askTradesCount(order)

Counts trades for an asset order (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String order = "order_example"; // String | Ask order ID
try {
    Count result = apiInstance.askTradesCount(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#askTradesCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | **String**| Ask order ID |

### Return type

[**Count**](Count.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bidTrades"></a>
# **bidTrades**
> List&lt;Trade&gt; bidTrades(order, from, to)

Lists trades for an bid order (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String order = "order_example"; // String | Bid order ID
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Trade> result = apiInstance.bidTrades(order, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#bidTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | **String**| Bid order ID |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Trade&gt;**](Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bidTradesCount"></a>
# **bidTradesCount**
> Count bidTradesCount(order)

Counts trades for an asset order (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String order = "order_example"; // String | Bid order ID
try {
    Count result = apiInstance.bidTradesCount(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#bidTradesCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | **String**| Bid order ID |

### Return type

[**Count**](Count.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="trade"></a>
# **trade**
> Trade trade(ask, bid)

Find trade by ask order id and bid order id (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String ask = "ask_example"; // String | Ask order numeric id
String bid = "bid_example"; // String | Bid order numeric id
try {
    Trade result = apiInstance.trade(ask, bid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#trade");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ask** | **String**| Ask order numeric id |
 **bid** | **String**| Bid order numeric id |

### Return type

[**Trade**](Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tradeAccountPair"></a>
# **tradeAccountPair**
> List&lt;Trade&gt; tradeAccountPair(account, currency, asset, from, to)

Lists account trades for a trading pair (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String account = "account_example"; // String | Account whose trades to list
String currency = "currency_example"; // String | Currency ID (0 indicates HEAT, every other number indicates an asset)
String asset = "asset_example"; // String | Asset ID
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Trade> result = apiInstance.tradeAccountPair(account, currency, asset, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#tradeAccountPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account whose trades to list |
 **currency** | **String**| Currency ID (0 indicates HEAT, every other number indicates an asset) |
 **asset** | **String**| Asset ID |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Trade&gt;**](Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tradeAccountPairCount"></a>
# **tradeAccountPairCount**
> Count tradeAccountPairCount(account, currency, asset)

Counts account trades for a trading pair (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String account = "account_example"; // String | Account whose trades to list
String currency = "currency_example"; // String | Currency ID (0 indicates HEAT, every other number indicates an asset)
String asset = "asset_example"; // String | Asset ID
try {
    Count result = apiInstance.tradeAccountPairCount(account, currency, asset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#tradeAccountPairCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account whose trades to list |
 **currency** | **String**| Currency ID (0 indicates HEAT, every other number indicates an asset) |
 **asset** | **String**| Asset ID |

### Return type

[**Count**](Count.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tradeCount"></a>
# **tradeCount**
> Count tradeCount(currency, asset)

Counts all trades for a trading pair (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String currency = "currency_example"; // String | Currency ID (0 indicates HEAT, every other number indicates an asset)
String asset = "asset_example"; // String | Asset ID
try {
    Count result = apiInstance.tradeCount(currency, asset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#tradeCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency ID (0 indicates HEAT, every other number indicates an asset) |
 **asset** | **String**| Asset ID |

### Return type

[**Count**](Count.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="trades"></a>
# **trades**
> List&lt;Trade&gt; trades(currency, asset, from, to)

Lists all trades for a trading pair (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String currency = "currency_example"; // String | Currency ID (0 indicates HEAT, every other number indicates an asset)
String asset = "asset_example"; // String | Asset ID
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Trade> result = apiInstance.trades(currency, asset, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#trades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency ID (0 indicates HEAT, every other number indicates an asset) |
 **asset** | **String**| Asset ID |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Trade&gt;**](Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

