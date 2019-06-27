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
/*
 * Event Subscription API Specification - ASPSP Endpoints
 * Swagger for Event Subscription API Specification - ASPSP Endpoints
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBEventSubscription1Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-25T13:49:38.894+01:00")
public class OBEventSubscription1Data {
    @JsonProperty("CallbackUrl")
    private String callbackUrl = null;

    @JsonProperty("Version")
    private String version = null;

    @JsonProperty("EventTypes")
    private List<String> eventTypes = null;

    public OBEventSubscription1Data callbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.
     *
     * @return callbackUrl
     **/
    @ApiModelProperty(value = "Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.")
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public OBEventSubscription1Data version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     **/
    @NotNull
    @Size(min = 1, max = 10)
    @ApiModelProperty(required = true, value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OBEventSubscription1Data eventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public OBEventSubscription1Data addEventTypesItem(String eventTypesItem) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<String>();
        }
        this.eventTypes.add(eventTypesItem);
        return this;
    }

    /**
     * Get eventTypes
     *
     * @return eventTypes
     **/
    @ApiModelProperty(value = "")
    public List<String> getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventSubscription1Data obEventSubscription1Data = (OBEventSubscription1Data) o;
        return Objects.equals(this.callbackUrl, obEventSubscription1Data.callbackUrl) &&
                Objects.equals(this.version, obEventSubscription1Data.version) &&
                Objects.equals(this.eventTypes, obEventSubscription1Data.eventTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callbackUrl, version, eventTypes);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventSubscription1Data {\n");

        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
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

