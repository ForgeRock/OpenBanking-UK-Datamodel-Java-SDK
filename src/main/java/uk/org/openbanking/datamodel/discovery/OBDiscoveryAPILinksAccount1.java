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
public class OBDiscoveryAPILinksAccount1 implements OBDiscoveryAPILinks {

    @JsonProperty("CreateAccountRequest")
    private String createAccountRequest;
    @JsonProperty("GetAccountRequest")
    private String getAccountRequest;
    @JsonProperty("DeleteAccountRequest")
    private String deleteAccountRequest;
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

    public String getCreateAccountRequest() {
        return createAccountRequest;
    }

    public void setCreateAccountRequest(String createAccountRequest) {
        this.createAccountRequest = createAccountRequest;
    }

    public OBDiscoveryAPILinksAccount1 createAccountRequest(String createAccountRequest) {
        this.createAccountRequest = createAccountRequest;
        return this;
    }

    public String getGetAccountRequest() {
        return getAccountRequest;
    }

    public void setGetAccountRequest(String getAccountRequest) {
        this.getAccountRequest = getAccountRequest;
    }

    public OBDiscoveryAPILinksAccount1 getAccountRequest(String getAccountRequest) {
        this.getAccountRequest = getAccountRequest;
        return this;
    }

    public String getDeleteAccountRequest() {
        return deleteAccountRequest;
    }

    public void setDeleteAccountRequest(String deleteAccountRequest) {
        this.deleteAccountRequest = deleteAccountRequest;
    }

    public OBDiscoveryAPILinksAccount1 deleteAccountRequest(String deleteAccountRequest) {
        this.deleteAccountRequest = deleteAccountRequest;
        return this;
    }

    public String getGetAccounts() {
        return getAccounts;
    }

    public void setGetAccounts(String getAccounts) {
        this.getAccounts = getAccounts;
    }

    public OBDiscoveryAPILinksAccount1 getAccounts(String getAccounts) {
        this.getAccounts = getAccounts;
        return this;
    }

    public String getGetAccount() {
        return getAccount;
    }

    public void setGetAccount(String getAccount) {
        this.getAccount = getAccount;
    }

    public OBDiscoveryAPILinksAccount1 getAccount(String getAccount) {
        this.getAccount = getAccount;
        return this;
    }

    public String getGetAccountTransactions() {
        return getAccountTransactions;
    }

    public void setGetAccountTransactions(String getAccountTransactions) {
        this.getAccountTransactions = getAccountTransactions;
    }

    public OBDiscoveryAPILinksAccount1 getAccountTransactions(String getAccountTransactions) {
        this.getAccountTransactions = getAccountTransactions;
        return this;
    }

    public String getGetAccountBeneficiaries() {
        return getAccountBeneficiaries;
    }

    public void setGetAccountBeneficiaries(String getAccountBeneficiaries) {
        this.getAccountBeneficiaries = getAccountBeneficiaries;
    }

    public OBDiscoveryAPILinksAccount1 getAccountBeneficiaries(String getAccountBeneficiaries) {
        this.getAccountBeneficiaries = getAccountBeneficiaries;
        return this;
    }

    public String getGetAccountBalances() {
        return getAccountBalances;
    }

    public void setGetAccountBalances(String getAccountBalances) {
        this.getAccountBalances = getAccountBalances;
    }

    public OBDiscoveryAPILinksAccount1 getAccountBalances(String getAccountBalances) {
        this.getAccountBalances = getAccountBalances;
        return this;
    }

    public String getGetAccountDirectDebits() {
        return getAccountDirectDebits;
    }

    public void setGetAccountDirectDebits(String getAccountDirectDebits) {
        this.getAccountDirectDebits = getAccountDirectDebits;
    }

    public OBDiscoveryAPILinksAccount1 getAccountDirectDebits(String getAccountDirectDebits) {
        this.getAccountDirectDebits = getAccountDirectDebits;
        return this;
    }

    public String getGetAccountStandingOrders() {
        return getAccountStandingOrders;
    }

    public void setGetAccountStandingOrders(String getAccountStandingOrders) {
        this.getAccountStandingOrders = getAccountStandingOrders;
    }

    public OBDiscoveryAPILinksAccount1 getAccountStandingOrders(String getAccountStandingOrders) {
        this.getAccountStandingOrders = getAccountStandingOrders;
        return this;
    }

    public String getGetAccountProduct() {
        return getAccountProduct;
    }

    public void setGetAccountProduct(String getAccountProduct) {
        this.getAccountProduct = getAccountProduct;
    }

    public OBDiscoveryAPILinksAccount1 getAccountProduct(String getAccountProduct) {
        this.getAccountProduct = getAccountProduct;
        return this;
    }

