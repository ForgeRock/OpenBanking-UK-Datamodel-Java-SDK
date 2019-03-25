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
import uk.org.openbanking.datamodel.account.OBBranchAndFinancialInstitutionIdentification2;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * 
 */
@ApiModel(description = "")


public class OBInitiation1 {
  @JsonProperty("InstructionIdentification")
  private String instructionIdentification = null;

  @JsonProperty("EndToEndIdentification")
  private String endToEndIdentification = null;

  @JsonProperty("InstructedAmount")
  private OBActiveOrHistoricCurrencyAndAmount instructedAmount = null;

  @JsonProperty("DebtorAgent")
  private OBBranchAndFinancialInstitutionIdentification2 debtorAgent = null;

  @JsonProperty("DebtorAccount")
  private OBCashAccountDebtor1 debtorAccount = null;

  @JsonProperty("CreditorAgent")
  private OBBranchAndFinancialInstitutionIdentification2 creditorAgent = null;

  @JsonProperty("CreditorAccount")
  private OBCashAccountCreditor1 creditorAccount = null;

  @JsonProperty("RemittanceInformation")
  private OBRemittanceInformation1 remittanceInformation = null;

  public OBInitiation1 instructionIdentification(String instructionIdentification) {
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

  public OBInitiation1 endToEndIdentification(String endToEndIdentification) {
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

  public OBInitiation1 instructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

   /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(value = "")
  @NotNull
  @Valid

  public OBActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBInitiation1 debtorAgent(OBBranchAndFinancialInstitutionIdentification2 debtorAgent) {
    this.debtorAgent = debtorAgent;
    return this;
  }

   /**
   * Get debtorAgent
   * @return debtorAgent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBBranchAndFinancialInstitutionIdentification2 getDebtorAgent() {
    return debtorAgent;
  }

  public void setDebtorAgent(OBBranchAndFinancialInstitutionIdentification2 debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  public OBInitiation1 debtorAccount(OBCashAccountDebtor1 debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

   /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBCashAccountDebtor1 getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(OBCashAccountDebtor1 debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public OBInitiation1 creditorAgent(OBBranchAndFinancialInstitutionIdentification2 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

   /**
   * Get creditorAgent
   * @return creditorAgent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBBranchAndFinancialInstitutionIdentification2 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification2 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBInitiation1 creditorAccount(OBCashAccountCreditor1 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

   /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBCashAccountCreditor1 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccountCreditor1 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBInitiation1 remittanceInformation(OBRemittanceInformation1 remittanceInformation) {
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBInitiation1 initiation = (OBInitiation1) o;
    return Objects.equals(this.instructionIdentification, initiation.instructionIdentification) &&
        Objects.equals(this.endToEndIdentification, initiation.endToEndIdentification) &&
        Objects.equals(this.instructedAmount, initiation.instructedAmount) &&
        Objects.equals(this.debtorAgent, initiation.debtorAgent) &&
        Objects.equals(this.debtorAccount, initiation.debtorAccount) &&
        Objects.equals(this.creditorAgent, initiation.creditorAgent) &&
        Objects.equals(this.creditorAccount, initiation.creditorAccount) &&
        Objects.equals(this.remittanceInformation, initiation.remittanceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionIdentification, endToEndIdentification, instructedAmount, debtorAgent, debtorAccount, creditorAgent, creditorAccount, remittanceInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupInitiation {\n");
    
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
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

