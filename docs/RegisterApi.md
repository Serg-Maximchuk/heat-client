# RegisterApi

All URIs are relative to *http://heatwallet.com:7734/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](RegisterApi.md#add) | **GET** register/now/{publicKey}/{captcha}/{name}/{isprivate}/{signature} | Register a new account

<a name="add"></a>
# **add**
> Value add(publicKey, captcha, name, isprivate, signature)

Register a new account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegisterApi;


RegisterApi apiInstance = new RegisterApi();
String publicKey = "publicKey_example"; // String | Public key
String captcha = "captcha_example"; // String | Captcha
String name = "name_example"; // String | Account name
String isprivate = "isprivate_example"; // String | If true assign a private name, public otherwise
String signature = "signature_example"; // String | User signature required to assign the name
try {
    Value result = apiInstance.add(publicKey, captcha, name, isprivate, signature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegisterApi#add");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **publicKey** | **String**| Public key |
 **captcha** | **String**| Captcha |
 **name** | **String**| Account name |
 **isprivate** | **String**| If true assign a private name, public otherwise |
 **signature** | **String**| User signature required to assign the name |

### Return type

[**Value**](Value.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

