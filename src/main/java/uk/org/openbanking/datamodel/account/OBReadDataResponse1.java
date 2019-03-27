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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import uk.org.openbanking.jackson.DateTimeDeserializer;
import uk.org.openbanking.jackson.DateTimeSerializer;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Account Request Response
 */
@ApiModel(description = "Account Request Response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class OBReadDataResponse1 {
  @JsonProperty("AccountRequestId")
  private String accountRequestId = null;

  @JsonProperty("Status")
  private OBExternalRequestStatus1Code status = null;

  @JsonProperty("CreationDateTime")
  @JsonDeserialize(using = DateTimeDeserializer.class)
  @JsonSerialize(using = DateTimeSerializer.class)
  private DateTime creationDateTime = null;

  @JsonProperty("Permissions")
  private List<OBExternalPermissions1Code> permissions = new ArrayList<OBExternalPermissions1Code>();

  @JsonProperty("ExpirationDateTime")
  @JsonDeserialize(using = DateTimeDeserializer.class)
  @JsonSerialize(using = DateTimeSerializer.class)
  private DateTime expirationDateTime = null;

  @JsonProperty("TransactionFromDateTime")
  @JsonDeserialize(using = DateTimeDeserializer.class)
  @JsonSerialize(using = DateTimeSerializer.class)
  private DateTime transactionFromDateTime = null;

  @JsonProperty("TransactionToDateTime")
  @JsonDeserialize(using = DateTimeDeserializer.class)
  @JsonSerialize(using = DateTimeSerializer.class)
  private DateTime transactionToDateTime = null;

  public OBReadDataResponse1 accountRequestId(String accountRequestId) {
    this.accountRequestId = accountRequestId;
    return this;
  }

   /**
   * Unique identification as assigned to identify the account request resource.
   * @return accountRequestId
  **/
  @ApiModelProperty(required = true, value = "Unique identification as assigned to identify the account request resource.")
  @NotNull

 @Size(min=1,max=128)
  public String getAccountRequestId() {
    return accountRequestId;
  }

  public void setAccountRequestId(String accountRequestId) {
    this.accountRequestId = accountRequestId;
  }

  public OBReadDataResponse1 status(OBExternalRequestStatus1Code status) {
    this.status = status;
    return this;
  }

   /**
   * Specifies the status of the account request resource.
   * @return status
  **/
  @ApiModelProperty(value = "Specifies the status of the account request resource.")


  public OBExternalRequestStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBExternalRequestStatus1Code status) {
    this.status = status;
  }

  public OBReadDataResponse1 creationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

   /**
   * Date and time at which the resource was created.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBReadDataResponse1 permissions(List<OBExternalPermissions1Code> permissions) {
    this.permissions = permissions;
    return this;
  }

  public OBReadDataResponse1 addPermissionsItem(OBExternalPermissions1Code permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Specifies the Open Banking account request types. This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP.
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "Specifies the Open Banking account request types. This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP.")
  @NotNull


  public List<OBExternalPermissions1Code> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<OBExternalPermissions1Code> permissions) {
    this.permissions = permissions;
  }

  public OBReadDataResponse1 expirationDateTime(DateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

   /**
   * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expirationDateTime
  **/
  @ApiModelProperty(value = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(DateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  public OBReadDataResponse1 transactionFromDateTime(DateTime transactionFromDateTime) {
    this.transactionFromDateTime = transactionFromDateTime;
    return this;
  }

   /**
   * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return transactionFromDateTime
  **/
  @ApiModelProperty(value = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getTransactionFromDateTime() {
    return transactionFromDateTime;
  }

  public void setTransactionFromDateTime(DateTime transactionFromDateTime) {
    this.transactionFromDateTime = transactionFromDateTime;
  }

  public OBReadDataResponse1 transactionToDateTime(DateTime transactionToDateTime) {
    this.transactionToDateTime = transactionToDateTime;
    return this;
  }

   /**
   * Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return transactionToDateTime
  **/
  @ApiModelProperty(value = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getTransactionToDateTime() {
    return transactionToDateTime;
  }

  public void setTransactionToDateTime(DateTime transactionToDateTime) {
    this.transactionToDateTime = transactionToDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDataResponse1 data1 = (OBReadDataResponse1) o;
    return Objects.equals(this.accountRequestId, data1.accountRequestId) &&
        Objects.equals(this.status, data1.status) &&
        Objects.equals(this.creationDateTime, data1.creationDateTime) &&
        Objects.equals(this.permissions, data1.permissions) &&
        Objects.equals(this.expirationDateTime, data1.expirationDateTime) &&
        Objects.equals(this.transactionFromDateTime, data1.transactionFromDateTime) &&
        Objects.equals(this.transactionToDateTime, data1.transactionToDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRequestId, status, creationDateTime, permissions, expirationDateTime, transactionFromDateTime, transactionToDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data1 {\n");

    sb.append("    accountRequestId: ").append(toIndentedString(accountRequestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    transactionFromDateTime: ").append(toIndentedString(transactionFromDateTime)).append("\n");
    sb.append("    transactionToDateTime: ").append(toIndentedString(transactionToDateTime)).append("\n");
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

