# KeyStoreApi

All URIs are relative to *http://heatwallet.com:7734/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keyStoreCount**](KeyStoreApi.md#keyStoreCount) | **GET** keystore/count/{account} | Counts key/value entries for an account (requires replicator)
[**keyStoreGet**](KeyStoreApi.md#keyStoreGet) | **GET** keystore/get/{account}/{key} | Get the value for account key value  (requires replicator)
[**keyStoreList**](KeyStoreApi.md#keyStoreList) | **GET** keystore/list/{account}/{from}/{to} | Lists all keys for account (requires replicator)
[**keyStorePut**](KeyStoreApi.md#keyStorePut) | **POST** keystore/put | Sets the value identified by key (requires replicator)

<a name="keyStoreCount"></a>
# **keyStoreCount**
> Count keyStoreCount(account)

Counts key/value entries for an account (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.KeyStoreApi;


KeyStoreApi apiInstance = new KeyStoreApi();
String account = "account_example"; // String | The account scope (numeric account identifier)
try {
    Count result = apiInstance.keyStoreCount(account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyStoreApi#keyStoreCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| The account scope (numeric account identifier) |

### Return type

[**Count**](Count.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keyStoreGet"></a>
# **keyStoreGet**
> KeyStoreBundle keyStoreGet(account, key)

Get the value for account key value  (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.KeyStoreApi;


KeyStoreApi apiInstance = new KeyStoreApi();
String account = "account_example"; // String | The account scope (numeric account identifier)
String key = "key_example"; // String | Key name (UTF-8, max length when converted to bytes is 100)
try {
    KeyStoreBundle result = apiInstance.keyStoreGet(account, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyStoreApi#keyStoreGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| The account scope (numeric account identifier) |
 **key** | **String**| Key name (UTF-8, max length when converted to bytes is 100) |

### Return type

[**KeyStoreBundle**](KeyStoreBundle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keyStoreList"></a>
# **keyStoreList**
> List&lt;KeyStoreBundle&gt; keyStoreList(account, from, to)

Lists all keys for account (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.KeyStoreApi;


KeyStoreApi apiInstance = new KeyStoreApi();
String account = "account_example"; // String | The account scope (numeric account identifier)
String from = "from_example"; // String | From index
String to = "to_example"; // String | To index
try {
    List<KeyStoreBundle> result = apiInstance.keyStoreList(account, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyStoreApi#keyStoreList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| The account scope (numeric account identifier) |
 **from** | **String**| From index |
 **to** | **String**| To index |

### Return type

[**List&lt;KeyStoreBundle&gt;**](KeyStoreBundle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keyStorePut"></a>
# **keyStorePut**
> TransactionCreate keyStorePut(key, value, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature)

Sets the value identified by key (requires replicator)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.KeyStoreApi;


KeyStoreApi apiInstance = new KeyStoreApi();
String key = "key_example"; // String | 
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
    TransactionCreate result = apiInstance.keyStorePut(key, value, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyStoreApi#keyStorePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**|  |
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

