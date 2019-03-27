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
import java.util.Objects;

/**
 * Unambiguous identification of the account to which credit and debit entries are made.
 */
@ApiModel(description = "Unambiguous identification of the account to which credit and debit entries are made.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBAccount2Basic   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("Currency")
  private String currency = null;

  @JsonProperty("AccountType")
  private OBExternalAccountType1Code accountType = null;

  @JsonProperty("AccountSubType")
  private OBExternalAccountSubType1Code accountSubType = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Nickname")
  private String nickname = null;

  public OBAccount2Basic accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBAccount2Basic currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.")
  @NotNull

@Pattern(regexp="^[A-Z]{3,3}$") 
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OBAccount2Basic accountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalAccountType1Code getAccountType() {
    return accountType;
  }

  public void setAccountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
  }

  public OBAccount2Basic accountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
    return this;
  }

  /**
   * Get accountSubType
   * @return accountSubType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalAccountSubType1Code getAccountSubType() {
    return accountSubType;
  }

  public void setAccountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
  }

  public OBAccount2Basic description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Specifies the description of the account type.
   * @return description
  **/
  @ApiModelProperty(value = "Specifies the description of the account type.")

@Size(min=1,max=35) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBAccount2Basic nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.
   * @return nickname
  **/
  @ApiModelProperty(value = "The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.")

@Size(min=1,max=70) 
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAccount2Basic obAccount2Basic = (OBAccount2Basic) o;
    return Objects.equals(this.accountId, obAccount2Basic.accountId) &&
        Objects.equals(this.currency, obAccount2Basic.currency) &&
        Objects.equals(this.accountType, obAccount2Basic.accountType) &&
        Objects.equals(this.accountSubType, obAccount2Basic.accountSubType) &&
        Objects.equals(this.description, obAccount2Basic.description) &&
        Objects.equals(this.nickname, obAccount2Basic.nickname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, currency, accountType, accountSubType, description, nickname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount2Basic {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
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

