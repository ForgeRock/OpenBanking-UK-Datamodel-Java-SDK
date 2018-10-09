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
public class OBDiscoveryAPILinksAccount3 implements OBDiscoveryAPILinks {

    @JsonProperty("CreateAccountAccessConsent")
    private String createAccountAccessConsent;
    @JsonProperty("GetAccountAccessConsent")
    private String getAccountAccessConsent;
    @JsonProperty("DeleteAccountAccessConsent")
    private String deleteAccountAccessConsent;
    @JsonProperty("GetAccounts")
    private String getAccounts;
    @JsonProperty("GetAccount")
    private String getAccount;
    @JsonProperty("GetAccountTransactions")
    private String getAccountTransactions;
    @JsonProperty("GetAccountBeneficiaries")
    private String getAccountBeneficiaries;
    @JsonProperty("GetAccountBalances")
    private String getAccountBalances;
    @JsonProperty("GetAccountDirectDebits")
    private String getAccountDirectDebits;
    @JsonProperty("GetAccountStandingOrders")
    private String getAccountStandingOrders;
    @JsonProperty("GetAccountProduct")
    private String getAccountProduct;
    @JsonProperty("GetStandingOrders")
    private String getStandingOrders;
    @JsonProperty("GetDirectDebits")
    private String getDirectDebits;
    @JsonProperty("GetBeneficiaries")
    private String getBeneficiaries;
    @JsonProperty("GetTransactions")
    private String getTransactions;
    @JsonProperty("GetBalances")
    private String getBalances;
    @JsonProperty("GetProducts")
    private String getProducts;
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

    public String getCreateAccountAccessConsent() {
        return createAccountAccessConsent;
    }

    public void setCreateAccountAccessConsent(String createAccountAccessConsent) {
        this.createAccountAccessConsent = createAccountAccessConsent;
    }

    public String getGetAccountAccessConsent() {
        return getAccountAccessConsent;
    }

    public void setGetAccountAccessConsent(String getAccountAccessConsent) {
        this.getAccountAccessConsent = getAccountAccessConsent;
    }

    public String getDeleteAccountAccessConsent() {
        return deleteAccountAccessConsent;
    }

    public void setDeleteAccountAccessConsent(String deleteAccountAccessConsent) {
        this.deleteAccountAccessConsent = deleteAccountAccessConsent;
    }

    public String getGetAccounts() {
        return getAccounts;
    }

    public void setGetAccounts(String getAccounts) {
        this.getAccounts = getAccounts;
    }

    public String getGetAccount() {
        return getAccount;
    }

    public void setGetAccount(String getAccount) {
        this.getAccount = getAccount;
    }

    public String getGetAccountTransactions() {
        return getAccountTransactions;
    }

    public void setGetAccountTransactions(String getAccountTransactions) {
        this.getAccountTransactions = getAccountTransactions;
    }

    public String getGetAccountBeneficiaries() {
        return getAccountBeneficiaries;
    }

    public void setGetAccountBeneficiaries(String getAccountBeneficiaries) {
        this.getAccountBeneficiaries = getAccountBeneficiaries;
    }

    public String getGetAccountBalances() {
        return getAccountBalances;
    }

    public void setGetAccountBalances(String getAccountBalances) {
        this.getAccountBalances = getAccountBalances;
    }

    public String getGetAccountDirectDebits() {
        return getAccountDirectDebits;
    }

    public void setGetAccountDirectDebits(String getAccountDirectDebits) {
        this.getAccountDirectDebits = getAccountDirectDebits;
    }

    public String getGetAccountStandingOrders() {
        return getAccountStandingOrders;
    }

    public void setGetAccountStandingOrders(String getAccountStandingOrders) {
        this.getAccountStandingOrders = getAccountStandingOrders;
    }

    public String getGetAccountProduct() {
        return getAccountProduct;
    }

    public void setGetAccountProduct(String getAccountProduct) {
        this.getAccountProduct = getAccountProduct;
    }

    public String getGetStandingOrders() {
        return getStandingOrders;
    }

    public void setGetStandingOrders(String getStandingOrders) {
        this.getStandingOrders = getStandingOrders;
    }

    public String getGetDirectDebits() {
        return getDirectDebits;
    }

