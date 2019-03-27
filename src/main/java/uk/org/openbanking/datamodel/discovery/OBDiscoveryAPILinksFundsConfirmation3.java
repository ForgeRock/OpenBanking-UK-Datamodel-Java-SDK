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
import io.swagger.annotations.ApiModel;

import java.util.Objects;
import java.util.StringJoiner;

@ApiModel(description = "Funds Confirmation endpoints corresponding to a specific version")
public class OBDiscoveryAPILinksFundsConfirmation3 implements OBDiscoveryAPILinks{

    @JsonProperty("CreateFundsConfirmationConsent")
    private String createFundsConfirmationConsent;
    @JsonProperty("GetFundsConfirmationConsent")
    private String getFundsConfirmationConsent;
    @JsonProperty("CreateFundsConfirmation")
    private String createFundsConfirmation;

    public String getCreateFundsConfirmationConsent() {
        return createFundsConfirmationConsent;
    }

    public void setCreateFundsConfirmationConsent(String createFundsConfirmationConsent) {
        this.createFundsConfirmationConsent = createFundsConfirmationConsent;
    }

    public OBDiscoveryAPILinksFundsConfirmation3 createFundsConfirmationConsent(String createFundsConfirmationConsent) {
        this.createFundsConfirmationConsent = createFundsConfirmationConsent;
        return this;
    }

    public String getGetFundsConfirmationConsent() {
        return getFundsConfirmationConsent;
    }

    public void setGetFundsConfirmationConsent(String getFundsConfirmationConsent) {
        this.getFundsConfirmationConsent = getFundsConfirmationConsent;
    }

    public OBDiscoveryAPILinksFundsConfirmation3 getFundsConfirmationConsent(String getFundsConfirmationConsent) {
        this.getFundsConfirmationConsent = getFundsConfirmationConsent;
        return this;
    }

    public String getCreateFundsConfirmation() {
        return createFundsConfirmation;
    }

    public void setCreateFundsConfirmation(String createFundsConfirmation) {
        this.createFundsConfirmation = createFundsConfirmation;
    }

    public OBDiscoveryAPILinksFundsConfirmation3 createFundsConfirmation(String createFundsConfirmation) {
        this.createFundsConfirmation = createFundsConfirmation;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OBDiscoveryAPILinksFundsConfirmation3 that = (OBDiscoveryAPILinksFundsConfirmation3) o;
        return Objects.equals(createFundsConfirmationConsent, that.createFundsConfirmationConsent) &&
                Objects.equals(getFundsConfirmationConsent, that.getFundsConfirmationConsent) &&
                Objects.equals(createFundsConfirmation, that.createFundsConfirmation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createFundsConfirmationConsent, getFundsConfirmationConsent, createFundsConfirmation);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", OBDiscoveryAPILinksFundsConfirmation3.class.getSimpleName() + "[", "]")
                .add("createFundsConfirmationConsent='" + createFundsConfirmationConsent + "'")
                .add("getFundsConfirmationConsent='" + getFundsConfirmationConsent + "'")
                .add("createFundsConfirmation='" + createFundsConfirmation + "'")
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
