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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Provides overdraft details for a specific tier or band
 */
@ApiModel(description = "Provides overdraft details for a specific tier or band")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBOverdraftTierBand1 {
  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("TierValueMin")
  private String tierValueMin = null;

  @JsonProperty("TierValueMax")
  private String tierValueMax = null;

  @JsonProperty("EAR")
  private String EAR = null;

  @JsonProperty("AgreementLengthMin")
  private Float agreementLengthMin = null;

  @JsonProperty("AgreementLengthMax")
  private Float agreementLengthMax = null;

  @JsonProperty("AgreementPeriod")
  private OBPeriod1Code agreementPeriod = null;

  @JsonProperty("OverdraftInterestChargingCoverage")
  private OBTierBandType1Code overdraftInterestChargingCoverage = null;

  @JsonProperty("BankGuaranteedIndicator")
  private Boolean bankGuaranteedIndicator = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OverdraftFeesCharges")
  @Valid
  private List<OBOverdraftFeesCharges1> overdraftFeesCharges = null;

  public OBOverdraftTierBand1 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft.
   * @return identification
  **/
  @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a overdraft.")

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBOverdraftTierBand1 tierValueMin(String tierValueMin) {
    this.tierValueMin = tierValueMin;
    return this;
  }

  /**
   * Minimum value of Overdraft Tier/Band
   * @return tierValueMin
  **/
  @ApiModelProperty(required = true, value = "Minimum value of Overdraft Tier/Band")
  @NotNull

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getTierValueMin() {
    return tierValueMin;
  }

  public void setTierValueMin(String tierValueMin) {
    this.tierValueMin = tierValueMin;
  }

  public OBOverdraftTierBand1 tierValueMax(String tierValueMax) {
    this.tierValueMax = tierValueMax;
    return this;
  }

  /**
   * Maximum value of Overdraft Tier/Band
   * @return tierValueMax
  **/
  @ApiModelProperty(value = "Maximum value of Overdraft Tier/Band")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getTierValueMax() {
    return tierValueMax;
  }

  public void setTierValueMax(String tierValueMax) {
    this.tierValueMax = tierValueMax;
  }

  public OBOverdraftTierBand1 EAR(String EAR) {
    this.EAR = EAR;
    return this;
  }

  /**
   * EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.
   * @return EAR
  **/
  @ApiModelProperty(value = "EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.")

@Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$") 
  public String getEAR() {
    return EAR;
  }

  public void setEAR(String EAR) {
    this.EAR = EAR;
  }

  public OBOverdraftTierBand1 agreementLengthMin(Float agreementLengthMin) {
    this.agreementLengthMin = agreementLengthMin;
    return this;
  }

  /**
   * Specifies the minimum length of a band for a fixed overdraft agreement
   * @return agreementLengthMin
  **/
  @ApiModelProperty(value = "Specifies the minimum length of a band for a fixed overdraft agreement")


  public Float getAgreementLengthMin() {
    return agreementLengthMin;
  }

  public void setAgreementLengthMin(Float agreementLengthMin) {
    this.agreementLengthMin = agreementLengthMin;
  }

  public OBOverdraftTierBand1 agreementLengthMax(Float agreementLengthMax) {
    this.agreementLengthMax = agreementLengthMax;
    return this;
  }

  /**
   * Specifies the maximum length of a band for a fixed overdraft agreement
   * @return agreementLengthMax
  **/
  @ApiModelProperty(value = "Specifies the maximum length of a band for a fixed overdraft agreement")


  public Float getAgreementLengthMax() {
    return agreementLengthMax;
  }

  public void setAgreementLengthMax(Float agreementLengthMax) {
    this.agreementLengthMax = agreementLengthMax;
  }

  public OBOverdraftTierBand1 agreementPeriod(OBPeriod1Code agreementPeriod) {
    this.agreementPeriod = agreementPeriod;
    return this;
  }

  /**
   * Specifies the period of a fixed length overdraft agreement
   * @return agreementPeriod
  **/
  @ApiModelProperty(value = "Specifies the period of a fixed length overdraft agreement")


  public OBPeriod1Code getAgreementPeriod() {
    return agreementPeriod;
  }

  public void setAgreementPeriod(OBPeriod1Code agreementPeriod) {
    this.agreementPeriod = agreementPeriod;
  }

  public OBOverdraftTierBand1 overdraftInterestChargingCoverage(OBTierBandType1Code overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
    return this;
  }

  /**
   * Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is £2k and the interest tiers are:- 0-£500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the ‘Whole’ of the account balance,  and in the 2nd that it is ‘Tiered’.
   * @return overdraftInterestChargingCoverage
  **/
  @ApiModelProperty(value = "Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is £2k and the interest tiers are:- 0-£500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the ‘Whole’ of the account balance,  and in the 2nd that it is ‘Tiered’.")


  public OBTierBandType1Code getOverdraftInterestChargingCoverage() {
    return overdraftInterestChargingCoverage;
  }

  public void setOverdraftInterestChargingCoverage(OBTierBandType1Code overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
  }

  public OBOverdraftTierBand1 bankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
    return this;
  }

  /**
   * Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it’s part of a government scheme, or whether the rate may vary dependent on the applicant’s circumstances.
   * @return bankGuaranteedIndicator
  **/
  @ApiModelProperty(value = "Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it’s part of a government scheme, or whether the rate may vary dependent on the applicant’s circumstances.")


  public Boolean isBankGuaranteedIndicator() {
    return bankGuaranteedIndicator;
  }

  public void setBankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
  }

  public OBOverdraftTierBand1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBOverdraftTierBand1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Tier/band details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the Tier/band details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBOverdraftTierBand1 overdraftFeesCharges(List<OBOverdraftFeesCharges1> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public OBOverdraftTierBand1 addOverdraftFeesChargesItem(OBOverdraftFeesCharges1 overdraftFeesChargesItem) {
    if (this.overdraftFeesCharges == null) {
      this.overdraftFeesCharges = new ArrayList<OBOverdraftFeesCharges1>();
    }
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

  /**
   * Overdraft fees and charges
   * @return overdraftFeesCharges
  **/
  @ApiModelProperty(value = "Overdraft fees and charges")

  @Valid

  public List<OBOverdraftFeesCharges1> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<OBOverdraftFeesCharges1> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBOverdraftTierBand1 overdraft1OverdraftTierBand = (OBOverdraftTierBand1) o;
    return Objects.equals(this.identification, overdraft1OverdraftTierBand.identification) &&
        Objects.equals(this.tierValueMin, overdraft1OverdraftTierBand.tierValueMin) &&
        Objects.equals(this.tierValueMax, overdraft1OverdraftTierBand.tierValueMax) &&
        Objects.equals(this.EAR, overdraft1OverdraftTierBand.EAR) &&
        Objects.equals(this.agreementLengthMin, overdraft1OverdraftTierBand.agreementLengthMin) &&
        Objects.equals(this.agreementLengthMax, overdraft1OverdraftTierBand.agreementLengthMax) &&
        Objects.equals(this.agreementPeriod, overdraft1OverdraftTierBand.agreementPeriod) &&
        Objects.equals(this.overdraftInterestChargingCoverage, overdraft1OverdraftTierBand.overdraftInterestChargingCoverage) &&
        Objects.equals(this.bankGuaranteedIndicator, overdraft1OverdraftTierBand.bankGuaranteedIndicator) &&
        Objects.equals(this.notes, overdraft1OverdraftTierBand.notes) &&
        Objects.equals(this.overdraftFeesCharges, overdraft1OverdraftTierBand.overdraftFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, tierValueMin, tierValueMax, EAR, agreementLengthMin, agreementLengthMax, agreementPeriod, overdraftInterestChargingCoverage, bankGuaranteedIndicator, notes, overdraftFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBOverdraftTierBand1 {\n");

    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    tierValueMin: ").append(toIndentedString(tierValueMin)).append("\n");
    sb.append("    tierValueMax: ").append(toIndentedString(tierValueMax)).append("\n");
    sb.append("    EAR: ").append(toIndentedString(EAR)).append("\n");
    sb.append("    agreementLengthMin: ").append(toIndentedString(agreementLengthMin)).append("\n");
    sb.append("    agreementLengthMax: ").append(toIndentedString(agreementLengthMax)).append("\n");
    sb.append("    agreementPeriod: ").append(toIndentedString(agreementPeriod)).append("\n");
    sb.append("    overdraftInterestChargingCoverage: ").append(toIndentedString(overdraftInterestChargingCoverage)).append("\n");
    sb.append("    bankGuaranteedIndicator: ").append(toIndentedString(bankGuaranteedIndicator)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftFeesCharges: ").append(toIndentedString(overdraftFeesCharges)).append("\n");
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

