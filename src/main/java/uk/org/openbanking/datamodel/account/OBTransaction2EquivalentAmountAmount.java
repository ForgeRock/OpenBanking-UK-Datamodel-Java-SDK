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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor&#39;s account, and to be transferred in a different currency.  Usage : Currency of the amount is expressed in the currency of the debtor&#39;s account, but the amount to be transferred is in another currency. The first agent will convert the amount and currency to the to be transferred amount and currency, eg, &#39;pay equivalent of 100000 EUR in JPY&#39;(and account is in EUR).
 */
@ApiModel(description = "Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred in a different currency.  Usage : Currency of the amount is expressed in the currency of the debtor's account, but the amount to be transferred is in another currency. The first agent will convert the amount and currency to the to be transferred amount and currency, eg, 'pay equivalent of 100000 EUR in JPY'(and account is in EUR).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBTransaction2EquivalentAmountAmount   {
  @JsonProperty("Amount")
  private String amount = null;

  @JsonProperty("Currency")
  private String currency = null;

  public OBTransaction2EquivalentAmountAmount amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^\\d{1,13}\\.\\d{1,5}$") 
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public OBTransaction2EquivalentAmountAmount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Code allocated to a currency, by a maintenance agency, under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\". Valid currency codes are registered with the ISO 4217 Maintenance Agency, and consist of three contiguous letters.
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Code allocated to a currency, by a maintenance agency, under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\". Valid currency codes are registered with the ISO 4217 Maintenance Agency, and consist of three contiguous letters.")
  @NotNull

@Pattern(regexp="^[A-Z]{3,3}$") 
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTransaction2EquivalentAmountAmount obTransaction2EquivalentAmountAmount = (OBTransaction2EquivalentAmountAmount) o;
    return Objects.equals(this.amount, obTransaction2EquivalentAmountAmount.amount) &&
        Objects.equals(this.currency, obTransaction2EquivalentAmountAmount.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransaction2EquivalentAmountAmount {\n");

    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

