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

@ApiModel(description = "Payment endpoints corresponding to a specific version")
public class OBDiscoveryAPILinksPayment4 implements OBDiscoveryAPILinks{

    // Domestic single
    @JsonProperty("CreateDomesticPaymentConsent")
    private String createDomesticPaymentConsent;
    @JsonProperty("GetDomesticPaymentConsent")
    private String getDomesticPaymentConsent;
    @JsonProperty("GetDomesticPaymentConsentsConsentIdFundsConfirmation")
    private String getDomesticPaymentConsentsConsentIdFundsConfirmation;
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
    @JsonProperty("GetInternationalPaymentConsentsConsentIdFundsConfirmation")
    private String getInternationalPaymentConsentsConsentIdFundsConfirmation;
    @JsonProperty("CreateInternationalPayment")
    private String createInternationalPayment;
    @JsonProperty("GetInternationalPayment")
    private String getInternationalPayment;

    // International scheduled
    @JsonProperty("CreateInternationalScheduledPaymentConsent")
    private String createInternationalScheduledPaymentConsent;
    @JsonProperty("GetInternationalScheduledPaymentConsent")
    private String getInternationalScheduledPaymentConsent;
    @JsonProperty("GetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation")
    private String getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation;
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

    public OBDiscoveryAPILinksPayment4 createDomesticPaymentConsent(String createDomesticPaymentConsent) {
        this.createDomesticPaymentConsent = createDomesticPaymentConsent;
        return this;
    }

    public String getGetDomesticPaymentConsent() {
        return getDomesticPaymentConsent;
    }

