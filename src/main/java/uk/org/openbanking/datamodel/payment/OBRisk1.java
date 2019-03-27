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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Payments.
 */
@ApiModel(description = "The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Payments.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-10T14:05:22.993+01:00")

public class OBRisk1   {
  @JsonProperty("PaymentContextCode")
  private OBExternalPaymentContext1Code paymentContextCode = null;

  @JsonProperty("MerchantCategoryCode")
  private String merchantCategoryCode = null;

  @JsonProperty("MerchantCustomerIdentification")
  private String merchantCustomerIdentification = null;

  @JsonProperty("DeliveryAddress")
  private OBRisk1DeliveryAddress deliveryAddress = null;

  public OBRisk1 paymentContextCode(OBExternalPaymentContext1Code paymentContextCode) {
    this.paymentContextCode = paymentContextCode;
    return this;
  }

  /**
   * Get paymentContextCode
   * @return paymentContextCode
  **/
  @ApiModelProperty(value = "")

  @Valid

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

  public OBRisk1 deliveryAddress(OBRisk1DeliveryAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

  /**
   * Get deliveryAddress
   * @return deliveryAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBRisk1DeliveryAddress getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(OBRisk1DeliveryAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBRisk1 obRisk1 = (OBRisk1) o;
    return Objects.equals(this.paymentContextCode, obRisk1.paymentContextCode) &&
        Objects.equals(this.merchantCategoryCode, obRisk1.merchantCategoryCode) &&
        Objects.equals(this.merchantCustomerIdentification, obRisk1.merchantCustomerIdentification) &&
        Objects.equals(this.deliveryAddress, obRisk1.deliveryAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentContextCode, merchantCategoryCode, merchantCustomerIdentification, deliveryAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBRisk1 {\n");

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

