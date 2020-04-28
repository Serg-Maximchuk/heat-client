# SignResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**signatureHash** | **String** | A SHA-256 hash of the transaction signature, used in escrow transactions | 
**verify** | **Boolean** | Is true if the signature is verified, false if not | 
**transactionBytes** | **String** | The signed transaction bytes | 
**fullHash** | **String** | The full hash of the signed transaction | 
**transaction** | **String** | The transaction ID, derived from the fullHash | 
