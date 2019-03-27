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
import org.springframework.validation.annotation.Validated;
import uk.org.openbanking.datamodel.payment.OBActiveOrHistoricCurrencyAndAmount;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Set of elements used to provide details on the credit line.
 */
@ApiModel(description = "Set of elements used to provide details on the credit line.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBCreditLine1   {
  @JsonProperty("Included")
  private Boolean included = null;

  @JsonProperty("Type")
  private OBExternalLimitType1Code type = null;

  @JsonProperty("Amount")
  private OBActiveOrHistoricCurrencyAndAmount amount = null;

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


  public Boolean isIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public OBCreditLine1 type(OBExternalLimitType1Code type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBExternalLimitType1Code getType() {
    return type;
  }

  public void setType(OBExternalLimitType1Code type) {
    this.type = type;
  }

  public OBCreditLine1 amount(OBActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBActiveOrHistoricCurrencyAndAmount getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCreditLine1 obCreditLine1 = (OBCreditLine1) o;
    return Objects.equals(this.included, obCreditLine1.included) &&
        Objects.equals(this.type, obCreditLine1.type) &&
        Objects.equals(this.amount, obCreditLine1.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(included, type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCreditLine1 {\n");
    
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

