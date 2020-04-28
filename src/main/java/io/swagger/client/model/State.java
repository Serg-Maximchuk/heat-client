/*
 * HEAT API
 * The HEAT <u><b>INTERACTIVE</b></u> REST API, 
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * State class
 */
@Schema(description = "State class")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-28T22:39:51.557155300+03:00[Europe/Helsinki]")
public class State {
  @SerializedName("isScanning")
  private Boolean isScanning = false;

  @SerializedName("cumulativeDifficulty")
  private String cumulativeDifficulty = null;

  @SerializedName("numberOfBlocks")
  private Integer numberOfBlocks = null;

  @SerializedName("numberOfTransactions")
  private Integer numberOfTransactions = null;

  @SerializedName("numberOfUnconfirmedTransactions")
  private Integer numberOfUnconfirmedTransactions = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("lastBlock")
  private String lastBlock = null;

  @SerializedName("lastBlockTimestamp")
  private Integer lastBlockTimestamp = null;

  @SerializedName("application")
  private String application = null;

  @SerializedName("lastBlockchainFeederHeight")
  private Integer lastBlockchainFeederHeight = null;

  @SerializedName("time")
  private Integer time = null;

  @SerializedName("lastBlockchainFeeder")
  private String lastBlockchainFeeder = null;

  @SerializedName("initialCoinSupply")
  private String initialCoinSupply = null;

  @SerializedName("currentCoinSupply")
  private String currentCoinSupply = null;

  @SerializedName("numberOfPeers")
  private Integer numberOfPeers = null;

  @SerializedName("numberOfUnlockedAccounts")
  private Integer numberOfUnlockedAccounts = null;

  @SerializedName("maxMemory")
  private Long maxMemory = null;

  @SerializedName("freeMemory")
  private Long freeMemory = null;

  @SerializedName("peerPort")
  private Integer peerPort = null;

  @SerializedName("availableProcessors")
  private Integer availableProcessors = null;

  @SerializedName("numberOfAccounts")
  private Integer numberOfAccounts = null;

  @SerializedName("needsAdminPassword")
  private Boolean needsAdminPassword = false;

  @SerializedName("totalMemory")
  private Long totalMemory = null;

  @SerializedName("isOffline")
  private Boolean isOffline = false;

  public State isScanning(Boolean isScanning) {
    this.isScanning = isScanning;
    return this;
  }

   /**
   * True if this node is scanning the blockchain, false otherwise
   * @return isScanning
  **/
  @Schema(description = "True if this node is scanning the blockchain, false otherwise")
  public Boolean isIsScanning() {
    return isScanning;
  }

  public void setIsScanning(Boolean isScanning) {
    this.isScanning = isScanning;
  }

  public State cumulativeDifficulty(String cumulativeDifficulty) {
    this.cumulativeDifficulty = cumulativeDifficulty;
    return this;
  }

   /**
   * The current cumulative miner difficulty
   * @return cumulativeDifficulty
  **/
  @Schema(description = "The current cumulative miner difficulty")
  public String getCumulativeDifficulty() {
    return cumulativeDifficulty;
  }

  public void setCumulativeDifficulty(String cumulativeDifficulty) {
    this.cumulativeDifficulty = cumulativeDifficulty;
  }

  public State numberOfBlocks(Integer numberOfBlocks) {
    this.numberOfBlocks = numberOfBlocks;
    return this;
  }

   /**
   * The number of blocks (height + 1) in the blockchain
   * @return numberOfBlocks
  **/
  @Schema(description = "The number of blocks (height + 1) in the blockchain")
  public Integer getNumberOfBlocks() {
    return numberOfBlocks;
  }

  public void setNumberOfBlocks(Integer numberOfBlocks) {
    this.numberOfBlocks = numberOfBlocks;
  }

  public State numberOfTransactions(Integer numberOfTransactions) {
    this.numberOfTransactions = numberOfTransactions;
    return this;
  }

   /**
   * The number of transactions in the blockchain
   * @return numberOfTransactions
  **/
  @Schema(description = "The number of transactions in the blockchain")
  public Integer getNumberOfTransactions() {
    return numberOfTransactions;
  }

  public void setNumberOfTransactions(Integer numberOfTransactions) {
    this.numberOfTransactions = numberOfTransactions;
  }

  public State numberOfUnconfirmedTransactions(Integer numberOfUnconfirmedTransactions) {
    this.numberOfUnconfirmedTransactions = numberOfUnconfirmedTransactions;
    return this;
  }

