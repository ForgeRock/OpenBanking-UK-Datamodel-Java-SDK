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
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details about the fees/charges
 */
@ApiModel(description = "Details about the fees/charges")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBOverdraftFeesChargeDetails1 {

  @JsonProperty("FeeType")
  private OBOverdraftFeeType1Code feeType = null;

  @JsonProperty("NegotiableIndicator")
  private Boolean negotiableIndicator = null;

  @JsonProperty("OverdraftControlIndicator")
  private Boolean overdraftControlIndicator = null;

  @JsonProperty("IncrementalBorrowingAmount")
  private String incrementalBorrowingAmount = null;

  @JsonProperty("FeeAmount")
  private String feeAmount = null;

  @JsonProperty("FeeRate")
  private String feeRate = null;

  @JsonProperty("FeeRateType")
  private OBInterestRateType1Code feeRateType = null;

  @JsonProperty("ApplicationFrequency")
  private OBFeeFrequency1Code applicationFrequency = null;

  @JsonProperty("CalculationFrequency")
  private OBFeeFrequency1Code calculationFrequency = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OverdraftFeeChargeCap")
  @Valid
  private List<OBOverdraftFeeChargeCap1> overdraftFeeChargeCap = null;

  @JsonProperty("OtherFeeType")
  private OBOtherCodeType1 otherFeeType = null;

  @JsonProperty("OtherFeeRateType")
  private OBOtherCodeType1 otherFeeRateType = null;

  @JsonProperty("OtherApplicationFrequency")
  private OBOtherCodeType1 otherApplicationFrequency = null;

  @JsonProperty("OtherCalculationFrequency")
  private OBOtherCodeType1 otherCalculationFrequency = null;

  public OBOverdraftFeesChargeDetails1 feeType(OBOverdraftFeeType1Code feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Overdraft fee type
   * @return feeType
  **/
  @ApiModelProperty(required = true, value = "Overdraft fee type")
  @NotNull


  public OBOverdraftFeeType1Code getFeeType() {
    return feeType;
  }

  public void setFeeType(OBOverdraftFeeType1Code feeType) {
    this.feeType = feeType;
  }

  public OBOverdraftFeesChargeDetails1 negotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
    return this;
  }

  /**
   * Indicates whether fee and charges are negotiable
   * @return negotiableIndicator
  **/
  @ApiModelProperty(value = "Indicates whether fee and charges are negotiable")


  public Boolean isNegotiableIndicator() {
    return negotiableIndicator;
  }

  public void setNegotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
  }

  public OBOverdraftFeesChargeDetails1 overdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
    return this;
  }

  /**
   * Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.
   * @return overdraftControlIndicator
  **/
  @ApiModelProperty(value = "Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.")


  public Boolean isOverdraftControlIndicator() {
    return overdraftControlIndicator;
  }

  public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
  }

  public OBOverdraftFeesChargeDetails1 incrementalBorrowingAmount(String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
    return this;
  }

  /**
   * Every additional tranche of an overdraft balance to which an overdraft fee is applied
   * @return incrementalBorrowingAmount
  **/
  @ApiModelProperty(value = "Every additional tranche of an overdraft balance to which an overdraft fee is applied")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getIncrementalBorrowingAmount() {
    return incrementalBorrowingAmount;
  }

  public void setIncrementalBorrowingAmount(String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
  }

  public OBOverdraftFeesChargeDetails1 feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

  /**
   * Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
  **/
  @ApiModelProperty(value = "Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public OBOverdraftFeesChargeDetails1 feeRate(String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

  /**
   * Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
  **/
  @ApiModelProperty(value = "Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")

@Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public OBOverdraftFeesChargeDetails1 feeRateType(OBInterestRateType1Code feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

  /**
   * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRateType
  **/
  @ApiModelProperty(value = "Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")


  public OBInterestRateType1Code getFeeRateType() {
    return feeRateType;
  }

  public void setFeeRateType(OBInterestRateType1Code feeRateType) {
    this.feeRateType = feeRateType;
  }

  public OBOverdraftFeesChargeDetails1 applicationFrequency(OBFeeFrequency1Code applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * Frequency at which the overdraft charge is applied to the account
   * @return applicationFrequency
  **/
  @ApiModelProperty(required = true, value = "Frequency at which the overdraft charge is applied to the account")
  @NotNull


  public OBFeeFrequency1Code getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(OBFeeFrequency1Code applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OBOverdraftFeesChargeDetails1 calculationFrequency(OBFeeFrequency1Code calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * How often is the overdraft fee/charge calculated for the account.
   * @return calculationFrequency
  **/
  @ApiModelProperty(value = "How often is the overdraft fee/charge calculated for the account.")


  public OBFeeFrequency1Code getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(OBFeeFrequency1Code calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OBOverdraftFeesChargeDetails1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBOverdraftFeesChargeDetails1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Free text for capturing any other info related to Overdraft Fees Charge Details
   * @return notes
  **/
  @ApiModelProperty(value = "Free text for capturing any other info related to Overdraft Fees Charge Details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBOverdraftFeesChargeDetails1 overdraftFeeChargeCap(List<OBOverdraftFeeChargeCap1> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OBOverdraftFeesChargeDetails1 addOverdraftFeeChargeCapItem(OBOverdraftFeeChargeCap1 overdraftFeeChargeCapItem) {
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

  public OBOverdraftFeesChargeDetails1 otherFeeType(OBOtherCodeType1 otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBOtherCodeType1 getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OBOtherCodeType1 otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OBOverdraftFeesChargeDetails1 otherFeeRateType(OBOtherCodeType1 otherFeeRateType) {
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

  public OBOverdraftFeesChargeDetails1 otherApplicationFrequency(OBOtherCodeType1 otherApplicationFrequency) {
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

  public OBOverdraftFeesChargeDetails1 otherCalculationFrequency(OBOtherCodeType1 otherCalculationFrequency) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBOverdraftFeesChargeDetails1 overdraft1OverdraftFeeChargeDetail = (OBOverdraftFeesChargeDetails1) o;
    return Objects.equals(this.feeType, overdraft1OverdraftFeeChargeDetail.feeType) &&
        Objects.equals(this.negotiableIndicator, overdraft1OverdraftFeeChargeDetail.negotiableIndicator) &&
        Objects.equals(this.overdraftControlIndicator, overdraft1OverdraftFeeChargeDetail.overdraftControlIndicator) &&
        Objects.equals(this.incrementalBorrowingAmount, overdraft1OverdraftFeeChargeDetail.incrementalBorrowingAmount) &&
        Objects.equals(this.feeAmount, overdraft1OverdraftFeeChargeDetail.feeAmount) &&
        Objects.equals(this.feeRate, overdraft1OverdraftFeeChargeDetail.feeRate) &&
        Objects.equals(this.feeRateType, overdraft1OverdraftFeeChargeDetail.feeRateType) &&
        Objects.equals(this.applicationFrequency, overdraft1OverdraftFeeChargeDetail.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, overdraft1OverdraftFeeChargeDetail.calculationFrequency) &&
        Objects.equals(this.notes, overdraft1OverdraftFeeChargeDetail.notes) &&
        Objects.equals(this.overdraftFeeChargeCap, overdraft1OverdraftFeeChargeDetail.overdraftFeeChargeCap) &&
        Objects.equals(this.otherFeeType, overdraft1OverdraftFeeChargeDetail.otherFeeType) &&
        Objects.equals(this.otherFeeRateType, overdraft1OverdraftFeeChargeDetail.otherFeeRateType) &&
        Objects.equals(this.otherApplicationFrequency, overdraft1OverdraftFeeChargeDetail.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, overdraft1OverdraftFeeChargeDetail.otherCalculationFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, negotiableIndicator, overdraftControlIndicator, incrementalBorrowingAmount, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, overdraftFeeChargeCap, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBOverdraftFeesChargeDetails1 {\n");

    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
    sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
    sb.append("    incrementalBorrowingAmount: ").append(toIndentedString(incrementalBorrowingAmount)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
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

