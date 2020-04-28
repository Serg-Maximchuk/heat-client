# TransactionExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **Integer** | The transaction type | 
**subtype** | **Integer** | The transaction subtype | 
**timestamp** | **Integer** | The time (in seconds since 24 november 2013 00:00 UTC) of the transaction | 
**deadline** | **Integer** | The deadline (in minutes) for the transaction to be confirmed | 
**senderPublicKey** | **String** | The public key of the sending account for the transaction | 
**recipient** | **String** | The account number of the recipient, if applicable | 
**recipientPublicKey** | **String** | Recipient public key as HEX string | 
**amount** | **String** | The amount in HQT (1 HQT equals 0.00000001 HEAT) of the transaction | 
**fee** | **String** | The fee in HQT (1 HQT equals 0.00000001 HEAT) of the transaction | 
**signature** | **String** | The digital signature of the transaction | 
**signatureHash** | **String** | A SHA-256 hash of the transaction signature | 
**fullHash** | **String** | The full hash of the signed transaction | 
**transaction** | **String** | The ID of the newly created transaction | 
**attachment** | **Map&lt;String, Object&gt;** | An object containing any additional data needed for the transaction, if applicable | 
**sender** | **String** | The account ID of the sender | 
**height** | **Integer** | The height of the block in the blockchain | 
**version** | **Integer** | The transaction version number | 
**ecBlockId** | **String** | The economic clustering block ID | 
**ecBlockHeight** | **Integer** | The economic clustering block height | 
**messageBytes** | **String** | The message bytes as HEX if any | 
**messageIsText** | **Boolean** | In case the message is a text message (binary otherwise) | 
**messageIsEncrypted** | **Boolean** | Message is encrypted | 
**messageIsEncryptedToSelf** | **Boolean** | Message is encrypted to self | 
**senderPublicName** | **String** | Sender public name | 
**recipientPublicName** | **String** | Recipient public name | 
