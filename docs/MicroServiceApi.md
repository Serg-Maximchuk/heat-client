# MicroServiceApi

All URIs are relative to *http://heatwallet.com:7734/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](MicroServiceApi.md#get) | **GET** microservice/{params} | 
[**post**](MicroServiceApi.md#post) | **POST** microservice/{params} | 

<a name="get"></a>
# **get**
> Void get(params)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MicroServiceApi;


MicroServiceApi apiInstance = new MicroServiceApi();
List<String> params = Arrays.asList("params_example"); // List<String> | 
try {
    Void result = apiInstance.get(params);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MicroServiceApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **params** | [**List&lt;String&gt;**](String.md)|  |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="post"></a>
# **post**
> Void post(params, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MicroServiceApi;


MicroServiceApi apiInstance = new MicroServiceApi();
List<String> params = Arrays.asList("params_example"); // List<String> | 
String body = "body_example"; // String | 
try {
    Void result = apiInstance.post(params, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MicroServiceApi#post");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **params** | [**List&lt;String&gt;**](String.md)|  |
 **body** | [**String**](String.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

