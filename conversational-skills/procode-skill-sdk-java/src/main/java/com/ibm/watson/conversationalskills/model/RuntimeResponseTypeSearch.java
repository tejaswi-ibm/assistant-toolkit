/*
 Copyright 2024 IBM Corporation

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package com.ibm.watson.conversationalskills.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ibm.watson.conversationalskills.model.ResponseGenericChannel;
import com.ibm.watson.conversationalskills.model.SearchResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RuntimeResponseTypeSearch
 */
@JsonPropertyOrder({
  RuntimeResponseTypeSearch.JSON_PROPERTY_RESPONSE_TYPE,
  RuntimeResponseTypeSearch.JSON_PROPERTY_HEADER,
  RuntimeResponseTypeSearch.JSON_PROPERTY_PRIMARY_RESULTS,
  RuntimeResponseTypeSearch.JSON_PROPERTY_ADDITIONAL_RESULTS,
  RuntimeResponseTypeSearch.JSON_PROPERTY_CHANNELS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class RuntimeResponseTypeSearch {
  public static final String JSON_PROPERTY_RESPONSE_TYPE = "response_type";
  private String responseType;

  public static final String JSON_PROPERTY_HEADER = "header";
  private String header;

  public static final String JSON_PROPERTY_PRIMARY_RESULTS = "primary_results";
  private List<SearchResult> primaryResults = new ArrayList<>();

  public static final String JSON_PROPERTY_ADDITIONAL_RESULTS = "additional_results";
  private List<SearchResult> additionalResults = new ArrayList<>();

  public static final String JSON_PROPERTY_CHANNELS = "channels";
  private List<ResponseGenericChannel> channels;

  public RuntimeResponseTypeSearch() {
  }

  public RuntimeResponseTypeSearch responseType(String responseType) {
    
    this.responseType = responseType;
    return this;
  }

  /**
   * The type of response returned by the dialog node. The specified response type must be supported by the client application or channel.
   * @return responseType
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESPONSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResponseType() {
    return responseType;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResponseType(String responseType) {
    this.responseType = responseType;
  }

  public RuntimeResponseTypeSearch header(String header) {
    
    this.header = header;
    return this;
  }

  /**
   * The title or introductory text to show before the response. This text is defined in the search skill configuration.
   * @return header
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHeader() {
    return header;
  }


  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeader(String header) {
    this.header = header;
  }

  public RuntimeResponseTypeSearch primaryResults(List<SearchResult> primaryResults) {
    
    this.primaryResults = primaryResults;
    return this;
  }

  public RuntimeResponseTypeSearch addPrimaryResultsItem(SearchResult primaryResultsItem) {
    if (this.primaryResults == null) {
      this.primaryResults = new ArrayList<>();
    }
    this.primaryResults.add(primaryResultsItem);
    return this;
  }

  /**
   * An array of objects that contains the search results to be displayed in the initial response to the user.
   * @return primaryResults
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRIMARY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SearchResult> getPrimaryResults() {
    return primaryResults;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrimaryResults(List<SearchResult> primaryResults) {
    this.primaryResults = primaryResults;
  }

  public RuntimeResponseTypeSearch additionalResults(List<SearchResult> additionalResults) {
    
    this.additionalResults = additionalResults;
    return this;
  }

  public RuntimeResponseTypeSearch addAdditionalResultsItem(SearchResult additionalResultsItem) {
    if (this.additionalResults == null) {
      this.additionalResults = new ArrayList<>();
    }
    this.additionalResults.add(additionalResultsItem);
    return this;
  }

  /**
   * An array of objects that contains additional search results that can be displayed to the user upon request.
   * @return additionalResults
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SearchResult> getAdditionalResults() {
    return additionalResults;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAdditionalResults(List<SearchResult> additionalResults) {
    this.additionalResults = additionalResults;
  }

  public RuntimeResponseTypeSearch channels(List<ResponseGenericChannel> channels) {
    
    this.channels = channels;
    return this;
  }

  public RuntimeResponseTypeSearch addChannelsItem(ResponseGenericChannel channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

  /**
   * An array of objects specifying channels for which the response is intended. If **channels** is present, the response is intended for a built-in integration and should not be handled by an API client.
   * @return channels
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResponseGenericChannel> getChannels() {
    return channels;
  }


  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannels(List<ResponseGenericChannel> channels) {
    this.channels = channels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeResponseTypeSearch runtimeResponseTypeSearch = (RuntimeResponseTypeSearch) o;
    return Objects.equals(this.responseType, runtimeResponseTypeSearch.responseType) &&
        Objects.equals(this.header, runtimeResponseTypeSearch.header) &&
        Objects.equals(this.primaryResults, runtimeResponseTypeSearch.primaryResults) &&
        Objects.equals(this.additionalResults, runtimeResponseTypeSearch.additionalResults) &&
        Objects.equals(this.channels, runtimeResponseTypeSearch.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseType, header, primaryResults, additionalResults, channels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeResponseTypeSearch {\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    primaryResults: ").append(toIndentedString(primaryResults)).append("\n");
    sb.append("    additionalResults: ").append(toIndentedString(additionalResults)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

