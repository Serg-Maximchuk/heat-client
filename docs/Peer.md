# Peer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hallmark** | **String** | Hex string of the peer&#x27;s hallmark, if it is defined |  [optional]
**downloadedVolume** | **Long** | Number of bytes downloaded by the peer | 
**address** | **String** | IP address or DNS name of the peer | 
**weight** | **Integer** | Peer&#x27;s weight value | 
**uploadedVolume** | **Long** | Number of bytes uploaded by the peer | 
**version** | **String** | Version of the software running on the peer | 
**platform** | **String** | String representing the peer&#x27;s platform | 
**lastUpdated** | **Integer** | timestamp (in seconds since the genesis block) of the last peer status update | 
**blacklisted** | **Boolean** | True if the peer is blacklisted | 
**blacklistingCause** | **String** | The cause of blacklisting (if blacklisted is true) | 
**announcedAddress** | **String** | The name that the peer announced to the network (could be a DNS name, IP address, or any other string) | 
**application** | **String** | The name of the software application | 
**state** | **Integer** | The state of the peer: 0 for NON_CONNECTED, 1 for CONNECTED, or 2 for DISCONNECTED | 
**shareAddress** | **Boolean** | True if the address is allowed to be shared with other peers | 
**blockchainHeight** | **Integer** | Last known blockchain height | 
