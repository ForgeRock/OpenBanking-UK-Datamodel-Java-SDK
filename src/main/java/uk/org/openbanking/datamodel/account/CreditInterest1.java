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
 *  Copyright 2018 ForgeRock AS.
 *
 */

package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CreditInterest1TierBandSet;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details about the interest that may be payable to the BCA account holders
 */
@ApiModel(description = "Details about the interest that may be payable to the BCA account holders")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class CreditInterest1   {
  @JsonProperty("TierBandSet")
  @Valid
  private List<CreditInterest1TierBandSet> tierBandSet = new ArrayList<CreditInterest1TierBandSet>();

  public CreditInterest1 tierBandSet(List<CreditInterest1TierBandSet> tierBandSet) {
    this.tierBandSet = tierBandSet;
    return this;
  }

  public CreditInterest1 addTierBandSetItem(CreditInterest1TierBandSet tierBandSetItem) {
    this.tierBandSet.add(tierBandSetItem);
    return this;
  }

  /**
   * The group of tiers or bands for which credit interest can be applied.
   * @return tierBandSet
  **/
  @ApiModelProperty(required = true, value = "The group of tiers or bands for which credit interest can be applied.")
  @NotNull

  @Valid
@Size(min=1) 
  public List<CreditInterest1TierBandSet> getTierBandSet() {
    return tierBandSet;
  }

  public void setTierBandSet(List<CreditInterest1TierBandSet> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditInterest1 creditInterest1 = (CreditInterest1) o;
    return Objects.equals(this.tierBandSet, creditInterest1.tierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditInterest1 {\n");

    sb.append("    tierBandSet: ").append(toIndentedString(tierBandSet)).append("\n");
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

