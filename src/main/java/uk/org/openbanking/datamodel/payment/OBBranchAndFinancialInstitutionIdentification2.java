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

package uk.org.openbanking.datamodel.payment;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * Financial institution servicing an account for the creditor.
 */
@ApiModel(description = "Financial institution servicing an account for the creditor.")


public class OBBranchAndFinancialInstitutionIdentification2 {

  @JsonProperty("SchemeName")
  private OBExternalFinancialInstitutionIdentification2Code schemeName = null;

  @JsonProperty("Identification")
  private String identification = null;

  public OBBranchAndFinancialInstitutionIdentification2 schemeName(OBExternalFinancialInstitutionIdentification2Code schemeName) {
    this.schemeName = schemeName;
    return this;
  }

   /**
   * Name of the identification scheme, in a coded form as published in an external list.
   * @return schemeName
  **/
  @ApiModelProperty(required = true, value = "Name of the identification scheme, in a coded form as published in an external list.")
  @NotNull


  public OBExternalFinancialInstitutionIdentification2Code getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(OBExternalFinancialInstitutionIdentification2Code schemeName) {
    this.schemeName = schemeName;
  }

  public OBBranchAndFinancialInstitutionIdentification2 identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Unique and unambiguous identification of a person.
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Unique and unambiguous identification of a person.")
  @NotNull

 @Size(min=1,max=35)
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBranchAndFinancialInstitutionIdentification2 creditorAgent = (OBBranchAndFinancialInstitutionIdentification2) o;
    return Objects.equals(this.schemeName, creditorAgent.schemeName) &&
        Objects.equals(this.identification, creditorAgent.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBranchAndFinancialInstitutionIdentification2 {\n");
    
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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

