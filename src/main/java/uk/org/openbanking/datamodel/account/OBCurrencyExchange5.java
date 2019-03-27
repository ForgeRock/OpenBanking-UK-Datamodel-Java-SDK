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
import org.joda.time.DateTime;
import org.springframework.validation.annotation.Validated;
import uk.org.openbanking.datamodel.payment.OBActiveOrHistoricCurrencyAndAmount;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Set of elements used to provide details on the currency exchange.
 */
@ApiModel(description = "Set of elements used to provide details on the currency exchange.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBCurrencyExchange5   {
  @JsonProperty("SourceCurrency")
  private String sourceCurrency = null;

  @JsonProperty("TargetCurrency")
  private String targetCurrency = null;

  @JsonProperty("UnitCurrency")
  private String unitCurrency = null;

  @JsonProperty("ExchangeRate")
  private BigDecimal exchangeRate = null;

  @JsonProperty("ContractIdentification")
  private String contractIdentification = null;

  @JsonProperty("QuotationDate")
  private DateTime quotationDate = null;

  @JsonProperty("InstructedAmount")
  private OBActiveOrHistoricCurrencyAndAmount instructedAmount = null;

  public OBCurrencyExchange5 sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

  /**
   * Currency from which an amount is to be converted in a currency conversion.
   * @return sourceCurrency
  **/
  @ApiModelProperty(required = true, value = "Currency from which an amount is to be converted in a currency conversion.")
  @NotNull

@Pattern(regexp="^[A-Z]{3,3}$") 
  public String getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public OBCurrencyExchange5 targetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
    return this;
  }

  /**
   * Currency from which an amount is to be converted in a currency conversion.
   * @return targetCurrency
  **/
  @ApiModelProperty(value = "Currency from which an amount is to be converted in a currency conversion.")

@Pattern(regexp="^[A-Z]{3,3}$") 
  public String getTargetCurrency() {
    return targetCurrency;
  }

  public void setTargetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
  }

  public OBCurrencyExchange5 unitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
    return this;
  }

  /**
   * Currency from which an amount is to be converted in a currency conversion.
   * @return unitCurrency
  **/
  @ApiModelProperty(value = "Currency from which an amount is to be converted in a currency conversion.")

@Pattern(regexp="^[A-Z]{3,3}$") 
  public String getUnitCurrency() {
    return unitCurrency;
  }

  public void setUnitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
  }

  public OBCurrencyExchange5 exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).
   * @return exchangeRate
  **/
  @ApiModelProperty(required = true, value = "Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).")
  @NotNull

  @Valid

  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public OBCurrencyExchange5 contractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
    return this;
  }

  /**
   * Unique identification to unambiguously identify the foreign exchange contract.
   * @return contractIdentification
  **/
  @ApiModelProperty(value = "Unique identification to unambiguously identify the foreign exchange contract.")

@Size(min=1,max=35) 
  public String getContractIdentification() {
    return contractIdentification;
  }

  public void setContractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
  }

  public OBCurrencyExchange5 quotationDate(DateTime quotationDate) {
    this.quotationDate = quotationDate;
    return this;
  }

  /**
   * Date and time at which an exchange rate is quoted. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return quotationDate
  **/
  @ApiModelProperty(value = "Date and time at which an exchange rate is quoted. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getQuotationDate() {
    return quotationDate;
  }

  public void setQuotationDate(DateTime quotationDate) {
    this.quotationDate = quotationDate;
  }

  public OBCurrencyExchange5 instructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCurrencyExchange5 obCurrencyExchange5 = (OBCurrencyExchange5) o;
    return Objects.equals(this.sourceCurrency, obCurrencyExchange5.sourceCurrency) &&
        Objects.equals(this.targetCurrency, obCurrencyExchange5.targetCurrency) &&
        Objects.equals(this.unitCurrency, obCurrencyExchange5.unitCurrency) &&
        Objects.equals(this.exchangeRate, obCurrencyExchange5.exchangeRate) &&
        Objects.equals(this.contractIdentification, obCurrencyExchange5.contractIdentification) &&
        Objects.equals(this.quotationDate, obCurrencyExchange5.quotationDate) &&
        Objects.equals(this.instructedAmount, obCurrencyExchange5.instructedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCurrency, targetCurrency, unitCurrency, exchangeRate, contractIdentification, quotationDate, instructedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCurrencyExchange5 {\n");
    
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    targetCurrency: ").append(toIndentedString(targetCurrency)).append("\n");
    sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
    sb.append("    quotationDate: ").append(toIndentedString(quotationDate)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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

