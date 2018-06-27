/*
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
 *  Copyright 2017 ForgeRock AS.
 *
 */

package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.payment.ActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.jackson.DateTimeDeserializer;
import uk.org.openbanking.jackson.DateTimeSerializer;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Data3Transaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class OBTransaction1 {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("TransactionId")
  private String transactionId = null;

  @JsonProperty("TransactionReference")
  private String transactionReference = null;

  @JsonProperty("Amount")
  private ActiveOrHistoricCurrencyAndAmount amount = null;

  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode creditDebitIndicator = null;

  @JsonProperty("Status")
  private OBEntryStatus1Code status = null;

  @JsonProperty("BookingDateTime")
  @JsonDeserialize(using = DateTimeDeserializer.class)
  @JsonSerialize(using = DateTimeSerializer.class)
  private DateTime bookingDateTime = null;

  @JsonProperty("ValueDateTime")
  @JsonDeserialize(using = DateTimeDeserializer.class)
  @JsonSerialize(using = DateTimeSerializer.class)
  private DateTime valueDateTime = null;

  @JsonProperty("TransactionInformation")
  private String transactionInformation = null;

  @JsonProperty("AddressLine")
  private String addressLine = null;

  @JsonProperty("BankTransactionCode")
  private OBBankTransactionCodeStructure1 bankTransactionCode = null;

  @JsonProperty("ProprietaryBankTransactionCode")
  private ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode = null;

  @JsonProperty("Balance")
  private OBTransactionCashBalance balance = null;

  @JsonProperty("MerchantDetails")
  private OBMerchantDetails1 merchantDetails = null;

  public OBTransaction1 accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  @NotNull

 @Size(min=1,max=40)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBTransaction1 transactionId(String transactionId) {
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

  public OBTransaction1 transactionReference(String transactionReference) {
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

  public OBTransaction1 amount(ActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ActiveOrHistoricCurrencyAndAmount getAmount() {
    return amount;
  }

  public void setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
  }

  public OBTransaction1 creditDebitIndicator(OBCreditDebitCode creditDebitIndicator) {
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

  public OBTransaction1 status(OBEntryStatus1Code status) {
    this.status = status;
    return this;
  }

   /**
   * Status of a transaction entry on the books of the account servicer.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of a transaction entry on the books of the account servicer.")
  @NotNull


  public OBEntryStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBEntryStatus1Code status) {
    this.status = status;
  }

  public OBTransaction1 bookingDateTime(DateTime bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
    return this;
  }

   /**
   * Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return bookingDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getBookingDateTime() {
    return bookingDateTime;
  }

  public void setBookingDateTime(DateTime bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
  }

  public OBTransaction1 valueDateTime(DateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
    return this;
  }

   /**
   * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit entry.  Usage: If entry status is pending and value date is present, then the value date refers to an expected/requested value date. For entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the  number of availability days.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return valueDateTime
  **/
  @ApiModelProperty(value = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit entry.  Usage: If entry status is pending and value date is present, then the value date refers to an expected/requested value date. For entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the  number of availability days.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getValueDateTime() {
    return valueDateTime;
  }

  public void setValueDateTime(DateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public OBTransaction1 transactionInformation(String transactionInformation) {
    this.transactionInformation = transactionInformation;
    return this;
  }

   /**
   * Further details of the transaction. This is the transaction narrative, which is unstructured text.
   * @return transactionInformation
  **/
  @ApiModelProperty(value = "Further details of the transaction. This is the transaction narrative, which is unstructured text.")

 @Size(min=1,max=500)
  public String getTransactionInformation() {
    return transactionInformation;
  }

  public void setTransactionInformation(String transactionInformation) {
    this.transactionInformation = transactionInformation;
  }

  public OBTransaction1 addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

   /**
   * Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.
   * @return addressLine
  **/
  @ApiModelProperty(value = "Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.")

 @Size(min=1,max=70)
  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public OBTransaction1 bankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
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

  public OBTransaction1 proprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    return this;
  }

   /**
   * Get proprietaryBankTransactionCode
   * @return proprietaryBankTransactionCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProprietaryBankTransactionCodeStructure1 getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }

  public void setProprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }

  public OBTransaction1 balance(OBTransactionCashBalance balance) {
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

  public OBTransaction1 merchantDetails(OBMerchantDetails1 merchantDetails) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTransaction1 data3Transaction = (OBTransaction1) o;
    return Objects.equals(this.accountId, data3Transaction.accountId) &&
        Objects.equals(this.transactionId, data3Transaction.transactionId) &&
        Objects.equals(this.transactionReference, data3Transaction.transactionReference) &&
        Objects.equals(this.amount, data3Transaction.amount) &&
        Objects.equals(this.creditDebitIndicator, data3Transaction.creditDebitIndicator) &&
        Objects.equals(this.status, data3Transaction.status) &&
        Objects.equals(this.bookingDateTime, data3Transaction.bookingDateTime) &&
        Objects.equals(this.valueDateTime, data3Transaction.valueDateTime) &&
        Objects.equals(this.transactionInformation, data3Transaction.transactionInformation) &&
        Objects.equals(this.addressLine, data3Transaction.addressLine) &&
        Objects.equals(this.bankTransactionCode, data3Transaction.bankTransactionCode) &&
        Objects.equals(this.proprietaryBankTransactionCode, data3Transaction.proprietaryBankTransactionCode) &&
        Objects.equals(this.balance, data3Transaction.balance) &&
        Objects.equals(this.merchantDetails, data3Transaction.merchantDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, transactionId, transactionReference, amount, creditDebitIndicator, status, bookingDateTime, valueDateTime, transactionInformation, addressLine, bankTransactionCode, proprietaryBankTransactionCode, balance, merchantDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data3Transaction {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
    sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
    sb.append("    transactionInformation: ").append(toIndentedString(transactionInformation)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
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

