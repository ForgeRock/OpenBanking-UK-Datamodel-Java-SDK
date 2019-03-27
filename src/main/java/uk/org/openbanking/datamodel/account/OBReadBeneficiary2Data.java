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
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadBeneficiary2Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBReadBeneficiary2Data   {
  @JsonProperty("Beneficiary")
  @Valid
  private List<OBBeneficiary2> beneficiary = null;

  public OBReadBeneficiary2Data beneficiary(List<OBBeneficiary2> beneficiary) {
    this.beneficiary = beneficiary;
    return this;
  }

  public OBReadBeneficiary2Data addBeneficiaryItem(OBBeneficiary2 beneficiaryItem) {
    if (this.beneficiary == null) {
      this.beneficiary = new ArrayList<OBBeneficiary2>();
    }
    this.beneficiary.add(beneficiaryItem);
    return this;
  }

  /**
   * Get beneficiary
   * @return beneficiary
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBBeneficiary2> getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(List<OBBeneficiary2> beneficiary) {
    this.beneficiary = beneficiary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBeneficiary2Data obReadBeneficiary2Data = (OBReadBeneficiary2Data) o;
    return Objects.equals(this.beneficiary, obReadBeneficiary2Data.beneficiary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBeneficiary2Data {\n");
    
    sb.append("    beneficiary: ").append(toIndentedString(beneficiary)).append("\n");
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

