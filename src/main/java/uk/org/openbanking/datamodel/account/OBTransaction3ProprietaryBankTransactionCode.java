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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Set of elements to fully identify a proprietary bank transaction code.
 */
@ApiModel(description = "Set of elements to fully identify a proprietary bank transaction code.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBTransaction3ProprietaryBankTransactionCode   {
  @JsonProperty("Code")
  private String code = null;

  @JsonProperty("Issuer")
  private String issuer = null;

  public OBTransaction3ProprietaryBankTransactionCode code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Proprietary bank transaction code to identify the underlying transaction.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Proprietary bank transaction code to identify the underlying transaction.")
  @NotNull

@Size(min=1,max=35) 
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OBTransaction3ProprietaryBankTransactionCode issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Identification of the issuer of the proprietary bank transaction code.
   * @return issuer
  **/
  @ApiModelProperty(value = "Identification of the issuer of the proprietary bank transaction code.")

@Size(min=1,max=35) 
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTransaction3ProprietaryBankTransactionCode obTransaction3ProprietaryBankTransactionCode = (OBTransaction3ProprietaryBankTransactionCode) o;
    return Objects.equals(this.code, obTransaction3ProprietaryBankTransactionCode.code) &&
        Objects.equals(this.issuer, obTransaction3ProprietaryBankTransactionCode.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, issuer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransaction3ProprietaryBankTransactionCode {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

