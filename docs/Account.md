# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Numeric account id | 
**keyHeight** | **Integer** | Height at which the public key was registered | 
**publicKey** | **String** | Account public key in HEX format | 
**balance** | **String** | Account balance in HQT (1 HQT equals 0.00000001 HEAT) | 
**unconfirmedBalance** | **String** | Unconfirmed account balance in HQT (1 HQT equals 0.00000001 HEAT) | 
**effectiveBalance** | **String** | Effective account balance in HQT (1 HQT equals 0.00000001 HEAT) | 
**guaranteedBalance** | **String** | Guaranteed account balance in HQT (1 HQT equals 0.00000001 HEAT) | 
**currentLessee** | **String** | Account id of the lessee | 
**currentLesseeName** | **String** | Public name of the current lessee | 
**currentLeasingHeightFrom** | **Integer** | Block height when the lease starts | 
**currentLeasingHeightTo** | **Integer** | Block height when the lease ends | 
**nextLessee** | **String** | Account id of the next lessee | 
**nextLesseeName** | **String** | Public name of the next lessee | 
**nextLeasingHeightFrom** | **Integer** | Block height when the next lease starts | 
**nextLeasingHeightTo** | **Integer** | Block height when the next lease ends | 
**lessors** | [**List&lt;Lessor&gt;**](Lessor.md) | All current and future lessors |  [optional]
**publicName** | **String** | Account public name | 
