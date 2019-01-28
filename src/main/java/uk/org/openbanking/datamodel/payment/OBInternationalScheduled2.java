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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.springframework.validation.annotation.Validated;
import uk.org.openbanking.datamodel.account.OBCashAccount3;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single scheduled international payment.
 */
@ApiModel(description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single scheduled international payment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-28T11:15:38.268Z")

public class OBInternationalScheduled2   {
  @JsonProperty("InstructionIdentification")
  private String instructionIdentification = null;

  @JsonProperty("EndToEndIdentification")
  private String endToEndIdentification = null;

  @JsonProperty("LocalInstrument")
  private String localInstrument = null;

  @JsonProperty("InstructionPriority")
  private OBPriority2Code instructionPriority = null;

  @JsonProperty("Purpose")
  private String purpose = null;

  @JsonProperty("ChargeBearer")
  private OBChargeBearerType1Code chargeBearer = null;

  @JsonProperty("RequestedExecutionDateTime")
  private DateTime requestedExecutionDateTime = null;

  @JsonProperty("CurrencyOfTransfer")
  private String currencyOfTransfer = null;

  @JsonProperty("InstructedAmount")
  private OBActiveOrHistoricCurrencyAndAmount instructedAmount = null;

  @JsonProperty("ExchangeRateInformation")
  private OBExchangeRate1 exchangeRateInformation = null;

  @JsonProperty("DebtorAccount")
  private OBCashAccount3 debtorAccount = null;

  @JsonProperty("Creditor")
  private OBPartyIdentification43 creditor = null;

  @JsonProperty("CreditorAgent")
  private OBBranchAndFinancialInstitutionIdentification3 creditorAgent = null;

  @JsonProperty("CreditorAccount")
  private OBCashAccount3 creditorAccount = null;

  @JsonProperty("RemittanceInformation")
  private OBRemittanceInformation1 remittanceInformation = null;

  @JsonProperty("SupplementaryData")
  private OBSupplementaryData1 supplementaryData = null;

  public OBInternationalScheduled2 instructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
    return this;
  }

  /**
   * Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
   * @return instructionIdentification
  **/
  @ApiModelProperty(required = true, value = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
  @NotNull

@Size(min=1,max=35) 
  public String getInstructionIdentification() {
    return instructionIdentification;
  }

  public void setInstructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
  }

  public OBInternationalScheduled2 endToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
    return this;
  }

  /**
   * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.
   * @return endToEndIdentification
  **/
  @ApiModelProperty(value = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.")

@Size(min=1,max=35) 
  public String getEndToEndIdentification() {
    return endToEndIdentification;
  }

  public void setEndToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
  }

  public OBInternationalScheduled2 localInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
    return this;
  }

  /**
   * Get localInstrument
   * @return localInstrument
  **/
  @ApiModelProperty(value = "")


  public String getLocalInstrument() {
    return localInstrument;
  }

  public void setLocalInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
  }

  public OBInternationalScheduled2 instructionPriority(OBPriority2Code instructionPriority) {
    this.instructionPriority = instructionPriority;
    return this;
  }

  /**
   * Get instructionPriority
   * @return instructionPriority
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBPriority2Code getInstructionPriority() {
    return instructionPriority;
  }

  public void setInstructionPriority(OBPriority2Code instructionPriority) {
    this.instructionPriority = instructionPriority;
  }

  public OBInternationalScheduled2 purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Get purpose
   * @return purpose
  **/
  @ApiModelProperty(value = "")
  @Size(min=1,max=4)


  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public OBInternationalScheduled2 chargeBearer(OBChargeBearerType1Code chargeBearer) {
    this.chargeBearer = chargeBearer;
    return this;
  }

  /**
   * Get chargeBearer
   * @return chargeBearer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBChargeBearerType1Code getChargeBearer() {
    return chargeBearer;
  }

  public void setChargeBearer(OBChargeBearerType1Code chargeBearer) {
    this.chargeBearer = chargeBearer;
  }

  public OBInternationalScheduled2 requestedExecutionDateTime(DateTime requestedExecutionDateTime) {
    this.requestedExecutionDateTime = requestedExecutionDateTime;
    return this;
  }

  /**
   * Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return requestedExecutionDateTime
  **/
  @ApiModelProperty(required = true, value = "Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getRequestedExecutionDateTime() {
    return requestedExecutionDateTime;
  }

  public void setRequestedExecutionDateTime(DateTime requestedExecutionDateTime) {
    this.requestedExecutionDateTime = requestedExecutionDateTime;
  }

  public OBInternationalScheduled2 currencyOfTransfer(String currencyOfTransfer) {
    this.currencyOfTransfer = currencyOfTransfer;
    return this;
  }

  /**
   * Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.
   * @return currencyOfTransfer
  **/
  @ApiModelProperty(required = true, value = "Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.")
  @NotNull

