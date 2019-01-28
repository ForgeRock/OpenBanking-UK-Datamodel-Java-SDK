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
 *  Copyright 2018 ForgeRock AS.
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
 * OBWriteDataInternationalStandingOrderResponse2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-28T11:15:38.268Z")

public class OBWriteDataInternationalStandingOrderResponse2   {
  @JsonProperty("InternationalStandingOrderId")
  private String internationalStandingOrderId = null;

  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("CreationDateTime")
  private DateTime creationDateTime = null;

  @JsonProperty("Status")
  private OBExternalStatus1Code status = null;

  @JsonProperty("StatusUpdateDateTime")
  private DateTime statusUpdateDateTime = null;

  @JsonProperty("Charges")
  @Valid
  private List<OBCharge1> charges = null;

  @JsonProperty("Initiation")
  private OBInternationalStandingOrder2 initiation = null;

  @JsonProperty("MultiAuthorisation")
  private OBMultiAuthorisation1 multiAuthorisation = null;

  public OBWriteDataInternationalStandingOrderResponse2 internationalStandingOrderId(String internationalStandingOrderId) {
    this.internationalStandingOrderId = internationalStandingOrderId;
    return this;
  }

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the international standing order resource.
   * @return internationalStandingOrderId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the international standing order resource.")
  @NotNull

@Size(min=1,max=40) 
  public String getInternationalStandingOrderId() {
    return internationalStandingOrderId;
  }

  public void setInternationalStandingOrderId(String internationalStandingOrderId) {
    this.internationalStandingOrderId = internationalStandingOrderId;
  }

  public OBWriteDataInternationalStandingOrderResponse2 consentId(String consentId) {
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

  public OBWriteDataInternationalStandingOrderResponse2 creationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBWriteDataInternationalStandingOrderResponse2 status(OBExternalStatus1Code status) {
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

  public OBWriteDataInternationalStandingOrderResponse2 statusUpdateDateTime(DateTime statusUpdateDateTime) {
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

  public OBWriteDataInternationalStandingOrderResponse2 charges(List<OBCharge1> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteDataInternationalStandingOrderResponse2 addChargesItem(OBCharge1 chargesItem) {
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

  public OBWriteDataInternationalStandingOrderResponse2 initiation(OBInternationalStandingOrder2 initiation) {
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

  public OBInternationalStandingOrder2 getInitiation() {
    return initiation;
  }

  public void setInitiation(OBInternationalStandingOrder2 initiation) {
    this.initiation = initiation;
  }

  public OBWriteDataInternationalStandingOrderResponse2 multiAuthorisation(OBMultiAuthorisation1 multiAuthorisation) {
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
    OBWriteDataInternationalStandingOrderResponse2 obWriteDataInternationalStandingOrderResponse2 = (OBWriteDataInternationalStandingOrderResponse2) o;
    return Objects.equals(this.internationalStandingOrderId, obWriteDataInternationalStandingOrderResponse2.internationalStandingOrderId) &&
        Objects.equals(this.consentId, obWriteDataInternationalStandingOrderResponse2.consentId) &&
        Objects.equals(this.creationDateTime, obWriteDataInternationalStandingOrderResponse2.creationDateTime) &&
        Objects.equals(this.status, obWriteDataInternationalStandingOrderResponse2.status) &&
        Objects.equals(this.statusUpdateDateTime, obWriteDataInternationalStandingOrderResponse2.statusUpdateDateTime) &&
        Objects.equals(this.charges, obWriteDataInternationalStandingOrderResponse2.charges) &&
        Objects.equals(this.initiation, obWriteDataInternationalStandingOrderResponse2.initiation) &&
        Objects.equals(this.multiAuthorisation, obWriteDataInternationalStandingOrderResponse2.multiAuthorisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internationalStandingOrderId, consentId, creationDateTime, status, statusUpdateDateTime, charges, initiation, multiAuthorisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDataInternationalStandingOrderResponse2 {\n");

    sb.append("    internationalStandingOrderId: ").append(toIndentedString(internationalStandingOrderId)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
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

