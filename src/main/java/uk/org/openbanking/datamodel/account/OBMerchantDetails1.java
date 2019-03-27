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

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Details of the merchant involved in the transaction.
 */
@ApiModel(description = "Details of the merchant involved in the transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class OBMerchantDetails1 {
  @JsonProperty("MerchantName")
  private String merchantName = null;

  @JsonProperty("MerchantCategoryCode")
  private String merchantCategoryCode = null;

  public OBMerchantDetails1 merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Name by which the merchant is known.
   * @return merchantName
  **/
  @ApiModelProperty(value = "Name by which the merchant is known.")

 @Size(min=1,max=350)
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public OBMerchantDetails1 merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

   /**
   * Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
   * @return merchantCategoryCode
  **/
  @ApiModelProperty(value = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.")

 @Size(min=3,max=4)
  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBMerchantDetails1 data3MerchantDetails = (OBMerchantDetails1) o;
    return Objects.equals(this.merchantName, data3MerchantDetails.merchantName) &&
        Objects.equals(this.merchantCategoryCode, data3MerchantDetails.merchantCategoryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantName, merchantCategoryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data3MerchantDetails {\n");

    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
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

