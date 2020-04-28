# MiningApi

All URIs are relative to *http://heatwallet.com:7734/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**info**](MiningApi.md#info) | **GET** mining/info/{secretPhrase} | Get current mining info for all miners (if secret phrase ommitted) or for a single miner
[**info2**](MiningApi.md#info2) | **POST** mining/info | Get current mining info for all miners (if secret phrase ommitted) or for a single miner
[**rewardsAccount**](MiningApi.md#rewardsAccount) | **GET** mining/rewards/account/{account} | Find reward info for account
[**rewardsList**](MiningApi.md#rewardsList) | **GET** mining/rewards/list/{firstIndex}/{lastIndex} | List all reward info
[**rewardsListCount**](MiningApi.md#rewardsListCount) | **GET** mining/rewards/list/count | Count number of reward info entries
[**start**](MiningApi.md#start) | **GET** mining/start/{secretPhrase} | Start mining blocks with an account
[**start2**](MiningApi.md#start2) | **POST** mining/start | Start mining blocks with an account
[**stop**](MiningApi.md#stop) | **GET** mining/stop/{secretPhrase} | Stop mining blocks
[**stop2**](MiningApi.md#stop2) | **POST** mining/stop | Stop mining blocks

<a name="info"></a>
# **info**
> List&lt;Mining&gt; info(secretPhrase)

Get current mining info for all miners (if secret phrase ommitted) or for a single miner

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MiningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MiningApi apiInstance = new MiningApi();
String secretPhrase = "secretPhrase_example"; // String | The secret passphrase of the account (optional, if ommitted will return all mining info)
try {
    List<Mining> result = apiInstance.info(secretPhrase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiningApi#info");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretPhrase** | **String**| The secret passphrase of the account (optional, if ommitted will return all mining info) |

### Return type

[**List&lt;Mining&gt;**](Mining.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="info2"></a>
# **info2**
> List&lt;Mining&gt; info2(secretPhrase)

Get current mining info for all miners (if secret phrase ommitted) or for a single miner

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MiningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MiningApi apiInstance = new MiningApi();
String secretPhrase = "secretPhrase_example"; // String | 
try {
    List<Mining> result = apiInstance.info2(secretPhrase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiningApi#info2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretPhrase** | **String**|  | [optional]

### Return type

[**List&lt;Mining&gt;**](Mining.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="rewardsAccount"></a>
# **rewardsAccount**
> JSONRewardsInfo rewardsAccount(account)

Find reward info for account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MiningApi;


MiningApi apiInstance = new MiningApi();
String account = "account_example"; // String | The account numeric id
try {
    JSONRewardsInfo result = apiInstance.rewardsAccount(account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiningApi#rewardsAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| The account numeric id |

### Return type

[**JSONRewardsInfo**](JSONRewardsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rewardsList"></a>
# **rewardsList**
> List&lt;JSONRewardsInfo&gt; rewardsList(firstIndex, lastIndex)

List all reward info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MiningApi;


MiningApi apiInstance = new MiningApi();
String firstIndex = "firstIndex_example"; // String | First index
String lastIndex = "lastIndex_example"; // String | Last index (optional, default is firstIndex + 99)
try {
    List<JSONRewardsInfo> result = apiInstance.rewardsList(firstIndex, lastIndex);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiningApi#rewardsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstIndex** | **String**| First index |
 **lastIndex** | **String**| Last index (optional, default is firstIndex + 99) |

### Return type

[**List&lt;JSONRewardsInfo&gt;**](JSONRewardsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rewardsListCount"></a>
# **rewardsListCount**
> Count rewardsListCount()

Count number of reward info entries

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MiningApi;


MiningApi apiInstance = new MiningApi();
try {
    Count result = apiInstance.rewardsListCount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiningApi#rewardsListCount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Count**](Count.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="start"></a>
# **start**
> Mining start(secretPhrase)

Start mining blocks with an account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MiningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MiningApi apiInstance = new MiningApi();
String secretPhrase = "secretPhrase_example"; // String | The secret passphrase of the account 
try {
    Mining result = apiInstance.start(secretPhrase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiningApi#start");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretPhrase** | **String**| The secret passphrase of the account  |

### Return type

[**Mining**](Mining.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="start2"></a>
# **start2**
> Mining start2(secretPhrase)

Start mining blocks with an account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MiningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MiningApi apiInstance = new MiningApi();
String secretPhrase = "secretPhrase_example"; // String | 
try {
    Mining result = apiInstance.start2(secretPhrase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiningApi#start2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretPhrase** | **String**|  |

### Return type

[**Mining**](Mining.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="stop"></a>
# **stop**
> Mining stop(secretPhrase)

Stop mining blocks

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MiningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MiningApi apiInstance = new MiningApi();
String secretPhrase = "secretPhrase_example"; // String | The secret passphrase of the account (optional, if ommitted will stop all mining activity)
try {
    Mining result = apiInstance.stop(secretPhrase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiningApi#stop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretPhrase** | **String**| The secret passphrase of the account (optional, if ommitted will stop all mining activity) |

### Return type

[**Mining**](Mining.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stop2"></a>
# **stop2**
> Mining stop2(secretPhrase)

Stop mining blocks

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MiningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MiningApi apiInstance = new MiningApi();
String secretPhrase = "secretPhrase_example"; // String | 
try {
    Mining result = apiInstance.stop2(secretPhrase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiningApi#stop2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretPhrase** | **String**|  | [optional]

### Return type

[**Mining**](Mining.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