   /**
   * The number of unconfirmed transactions
   * @return numberOfUnconfirmedTransactions
  **/
  @Schema(description = "The number of unconfirmed transactions")
  public Integer getNumberOfUnconfirmedTransactions() {
    return numberOfUnconfirmedTransactions;
  }

  public void setNumberOfUnconfirmedTransactions(Integer numberOfUnconfirmedTransactions) {
    this.numberOfUnconfirmedTransactions = numberOfUnconfirmedTransactions;
  }

  public State version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The software version on this node
   * @return version
  **/
  @Schema(description = "The software version on this node")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public State lastBlock(String lastBlock) {
    this.lastBlock = lastBlock;
    return this;
  }

   /**
   * The last block numeric id
   * @return lastBlock
  **/
  @Schema(description = "The last block numeric id")
  public String getLastBlock() {
    return lastBlock;
  }

  public void setLastBlock(String lastBlock) {
    this.lastBlock = lastBlock;
  }

  public State lastBlockTimestamp(Integer lastBlockTimestamp) {
    this.lastBlockTimestamp = lastBlockTimestamp;
    return this;
  }

   /**
   * Timestamp of the last block
   * @return lastBlockTimestamp
  **/
  @Schema(description = "Timestamp of the last block")
  public Integer getLastBlockTimestamp() {
    return lastBlockTimestamp;
  }

  public void setLastBlockTimestamp(Integer lastBlockTimestamp) {
    this.lastBlockTimestamp = lastBlockTimestamp;
  }

  public State application(String application) {
    this.application = application;
    return this;
  }

   /**
   * The name of the software running on this node
   * @return application
  **/
  @Schema(description = "The name of the software running on this node")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public State lastBlockchainFeederHeight(Integer lastBlockchainFeederHeight) {
    this.lastBlockchainFeederHeight = lastBlockchainFeederHeight;
    return this;
  }

   /**
   * The height of the last blockchain feeder
   * @return lastBlockchainFeederHeight
  **/
  @Schema(description = "The height of the last blockchain feeder")
  public Integer getLastBlockchainFeederHeight() {
    return lastBlockchainFeederHeight;
  }

  public void setLastBlockchainFeederHeight(Integer lastBlockchainFeederHeight) {
    this.lastBlockchainFeederHeight = lastBlockchainFeederHeight;
  }

  public State time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * The current node time (in seconds since 24 november 2013 00:00 UTC)
   * @return time
  **/
  @Schema(description = "The current node time (in seconds since 24 november 2013 00:00 UTC)")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public State lastBlockchainFeeder(String lastBlockchainFeeder) {
    this.lastBlockchainFeeder = lastBlockchainFeeder;
    return this;
  }

   /**
   * The announced name of the feeder of the last blockchain
   * @return lastBlockchainFeeder
  **/
  @Schema(description = "The announced name of the feeder of the last blockchain")
  public String getLastBlockchainFeeder() {
    return lastBlockchainFeeder;
  }

  public void setLastBlockchainFeeder(String lastBlockchainFeeder) {
    this.lastBlockchainFeeder = lastBlockchainFeeder;
  }

  public State initialCoinSupply(String initialCoinSupply) {
    this.initialCoinSupply = initialCoinSupply;
    return this;
  }

   /**
   * Amount of HEAT in genesis block (in HQT, 1 HQT is 0.00000001 HEAT)
   * @return initialCoinSupply
  **/
  @Schema(description = "Amount of HEAT in genesis block (in HQT, 1 HQT is 0.00000001 HEAT)")
  public String getInitialCoinSupply() {
    return initialCoinSupply;
  }

  public void setInitialCoinSupply(String initialCoinSupply) {
    this.initialCoinSupply = initialCoinSupply;
  }

  public State currentCoinSupply(String currentCoinSupply) {
    this.currentCoinSupply = currentCoinSupply;
    return this;
  }

   /**
   * Current total amount of HEAT (in HQT, 1 HQT is 0.00000001 HEAT)
   * @return currentCoinSupply
  **/
  @Schema(description = "Current total amount of HEAT (in HQT, 1 HQT is 0.00000001 HEAT)")
  public String getCurrentCoinSupply() {
    return currentCoinSupply;
  }

  public void setCurrentCoinSupply(String currentCoinSupply) {
    this.currentCoinSupply = currentCoinSupply;
  }

  public State numberOfPeers(Integer numberOfPeers) {
    this.numberOfPeers = numberOfPeers;
    return this;
  }

