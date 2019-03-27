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
 * The group of tiers or bands for which credit interest can be applied.
 */
@ApiModel(description = "The group of tiers or bands for which credit interest can be applied.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBTierBandSet1 {

  @JsonProperty("TierBandMethod")
  private OBTierBandType1Code tierBandMethod = null;

  @JsonProperty("CalculationMethod")
  private OBInterestCalculationMethod1Code calculationMethod = null;

  @JsonProperty("Destination")
  private OBInterestDestination1Code destination = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("TierBand")
  @Valid
  private List<OBTierBand1> tierBand = new ArrayList<OBTierBand1>();

  public OBTierBandSet1 tierBandMethod(OBTierBandType1Code tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }

  /**
   * The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the BCA balance
   * @return tierBandMethod
  **/
  @ApiModelProperty(required = true, value = "The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the BCA balance")
  @NotNull


  public OBTierBandType1Code getTierBandMethod() {
    return tierBandMethod;
  }

  public void setTierBandMethod(OBTierBandType1Code tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }

  public OBTierBandSet1 calculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

  /**
   * Methods of calculating interest
   * @return calculationMethod
  **/
  @ApiModelProperty(value = "Methods of calculating interest")


  public OBInterestCalculationMethod1Code getCalculationMethod() {
    return calculationMethod;
  }

  public void setCalculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public OBTierBandSet1 destination(OBInterestDestination1Code destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Describes whether accrued interest is payable only to the BCA or to another bank account
   * @return destination
  **/
  @ApiModelProperty(required = true, value = "Describes whether accrued interest is payable only to the BCA or to another bank account")
  @NotNull


  public OBInterestDestination1Code getDestination() {
    return destination;
  }

  public void setDestination(OBInterestDestination1Code destination) {
    this.destination = destination;
  }

  public OBTierBandSet1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBTierBandSet1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Tier Band Set details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band Set details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBTierBandSet1 tierBand(List<OBTierBand1> tierBand) {
    this.tierBand = tierBand;
    return this;
  }

  public OBTierBandSet1 addTierBandItem(OBTierBand1 tierBandItem) {
    this.tierBand.add(tierBandItem);
    return this;
  }

  /**
   * Tier Band Details
   * @return tierBand
  **/
  @ApiModelProperty(required = true, value = "Tier Band Details")
  @NotNull

  @Valid
@Size(min=1) 
  public List<OBTierBand1> getTierBand() {
    return tierBand;
  }

  public void setTierBand(List<OBTierBand1> tierBand) {
    this.tierBand = tierBand;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTierBandSet1 creditInterest1TierBandSet = (OBTierBandSet1) o;
    return Objects.equals(this.tierBandMethod, creditInterest1TierBandSet.tierBandMethod) &&
        Objects.equals(this.calculationMethod, creditInterest1TierBandSet.calculationMethod) &&
        Objects.equals(this.destination, creditInterest1TierBandSet.destination) &&
        Objects.equals(this.notes, creditInterest1TierBandSet.notes) &&
        Objects.equals(this.tierBand, creditInterest1TierBandSet.tierBand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandMethod, calculationMethod, destination, notes, tierBand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTierBandSet1 {\n");

    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    tierBand: ").append(toIndentedString(tierBand)).append("\n");
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

