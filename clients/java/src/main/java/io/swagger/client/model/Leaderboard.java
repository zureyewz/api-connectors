/**
 * BitMEX API
 * REST API for the BitMEX.com trading platform.<br><br><a href=\"/app/restAPI\">REST Documentation</a><br><a href=\"/app/wsAPI\">Websocket Documentation</a>
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Leaderboard
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-05T09:40:48.217-05:00")
public class Leaderboard   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isRealName")
  private Boolean isRealName = null;

  @JsonProperty("isMe")
  private Boolean isMe = null;

  @JsonProperty("profit")
  private Double profit = null;

  public Leaderboard name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Leaderboard isRealName(Boolean isRealName) {
    this.isRealName = isRealName;
    return this;
  }

   /**
   * Get isRealName
   * @return isRealName
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsRealName() {
    return isRealName;
  }

  public void setIsRealName(Boolean isRealName) {
    this.isRealName = isRealName;
  }

  public Leaderboard isMe(Boolean isMe) {
    this.isMe = isMe;
    return this;
  }

   /**
   * Get isMe
   * @return isMe
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsMe() {
    return isMe;
  }

  public void setIsMe(Boolean isMe) {
    this.isMe = isMe;
  }

  public Leaderboard profit(Double profit) {
    this.profit = profit;
    return this;
  }

   /**
   * Get profit
   * @return profit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getProfit() {
    return profit;
  }

  public void setProfit(Double profit) {
    this.profit = profit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Leaderboard leaderboard = (Leaderboard) o;
    return Objects.equals(this.name, leaderboard.name) &&
        Objects.equals(this.isRealName, leaderboard.isRealName) &&
        Objects.equals(this.isMe, leaderboard.isMe) &&
        Objects.equals(this.profit, leaderboard.profit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isRealName, isMe, profit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leaderboard {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isRealName: ").append(toIndentedString(isRealName)).append("\n");
    sb.append("    isMe: ").append(toIndentedString(isMe)).append("\n");
    sb.append("    profit: ").append(toIndentedString(profit)).append("\n");
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
