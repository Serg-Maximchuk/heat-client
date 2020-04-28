# BlockchainStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isScanning** | **Boolean** | True if this node is scanning the blockchain, false otherwise |  [optional]
**cumulativeDifficulty** | **String** | The current cumulative miner difficulty |  [optional]
**numberOfBlocks** | **Integer** | The number of blocks (height + 1) in the blockchain |  [optional]
**numberOfTransactions** | **Integer** | The number of transactions in the blockchain |  [optional]
**numberOfUnconfirmedTransactions** | **Integer** | The number of unconfirmed transactions |  [optional]
**version** | **String** | The software version on this node |  [optional]
**lastBlock** | **String** | The last block numeric id |  [optional]
**lastBlockTimestamp** | **Integer** | Timestamp of the last block |  [optional]
**application** | **String** | The name of the software running on this node |  [optional]
**lastBlockchainFeederHeight** | **Integer** | The height of the last blockchain feeder |  [optional]
**time** | **Integer** | The current node time (in seconds since 24 november 2013 00:00 UTC) |  [optional]
**lastBlockchainFeeder** | **String** | The announced name of the feeder of the last blockchain |  [optional]
**initialCoinSupply** | **String** | Amount of HEAT in genesis block (in HQT, 1 HQT is 0.00000001 HEAT) |  [optional]
**currentCoinSupply** | **String** | Current total amount of HEAT (in HQT, 1 HQT is 0.00000001 HEAT) |  [optional]
