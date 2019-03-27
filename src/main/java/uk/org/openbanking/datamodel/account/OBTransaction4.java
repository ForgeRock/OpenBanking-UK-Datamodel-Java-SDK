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
package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.springframework.validation.annotation.Validated;
import uk.org.openbanking.datamodel.payment.OBActiveOrHistoricCurrencyAndAmount;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Provides further details on an entry in the report.
 */
@ApiModel(description = "Provides further details on an entry in the report.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-28T11:14:51.272Z")

public class OBTransaction4   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("TransactionId")
  private String transactionId = null;

  @JsonProperty("TransactionReference")
  private String transactionReference = null;

  @JsonProperty("StatementReference")
  @Valid
  private List<String> statementReference = null;

  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode creditDebitIndicator = null;

  @JsonProperty("Status")
  private OBEntryStatus1Code status = null;

  @JsonProperty("BookingDateTime")
  private DateTime bookingDateTime = null;

  @JsonProperty("ValueDateTime")
  private DateTime valueDateTime = null;

  @JsonProperty("AddressLine")
  private String addressLine = null;

  @JsonProperty("Amount")
  private OBActiveOrHistoricCurrencyAndAmount amount = null;

  @JsonProperty("ChargeAmount")
  private OBActiveOrHistoricCurrencyAndAmount chargeAmount = null;

  @JsonProperty("CurrencyExchange")
  private OBCurrencyExchange5 currencyExchange = null;

  @JsonProperty("BankTransactionCode")
  private OBBankTransactionCodeStructure1 bankTransactionCode = null;

  @JsonProperty("ProprietaryBankTransactionCode")
  private OBTransaction3ProprietaryBankTransactionCode proprietaryBankTransactionCode = null;

  @JsonProperty("CardInstrument")
  private OBTransactionCardInstrument1 cardInstrument = null;

  @JsonProperty("SupplementaryData")
  private OBSupplementaryData1 supplementaryData = null;

  @JsonProperty("TransactionInformation")
  private String transactionInformation = null;

  @JsonProperty("Balance")
  private OBTransactionCashBalance balance = null;

  @JsonProperty("MerchantDetails")
  private OBMerchantDetails1 merchantDetails = null;

  @JsonProperty("CreditorAgent")
  private OBBranchAndFinancialInstitutionIdentification3 creditorAgent = null;

  @JsonProperty("CreditorAccount")
  private OBCashAccount3 creditorAccount = null;

  @JsonProperty("DebtorAgent")
  private OBBranchAndFinancialInstitutionIdentification3 debtorAgent = null;

  @JsonProperty("DebtorAccount")
  private OBCashAccount3 debtorAccount = null;

  public OBTransaction4 accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBTransaction4 transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
   * @return transactionId
  **/
  @ApiModelProperty(value = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.")

@Size(min=1,max=40) 
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public OBTransaction4 transactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
    return this;
  }

  /**
   * Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.
   * @return transactionReference
  **/
  @ApiModelProperty(value = "Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.")

