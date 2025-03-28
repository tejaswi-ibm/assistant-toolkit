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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ibm.watson.conversationalskills.model.ChannelTransferInfo;
import com.ibm.watson.conversationalskills.model.DialogNodeOutputOptionsElement;
import com.ibm.watson.conversationalskills.model.DialogSuggestion;
import com.ibm.watson.conversationalskills.model.ResponseGenericChannel;
import com.ibm.watson.conversationalskills.model.ResponseTypeSlots;
import com.ibm.watson.conversationalskills.model.ResponseTypeSlotsConfirmation;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypeAudio;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypeChannelTransfer;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypeConnectToAgent;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypeConnectToAgentAgentAvailable;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypeConnectToAgentAgentUnavailable;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypeDate;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypeIframe;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypeImage;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypeOption;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypePause;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypeSearch;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypeSuggestion;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypeText;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypeUserDefined;
import com.ibm.watson.conversationalskills.model.RuntimeResponseTypeVideo;
import com.ibm.watson.conversationalskills.model.SearchResult;
import com.ibm.watson.conversationalskills.model.SlotInFlight;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ConversationalResponseGeneric
 */
@JsonPropertyOrder({
  ConversationalResponseGeneric.JSON_PROPERTY_RESPONSE_TYPE,
  ConversationalResponseGeneric.JSON_PROPERTY_SLOTS,
  ConversationalResponseGeneric.JSON_PROPERTY_CONFIRMATION,
  ConversationalResponseGeneric.JSON_PROPERTY_TEXT,
  ConversationalResponseGeneric.JSON_PROPERTY_CHANNELS,
  ConversationalResponseGeneric.JSON_PROPERTY_TIME,
  ConversationalResponseGeneric.JSON_PROPERTY_TYPING,
  ConversationalResponseGeneric.JSON_PROPERTY_SOURCE,
  ConversationalResponseGeneric.JSON_PROPERTY_TITLE,
  ConversationalResponseGeneric.JSON_PROPERTY_DESCRIPTION,
  ConversationalResponseGeneric.JSON_PROPERTY_ALT_TEXT,
  ConversationalResponseGeneric.JSON_PROPERTY_PREFERENCE,
  ConversationalResponseGeneric.JSON_PROPERTY_OPTIONS,
  ConversationalResponseGeneric.JSON_PROPERTY_MESSAGE_TO_HUMAN_AGENT,
  ConversationalResponseGeneric.JSON_PROPERTY_AGENT_AVAILABLE,
  ConversationalResponseGeneric.JSON_PROPERTY_AGENT_UNAVAILABLE,
  ConversationalResponseGeneric.JSON_PROPERTY_TRANSFER_INFO,
  ConversationalResponseGeneric.JSON_PROPERTY_TOPIC,
  ConversationalResponseGeneric.JSON_PROPERTY_SUGGESTIONS,
  ConversationalResponseGeneric.JSON_PROPERTY_MESSAGE_TO_USER,
  ConversationalResponseGeneric.JSON_PROPERTY_HEADER,
  ConversationalResponseGeneric.JSON_PROPERTY_PRIMARY_RESULTS,
  ConversationalResponseGeneric.JSON_PROPERTY_ADDITIONAL_RESULTS,
  ConversationalResponseGeneric.JSON_PROPERTY_USER_DEFINED,
  ConversationalResponseGeneric.JSON_PROPERTY_CHANNEL_OPTIONS,
  ConversationalResponseGeneric.JSON_PROPERTY_IMAGE_URL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")

@JsonSubTypes({
  @JsonSubTypes.Type(value = RuntimeResponseTypeAudio.class, name = "audio"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeChannelTransfer.class, name = "channel_transfer"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeConnectToAgent.class, name = "connect_to_agent"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeDate.class, name = "date"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeIframe.class, name = "iframe"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeImage.class, name = "image"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeOption.class, name = "option"),
  @JsonSubTypes.Type(value = RuntimeResponseTypePause.class, name = "pause"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeSearch.class, name = "search"),
  @JsonSubTypes.Type(value = ResponseTypeSlots.class, name = "slots"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeSuggestion.class, name = "suggestion"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeText.class, name = "text"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeUserDefined.class, name = "user_defined"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeVideo.class, name = "video"),
  @JsonSubTypes.Type(value = ResponseTypeSlots.class, name = "ResponseTypeSlots"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeAudio.class, name = "RuntimeResponseTypeAudio"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeChannelTransfer.class, name = "RuntimeResponseTypeChannelTransfer"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeConnectToAgent.class, name = "RuntimeResponseTypeConnectToAgent"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeDate.class, name = "RuntimeResponseTypeDate"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeIframe.class, name = "RuntimeResponseTypeIframe"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeImage.class, name = "RuntimeResponseTypeImage"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeOption.class, name = "RuntimeResponseTypeOption"),
  @JsonSubTypes.Type(value = RuntimeResponseTypePause.class, name = "RuntimeResponseTypePause"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeSearch.class, name = "RuntimeResponseTypeSearch"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeSuggestion.class, name = "RuntimeResponseTypeSuggestion"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeText.class, name = "RuntimeResponseTypeText"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeUserDefined.class, name = "RuntimeResponseTypeUserDefined"),
  @JsonSubTypes.Type(value = RuntimeResponseTypeVideo.class, name = "RuntimeResponseTypeVideo"),
})

public class ConversationalResponseGeneric {
  public static final String JSON_PROPERTY_RESPONSE_TYPE = "response_type";
  private String responseType;

  public static final String JSON_PROPERTY_SLOTS = "slots";
  private List<SlotInFlight> slots = new ArrayList<>();

  public static final String JSON_PROPERTY_CONFIRMATION = "confirmation";
  private ResponseTypeSlotsConfirmation confirmation;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_CHANNELS = "channels";
  private List<ResponseGenericChannel> channels;

  public static final String JSON_PROPERTY_TIME = "time";
  private Integer time;

  public static final String JSON_PROPERTY_TYPING = "typing";
  private Boolean typing;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ALT_TEXT = "alt_text";
  private String altText;

  /**
   * The preferred type of control to display.
   */
  public enum PreferenceEnum {
    DROPDOWN("dropdown"),
    
    BUTTON("button");

    private String value;

    PreferenceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PreferenceEnum fromValue(String value) {
      for (PreferenceEnum b : PreferenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PREFERENCE = "preference";
  private PreferenceEnum preference;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<DialogNodeOutputOptionsElement> options = new ArrayList<>();

  public static final String JSON_PROPERTY_MESSAGE_TO_HUMAN_AGENT = "message_to_human_agent";
  private String messageToHumanAgent;

  public static final String JSON_PROPERTY_AGENT_AVAILABLE = "agent_available";
  private RuntimeResponseTypeConnectToAgentAgentAvailable agentAvailable;

  public static final String JSON_PROPERTY_AGENT_UNAVAILABLE = "agent_unavailable";
  private RuntimeResponseTypeConnectToAgentAgentUnavailable agentUnavailable;

  public static final String JSON_PROPERTY_TRANSFER_INFO = "transfer_info";
  private ChannelTransferInfo transferInfo;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  private String topic;

  public static final String JSON_PROPERTY_SUGGESTIONS = "suggestions";
  private List<DialogSuggestion> suggestions = new ArrayList<>();

  public static final String JSON_PROPERTY_MESSAGE_TO_USER = "message_to_user";
  private String messageToUser;

  public static final String JSON_PROPERTY_HEADER = "header";
  private String header;

  public static final String JSON_PROPERTY_PRIMARY_RESULTS = "primary_results";
  private List<SearchResult> primaryResults = new ArrayList<>();

  public static final String JSON_PROPERTY_ADDITIONAL_RESULTS = "additional_results";
  private List<SearchResult> additionalResults = new ArrayList<>();

  public static final String JSON_PROPERTY_USER_DEFINED = "user_defined";
  private Map<String, Object> userDefined = new HashMap<>();

  public static final String JSON_PROPERTY_CHANNEL_OPTIONS = "channel_options";
  private Object channelOptions;

  public static final String JSON_PROPERTY_IMAGE_URL = "image_url";
  private String imageUrl;

  public ConversationalResponseGeneric() {
  }

  public ConversationalResponseGeneric responseType(String responseType) {
    
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

  public ConversationalResponseGeneric slots(List<SlotInFlight> slots) {
    
    this.slots = slots;
    return this;
  }

  public ConversationalResponseGeneric addSlotsItem(SlotInFlight slotsItem) {
    if (this.slots == null) {
      this.slots = new ArrayList<>();
    }
    this.slots.add(slotsItem);
    return this;
  }

  /**
   * The ordered list of slots in flight that WxA should strive to prompt/fill/repair.
   * @return slots
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SLOTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SlotInFlight> getSlots() {
    return slots;
  }


  @JsonProperty(JSON_PROPERTY_SLOTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlots(List<SlotInFlight> slots) {
    this.slots = slots;
  }

  public ConversationalResponseGeneric confirmation(ResponseTypeSlotsConfirmation confirmation) {
    
    this.confirmation = confirmation;
    return this;
  }

  /**
   * Get confirmation
   * @return confirmation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIRMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResponseTypeSlotsConfirmation getConfirmation() {
    return confirmation;
  }


  @JsonProperty(JSON_PROPERTY_CONFIRMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfirmation(ResponseTypeSlotsConfirmation confirmation) {
    this.confirmation = confirmation;
  }

  public ConversationalResponseGeneric text(String text) {
    
    this.text = text;
    return this;
  }

  /**
   * The text of the response.
   * @return text
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setText(String text) {
    this.text = text;
  }

  public ConversationalResponseGeneric channels(List<ResponseGenericChannel> channels) {
    
    this.channels = channels;
    return this;
  }

  public ConversationalResponseGeneric addChannelsItem(ResponseGenericChannel channelsItem) {
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

  public ConversationalResponseGeneric time(Integer time) {
    
    this.time = time;
    return this;
  }

  /**
   * How long to pause, in milliseconds.
   * @return time
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTime(Integer time) {
    this.time = time;
  }

  public ConversationalResponseGeneric typing(Boolean typing) {
    
    this.typing = typing;
    return this;
  }

  /**
   * Whether to send a \&quot;user is typing\&quot; event during the pause.
   * @return typing
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTyping() {
    return typing;
  }


  @JsonProperty(JSON_PROPERTY_TYPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTyping(Boolean typing) {
    this.typing = typing;
  }

  public ConversationalResponseGeneric source(String source) {
    
    this.source = source;
    return this;
  }

  /**
   * The &#x60;https:&#x60; URL of the embeddable content.
   * @return source
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSource(String source) {
    this.source = source;
  }

  public ConversationalResponseGeneric title(String title) {
    
    this.title = title;
    return this;
  }

  /**
   * The title or introductory text to show before the response.
   * @return title
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }

  public ConversationalResponseGeneric description(String description) {
    
    this.description = description;
    return this;
  }

  /**
   * The description to show with the the response.
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }

  public ConversationalResponseGeneric altText(String altText) {
    
    this.altText = altText;
    return this;
  }

  /**
   * Descriptive text that can be used for screen readers or other situations where the audio player cannot be seen.
   * @return altText
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAltText() {
    return altText;
  }


  @JsonProperty(JSON_PROPERTY_ALT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAltText(String altText) {
    this.altText = altText;
  }

  public ConversationalResponseGeneric preference(PreferenceEnum preference) {
    
    this.preference = preference;
    return this;
  }

  /**
   * The preferred type of control to display.
   * @return preference
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PreferenceEnum getPreference() {
    return preference;
  }


  @JsonProperty(JSON_PROPERTY_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreference(PreferenceEnum preference) {
    this.preference = preference;
  }

  public ConversationalResponseGeneric options(List<DialogNodeOutputOptionsElement> options) {
    
    this.options = options;
    return this;
  }

  public ConversationalResponseGeneric addOptionsItem(DialogNodeOutputOptionsElement optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * An array of objects describing the options from which the user can choose.
   * @return options
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<DialogNodeOutputOptionsElement> getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOptions(List<DialogNodeOutputOptionsElement> options) {
    this.options = options;
  }

  public ConversationalResponseGeneric messageToHumanAgent(String messageToHumanAgent) {
    
    this.messageToHumanAgent = messageToHumanAgent;
    return this;
  }

  /**
   * A message to be sent to the human agent who will be taking over the conversation.
   * @return messageToHumanAgent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_TO_HUMAN_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageToHumanAgent() {
    return messageToHumanAgent;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_TO_HUMAN_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageToHumanAgent(String messageToHumanAgent) {
    this.messageToHumanAgent = messageToHumanAgent;
  }

  public ConversationalResponseGeneric agentAvailable(RuntimeResponseTypeConnectToAgentAgentAvailable agentAvailable) {
    
    this.agentAvailable = agentAvailable;
    return this;
  }

  /**
   * Get agentAvailable
   * @return agentAvailable
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RuntimeResponseTypeConnectToAgentAgentAvailable getAgentAvailable() {
    return agentAvailable;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentAvailable(RuntimeResponseTypeConnectToAgentAgentAvailable agentAvailable) {
    this.agentAvailable = agentAvailable;
  }

  public ConversationalResponseGeneric agentUnavailable(RuntimeResponseTypeConnectToAgentAgentUnavailable agentUnavailable) {
    
    this.agentUnavailable = agentUnavailable;
    return this;
  }

  /**
   * Get agentUnavailable
   * @return agentUnavailable
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_UNAVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RuntimeResponseTypeConnectToAgentAgentUnavailable getAgentUnavailable() {
    return agentUnavailable;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_UNAVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentUnavailable(RuntimeResponseTypeConnectToAgentAgentUnavailable agentUnavailable) {
    this.agentUnavailable = agentUnavailable;
  }

  public ConversationalResponseGeneric transferInfo(ChannelTransferInfo transferInfo) {
    
    this.transferInfo = transferInfo;
    return this;
  }

  /**
   * Get transferInfo
   * @return transferInfo
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSFER_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ChannelTransferInfo getTransferInfo() {
    return transferInfo;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFER_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransferInfo(ChannelTransferInfo transferInfo) {
    this.transferInfo = transferInfo;
  }

  public ConversationalResponseGeneric topic(String topic) {
    
    this.topic = topic;
    return this;
  }

  /**
   * A label identifying the topic of the conversation, derived from the **title** property of the relevant node or the **topic** property of the dialog node response.
   * @return topic
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTopic() {
    return topic;
  }


  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopic(String topic) {
    this.topic = topic;
  }

  public ConversationalResponseGeneric suggestions(List<DialogSuggestion> suggestions) {
    
    this.suggestions = suggestions;
    return this;
  }

  public ConversationalResponseGeneric addSuggestionsItem(DialogSuggestion suggestionsItem) {
    if (this.suggestions == null) {
      this.suggestions = new ArrayList<>();
    }
    this.suggestions.add(suggestionsItem);
    return this;
  }

  /**
   * An array of objects describing the possible matching dialog nodes from which the user can choose.
   * @return suggestions
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUGGESTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<DialogSuggestion> getSuggestions() {
    return suggestions;
  }


  @JsonProperty(JSON_PROPERTY_SUGGESTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuggestions(List<DialogSuggestion> suggestions) {
    this.suggestions = suggestions;
  }

  public ConversationalResponseGeneric messageToUser(String messageToUser) {
    
    this.messageToUser = messageToUser;
    return this;
  }

  /**
   * The message to display to the user when initiating a channel transfer.
   * @return messageToUser
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MESSAGE_TO_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessageToUser() {
    return messageToUser;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_TO_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessageToUser(String messageToUser) {
    this.messageToUser = messageToUser;
  }

  public ConversationalResponseGeneric header(String header) {
    
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

  public ConversationalResponseGeneric primaryResults(List<SearchResult> primaryResults) {
    
    this.primaryResults = primaryResults;
    return this;
  }

  public ConversationalResponseGeneric addPrimaryResultsItem(SearchResult primaryResultsItem) {
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

  public ConversationalResponseGeneric additionalResults(List<SearchResult> additionalResults) {
    
    this.additionalResults = additionalResults;
    return this;
  }

  public ConversationalResponseGeneric addAdditionalResultsItem(SearchResult additionalResultsItem) {
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

  public ConversationalResponseGeneric userDefined(Map<String, Object> userDefined) {
    
    this.userDefined = userDefined;
    return this;
  }

  public ConversationalResponseGeneric putUserDefinedItem(String key, Object userDefinedItem) {
    this.userDefined.put(key, userDefinedItem);
    return this;
  }

  /**
   * An object containing any properties for the user-defined response type.
   * @return userDefined
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_DEFINED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getUserDefined() {
    return userDefined;
  }


  @JsonProperty(JSON_PROPERTY_USER_DEFINED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserDefined(Map<String, Object> userDefined) {
    this.userDefined = userDefined;
  }

  public ConversationalResponseGeneric channelOptions(Object channelOptions) {
    
    this.channelOptions = channelOptions;
    return this;
  }

  /**
   * For internal use only.
   * @return channelOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getChannelOptions() {
    return channelOptions;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelOptions(Object channelOptions) {
    this.channelOptions = channelOptions;
  }

  public ConversationalResponseGeneric imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * The URL of an image that shows a preview of the embedded content.
   * @return imageUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageUrl() {
    return imageUrl;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationalResponseGeneric conversationalResponseGeneric = (ConversationalResponseGeneric) o;
    return Objects.equals(this.responseType, conversationalResponseGeneric.responseType) &&
        Objects.equals(this.slots, conversationalResponseGeneric.slots) &&
        Objects.equals(this.confirmation, conversationalResponseGeneric.confirmation) &&
        Objects.equals(this.text, conversationalResponseGeneric.text) &&
        Objects.equals(this.channels, conversationalResponseGeneric.channels) &&
        Objects.equals(this.time, conversationalResponseGeneric.time) &&
        Objects.equals(this.typing, conversationalResponseGeneric.typing) &&
        Objects.equals(this.source, conversationalResponseGeneric.source) &&
        Objects.equals(this.title, conversationalResponseGeneric.title) &&
        Objects.equals(this.description, conversationalResponseGeneric.description) &&
        Objects.equals(this.altText, conversationalResponseGeneric.altText) &&
        Objects.equals(this.preference, conversationalResponseGeneric.preference) &&
        Objects.equals(this.options, conversationalResponseGeneric.options) &&
        Objects.equals(this.messageToHumanAgent, conversationalResponseGeneric.messageToHumanAgent) &&
        Objects.equals(this.agentAvailable, conversationalResponseGeneric.agentAvailable) &&
        Objects.equals(this.agentUnavailable, conversationalResponseGeneric.agentUnavailable) &&
        Objects.equals(this.transferInfo, conversationalResponseGeneric.transferInfo) &&
        Objects.equals(this.topic, conversationalResponseGeneric.topic) &&
        Objects.equals(this.suggestions, conversationalResponseGeneric.suggestions) &&
        Objects.equals(this.messageToUser, conversationalResponseGeneric.messageToUser) &&
        Objects.equals(this.header, conversationalResponseGeneric.header) &&
        Objects.equals(this.primaryResults, conversationalResponseGeneric.primaryResults) &&
        Objects.equals(this.additionalResults, conversationalResponseGeneric.additionalResults) &&
        Objects.equals(this.userDefined, conversationalResponseGeneric.userDefined) &&
        Objects.equals(this.channelOptions, conversationalResponseGeneric.channelOptions) &&
        Objects.equals(this.imageUrl, conversationalResponseGeneric.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseType, slots, confirmation, text, channels, time, typing, source, title, description, altText, preference, options, messageToHumanAgent, agentAvailable, agentUnavailable, transferInfo, topic, suggestions, messageToUser, header, primaryResults, additionalResults, userDefined, channelOptions, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationalResponseGeneric {\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    typing: ").append(toIndentedString(typing)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    messageToHumanAgent: ").append(toIndentedString(messageToHumanAgent)).append("\n");
    sb.append("    agentAvailable: ").append(toIndentedString(agentAvailable)).append("\n");
    sb.append("    agentUnavailable: ").append(toIndentedString(agentUnavailable)).append("\n");
    sb.append("    transferInfo: ").append(toIndentedString(transferInfo)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
    sb.append("    messageToUser: ").append(toIndentedString(messageToUser)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    primaryResults: ").append(toIndentedString(primaryResults)).append("\n");
    sb.append("    additionalResults: ").append(toIndentedString(additionalResults)).append("\n");
    sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
    sb.append("    channelOptions: ").append(toIndentedString(channelOptions)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

