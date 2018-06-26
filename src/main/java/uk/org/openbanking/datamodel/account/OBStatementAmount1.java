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

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Set of elements used to provide details of a generic amount for the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a generic amount for the statement resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBStatementAmount1   {
  @JsonProperty("Amount")
  private OBStatement1Amount3 amount = null;

  /**
   * Indicates whether the amount is a credit or a debit.  Usage: A zero amount is considered to be a credit amount.
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

  /**
   * Amount type, in a coded form.
   */
  public enum TypeEnum {
    ARREARSCLOSINGBALANCE("ArrearsClosingBalance"),
    
    AVAILABLEBALANCE("AvailableBalance"),
    
    AVERAGEBALANCEWHENINCREDIT("AverageBalanceWhenInCredit"),
    
    AVERAGEBALANCEWHENINDEBIT("AverageBalanceWhenInDebit"),
    
    AVERAGEDAILYBALANCE("AverageDailyBalance"),
    
    BALANCETRANSFERCLOSINGBALANCE("BalanceTransferClosingBalance"),
    
    CASHCLOSINGBALANCE("CashClosingBalance"),
    
    CLOSINGBALANCE("ClosingBalance"),
    
    CREDITLIMIT("CreditLimit"),
    
    CURRENTPAYMENT("CurrentPayment"),
    
    DIRECTDEBITPAYMENTDUE("DirectDebitPaymentDue"),
    
    FSCSINSURANCE("FSCSInsurance"),
    
    MINIMUMPAYMENTDUE("MinimumPaymentDue"),
    
    PREVIOUSCLOSINGBALANCE("PreviousClosingBalance"),
    
    PREVIOUSPAYMENT("PreviousPayment"),
    
    PURCHASECLOSINGBALANCE("PurchaseClosingBalance"),
    
    STARTINGBALANCE("StartingBalance"),
    
    TOTALADJUSTMENTS("TotalAdjustments"),
    
    TOTALCASHADVANCES("TotalCashAdvances"),
    
    TOTALCHARGES("TotalCharges"),
    
    TOTALCREDITS("TotalCredits"),
    
    TOTALDEBITS("TotalDebits"),
    
    TOTALPURCHASES("TotalPurchases");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Type")
  private TypeEnum type = null;

  public OBStatementAmount1 amount(OBStatement1Amount3 amount) {
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

  public OBStatement1Amount3 getAmount() {
    return amount;
  }

  public void setAmount(OBStatement1Amount3 amount) {
    this.amount = amount;
  }

  public OBStatementAmount1 creditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Indicates whether the amount is a credit or a debit.  Usage: A zero amount is considered to be a credit amount.
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the amount is a credit or a debit.  Usage: A zero amount is considered to be a credit amount.")
  @NotNull


  public CreditDebitIndicatorEnum getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBStatementAmount1 type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Amount type, in a coded form.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Amount type, in a coded form.")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    OBStatementAmount1 obStatementAmount1 = (OBStatementAmount1) o;
    return Objects.equals(this.amount, obStatementAmount1.amount) &&
        Objects.equals(this.creditDebitIndicator, obStatementAmount1.creditDebitIndicator) &&
        Objects.equals(this.type, obStatementAmount1.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, creditDebitIndicator, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatementAmount1 {\n");

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

