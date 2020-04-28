# BlockCondensed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalAmountHQT** | **String** | The total amount in HQT (1 HQT equals 0.00000001 HEAT) of the transactions in the block | 
**generator** | **String** | The generating account number | 
**generatorPublicName** | **String** | The generator public name | 
**numberOfTransactions** | **Integer** | The number of transactions in the block | 
**totalFeeHQT** | **String** | The total fee in HQT (1 HQT equals 0.00000001 HEAT) of the transactions in the block | 
**block** | **String** | The block ID | 
**height** | **Integer** | The zero-based block height | 
**timestamp** | **Integer** | The timestamp (in seconds since 24 november 2013 00:00 UTC) of the block | 
**posRewardHQT** | **String** | The total POS miner fee in HQT (1 HQT equals 0.00000001 HEAT) | 
**popRewardHQT** | **String** | The total POP fee in HQT (1 HQT equals 0.00000001 HEAT) | 
**transactions** | [**List&lt;Transaction&gt;**](Transaction.md) | An array of transaction IDs or transaction objects (if includeTransactions provided, refer to Get Transaction for details) | 
