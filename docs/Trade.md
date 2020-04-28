# Trade

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**block** | **String** | The ID of the block that contains the trade (0 for unconfirmed trades) | 
**height** | **Integer** | The height of the block that contains the trade (0 for unconfirmed trades) | 
**timestamp** | **Integer** | The trade timestamp (in seconds since 24 november 2013 00:00 UTC) | 
**currency** | **String** | The currency ID | 
**asset** | **String** | The asset ID | 
**askOrder** | **String** | The ask order ID | 
**bidOrder** | **String** | The bid order ID | 
**askOrderHeight** | **Integer** | The ask order height (0 for unconfirmed orders) | 
**bidOrderHeight** | **Integer** | The bid order height (0 for unconfirmed orders) | 
**seller** | **String** | Numeric ID of the seller account | 
**sellerName** | **String** | Public name for seller account |  [optional]
**buyer** | **String** | Numeric ID of the buyer account | 
**buyerName** | **String** | Public name for buyer account |  [optional]
**quantity** | **String** | The trade quantity (in QNT) | 
**price** | **String** | The trade price (in QNT in case currency is an asset, in HQT in case currency is HEAT) (1 HQT equals 0.00000001 HEAT)  | 
**isBuy** | **Boolean** | Wheter this is a BUY trade (false in case of a SELL trade) | 
**currencyProperties** | **String** | Currency properties based on protocol and account id (blank for all but &#x27;list account trades&#x27;) |  [optional]
**assetProperties** | **String** | Asset properties based on protocol and account id (blank for all but &#x27;list account trades&#x27;) |  [optional]
