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
 * OBWriteDataFileResponse2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-28T11:15:38.268Z")

public class OBWriteDataFileResponse2   {
  @JsonProperty("FilePaymentId")
  private String filePaymentId = null;

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
  private OBFile2 initiation = null;

  @JsonProperty("MultiAuthorisation")
  private OBMultiAuthorisation1 multiAuthorisation = null;

  public OBWriteDataFileResponse2 filePaymentId(String filePaymentId) {
    this.filePaymentId = filePaymentId;
    return this;
  }

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the file payment resource.
   * @return filePaymentId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the file payment resource.")
  @NotNull

@Size(min=1,max=40) 
  public String getFilePaymentId() {
    return filePaymentId;
  }

  public void setFilePaymentId(String filePaymentId) {
    this.filePaymentId = filePaymentId;
  }

  public OBWriteDataFileResponse2 consentId(String consentId) {
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

  public OBWriteDataFileResponse2 creationDateTime(DateTime creationDateTime) {
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

  public OBWriteDataFileResponse2 status(OBExternalStatus1Code status) {
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

  public OBWriteDataFileResponse2 statusUpdateDateTime(DateTime statusUpdateDateTime) {
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

  public OBWriteDataFileResponse2 charges(List<OBCharge1> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteDataFileResponse2 addChargesItem(OBCharge1 chargesItem) {
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

  public OBWriteDataFileResponse2 initiation(OBFile2 initiation) {
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

  public OBFile2 getInitiation() {
    return initiation;
  }

  public void setInitiation(OBFile2 initiation) {
    this.initiation = initiation;
  }

  public OBWriteDataFileResponse2 multiAuthorisation(OBMultiAuthorisation1 multiAuthorisation) {
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
    OBWriteDataFileResponse2 obWriteDataFileResponse2 = (OBWriteDataFileResponse2) o;
    return Objects.equals(this.filePaymentId, obWriteDataFileResponse2.filePaymentId) &&
        Objects.equals(this.consentId, obWriteDataFileResponse2.consentId) &&
        Objects.equals(this.creationDateTime, obWriteDataFileResponse2.creationDateTime) &&
        Objects.equals(this.status, obWriteDataFileResponse2.status) &&
        Objects.equals(this.statusUpdateDateTime, obWriteDataFileResponse2.statusUpdateDateTime) &&
        Objects.equals(this.charges, obWriteDataFileResponse2.charges) &&
        Objects.equals(this.initiation, obWriteDataFileResponse2.initiation) &&
        Objects.equals(this.multiAuthorisation, obWriteDataFileResponse2.multiAuthorisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePaymentId, consentId, creationDateTime, status, statusUpdateDateTime, charges, initiation, multiAuthorisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDataFileResponse2 {\n");

    sb.append("    filePaymentId: ").append(toIndentedString(filePaymentId)).append("\n");
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

