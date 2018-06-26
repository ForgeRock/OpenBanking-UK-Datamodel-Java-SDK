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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 */
@ApiModel(description = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBBCAData1OtherFeesCharges   {
  /**
   * TariffType which defines the fee and charges.
   */
  public enum TariffTypeEnum {
    ELECTRONIC("Electronic"),
    
    MIXED("Mixed"),
    
    OTHER("Other");

    private String value;

    TariffTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TariffTypeEnum fromValue(String text) {
      for (TariffTypeEnum b : TariffTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("TariffType")
  private TariffTypeEnum tariffType = null;

  @JsonProperty("TariffName")
  private String tariffName = null;

  @JsonProperty("OtherTariffType")
  private OtherTariffType otherTariffType = null;

  @JsonProperty("FeeChargeDetail")
  @Valid
  private List<OBBCAData1FeeChargeDetail> feeChargeDetail = new ArrayList<OBBCAData1FeeChargeDetail>();

  @JsonProperty("FeeChargeCap")
  @Valid
  private List<OBBCAData1FeeChargeCap> feeChargeCap = null;

  public OBBCAData1OtherFeesCharges tariffType(TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
    return this;
  }

  /**
   * TariffType which defines the fee and charges.
   * @return tariffType
  **/
  @ApiModelProperty(value = "TariffType which defines the fee and charges.")


  public TariffTypeEnum getTariffType() {
    return tariffType;
  }

  public void setTariffType(TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
  }

  public OBBCAData1OtherFeesCharges tariffName(String tariffName) {
    this.tariffName = tariffName;
    return this;
  }

  /**
   * Name of the tariff
   * @return tariffName
  **/
  @ApiModelProperty(value = "Name of the tariff")

@Size(min=1,max=350) 
  public String getTariffName() {
    return tariffName;
  }

  public void setTariffName(String tariffName) {
    this.tariffName = tariffName;
  }

  public OBBCAData1OtherFeesCharges otherTariffType(OtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
    return this;
  }

  /**
   * Get otherTariffType
   * @return otherTariffType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherTariffType getOtherTariffType() {
    return otherTariffType;
  }

  public void setOtherTariffType(OtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
  }

  public OBBCAData1OtherFeesCharges feeChargeDetail(List<OBBCAData1FeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public OBBCAData1OtherFeesCharges addFeeChargeDetailItem(OBBCAData1FeeChargeDetail feeChargeDetailItem) {
    this.feeChargeDetail.add(feeChargeDetailItem);
    return this;
  }

  /**
   * Other fees/charges details
   * @return feeChargeDetail
  **/
  @ApiModelProperty(required = true, value = "Other fees/charges details")
  @NotNull

  @Valid
@Size(min=1) 
  public List<OBBCAData1FeeChargeDetail> getFeeChargeDetail() {
    return feeChargeDetail;
  }

  public void setFeeChargeDetail(List<OBBCAData1FeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public OBBCAData1OtherFeesCharges feeChargeCap(List<OBBCAData1FeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OBBCAData1OtherFeesCharges addFeeChargeCapItem(OBBCAData1FeeChargeCap feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<OBBCAData1FeeChargeCap>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
   * @return feeChargeCap
  **/
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")

  @Valid

  public List<OBBCAData1FeeChargeCap> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<OBBCAData1FeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBCAData1OtherFeesCharges obBCAData1OtherFeesCharges = (OBBCAData1OtherFeesCharges) o;
    return Objects.equals(this.tariffType, obBCAData1OtherFeesCharges.tariffType) &&
        Objects.equals(this.tariffName, obBCAData1OtherFeesCharges.tariffName) &&
        Objects.equals(this.otherTariffType, obBCAData1OtherFeesCharges.otherTariffType) &&
        Objects.equals(this.feeChargeDetail, obBCAData1OtherFeesCharges.feeChargeDetail) &&
        Objects.equals(this.feeChargeCap, obBCAData1OtherFeesCharges.feeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tariffType, tariffName, otherTariffType, feeChargeDetail, feeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBCAData1OtherFeesCharges {\n");

    sb.append("    tariffType: ").append(toIndentedString(tariffType)).append("\n");
    sb.append("    tariffName: ").append(toIndentedString(tariffName)).append("\n");
    sb.append("    otherTariffType: ").append(toIndentedString(otherTariffType)).append("\n");
    sb.append("    feeChargeDetail: ").append(toIndentedString(feeChargeDetail)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
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

