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
 *  Copyright 2018 ForgeRock AS.
 *
 */

package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.joda.time.DateTime;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBTransaction2Basic   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("TransactionId")
  private String transactionId = null;

  @JsonProperty("TransactionReference")
  private String transactionReference = null;

  @JsonProperty("StatementReference")
  @Valid
  private List<String> statementReference = null;

  @JsonProperty("Amount")
  private OBTransaction2BasicAmount amount = null;

  /**
   * Indicates whether the transaction is a credit or a debit entry.
   */
  public enum CreditDebitIndicatorEnum {
    CREDIT("Credit"),
    
    DEBIT("Debit");

    private String value;

    CreditDebitIndicatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CreditDebitIndicatorEnum fromValue(String text) {
      for (CreditDebitIndicatorEnum b : CreditDebitIndicatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("CreditDebitIndicator")
  private CreditDebitIndicatorEnum creditDebitIndicator = null;

  @JsonProperty("Status")
  private OBEntryStatus1Code status = null;

  @JsonProperty("BookingDateTime")
  private DateTime bookingDateTime = null;

  @JsonProperty("ValueDateTime")
  private DateTime valueDateTime = null;

  @JsonProperty("AddressLine")
  private String addressLine = null;

  @JsonProperty("BankTransactionCode")
  private OBBankTransactionCodeStructure1 bankTransactionCode = null;

  @JsonProperty("ProprietaryBankTransactionCode")
  private OBTransaction2ProprietaryBankTransactionCode proprietaryBankTransactionCode = null;

  @JsonProperty("EquivalentAmount")
  private OBTransaction2BasicEquivalentAmount equivalentAmount = null;

  @JsonProperty("CardInstrument")
  private OBTransactionCardInstrument1 cardInstrument = null;

  public OBTransaction2Basic accountId(String accountId) {
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

  public OBTransaction2Basic transactionId(String transactionId) {
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

  public OBTransaction2Basic transactionReference(String transactionReference) {
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

  public OBTransaction2Basic statementReference(List<String> statementReference) {
    this.statementReference = statementReference;
    return this;
  }

  public OBTransaction2Basic addStatementReferenceItem(String statementReferenceItem) {
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

  public OBTransaction2Basic amount(OBTransaction2BasicAmount amount) {
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

  public OBTransaction2BasicAmount getAmount() {
    return amount;
  }

  public void setAmount(OBTransaction2BasicAmount amount) {
    this.amount = amount;
  }

  public OBTransaction2Basic creditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Indicates whether the transaction is a credit or a debit entry.
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the transaction is a credit or a debit entry.")
  @NotNull


  public CreditDebitIndicatorEnum getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBTransaction2Basic status(OBEntryStatus1Code status) {
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

  public OBTransaction2Basic bookingDateTime(DateTime bookingDateTime) {
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

  public OBTransaction2Basic valueDateTime(DateTime valueDateTime) {
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

  public OBTransaction2Basic addressLine(String addressLine) {
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

  public OBTransaction2Basic bankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
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

  public OBTransaction2Basic proprietaryBankTransactionCode(OBTransaction2ProprietaryBankTransactionCode proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    return this;
  }

  /**
   * Get proprietaryBankTransactionCode
   * @return proprietaryBankTransactionCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBTransaction2ProprietaryBankTransactionCode getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }

  public void setProprietaryBankTransactionCode(OBTransaction2ProprietaryBankTransactionCode proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }

  public OBTransaction2Basic equivalentAmount(OBTransaction2BasicEquivalentAmount equivalentAmount) {
    this.equivalentAmount = equivalentAmount;
    return this;
  }

  /**
   * Get equivalentAmount
   * @return equivalentAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBTransaction2BasicEquivalentAmount getEquivalentAmount() {
    return equivalentAmount;
  }

  public void setEquivalentAmount(OBTransaction2BasicEquivalentAmount equivalentAmount) {
    this.equivalentAmount = equivalentAmount;
  }

  public OBTransaction2Basic cardInstrument(OBTransactionCardInstrument1 cardInstrument) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTransaction2Basic obTransaction2Basic = (OBTransaction2Basic) o;
    return Objects.equals(this.accountId, obTransaction2Basic.accountId) &&
        Objects.equals(this.transactionId, obTransaction2Basic.transactionId) &&
        Objects.equals(this.transactionReference, obTransaction2Basic.transactionReference) &&
        Objects.equals(this.statementReference, obTransaction2Basic.statementReference) &&
        Objects.equals(this.amount, obTransaction2Basic.amount) &&
        Objects.equals(this.creditDebitIndicator, obTransaction2Basic.creditDebitIndicator) &&
        Objects.equals(this.status, obTransaction2Basic.status) &&
        Objects.equals(this.bookingDateTime, obTransaction2Basic.bookingDateTime) &&
        Objects.equals(this.valueDateTime, obTransaction2Basic.valueDateTime) &&
        Objects.equals(this.addressLine, obTransaction2Basic.addressLine) &&
        Objects.equals(this.bankTransactionCode, obTransaction2Basic.bankTransactionCode) &&
        Objects.equals(this.proprietaryBankTransactionCode, obTransaction2Basic.proprietaryBankTransactionCode) &&
        Objects.equals(this.equivalentAmount, obTransaction2Basic.equivalentAmount) &&
        Objects.equals(this.cardInstrument, obTransaction2Basic.cardInstrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, transactionId, transactionReference, statementReference, amount, creditDebitIndicator, status, bookingDateTime, valueDateTime, addressLine, bankTransactionCode, proprietaryBankTransactionCode, equivalentAmount, cardInstrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransaction2Basic {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
    sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
    sb.append("    equivalentAmount: ").append(toIndentedString(equivalentAmount)).append("\n");
    sb.append("    cardInstrument: ").append(toIndentedString(cardInstrument)).append("\n");
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

