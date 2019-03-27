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
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Overdraft fees and charges details
 */
@ApiModel(description = "Overdraft fees and charges details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBOverdraftFeesCharges1 {
  @JsonProperty("OverdraftFeeChargeCap")
  @Valid
  private List<OBOverdraftFeeChargeCap1> overdraftFeeChargeCap = null;

  @JsonProperty("OverdraftFeeChargeDetail")
  @Valid
  private List<OBOverdraftFeesChargeDetails1> overdraftFeeChargeDetail = new ArrayList<OBOverdraftFeesChargeDetails1>();

  public OBOverdraftFeesCharges1 overdraftFeeChargeCap(List<OBOverdraftFeeChargeCap1> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OBOverdraftFeesCharges1 addOverdraftFeeChargeCapItem(OBOverdraftFeeChargeCap1 overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<OBOverdraftFeeChargeCap1>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
   * @return overdraftFeeChargeCap
  **/
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")

  @Valid

  public List<OBOverdraftFeeChargeCap1> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<OBOverdraftFeeChargeCap1> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public OBOverdraftFeesCharges1 overdraftFeeChargeDetail(List<OBOverdraftFeesChargeDetails1> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public OBOverdraftFeesCharges1 addOverdraftFeeChargeDetailItem(OBOverdraftFeesChargeDetails1 overdraftFeeChargeDetailItem) {
    this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
    return this;
  }

  /**
   * Details about the fees/charges
   * @return overdraftFeeChargeDetail
  **/
  @ApiModelProperty(required = true, value = "Details about the fees/charges")
  @NotNull

  @Valid
@Size(min=1) 
  public List<OBOverdraftFeesChargeDetails1> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }

  public void setOverdraftFeeChargeDetail(List<OBOverdraftFeesChargeDetails1> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBOverdraftFeesCharges1 overdraft1OverdraftFeesCharges1 = (OBOverdraftFeesCharges1) o;
    return Objects.equals(this.overdraftFeeChargeCap, overdraft1OverdraftFeesCharges1.overdraftFeeChargeCap) &&
        Objects.equals(this.overdraftFeeChargeDetail, overdraft1OverdraftFeesCharges1.overdraftFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBOverdraftFeesCharges1 {\n");

    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
    sb.append("    overdraftFeeChargeDetail: ").append(toIndentedString(overdraftFeeChargeDetail)).append("\n");
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

