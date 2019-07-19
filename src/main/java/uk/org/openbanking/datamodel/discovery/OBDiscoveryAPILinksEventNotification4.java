/**
 *
 * The contents of this file are subject to the terms of the Common Development and
 *  Distribution License (the License). You may not use this file except in compliance with the
 *  License.
 *
 *  You can obtain a copy of the License at https://forgerock.org/cddlv1-0/. See the License for the
 *  specific language governing permission and limitations under the License.
 *
 *  When distributing Covered Software, include this CDDL Header Notice in each file and include
 *  the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 *  Header, with the fields enclosed by brackets [] replaced by your own identifying
 *  information: "Portions copyright [year] [name of copyright owner]".
 *
 *  Copyright 2019 ForgeRock AS.
 */
package uk.org.openbanking.datamodel.discovery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import io.swagger.annotations.ApiModel;

import java.util.Objects;

@ApiModel(description = "Event notification endpoints corresponding to a specific version")
public class OBDiscoveryAPILinksEventNotification4 implements OBDiscoveryAPILinks{

    @JsonProperty("CreateCallbackUrl")
    private String createCallbackUrl;
    @JsonProperty("GetCallbackUrls")
    private String getCallbackUrls;
    @JsonProperty("AmendCallbackUrl")
    private String amendCallbackUrl;
    @JsonProperty("DeleteCallbackUrl")
    private String deleteCallbackUrl;

    @JsonProperty("CreateEventSubscription")
    private String createEventSubscription;
    @JsonProperty("GetEventSubscriptions")
    private String getEventSubscriptions;
    @JsonProperty("AmendEventSubscription")
    private String amendEventSubscription;
    @JsonProperty("DeleteEventSubscription")
    private String deleteEventSubscription;

    @JsonProperty("EventPoll")
    private String eventPoll;
    
    public OBDiscoveryAPILinksEventNotification4() {
    }

    public String getCreateCallbackUrl() {
        return createCallbackUrl;
    }

    public void setCreateCallbackUrl(String createCallbackUrl) {
        this.createCallbackUrl = createCallbackUrl;
    }

    public OBDiscoveryAPILinksEventNotification4 createCallbackUrl(String createCallbackUrl) {
        this.createCallbackUrl = createCallbackUrl;
        return this;
    }

    public String getGetCallbackUrls() {
        return getCallbackUrls;
    }

    public void setGetCallbackUrls(String getCallbackUrls) {
        this.getCallbackUrls = getCallbackUrls;
    }

    public OBDiscoveryAPILinksEventNotification4 getCallbackUrls(String getCallbackUrls) {
        this.getCallbackUrls = getCallbackUrls;
        return this;
    }

    public String getAmendCallbackUrl() {
        return amendCallbackUrl;
    }

    public void setAmendCallbackUrl(String amendCallbackUrl) {
        this.amendCallbackUrl = amendCallbackUrl;
    }

    public OBDiscoveryAPILinksEventNotification4 amendCallbackUrl(String amendCallbackUrl) {
        this.amendCallbackUrl = amendCallbackUrl;
        return this;
    }

    public String getDeleteCallbackUrl() {
        return deleteCallbackUrl;
    }

    public void setDeleteCallbackUrl(String deleteCallbackUrl) {
        this.deleteCallbackUrl = deleteCallbackUrl;
    }

    public OBDiscoveryAPILinksEventNotification4 deleteCallbackUrl(String deleteCallbackUrl) {
        this.deleteCallbackUrl = deleteCallbackUrl;
        return this;
    }

    public String getCreateEventSubscription() {
        return createEventSubscription;
    }

    public void setCreateEventSubscription(String createEventSubscription) {
        this.createEventSubscription = createEventSubscription;
    }

    public OBDiscoveryAPILinksEventNotification4 createEventSubscription(String createEventSubscription) {
        this.createEventSubscription = createEventSubscription;
        return this;
    }

    public String getGetEventSubscriptions() {
        return getEventSubscriptions;
    }

    public void setGetEventSubscriptions(String getEventSubscriptions) {
        this.getEventSubscriptions = getEventSubscriptions;
    }

    public OBDiscoveryAPILinksEventNotification4 getEventSubscriptions(String getEventSubscriptions) {
        this.getEventSubscriptions = getEventSubscriptions;
        return this;
    }

    public String getAmendEventSubscription() {
        return amendEventSubscription;
    }

    public void setAmendEventSubscription(String amendEventSubscription) {
        this.amendEventSubscription = amendEventSubscription;
    }

    public OBDiscoveryAPILinksEventNotification4 amendEventSubscription(String amendEventSubscription) {
        this.amendEventSubscription = amendEventSubscription;
        return this;
    }

    public String getDeleteEventSubscription() {
        return deleteEventSubscription;
    }

    public void setDeleteEventSubscription(String deleteEventSubscription) {
        this.deleteEventSubscription = deleteEventSubscription;
    }

    public OBDiscoveryAPILinksEventNotification4 deleteEventSubscription(String deleteEventSubscription) {
        this.deleteEventSubscription = deleteEventSubscription;
        return this;
    }

    public String getEventPoll() {
        return eventPoll;
    }

    public void setEventPoll(String eventPoll) {
        this.eventPoll = eventPoll;
    }

    public OBDiscoveryAPILinksEventNotification4 eventPoll(String eventPoll) {
        this.eventPoll = eventPoll;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OBDiscoveryAPILinksEventNotification4 that = (OBDiscoveryAPILinksEventNotification4) o;
        return Objects.equals(createCallbackUrl, that.createCallbackUrl) &&
                Objects.equals(getCallbackUrls, that.getCallbackUrls) &&
                Objects.equals(amendCallbackUrl, that.amendCallbackUrl) &&
                Objects.equals(deleteCallbackUrl, that.deleteCallbackUrl) &&
                Objects.equals(createEventSubscription, that.createEventSubscription) &&
                Objects.equals(getEventSubscriptions, that.getEventSubscriptions) &&
                Objects.equals(amendEventSubscription, that.amendEventSubscription) &&
                Objects.equals(deleteEventSubscription, that.deleteEventSubscription) &&
                Objects.equals(eventPoll, that.eventPoll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createCallbackUrl, getCallbackUrls, amendCallbackUrl, deleteCallbackUrl, createEventSubscription, getEventSubscriptions, amendEventSubscription, deleteEventSubscription, eventPoll);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("createCallbackUrl", createCallbackUrl)
                .add("getCallbackUrls", getCallbackUrls)
                .add("amendCallbackUrl", amendCallbackUrl)
                .add("deleteCallbackUrl", deleteCallbackUrl)
                .add("createEventSubscription", createEventSubscription)
                .add("getEventSubscriptions", getEventSubscriptions)
                .add("amendEventSubscription", amendEventSubscription)
                .add("deleteEventSubscription", deleteEventSubscription)
                .add("eventPoll", eventPoll)
                .toString();
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
