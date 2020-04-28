# Block

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**previousBlockHash** | **String** | The 32-byte hash of the previous block (as HEX string) | 
**payloadLength** | **Integer** | The length (in bytes) of all transactions included in the block | 
**totalAmountHQT** | **String** | The total amount in HQT (1 HQT equals 0.00000001 HEAT) of the transactions in the block | 
**generationSignature** | **String** | The 32-byte generation signature of the generating account | 
**generator** | **String** | The generating account number | 
**generatorPublicName** | **String** | The generator public name | 
**generatorPublicKey** | **String** | The 32-byte public key of the generating account (as HEX string) | 
**baseTarget** | **String** | The base target for the next block generation | 
**payloadHash** | **String** | The 32-byte hash of the payload (all transactions as HEX string) | 
**nextBlock** | **String** | The next block ID | 
**numberOfTransactions** | **Integer** | The number of transactions in the block | 
**blockSignature** | **String** | The 64-byte block signature (as HEX string) | 
**transactions** | [**List&lt;Transaction&gt;**](Transaction.md) | An array of transaction IDs or transaction objects (if includeTransactions provided, refer to Get Transaction for details) | 
**version** | **Integer** | The block version | 
**totalFeeHQT** | **String** | The total fee in HQT (1 HQT equals 0.00000001 HEAT) of the transactions in the block | 
**previousBlock** | **String** | The previous block ID | 
**cumulativeDifficulty** | **String** | The cumulative difficulty for the next block generation | 
**block** | **String** | The block ID | 
**height** | **Integer** | The zero-based block height | 
**timestamp** | **Integer** | The timestamp (in seconds since 24 november 2013 00:00 UTC) of the block | 
**popRewardHQT** | **String** | The total POP fee in HQT (1 HQT equals 0.00000001 HEAT) | 
**posRewardHQT** | **String** | The total POS miner fee in HQT (1 HQT equals 0.00000001 HEAT) | 
