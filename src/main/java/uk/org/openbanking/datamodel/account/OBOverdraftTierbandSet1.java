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
 * Tier band set details
 */
@ApiModel(description = "Tier band set details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBOverdraftTierbandSet1 {

  @JsonProperty("TierBandMethod")
  private OBTierBandType1Code tierBandMethod = null;

  @JsonProperty("OverdraftType")
  private OBOverdraftType1Code overdraftType = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("AuthorisedIndicator")
  private Boolean authorisedIndicator = null;

  @JsonProperty("BufferAmount")
  private String bufferAmount = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OverdraftTierBand")
  @Valid
  private List<OBOverdraftTierBand1> overdraftTierBand = new ArrayList<OBOverdraftTierBand1>();

  @JsonProperty("OverdraftFeesCharges")
  @Valid
  private List<OBOverdraftFeesCharges1> overdraftFeesCharges = null;

  public OBOverdraftTierbandSet1 tierBandMethod(OBTierBandType1Code tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }

  /**
   * The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
   * @return tierBandMethod
  **/
  @ApiModelProperty(required = true, value = "The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.")
  @NotNull


  public OBTierBandType1Code getTierBandMethod() {
    return tierBandMethod;
  }

  public void setTierBandMethod(OBTierBandType1Code tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }

  public OBOverdraftTierbandSet1 overdraftType(OBOverdraftType1Code overdraftType) {
    this.overdraftType = overdraftType;
    return this;
  }

  /**
   * An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.
   * @return overdraftType
  **/
  @ApiModelProperty(value = "An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.")


  public OBOverdraftType1Code getOverdraftType() {
    return overdraftType;
  }

  public void setOverdraftType(OBOverdraftType1Code overdraftType) {
    this.overdraftType = overdraftType;
  }

  public OBOverdraftTierbandSet1 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft product.
   * @return identification
  **/
  @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a overdraft product.")

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBOverdraftTierbandSet1 authorisedIndicator(Boolean authorisedIndicator) {
    this.authorisedIndicator = authorisedIndicator;
    return this;
  }

  /**
   * Indicates if the Overdraft is authorised (Y) or unauthorised (N)
   * @return authorisedIndicator
  **/
  @ApiModelProperty(value = "Indicates if the Overdraft is authorised (Y) or unauthorised (N)")


  public Boolean isAuthorisedIndicator() {
    return authorisedIndicator;
  }

  public void setAuthorisedIndicator(Boolean authorisedIndicator) {
    this.authorisedIndicator = authorisedIndicator;
  }

  public OBOverdraftTierbandSet1 bufferAmount(String bufferAmount) {
    this.bufferAmount = bufferAmount;
    return this;
  }

  /**
   * When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.
   * @return bufferAmount
  **/
  @ApiModelProperty(value = "When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getBufferAmount() {
    return bufferAmount;
  }

  public void setBufferAmount(String bufferAmount) {
    this.bufferAmount = bufferAmount;
  }

  public OBOverdraftTierbandSet1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBOverdraftTierbandSet1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the overdraft Tier Band Set details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the overdraft Tier Band Set details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBOverdraftTierbandSet1 overdraftTierBand(List<OBOverdraftTierBand1> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
    return this;
  }

  public OBOverdraftTierbandSet1 addOverdraftTierBandItem(OBOverdraftTierBand1 overdraftTierBandItem) {
    this.overdraftTierBand.add(overdraftTierBandItem);
    return this;
  }

  /**
   * Provides overdraft details for a specific tier or band
   * @return overdraftTierBand
  **/
  @ApiModelProperty(required = true, value = "Provides overdraft details for a specific tier or band")
  @NotNull

  @Valid
@Size(min=1) 
  public List<OBOverdraftTierBand1> getOverdraftTierBand() {
    return overdraftTierBand;
  }

  public void setOverdraftTierBand(List<OBOverdraftTierBand1> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
  }

  public OBOverdraftTierbandSet1 overdraftFeesCharges(List<OBOverdraftFeesCharges1> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public OBOverdraftTierbandSet1 addOverdraftFeesChargesItem(OBOverdraftFeesCharges1 overdraftFeesChargesItem) {
    if (this.overdraftFeesCharges == null) {
      this.overdraftFeesCharges = new ArrayList<OBOverdraftFeesCharges1>();
    }
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

  /**
   * Overdraft fees and charges details
   * @return overdraftFeesCharges
  **/
  @ApiModelProperty(value = "Overdraft fees and charges details")

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
    OBOverdraftTierbandSet1 overdraft1OverdraftTierBandSet = (OBOverdraftTierbandSet1) o;
    return Objects.equals(this.tierBandMethod, overdraft1OverdraftTierBandSet.tierBandMethod) &&
        Objects.equals(this.overdraftType, overdraft1OverdraftTierBandSet.overdraftType) &&
        Objects.equals(this.identification, overdraft1OverdraftTierBandSet.identification) &&
        Objects.equals(this.authorisedIndicator, overdraft1OverdraftTierBandSet.authorisedIndicator) &&
        Objects.equals(this.bufferAmount, overdraft1OverdraftTierBandSet.bufferAmount) &&
        Objects.equals(this.notes, overdraft1OverdraftTierBandSet.notes) &&
        Objects.equals(this.overdraftTierBand, overdraft1OverdraftTierBandSet.overdraftTierBand) &&
        Objects.equals(this.overdraftFeesCharges, overdraft1OverdraftTierBandSet.overdraftFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandMethod, overdraftType, identification, authorisedIndicator, bufferAmount, notes, overdraftTierBand, overdraftFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBOverdraftTierbandSet1 {\n");

    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
    sb.append("    overdraftType: ").append(toIndentedString(overdraftType)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    authorisedIndicator: ").append(toIndentedString(authorisedIndicator)).append("\n");
    sb.append("    bufferAmount: ").append(toIndentedString(bufferAmount)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftTierBand: ").append(toIndentedString(overdraftTierBand)).append("\n");
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

