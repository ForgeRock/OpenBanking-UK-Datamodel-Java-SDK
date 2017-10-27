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

package uk.org.openbanking.datamodel.payment.paymentsetup;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.org.openbanking.datamodel.payment.OBPaymentDataSetup1;
import uk.org.openbanking.datamodel.payment.OBRisk1;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

/**
 * Allows setup of a payment
 */
@ApiModel(description = "Allows setup of a payment")


public class OBPaymentSetup1 {
  @JsonProperty("Data")
  private OBPaymentDataSetup1 data = null;

  @JsonProperty("Risk")
  private OBRisk1 risk = null;

  public OBPaymentSetup1 data(OBPaymentDataSetup1 data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBPaymentDataSetup1 getData() {
    return data;
  }

  public void setData(OBPaymentDataSetup1 data) {
    this.data = data;
  }

  public OBPaymentSetup1 risk(OBRisk1 risk) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPaymentSetup1 paymentSetupPOSTRequest = (OBPaymentSetup1) o;
    return Objects.equals(this.data, paymentSetupPOSTRequest.data) &&
        Objects.equals(this.risk, paymentSetupPOSTRequest.risk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupPOSTRequest {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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

