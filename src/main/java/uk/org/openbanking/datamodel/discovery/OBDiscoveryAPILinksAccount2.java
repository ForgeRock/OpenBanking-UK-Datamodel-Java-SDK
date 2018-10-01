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
 *  Copyright 2018 ForgeRock AS.
 */
package uk.org.openbanking.datamodel.discovery;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

import java.util.Objects;

@ApiModel(description = "Account and transaction endpoints corresponding to a specific version")
public class OBDiscoveryAPILinksAccount2 extends OBDiscoveryAPILinksAccount1 {

    @JsonProperty("GetAccountOffers")
    private String getAccountOffers;
    @JsonProperty("GetAccountParty")
    private String getAccountParty;
    @JsonProperty("GetAccountScheduledPayments")
    private String getAccountScheduledPayments;
    @JsonProperty("GetAccountStatements")
    private String getAccountStatements;
    @JsonProperty("GetAccountStatement")
    private String getAccountStatement;
    @JsonProperty("GetAccountStatementFile")
    private String getAccountStatementFile;
    @JsonProperty("GetAccountStatementTransactions")
    private String getAccountStatementTransactions;

    @JsonProperty("GetOffers")
    private String getOffers;
    @JsonProperty("GetParty")
    private String getParty;
    @JsonProperty("GetScheduledPayments")
    private String getScheduledPayments;
    @JsonProperty("GetStatement")
    private String getStatements;

    public String getGetAccountOffers() {
        return getAccountOffers;
    }

    public void setGetAccountOffers(String getAccountOffers) {
        this.getAccountOffers = getAccountOffers;
    }

    public String getGetAccountParty() {
        return getAccountParty;
    }

    public void setGetAccountParty(String getAccountParty) {
        this.getAccountParty = getAccountParty;
    }

    public String getGetAccountScheduledPayments() {
        return getAccountScheduledPayments;
    }

    public void setGetAccountScheduledPayments(String getAccountScheduledPayments) {
        this.getAccountScheduledPayments = getAccountScheduledPayments;
    }

    public String getGetAccountStatements() {
        return getAccountStatements;
    }

    public void setGetAccountStatements(String getAccountStatements) {
        this.getAccountStatements = getAccountStatements;
    }

    public String getGetAccountStatement() {
        return getAccountStatement;
    }

    public void setGetAccountStatement(String getAccountStatement) {
        this.getAccountStatement = getAccountStatement;
    }

    public String getGetAccountStatementFile() {
        return getAccountStatementFile;
    }

    public void setGetAccountStatementFile(String getAccountStatementFile) {
        this.getAccountStatementFile = getAccountStatementFile;
    }

    public String getGetAccountStatementTransactions() {
        return getAccountStatementTransactions;
    }

    public void setGetAccountStatementTransactions(String getAccountStatementTransactions) {
        this.getAccountStatementTransactions = getAccountStatementTransactions;
    }

    public String getGetOffers() {
        return getOffers;
    }

    public void setGetOffers(String getOffers) {
        this.getOffers = getOffers;
    }

    public String getGetParty() {
        return getParty;
    }

    public void setGetParty(String getParty) {
        this.getParty = getParty;
    }

    public String getGetScheduledPayments() {
        return getScheduledPayments;
    }

    public void setGetScheduledPayments(String getScheduledPayments) {
        this.getScheduledPayments = getScheduledPayments;
    }

    public String getGetStatements() {
        return getStatements;
    }

    public void setGetStatements(String getStatements) {
        this.getStatements = getStatements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OBDiscoveryAPILinksAccount2)) return false;
        if (!super.equals(o)) return false;
        OBDiscoveryAPILinksAccount2 that = (OBDiscoveryAPILinksAccount2) o;
        return Objects.equals(getAccountOffers, that.getAccountOffers) &&
                Objects.equals(getAccountParty, that.getAccountParty) &&
                Objects.equals(getAccountScheduledPayments, that.getAccountScheduledPayments) &&
                Objects.equals(getAccountStatements, that.getAccountStatements) &&
                Objects.equals(getAccountStatement, that.getAccountStatement) &&
                Objects.equals(getAccountStatementFile, that.getAccountStatementFile) &&
                Objects.equals(getAccountStatementTransactions, that.getAccountStatementTransactions) &&
                Objects.equals(getOffers, that.getOffers) &&
                Objects.equals(getParty, that.getParty) &&
                Objects.equals(getScheduledPayments, that.getScheduledPayments) &&
                Objects.equals(getStatements, that.getStatements);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getAccountOffers, getAccountParty, getAccountScheduledPayments, getAccountStatements, getAccountStatement, getAccountStatementFile, getAccountStatementTransactions, getOffers, getParty, getScheduledPayments, getStatements);
    }

    @Override
    public String toString() {
        return "OBDiscoveryAPILinksAccount2{" +
                "OBDiscoveryAPILinksAccount1='" + super.toString() + '\'' +
                ", getAccountOffers='" + getAccountOffers + '\'' +
                ", getAccountParty='" + getAccountParty + '\'' +
                ", getAccountScheduledPayments='" + getAccountScheduledPayments + '\'' +
                ", getAccountStatements='" + getAccountStatements + '\'' +
                ", getAccountStatement='" + getAccountStatement + '\'' +
                ", getAccountStatementFile='" + getAccountStatementFile + '\'' +
                ", getAccountStatementTransactions='" + getAccountStatementTransactions + '\'' +
                ", getOffers='" + getOffers + '\'' +
                ", getParty='" + getParty + '\'' +
                ", getScheduledPayments='" + getScheduledPayments + '\'' +
                ", getStatements='" + getStatements + '\'' +
                '}';
    }
}
