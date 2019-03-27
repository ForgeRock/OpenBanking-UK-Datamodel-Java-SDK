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
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Account to or from which a cash entry is made.
 */
@ApiModel(description = "Account to or from which a cash entry is made.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBDirectDebit1   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("DirectDebitId")
  private String directDebitId = null;

  @JsonProperty("MandateIdentification")
  private String mandateIdentification = null;

  @JsonProperty("DirectDebitStatusCode")
  private OBExternalDirectDebitStatus1Code directDebitStatusCode = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("PreviousPaymentDateTime")
  private DateTime previousPaymentDateTime = null;

  @JsonProperty("PreviousPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount previousPaymentAmount = null;

  public OBDirectDebit1 accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBDirectDebit1 directDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.
   * @return directDebitId
  **/
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.")

@Size(min=1,max=40) 
  public String getDirectDebitId() {
    return directDebitId;
  }

  public void setDirectDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
  }

  public OBDirectDebit1 mandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

  /**
   * Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.
   * @return mandateIdentification
  **/
  @ApiModelProperty(required = true, value = "Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.")
  @NotNull

@Size(min=1,max=35) 
  public String getMandateIdentification() {
    return mandateIdentification;
  }

  public void setMandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public OBDirectDebit1 directDebitStatusCode(OBExternalDirectDebitStatus1Code directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
    return this;
  }

  /**
   * Get directDebitStatusCode
   * @return directDebitStatusCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBExternalDirectDebitStatus1Code getDirectDebitStatusCode() {
    return directDebitStatusCode;
  }

  public void setDirectDebitStatusCode(OBExternalDirectDebitStatus1Code directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
  }

  public OBDirectDebit1 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of Service User.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of Service User.")
  @NotNull

@Size(min=1,max=70) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBDirectDebit1 previousPaymentDateTime(DateTime previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
    return this;
  }

  /**
   * Date of most recent direct debit collection. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return previousPaymentDateTime
  **/
  @ApiModelProperty(value = "Date of most recent direct debit collection. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getPreviousPaymentDateTime() {
    return previousPaymentDateTime;
  }

  public void setPreviousPaymentDateTime(DateTime previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
  }

  public OBDirectDebit1 previousPaymentAmount(OBActiveOrHistoricCurrencyAndAmount previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
    return this;
  }

  /**
   * Get previousPaymentAmount
   * @return previousPaymentAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBActiveOrHistoricCurrencyAndAmount getPreviousPaymentAmount() {
    return previousPaymentAmount;
  }

  public void setPreviousPaymentAmount(OBActiveOrHistoricCurrencyAndAmount previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBDirectDebit1 obDirectDebit1 = (OBDirectDebit1) o;
    return Objects.equals(this.accountId, obDirectDebit1.accountId) &&
        Objects.equals(this.directDebitId, obDirectDebit1.directDebitId) &&
        Objects.equals(this.mandateIdentification, obDirectDebit1.mandateIdentification) &&
        Objects.equals(this.directDebitStatusCode, obDirectDebit1.directDebitStatusCode) &&
        Objects.equals(this.name, obDirectDebit1.name) &&
        Objects.equals(this.previousPaymentDateTime, obDirectDebit1.previousPaymentDateTime) &&
        Objects.equals(this.previousPaymentAmount, obDirectDebit1.previousPaymentAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, directDebitId, mandateIdentification, directDebitStatusCode, name, previousPaymentDateTime, previousPaymentAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBDirectDebit1 {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    directDebitId: ").append(toIndentedString(directDebitId)).append("\n");
    sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
    sb.append("    directDebitStatusCode: ").append(toIndentedString(directDebitStatusCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    previousPaymentDateTime: ").append(toIndentedString(previousPaymentDateTime)).append("\n");
    sb.append("    previousPaymentAmount: ").append(toIndentedString(previousPaymentAmount)).append("\n");
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

