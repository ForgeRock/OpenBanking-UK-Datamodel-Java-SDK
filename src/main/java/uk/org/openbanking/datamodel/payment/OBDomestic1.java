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
import org.springframework.validation.annotation.Validated;
import uk.org.openbanking.datamodel.account.OBCashAccount3;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single domestic payment.
 */
@ApiModel(description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single domestic payment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-10T14:05:22.993+01:00")

public class OBDomestic1   {
  @JsonProperty("InstructionIdentification")
  private String instructionIdentification = null;

  @JsonProperty("EndToEndIdentification")
  private String endToEndIdentification = null;

  @JsonProperty("LocalInstrument")
  private String localInstrument = null;

  @JsonProperty("InstructedAmount")
  private OBActiveOrHistoricCurrencyAndAmount instructedAmount = null;

  @JsonProperty("DebtorAccount")
  private OBCashAccount3 debtorAccount = null;

  @JsonProperty("CreditorAccount")
  private OBCashAccount3 creditorAccount = null;

  @JsonProperty("CreditorPostalAddress")
  private OBPostalAddress6 creditorPostalAddress = null;

  @JsonProperty("RemittanceInformation")
  private OBRemittanceInformation1 remittanceInformation = null;

  public OBDomestic1 instructionIdentification(String instructionIdentification) {
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

  public OBDomestic1 endToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
    return this;
  }

  /**
   * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.
   * @return endToEndIdentification
  **/
  @ApiModelProperty(required = true, value = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.")
  @NotNull

@Size(min=1,max=35) 
  public String getEndToEndIdentification() {
    return endToEndIdentification;
  }

  public void setEndToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
  }

  public OBDomestic1 localInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
    return this;
  }

  /**
   * User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.
   * @return localInstrument
  **/
  @ApiModelProperty(value = "User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.")

@Size(min=1,max=35) 
  public String getLocalInstrument() {
    return localInstrument;
  }

  public void setLocalInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
  }

  public OBDomestic1 instructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
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

  public OBDomestic1 debtorAccount(OBCashAccount3 debtorAccount) {
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

  public OBDomestic1 creditorAccount(OBCashAccount3 creditorAccount) {
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

  public OBDomestic1 creditorPostalAddress(OBPostalAddress6 creditorPostalAddress) {
    this.creditorPostalAddress = creditorPostalAddress;
    return this;
  }

  /**
   * Get creditorPostalAddress
   * @return creditorPostalAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBPostalAddress6 getCreditorPostalAddress() {
    return creditorPostalAddress;
  }

  public void setCreditorPostalAddress(OBPostalAddress6 creditorPostalAddress) {
    this.creditorPostalAddress = creditorPostalAddress;
  }

  public OBDomestic1 remittanceInformation(OBRemittanceInformation1 remittanceInformation) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBDomestic1 obDomestic1 = (OBDomestic1) o;
    return Objects.equals(this.instructionIdentification, obDomestic1.instructionIdentification) &&
        Objects.equals(this.endToEndIdentification, obDomestic1.endToEndIdentification) &&
        Objects.equals(this.localInstrument, obDomestic1.localInstrument) &&
        Objects.equals(this.instructedAmount, obDomestic1.instructedAmount) &&
        Objects.equals(this.debtorAccount, obDomestic1.debtorAccount) &&
        Objects.equals(this.creditorAccount, obDomestic1.creditorAccount) &&
        Objects.equals(this.creditorPostalAddress, obDomestic1.creditorPostalAddress) &&
        Objects.equals(this.remittanceInformation, obDomestic1.remittanceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionIdentification, endToEndIdentification, localInstrument, instructedAmount, debtorAccount, creditorAccount, creditorPostalAddress, remittanceInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBDomestic1 {\n");

    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorPostalAddress: ").append(toIndentedString(creditorPostalAddress)).append("\n");
    sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
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

