# SearchApi

All URIs are relative to *http://heatwallet.com:7734/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accounts**](SearchApi.md#accounts) | **GET** search/accounts/{query}/{from}/{to} | Search account ids, public keys and email ids
[**accountsCount**](SearchApi.md#accountsCount) | **GET** search/accounts/count/{query} | Count account ids, public keys and email ids

<a name="accounts"></a>
# **accounts**
> List&lt;Account&gt; accounts(query, from, to)

Search account ids, public keys and email ids

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String query = "query_example"; // String | Query text
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<Account> result = apiInstance.accounts(query, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#accounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Query text |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;Account&gt;**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountsCount"></a>
# **accountsCount**
> Count accountsCount(query)

Count account ids, public keys and email ids

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String query = "query_example"; // String | Query text
try {
    Count result = apiInstance.accountsCount(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#accountsCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Query text |

### Return type

[**Count**](Count.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

