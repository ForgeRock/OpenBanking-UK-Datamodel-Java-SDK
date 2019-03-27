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
import com.google.common.base.Objects;
import io.swagger.annotations.ApiModel;

@ApiModel(description = "Payment endpoints corresponding to a specific version")
public class OBDiscoveryAPILinksPayment3 implements OBDiscoveryAPILinks{

    // Domestic single
    @JsonProperty("CreateDomesticPaymentConsent")
    private String createDomesticPaymentConsent;
    @JsonProperty("GetDomesticPaymentConsent")
    private String getDomesticPaymentConsent;
    @JsonProperty("CreateDomesticPayment")
    private String createDomesticPayment;
    @JsonProperty("GetDomesticPayment")
    private String getDomesticPayment;

    // Domestic scheduled
    @JsonProperty("CreateDomesticScheduledPaymentConsent")
    private String createDomesticScheduledPaymentConsent;
    @JsonProperty("GetDomesticScheduledPaymentConsent")
    private String getDomesticScheduledPaymentConsent;
    @JsonProperty("CreateDomesticScheduledPayment")
    private String createDomesticScheduledPayment;
    @JsonProperty("GetDomesticScheduledPayment")
    private String getDomesticScheduledPayment;

    // Domestic standing order
    @JsonProperty("CreateDomesticStandingOrderConsent")
    private String createDomesticStandingOrderConsent;
    @JsonProperty("GetDomesticStandingOrderConsent")
    private String getDomesticStandingOrderConsent;
    @JsonProperty("CreateDomesticStandingOrder")
    private String createDomesticStandingOrder;
    @JsonProperty("GetDomesticStandingOrder")
    private String getDomesticStandingOrder;

    // International single
    @JsonProperty("CreateInternationalPaymentConsent")
    private String createInternationalPaymentConsent;
    @JsonProperty("GetInternationalPaymentConsent")
    private String getInternationalPaymentConsent;
    @JsonProperty("CreateInternationalPayment")
    private String createInternationalPayment;
    @JsonProperty("GetInternationalPayment")
    private String getInternationalPayment;

    // International scheduled
    @JsonProperty("CreateInternationalScheduledPaymentConsent")
    private String createInternationalScheduledPaymentConsent;
    @JsonProperty("GetInternationalScheduledPaymentConsent")
    private String getInternationalScheduledPaymentConsent;
    @JsonProperty("CreateInternationalScheduledPayment")
    private String createInternationalScheduledPayment;
    @JsonProperty("GetInternationalScheduledPayment")
    private String getInternationalScheduledPayment;

    // International standing order
    @JsonProperty("CreateInternationalStandingOrderConsent")
    private String createInternationalStandingOrderConsent;
    @JsonProperty("GetInternationalStandingOrderConsent")
    private String getInternationalStandingOrderConsent;
    @JsonProperty("CreateInternationalStandingOrder")
    private String createInternationalStandingOrder;
    @JsonProperty("GetInternationalStandingOrder")
    private String getInternationalStandingOrder;

    // File payment
    @JsonProperty("CreateFilePaymentConsent")
    private String createFilePaymentConsent;
    @JsonProperty("GetFilePaymentConsent")
    private String getFilePaymentConsent;
    @JsonProperty("CreateFilePaymentFile")
    private String createFilePaymentFile;
    @JsonProperty("GetFilePaymentFile")
    private String getFilePaymentFile;
    @JsonProperty("CreateFilePayment")
    private String createFilePayment;
    @JsonProperty("GetFilePayment")
    private String getFilePayment;
    @JsonProperty("GetFilePaymentReport")
    private String getFilePaymentReport;

    public String getCreateDomesticPaymentConsent() {
        return createDomesticPaymentConsent;
    }

