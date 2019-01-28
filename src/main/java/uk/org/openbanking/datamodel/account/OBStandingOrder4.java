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
package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.springframework.validation.annotation.Validated;
import uk.org.openbanking.datamodel.payment.OBActiveOrHistoricCurrencyAndAmount;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBStandingOrder4
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-28T11:14:51.272Z")

public class OBStandingOrder4   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("StandingOrderId")
  private String standingOrderId = null;

  @JsonProperty("Frequency")
  private String frequency = null;

  @JsonProperty("Reference")
  private String reference = null;

  @JsonProperty("FirstPaymentDateTime")
  private DateTime firstPaymentDateTime = null;

  @JsonProperty("NextPaymentDateTime")
  private DateTime nextPaymentDateTime = null;

  @JsonProperty("FinalPaymentDateTime")
  private DateTime finalPaymentDateTime = null;

  @JsonProperty("StandingOrderStatusCode")
  private OBExternalStandingOrderStatus1Code standingOrderStatusCode = null;

  @JsonProperty("FirstPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount firstPaymentAmount = null;

  @JsonProperty("NextPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount nextPaymentAmount = null;

  @JsonProperty("FinalPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount finalPaymentAmount = null;

  @JsonProperty("SupplementaryData")
  private OBSupplementaryData1 supplementaryData = null;

  @JsonProperty("CreditorAgent")
  private OBBranchAndFinancialInstitutionIdentification4 creditorAgent = null;

  @JsonProperty("CreditorAccount")
  private OBCashAccount3 creditorAccount = null;

  public OBStandingOrder4 accountId(String accountId) {
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

  public OBStandingOrder4 standingOrderId(String standingOrderId) {
    this.standingOrderId = standingOrderId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.
   * @return standingOrderId
  **/
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.")

@Size(min=1,max=40) 
  public String getStandingOrderId() {
    return standingOrderId;
  }

  public void setStandingOrderId(String standingOrderId) {
    this.standingOrderId = standingOrderId;
  }

  public OBStandingOrder4 frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Individual Definitions: EvryDay - Every day EvryWorkgDay - Every working day IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-5 to -1, 1 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED) ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December.  SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December.  Individual Patterns: EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: EvryDay EvryWorkgDay IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$
   * @return frequency
  **/
  @ApiModelProperty(required = true, value = "Individual Definitions: EvryDay - Every day EvryWorkgDay - Every working day IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-5 to -1, 1 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED) ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December.  SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December.  Individual Patterns: EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: EvryDay EvryWorkgDay IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$")
  @NotNull

@Pattern(regexp="^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$") @Size(min=1,max=35) 
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public OBStandingOrder4 reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   * @return reference
  **/
  @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")

@Size(min=1,max=35) 
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBStandingOrder4 firstPaymentDateTime(DateTime firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
    return this;
  }

  /**
   * The date on which the first payment for a Standing Order schedule will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return firstPaymentDateTime
  **/
  @ApiModelProperty(value = "The date on which the first payment for a Standing Order schedule will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getFirstPaymentDateTime() {
    return firstPaymentDateTime;
  }

  public void setFirstPaymentDateTime(DateTime firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
  }

  public OBStandingOrder4 nextPaymentDateTime(DateTime nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
    return this;
  }

  /**
   * The date on which the next payment for a Standing Order schedule will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return nextPaymentDateTime
  **/
  @ApiModelProperty(value = "The date on which the next payment for a Standing Order schedule will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getNextPaymentDateTime() {
    return nextPaymentDateTime;
  }

  public void setNextPaymentDateTime(DateTime nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
  }

  public OBStandingOrder4 finalPaymentDateTime(DateTime finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
    return this;
  }

  /**
   * The date on which the final payment for a Standing Order schedule will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return finalPaymentDateTime
  **/
  @ApiModelProperty(value = "The date on which the final payment for a Standing Order schedule will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getFinalPaymentDateTime() {
    return finalPaymentDateTime;
  }

  public void setFinalPaymentDateTime(DateTime finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
  }

  public OBStandingOrder4 standingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
    this.standingOrderStatusCode = standingOrderStatusCode;
    return this;
  }

  /**
   * Get standingOrderStatusCode
   * @return standingOrderStatusCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBExternalStandingOrderStatus1Code getStandingOrderStatusCode() {
    return standingOrderStatusCode;
  }

  public void setStandingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
    this.standingOrderStatusCode = standingOrderStatusCode;
  }

  public OBStandingOrder4 firstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
    return this;
  }

  /**
   * Get firstPaymentAmount
   * @return firstPaymentAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBActiveOrHistoricCurrencyAndAmount getFirstPaymentAmount() {
    return firstPaymentAmount;
  }

  public void setFirstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
  }

  public OBStandingOrder4 nextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
    return this;
  }

  /**
   * Get nextPaymentAmount
   * @return nextPaymentAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBActiveOrHistoricCurrencyAndAmount getNextPaymentAmount() {
    return nextPaymentAmount;
  }

  public void setNextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
  }

  public OBStandingOrder4 finalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
    return this;
  }

  /**
   * Get finalPaymentAmount
   * @return finalPaymentAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBActiveOrHistoricCurrencyAndAmount getFinalPaymentAmount() {
    return finalPaymentAmount;
  }

  public void setFinalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
  }

  public OBStandingOrder4 supplementaryData(OBSupplementaryData1 supplementaryData) {
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

  public OBStandingOrder4 creditorAgent(OBBranchAndFinancialInstitutionIdentification4 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   * @return creditorAgent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBBranchAndFinancialInstitutionIdentification4 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification4 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBStandingOrder4 creditorAccount(OBCashAccount3 creditorAccount) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStandingOrder4 obStandingOrder4 = (OBStandingOrder4) o;
    return Objects.equals(this.accountId, obStandingOrder4.accountId) &&
        Objects.equals(this.standingOrderId, obStandingOrder4.standingOrderId) &&
        Objects.equals(this.frequency, obStandingOrder4.frequency) &&
        Objects.equals(this.reference, obStandingOrder4.reference) &&
        Objects.equals(this.firstPaymentDateTime, obStandingOrder4.firstPaymentDateTime) &&
        Objects.equals(this.nextPaymentDateTime, obStandingOrder4.nextPaymentDateTime) &&
        Objects.equals(this.finalPaymentDateTime, obStandingOrder4.finalPaymentDateTime) &&
        Objects.equals(this.standingOrderStatusCode, obStandingOrder4.standingOrderStatusCode) &&
        Objects.equals(this.firstPaymentAmount, obStandingOrder4.firstPaymentAmount) &&
        Objects.equals(this.nextPaymentAmount, obStandingOrder4.nextPaymentAmount) &&
        Objects.equals(this.finalPaymentAmount, obStandingOrder4.finalPaymentAmount) &&
        Objects.equals(this.supplementaryData, obStandingOrder4.supplementaryData) &&
        Objects.equals(this.creditorAgent, obStandingOrder4.creditorAgent) &&
        Objects.equals(this.creditorAccount, obStandingOrder4.creditorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, standingOrderId, frequency, reference, firstPaymentDateTime, nextPaymentDateTime, finalPaymentDateTime, standingOrderStatusCode, firstPaymentAmount, nextPaymentAmount, finalPaymentAmount, supplementaryData, creditorAgent, creditorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStandingOrder4 {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    standingOrderId: ").append(toIndentedString(standingOrderId)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
    sb.append("    nextPaymentDateTime: ").append(toIndentedString(nextPaymentDateTime)).append("\n");
    sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
    sb.append("    standingOrderStatusCode: ").append(toIndentedString(standingOrderStatusCode)).append("\n");
    sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
    sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
    sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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