   /**
   * The number of known peers on the network
   * @return numberOfPeers
  **/
  @Schema(description = "The number of known peers on the network")
  public Integer getNumberOfPeers() {
    return numberOfPeers;
  }

  public void setNumberOfPeers(Integer numberOfPeers) {
    this.numberOfPeers = numberOfPeers;
  }

  public State numberOfUnlockedAccounts(Integer numberOfUnlockedAccounts) {
    this.numberOfUnlockedAccounts = numberOfUnlockedAccounts;
    return this;
  }

   /**
   * The number of unlocked accounts on this node
   * @return numberOfUnlockedAccounts
  **/
  @Schema(description = "The number of unlocked accounts on this node")
  public Integer getNumberOfUnlockedAccounts() {
    return numberOfUnlockedAccounts;
  }

  public void setNumberOfUnlockedAccounts(Integer numberOfUnlockedAccounts) {
    this.numberOfUnlockedAccounts = numberOfUnlockedAccounts;
  }

  public State maxMemory(Long maxMemory) {
    this.maxMemory = maxMemory;
    return this;
  }

   /**
   * The maximum amount of memory the node may use (in Bytes)
   * @return maxMemory
  **/
  @Schema(description = "The maximum amount of memory the node may use (in Bytes)")
  public Long getMaxMemory() {
    return maxMemory;
  }

  public void setMaxMemory(Long maxMemory) {
    this.maxMemory = maxMemory;
  }

  public State freeMemory(Long freeMemory) {
    this.freeMemory = freeMemory;
    return this;
  }

   /**
   * The amount of free memory on this node (in Bytes)
   * @return freeMemory
  **/
  @Schema(description = "The amount of free memory on this node (in Bytes)")
  public Long getFreeMemory() {
    return freeMemory;
  }

  public void setFreeMemory(Long freeMemory) {
    this.freeMemory = freeMemory;
  }

  public State peerPort(Integer peerPort) {
    this.peerPort = peerPort;
    return this;
  }

   /**
   * The port used for connecting to peers
   * @return peerPort
  **/
  @Schema(description = "The port used for connecting to peers")
  public Integer getPeerPort() {
    return peerPort;
  }

  public void setPeerPort(Integer peerPort) {
    this.peerPort = peerPort;
  }

  public State availableProcessors(Integer availableProcessors) {
    this.availableProcessors = availableProcessors;
    return this;
  }

   /**
   * The number of processors on this node
   * @return availableProcessors
  **/
  @Schema(description = "The number of processors on this node")
  public Integer getAvailableProcessors() {
    return availableProcessors;
  }

  public void setAvailableProcessors(Integer availableProcessors) {
    this.availableProcessors = availableProcessors;
  }

  public State numberOfAccounts(Integer numberOfAccounts) {
    this.numberOfAccounts = numberOfAccounts;
    return this;
  }

   /**
   * The number of accounts in the blockchain
   * @return numberOfAccounts
  **/
  @Schema(description = "The number of accounts in the blockchain")
  public Integer getNumberOfAccounts() {
    return numberOfAccounts;
  }

  public void setNumberOfAccounts(Integer numberOfAccounts) {
    this.numberOfAccounts = numberOfAccounts;
  }

  public State needsAdminPassword(Boolean needsAdminPassword) {
    this.needsAdminPassword = needsAdminPassword;
    return this;
  }

   /**
   * True if the heat.disableAdminPassword property is false
   * @return needsAdminPassword
  **/
  @Schema(description = "True if the heat.disableAdminPassword property is false")
  public Boolean isNeedsAdminPassword() {
    return needsAdminPassword;
  }

  public void setNeedsAdminPassword(Boolean needsAdminPassword) {
    this.needsAdminPassword = needsAdminPassword;
  }

  public State totalMemory(Long totalMemory) {
    this.totalMemory = totalMemory;
    return this;
  }

   /**
   * The amount of memory this node is using (in Bytes)
   * @return totalMemory
  **/
  @Schema(description = "The amount of memory this node is using (in Bytes)")
  public Long getTotalMemory() {
    return totalMemory;
  }

  public void setTotalMemory(Long totalMemory) {
    this.totalMemory = totalMemory;
  }

  public State isOffline(Boolean isOffline) {
    this.isOffline = isOffline;
    return this;
  }

   /**
   * True if this node is connected to other peers, false otherwise
   * @return isOffline
  **/
  @Schema(description = "True if this node is connected to other peers, false otherwise")
  public Boolean isIsOffline() {
    return isOffline;
  }

