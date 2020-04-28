# PeersApi

All URIs are relative to *http://heatwallet.com:7734/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewPeer**](PeersApi.md#addNewPeer) | **GET** peer/add/{address} | Add a peer to the list of known peers and attempt to connect to it
[**allPeers**](PeersApi.md#allPeers) | **GET** peer/all/{state} | Get all peers
[**blacklist**](PeersApi.md#blacklist) | **GET** peer/blacklist/{address} | Blacklist a peer for the default blacklisting period
[**peer**](PeersApi.md#peer) | **GET** peer/get/{address} | Get information about a given peer

<a name="addNewPeer"></a>
# **addNewPeer**
> Peer addNewPeer(address)

Add a peer to the list of known peers and attempt to connect to it

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PeersApi apiInstance = new PeersApi();
String address = "address_example"; // String | IP address or domain name of the peer (plus optional port)
try {
    Peer result = apiInstance.addNewPeer(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeersApi#addNewPeer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| IP address or domain name of the peer (plus optional port) |

### Return type

[**Peer**](Peer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allPeers"></a>
# **allPeers**
> List&lt;Peer&gt; allPeers(state)

Get all peers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PeersApi apiInstance = new PeersApi();
String state = "state_example"; // String | If provided filters on peer state, 0 for NON_CONNECTED, 1 for CONNECTED, 2 for DISCONNECTED or 3 for ALL
try {
    List<Peer> result = apiInstance.allPeers(state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeersApi#allPeers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| If provided filters on peer state, 0 for NON_CONNECTED, 1 for CONNECTED, 2 for DISCONNECTED or 3 for ALL | [enum: 0, 1, 2, 3]

### Return type

[**List&lt;Peer&gt;**](Peer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="blacklist"></a>
# **blacklist**
> Peer blacklist(address)

Blacklist a peer for the default blacklisting period

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PeersApi apiInstance = new PeersApi();
String address = "address_example"; // String | IP address or domain name of the peer (plus optional port)
try {
    Peer result = apiInstance.blacklist(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeersApi#blacklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| IP address or domain name of the peer (plus optional port) |

### Return type

[**Peer**](Peer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="peer"></a>
# **peer**
> Peer peer(address)

Get information about a given peer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PeersApi apiInstance = new PeersApi();
String address = "address_example"; // String | IP address or domain name of the peer (plus optional port)
try {
    Peer result = apiInstance.peer(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeersApi#peer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| IP address or domain name of the peer (plus optional port) |

### Return type

[**Peer**](Peer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

