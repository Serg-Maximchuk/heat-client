# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order** | **String** | The ID of the order | 
**currency** | **String** | The ID of the currency with which we are paying (BID order) or which we will be receiving (ASK order) | 
**asset** | **String** | The ID of the asset being bought or sold | 
**account** | **String** | The account number associated with the order | 
**accountName** | **String** | The account name associated with the order |  [optional]
**quantity** | **String** | The order quantity (in QNT) | 
**unconfirmedQuantity** | **String** | the unconfirmed order quantity (in QNT) | 
**price** | **String** | The order price (given in currency units, could be either HQT if currency is HEAT or QNT if currency is an asset) | 
**height** | **Integer** | The block height of the order transaction | 
**transactionIndex** | **Integer** | A zero-based index giving the order of the transaction in its block | 
**type** | [**TypeEnum**](#TypeEnum) | Order type, either &#x60;ask&#x60; or &#x60;bid&#x60; | 
**cancelled** | **Boolean** | Indicates an unconfirmed cancellation is pending | 
**unconfirmed** | **Boolean** | This is an unconfirmed or pending order | 
**expiration** | **Integer** | The expiration time (in seconds since 24 november 2013 00:00 UTC) | 
**currentlyNotValid** | **Boolean** | Order is currently not valid, but might become valid in the future | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ASK | &quot;ask&quot;
BID | &quot;bid&quot;
