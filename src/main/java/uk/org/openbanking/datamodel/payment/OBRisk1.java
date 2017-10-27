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

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 
 */
@ApiModel(description = "")


public class OBRisk1 {

  @JsonProperty("PaymentContextCode")
  private OBExternalPaymentContext1Code paymentContextCode = null;

  @JsonProperty("MerchantCategoryCode")
  private String merchantCategoryCode = null;

  @JsonProperty("MerchantCustomerIdentification")
  private String merchantCustomerIdentification = null;

  @JsonProperty("DeliveryAddress")
  private PostalAddress18 deliveryAddress = null;

  public OBRisk1 paymentContextCode(OBExternalPaymentContext1Code paymentContextCode) {
    this.paymentContextCode = paymentContextCode;
    return this;
  }

   /**
   * Specifies the payment context
   * @return paymentContextCode
  **/
  @ApiModelProperty(value = "Specifies the payment context")


  public OBExternalPaymentContext1Code getPaymentContextCode() {
    return paymentContextCode;
  }

  public void setPaymentContextCode(OBExternalPaymentContext1Code paymentContextCode) {
    this.paymentContextCode = paymentContextCode;
  }

  public OBRisk1 merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

   /**
   * Category code conforms to ISO 18245, related to the type of services or goods the merchant provides for the transaction
   * @return merchantCategoryCode
  **/
  @ApiModelProperty(value = "Category code conforms to ISO 18245, related to the type of services or goods the merchant provides for the transaction")

 @Size(min=3,max=4)
  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public OBRisk1 merchantCustomerIdentification(String merchantCustomerIdentification) {
    this.merchantCustomerIdentification = merchantCustomerIdentification;
    return this;
  }

   /**
   * The unique customer identifier of the PSU with the merchant.
   * @return merchantCustomerIdentification
  **/
  @ApiModelProperty(value = "The unique customer identifier of the PSU with the merchant.")

 @Size(min=1,max=70)
  public String getMerchantCustomerIdentification() {
    return merchantCustomerIdentification;
  }

  public void setMerchantCustomerIdentification(String merchantCustomerIdentification) {
    this.merchantCustomerIdentification = merchantCustomerIdentification;
  }

  public OBRisk1 deliveryAddress(PostalAddress18 deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * Get deliveryAddress
   * @return deliveryAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PostalAddress18 getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(PostalAddress18 deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBRisk1 risk = (OBRisk1) o;
    return Objects.equals(this.paymentContextCode, risk.paymentContextCode) &&
        Objects.equals(this.merchantCategoryCode, risk.merchantCategoryCode) &&
        Objects.equals(this.merchantCustomerIdentification, risk.merchantCustomerIdentification) &&
        Objects.equals(this.deliveryAddress, risk.deliveryAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentContextCode, merchantCategoryCode, merchantCustomerIdentification, deliveryAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Risk {\n");
    
    sb.append("    paymentContextCode: ").append(toIndentedString(paymentContextCode)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    merchantCustomerIdentification: ").append(toIndentedString(merchantCustomerIdentification)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
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