    public void setGetDomesticPaymentConsent(String getDomesticPaymentConsent) {
        this.getDomesticPaymentConsent = getDomesticPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment4 getDomesticPaymentConsent(String getDomesticPaymentConsent) {
        this.getDomesticPaymentConsent = getDomesticPaymentConsent;
        return this;
    }

    public String getCreateDomesticPayment() {
        return createDomesticPayment;
    }

    public void setCreateDomesticPayment(String createDomesticPayment) {
        this.createDomesticPayment = createDomesticPayment;
    }

    public OBDiscoveryAPILinksPayment4 createDomesticPayment(String createDomesticPayment) {
        this.createDomesticPayment = createDomesticPayment;
        return this;
    }

    public String getGetDomesticPayment() {
        return getDomesticPayment;
    }

    public void setGetDomesticPayment(String getDomesticPayment) {
        this.getDomesticPayment = getDomesticPayment;
    }

    public OBDiscoveryAPILinksPayment4 getDomesticPayment(String getDomesticPayment) {
        this.getDomesticPayment = getDomesticPayment;
        return this;
    }

    public String getCreateDomesticScheduledPaymentConsent() {
        return createDomesticScheduledPaymentConsent;
    }

    public void setCreateDomesticScheduledPaymentConsent(String createDomesticScheduledPaymentConsent) {
        this.createDomesticScheduledPaymentConsent = createDomesticScheduledPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment4 createDomesticScheduledPaymentConsent(String createDomesticScheduledPaymentConsent) {
        this.createDomesticScheduledPaymentConsent = createDomesticScheduledPaymentConsent;
        return this;
    }

    public String getGetDomesticScheduledPaymentConsent() {
        return getDomesticScheduledPaymentConsent;
    }

    public void setGetDomesticScheduledPaymentConsent(String getDomesticScheduledPaymentConsent) {
        this.getDomesticScheduledPaymentConsent = getDomesticScheduledPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment4 getDomesticScheduledPaymentConsent(String getDomesticScheduledPaymentConsent) {
        this.getDomesticScheduledPaymentConsent = getDomesticScheduledPaymentConsent;
        return this;
    }

    public String getCreateDomesticScheduledPayment() {
        return createDomesticScheduledPayment;
    }

    public void setCreateDomesticScheduledPayment(String createDomesticScheduledPayment) {
        this.createDomesticScheduledPayment = createDomesticScheduledPayment;
    }

    public OBDiscoveryAPILinksPayment4 createDomesticScheduledPayment(String createDomesticScheduledPayment) {
        this.createDomesticScheduledPayment = createDomesticScheduledPayment;
        return this;
    }

    public String getGetDomesticScheduledPayment() {
        return getDomesticScheduledPayment;
    }

    public void setGetDomesticScheduledPayment(String getDomesticScheduledPayment) {
        this.getDomesticScheduledPayment = getDomesticScheduledPayment;
    }

    public OBDiscoveryAPILinksPayment4 getDomesticScheduledPayment(String getDomesticScheduledPayment) {
        this.getDomesticScheduledPayment = getDomesticScheduledPayment;
        return this;
    }

    public String getCreateDomesticStandingOrderConsent() {
        return createDomesticStandingOrderConsent;
    }

    public void setCreateDomesticStandingOrderConsent(String createDomesticStandingOrderConsent) {
        this.createDomesticStandingOrderConsent = createDomesticStandingOrderConsent;
    }

    public OBDiscoveryAPILinksPayment4 createDomesticStandingOrderConsent(String createDomesticStandingOrderConsent) {
        this.createDomesticStandingOrderConsent = createDomesticStandingOrderConsent;
        return this;
    }

    public String getGetDomesticStandingOrderConsent() {
        return getDomesticStandingOrderConsent;
    }

    public void setGetDomesticStandingOrderConsent(String getDomesticStandingOrderConsent) {
        this.getDomesticStandingOrderConsent = getDomesticStandingOrderConsent;
    }

    public OBDiscoveryAPILinksPayment4 getDomesticStandingOrderConsent(String getDomesticStandingOrderConsent) {
        this.getDomesticStandingOrderConsent = getDomesticStandingOrderConsent;
        return this;
    }

    public String getCreateDomesticStandingOrder() {
        return createDomesticStandingOrder;
    }

    public void setCreateDomesticStandingOrder(String createDomesticStandingOrder) {
        this.createDomesticStandingOrder = createDomesticStandingOrder;
    }

    public OBDiscoveryAPILinksPayment4 createDomesticStandingOrder(String createDomesticStandingOrder) {
        this.createDomesticStandingOrder = createDomesticStandingOrder;
        return this;
    }

    public String getGetDomesticStandingOrder() {
        return getDomesticStandingOrder;
    }

    public void setGetDomesticStandingOrder(String getDomesticStandingOrder) {
        this.getDomesticStandingOrder = getDomesticStandingOrder;
    }

    public OBDiscoveryAPILinksPayment4 getDomesticStandingOrder(String getDomesticStandingOrder) {
        this.getDomesticStandingOrder = getDomesticStandingOrder;
        return this;
    }

    public String getCreateInternationalPaymentConsent() {
        return createInternationalPaymentConsent;
    }

    public void setCreateInternationalPaymentConsent(String createInternationalPaymentConsent) {
        this.createInternationalPaymentConsent = createInternationalPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment4 createInternationalPaymentConsent(String createInternationalPaymentConsent) {
        this.createInternationalPaymentConsent = createInternationalPaymentConsent;
        return this;
    }

    public String getGetInternationalPaymentConsent() {
        return getInternationalPaymentConsent;
    }

    public void setGetInternationalPaymentConsent(String getInternationalPaymentConsent) {
        this.getInternationalPaymentConsent = getInternationalPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment4 getInternationalPaymentConsent(String getInternationalPaymentConsent) {
        this.getInternationalPaymentConsent = getInternationalPaymentConsent;
        return this;
    }

    public String getCreateInternationalPayment() {
        return createInternationalPayment;
    }

    public void setCreateInternationalPayment(String createInternationalPayment) {
        this.createInternationalPayment = createInternationalPayment;
    }

    public OBDiscoveryAPILinksPayment4 createInternationalPayment(String createInternationalPayment) {
        this.createInternationalPayment = createInternationalPayment;
        return this;
    }

    public String getGetInternationalPayment() {
        return getInternationalPayment;
    }

    public void setGetInternationalPayment(String getInternationalPayment) {
        this.getInternationalPayment = getInternationalPayment;
    }

    public OBDiscoveryAPILinksPayment4 getInternationalPayment(String getInternationalPayment) {
        this.getInternationalPayment = getInternationalPayment;
        return this;
    }


    public String getCreateInternationalStandingOrderConsent() {
        return createInternationalStandingOrderConsent;
    }

    public void setCreateInternationalStandingOrderConsent(String createInternationalStandingOrderConsent) {
        this.createInternationalStandingOrderConsent = createInternationalStandingOrderConsent;
    }

    public OBDiscoveryAPILinksPayment4 createInternationalStandingOrderConsent(String createInternationalStandingOrderConsent) {
        this.createInternationalStandingOrderConsent = createInternationalStandingOrderConsent;
        return this;
    }

    public String getGetInternationalStandingOrderConsent() {
        return getInternationalStandingOrderConsent;
    }

    public void setGetInternationalStandingOrderConsent(String getInternationalStandingOrderConsent) {
        this.getInternationalStandingOrderConsent = getInternationalStandingOrderConsent;
    }

    public OBDiscoveryAPILinksPayment4 getInternationalStandingOrderConsent(String getInternationalStandingOrderConsent) {
        this.getInternationalStandingOrderConsent = getInternationalStandingOrderConsent;
        return this;
    }

    public String getCreateInternationalStandingOrder() {
        return createInternationalStandingOrder;
    }

    public void setCreateInternationalStandingOrder(String createInternationalStandingOrder) {
        this.createInternationalStandingOrder = createInternationalStandingOrder;
    }

    public OBDiscoveryAPILinksPayment4 createInternationalStandingOrder(String createInternationalStandingOrder) {
        this.createInternationalStandingOrder = createInternationalStandingOrder;
        return this;
    }

    public String getCreateInternationalScheduledPaymentConsent() {
        return createInternationalScheduledPaymentConsent;
    }

    public void setCreateInternationalScheduledPaymentConsent(String createInternationalScheduledPaymentConsent) {
        this.createInternationalScheduledPaymentConsent = createInternationalScheduledPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment4 createInternationalScheduledPaymentConsent(String createInternationalScheduledPaymentConsent) {
        this.createInternationalScheduledPaymentConsent = createInternationalScheduledPaymentConsent;
        return this;
    }

    public String getGetInternationalScheduledPaymentConsent() {
        return getInternationalScheduledPaymentConsent;
    }

    public void setGetInternationalScheduledPaymentConsent(String getInternationalScheduledPaymentConsent) {
        this.getInternationalScheduledPaymentConsent = getInternationalScheduledPaymentConsent;
    }

    public OBDiscoveryAPILinksPayment4 getInternationalScheduledPaymentConsent(String getInternationalScheduledPaymentConsent) {
        this.getInternationalScheduledPaymentConsent = getInternationalScheduledPaymentConsent;
        return this;
    }

    public String getCreateInternationalScheduledPayment() {
        return createInternationalScheduledPayment;
    }

    public void setCreateInternationalScheduledPayment(String createInternationalScheduledPayment) {
        this.createInternationalScheduledPayment = createInternationalScheduledPayment;
    }

    public OBDiscoveryAPILinksPayment4 createInternationalScheduledPayment(String createInternationalScheduledPayment) {
        this.createInternationalScheduledPayment = createInternationalScheduledPayment;
        return this;
    }

    public String getGetInternationalScheduledPayment() {
        return getInternationalScheduledPayment;
    }

    public void setGetInternationalScheduledPayment(String getInternationalScheduledPayment) {
        this.getInternationalScheduledPayment = getInternationalScheduledPayment;
    }

    public OBDiscoveryAPILinksPayment4 getInternationalScheduledPayment(String getInternationalScheduledPayment) {
        this.getInternationalScheduledPayment = getInternationalScheduledPayment;
        return this;
    }

    public String getGetInternationalStandingOrder() {
        return getInternationalStandingOrder;
    }

    public void setGetInternationalStandingOrder(String getInternationalStandingOrder) {
        this.getInternationalStandingOrder = getInternationalStandingOrder;
    }

    public OBDiscoveryAPILinksPayment4 getInternationalStandingOrder(String getInternationalStandingOrder) {
        this.getInternationalStandingOrder = getInternationalStandingOrder;
        return this;
    }

    public String getCreateFilePaymentConsent() {
        return createFilePaymentConsent;
    }

    public void setCreateFilePaymentConsent(String createFilePaymentConsent) {
        this.createFilePaymentConsent = createFilePaymentConsent;
    }

    public OBDiscoveryAPILinksPayment4 createFilePaymentConsent(String createFilePaymentConsent) {
        this.createFilePaymentConsent = createFilePaymentConsent;
        return this;
    }

    public String getGetFilePaymentConsent() {
        return getFilePaymentConsent;
    }

    public void setGetFilePaymentConsent(String getFilePaymentConsent) {
        this.getFilePaymentConsent = getFilePaymentConsent;
    }

    public OBDiscoveryAPILinksPayment4 getFilePaymentConsent(String getFilePaymentConsent) {
        this.getFilePaymentConsent = getFilePaymentConsent;
        return this;
    }

    public String getCreateFilePaymentFile() {
        return createFilePaymentFile;
    }

    public void setCreateFilePaymentFile(String createFilePaymentFile) {
        this.createFilePaymentFile = createFilePaymentFile;
    }

    public OBDiscoveryAPILinksPayment4 createFilePaymentFile(String createFilePaymentFile) {
        this.createFilePaymentFile = createFilePaymentFile;
        return this;
    }

    public String getGetFilePaymentFile() {
        return getFilePaymentFile;
    }

    public void setGetFilePaymentFile(String getFilePaymentFile) {
        this.getFilePaymentFile = getFilePaymentFile;
    }

    public OBDiscoveryAPILinksPayment4 getFilePaymentFile(String getFilePaymentFile) {
        this.getFilePaymentFile = getFilePaymentFile;
        return this;
    }

    public String getCreateFilePayment() {
        return createFilePayment;
    }

    public void setCreateFilePayment(String createFilePayment) {
        this.createFilePayment = createFilePayment;
    }

    public OBDiscoveryAPILinksPayment4 createFilePayment(String createFilePayment) {
        this.createFilePayment = createFilePayment;
        return this;
    }

    public String getGetFilePayment() {
        return getFilePayment;
    }

    public void setGetFilePayment(String getFilePayment) {
        this.getFilePayment = getFilePayment;
    }

    public OBDiscoveryAPILinksPayment4 getFilePayment(String getFilePayment) {
        this.getFilePayment = getFilePayment;
        return this;
    }

    public String getGetFilePaymentReport() {
        return getFilePaymentReport;
    }

    public void setGetFilePaymentReport(String getFilePaymentReport) {
        this.getFilePaymentReport = getFilePaymentReport;
    }

    public OBDiscoveryAPILinksPayment4 getFilePaymentReport(String getFilePaymentReport) {
        this.getFilePaymentReport = getFilePaymentReport;
        return this;
    }

    public String getGetDomesticPaymentConsentsConsentIdFundsConfirmation() {
        return getDomesticPaymentConsentsConsentIdFundsConfirmation;
    }

    public void setGetDomesticPaymentConsentsConsentIdFundsConfirmation(String getDomesticPaymentConsentsConsentIdFundsConfirmation) {
        this.getDomesticPaymentConsentsConsentIdFundsConfirmation = getDomesticPaymentConsentsConsentIdFundsConfirmation;
    }

    public String getGetInternationalPaymentConsentsConsentIdFundsConfirmation() {
        return getInternationalPaymentConsentsConsentIdFundsConfirmation;
    }

    public void setGetInternationalPaymentConsentsConsentIdFundsConfirmation(String getInternationalPaymentConsentsConsentIdFundsConfirmation) {
        this.getInternationalPaymentConsentsConsentIdFundsConfirmation = getInternationalPaymentConsentsConsentIdFundsConfirmation;
    }

    public String getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation() {
        return getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation;
    }

    public void setGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation(String getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation) {
        this.getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation = getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OBDiscoveryAPILinksPayment4)) return false;
        OBDiscoveryAPILinksPayment4 that = (OBDiscoveryAPILinksPayment4) o;
        return Objects.equals(createDomesticPaymentConsent, that.createDomesticPaymentConsent) &&
                Objects.equals(getDomesticPaymentConsent, that.getDomesticPaymentConsent) &&
                Objects.equals(getDomesticPaymentConsentsConsentIdFundsConfirmation, that.getDomesticPaymentConsentsConsentIdFundsConfirmation) &&
                Objects.equals(createDomesticPayment, that.createDomesticPayment) &&
                Objects.equals(getDomesticPayment, that.getDomesticPayment) &&
                Objects.equals(createDomesticScheduledPaymentConsent, that.createDomesticScheduledPaymentConsent) &&
                Objects.equals(getDomesticScheduledPaymentConsent, that.getDomesticScheduledPaymentConsent) &&
                Objects.equals(createDomesticScheduledPayment, that.createDomesticScheduledPayment) &&
                Objects.equals(getDomesticScheduledPayment, that.getDomesticScheduledPayment) &&
                Objects.equals(createDomesticStandingOrderConsent, that.createDomesticStandingOrderConsent) &&
                Objects.equals(getDomesticStandingOrderConsent, that.getDomesticStandingOrderConsent) &&
                Objects.equals(createDomesticStandingOrder, that.createDomesticStandingOrder) &&
                Objects.equals(getDomesticStandingOrder, that.getDomesticStandingOrder) &&
                Objects.equals(createInternationalPaymentConsent, that.createInternationalPaymentConsent) &&
                Objects.equals(getInternationalPaymentConsent, that.getInternationalPaymentConsent) &&
                Objects.equals(getInternationalPaymentConsentsConsentIdFundsConfirmation, that.getInternationalPaymentConsentsConsentIdFundsConfirmation) &&
                Objects.equals(createInternationalPayment, that.createInternationalPayment) &&
                Objects.equals(getInternationalPayment, that.getInternationalPayment) &&
                Objects.equals(createInternationalScheduledPaymentConsent, that.createInternationalScheduledPaymentConsent) &&
                Objects.equals(getInternationalScheduledPaymentConsent, that.getInternationalScheduledPaymentConsent) &&
                Objects.equals(getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation, that.getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation) &&
                Objects.equals(createInternationalScheduledPayment, that.createInternationalScheduledPayment) &&
                Objects.equals(getInternationalScheduledPayment, that.getInternationalScheduledPayment) &&
                Objects.equals(createInternationalStandingOrderConsent, that.createInternationalStandingOrderConsent) &&
                Objects.equals(getInternationalStandingOrderConsent, that.getInternationalStandingOrderConsent) &&
                Objects.equals(createInternationalStandingOrder, that.createInternationalStandingOrder) &&
                Objects.equals(getInternationalStandingOrder, that.getInternationalStandingOrder) &&
                Objects.equals(createFilePaymentConsent, that.createFilePaymentConsent) &&
                Objects.equals(getFilePaymentConsent, that.getFilePaymentConsent) &&
                Objects.equals(createFilePaymentFile, that.createFilePaymentFile) &&
                Objects.equals(getFilePaymentFile, that.getFilePaymentFile) &&
                Objects.equals(createFilePayment, that.createFilePayment) &&
                Objects.equals(getFilePayment, that.getFilePayment) &&
                Objects.equals(getFilePaymentReport, that.getFilePaymentReport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createDomesticPaymentConsent, getDomesticPaymentConsent, getDomesticPaymentConsentsConsentIdFundsConfirmation, createDomesticPayment, getDomesticPayment, createDomesticScheduledPaymentConsent, getDomesticScheduledPaymentConsent, createDomesticScheduledPayment, getDomesticScheduledPayment, createDomesticStandingOrderConsent, getDomesticStandingOrderConsent, createDomesticStandingOrder, getDomesticStandingOrder, createInternationalPaymentConsent, getInternationalPaymentConsent, getInternationalPaymentConsentsConsentIdFundsConfirmation, createInternationalPayment, getInternationalPayment, createInternationalScheduledPaymentConsent, getInternationalScheduledPaymentConsent, getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation, createInternationalScheduledPayment, getInternationalScheduledPayment, createInternationalStandingOrderConsent, getInternationalStandingOrderConsent, createInternationalStandingOrder, getInternationalStandingOrder, createFilePaymentConsent, getFilePaymentConsent, createFilePaymentFile, getFilePaymentFile, createFilePayment, getFilePayment, getFilePaymentReport);
    }

    @Override
    public String toString() {
        return "OBDiscoveryAPILinksPayment4{" +
                "createDomesticPaymentConsent='" + createDomesticPaymentConsent + '\'' +
                ", getDomesticPaymentConsent='" + getDomesticPaymentConsent + '\'' +
                ", getDomesticPaymentConsentsConsentIdFundsConfirmation='" + getDomesticPaymentConsentsConsentIdFundsConfirmation + '\'' +
                ", createDomesticPayment='" + createDomesticPayment + '\'' +
                ", getDomesticPayment='" + getDomesticPayment + '\'' +
                ", createDomesticScheduledPaymentConsent='" + createDomesticScheduledPaymentConsent + '\'' +
                ", getDomesticScheduledPaymentConsent='" + getDomesticScheduledPaymentConsent + '\'' +
                ", createDomesticScheduledPayment='" + createDomesticScheduledPayment + '\'' +
                ", getDomesticScheduledPayment='" + getDomesticScheduledPayment + '\'' +
                ", createDomesticStandingOrderConsent='" + createDomesticStandingOrderConsent + '\'' +
                ", getDomesticStandingOrderConsent='" + getDomesticStandingOrderConsent + '\'' +
                ", createDomesticStandingOrder='" + createDomesticStandingOrder + '\'' +
                ", getDomesticStandingOrder='" + getDomesticStandingOrder + '\'' +
                ", createInternationalPaymentConsent='" + createInternationalPaymentConsent + '\'' +
                ", getInternationalPaymentConsent='" + getInternationalPaymentConsent + '\'' +
                ", getInternationalPaymentConsentsConsentIdFundsConfirmation='" + getInternationalPaymentConsentsConsentIdFundsConfirmation + '\'' +
                ", createInternationalPayment='" + createInternationalPayment + '\'' +
                ", getInternationalPayment='" + getInternationalPayment + '\'' +
                ", createInternationalScheduledPaymentConsent='" + createInternationalScheduledPaymentConsent + '\'' +
                ", getInternationalScheduledPaymentConsent='" + getInternationalScheduledPaymentConsent + '\'' +
                ", getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation='" + getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation + '\'' +
                ", createInternationalScheduledPayment='" + createInternationalScheduledPayment + '\'' +
                ", getInternationalScheduledPayment='" + getInternationalScheduledPayment + '\'' +
                ", createInternationalStandingOrderConsent='" + createInternationalStandingOrderConsent + '\'' +
                ", getInternationalStandingOrderConsent='" + getInternationalStandingOrderConsent + '\'' +
                ", createInternationalStandingOrder='" + createInternationalStandingOrder + '\'' +
                ", getInternationalStandingOrder='" + getInternationalStandingOrder + '\'' +
                ", createFilePaymentConsent='" + createFilePaymentConsent + '\'' +
                ", getFilePaymentConsent='" + getFilePaymentConsent + '\'' +
                ", createFilePaymentFile='" + createFilePaymentFile + '\'' +
                ", getFilePaymentFile='" + getFilePaymentFile + '\'' +
                ", createFilePayment='" + createFilePayment + '\'' +
                ", getFilePayment='" + getFilePayment + '\'' +
                ", getFilePaymentReport='" + getFilePaymentReport + '\'' +
                '}';
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
