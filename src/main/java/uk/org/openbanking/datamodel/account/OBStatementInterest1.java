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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import uk.org.openbanking.datamodel.payment.ActiveOrHistoricCurrencyAndAmount;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Set of elements used to provide details of a generic interest amount related to the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a generic interest amount related to the statement resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBStatementInterest1   {
  @JsonProperty("Amount")
  private ActiveOrHistoricCurrencyAndAmount amount = null;

  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode creditDebitIndicator = null;

  @JsonProperty("Type")
  private OBExternalStatementInterestType1Code type = null;

  public OBStatementInterest1 amount(ActiveOrHistoricCurrencyAndAmount amount) {
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

  public ActiveOrHistoricCurrencyAndAmount getAmount() {
    return amount;
  }

  public void setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
  }

  public OBStatementInterest1 creditDebitIndicator(OBCreditDebitCode creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Indicates whether the amount is a credit or a debit.  Usage: A zero amount is considered to be a credit amount.
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the amount is a credit or a debit.  Usage: A zero amount is considered to be a credit amount.")
  @NotNull


  public OBCreditDebitCode getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBStatementInterest1 type(OBExternalStatementInterestType1Code type) {
    this.type = type;
    return this;
  }

  /**
   * Interest amount type, in a coded form.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Interest amount type, in a coded form.")
  @NotNull


  public OBExternalStatementInterestType1Code getType() {
    return type;
  }

  public void setType(OBExternalStatementInterestType1Code type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatementInterest1 obStatementInterest1 = (OBStatementInterest1) o;
    return Objects.equals(this.amount, obStatementInterest1.amount) &&
        Objects.equals(this.creditDebitIndicator, obStatementInterest1.creditDebitIndicator) &&
        Objects.equals(this.type, obStatementInterest1.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, creditDebitIndicator, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatementInterest1 {\n");

    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

