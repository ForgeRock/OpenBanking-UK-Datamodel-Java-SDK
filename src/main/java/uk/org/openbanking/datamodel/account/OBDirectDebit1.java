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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.payment.ActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.jackson.DateTimeDeserializer;
import uk.org.openbanking.jackson.DateTimeSerializer;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Direct Debit
 */
@ApiModel(description = "Direct Debit")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class OBDirectDebit1 {
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
  @JsonDeserialize(using = DateTimeDeserializer.class)
  @JsonSerialize(using = DateTimeSerializer.class)
  private DateTime previousPaymentDateTime = null;

  @JsonProperty("PreviousPaymentAmount")
  private ActiveOrHistoricCurrencyAndAmount previousPaymentAmount = null;

  public OBDirectDebit1 accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  @NotNull

 @Size(min=1,max=40)
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
   * Specifies the status of the direct debit in code form.
   * @return directDebitStatusCode
  **/
  @ApiModelProperty(value = "Specifies the status of the direct debit in code form.")


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
   * Name of Service User
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of Service User")
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
   * Date of most recent direct debit collection.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return previousPaymentDateTime
  **/
  @ApiModelProperty(value = "Date of most recent direct debit collection.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getPreviousPaymentDateTime() {
    return previousPaymentDateTime;
  }

  public void setPreviousPaymentDateTime(DateTime previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
  }

  public OBDirectDebit1 previousPaymentAmount(ActiveOrHistoricCurrencyAndAmount previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
    return this;
  }

   /**
   * Get previousPaymentAmount
   * @return previousPaymentAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ActiveOrHistoricCurrencyAndAmount getPreviousPaymentAmount() {
    return previousPaymentAmount;
  }

  public void setPreviousPaymentAmount(ActiveOrHistoricCurrencyAndAmount previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBDirectDebit1 directDebit = (OBDirectDebit1) o;
    return Objects.equals(this.accountId, directDebit.accountId) &&
        Objects.equals(this.directDebitId, directDebit.directDebitId) &&
        Objects.equals(this.mandateIdentification, directDebit.mandateIdentification) &&
        Objects.equals(this.directDebitStatusCode, directDebit.directDebitStatusCode) &&
        Objects.equals(this.name, directDebit.name) &&
        Objects.equals(this.previousPaymentDateTime, directDebit.previousPaymentDateTime) &&
        Objects.equals(this.previousPaymentAmount, directDebit.previousPaymentAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, directDebitId, mandateIdentification, directDebitStatusCode, name, previousPaymentDateTime, previousPaymentAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebit {\n");

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