    public void setCreateDomesticPaymentConsent(String createDomesticPaymentConsent) {
        this.createDomesticPaymentConsent = createDomesticPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment3 createDomesticPaymentConsent(String createDomesticPaymentConsent) {
        this.createDomesticPaymentConsent = createDomesticPaymentConsent;
        return this;
    }

    public String getGetDomesticPaymentConsent() {
        return getDomesticPaymentConsent;
    }

    public void setGetDomesticPaymentConsent(String getDomesticPaymentConsent) {
        this.getDomesticPaymentConsent = getDomesticPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment3 getDomesticPaymentConsent(String getDomesticPaymentConsent) {
        this.getDomesticPaymentConsent = getDomesticPaymentConsent;
        return this;
    }

    public String getCreateDomesticPayment() {
        return createDomesticPayment;
    }

    public void setCreateDomesticPayment(String createDomesticPayment) {
        this.createDomesticPayment = createDomesticPayment;
    }

    public OBDiscoveryAPILinksPayment3 createDomesticPayment(String createDomesticPayment) {
        this.createDomesticPayment = createDomesticPayment;
        return this;
    }

    public String getGetDomesticPayment() {
        return getDomesticPayment;
    }

    public void setGetDomesticPayment(String getDomesticPayment) {
        this.getDomesticPayment = getDomesticPayment;
    }

    public OBDiscoveryAPILinksPayment3 getDomesticPayment(String getDomesticPayment) {
        this.getDomesticPayment = getDomesticPayment;
        return this;
    }

    public String getCreateDomesticScheduledPaymentConsent() {
        return createDomesticScheduledPaymentConsent;
    }

    public void setCreateDomesticScheduledPaymentConsent(String createDomesticScheduledPaymentConsent) {
        this.createDomesticScheduledPaymentConsent = createDomesticScheduledPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment3 createDomesticScheduledPaymentConsent(String createDomesticScheduledPaymentConsent) {
        this.createDomesticScheduledPaymentConsent = createDomesticScheduledPaymentConsent;
        return this;
    }

    public String getGetDomesticScheduledPaymentConsent() {
        return getDomesticScheduledPaymentConsent;
    }

    public void setGetDomesticScheduledPaymentConsent(String getDomesticScheduledPaymentConsent) {
        this.getDomesticScheduledPaymentConsent = getDomesticScheduledPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment3 getDomesticScheduledPaymentConsent(String getDomesticScheduledPaymentConsent) {
        this.getDomesticScheduledPaymentConsent = getDomesticScheduledPaymentConsent;
        return this;
    }

    public String getCreateDomesticScheduledPayment() {
        return createDomesticScheduledPayment;
    }

    public void setCreateDomesticScheduledPayment(String createDomesticScheduledPayment) {
        this.createDomesticScheduledPayment = createDomesticScheduledPayment;
    }

    public OBDiscoveryAPILinksPayment3 createDomesticScheduledPayment(String createDomesticScheduledPayment) {
        this.createDomesticScheduledPayment = createDomesticScheduledPayment;
        return this;
    }

    public String getGetDomesticScheduledPayment() {
        return getDomesticScheduledPayment;
    }

    public void setGetDomesticScheduledPayment(String getDomesticScheduledPayment) {
        this.getDomesticScheduledPayment = getDomesticScheduledPayment;
    }

    public OBDiscoveryAPILinksPayment3 getDomesticScheduledPayment(String getDomesticScheduledPayment) {
        this.getDomesticScheduledPayment = getDomesticScheduledPayment;
        return this;
    }

    public String getCreateDomesticStandingOrderConsent() {
        return createDomesticStandingOrderConsent;
    }

    public void setCreateDomesticStandingOrderConsent(String createDomesticStandingOrderConsent) {
        this.createDomesticStandingOrderConsent = createDomesticStandingOrderConsent;
    }

    public OBDiscoveryAPILinksPayment3 createDomesticStandingOrderConsent(String createDomesticStandingOrderConsent) {
        this.createDomesticStandingOrderConsent = createDomesticStandingOrderConsent;
        return this;
    }

    public String getGetDomesticStandingOrderConsent() {
        return getDomesticStandingOrderConsent;
    }

    public void setGetDomesticStandingOrderConsent(String getDomesticStandingOrderConsent) {
        this.getDomesticStandingOrderConsent = getDomesticStandingOrderConsent;
    }

    public OBDiscoveryAPILinksPayment3 getDomesticStandingOrderConsent(String getDomesticStandingOrderConsent) {
        this.getDomesticStandingOrderConsent = getDomesticStandingOrderConsent;
        return this;
    }

    public String getCreateDomesticStandingOrder() {
        return createDomesticStandingOrder;
    }

    public void setCreateDomesticStandingOrder(String createDomesticStandingOrder) {
        this.createDomesticStandingOrder = createDomesticStandingOrder;
    }

    public OBDiscoveryAPILinksPayment3 createDomesticStandingOrder(String createDomesticStandingOrder) {
        this.createDomesticStandingOrder = createDomesticStandingOrder;
        return this;
    }

    public String getGetDomesticStandingOrder() {
        return getDomesticStandingOrder;
    }

    public void setGetDomesticStandingOrder(String getDomesticStandingOrder) {
        this.getDomesticStandingOrder = getDomesticStandingOrder;
    }

    public OBDiscoveryAPILinksPayment3 getDomesticStandingOrder(String getDomesticStandingOrder) {
        this.getDomesticStandingOrder = getDomesticStandingOrder;
        return this;
    }

    public String getCreateInternationalPaymentConsent() {
        return createInternationalPaymentConsent;
    }

    public void setCreateInternationalPaymentConsent(String createInternationalPaymentConsent) {
        this.createInternationalPaymentConsent = createInternationalPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment3 createInternationalPaymentConsent(String createInternationalPaymentConsent) {
        this.createInternationalPaymentConsent = createInternationalPaymentConsent;
        return this;
    }

    public String getGetInternationalPaymentConsent() {
        return getInternationalPaymentConsent;
    }

    public void setGetInternationalPaymentConsent(String getInternationalPaymentConsent) {
        this.getInternationalPaymentConsent = getInternationalPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment3 getInternationalPaymentConsent(String getInternationalPaymentConsent) {
        this.getInternationalPaymentConsent = getInternationalPaymentConsent;
        return this;
    }

    public String getCreateInternationalPayment() {
        return createInternationalPayment;
    }

    public void setCreateInternationalPayment(String createInternationalPayment) {
        this.createInternationalPayment = createInternationalPayment;
    }

    public OBDiscoveryAPILinksPayment3 createInternationalPayment(String createInternationalPayment) {
        this.createInternationalPayment = createInternationalPayment;
        return this;
    }

    public String getGetInternationalPayment() {
        return getInternationalPayment;
    }

    public void setGetInternationalPayment(String getInternationalPayment) {
        this.getInternationalPayment = getInternationalPayment;
    }

    public OBDiscoveryAPILinksPayment3 getInternationalPayment(String getInternationalPayment) {
        this.getInternationalPayment = getInternationalPayment;
        return this;
    }


    public String getCreateInternationalStandingOrderConsent() {
        return createInternationalStandingOrderConsent;
    }

    public void setCreateInternationalStandingOrderConsent(String createInternationalStandingOrderConsent) {
        this.createInternationalStandingOrderConsent = createInternationalStandingOrderConsent;
    }

    public OBDiscoveryAPILinksPayment3 createInternationalStandingOrderConsent(String createInternationalStandingOrderConsent) {
        this.createInternationalStandingOrderConsent = createInternationalStandingOrderConsent;
        return this;
    }

    public String getGetInternationalStandingOrderConsent() {
        return getInternationalStandingOrderConsent;
    }

    public void setGetInternationalStandingOrderConsent(String getInternationalStandingOrderConsent) {
        this.getInternationalStandingOrderConsent = getInternationalStandingOrderConsent;
    }

    public OBDiscoveryAPILinksPayment3 getInternationalStandingOrderConsent(String getInternationalStandingOrderConsent) {
        this.getInternationalStandingOrderConsent = getInternationalStandingOrderConsent;
        return this;
    }

    public String getCreateInternationalStandingOrder() {
        return createInternationalStandingOrder;
    }

    public void setCreateInternationalStandingOrder(String createInternationalStandingOrder) {
        this.createInternationalStandingOrder = createInternationalStandingOrder;
    }

    public OBDiscoveryAPILinksPayment3 createInternationalStandingOrder(String createInternationalStandingOrder) {
        this.createInternationalStandingOrder = createInternationalStandingOrder;
        return this;
    }

    public String getCreateInternationalScheduledPaymentConsent() {
        return createInternationalScheduledPaymentConsent;
    }

    public void setCreateInternationalScheduledPaymentConsent(String createInternationalScheduledPaymentConsent) {
        this.createInternationalScheduledPaymentConsent = createInternationalScheduledPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment3 createInternationalScheduledPaymentConsent(String createInternationalScheduledPaymentConsent) {
        this.createInternationalScheduledPaymentConsent = createInternationalScheduledPaymentConsent;
        return this;
    }

    public String getGetInternationalScheduledPaymentConsent() {
        return getInternationalScheduledPaymentConsent;
    }

    public void setGetInternationalScheduledPaymentConsent(String getInternationalScheduledPaymentConsent) {
        this.getInternationalScheduledPaymentConsent = getInternationalScheduledPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment3 getInternationalScheduledPaymentConsent(String getInternationalScheduledPaymentConsent) {
        this.getInternationalScheduledPaymentConsent = getInternationalScheduledPaymentConsent;
        return this;
    }

    public String getCreateInternationalScheduledPayment() {
        return createInternationalScheduledPayment;
    }

    public void setCreateInternationalScheduledPayment(String createInternationalScheduledPayment) {
        this.createInternationalScheduledPayment = createInternationalScheduledPayment;
    }

    public OBDiscoveryAPILinksPayment3 createInternationalScheduledPayment(String createInternationalScheduledPayment) {
        this.createInternationalScheduledPayment = createInternationalScheduledPayment;
        return this;
    }

    public String getGetInternationalScheduledPayment() {
        return getInternationalScheduledPayment;
    }

    public void setGetInternationalScheduledPayment(String getInternationalScheduledPayment) {
        this.getInternationalScheduledPayment = getInternationalScheduledPayment;
    }

    public OBDiscoveryAPILinksPayment3 getInternationalScheduledPayment(String getInternationalScheduledPayment) {
        this.getInternationalScheduledPayment = getInternationalScheduledPayment;
        return this;
    }

    public String getGetInternationalStandingOrder() {
        return getInternationalStandingOrder;
    }

    public void setGetInternationalStandingOrder(String getInternationalStandingOrder) {
        this.getInternationalStandingOrder = getInternationalStandingOrder;
    }

    public OBDiscoveryAPILinksPayment3 getInternationalStandingOrder(String getInternationalStandingOrder) {
        this.getInternationalStandingOrder = getInternationalStandingOrder;
        return this;
    }

    public String getCreateFilePaymentConsent() {
        return createFilePaymentConsent;
    }

    public void setCreateFilePaymentConsent(String createFilePaymentConsent) {
        this.createFilePaymentConsent = createFilePaymentConsent;
    }

    public OBDiscoveryAPILinksPayment3 createFilePaymentConsent(String createFilePaymentConsent) {
        this.createFilePaymentConsent = createFilePaymentConsent;
        return this;
    }

    public String getGetFilePaymentConsent() {
        return getFilePaymentConsent;
    }

    public void setGetFilePaymentConsent(String getFilePaymentConsent) {
        this.getFilePaymentConsent = getFilePaymentConsent;
    }

    public OBDiscoveryAPILinksPayment3 getFilePaymentConsent(String getFilePaymentConsent) {
        this.getFilePaymentConsent = getFilePaymentConsent;
        return this;
    }

    public String getCreateFilePaymentFile() {
        return createFilePaymentFile;
    }

    public void setCreateFilePaymentFile(String createFilePaymentFile) {
        this.createFilePaymentFile = createFilePaymentFile;
    }

    public OBDiscoveryAPILinksPayment3 createFilePaymentFile(String createFilePaymentFile) {
        this.createFilePaymentFile = createFilePaymentFile;
        return this;
    }

    public String getGetFilePaymentFile() {
        return getFilePaymentFile;
    }

    public void setGetFilePaymentFile(String getFilePaymentFile) {
        this.getFilePaymentFile = getFilePaymentFile;
    }

    public OBDiscoveryAPILinksPayment3 getFilePaymentFile(String getFilePaymentFile) {
        this.getFilePaymentFile = getFilePaymentFile;
        return this;
    }

    public String getCreateFilePayment() {
        return createFilePayment;
    }

    public void setCreateFilePayment(String createFilePayment) {
        this.createFilePayment = createFilePayment;
    }

    public OBDiscoveryAPILinksPayment3 createFilePayment(String createFilePayment) {
        this.createFilePayment = createFilePayment;
        return this;
    }

    public String getGetFilePayment() {
        return getFilePayment;
    }

    public void setGetFilePayment(String getFilePayment) {
        this.getFilePayment = getFilePayment;
    }

    public OBDiscoveryAPILinksPayment3 getFilePayment(String getFilePayment) {
        this.getFilePayment = getFilePayment;
        return this;
    }

    public String getGetFilePaymentReport() {
        return getFilePaymentReport;
    }

    public void setGetFilePaymentReport(String getFilePaymentReport) {
        this.getFilePaymentReport = getFilePaymentReport;
    }

    public OBDiscoveryAPILinksPayment3 getFilePaymentReport(String getFilePaymentReport) {
        this.getFilePaymentReport = getFilePaymentReport;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OBDiscoveryAPILinksPayment3 that = (OBDiscoveryAPILinksPayment3) o;
        return Objects.equal(createDomesticPaymentConsent, that.createDomesticPaymentConsent) &&
                Objects.equal(getDomesticPaymentConsent, that.getDomesticPaymentConsent) &&
                Objects.equal(createDomesticPayment, that.createDomesticPayment) &&
                Objects.equal(getDomesticPayment, that.getDomesticPayment) &&
                Objects.equal(createDomesticScheduledPaymentConsent, that.createDomesticScheduledPaymentConsent) &&
                Objects.equal(getDomesticScheduledPaymentConsent, that.getDomesticScheduledPaymentConsent) &&
                Objects.equal(createDomesticScheduledPayment, that.createDomesticScheduledPayment) &&
                Objects.equal(getDomesticScheduledPayment, that.getDomesticScheduledPayment) &&
                Objects.equal(createDomesticStandingOrderConsent, that.createDomesticStandingOrderConsent) &&
                Objects.equal(getDomesticStandingOrderConsent, that.getDomesticStandingOrderConsent) &&
                Objects.equal(createDomesticStandingOrder, that.createDomesticStandingOrder) &&
                Objects.equal(getDomesticStandingOrder, that.getDomesticStandingOrder) &&
                Objects.equal(createInternationalPaymentConsent, that.createInternationalPaymentConsent) &&
                Objects.equal(getInternationalPaymentConsent, that.getInternationalPaymentConsent) &&
                Objects.equal(createInternationalPayment, that.createInternationalPayment) &&
                Objects.equal(getInternationalPayment, that.getInternationalPayment) &&
                Objects.equal(createInternationalScheduledPaymentConsent, that.createInternationalScheduledPaymentConsent) &&
                Objects.equal(getInternationalScheduledPaymentConsent, that.getInternationalScheduledPaymentConsent) &&
                Objects.equal(createInternationalScheduledPayment, that.createInternationalScheduledPayment) &&
                Objects.equal(getInternationalScheduledPayment, that.getInternationalScheduledPayment) &&
                Objects.equal(createInternationalStandingOrderConsent, that.createInternationalStandingOrderConsent) &&
                Objects.equal(getInternationalStandingOrderConsent, that.getInternationalStandingOrderConsent) &&
                Objects.equal(createInternationalStandingOrder, that.createInternationalStandingOrder) &&
                Objects.equal(getInternationalStandingOrder, that.getInternationalStandingOrder) &&
                Objects.equal(createFilePaymentConsent, that.createFilePaymentConsent) &&
                Objects.equal(getFilePaymentConsent, that.getFilePaymentConsent) &&
                Objects.equal(createFilePaymentFile, that.createFilePaymentFile) &&
                Objects.equal(getFilePaymentFile, that.getFilePaymentFile) &&
                Objects.equal(createFilePayment, that.createFilePayment) &&
                Objects.equal(getFilePayment, that.getFilePayment) &&
                Objects.equal(getFilePaymentReport, that.getFilePaymentReport)
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(createDomesticPaymentConsent, getDomesticPaymentConsent, createDomesticPayment, getDomesticPayment, createDomesticScheduledPaymentConsent, getDomesticScheduledPaymentConsent, createDomesticScheduledPayment, getDomesticScheduledPayment, createDomesticStandingOrderConsent, getDomesticStandingOrderConsent, createDomesticStandingOrder, getDomesticStandingOrder, createInternationalPaymentConsent, getInternationalPaymentConsent, createInternationalPayment, getInternationalPayment, createInternationalScheduledPaymentConsent, getInternationalScheduledPaymentConsent, createInternationalScheduledPayment, getInternationalScheduledPayment, createInternationalStandingOrderConsent, getInternationalStandingOrderConsent, createInternationalStandingOrder, getInternationalStandingOrder, getFilePaymentConsent, createFilePaymentConsent, getFilePaymentFile, createFilePaymentFile, getFilePayment, createFilePayment, getFilePaymentReport);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("createDomesticPaymentConsent", createDomesticPaymentConsent)
                .add("getDomesticPaymentConsent", getDomesticPaymentConsent)
                .add("createDomesticPayment", createDomesticPayment)
                .add("getDomesticPayment", getDomesticPayment)
                .add("createDomesticScheduledPaymentConsent", createDomesticScheduledPaymentConsent)
                .add("getDomesticScheduledPaymentConsent", getDomesticScheduledPaymentConsent)
                .add("createDomesticScheduledPayment", createDomesticScheduledPayment)
                .add("getDomesticScheduledPayment", getDomesticScheduledPayment)
                .add("createDomesticStandingOrderConsent", createDomesticStandingOrderConsent)
                .add("getDomesticStandingOrderConsent", getDomesticStandingOrderConsent)
                .add("createDomesticStandingOrder", createDomesticStandingOrder)
                .add("getDomesticStandingOrder", getDomesticStandingOrder)
                .add("createInternationalPaymentConsent", createInternationalPaymentConsent)
                .add("getInternationalPaymentConsent", getInternationalPaymentConsent)
                .add("createInternationalPayment", createInternationalPayment)
                .add("getInternationalPayment", getInternationalPayment)
                .add("createInternationalScheduledPaymentConsent", createInternationalScheduledPaymentConsent)
                .add("getInternationalScheduledPaymentConsent", getInternationalScheduledPaymentConsent)
                .add("createInternationalScheduledPayment", createInternationalScheduledPayment)
                .add("getInternationalScheduledPayment", getInternationalScheduledPayment)
                .add("createInternationalStandingOrderConsent", createInternationalStandingOrderConsent)
                .add("getInternationalStandingOrderConsent", getInternationalStandingOrderConsent)
                .add("createInternationalStandingOrder", createInternationalStandingOrder)
                .add("getInternationalStandingOrder", getInternationalStandingOrder)
                .add("createFilePaymentConsent", createFilePaymentConsent)
                .add("getFilePaymentConsent", getFilePaymentConsent)
                .add("createFilePaymentFile", createFilePaymentFile)
                .add("getFilePaymentFile", getFilePaymentFile)
                .add("createFilePayment", createFilePayment)
                .add("getFilePayment", getFilePayment)
                .add("getFilePaymentReport", getFilePaymentReport)
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
