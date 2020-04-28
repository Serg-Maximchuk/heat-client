# OrderApi

All URIs are relative to *http://heatwallet.com:7734/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountAll**](OrderApi.md#accountAll) | **GET** order/account/all/{account}/{from}/{to} | Lists all orders for an account (requires replicator)
[**accountAllCount**](OrderApi.md#accountAllCount) | **GET** order/account/all/count/{account} | Counts all orders for an account (requires replicator)
[**accountAsks**](OrderApi.md#accountAsks) | **GET** order/account/asks/{account}/{from}/{to} | Lists all ask orders by account (requires replicator)
[**accountBids**](OrderApi.md#accountBids) | **GET** order/account/bids/{account}/{from}/{to} | Lists all bid orders by account (requires replicator)
[**accountPairAsks**](OrderApi.md#accountPairAsks) | **GET** order/account/pair/asks/{account}/{currency}/{asset}/{from}/{to} | Lists all ask orders by account and trading pair (requires replicator)
[**accountPairBids**](OrderApi.md#accountPairBids) | **GET** order/account/pair/bids/{account}/{currency}/{asset}/{from}/{to} | Lists all bid orders by account and trading pair (requires replicator)
[**ask**](OrderApi.md#ask) | **GET** order/ask/{order} | Finds an ask order by ID (requires replicator)
[**asks**](OrderApi.md#asks) | **GET** order/asks/{from}/{to} | Lists all ask orders (requires replicator)
[**bid**](OrderApi.md#bid) | **GET** order/bid/{order} | Finds an bid order by ID (requires replicator)
[**bids**](OrderApi.md#bids) | **GET** order/bids/{from}/{to} | Lists all bid orders (requires replicator)
[**cancelAsk**](OrderApi.md#cancelAsk) | **POST** order/cancel/ask | Cancel an existing ask asset order
[**cancelBid**](OrderApi.md#cancelBid) | **POST** order/cancel/bid | Cancel an existing bid asset order
[**orderAccountPair**](OrderApi.md#orderAccountPair) | **GET** order/account/pair/{account}/{currency}/{asset}/{from}/{to} | Lists all orders for an account (requires replicator)
[**orderAccountPairCount**](OrderApi.md#orderAccountPairCount) | **GET** order/account/pair/count/{account}/{currency}/{asset} | Counts all orders for an account with currency and asset (requires replicator)
[**pairAsks**](OrderApi.md#pairAsks) | **GET** order/pair/asks/{currency}/{asset}/{from}/{to} | Lists all ask orders by trading pair (requires replicator)
[**pairAsksCount**](OrderApi.md#pairAsksCount) | **GET** order/pair/asks/count/{currency}/{asset} | Counts all ask orders by trading pair
[**pairBids**](OrderApi.md#pairBids) | **GET** order/pair/bids/{currency}/{asset}/{from}/{to} | Lists all bid orders by trading pair
[**pairBidsCount**](OrderApi.md#pairBidsCount) | **GET** order/pair/bids/count/{currency}/{asset} | Counts all bid orders by trading pair
[**placeAsk**](OrderApi.md#placeAsk) | **POST** order/place/ask | Place an asset ask(sell) order
[**placeBid**](OrderApi.md#placeBid) | **POST** order/place/bid | Place an asset bid order

<a name="accountAll"></a>
# **accountAll**
> List&lt;Order&gt; accountAll(account, from, to)

Lists all orders for an account (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String account = "account_example"; // String | Account whose orders to list
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Order> result = apiInstance.accountAll(account, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#accountAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account whose orders to list |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountAllCount"></a>
# **accountAllCount**
> Count accountAllCount(account)

Counts all orders for an account (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String account = "account_example"; // String | Account whose orders to list
try {
    Count result = apiInstance.accountAllCount(account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#accountAllCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account whose orders to list |

### Return type

[**Count**](Count.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountAsks"></a>
# **accountAsks**
> List&lt;Order&gt; accountAsks(account, from, to)

Lists all ask orders by account (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String account = "account_example"; // String | Account whose orders to list
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Order> result = apiInstance.accountAsks(account, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#accountAsks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account whose orders to list |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountBids"></a>
# **accountBids**
> List&lt;Order&gt; accountBids(account, from, to)

Lists all bid orders by account (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String account = "account_example"; // String | Account whose orders to list
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Order> result = apiInstance.accountBids(account, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#accountBids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account whose orders to list |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountPairAsks"></a>
# **accountPairAsks**
> List&lt;Order&gt; accountPairAsks(account, currency, asset, from, to)

Lists all ask orders by account and trading pair (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String account = "account_example"; // String | Account whose orders to list
String currency = "currency_example"; // String | Currency ID (0 indicates HEAT, every other number indicates an asset)
String asset = "asset_example"; // String | Asset ID
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Order> result = apiInstance.accountPairAsks(account, currency, asset, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#accountPairAsks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account whose orders to list |
 **currency** | **String**| Currency ID (0 indicates HEAT, every other number indicates an asset) |
 **asset** | **String**| Asset ID |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountPairBids"></a>
# **accountPairBids**
> List&lt;Order&gt; accountPairBids(account, currency, asset, from, to)

Lists all bid orders by account and trading pair (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String account = "account_example"; // String | Account whose orders to list
String currency = "currency_example"; // String | Currency ID (0 indicates HEAT, every other number indicates an asset)
String asset = "asset_example"; // String | Asset ID
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Order> result = apiInstance.accountPairBids(account, currency, asset, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#accountPairBids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account whose orders to list |
 **currency** | **String**| Currency ID (0 indicates HEAT, every other number indicates an asset) |
 **asset** | **String**| Asset ID |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ask"></a>
# **ask**
> Order ask(order)

Finds an ask order by ID (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String order = "order_example"; // String | Ask order numeric id
try {
    Order result = apiInstance.ask(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#ask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | **String**| Ask order numeric id |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="asks"></a>
# **asks**
> List&lt;Order&gt; asks(from, to)

Lists all ask orders (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Order> result = apiInstance.asks(from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#asks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bid"></a>
# **bid**
> Order bid(order)

Finds an bid order by ID (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String order = "order_example"; // String | Bid order numeric id
try {
    Order result = apiInstance.bid(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#bid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | **String**| Bid order numeric id |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bids"></a>
# **bids**
> List&lt;Order&gt; bids(from, to)

Lists all bid orders (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Order> result = apiInstance.bids(from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#bids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelAsk"></a>
# **cancelAsk**
> TransactionCreate cancelAsk(order, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement)

Cancel an existing ask asset order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String order = "order_example"; // String | 
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
    TransactionCreate result = apiInstance.cancelAsk(order, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#cancelAsk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | **String**|  |
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

<a name="cancelBid"></a>
# **cancelBid**
> TransactionCreate cancelBid(order, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement)

Cancel an existing bid asset order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String order = "order_example"; // String | 
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
    TransactionCreate result = apiInstance.cancelBid(order, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#cancelBid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | **String**|  |
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

<a name="orderAccountPair"></a>
# **orderAccountPair**
> List&lt;Order&gt; orderAccountPair(account, currency, asset, from, to)

Lists all orders for an account (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String account = "account_example"; // String | Account whose orders to list
String currency = "currency_example"; // String | Currency ID (0 indicates HEAT, every other number indicates an asset)
String asset = "asset_example"; // String | Asset ID
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Order> result = apiInstance.orderAccountPair(account, currency, asset, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderAccountPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account whose orders to list |
 **currency** | **String**| Currency ID (0 indicates HEAT, every other number indicates an asset) |
 **asset** | **String**| Asset ID |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderAccountPairCount"></a>
# **orderAccountPairCount**
> List&lt;Order&gt; orderAccountPairCount(account, currency, asset)

Counts all orders for an account with currency and asset (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String account = "account_example"; // String | Account whose orders to list
String currency = "currency_example"; // String | Currency ID (0 indicates HEAT, every other number indicates an asset)
String asset = "asset_example"; // String | Asset ID
try {
    List<Order> result = apiInstance.orderAccountPairCount(account, currency, asset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderAccountPairCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account whose orders to list |
 **currency** | **String**| Currency ID (0 indicates HEAT, every other number indicates an asset) |
 **asset** | **String**| Asset ID |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pairAsks"></a>
# **pairAsks**
> List&lt;Order&gt; pairAsks(currency, asset, from, to)

Lists all ask orders by trading pair (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String currency = "currency_example"; // String | Currency ID (0 indicates HEAT, every other number indicates an asset)
String asset = "asset_example"; // String | Asset ID
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Order> result = apiInstance.pairAsks(currency, asset, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#pairAsks");
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

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pairAsksCount"></a>
# **pairAsksCount**
> List&lt;Order&gt; pairAsksCount(currency, asset)

Counts all ask orders by trading pair

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String currency = "currency_example"; // String | Currency ID (0 indicates HEAT, every other number indicates an asset)
String asset = "asset_example"; // String | Asset ID
try {
    List<Order> result = apiInstance.pairAsksCount(currency, asset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#pairAsksCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency ID (0 indicates HEAT, every other number indicates an asset) |
 **asset** | **String**| Asset ID |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pairBids"></a>
# **pairBids**
> List&lt;Order&gt; pairBids(currency, asset, from, to)

Lists all bid orders by trading pair

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String currency = "currency_example"; // String | Currency ID (0 indicates HEAT, every other number indicates an asset)
String asset = "asset_example"; // String | Asset ID
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Order> result = apiInstance.pairBids(currency, asset, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#pairBids");
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

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pairBidsCount"></a>
# **pairBidsCount**
> List&lt;Order&gt; pairBidsCount(currency, asset)

Counts all bid orders by trading pair

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String currency = "currency_example"; // String | Currency ID (0 indicates HEAT, every other number indicates an asset)
String asset = "asset_example"; // String | Asset ID
try {
    List<Order> result = apiInstance.pairBidsCount(currency, asset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#pairBidsCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency ID (0 indicates HEAT, every other number indicates an asset) |
 **asset** | **String**| Asset ID |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="placeAsk"></a>
# **placeAsk**
> TransactionCreate placeAsk(currency, asset, quantity, price, expiration, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement)

Place an asset ask(sell) order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String currency = "currency_example"; // String | 
String asset = "asset_example"; // String | 
String quantity = "quantity_example"; // String | 
String price = "price_example"; // String | 
String expiration = "expiration_example"; // String | 
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
    TransactionCreate result = apiInstance.placeAsk(currency, asset, quantity, price, expiration, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#placeAsk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  |
 **asset** | **String**|  |
 **quantity** | **String**|  |
 **price** | **String**|  |
 **expiration** | **String**|  |
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

<a name="placeBid"></a>
# **placeBid**
> TransactionCreate placeBid(currency, asset, quantity, price, expiration, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement)

Place an asset bid order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String currency = "currency_example"; // String | 
String asset = "asset_example"; // String | 
String quantity = "quantity_example"; // String | 
String price = "price_example"; // String | 
String expiration = "expiration_example"; // String | 
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
    TransactionCreate result = apiInstance.placeBid(currency, asset, quantity, price, expiration, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#placeBid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  |
 **asset** | **String**|  |
 **quantity** | **String**|  |
 **price** | **String**|  |
 **expiration** | **String**|  |
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

