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
 *  Copyright 2018 ForgeRock AS.
 */
package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
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
 * OBParty1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBParty1   {
  @JsonProperty("PartyId")
  private String partyId = null;

  @JsonProperty("PartyNumber")
  private String partyNumber = null;

  @JsonProperty("PartyType")
  private OBExternalPartyType1Code partyType = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("EmailAddress")
  private String emailAddress = null;

  @JsonProperty("Phone")
  private String phone = null;

  @JsonProperty("Mobile")
  private String mobile = null;

  @JsonProperty("Address")
  @Valid
  private List<OBPostalAddress8> address = null;

  public OBParty1 partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.
   * @return partyId
  **/
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.")
  @NotNull

@Size(min=1,max=40) 
  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public OBParty1 partyNumber(String partyNumber) {
    this.partyNumber = partyNumber;
    return this;
  }

  /**
   * Number assigned by an agent to identify its customer.
   * @return partyNumber
  **/
  @ApiModelProperty(value = "Number assigned by an agent to identify its customer.")

@Size(min=1,max=35) 
  public String getPartyNumber() {
    return partyNumber;
  }

  public void setPartyNumber(String partyNumber) {
    this.partyNumber = partyNumber;
  }

  public OBParty1 partyType(OBExternalPartyType1Code partyType) {
    this.partyType = partyType;
    return this;
  }

  /**
   * Get partyType
   * @return partyType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBExternalPartyType1Code getPartyType() {
    return partyType;
  }

  public void setPartyType(OBExternalPartyType1Code partyType) {
    this.partyType = partyType;
  }

  public OBParty1 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name by which a party is known and which is usually used to identify that party.
   * @return name
  **/
  @ApiModelProperty(value = "Name by which a party is known and which is usually used to identify that party.")

@Size(min=1,max=70) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBParty1 emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Address for electronic mail (e-mail).
   * @return emailAddress
  **/
  @ApiModelProperty(value = "Address for electronic mail (e-mail).")

@Size(min=1,max=256) 
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public OBParty1 phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Collection of information that identifies a phone number, as defined by telecom services.
   * @return phone
  **/
  @ApiModelProperty(value = "Collection of information that identifies a phone number, as defined by telecom services.")

@Pattern(regexp="\\+[0-9]{1,3}-[0-9()+\\-]{1,30}") 
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public OBParty1 mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * Collection of information that identifies a mobile phone number, as defined by telecom services.
   * @return mobile
  **/
  @ApiModelProperty(value = "Collection of information that identifies a mobile phone number, as defined by telecom services.")

@Pattern(regexp="\\+[0-9]{1,3}-[0-9()+\\-]{1,30}") 
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public OBParty1 address(List<OBPostalAddress8> address) {
    this.address = address;
    return this;
  }

  public OBParty1 addAddressItem(OBPostalAddress8 addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<OBPostalAddress8>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * Postal address of a party.
   * @return address
  **/
  @ApiModelProperty(value = "Postal address of a party.")

  @Valid

  public List<OBPostalAddress8> getAddress() {
    return address;
  }

  public void setAddress(List<OBPostalAddress8> address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBParty1 obParty1 = (OBParty1) o;
    return Objects.equals(this.partyId, obParty1.partyId) &&
        Objects.equals(this.partyNumber, obParty1.partyNumber) &&
        Objects.equals(this.partyType, obParty1.partyType) &&
        Objects.equals(this.name, obParty1.name) &&
        Objects.equals(this.emailAddress, obParty1.emailAddress) &&
        Objects.equals(this.phone, obParty1.phone) &&
        Objects.equals(this.mobile, obParty1.mobile) &&
        Objects.equals(this.address, obParty1.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, partyNumber, partyType, name, emailAddress, phone, mobile, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBParty1 {\n");
    
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    partyNumber: ").append(toIndentedString(partyNumber)).append("\n");
    sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

