# ToolsApi

All URIs are relative to *http://heatwallet.com:7734/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assign**](ToolsApi.md#assign) | **GET** tools/assign/name/signature/{fullNameUTF8}/{secretPhrase} | Creates a signature to use for assigning public or private account name
[**assignPost**](ToolsApi.md#assignPost) | **POST** tools/assign/name/signature | Creates a signature to use for assigning public or private account name
[**balancesHashes**](ToolsApi.md#balancesHashes) | **GET** tools/telemetry/balancesHash/{fromHeight}/{toHeight} | Peer hashes of all balances and hashes of block balances in heights range. 0 means equality or mismatch is unknown
[**balancesHashes_0**](ToolsApi.md#balancesHashes_0) | **GET** tools/telemetry/balancesHash/{height} | Peer hash of all balances and hash of block balances at height. 0 means the hash is not calculated
[**decode**](ToolsApi.md#decode) | **GET** tools/hallmark/decode/{hallmark} | Decode a node hallmark
[**decrypt**](ToolsApi.md#decrypt) | **GET** tools/aes/decrypt/{recipient}/{data}/{nonce}/{isText}/{uncompress}/{secretPhrase} | Encrypt a message using AES without sending it
[**decryptMessageBytes**](ToolsApi.md#decryptMessageBytes) | **GET** tools/aes/decryptMessageBytes/{messageBytesHex}/{recipientPublicKey}/{secretPhrase} | Decrypt message bytes using AES (use with payments API)
[**decryptPost**](ToolsApi.md#decryptPost) | **POST** tools/aes/decrypt | Encrypt a message using AES without sending it
[**encode**](ToolsApi.md#encode) | **GET** tools/hallmark/encode/{host}/{weight}/{date}/{secretPhrase} | Generates a node hallmark
[**encrypt**](ToolsApi.md#encrypt) | **GET** tools/aes/encrypt/{recipient}/{message}/{isText}/{compress}/{secretPhrase} | Encrypt a message using AES without sending it
[**encryptPost**](ToolsApi.md#encryptPost) | **POST** tools/aes/encrypt | Decrypt a message using AES
[**forksTelemetry**](ToolsApi.md#forksTelemetry) | **GET** tools/telemetry/forks | Info about happened forks
[**hash**](ToolsApi.md#hash) | **GET** tools/SHA256/{isText}/{message} | Creates a SHA256 hash of the input, input could be plain UTF-8 text or if isText&#x3D;true can be binary data encoded as HEX
[**hashPost**](ToolsApi.md#hashPost) | **POST** tools/SHA256 | Creates a SHA256 hash of the input, input could be plain UTF-8 text or if isText&#x3D;true can be binary data encoded as HEX
[**healthState**](ToolsApi.md#healthState) | **GET** tools/telemetry/health | Indicators to estimate server health to compare to other servers
[**id**](ToolsApi.md#id) | **GET** tools/id/{secretPhrase} | Calculates an account id from a secretphrase, result is an unsigned long
[**peersRejections**](ToolsApi.md#peersRejections) | **GET** tools/telemetry/peers/rejections/{scope} | Peers rejections
[**peersState**](ToolsApi.md#peersState) | **GET** tools/telemetry/peers/state | Peers state
[**peersTelemetry**](ToolsApi.md#peersTelemetry) | **GET** tools/telemetry/peers | Peers telemetry data. Balances equality means 0 - mismatch, 1 - equals, 2 - unknown
[**publickey**](ToolsApi.md#publickey) | **GET** tools/publickey/{secretPhrase} | Calculates a publickey from a secretphrase, result is a HEX string

<a name="assign"></a>
# **assign**
> Value assign(fullNameUTF8, secretPhrase)

Creates a signature to use for assigning public or private account name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
String fullNameUTF8 = "fullNameUTF8_example"; // String | The account name you wish to assign
String secretPhrase = "secretPhrase_example"; // String | The secret phrase of the account we are assigning the name to
try {
    Value result = apiInstance.assign(fullNameUTF8, secretPhrase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#assign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullNameUTF8** | **String**| The account name you wish to assign |
 **secretPhrase** | **String**| The secret phrase of the account we are assigning the name to |

### Return type

[**Value**](Value.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assignPost"></a>
# **assignPost**
> Value assignPost(body)

Creates a signature to use for assigning public or private account name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
Object body = null; // Object | 
try {
    Value result = apiInstance.assignPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#assignPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |

### Return type

[**Value**](Value.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="balancesHashes"></a>
# **balancesHashes**
> Value balancesHashes(fromHeight, toHeight)

Peer hashes of all balances and hashes of block balances in heights range. 0 means equality or mismatch is unknown

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
Integer fromHeight = 56; // Integer | from height
Integer toHeight = 56; // Integer | from height
try {
    Value result = apiInstance.balancesHashes(fromHeight, toHeight);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#balancesHashes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromHeight** | **Integer**| from height |
 **toHeight** | **Integer**| from height |

### Return type

[**Value**](Value.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="balancesHashes_0"></a>
# **balancesHashes_0**
> Value balancesHashes_0(height)

Peer hash of all balances and hash of block balances at height. 0 means the hash is not calculated

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
Integer height = 56; // Integer | At height
try {
    Value result = apiInstance.balancesHashes_0(height);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#balancesHashes_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **height** | **Integer**| At height |

### Return type

[**Value**](Value.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="decode"></a>
# **decode**
> Hallmark decode(hallmark)

Decode a node hallmark

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
String hallmark = "hallmark_example"; // String | The hallmark value
try {
    Hallmark result = apiInstance.decode(hallmark);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#decode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hallmark** | **String**| The hallmark value |

### Return type

[**Hallmark**](Hallmark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="decrypt"></a>
# **decrypt**
> DecryptedData decrypt(recipient, data, nonce, isText, uncompress, secretPhrase)

Encrypt a message using AES without sending it

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
String recipient = "recipient_example"; // String | Either the numeric account id of the recipient, or the recipient public key as HEX encoded string
String data = "data_example"; // String | AES-encrypted data as HEX string
String nonce = "nonce_example"; // String | The unique nonce associated with the encrypted data
String isText = "isText_example"; // String | Indicates if the message is to be considered UTF-8 text or if its HEX encoded binary data
String uncompress = "uncompress_example"; // String | If `true` the encrypted data is GZIP compressed and thus needs to be decompressed
String secretPhrase = "secretPhrase_example"; // String | The secret passphrase of the sender
try {
    DecryptedData result = apiInstance.decrypt(recipient, data, nonce, isText, uncompress, secretPhrase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#decrypt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recipient** | **String**| Either the numeric account id of the recipient, or the recipient public key as HEX encoded string |
 **data** | **String**| AES-encrypted data as HEX string |
 **nonce** | **String**| The unique nonce associated with the encrypted data |
 **isText** | **String**| Indicates if the message is to be considered UTF-8 text or if its HEX encoded binary data | [enum: true, false]
 **uncompress** | **String**| If &#x60;true&#x60; the encrypted data is GZIP compressed and thus needs to be decompressed | [enum: true, false]
 **secretPhrase** | **String**| The secret passphrase of the sender |

### Return type

[**DecryptedData**](DecryptedData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="decryptMessageBytes"></a>
# **decryptMessageBytes**
> DecryptedData decryptMessageBytes(messageBytesHex, recipientPublicKey, secretPhrase)

Decrypt message bytes using AES (use with payments API)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
String messageBytesHex = "messageBytesHex_example"; // String | Message bytes HEX encoded
String recipientPublicKey = "recipientPublicKey_example"; // String | Recipient public key HEX encoded
String secretPhrase = "secretPhrase_example"; // String | Secret phrase UTF-8 (WARNING! your secret phrase will be sent to the server)
try {
    DecryptedData result = apiInstance.decryptMessageBytes(messageBytesHex, recipientPublicKey, secretPhrase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#decryptMessageBytes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageBytesHex** | **String**| Message bytes HEX encoded |
 **recipientPublicKey** | **String**| Recipient public key HEX encoded |
 **secretPhrase** | **String**| Secret phrase UTF-8 (WARNING! your secret phrase will be sent to the server) |

### Return type

[**DecryptedData**](DecryptedData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="decryptPost"></a>
# **decryptPost**
> DecryptedData decryptPost(body)

Encrypt a message using AES without sending it

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
Object body = null; // Object | 
try {
    DecryptedData result = apiInstance.decryptPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#decryptPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |

### Return type

[**DecryptedData**](DecryptedData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="encode"></a>
# **encode**
> HallmarkResponse encode(host, weight, date, secretPhrase)

Generates a node hallmark

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
String host = "host_example"; // String | IP address or domain name of the node
String weight = "weight_example"; // String | The weight to assign to the node
String date = "date_example"; // String | The current date in YYYY-MM-DD format
String secretPhrase = "secretPhrase_example"; // String | The secret passphrase for the account that will be hallmarked on the node
try {
    HallmarkResponse result = apiInstance.encode(host, weight, date, secretPhrase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#encode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **host** | **String**| IP address or domain name of the node |
 **weight** | **String**| The weight to assign to the node |
 **date** | **String**| The current date in YYYY-MM-DD format |
 **secretPhrase** | **String**| The secret passphrase for the account that will be hallmarked on the node |

### Return type

[**HallmarkResponse**](HallmarkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="encrypt"></a>
# **encrypt**
> EncryptedData encrypt(recipient, message, isText, compress, secretPhrase)

Encrypt a message using AES without sending it

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
String recipient = "recipient_example"; // String | Either the numeric account id of the recipient, or the recipient public key as HEX encoded string
String message = "message_example"; // String | Either UTF-8 text or a string of hex digits to be compressed and converted into a 1000 byte maximum bytecode then encrypted using AES
String isText = "isText_example"; // String | Indicates if the message is to be considered UTF-8 text or if its HEX encoded binary data
String compress = "compress_example"; // String | If `true` the encrypted data is GZIP compressed
String secretPhrase = "secretPhrase_example"; // String | The secret passphrase of the sender
try {
    EncryptedData result = apiInstance.encrypt(recipient, message, isText, compress, secretPhrase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#encrypt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recipient** | **String**| Either the numeric account id of the recipient, or the recipient public key as HEX encoded string |
 **message** | **String**| Either UTF-8 text or a string of hex digits to be compressed and converted into a 1000 byte maximum bytecode then encrypted using AES |
 **isText** | **String**| Indicates if the message is to be considered UTF-8 text or if its HEX encoded binary data | [enum: true, false]
 **compress** | **String**| If &#x60;true&#x60; the encrypted data is GZIP compressed | [enum: true, false]
 **secretPhrase** | **String**| The secret passphrase of the sender |

### Return type

[**EncryptedData**](EncryptedData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="encryptPost"></a>
# **encryptPost**
> EncryptedData encryptPost(body)

Decrypt a message using AES

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
Object body = null; // Object | 
try {
    EncryptedData result = apiInstance.encryptPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#encryptPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |

### Return type

[**EncryptedData**](EncryptedData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="forksTelemetry"></a>
# **forksTelemetry**
> List&lt;PeerTelemetry&gt; forksTelemetry()

Info about happened forks

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
try {
    List<PeerTelemetry> result = apiInstance.forksTelemetry();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#forksTelemetry");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PeerTelemetry&gt;**](PeerTelemetry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="hash"></a>
# **hash**
> SHA256Hash hash(isText, message)

Creates a SHA256 hash of the input, input could be plain UTF-8 text or if isText&#x3D;true can be binary data encoded as HEX

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
String isText = "isText_example"; // String | Indicates if the input is to be considered UTF-8 text or if its HEX encoded binary data
String message = "message_example"; // String | Input data for the hashing function
try {
    SHA256Hash result = apiInstance.hash(isText, message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#hash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isText** | **String**| Indicates if the input is to be considered UTF-8 text or if its HEX encoded binary data | [enum: true, false]
 **message** | **String**| Input data for the hashing function |

### Return type

[**SHA256Hash**](SHA256Hash.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="hashPost"></a>
# **hashPost**
> SHA256Hash hashPost(body)

Creates a SHA256 hash of the input, input could be plain UTF-8 text or if isText&#x3D;true can be binary data encoded as HEX

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
Object body = null; // Object | 
try {
    SHA256Hash result = apiInstance.hashPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#hashPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |

### Return type

[**SHA256Hash**](SHA256Hash.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="healthState"></a>
# **healthState**
> List&lt;PeerTelemetry&gt; healthState()

Indicators to estimate server health to compare to other servers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
try {
    List<PeerTelemetry> result = apiInstance.healthState();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#healthState");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PeerTelemetry&gt;**](PeerTelemetry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="id"></a>
# **id**
> Value id(secretPhrase)

Calculates an account id from a secretphrase, result is an unsigned long

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
String secretPhrase = "secretPhrase_example"; // String | The secret passphrase
try {
    Value result = apiInstance.id(secretPhrase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#id");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretPhrase** | **String**| The secret passphrase |

### Return type

[**Value**](Value.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="peersRejections"></a>
# **peersRejections**
> List&lt;PeerRejection&gt; peersRejections(scope)

Peers rejections

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
String scope = "scope_example"; // String | Possible values: 'all' - returns all rejections, 'last' returns only last rejections for each peer
try {
    List<PeerRejection> result = apiInstance.peersRejections(scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#peersRejections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Possible values: &#x27;all&#x27; - returns all rejections, &#x27;last&#x27; returns only last rejections for each peer |

### Return type

[**List&lt;PeerRejection&gt;**](PeerRejection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="peersState"></a>
# **peersState**
> List&lt;PeerStateIndicator&gt; peersState()

Peers state

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
try {
    List<PeerStateIndicator> result = apiInstance.peersState();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#peersState");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PeerStateIndicator&gt;**](PeerStateIndicator.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="peersTelemetry"></a>
# **peersTelemetry**
> List&lt;PeerTelemetry&gt; peersTelemetry()

Peers telemetry data. Balances equality means 0 - mismatch, 1 - equals, 2 - unknown

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
try {
    List<PeerTelemetry> result = apiInstance.peersTelemetry();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#peersTelemetry");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PeerTelemetry&gt;**](PeerTelemetry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publickey"></a>
# **publickey**
> Value publickey(secretPhrase)

Calculates a publickey from a secretphrase, result is a HEX string

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ToolsApi;


ToolsApi apiInstance = new ToolsApi();
String secretPhrase = "secretPhrase_example"; // String | The secret passphrase
try {
    Value result = apiInstance.publickey(secretPhrase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#publickey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretPhrase** | **String**| The secret passphrase |

### Return type

[**Value**](Value.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

