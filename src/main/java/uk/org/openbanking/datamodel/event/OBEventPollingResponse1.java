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
 * Aggregated Event Polling API Specification
 * Swagger for Aggregated Event Polling API Specification
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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * OBEventPollingResponse1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T15:58:23.513+01:00")
public class OBEventPollingResponse1 {
    @JsonProperty("moreAvailable")
    private Boolean moreAvailable = null;

    @JsonProperty("sets")
    private Map<String, String> sets = new HashMap<String, String>();

    public OBEventPollingResponse1 moreAvailable(Boolean moreAvailable) {
        this.moreAvailable = moreAvailable;
        return this;
    }

    /**
     * A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.
     *
     * @return moreAvailable
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.")
    public Boolean isMoreAvailable() {
        return moreAvailable;
    }

    public void setMoreAvailable(Boolean moreAvailable) {
        this.moreAvailable = moreAvailable;
    }

    public OBEventPollingResponse1 sets(Map<String, String> sets) {
        this.sets = sets;
        return this;
    }

    public OBEventPollingResponse1 putSetsItem(String key, String setsItem) {
        this.sets.put(key, setsItem);
        return this;
    }

    /**
     * A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.
     *
     * @return sets
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.")
    public Map<String, String> getSets() {
        return sets;
    }

    public void setSets(Map<String, String> sets) {
        this.sets = sets;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventPollingResponse1 obEventPollingResponse1 = (OBEventPollingResponse1) o;
        return Objects.equals(this.moreAvailable, obEventPollingResponse1.moreAvailable) &&
                Objects.equals(this.sets, obEventPollingResponse1.sets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moreAvailable, sets);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventPollingResponse1 {\n");

        sb.append("    moreAvailable: ").append(toIndentedString(moreAvailable)).append("\n");
        sb.append("    sets: ").append(toIndentedString(sets)).append("\n");
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