    public String getGetStandingOrders() {
        return getStandingOrders;
    }

    public void setGetStandingOrders(String getStandingOrders) {
        this.getStandingOrders = getStandingOrders;
    }

    public OBDiscoveryAPILinksAccount1 getStandingOrders(String getStandingOrders) {
        this.getStandingOrders = getStandingOrders;
        return this;
    }

    public String getGetDirectDebits() {
        return getDirectDebits;
    }

    public void setGetDirectDebits(String getDirectDebits) {
        this.getDirectDebits = getDirectDebits;
    }

    public OBDiscoveryAPILinksAccount1 getDirectDebits(String getDirectDebits) {
        this.getDirectDebits = getDirectDebits;
        return this;
    }

    public String getGetBeneficiaries() {
        return getBeneficiaries;
    }

    public void setGetBeneficiaries(String getBeneficiaries) {
        this.getBeneficiaries = getBeneficiaries;
    }

    public OBDiscoveryAPILinksAccount1 getBeneficiaries(String getBeneficiaries) {
        this.getBeneficiaries = getBeneficiaries;
        return this;
    }

    public String getGetTransactions() {
        return getTransactions;
    }

    public void setGetTransactions(String getTransactions) {
        this.getTransactions = getTransactions;
    }

    public OBDiscoveryAPILinksAccount1 getTransactions(String getTransactions) {
        this.getTransactions = getTransactions;
        return this;
    }

    public String getGetBalances() {
        return getBalances;
    }

    public void setGetBalances(String getBalances) {
        this.getBalances = getBalances;
    }

    public OBDiscoveryAPILinksAccount1 getBalances(String getBalances) {
        this.getBalances = getBalances;
        return this;
    }

    public String getGetProducts() {
        return getProducts;
    }

    public void setGetProducts(String getProducts) {
        this.getProducts = getProducts;
    }

    public OBDiscoveryAPILinksAccount1 getProducts(String getProducts) {
        this.getProducts = getProducts;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OBDiscoveryAPILinksAccount1 that = (OBDiscoveryAPILinksAccount1) o;
        return Objects.equals(createAccountRequest, that.createAccountRequest) &&
                Objects.equals(getAccountRequest, that.getAccountRequest) &&
                Objects.equals(deleteAccountRequest, that.deleteAccountRequest) &&
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
                Objects.equals(getProducts, that.getProducts);
    }

    @Override
    public int hashCode() {

        return Objects.hash(createAccountRequest, getAccountRequest, deleteAccountRequest, getAccounts, getAccount,
                getAccountTransactions, getAccountBeneficiaries, getAccountBalances, getAccountDirectDebits,
                getAccountStandingOrders, getAccountProduct, getStandingOrders, getDirectDebits, getBeneficiaries,
                getTransactions, getBalances, getProducts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDiscovery {\n");
        sb.append("    createAccountRequest: ").append(toIndentedString(createAccountRequest)).append("\n");
        sb.append("    getAccountRequest: ").append(toIndentedString(getAccountRequest)).append("\n");
        sb.append("    deleteAccountRequest: ").append(toIndentedString(deleteAccountRequest)).append("\n");
        sb.append("    getAccounts: ").append(toIndentedString(getAccounts)).append("\n");
        sb.append("    getAccount: ").append(toIndentedString(getAccount)).append("\n");
        sb.append("    getAccountTransactions: ").append(toIndentedString(getAccountTransactions)).append("\n");
        sb.append("    getAccountBeneficiaries: ").append(toIndentedString(getAccountBeneficiaries)).append("\n");
        sb.append("    getAccountBalances: ").append(toIndentedString(getAccountBalances)).append("\n");
        sb.append("    getAccountDirectDebits: ").append(toIndentedString(getAccountDirectDebits)).append("\n");
        sb.append("    getAccountStandingOrders: ").append(toIndentedString(getAccountStandingOrders)).append("\n");
        sb.append("    getAccountProduct: ").append(toIndentedString(getAccountProduct)).append("\n");
        sb.append("    getStandingOrders: ").append(toIndentedString(getStandingOrders)).append("\n");
        sb.append("    getDirectDebits: ").append(toIndentedString(getDirectDebits)).append("\n");
        sb.append("    getBeneficiaries: ").append(toIndentedString(getBeneficiaries)).append("\n");
        sb.append("    getTransactions: ").append(toIndentedString(getTransactions)).append("\n");
        sb.append("    getBalances: ").append(toIndentedString(getBalances)).append("\n");
        sb.append("    getProducts: ").append(toIndentedString(getProducts)).append("\n");
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
