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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.payment.ActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.jackson.DateTimeDeserializer;
import uk.org.openbanking.jackson.DateTimeSerializer;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Balance
 */
@ApiModel(description = "Balance")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class OBCashBalance1 {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("Amount")
  private ActiveOrHistoricCurrencyAndAmount amount = null;


  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode creditDebitIndicator = null;

  @JsonProperty("Type")
  private OBBalanceType1Code type = null;

  @JsonProperty("DateTime")
  @JsonDeserialize(using = DateTimeDeserializer.class)
  @JsonSerialize(using = DateTimeSerializer.class)
  private DateTime dateTime = null;

  @JsonProperty("CreditLine")
  private List<OBCreditLine1> creditLine = null;

  public OBCashBalance1 accountId(String accountId) {
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

  public OBCashBalance1 amount(ActiveOrHistoricCurrencyAndAmount amount) {
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

  public OBCashBalance1 creditDebitIndicator(OBCreditDebitCode creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

   /**
   * Indicates whether the balance is a credit or a debit balance. Usage: A zero balance is considered to be a credit balance.
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the balance is a credit or a debit balance. Usage: A zero balance is considered to be a credit balance.")
  @NotNull


  public OBCreditDebitCode getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBCashBalance1 type(OBBalanceType1Code type) {
    this.type = type;
    return this;
  }

   /**
   * Balance type, in a coded form.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Balance type, in a coded form.")
  @NotNull


  public OBBalanceType1Code getType() {
    return type;
  }

  public void setType(OBBalanceType1Code type) {
    this.type = type;
  }

  public OBCashBalance1 dateTime(DateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Indicates the date (and time) of the balance.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return dateTime
  **/
  @ApiModelProperty(required = true, value = "Indicates the date (and time) of the balance.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(DateTime dateTime) {
    this.dateTime = dateTime;
  }

  public OBCashBalance1 creditLine(List<OBCreditLine1> creditLine) {
    this.creditLine = creditLine;
    return this;
  }

  public OBCashBalance1 addCreditLineItem(OBCreditLine1 creditLineItem) {
    if (this.creditLine == null) {
      this.creditLine = new ArrayList<OBCreditLine1>();
    }
    this.creditLine.add(creditLineItem);
    return this;
  }

   /**
   * Get creditLine
   * @return creditLine
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBCreditLine1> getCreditLine() {
    return creditLine;
  }

  public void setCreditLine(List<OBCreditLine1> creditLine) {
    this.creditLine = creditLine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCashBalance1 balance = (OBCashBalance1) o;
    return Objects.equals(this.accountId, balance.accountId) &&
        Objects.equals(this.amount, balance.amount) &&
        Objects.equals(this.creditDebitIndicator, balance.creditDebitIndicator) &&
        Objects.equals(this.type, balance.type) &&
        Objects.equals(this.dateTime, balance.dateTime) &&
        Objects.equals(this.creditLine, balance.creditLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, amount, creditDebitIndicator, type, dateTime, creditLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    creditLine: ").append(toIndentedString(creditLine)).append("\n");
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

