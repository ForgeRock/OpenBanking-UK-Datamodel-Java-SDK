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
 *  Copyright 2017 ForgeRock AS.
 *
 */

package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.datamodel.payment.OBExternalAccountIdentification2Code;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Provides the details to identify an account.
 */
@ApiModel(description = "Provides the details to identify an account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class OBCashAccount1 {
  @JsonProperty("SchemeName")
  private OBExternalAccountIdentification2Code schemeName = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("SecondaryIdentification")
  private String secondaryIdentification = null;

  public OBCashAccount1 schemeName(OBExternalAccountIdentification2Code schemeName) {
    this.schemeName = schemeName;
    return this;
  }

   /**
   * Name of the identification scheme, in a coded form as published in an external list.
   * @return schemeName
  **/
  @ApiModelProperty(required = true, value = "Name of the identification scheme, in a coded form as published in an external list.")
  @NotNull


  public OBExternalAccountIdentification2Code getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(OBExternalAccountIdentification2Code schemeName) {
    this.schemeName = schemeName;
  }

  public OBCashAccount1 identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Identification assigned by an institution to identify an account. This identification is known by the account owner.
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Identification assigned by an institution to identify an account. This identification is known by the account owner.")
  @NotNull

 @Size(min=1,max=34)
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBCashAccount1 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account. Usage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account. Usage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number.")

 @Size(min=1,max=70)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBCashAccount1 secondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }

   /**
   * This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).
   * @return secondaryIdentification
  **/
  @ApiModelProperty(value = "This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).")

 @Size(min=1,max=34)
  public String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCashAccount1 data2Account = (OBCashAccount1) o;
    return Objects.equals(this.schemeName, data2Account.schemeName) &&
        Objects.equals(this.identification, data2Account.identification) &&
        Objects.equals(this.name, data2Account.name) &&
        Objects.equals(this.secondaryIdentification, data2Account.secondaryIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, secondaryIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data2Account {\n");

    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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

