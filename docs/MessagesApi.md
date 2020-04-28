# MessagesApi

All URIs are relative to *http://heatwallet.com:7734/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contact**](MessagesApi.md#contact) | **GET** messages/contact/{accountA}/{accountB}/{from}/{to} | Lists messages for a contact (requires replicator)
[**contactCount**](MessagesApi.md#contactCount) | **GET** messages/contact/count/{accountA}/{accountB} | Count of all contacts messages (requires replicator)
[**latest**](MessagesApi.md#latest) | **GET** messages/latest/{account}/{from}/{to} | Lists latest message contacts (requires replicator)

<a name="contact"></a>
# **contact**
> List&lt;Message&gt; contact(accountA, accountB, from, to)

Lists messages for a contact (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MessagesApi;


MessagesApi apiInstance = new MessagesApi();
String accountA = "accountA_example"; // String | Account a
String accountB = "accountB_example"; // String | Account B
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Message> result = apiInstance.contact(accountA, accountB, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#contact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountA** | **String**| Account a |
 **accountB** | **String**| Account B |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Message&gt;**](Message.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contactCount"></a>
# **contactCount**
> Count contactCount(accountA, accountB)

Count of all contacts messages (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MessagesApi;


MessagesApi apiInstance = new MessagesApi();
String accountA = "accountA_example"; // String | Account a
String accountB = "accountB_example"; // String | Account B
try {
    Count result = apiInstance.contactCount(accountA, accountB);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#contactCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountA** | **String**| Account a |
 **accountB** | **String**| Account B |

### Return type

[**Count**](Count.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="latest"></a>
# **latest**
> List&lt;MessageContact&gt; latest(account, from, to)

Lists latest message contacts (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MessagesApi;


MessagesApi apiInstance = new MessagesApi();
String account = "account_example"; // String | Account
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<MessageContact> result = apiInstance.latest(account, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#latest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Account |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;MessageContact&gt;**](MessageContact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

