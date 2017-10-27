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

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.datamodel.payment.ActiveOrHistoricCurrencyAndAmount;

/**
 * Data5CreditLine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class OBCreditLine1 {
  @JsonProperty("Included")
  private Boolean included = null;

  @JsonProperty("Amount")
  private ActiveOrHistoricCurrencyAndAmount amount = null;

  @JsonProperty("Type")
  private OBExternalLimitType1Code type = null;

  public OBCreditLine1 included(Boolean included) {
    this.included = included;
    return this;
  }

   /**
   * Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.
   * @return included
  **/
  @ApiModelProperty(required = true, value = "Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.")
  @NotNull


  public Boolean getIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public OBCreditLine1 amount(ActiveOrHistoricCurrencyAndAmount amount) {
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

  public OBCreditLine1 type(OBExternalLimitType1Code type) {
    this.type = type;
    return this;
  }

   /**
   * Limit type, in a coded form.
   * @return type
  **/
  @ApiModelProperty(value = "Limit type, in a coded form.")


  public OBExternalLimitType1Code getType() {
    return type;
  }

  public void setType(OBExternalLimitType1Code type) {
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
    OBCreditLine1 data5CreditLine = (OBCreditLine1) o;
    return Objects.equals(this.included, data5CreditLine.included) &&
        Objects.equals(this.amount, data5CreditLine.amount) &&
        Objects.equals(this.type, data5CreditLine.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(included, amount, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data5CreditLine {\n");

    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

