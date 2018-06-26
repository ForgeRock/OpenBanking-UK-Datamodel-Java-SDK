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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Other fees/charges details
 */
@ApiModel(description = "Other fees/charges details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBBCAData1FeeChargeDetail   {

  @JsonProperty("FeeCategory")
  private OBFeeCategory1Code feeCategory = null;

  @JsonProperty("FeeType")
  private OBFeeType1Code feeType = null;

  @JsonProperty("NegotiableIndicator")
  private Boolean negotiableIndicator = null;

  @JsonProperty("FeeAmount")
  private String feeAmount = null;

  @JsonProperty("FeeRate")
  private String feeRate = null;

  @JsonProperty("FeeRateType")
  private FeeRateType feeRateType = null;

  @JsonProperty("ApplicationFrequency")
  private OBFeeFrequency1Code applicationFrequency = null;

  @JsonProperty("CalculationFrequency")
  private OBFeeFrequency1Code calculationFrequency = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("FeeChargeCap")
  @Valid
  private List<OBFeeChargeCap1> feeChargeCap = null;

  @JsonProperty("OtherFeeCategoryType")
  private OBOtherCodeType1 otherFeeCategoryType = null;

  @JsonProperty("OtherFeeType")
  private OBOtherFeeChargeDetailType otherFeeType = null;

  @JsonProperty("OtherFeeRateType")
  private OBOtherCodeType1 otherFeeRateType = null;

  @JsonProperty("OtherApplicationFrequency")
  private OBOtherCodeType1 otherApplicationFrequency = null;

  @JsonProperty("OtherCalculationFrequency")
  private OBOtherCodeType1 otherCalculationFrequency = null;

  @JsonProperty("OBFeeApplicableRange1")
  private OBFeeApplicableRange1 feeApplicableRange = null;

  public OBBCAData1FeeChargeDetail feeCategory(OBFeeCategory1Code feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

  /**
   * Categorisation of fees and charges into standard categories.
   * @return feeCategory
  **/
  @ApiModelProperty(required = true, value = "Categorisation of fees and charges into standard categories.")
  @NotNull


  public OBFeeCategory1Code getFeeCategory() {
    return feeCategory;
  }

  public void setFeeCategory(OBFeeCategory1Code feeCategory) {
    this.feeCategory = feeCategory;
  }

  public OBBCAData1FeeChargeDetail feeType(OBFeeType1Code feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Fee/Charge Type
   * @return feeType
  **/
  @ApiModelProperty(required = true, value = "Fee/Charge Type")
  @NotNull


  public OBFeeType1Code getFeeType() {
    return feeType;
  }

  public void setFeeType(OBFeeType1Code feeType) {
    this.feeType = feeType;
  }

  public OBBCAData1FeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
    return this;
  }

  /**
   * Fee/charge which is usually negotiable rather than a fixed amount
   * @return negotiableIndicator
  **/
  @ApiModelProperty(value = "Fee/charge which is usually negotiable rather than a fixed amount")


  public Boolean isNegotiableIndicator() {
    return negotiableIndicator;
  }

  public void setNegotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
  }

  public OBBCAData1FeeChargeDetail feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

  /**
   * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
  **/
  @ApiModelProperty(value = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public OBBCAData1FeeChargeDetail feeRate(String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

  /**
   * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
  **/
  @ApiModelProperty(value = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)")

@Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public OBBCAData1FeeChargeDetail feeRateType(FeeRateType feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

  /**
   * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRateType
  **/
  @ApiModelProperty(value = "Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)")


  public FeeRateType getFeeRateType() {
    return feeRateType;
  }

  public void setFeeRateType(FeeRateType feeRateType) {
    this.feeRateType = feeRateType;
  }

  public OBBCAData1FeeChargeDetail applicationFrequency(OBFeeFrequency1Code applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * How frequently the fee/charge is applied to the account
   * @return applicationFrequency
  **/
  @ApiModelProperty(required = true, value = "How frequently the fee/charge is applied to the account")
  @NotNull


  public OBFeeFrequency1Code getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(OBFeeFrequency1Code applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OBBCAData1FeeChargeDetail calculationFrequency(OBFeeFrequency1Code calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * How frequently the fee/charge is calculated
   * @return calculationFrequency
  **/
  @ApiModelProperty(value = "How frequently the fee/charge is calculated")


  public OBFeeFrequency1Code getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(OBFeeFrequency1Code calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OBBCAData1FeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBBCAData1FeeChargeDetail addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the fee/charge details.
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the fee/charge details.")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBBCAData1FeeChargeDetail feeChargeCap(List<OBFeeChargeCap1> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OBBCAData1FeeChargeDetail addFeeChargeCapItem(OBFeeChargeCap1 feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<OBFeeChargeCap1>();
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

  public List<OBFeeChargeCap1> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<OBFeeChargeCap1> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  public OBBCAData1FeeChargeDetail otherFeeCategoryType(OBOtherCodeType1 otherFeeCategoryType) {
    this.otherFeeCategoryType = otherFeeCategoryType;
    return this;
  }

  /**
   * Get otherFeeCategoryType
   * @return otherFeeCategoryType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBOtherCodeType1 getOtherFeeCategoryType() {
    return otherFeeCategoryType;
  }

  public void setOtherFeeCategoryType(OBOtherCodeType1 otherFeeCategoryType) {
    this.otherFeeCategoryType = otherFeeCategoryType;
  }

  public OBBCAData1FeeChargeDetail otherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBOtherFeeChargeDetailType getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OBBCAData1FeeChargeDetail otherFeeRateType(OBOtherCodeType1 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

  /**
   * Get otherFeeRateType
   * @return otherFeeRateType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBOtherCodeType1 getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OBOtherCodeType1 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public OBBCAData1FeeChargeDetail otherApplicationFrequency(OBOtherCodeType1 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

  /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBOtherCodeType1 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OBOtherCodeType1 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public OBBCAData1FeeChargeDetail otherCalculationFrequency(OBOtherCodeType1 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

  /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBOtherCodeType1 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OBOtherCodeType1 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public OBBCAData1FeeChargeDetail feeApplicableRange(OBFeeApplicableRange1 feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
    return this;
  }

  /**
   * Get feeApplicableRange
   * @return feeApplicableRange
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBFeeApplicableRange1 getFeeApplicableRange() {
    return feeApplicableRange;
  }

  public void setFeeApplicableRange(OBFeeApplicableRange1 feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBCAData1FeeChargeDetail obBCAData1FeeChargeDetail = (OBBCAData1FeeChargeDetail) o;
    return Objects.equals(this.feeCategory, obBCAData1FeeChargeDetail.feeCategory) &&
        Objects.equals(this.feeType, obBCAData1FeeChargeDetail.feeType) &&
        Objects.equals(this.negotiableIndicator, obBCAData1FeeChargeDetail.negotiableIndicator) &&
        Objects.equals(this.feeAmount, obBCAData1FeeChargeDetail.feeAmount) &&
        Objects.equals(this.feeRate, obBCAData1FeeChargeDetail.feeRate) &&
        Objects.equals(this.feeRateType, obBCAData1FeeChargeDetail.feeRateType) &&
        Objects.equals(this.applicationFrequency, obBCAData1FeeChargeDetail.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, obBCAData1FeeChargeDetail.calculationFrequency) &&
        Objects.equals(this.notes, obBCAData1FeeChargeDetail.notes) &&
        Objects.equals(this.feeChargeCap, obBCAData1FeeChargeDetail.feeChargeCap) &&
        Objects.equals(this.otherFeeCategoryType, obBCAData1FeeChargeDetail.otherFeeCategoryType) &&
        Objects.equals(this.otherFeeType, obBCAData1FeeChargeDetail.otherFeeType) &&
        Objects.equals(this.otherFeeRateType, obBCAData1FeeChargeDetail.otherFeeRateType) &&
        Objects.equals(this.otherApplicationFrequency, obBCAData1FeeChargeDetail.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, obBCAData1FeeChargeDetail.otherCalculationFrequency) &&
        Objects.equals(this.feeApplicableRange, obBCAData1FeeChargeDetail.feeApplicableRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeCategory, feeType, negotiableIndicator, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, feeChargeCap, otherFeeCategoryType, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency, feeApplicableRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBCAData1FeeChargeDetail {\n");

    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
    sb.append("    otherFeeCategoryType: ").append(toIndentedString(otherFeeCategoryType)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    feeApplicableRange: ").append(toIndentedString(feeApplicableRange)).append("\n");
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

