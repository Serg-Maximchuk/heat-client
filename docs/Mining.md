# Mining

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deadline** | **Long** | The estimated time (in seconds since the last block) until the account will mine a block (startMining and getMining only) |  [optional]
**hitTime** | **Integer** | The estimated time (in seconds since 24 november 2013 00:00 UTC) when the account will mine a block (startMining and getMining only) |  [optional]
**remaining** | **Integer** | The deadline less the elapsed time since the last block (getInfo only) |  [optional]
**foundAndStopped** | **Boolean** | Is true if mining was stopped, false if mining was already stopped (stopMining only) |  [optional]
**account** | **String** | The account number (getInfo only) |  [optional]
**stopped** | **Integer** | Total number of stopped miners (stopMining only) |  [optional]
