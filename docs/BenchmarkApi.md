# BenchmarkApi

All URIs are relative to *http://heatwallet.com:7734/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**blockmin**](BenchmarkApi.md#blockmin) | **GET** benchmark/block/{height} | Get a minimal block object given the block height
[**highestTransactionId**](BenchmarkApi.md#highestTransactionId) | **GET** benchmark/highestTransactionId/{blockId} | Get highest transaction id in a block
[**registerAccount**](BenchmarkApi.md#registerAccount) | **GET** benchmark/registerAccount/{publicKey} | Creates an account

<a name="blockmin"></a>
# **blockmin**
> BlockMin blockmin(height)

Get a minimal block object given the block height

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BenchmarkApi;


BenchmarkApi apiInstance = new BenchmarkApi();
String height = "height_example"; // String | The block height
try {
    BlockMin result = apiInstance.blockmin(height);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BenchmarkApi#blockmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **height** | **String**| The block height |

### Return type

[**BlockMin**](BlockMin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="highestTransactionId"></a>
# **highestTransactionId**
> Value highestTransactionId(blockId)

Get highest transaction id in a block

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BenchmarkApi;


BenchmarkApi apiInstance = new BenchmarkApi();
String blockId = "blockId_example"; // String | Block id
try {
    Value result = apiInstance.highestTransactionId(blockId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BenchmarkApi#highestTransactionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockId** | **String**| Block id |

### Return type

[**Value**](Value.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerAccount"></a>
# **registerAccount**
> Value registerAccount(publicKey)

Creates an account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BenchmarkApi;


BenchmarkApi apiInstance = new BenchmarkApi();
String publicKey = "publicKey_example"; // String | PublicKey
try {
    Value result = apiInstance.registerAccount(publicKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BenchmarkApi#registerAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **publicKey** | **String**| PublicKey |

### Return type

[**Value**](Value.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

