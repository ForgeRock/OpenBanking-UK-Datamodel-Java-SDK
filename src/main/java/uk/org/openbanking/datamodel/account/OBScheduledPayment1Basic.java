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
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBScheduledPayment1Basic
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBScheduledPayment1Basic   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("ScheduledPaymentId")
  private String scheduledPaymentId = null;

  @JsonProperty("ScheduledPaymentDateTime")
  private OffsetDateTime scheduledPaymentDateTime = null;

  @JsonProperty("ScheduledType")
  private OBExternalScheduleType1Code scheduledType = null;

  @JsonProperty("InstructedAmount")
  private OBScheduledPayment1BasicInstructedAmount instructedAmount = null;

  @JsonProperty("Reference")
  private String reference = null;

  public OBScheduledPayment1Basic accountId(String accountId) {
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

  public OBScheduledPayment1Basic scheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.
   * @return scheduledPaymentId
  **/
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.")

@Size(min=1,max=40) 
  public String getScheduledPaymentId() {
    return scheduledPaymentId;
  }

  public void setScheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
  }

  public OBScheduledPayment1Basic scheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    return this;
  }

  /**
   * The date on which the scheduled payment will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return scheduledPaymentDateTime
  **/
  @ApiModelProperty(required = true, value = "The date on which the scheduled payment will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public OffsetDateTime getScheduledPaymentDateTime() {
    return scheduledPaymentDateTime;
  }

  public void setScheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
  }

  public OBScheduledPayment1Basic scheduledType(OBExternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
    return this;
  }

  /**
   * Get scheduledType
   * @return scheduledType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalScheduleType1Code getScheduledType() {
    return scheduledType;
  }

  public void setScheduledType(OBExternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
  }

  public OBScheduledPayment1Basic instructedAmount(OBScheduledPayment1BasicInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBScheduledPayment1BasicInstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBScheduledPayment1BasicInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBScheduledPayment1Basic reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   * @return reference
  **/
  @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")

@Size(min=1,max=35) 
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBScheduledPayment1Basic obScheduledPayment1Basic = (OBScheduledPayment1Basic) o;
    return Objects.equals(this.accountId, obScheduledPayment1Basic.accountId) &&
        Objects.equals(this.scheduledPaymentId, obScheduledPayment1Basic.scheduledPaymentId) &&
        Objects.equals(this.scheduledPaymentDateTime, obScheduledPayment1Basic.scheduledPaymentDateTime) &&
        Objects.equals(this.scheduledType, obScheduledPayment1Basic.scheduledType) &&
        Objects.equals(this.instructedAmount, obScheduledPayment1Basic.instructedAmount) &&
        Objects.equals(this.reference, obScheduledPayment1Basic.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, scheduledPaymentId, scheduledPaymentDateTime, scheduledType, instructedAmount, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBScheduledPayment1Basic {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    scheduledPaymentId: ").append(toIndentedString(scheduledPaymentId)).append("\n");
    sb.append("    scheduledPaymentDateTime: ").append(toIndentedString(scheduledPaymentDateTime)).append("\n");
    sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

