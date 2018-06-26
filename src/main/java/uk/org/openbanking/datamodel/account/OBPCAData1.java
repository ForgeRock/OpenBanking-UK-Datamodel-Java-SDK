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
import java.util.Objects;

/**
 * OBPCAData1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBPCAData1   {
  @JsonProperty("ProductDetails")
  private ProductDetails productDetails = null;

  @JsonProperty("CreditInterest")
  private CreditInterest creditInterest = null;

  @JsonProperty("Overdraft")
  private Overdraft overdraft = null;

  @JsonProperty("OtherFeesCharges")
  private OtherFeesCharges otherFeesCharges = null;

  public OBPCAData1 productDetails(ProductDetails productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductDetails getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductDetails productDetails) {
    this.productDetails = productDetails;
  }

  public OBPCAData1 creditInterest(CreditInterest creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

  /**
   * Get creditInterest
   * @return creditInterest
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditInterest getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(CreditInterest creditInterest) {
    this.creditInterest = creditInterest;
  }

  public OBPCAData1 overdraft(Overdraft overdraft) {
    this.overdraft = overdraft;
    return this;
  }

  /**
   * Get overdraft
   * @return overdraft
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Overdraft getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(Overdraft overdraft) {
    this.overdraft = overdraft;
  }

  public OBPCAData1 otherFeesCharges(OtherFeesCharges otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  /**
   * Get otherFeesCharges
   * @return otherFeesCharges
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherFeesCharges getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(OtherFeesCharges otherFeesCharges) {
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
    OBPCAData1 obPCAData1 = (OBPCAData1) o;
    return Objects.equals(this.productDetails, obPCAData1.productDetails) &&
        Objects.equals(this.creditInterest, obPCAData1.creditInterest) &&
        Objects.equals(this.overdraft, obPCAData1.overdraft) &&
        Objects.equals(this.otherFeesCharges, obPCAData1.otherFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productDetails, creditInterest, overdraft, otherFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPCAData1 {\n");

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

