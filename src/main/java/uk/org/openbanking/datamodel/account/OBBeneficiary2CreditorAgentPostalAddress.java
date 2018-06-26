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

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Information that locates and identifies a specific address, as defined by postal services.
 */
@ApiModel(description = "Information that locates and identifies a specific address, as defined by postal services.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBBeneficiary2CreditorAgentPostalAddress   {
  /**
   * Identifies the nature of the postal address.
   */
  public enum AddressTypeEnum {
    BUSINESS("Business"),
    
    CORRESPONDENCE("Correspondence"),
    
    DELIVERYTO("DeliveryTo"),
    
    MAILTO("MailTo"),
    
    POBOX("POBox"),
    
    POSTAL("Postal"),
    
    RESIDENTIAL("Residential"),
    
    STATEMENT("Statement");

    private String value;

    AddressTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AddressTypeEnum fromValue(String text) {
      for (AddressTypeEnum b : AddressTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("AddressType")
  private AddressTypeEnum addressType = null;

  @JsonProperty("Department")
  private String department = null;

  @JsonProperty("SubDepartment")
  private String subDepartment = null;

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

  @JsonProperty("AddressLine")
  private String addressLine = null;

  public OBBeneficiary2CreditorAgentPostalAddress addressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Identifies the nature of the postal address.
   * @return addressType
  **/
  @ApiModelProperty(value = "Identifies the nature of the postal address.")


  public AddressTypeEnum getAddressType() {
    return addressType;
  }

  public void setAddressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
  }

  public OBBeneficiary2CreditorAgentPostalAddress department(String department) {
    this.department = department;
    return this;
  }

  /**
   * Identification of a division of a large organisation or building.
   * @return department
  **/
  @ApiModelProperty(value = "Identification of a division of a large organisation or building.")

@Size(min=1,max=70) 
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public OBBeneficiary2CreditorAgentPostalAddress subDepartment(String subDepartment) {
    this.subDepartment = subDepartment;
    return this;
  }

  /**
   * Identification of a sub-division of a large organisation or building.
   * @return subDepartment
  **/
  @ApiModelProperty(value = "Identification of a sub-division of a large organisation or building.")

@Size(min=1,max=70) 
  public String getSubDepartment() {
    return subDepartment;
  }

  public void setSubDepartment(String subDepartment) {
    this.subDepartment = subDepartment;
  }

  public OBBeneficiary2CreditorAgentPostalAddress streetName(String streetName) {
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

  public OBBeneficiary2CreditorAgentPostalAddress buildingNumber(String buildingNumber) {
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

  public OBBeneficiary2CreditorAgentPostalAddress postCode(String postCode) {
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

  public OBBeneficiary2CreditorAgentPostalAddress townName(String townName) {
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

  public OBBeneficiary2CreditorAgentPostalAddress countrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  /**
   * Identifies a subdivision of a country such as state, region, county.
   * @return countrySubDivision
  **/
  @ApiModelProperty(value = "Identifies a subdivision of a country such as state, region, county.")

@Size(min=1,max=35) 
  public String getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public OBBeneficiary2CreditorAgentPostalAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Nation with its own government.
   * @return country
  **/
  @ApiModelProperty(value = "Nation with its own government.")

@Pattern(regexp="^[A-Z]{2,2}$") 
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OBBeneficiary2CreditorAgentPostalAddress addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  /**
   * Information that locates and identifies a specific address, as defined by postal services, presented in free format text.
   * @return addressLine
  **/
  @ApiModelProperty(value = "Information that locates and identifies a specific address, as defined by postal services, presented in free format text.")

@Size(min=1,max=70) 
  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBeneficiary2CreditorAgentPostalAddress obBeneficiary2CreditorAgentPostalAddress = (OBBeneficiary2CreditorAgentPostalAddress) o;
    return Objects.equals(this.addressType, obBeneficiary2CreditorAgentPostalAddress.addressType) &&
        Objects.equals(this.department, obBeneficiary2CreditorAgentPostalAddress.department) &&
        Objects.equals(this.subDepartment, obBeneficiary2CreditorAgentPostalAddress.subDepartment) &&
        Objects.equals(this.streetName, obBeneficiary2CreditorAgentPostalAddress.streetName) &&
        Objects.equals(this.buildingNumber, obBeneficiary2CreditorAgentPostalAddress.buildingNumber) &&
        Objects.equals(this.postCode, obBeneficiary2CreditorAgentPostalAddress.postCode) &&
        Objects.equals(this.townName, obBeneficiary2CreditorAgentPostalAddress.townName) &&
        Objects.equals(this.countrySubDivision, obBeneficiary2CreditorAgentPostalAddress.countrySubDivision) &&
        Objects.equals(this.country, obBeneficiary2CreditorAgentPostalAddress.country) &&
        Objects.equals(this.addressLine, obBeneficiary2CreditorAgentPostalAddress.addressLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, department, subDepartment, streetName, buildingNumber, postCode, townName, countrySubDivision, country, addressLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBeneficiary2CreditorAgentPostalAddress {\n");

    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    subDepartment: ").append(toIndentedString(subDepartment)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
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