  public void setIsOffline(Boolean isOffline) {
    this.isOffline = isOffline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    State state = (State) o;
    return Objects.equals(this.isScanning, state.isScanning) &&
        Objects.equals(this.cumulativeDifficulty, state.cumulativeDifficulty) &&
        Objects.equals(this.numberOfBlocks, state.numberOfBlocks) &&
        Objects.equals(this.numberOfTransactions, state.numberOfTransactions) &&
        Objects.equals(this.numberOfUnconfirmedTransactions, state.numberOfUnconfirmedTransactions) &&
        Objects.equals(this.version, state.version) &&
        Objects.equals(this.lastBlock, state.lastBlock) &&
        Objects.equals(this.lastBlockTimestamp, state.lastBlockTimestamp) &&
        Objects.equals(this.application, state.application) &&
        Objects.equals(this.lastBlockchainFeederHeight, state.lastBlockchainFeederHeight) &&
        Objects.equals(this.time, state.time) &&
        Objects.equals(this.lastBlockchainFeeder, state.lastBlockchainFeeder) &&
        Objects.equals(this.initialCoinSupply, state.initialCoinSupply) &&
        Objects.equals(this.currentCoinSupply, state.currentCoinSupply) &&
        Objects.equals(this.numberOfPeers, state.numberOfPeers) &&
        Objects.equals(this.numberOfUnlockedAccounts, state.numberOfUnlockedAccounts) &&
        Objects.equals(this.maxMemory, state.maxMemory) &&
        Objects.equals(this.freeMemory, state.freeMemory) &&
        Objects.equals(this.peerPort, state.peerPort) &&
        Objects.equals(this.availableProcessors, state.availableProcessors) &&
        Objects.equals(this.numberOfAccounts, state.numberOfAccounts) &&
        Objects.equals(this.needsAdminPassword, state.needsAdminPassword) &&
        Objects.equals(this.totalMemory, state.totalMemory) &&
        Objects.equals(this.isOffline, state.isOffline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isScanning, cumulativeDifficulty, numberOfBlocks, numberOfTransactions, numberOfUnconfirmedTransactions, version, lastBlock, lastBlockTimestamp, application, lastBlockchainFeederHeight, time, lastBlockchainFeeder, initialCoinSupply, currentCoinSupply, numberOfPeers, numberOfUnlockedAccounts, maxMemory, freeMemory, peerPort, availableProcessors, numberOfAccounts, needsAdminPassword, totalMemory, isOffline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class State {\n");
    
    sb.append("    isScanning: ").append(toIndentedString(isScanning)).append("\n");
    sb.append("    cumulativeDifficulty: ").append(toIndentedString(cumulativeDifficulty)).append("\n");
    sb.append("    numberOfBlocks: ").append(toIndentedString(numberOfBlocks)).append("\n");
    sb.append("    numberOfTransactions: ").append(toIndentedString(numberOfTransactions)).append("\n");
    sb.append("    numberOfUnconfirmedTransactions: ").append(toIndentedString(numberOfUnconfirmedTransactions)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    lastBlock: ").append(toIndentedString(lastBlock)).append("\n");
    sb.append("    lastBlockTimestamp: ").append(toIndentedString(lastBlockTimestamp)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    lastBlockchainFeederHeight: ").append(toIndentedString(lastBlockchainFeederHeight)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    lastBlockchainFeeder: ").append(toIndentedString(lastBlockchainFeeder)).append("\n");
    sb.append("    initialCoinSupply: ").append(toIndentedString(initialCoinSupply)).append("\n");
    sb.append("    currentCoinSupply: ").append(toIndentedString(currentCoinSupply)).append("\n");
    sb.append("    numberOfPeers: ").append(toIndentedString(numberOfPeers)).append("\n");
    sb.append("    numberOfUnlockedAccounts: ").append(toIndentedString(numberOfUnlockedAccounts)).append("\n");
    sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
    sb.append("    freeMemory: ").append(toIndentedString(freeMemory)).append("\n");
    sb.append("    peerPort: ").append(toIndentedString(peerPort)).append("\n");
    sb.append("    availableProcessors: ").append(toIndentedString(availableProcessors)).append("\n");
    sb.append("    numberOfAccounts: ").append(toIndentedString(numberOfAccounts)).append("\n");
    sb.append("    needsAdminPassword: ").append(toIndentedString(needsAdminPassword)).append("\n");
    sb.append("    totalMemory: ").append(toIndentedString(totalMemory)).append("\n");
    sb.append("    isOffline: ").append(toIndentedString(isOffline)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
