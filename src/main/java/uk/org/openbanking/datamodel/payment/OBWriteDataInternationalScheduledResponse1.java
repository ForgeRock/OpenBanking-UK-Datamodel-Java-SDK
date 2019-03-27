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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBWriteDataInternationalScheduledResponse1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-10T14:05:22.993+01:00")

public class OBWriteDataInternationalScheduledResponse1   {
  @JsonProperty("InternationalScheduledPaymentId")
  private String internationalScheduledPaymentId = null;

  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("CreationDateTime")
  private DateTime creationDateTime = null;

  @JsonProperty("Status")
  private OBExternalStatus1Code status = null;

  @JsonProperty("StatusUpdateDateTime")
  private DateTime statusUpdateDateTime = null;

  @JsonProperty("ExpectedExecutionDateTime")
  private DateTime expectedExecutionDateTime = null;

  @JsonProperty("ExpectedSettlementDateTime")
  private DateTime expectedSettlementDateTime = null;

  @JsonProperty("Charges")
  @Valid
  private List<OBCharge1> charges = null;

  @JsonProperty("ExchangeRateInformation")
  private OBExchangeRate2 exchangeRateInformation = null;

  @JsonProperty("Initiation")
  private OBInternationalScheduled1 initiation = null;

  @JsonProperty("MultiAuthorisation")
  private OBMultiAuthorisation1 multiAuthorisation = null;

  public OBWriteDataInternationalScheduledResponse1 internationalScheduledPaymentId(String internationalScheduledPaymentId) {
    this.internationalScheduledPaymentId = internationalScheduledPaymentId;
    return this;
  }

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the international scheduled payment resource.
   * @return internationalScheduledPaymentId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the international scheduled payment resource.")
  @NotNull

@Size(min=1,max=40) 
  public String getInternationalScheduledPaymentId() {
    return internationalScheduledPaymentId;
  }

  public void setInternationalScheduledPaymentId(String internationalScheduledPaymentId) {
    this.internationalScheduledPaymentId = internationalScheduledPaymentId;
  }

  public OBWriteDataInternationalScheduledResponse1 consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
   * @return consentId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
  @NotNull

@Size(min=1,max=128) 
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBWriteDataInternationalScheduledResponse1 creationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the message was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the message was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBWriteDataInternationalScheduledResponse1 status(OBExternalStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBExternalStatus1Code status) {
    this.status = status;
  }

  public OBWriteDataInternationalScheduledResponse1 statusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBWriteDataInternationalScheduledResponse1 expectedExecutionDateTime(DateTime expectedExecutionDateTime) {
    this.expectedExecutionDateTime = expectedExecutionDateTime;
    return this;
  }

  /**
   * Expected execution date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expectedExecutionDateTime
  **/
  @ApiModelProperty(value = "Expected execution date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getExpectedExecutionDateTime() {
    return expectedExecutionDateTime;
  }

  public void setExpectedExecutionDateTime(DateTime expectedExecutionDateTime) {
    this.expectedExecutionDateTime = expectedExecutionDateTime;
  }

  public OBWriteDataInternationalScheduledResponse1 expectedSettlementDateTime(DateTime expectedSettlementDateTime) {
    this.expectedSettlementDateTime = expectedSettlementDateTime;
    return this;
  }

  /**
   * Expected settlement date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expectedSettlementDateTime
  **/
  @ApiModelProperty(value = "Expected settlement date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getExpectedSettlementDateTime() {
    return expectedSettlementDateTime;
  }

  public void setExpectedSettlementDateTime(DateTime expectedSettlementDateTime) {
    this.expectedSettlementDateTime = expectedSettlementDateTime;
  }

  public OBWriteDataInternationalScheduledResponse1 charges(List<OBCharge1> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteDataInternationalScheduledResponse1 addChargesItem(OBCharge1 chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<OBCharge1>();
    }
    this.charges.add(chargesItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a charge for the payment initiation.
   * @return charges
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a charge for the payment initiation.")

  @Valid

  public List<OBCharge1> getCharges() {
    return charges;
  }

  public void setCharges(List<OBCharge1> charges) {
    this.charges = charges;
  }

  public OBWriteDataInternationalScheduledResponse1 exchangeRateInformation(OBExchangeRate2 exchangeRateInformation) {
    this.exchangeRateInformation = exchangeRateInformation;
    return this;
  }

  /**
   * Get exchangeRateInformation
   * @return exchangeRateInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBExchangeRate2 getExchangeRateInformation() {
    return exchangeRateInformation;
  }

  public void setExchangeRateInformation(OBExchangeRate2 exchangeRateInformation) {
    this.exchangeRateInformation = exchangeRateInformation;
  }

  public OBWriteDataInternationalScheduledResponse1 initiation(OBInternationalScheduled1 initiation) {
    this.initiation = initiation;
    return this;
  }

  /**
   * Get initiation
   * @return initiation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBInternationalScheduled1 getInitiation() {
    return initiation;
  }

  public void setInitiation(OBInternationalScheduled1 initiation) {
    this.initiation = initiation;
  }

  public OBWriteDataInternationalScheduledResponse1 multiAuthorisation(OBMultiAuthorisation1 multiAuthorisation) {
    this.multiAuthorisation = multiAuthorisation;
    return this;
  }

  /**
   * Get multiAuthorisation
   * @return multiAuthorisation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBMultiAuthorisation1 getMultiAuthorisation() {
    return multiAuthorisation;
  }

  public void setMultiAuthorisation(OBMultiAuthorisation1 multiAuthorisation) {
    this.multiAuthorisation = multiAuthorisation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteDataInternationalScheduledResponse1 obWriteDataInternationalScheduledResponse1 = (OBWriteDataInternationalScheduledResponse1) o;
    return Objects.equals(this.internationalScheduledPaymentId, obWriteDataInternationalScheduledResponse1.internationalScheduledPaymentId) &&
        Objects.equals(this.consentId, obWriteDataInternationalScheduledResponse1.consentId) &&
        Objects.equals(this.creationDateTime, obWriteDataInternationalScheduledResponse1.creationDateTime) &&
        Objects.equals(this.status, obWriteDataInternationalScheduledResponse1.status) &&
        Objects.equals(this.statusUpdateDateTime, obWriteDataInternationalScheduledResponse1.statusUpdateDateTime) &&
        Objects.equals(this.expectedExecutionDateTime, obWriteDataInternationalScheduledResponse1.expectedExecutionDateTime) &&
        Objects.equals(this.expectedSettlementDateTime, obWriteDataInternationalScheduledResponse1.expectedSettlementDateTime) &&
        Objects.equals(this.charges, obWriteDataInternationalScheduledResponse1.charges) &&
        Objects.equals(this.exchangeRateInformation, obWriteDataInternationalScheduledResponse1.exchangeRateInformation) &&
        Objects.equals(this.initiation, obWriteDataInternationalScheduledResponse1.initiation) &&
        Objects.equals(this.multiAuthorisation, obWriteDataInternationalScheduledResponse1.multiAuthorisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internationalScheduledPaymentId, consentId, creationDateTime, status, statusUpdateDateTime, expectedExecutionDateTime, expectedSettlementDateTime, charges, exchangeRateInformation, initiation, multiAuthorisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDataInternationalScheduledResponse1 {\n");

    sb.append("    internationalScheduledPaymentId: ").append(toIndentedString(internationalScheduledPaymentId)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
    sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    multiAuthorisation: ").append(toIndentedString(multiAuthorisation)).append("\n");
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

