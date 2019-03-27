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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Allows setup of an account access request
 */
@ApiModel(description = "Allows setup of an account access request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class OBReadRequest1 {
  @JsonProperty("Data")
  private OBReadData1 data = null;

  @JsonProperty("Risk")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private OBRisk2 risk = null;

  public OBReadRequest1 data(OBReadData1 data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid
  @NotNull
  public OBReadData1 getData() {
    return data;
  }

  public void setData(OBReadData1 data) {
    this.data = data;
  }

  public OBReadRequest1 risk(OBRisk2 risk) {
    this.risk = risk;
    return this;
  }

   /**
   * The Risk payload is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.
   * @return risk
  **/
  @ApiModelProperty(required = true, value = "The Risk payload is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.")


  public OBRisk2 getRisk() {
    return risk;
  }

  public void setRisk(OBRisk2 risk) {
    this.risk = risk;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadRequest1 accountRequestPOSTRequest = (OBReadRequest1) o;
    return Objects.equals(this.data, accountRequestPOSTRequest.data) &&
        Objects.equals(this.risk, accountRequestPOSTRequest.risk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRequestPOSTRequest {\n");

    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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

