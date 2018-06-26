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
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBBCAData1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBBCAData1   {
  @JsonProperty("ProductDetails")
  private ProductDetails1 productDetails = null;

  @JsonProperty("CreditInterest")
  private CreditInterest1 creditInterest = null;

  @JsonProperty("Overdraft")
  private Overdraft1 overdraft = null;

  @JsonProperty("OtherFeesCharges")
  @Valid
  private List<OBBCAData1OtherFeesCharges> otherFeesCharges = null;

  public OBBCAData1 productDetails(ProductDetails1 productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductDetails1 getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductDetails1 productDetails) {
    this.productDetails = productDetails;
  }

  public OBBCAData1 creditInterest(CreditInterest1 creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

  /**
   * Get creditInterest
   * @return creditInterest
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditInterest1 getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(CreditInterest1 creditInterest) {
    this.creditInterest = creditInterest;
  }

  public OBBCAData1 overdraft(Overdraft1 overdraft) {
    this.overdraft = overdraft;
    return this;
  }

  /**
   * Get overdraft
   * @return overdraft
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Overdraft1 getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(Overdraft1 overdraft) {
    this.overdraft = overdraft;
  }

  public OBBCAData1 otherFeesCharges(List<OBBCAData1OtherFeesCharges> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  public OBBCAData1 addOtherFeesChargesItem(OBBCAData1OtherFeesCharges otherFeesChargesItem) {
    if (this.otherFeesCharges == null) {
      this.otherFeesCharges = new ArrayList<OBBCAData1OtherFeesCharges>();
    }
    this.otherFeesCharges.add(otherFeesChargesItem);
    return this;
  }

  /**
   * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
   * @return otherFeesCharges
  **/
  @ApiModelProperty(value = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")

  @Valid

  public List<OBBCAData1OtherFeesCharges> getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(List<OBBCAData1OtherFeesCharges> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBCAData1 obBCAData1 = (OBBCAData1) o;
    return Objects.equals(this.productDetails, obBCAData1.productDetails) &&
        Objects.equals(this.creditInterest, obBCAData1.creditInterest) &&
        Objects.equals(this.overdraft, obBCAData1.overdraft) &&
        Objects.equals(this.otherFeesCharges, obBCAData1.otherFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productDetails, creditInterest, overdraft, otherFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBCAData1 {\n");

    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
    sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
    sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
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

