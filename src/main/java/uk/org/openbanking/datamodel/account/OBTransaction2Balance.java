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
 * Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.
 */
@ApiModel(description = "Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBTransaction2Balance   {
  @JsonProperty("Amount")
  private OBTransaction2BalanceAmount amount = null;

  /**
   * Indicates whether the balance is a credit or a debit balance.  Usage: A zero balance is considered to be a credit balance.
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
   * Balance type, in a coded form.
   */
  public enum TypeEnum {
    CLOSINGAVAILABLE("ClosingAvailable"),
    
    CLOSINGBOOKED("ClosingBooked"),
    
    EXPECTED("Expected"),
    
    FORWARDAVAILABLE("ForwardAvailable"),
    
    INFORMATION("Information"),
    
    INTERIMAVAILABLE("InterimAvailable"),
    
    INTERIMBOOKED("InterimBooked"),
    
    OPENINGAVAILABLE("OpeningAvailable"),
    
    OPENINGBOOKED("OpeningBooked"),
    
    PREVIOUSLYCLOSEDBOOKED("PreviouslyClosedBooked");

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

  public OBTransaction2Balance amount(OBTransaction2BalanceAmount amount) {
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

  public OBTransaction2BalanceAmount getAmount() {
    return amount;
  }

  public void setAmount(OBTransaction2BalanceAmount amount) {
    this.amount = amount;
  }

  public OBTransaction2Balance creditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Indicates whether the balance is a credit or a debit balance.  Usage: A zero balance is considered to be a credit balance.
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the balance is a credit or a debit balance.  Usage: A zero balance is considered to be a credit balance.")
  @NotNull


  public CreditDebitIndicatorEnum getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBTransaction2Balance type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Balance type, in a coded form.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Balance type, in a coded form.")
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
    OBTransaction2Balance obTransaction2Balance = (OBTransaction2Balance) o;
    return Objects.equals(this.amount, obTransaction2Balance.amount) &&
        Objects.equals(this.creditDebitIndicator, obTransaction2Balance.creditDebitIndicator) &&
        Objects.equals(this.type, obTransaction2Balance.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, creditDebitIndicator, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransaction2Balance {\n");

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

