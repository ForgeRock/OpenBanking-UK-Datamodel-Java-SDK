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
 * Postal address of a party.
 */
@ApiModel(description = "Postal address of a party.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBPostalAddress8   {
  @JsonProperty("AddressType")
  private OBAddressTypeCode addressType = null;

  @JsonProperty("AddressLine")
  @Valid
  private List<String> addressLine = null;

  @JsonProperty("StreetName")
  private String streetName = null;

  @JsonProperty("BuildingNumber")
  private String buildingNumber = null;

  @JsonProperty("PostCode")
  private String postCode = null;

  @JsonProperty("TownName")
  private String townName = null;

  @JsonProperty("CountrySubDivision")
  private String countrySubDivision = null;

  @JsonProperty("Country")
  private String country = null;

  public OBPostalAddress8 addressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBAddressTypeCode getAddressType() {
    return addressType;
  }

  public void setAddressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
  }

  public OBPostalAddress8 addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public OBPostalAddress8 addAddressLineItem(String addressLineItem) {
    if (this.addressLine == null) {
      this.addressLine = new ArrayList<String>();
    }
    this.addressLine.add(addressLineItem);
    return this;
  }

  /**
   * Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.
   * @return addressLine
  **/
  @ApiModelProperty(value = "Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.")

@Size(min=0,max=5) 
  public List<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }

  public OBPostalAddress8 streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of a street or thoroughfare.
   * @return streetName
  **/
  @ApiModelProperty(value = "Name of a street or thoroughfare.")

@Size(min=1,max=70) 
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public OBPostalAddress8 buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Number that identifies the position of a building on a street.
   * @return buildingNumber
  **/
  @ApiModelProperty(value = "Number that identifies the position of a building on a street.")

@Size(min=1,max=16) 
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public OBPostalAddress8 postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
   * @return postCode
  **/
  @ApiModelProperty(value = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.")

@Size(min=1,max=16) 
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public OBPostalAddress8 townName(String townName) {
    this.townName = townName;
    return this;
  }

  /**
   * Name of a built-up area, with defined boundaries, and a local government.
   * @return townName
  **/
  @ApiModelProperty(value = "Name of a built-up area, with defined boundaries, and a local government.")

@Size(min=1,max=35) 
  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public OBPostalAddress8 countrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  /**
   * Identifies a subdivision of a country eg, state, region, county.
   * @return countrySubDivision
  **/
  @ApiModelProperty(value = "Identifies a subdivision of a country eg, state, region, county.")

@Size(min=1,max=35) 
  public String getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public OBPostalAddress8 country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Nation with its own government, occupying a particular territory.
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Nation with its own government, occupying a particular territory.")
  @NotNull

@Pattern(regexp="^[A-Z]{2,2}$") 
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPostalAddress8 obPostalAddress8 = (OBPostalAddress8) o;
    return Objects.equals(this.addressType, obPostalAddress8.addressType) &&
        Objects.equals(this.addressLine, obPostalAddress8.addressLine) &&
        Objects.equals(this.streetName, obPostalAddress8.streetName) &&
        Objects.equals(this.buildingNumber, obPostalAddress8.buildingNumber) &&
        Objects.equals(this.postCode, obPostalAddress8.postCode) &&
        Objects.equals(this.townName, obPostalAddress8.townName) &&
        Objects.equals(this.countrySubDivision, obPostalAddress8.countrySubDivision) &&
        Objects.equals(this.country, obPostalAddress8.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, addressLine, streetName, buildingNumber, postCode, townName, countrySubDivision, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPostalAddress8 {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