@Size(min=1,max=35) 
  public String getTransactionReference() {
    return transactionReference;
  }

  public void setTransactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
  }

  public OBTransaction4 statementReference(List<String> statementReference) {
    this.statementReference = statementReference;
    return this;
  }

  public OBTransaction4 addStatementReferenceItem(String statementReferenceItem) {
    if (this.statementReference == null) {
      this.statementReference = new ArrayList<String>();
    }
    this.statementReference.add(statementReferenceItem);
    return this;
  }

  /**
   * Unique reference for the statement. This reference may be optionally populated if available.
   * @return statementReference
  **/
  @ApiModelProperty(value = "Unique reference for the statement. This reference may be optionally populated if available.")


  public List<String> getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(List<String> statementReference) {
    this.statementReference = statementReference;
  }

  public OBTransaction4 creditDebitIndicator(OBCreditDebitCode creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Indicates whether the transaction is a credit or a debit entry.
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the transaction is a credit or a debit entry.")
  @NotNull


  public OBCreditDebitCode getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBTransaction4 status(OBEntryStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBEntryStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBEntryStatus1Code status) {
    this.status = status;
  }

  public OBTransaction4 bookingDateTime(DateTime bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
    return this;
  }

  /**
   * Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return bookingDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getBookingDateTime() {
    return bookingDateTime;
  }

  public void setBookingDateTime(DateTime bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
  }

  public OBTransaction4 valueDateTime(DateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
    return this;
  }

  /**
   * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return valueDateTime
  **/
  @ApiModelProperty(value = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getValueDateTime() {
    return valueDateTime;
  }

  public void setValueDateTime(DateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public OBTransaction4 addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  /**
   * Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.
   * @return addressLine
  **/
  @ApiModelProperty(value = "Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.")

@Size(min=1,max=70) 
  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public OBTransaction4 amount(OBActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBActiveOrHistoricCurrencyAndAmount getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
  }

  public OBTransaction4 chargeAmount(OBActiveOrHistoricCurrencyAndAmount chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

  /**
   * Get chargeAmount
   * @return chargeAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBActiveOrHistoricCurrencyAndAmount getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(OBActiveOrHistoricCurrencyAndAmount chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public OBTransaction4 currencyExchange(OBCurrencyExchange5 currencyExchange) {
    this.currencyExchange = currencyExchange;
    return this;
  }

  /**
   * Get currencyExchange
   * @return currencyExchange
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBCurrencyExchange5 getCurrencyExchange() {
    return currencyExchange;
  }

  public void setCurrencyExchange(OBCurrencyExchange5 currencyExchange) {
    this.currencyExchange = currencyExchange;
  }

  public OBTransaction4 bankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
    return this;
  }

  /**
   * Get bankTransactionCode
   * @return bankTransactionCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBBankTransactionCodeStructure1 getBankTransactionCode() {
    return bankTransactionCode;
  }

  public void setBankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
  }

  public OBTransaction4 proprietaryBankTransactionCode(OBTransaction3ProprietaryBankTransactionCode proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    return this;
  }

  /**
   * Get proprietaryBankTransactionCode
   * @return proprietaryBankTransactionCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBTransaction3ProprietaryBankTransactionCode getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }

  public void setProprietaryBankTransactionCode(OBTransaction3ProprietaryBankTransactionCode proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }

  public OBTransaction4 cardInstrument(OBTransactionCardInstrument1 cardInstrument) {
    this.cardInstrument = cardInstrument;
    return this;
  }

  /**
   * Get cardInstrument
   * @return cardInstrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBTransactionCardInstrument1 getCardInstrument() {
    return cardInstrument;
  }

  public void setCardInstrument(OBTransactionCardInstrument1 cardInstrument) {
    this.cardInstrument = cardInstrument;
  }

  public OBTransaction4 supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBSupplementaryData1 getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  public OBTransaction4 transactionInformation(String transactionInformation) {
    this.transactionInformation = transactionInformation;
    return this;
  }

  /**
   * Get transactionInformation
   * @return transactionInformation
  **/
  @ApiModelProperty(value = "")


  public String getTransactionInformation() {
    return transactionInformation;
  }

  public void setTransactionInformation(String transactionInformation) {
    this.transactionInformation = transactionInformation;
  }

  public OBTransaction4 balance(OBTransactionCashBalance balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBTransactionCashBalance getBalance() {
    return balance;
  }

  public void setBalance(OBTransactionCashBalance balance) {
    this.balance = balance;
  }

  public OBTransaction4 merchantDetails(OBMerchantDetails1 merchantDetails) {
    this.merchantDetails = merchantDetails;
    return this;
  }

  /**
   * Get merchantDetails
   * @return merchantDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBMerchantDetails1 getMerchantDetails() {
    return merchantDetails;
  }

  public void setMerchantDetails(OBMerchantDetails1 merchantDetails) {
    this.merchantDetails = merchantDetails;
  }

  public OBTransaction4 creditorAgent(OBBranchAndFinancialInstitutionIdentification3 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   * @return creditorAgent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBBranchAndFinancialInstitutionIdentification3 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification3 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBTransaction4 creditorAccount(OBCashAccount3 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBCashAccount3 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount3 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBTransaction4 debtorAgent(OBBranchAndFinancialInstitutionIdentification3 debtorAgent) {
    this.debtorAgent = debtorAgent;
    return this;
  }

  /**
   * Get debtorAgent
   * @return debtorAgent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBBranchAndFinancialInstitutionIdentification3 getDebtorAgent() {
    return debtorAgent;
  }

  public void setDebtorAgent(OBBranchAndFinancialInstitutionIdentification3 debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  public OBTransaction4 debtorAccount(OBCashAccount3 debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBCashAccount3 getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(OBCashAccount3 debtorAccount) {
    this.debtorAccount = debtorAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTransaction4 obTransaction4 = (OBTransaction4) o;
    return Objects.equals(this.accountId, obTransaction4.accountId) &&
        Objects.equals(this.transactionId, obTransaction4.transactionId) &&
        Objects.equals(this.transactionReference, obTransaction4.transactionReference) &&
        Objects.equals(this.statementReference, obTransaction4.statementReference) &&
        Objects.equals(this.creditDebitIndicator, obTransaction4.creditDebitIndicator) &&
        Objects.equals(this.status, obTransaction4.status) &&
        Objects.equals(this.bookingDateTime, obTransaction4.bookingDateTime) &&
        Objects.equals(this.valueDateTime, obTransaction4.valueDateTime) &&
        Objects.equals(this.addressLine, obTransaction4.addressLine) &&
        Objects.equals(this.amount, obTransaction4.amount) &&
        Objects.equals(this.chargeAmount, obTransaction4.chargeAmount) &&
        Objects.equals(this.currencyExchange, obTransaction4.currencyExchange) &&
        Objects.equals(this.bankTransactionCode, obTransaction4.bankTransactionCode) &&
        Objects.equals(this.proprietaryBankTransactionCode, obTransaction4.proprietaryBankTransactionCode) &&
        Objects.equals(this.cardInstrument, obTransaction4.cardInstrument) &&
        Objects.equals(this.supplementaryData, obTransaction4.supplementaryData) &&
        Objects.equals(this.transactionInformation, obTransaction4.transactionInformation) &&
        Objects.equals(this.balance, obTransaction4.balance) &&
        Objects.equals(this.merchantDetails, obTransaction4.merchantDetails) &&
        Objects.equals(this.creditorAgent, obTransaction4.creditorAgent) &&
        Objects.equals(this.creditorAccount, obTransaction4.creditorAccount) &&
        Objects.equals(this.debtorAgent, obTransaction4.debtorAgent) &&
        Objects.equals(this.debtorAccount, obTransaction4.debtorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, transactionId, transactionReference, statementReference, creditDebitIndicator, status, bookingDateTime, valueDateTime, addressLine, amount, chargeAmount, currencyExchange, bankTransactionCode, proprietaryBankTransactionCode, cardInstrument, supplementaryData, transactionInformation, balance, merchantDetails, creditorAgent, creditorAccount, debtorAgent, debtorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransaction4 {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
    sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
    sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
    sb.append("    cardInstrument: ").append(toIndentedString(cardInstrument)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    transactionInformation: ").append(toIndentedString(transactionInformation)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

