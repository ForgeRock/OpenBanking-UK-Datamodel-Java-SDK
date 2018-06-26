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
 * OBAccount2Detail
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBAccount2Detail   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("Currency")
  private String currency = null;

  /**
   * Specifies the type of account (personal or business).
   */
  public enum AccountTypeEnum {
    BUSINESS("Business"),
    
    PERSONAL("Personal");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountTypeEnum fromValue(String text) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("AccountType")
  private AccountTypeEnum accountType = null;

  /**
   * Specifies the sub type of account (product family group).
   */
  public enum AccountSubTypeEnum {
    CHARGECARD("ChargeCard"),
    
    CREDITCARD("CreditCard"),
    
    CURRENTACCOUNT("CurrentAccount"),
    
    EMONEY("EMoney"),
    
    LOAN("Loan"),
    
    MORTGAGE("Mortgage"),
    
    PREPAIDCARD("PrePaidCard"),
    
    SAVINGS("Savings");

    private String value;

    AccountSubTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountSubTypeEnum fromValue(String text) {
      for (AccountSubTypeEnum b : AccountSubTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("AccountSubType")
  private AccountSubTypeEnum accountSubType = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Nickname")
  private String nickname = null;

  @JsonProperty("Account")
  @Valid
  private List<OBAccount2Account> account = null;

  @JsonProperty("Servicer")
  private OBAccount2Servicer servicer = null;

  public OBAccount2Detail accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  @NotNull

@Size(min=1,max=40) 
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBAccount2Detail currency(String currency) {
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

  public OBAccount2Detail accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Specifies the type of account (personal or business).
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "Specifies the type of account (personal or business).")
  @NotNull


  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public OBAccount2Detail accountSubType(AccountSubTypeEnum accountSubType) {
    this.accountSubType = accountSubType;
    return this;
  }

  /**
   * Specifies the sub type of account (product family group).
   * @return accountSubType
  **/
  @ApiModelProperty(required = true, value = "Specifies the sub type of account (product family group).")
  @NotNull


  public AccountSubTypeEnum getAccountSubType() {
    return accountSubType;
  }

  public void setAccountSubType(AccountSubTypeEnum accountSubType) {
    this.accountSubType = accountSubType;
  }

  public OBAccount2Detail description(String description) {
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

  public OBAccount2Detail nickname(String nickname) {
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

  public OBAccount2Detail account(List<OBAccount2Account> account) {
    this.account = account;
    return this;
  }

  public OBAccount2Detail addAccountItem(OBAccount2Account accountItem) {
    if (this.account == null) {
      this.account = new ArrayList<OBAccount2Account>();
    }
    this.account.add(accountItem);
    return this;
  }

  /**
   * Provides the details to identify an account.
   * @return account
  **/
  @ApiModelProperty(value = "Provides the details to identify an account.")

  @Valid

  public List<OBAccount2Account> getAccount() {
    return account;
  }

  public void setAccount(List<OBAccount2Account> account) {
    this.account = account;
  }

  public OBAccount2Detail servicer(OBAccount2Servicer servicer) {
    this.servicer = servicer;
    return this;
  }

  /**
   * Get servicer
   * @return servicer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBAccount2Servicer getServicer() {
    return servicer;
  }

  public void setServicer(OBAccount2Servicer servicer) {
    this.servicer = servicer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAccount2Detail obAccount2Detail = (OBAccount2Detail) o;
    return Objects.equals(this.accountId, obAccount2Detail.accountId) &&
        Objects.equals(this.currency, obAccount2Detail.currency) &&
        Objects.equals(this.accountType, obAccount2Detail.accountType) &&
        Objects.equals(this.accountSubType, obAccount2Detail.accountSubType) &&
        Objects.equals(this.description, obAccount2Detail.description) &&
        Objects.equals(this.nickname, obAccount2Detail.nickname) &&
        Objects.equals(this.account, obAccount2Detail.account) &&
        Objects.equals(this.servicer, obAccount2Detail.servicer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, currency, accountType, accountSubType, description, nickname, account, servicer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount2Detail {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
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

