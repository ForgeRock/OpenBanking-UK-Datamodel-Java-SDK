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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Result of a funds availability check.
 */
@ApiModel(description = "Result of a funds availability check.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-28T11:15:38.268Z")

public class OBFundsAvailableResult1   {
  @JsonProperty("FundsAvailableDateTime")
  private DateTime fundsAvailableDateTime = null;

  @JsonProperty("FundsAvailable")
  private Boolean fundsAvailable = null;

  public OBFundsAvailableResult1 fundsAvailableDateTime(DateTime fundsAvailableDateTime) {
    this.fundsAvailableDateTime = fundsAvailableDateTime;
    return this;
  }

  /**
   * Date and time at which the funds availability check was generated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return fundsAvailableDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the funds availability check was generated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getFundsAvailableDateTime() {
    return fundsAvailableDateTime;
  }

  public void setFundsAvailableDateTime(DateTime fundsAvailableDateTime) {
    this.fundsAvailableDateTime = fundsAvailableDateTime;
  }

  public OBFundsAvailableResult1 fundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
    return this;
  }

  /**
   * Flag to indicate the availability of funds given the Amount in the consent request.
   * @return fundsAvailable
  **/
  @ApiModelProperty(required = true, value = "Flag to indicate the availability of funds given the Amount in the consent request.")
  @NotNull


  public Boolean isFundsAvailable() {
    return fundsAvailable;
  }

  public void setFundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBFundsAvailableResult1 obFundsAvailableResult1 = (OBFundsAvailableResult1) o;
    return Objects.equals(this.fundsAvailableDateTime, obFundsAvailableResult1.fundsAvailableDateTime) &&
        Objects.equals(this.fundsAvailable, obFundsAvailableResult1.fundsAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsAvailableDateTime, fundsAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFundsAvailableResult1 {\n");

    sb.append("    fundsAvailableDateTime: ").append(toIndentedString(fundsAvailableDateTime)).append("\n");
    sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
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

