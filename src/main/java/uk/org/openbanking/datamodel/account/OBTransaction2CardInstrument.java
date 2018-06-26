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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Set of elements to describe the card instrument used in the transaction.
 */
@ApiModel(description = "Set of elements to describe the card instrument used in the transaction.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBTransaction2CardInstrument   {
  /**
   * Name of the card scheme.
   */
  public enum CardSchemeNameEnum {
    AMERICANEXPRESS("AmericanExpress"),
    
    DINERS("Diners"),
    
    DISCOVER("Discover"),
    
    MASTERCARD("MasterCard"),
    
    VISA("VISA");

    private String value;

    CardSchemeNameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CardSchemeNameEnum fromValue(String text) {
      for (CardSchemeNameEnum b : CardSchemeNameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("CardSchemeName")
  private CardSchemeNameEnum cardSchemeName = null;

  /**
   * The card authorisation type.
   */
  public enum AuthorisationTypeEnum {
    CONTACTLESS("Contactless"),
    
    NONE("None"),
    
    PIN("PIN");

    private String value;

    AuthorisationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AuthorisationTypeEnum fromValue(String text) {
      for (AuthorisationTypeEnum b : AuthorisationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("AuthorisationType")
  private AuthorisationTypeEnum authorisationType = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Identification")
  private String identification = null;

  public OBTransaction2CardInstrument cardSchemeName(CardSchemeNameEnum cardSchemeName) {
    this.cardSchemeName = cardSchemeName;
    return this;
  }

  /**
   * Name of the card scheme.
   * @return cardSchemeName
  **/
  @ApiModelProperty(required = true, value = "Name of the card scheme.")
  @NotNull


  public CardSchemeNameEnum getCardSchemeName() {
    return cardSchemeName;
  }

  public void setCardSchemeName(CardSchemeNameEnum cardSchemeName) {
    this.cardSchemeName = cardSchemeName;
  }

  public OBTransaction2CardInstrument authorisationType(AuthorisationTypeEnum authorisationType) {
    this.authorisationType = authorisationType;
    return this;
  }

  /**
   * The card authorisation type.
   * @return authorisationType
  **/
  @ApiModelProperty(value = "The card authorisation type.")


  public AuthorisationTypeEnum getAuthorisationType() {
    return authorisationType;
  }

  public void setAuthorisationType(AuthorisationTypeEnum authorisationType) {
    this.authorisationType = authorisationType;
  }

  public OBTransaction2CardInstrument name(String name) {
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

  public OBTransaction2CardInstrument identification(String identification) {
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
    OBTransaction2CardInstrument obTransaction2CardInstrument = (OBTransaction2CardInstrument) o;
    return Objects.equals(this.cardSchemeName, obTransaction2CardInstrument.cardSchemeName) &&
        Objects.equals(this.authorisationType, obTransaction2CardInstrument.authorisationType) &&
        Objects.equals(this.name, obTransaction2CardInstrument.name) &&
        Objects.equals(this.identification, obTransaction2CardInstrument.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardSchemeName, authorisationType, name, identification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransaction2CardInstrument {\n");

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

