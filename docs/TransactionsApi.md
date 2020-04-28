# TransactionsApi

All URIs are relative to *http://heatwallet.com:7734/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**broadcast**](TransactionsApi.md#broadcast) | **POST** tx/broadcast | Broadcast a transaction to the network
[**checkApplicability**](TransactionsApi.md#checkApplicability) | **POST** tx/check | Get a transaction object given a (signed or unsigned) transaction bytecode, or re-parse a transaction object. Verify the signature. Check applicability of transaction at moment
[**create**](TransactionsApi.md#create) | **POST** tx/create | Create and optionally sign and broadcast any type of transaction from a JSON document
[**fullhash**](TransactionsApi.md#fullhash) | **POST** tx/fullhash | Calculate the full hash of a transaction.
[**lease**](TransactionsApi.md#lease) | **POST** tx/lease | Lease the entire guaranteed balance of HEAT to another account, after 1440 confirmations
[**parse**](TransactionsApi.md#parse) | **POST** tx/parse | Get a transaction object given a (signed or unsigned) transaction bytecode, or re-parse a transaction object. Verify the signature
[**registerInternetAddress**](TransactionsApi.md#registerInternetAddress) | **POST** tx/internetaddress | Register internet address for sender account (the host of node on which account is forging)
[**sendMessage**](TransactionsApi.md#sendMessage) | **POST** tx/sendmessage | Create an Arbitrary Message transaction
[**sendMoney**](TransactionsApi.md#sendMoney) | **POST** tx/sendmoney | Send HEAT to an account
[**sign**](TransactionsApi.md#sign) | **POST** tx/sign | Calculates the full hash, signature hash, and transaction ID of an unsigned transaction

<a name="broadcast"></a>
# **broadcast**
> Broadcast broadcast(transactionBytes, transactionJSON)

Broadcast a transaction to the network

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
String transactionBytes = "transactionBytes_example"; // String | 
String transactionJSON = "transactionJSON_example"; // String | 
try {
    Broadcast result = apiInstance.broadcast(transactionBytes, transactionJSON);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#broadcast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionBytes** | **String**|  | [optional]
 **transactionJSON** | **String**|  | [optional]

### Return type

[**Broadcast**](Broadcast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="checkApplicability"></a>
# **checkApplicability**
> TransactionVerify checkApplicability(transactionJSON, transactionBytes)

Get a transaction object given a (signed or unsigned) transaction bytecode, or re-parse a transaction object. Verify the signature. Check applicability of transaction at moment

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
String transactionJSON = "transactionJSON_example"; // String | 
String transactionBytes = "transactionBytes_example"; // String | 
try {
    TransactionVerify result = apiInstance.checkApplicability(transactionJSON, transactionBytes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#checkApplicability");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionJSON** | **String**|  | [optional]
 **transactionBytes** | **String**|  | [optional]

### Return type

[**TransactionVerify**](TransactionVerify.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="create"></a>
# **create**
> TransactionCreate create(value)

Create and optionally sign and broadcast any type of transaction from a JSON document

&lt;code&gt;// Transaction fee in HQT (1 HQT equals 0.00000001 HEAT) default fee is 0.01 HEAT&lt;br&gt;fee: string,&lt;br&gt;&lt;br&gt;// The deadline (in minutes) for the transaction to be confirmed, 1440 minutes maximum&lt;br&gt;deadline: number,&lt;br&gt;&lt;br&gt;// The secret passphrase of the account (optional, but transaction neither signed nor broadcast if omitted)&lt;br&gt;secretPhrase: string,&lt;br&gt;&lt;br&gt;// The public key of the account (optional if secretPhrase provided)&lt;br&gt;publicKey: string,&lt;br&gt;&lt;br&gt;// The account ID of the recipient (optional)&lt;br&gt;recipient: string,&lt;br&gt;&lt;br&gt;// The public key of the receiving account (optional, enhances security of a new account)&lt;br&gt;recipientPublicKey: string,&lt;br&gt;&lt;br&gt;// Set to false to prevent broadcasting the transaction to the network (optional)&lt;br&gt;broadcast: boolean,&lt;br&gt;&lt;br&gt;// Either UTF-8 text or a string of hex digits (perhaps previously encoded using an arbitrary algorithm) to be converted into a bytecode with a maximum length of one kilobyte&lt;br&gt;message: string,&lt;br&gt;&lt;br&gt;// False if the message is a hex string, otherwise the message is text (optional)&lt;br&gt;messageIsText: boolean,&lt;br&gt;&lt;br&gt;// Either UTF-8 text or a string of hex digits to be compressed (unless compressMessageToEncrypt is false) and converted into a bytecode with a maximum length of one kilobyte&lt;br&gt;messageToEncrypt: string,&lt;br&gt;&lt;br&gt;// False if the message to encrypt is a hex string, otherwise the message to encrypt is text (optional)&lt;br&gt;messageToEncryptIsText: string,&lt;br&gt;&lt;br&gt;// Already encrypted data which overrides messageToEncrypt if provided (optional)&lt;br&gt;encryptedMessageData: string,&lt;br&gt;&lt;br&gt;// A unique 32-byte number which cannot be reused (optional unless encryptedMessageData is provided)&lt;br&gt;encryptedMessageNonce: string,&lt;br&gt;&lt;br&gt;// Either UTF-8 text or a string of hex digits to be compressed (unless compressMessageToEncryptToSelf is false) and converted into a one kilobyte maximum bytecode then encrypted with AES, then sent to the sending account (optional)&lt;br&gt;messageToEncryptToSelf: string,&lt;br&gt;&lt;br&gt;// False if the message to self-encrypt is a hex string, otherwise the message to encrypt is text (optional)&lt;br&gt;messageToEncryptToSelfIsText: boolean, &lt;br&gt;&lt;br&gt;// Already encrypted data which overrides messageToEncryptToSelf if provided (optional)&lt;br&gt;encryptToSelfMessageData: string,&lt;br&gt;&lt;br&gt;// A unique 32-byte number which cannot be reused (optional unless encryptToSelfMessageData is provided)&lt;br&gt;public String encryptToSelfMessageNonce;&lt;br&gt;&lt;br&gt;// 8 byte numeric name hash (optional, announces non-public name to your account)&lt;br&gt;privateNameAnnouncement: string,&lt;br&gt;&lt;br&gt;// Account name, UTF-8 min length 3, max length 100 (optional, announces public name to your account)&lt;br&gt;publicNameAnnouncement: string, &lt;br&gt;&lt;br&gt;// 8 byte numeric name hash (optional, assigns non-public name to recipient account)&lt;br&gt;privateNameAssignment: string,&lt;br&gt;&lt;br&gt;// Private name assignment signature (required when privateNameAssignment was given, see /tools/privatename/signature for details)&lt;br&gt;privateNameAssignmentSignature: string,&lt;br&gt;&lt;br&gt;// Account name, UTF-8 min length 3, max length 100 (optional, assigns public name to recipient account)&lt;br&gt;publicNameAssignment: string,&lt;br&gt;&lt;br&gt;// Public name assignment signature (required when publicNameAssignment was given, see /tools/publicname/signature for details)&lt;br&gt;publicNameAssignmentSignature: string,&lt;br&gt;&lt;br&gt;EffectiveBalanceLeasing: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;period: number&lt;br&gt;}&lt;br&gt;AskOrderCancellation: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;orderId: string&lt;br&gt;}&lt;br&gt;BidOrderCancellation: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;orderId: string&lt;br&gt;}&lt;br&gt;AskOrderPlacement: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;currencyId: string,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;assetId: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantity: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;price: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;expiration: number&lt;br&gt;}&lt;br&gt;BidOrderPlacement: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;currencyId: string,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;assetId: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantity: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;price: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;expiration: number&lt;br&gt;}&lt;br&gt;AssetIssuance: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;descriptionUrl: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;descriptionHash: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantityQNT: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;decimals: number, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;dillutable: boolean&lt;br&gt;}&lt;br&gt;AssetIssueMore: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;assetId: string, &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantity: string&lt;br&gt;}&lt;br&gt;AssetTransfer: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;assetId: string,&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;quantity: string&lt;br&gt;}&lt;br&gt;OrdinaryPayment: {&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;amountHQT: string,&lt;br&gt;}&lt;br&gt;ArbitraryMessage: {}&lt;br&gt;&lt;/code&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
String value = "value_example"; // String | 
try {
    TransactionCreate result = apiInstance.create(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**|  |

### Return type

[**TransactionCreate**](TransactionCreate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="fullhash"></a>
# **fullhash**
> FullHash fullhash(unsignedTransactionJSON, unsignedTransactionBytes, signatureHash)

Calculate the full hash of a transaction.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
String unsignedTransactionJSON = "unsignedTransactionJSON_example"; // String | 
String unsignedTransactionBytes = "unsignedTransactionBytes_example"; // String | 
String signatureHash = "signatureHash_example"; // String | 
try {
    FullHash result = apiInstance.fullhash(unsignedTransactionJSON, unsignedTransactionBytes, signatureHash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#fullhash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unsignedTransactionJSON** | **String**|  | [optional]
 **unsignedTransactionBytes** | **String**|  | [optional]
 **signatureHash** | **String**|  | [optional]

### Return type

[**FullHash**](FullHash.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="lease"></a>
# **lease**
> TransactionCreate lease(period, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement)

Lease the entire guaranteed balance of HEAT to another account, after 1440 confirmations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
String period = "period_example"; // String | 
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
    TransactionCreate result = apiInstance.lease(period, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#lease");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **period** | **String**|  |
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

<a name="parse"></a>
# **parse**
> TransactionVerify parse(transactionJSON, transactionBytes)

Get a transaction object given a (signed or unsigned) transaction bytecode, or re-parse a transaction object. Verify the signature

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
String transactionJSON = "transactionJSON_example"; // String | 
String transactionBytes = "transactionBytes_example"; // String | 
try {
    TransactionVerify result = apiInstance.parse(transactionJSON, transactionBytes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#parse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionJSON** | **String**|  | [optional]
 **transactionBytes** | **String**|  | [optional]

### Return type

[**TransactionVerify**](TransactionVerify.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="registerInternetAddress"></a>
# **registerInternetAddress**
> TransactionCreate registerInternetAddress(internetAddress, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement)

Register internet address for sender account (the host of node on which account is forging)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
String internetAddress = "internetAddress_example"; // String | 
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
    TransactionCreate result = apiInstance.registerInternetAddress(internetAddress, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#registerInternetAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **internetAddress** | **String**|  |
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

<a name="sendMessage"></a>
# **sendMessage**
> TransactionCreate sendMessage(fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature)

Create an Arbitrary Message transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
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
    TransactionCreate result = apiInstance.sendMessage(fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#sendMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="sendMoney"></a>
# **sendMoney**
> TransactionCreate sendMoney(amount, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature)

Send HEAT to an account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
String amount = "amount_example"; // String | 
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
    TransactionCreate result = apiInstance.sendMoney(amount, fee, deadline, secretPhrase, publicKey, recipient, recipientPublicKey, broadcast, privateNameAnnouncement, publicNameAnnouncement, message, messageIsText, messageToEncrypt, messageToEncryptIsText, encryptedMessageData, encryptedMessageNonce, messageToEncryptToSelf, messageToEncryptToSelfIsText, encryptToSelfMessageData, encryptToSelfMessageNonce, privateNameAssignment, privateNameAssignmentSignature, publicNameAssignment, publicNameAssignmentSignature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#sendMoney");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **amount** | **String**|  |
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

<a name="sign"></a>
# **sign**
> SignResponse sign(unsignedTransactionJSON, unsignedTransactionBytes, secretPhrase, validate)

Calculates the full hash, signature hash, and transaction ID of an unsigned transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
String unsignedTransactionJSON = "unsignedTransactionJSON_example"; // String | 
String unsignedTransactionBytes = "unsignedTransactionBytes_example"; // String | 
String secretPhrase = "secretPhrase_example"; // String | 
String validate = "validate_example"; // String | 
try {
    SignResponse result = apiInstance.sign(unsignedTransactionJSON, unsignedTransactionBytes, secretPhrase, validate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#sign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unsignedTransactionJSON** | **String**|  |
 **unsignedTransactionBytes** | **String**|  |
 **secretPhrase** | **String**|  |
 **validate** | **String**|  | [enum: true, false]

### Return type

[**SignResponse**](SignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