@Pattern(regexp="^[A-Z]{3,3}$") 
  public String getCurrencyOfTransfer() {
    return currencyOfTransfer;
  }

  public void setCurrencyOfTransfer(String currencyOfTransfer) {
    this.currencyOfTransfer = currencyOfTransfer;
  }

  public OBInternationalScheduled2 instructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBInternationalScheduled2 exchangeRateInformation(OBExchangeRate1 exchangeRateInformation) {
    this.exchangeRateInformation = exchangeRateInformation;
    return this;
  }

  /**
   * Get exchangeRateInformation
   * @return exchangeRateInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBExchangeRate1 getExchangeRateInformation() {
    return exchangeRateInformation;
  }

  public void setExchangeRateInformation(OBExchangeRate1 exchangeRateInformation) {
    this.exchangeRateInformation = exchangeRateInformation;
  }

  public OBInternationalScheduled2 debtorAccount(OBCashAccount3 debtorAccount) {
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

  public OBInternationalScheduled2 creditor(OBPartyIdentification43 creditor) {
    this.creditor = creditor;
    return this;
  }

  /**
   * Get creditor
   * @return creditor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBPartyIdentification43 getCreditor() {
    return creditor;
  }

  public void setCreditor(OBPartyIdentification43 creditor) {
    this.creditor = creditor;
  }

  public OBInternationalScheduled2 creditorAgent(OBBranchAndFinancialInstitutionIdentification3 creditorAgent) {
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

  public OBInternationalScheduled2 creditorAccount(OBCashAccount3 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBCashAccount3 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount3 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBInternationalScheduled2 remittanceInformation(OBRemittanceInformation1 remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
    return this;
  }

  /**
   * Get remittanceInformation
   * @return remittanceInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBRemittanceInformation1 getRemittanceInformation() {
    return remittanceInformation;
  }

  public void setRemittanceInformation(OBRemittanceInformation1 remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
  }

  public OBInternationalScheduled2 supplementaryData(OBSupplementaryData1 supplementaryData) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBInternationalScheduled2 obInternationalScheduled2 = (OBInternationalScheduled2) o;
    return Objects.equals(this.instructionIdentification, obInternationalScheduled2.instructionIdentification) &&
        Objects.equals(this.endToEndIdentification, obInternationalScheduled2.endToEndIdentification) &&
        Objects.equals(this.localInstrument, obInternationalScheduled2.localInstrument) &&
        Objects.equals(this.instructionPriority, obInternationalScheduled2.instructionPriority) &&
        Objects.equals(this.purpose, obInternationalScheduled2.purpose) &&
        Objects.equals(this.chargeBearer, obInternationalScheduled2.chargeBearer) &&
        Objects.equals(this.requestedExecutionDateTime, obInternationalScheduled2.requestedExecutionDateTime) &&
        Objects.equals(this.currencyOfTransfer, obInternationalScheduled2.currencyOfTransfer) &&
        Objects.equals(this.instructedAmount, obInternationalScheduled2.instructedAmount) &&
        Objects.equals(this.exchangeRateInformation, obInternationalScheduled2.exchangeRateInformation) &&
        Objects.equals(this.debtorAccount, obInternationalScheduled2.debtorAccount) &&
        Objects.equals(this.creditor, obInternationalScheduled2.creditor) &&
        Objects.equals(this.creditorAgent, obInternationalScheduled2.creditorAgent) &&
        Objects.equals(this.creditorAccount, obInternationalScheduled2.creditorAccount) &&
        Objects.equals(this.remittanceInformation, obInternationalScheduled2.remittanceInformation) &&
        Objects.equals(this.supplementaryData, obInternationalScheduled2.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionIdentification, endToEndIdentification, localInstrument, instructionPriority, purpose, chargeBearer, requestedExecutionDateTime, currencyOfTransfer, instructedAmount, exchangeRateInformation, debtorAccount, creditor, creditorAgent, creditorAccount, remittanceInformation, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBInternationalScheduled2 {\n");

    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
    sb.append("    instructionPriority: ").append(toIndentedString(instructionPriority)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
    sb.append("    requestedExecutionDateTime: ").append(toIndentedString(requestedExecutionDateTime)).append("\n");
    sb.append("    currencyOfTransfer: ").append(toIndentedString(currencyOfTransfer)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

