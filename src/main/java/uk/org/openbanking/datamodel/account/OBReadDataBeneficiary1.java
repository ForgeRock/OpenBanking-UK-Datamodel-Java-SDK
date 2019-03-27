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

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Data
 */
@ApiModel(description = "Data")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class OBReadDataBeneficiary1 {
  @JsonProperty("Beneficiary")
  private List<OBBeneficiary1> beneficiary = null;

  public OBReadDataBeneficiary1 beneficiary(List<OBBeneficiary1> beneficiary) {
    this.beneficiary = beneficiary;
    return this;
  }

  public OBReadDataBeneficiary1 addBeneficiaryItem(OBBeneficiary1 beneficiaryItem) {
    if (this.beneficiary == null) {
      this.beneficiary = new ArrayList<OBBeneficiary1>();
    }
    this.beneficiary.add(beneficiaryItem);
    return this;
  }

   /**
   * Beneficiary
   * @return beneficiary
  **/
  @ApiModelProperty(value = "Beneficiary")

  @Valid

  public List<OBBeneficiary1> getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(List<OBBeneficiary1> beneficiary) {
    this.beneficiary = beneficiary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDataBeneficiary1 data4 = (OBReadDataBeneficiary1) o;
    return Objects.equals(this.beneficiary, data4.beneficiary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data4 {\n");

    sb.append("    beneficiary: ").append(toIndentedString(beneficiary)).append("\n");
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

