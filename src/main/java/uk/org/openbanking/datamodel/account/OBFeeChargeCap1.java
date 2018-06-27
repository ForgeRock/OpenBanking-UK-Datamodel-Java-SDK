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
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
 */
@ApiModel(description = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBFeeChargeCap1 {

  @JsonProperty("FeeType")
  @Valid
  private List<OBFeeType1Code> feeType = new ArrayList<OBFeeType1Code>();

  @JsonProperty("MinMaxType")
  private OBMinMaxType1Code minMaxType = null;

  @JsonProperty("FeeCapOccurrence")
  private Float feeCapOccurrence = null;

  @JsonProperty("FeeCapAmount")
  private String feeCapAmount = null;

  @JsonProperty("CappingPeriod")
  private OBPeriod1Code cappingPeriod = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherFeeType")
  @Valid
  private List<OBOtherCodeType1> otherFeeType = null;

  public OBFeeChargeCap1 feeType(List<OBFeeType1Code> feeType) {
    this.feeType = feeType;
    return this;
  }

  public OBFeeChargeCap1 addFeeTypeItem(OBFeeType1Code feeTypeItem) {
    this.feeType.add(feeTypeItem);
    return this;
  }

  /**
   * Fee/charge type which is being capped
   * @return feeType
  **/
  @ApiModelProperty(required = true, value = "Fee/charge type which is being capped")
  @NotNull

@Size(min=1) 
  public List<OBFeeType1Code> getFeeType() {
    return feeType;
  }

  public void setFeeType(List<OBFeeType1Code> feeType) {
    this.feeType = feeType;
  }

  public OBFeeChargeCap1 minMaxType(OBMinMaxType1Code minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

  /**
   * Min Max type
   * @return minMaxType
  **/
  @ApiModelProperty(required = true, value = "Min Max type")
  @NotNull


  public OBMinMaxType1Code getMinMaxType() {
    return minMaxType;
  }

  public void setMinMaxType(OBMinMaxType1Code minMaxType) {
    this.minMaxType = minMaxType;
  }

  public OBFeeChargeCap1 feeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

  /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
   * @return feeCapOccurrence
  **/
  @ApiModelProperty(value = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")


  public Float getFeeCapOccurrence() {
    return feeCapOccurrence;
  }

  public void setFeeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
  }

  public OBFeeChargeCap1 feeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

  /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeCapAmount
  **/
  @ApiModelProperty(value = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFeeCapAmount() {
    return feeCapAmount;
  }

  public void setFeeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public OBFeeChargeCap1 cappingPeriod(OBPeriod1Code cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
    return this;
  }

  /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   * @return cappingPeriod
  **/
  @ApiModelProperty(value = "Period e.g. day, week, month etc. for which the fee/charge is capped")


  public OBPeriod1Code getCappingPeriod() {
    return cappingPeriod;
  }

  public void setCappingPeriod(OBPeriod1Code cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
  }

  public OBFeeChargeCap1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBFeeChargeCap1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Free text for adding  extra details for fee charge cap
   * @return notes
  **/
  @ApiModelProperty(value = "Free text for adding  extra details for fee charge cap")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBFeeChargeCap1 otherFeeType(List<OBOtherCodeType1> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public OBFeeChargeCap1 addOtherFeeTypeItem(OBOtherCodeType1 otherFeeTypeItem) {
    if (this.otherFeeType == null) {
      this.otherFeeType = new ArrayList<OBOtherCodeType1>();
    }
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }

  /**
   * Other fee type code which is not available in the standard code set
   * @return otherFeeType
  **/
  @ApiModelProperty(value = "Other fee type code which is not available in the standard code set")

  @Valid

  public List<OBOtherCodeType1> getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(List<OBOtherCodeType1> otherFeeType) {
    this.otherFeeType = otherFeeType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBFeeChargeCap1 obBCAData1FeeChargeCap = (OBFeeChargeCap1) o;
    return Objects.equals(this.feeType, obBCAData1FeeChargeCap.feeType) &&
        Objects.equals(this.minMaxType, obBCAData1FeeChargeCap.minMaxType) &&
        Objects.equals(this.feeCapOccurrence, obBCAData1FeeChargeCap.feeCapOccurrence) &&
        Objects.equals(this.feeCapAmount, obBCAData1FeeChargeCap.feeCapAmount) &&
        Objects.equals(this.cappingPeriod, obBCAData1FeeChargeCap.cappingPeriod) &&
        Objects.equals(this.notes, obBCAData1FeeChargeCap.notes) &&
        Objects.equals(this.otherFeeType, obBCAData1FeeChargeCap.otherFeeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, minMaxType, feeCapOccurrence, feeCapAmount, cappingPeriod, notes, otherFeeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFeeChargeCap1 {\n");

    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
    sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
    sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
    sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
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

