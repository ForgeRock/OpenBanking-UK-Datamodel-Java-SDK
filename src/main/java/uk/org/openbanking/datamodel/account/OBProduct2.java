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
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBProduct2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBProduct2   {
  @JsonProperty("ProductName")
  private String productName = null;

  @JsonProperty("ProductId")
  private String productId = null;

  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("SecondaryProductId")
  private String secondaryProductId = null;

  @JsonProperty("ProductType")
  private OBExternalProductType1Code productType = null;

  @JsonProperty("MarketingStateId")
  private String marketingStateId = null;

  @JsonProperty("OtherProductType")
  private OBOtherProductType1 otherProductType = null;

  @JsonProperty("BCA")
  private OBBCAData1 BCA = null;

  @JsonProperty("PCA")
  private OBPCAData1 PCA = null;

  public OBProduct2 productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * The name of the product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return productName
  **/
  @ApiModelProperty(value = "The name of the product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public OBProduct2 productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Identifier within the parent organisation for the product. Must be unique in the organisation.
   * @return productId
  **/
  @ApiModelProperty(value = "Identifier within the parent organisation for the product. Must be unique in the organisation.")


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public OBProduct2 accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBProduct2 secondaryProductId(String secondaryProductId) {
    this.secondaryProductId = secondaryProductId;
    return this;
  }

  /**
   * Identifier within the parent organisation for the product. Must be unique in the organisation.
   * @return secondaryProductId
  **/
  @ApiModelProperty(value = "Identifier within the parent organisation for the product. Must be unique in the organisation.")


  public String getSecondaryProductId() {
    return secondaryProductId;
  }

  public void setSecondaryProductId(String secondaryProductId) {
    this.secondaryProductId = secondaryProductId;
  }

  public OBProduct2 productType(OBExternalProductType1Code productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalProductType1Code getProductType() {
    return productType;
  }

  public void setProductType(OBExternalProductType1Code productType) {
    this.productType = productType;
  }

  public OBProduct2 marketingStateId(String marketingStateId) {
    this.marketingStateId = marketingStateId;
    return this;
  }

  /**
   * Unique and unambiguous identification of a Product Marketing State.
   * @return marketingStateId
  **/
  @ApiModelProperty(value = "Unique and unambiguous identification of a Product Marketing State.")


  public String getMarketingStateId() {
    return marketingStateId;
  }

  public void setMarketingStateId(String marketingStateId) {
    this.marketingStateId = marketingStateId;
  }

  public OBProduct2 otherProductType(OBOtherProductType1 otherProductType) {
    this.otherProductType = otherProductType;
    return this;
  }

  /**
   * Get otherProductType
   * @return otherProductType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBOtherProductType1 getOtherProductType() {
    return otherProductType;
  }

  public void setOtherProductType(OBOtherProductType1 otherProductType) {
    this.otherProductType = otherProductType;
  }

  public OBProduct2 PCA(OBPCAData1 PCA) {
    this.PCA = PCA;
    return this;
  }

  /**
   * Get PCA
   * @return PCA
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBPCAData1 getPCA() {
    return PCA;
  }

  public void setPCA(OBPCAData1 PCA) {
    this.PCA = PCA;
  }

  public OBProduct2 BCA(OBBCAData1 BCA) {
    this.BCA = BCA;
    return this;
  }

  /**
   * Get BCA
   * @return BCA
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBBCAData1 getBCA() {
    return BCA;
  }

  public void setBCA(OBBCAData1 BCA) {
    this.BCA = BCA;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBProduct2 obProduct2 = (OBProduct2) o;
    return Objects.equals(this.productName, obProduct2.productName) &&
        Objects.equals(this.productId, obProduct2.productId) &&
        Objects.equals(this.accountId, obProduct2.accountId) &&
        Objects.equals(this.secondaryProductId, obProduct2.secondaryProductId) &&
        Objects.equals(this.productType, obProduct2.productType) &&
        Objects.equals(this.marketingStateId, obProduct2.marketingStateId) &&
        Objects.equals(this.otherProductType, obProduct2.otherProductType) &&
        Objects.equals(this.PCA, obProduct2.PCA) &&
        Objects.equals(this.BCA, obProduct2.BCA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productName, productId, accountId, secondaryProductId, productType, marketingStateId, otherProductType, PCA, BCA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBProduct2 {\n");

    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    secondaryProductId: ").append(toIndentedString(secondaryProductId)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    marketingStateId: ").append(toIndentedString(marketingStateId)).append("\n");
    sb.append("    otherProductType: ").append(toIndentedString(otherProductType)).append("\n");
    sb.append("    PCA: ").append(toIndentedString(PCA)).append("\n");
    sb.append("    BCA: ").append(toIndentedString(BCA)).append("\n");
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

