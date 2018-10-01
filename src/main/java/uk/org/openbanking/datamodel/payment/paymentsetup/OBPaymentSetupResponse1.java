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
 *  Copyright 2018 ForgeRock AS.
 */
package uk.org.openbanking.datamodel.payment.paymentsetup;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.org.openbanking.datamodel.payment.OBRisk1;
import uk.org.openbanking.datamodel.payment.PaymentSetupPOSTResponseLinks;
import uk.org.openbanking.datamodel.payment.PaymentSetupPOSTResponseMeta;
import uk.org.openbanking.datamodel.payment.OBPaymentDataSetupResponse1;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

/**
 * PaymentSetupPOSTResponse
 */


public class OBPaymentSetupResponse1 {
  @JsonProperty("Data")
  private OBPaymentDataSetupResponse1 data = null;

  @JsonProperty("Risk")
  private OBRisk1 risk = null;

  @JsonProperty("Links")
  private PaymentSetupPOSTResponseLinks links = null;

  @JsonProperty("Meta")
  private PaymentSetupPOSTResponseMeta meta = null;

  public OBPaymentSetupResponse1 data(OBPaymentDataSetupResponse1 data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBPaymentDataSetupResponse1 getData() {
    return data;
  }

  public void setData(OBPaymentDataSetupResponse1 data) {
    this.data = data;
  }

  public OBPaymentSetupResponse1 risk(OBRisk1 risk) {
    this.risk = risk;
    return this;
  }

   /**
   * Get risk
   * @return risk
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBRisk1 getRisk() {
    return risk;
  }

  public void setRisk(OBRisk1 risk) {
    this.risk = risk;
  }

  public OBPaymentSetupResponse1 links(PaymentSetupPOSTResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentSetupPOSTResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PaymentSetupPOSTResponseLinks links) {
    this.links = links;
  }

  public OBPaymentSetupResponse1 meta(PaymentSetupPOSTResponseMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentSetupPOSTResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(PaymentSetupPOSTResponseMeta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPaymentSetupResponse1 paymentSetupPOSTResponse = (OBPaymentSetupResponse1) o;
    return Objects.equals(this.data, paymentSetupPOSTResponse.data) &&
        Objects.equals(this.risk, paymentSetupPOSTResponse.risk) &&
        Objects.equals(this.links, paymentSetupPOSTResponse.links) &&
        Objects.equals(this.meta, paymentSetupPOSTResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupPOSTResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