    public void setGetDirectDebits(String getDirectDebits) {
        this.getDirectDebits = getDirectDebits;
    }

    public String getGetBeneficiaries() {
        return getBeneficiaries;
    }

    public void setGetBeneficiaries(String getBeneficiaries) {
        this.getBeneficiaries = getBeneficiaries;
    }

    public String getGetTransactions() {
        return getTransactions;
    }

    public void setGetTransactions(String getTransactions) {
        this.getTransactions = getTransactions;
    }

    public String getGetBalances() {
        return getBalances;
    }

    public void setGetBalances(String getBalances) {
        this.getBalances = getBalances;
    }

    public String getGetProducts() {
        return getProducts;
    }

    public void setGetProducts(String getProducts) {
        this.getProducts = getProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OBDiscoveryAPILinksAccount3)) return false;
        OBDiscoveryAPILinksAccount3 that = (OBDiscoveryAPILinksAccount3) o;
        return Objects.equals(createAccountAccessConsent, that.createAccountAccessConsent) &&
                Objects.equals(getAccountAccessConsent, that.getAccountAccessConsent) &&
                Objects.equals(deleteAccountAccessConsent, that.deleteAccountAccessConsent) &&
                Objects.equals(getAccounts, that.getAccounts) &&
                Objects.equals(getAccount, that.getAccount) &&
                Objects.equals(getAccountTransactions, that.getAccountTransactions) &&
                Objects.equals(getAccountBeneficiaries, that.getAccountBeneficiaries) &&
                Objects.equals(getAccountBalances, that.getAccountBalances) &&
                Objects.equals(getAccountDirectDebits, that.getAccountDirectDebits) &&
                Objects.equals(getAccountStandingOrders, that.getAccountStandingOrders) &&
                Objects.equals(getAccountProduct, that.getAccountProduct) &&
                Objects.equals(getStandingOrders, that.getStandingOrders) &&
                Objects.equals(getDirectDebits, that.getDirectDebits) &&
                Objects.equals(getBeneficiaries, that.getBeneficiaries) &&
                Objects.equals(getTransactions, that.getTransactions) &&
                Objects.equals(getBalances, that.getBalances) &&
                Objects.equals(getProducts, that.getProducts) &&
                Objects.equals(getAccountOffers, that.getAccountOffers) &&
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
        return Objects.hash(createAccountAccessConsent, getAccountAccessConsent, deleteAccountAccessConsent, getAccounts, getAccount, getAccountTransactions, getAccountBeneficiaries, getAccountBalances, getAccountDirectDebits, getAccountStandingOrders, getAccountProduct, getStandingOrders, getDirectDebits, getBeneficiaries, getTransactions, getBalances, getProducts, getAccountOffers, getAccountParty, getAccountScheduledPayments, getAccountStatements, getAccountStatement, getAccountStatementFile, getAccountStatementTransactions, getOffers, getParty, getScheduledPayments, getStatements);
    }

    @Override
    public String toString() {
        return "OBDiscoveryAPILinksAccount3{" +
                "createAccountAccessConsent='" + createAccountAccessConsent + '\'' +
                ", getAccountAccessConsent='" + getAccountAccessConsent + '\'' +
                ", deleteAccountAccessConsent='" + deleteAccountAccessConsent + '\'' +
                ", getAccounts='" + getAccounts + '\'' +
                ", getAccount='" + getAccount + '\'' +
                ", getAccountTransactions='" + getAccountTransactions + '\'' +
                ", getAccountBeneficiaries='" + getAccountBeneficiaries + '\'' +
                ", getAccountBalances='" + getAccountBalances + '\'' +
                ", getAccountDirectDebits='" + getAccountDirectDebits + '\'' +
                ", getAccountStandingOrders='" + getAccountStandingOrders + '\'' +
                ", getAccountProduct='" + getAccountProduct + '\'' +
                ", getStandingOrders='" + getStandingOrders + '\'' +
                ", getDirectDebits='" + getDirectDebits + '\'' +
                ", getBeneficiaries='" + getBeneficiaries + '\'' +
                ", getTransactions='" + getTransactions + '\'' +
                ", getBalances='" + getBalances + '\'' +
                ", getProducts='" + getProducts + '\'' +
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
