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

import javax.validation.Valid;
import java.util.Objects;

/**
 * Meta Data relevant to the payload
 */
@ApiModel(description = "Meta Data relevant to the payload")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class Meta {
  @JsonProperty("TotalPages")
  private Integer totalPages = null;

  @JsonProperty("FirstAvailableDateTime")
  private DateTime firstAvailableDateTime = null;

  @JsonProperty("LastAvailableDateTime")
  private DateTime lastAvailableDateTime = null;

  public Meta totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(value = "")


  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public Meta firstAvailableDateTime(DateTime firstAvailableDateTime) {
    this.firstAvailableDateTime = firstAvailableDateTime;
    return this;
  }

   /**
   *   All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return firstAvailableDateTime
  **/
  @ApiModelProperty(value = "  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getFirstAvailableDateTime() {
    return firstAvailableDateTime;
  }

  public void setFirstAvailableDateTime(DateTime firstAvailableDateTime) {
    this.firstAvailableDateTime = firstAvailableDateTime;
  }

  public Meta lastAvailableDateTime(DateTime lastAvailableDateTime) {
    this.lastAvailableDateTime = lastAvailableDateTime;
    return this;
  }

   /**
   *   All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return lastAvailableDateTime
  **/
  @ApiModelProperty(value = "  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getLastAvailableDateTime() {
    return lastAvailableDateTime;
  }

  public void setLastAvailableDateTime(DateTime lastAvailableDateTime) {
    this.lastAvailableDateTime = lastAvailableDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta metaData = (Meta) o;
    return Objects.equals(this.totalPages, metaData.totalPages) &&
        Objects.equals(this.firstAvailableDateTime, metaData.firstAvailableDateTime) &&
        Objects.equals(this.lastAvailableDateTime, metaData.lastAvailableDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPages, firstAvailableDateTime, lastAvailableDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaData {\n");

    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    firstAvailableDateTime: ").append(toIndentedString(firstAvailableDateTime)).append("\n");
    sb.append("    lastAvailableDateTime: ").append(toIndentedString(lastAvailableDateTime)).append("\n");
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

