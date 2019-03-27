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
import java.util.Objects;

/**
 * Set of elements to describe the card instrument used in the transaction.
 */
@ApiModel(description = "Set of elements to describe the card instrument used in the transaction.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBTransactionCardInstrument1   {
  @JsonProperty("CardSchemeName")
  private OBExternalCardSchemeType1Code cardSchemeName = null;

  @JsonProperty("AuthorisationType")
  private OBExternalCardAuthorisationType1Code authorisationType = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Identification")
  private String identification = null;

  public OBTransactionCardInstrument1 cardSchemeName(OBExternalCardSchemeType1Code cardSchemeName) {
    this.cardSchemeName = cardSchemeName;
    return this;
  }

  /**
   * Get cardSchemeName
   * @return cardSchemeName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalCardSchemeType1Code getCardSchemeName() {
    return cardSchemeName;
  }

  public void setCardSchemeName(OBExternalCardSchemeType1Code cardSchemeName) {
    this.cardSchemeName = cardSchemeName;
  }

  public OBTransactionCardInstrument1 authorisationType(OBExternalCardAuthorisationType1Code authorisationType) {
    this.authorisationType = authorisationType;
    return this;
  }

  /**
   * Get authorisationType
   * @return authorisationType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBExternalCardAuthorisationType1Code getAuthorisationType() {
    return authorisationType;
  }

  public void setAuthorisationType(OBExternalCardAuthorisationType1Code authorisationType) {
    this.authorisationType = authorisationType;
  }

  public OBTransactionCardInstrument1 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the cardholder using the card instrument.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the cardholder using the card instrument.")

@Size(min=1,max=70) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBTransactionCardInstrument1 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked.
   * @return identification
  **/
  @ApiModelProperty(value = "Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked.")

@Size(min=1,max=34) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTransactionCardInstrument1 obTransactionCardInstrument1 = (OBTransactionCardInstrument1) o;
    return Objects.equals(this.cardSchemeName, obTransactionCardInstrument1.cardSchemeName) &&
        Objects.equals(this.authorisationType, obTransactionCardInstrument1.authorisationType) &&
        Objects.equals(this.name, obTransactionCardInstrument1.name) &&
        Objects.equals(this.identification, obTransactionCardInstrument1.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardSchemeName, authorisationType, name, identification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransactionCardInstrument1 {\n");

    sb.append("    cardSchemeName: ").append(toIndentedString(cardSchemeName)).append("\n");
    sb.append("    authorisationType: ").append(toIndentedString(authorisationType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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

