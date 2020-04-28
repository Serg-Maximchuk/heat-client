# TransactionCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**signatureHash** | **String** | SHA-256 hash of the transaction signature (only when secretPhrase sent to server) |  [optional]
**transaction** | **String** | The ID of the newly created transaction (only when secretPhrase sent to server) |  [optional]
**fullHash** | **String** | The full hash of the signed transaction (only when secretPhrase sent to server) |  [optional]
**transactionBytes** | **String** | The signed transaction bytes (only when secretPhrase sent to server) |  [optional]
**broadcasted** | **Boolean** | True if the transaction was broadcast, false otherwise | 
**transactionJSON** | [**Transaction**](Transaction.md) |  | 
**unsignedTransactionBytes** | **String** | The unsigned transaction bytes as HEX string | 
