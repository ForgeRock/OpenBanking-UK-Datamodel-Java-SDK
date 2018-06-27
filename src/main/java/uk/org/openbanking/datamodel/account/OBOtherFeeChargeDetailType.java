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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Other Fee/charge type which is not available in the standard code set
 */
@ApiModel(description = "Other Fee/charge type which is not available in the standard code set")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBOtherFeeChargeDetailType {
  @JsonProperty("Code")
  private String code = null;

  @JsonProperty("FeeCategory")
  private OBFeeCategory1Code feeCategory = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Description")
  private String description = null;

  public OBOtherFeeChargeDetailType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The four letter Mnemonic used within an XML file to identify a code
   * @return code
  **/
  @ApiModelProperty(value = "The four letter Mnemonic used within an XML file to identify a code")

@Pattern(regexp="^\\w{0,4}$") @Size(min=0,max=4) 
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OBOtherFeeChargeDetailType feeCategory(OBFeeCategory1Code feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

  /**
   * Categorisation of fees and charges into standard categories.
   * @return feeCategory
  **/
  @ApiModelProperty(required = true, value = "Categorisation of fees and charges into standard categories.")
  @NotNull


  public OBFeeCategory1Code getFeeCategory() {
    return feeCategory;
  }

  public void setFeeCategory(OBFeeCategory1Code feeCategory) {
    this.feeCategory = feeCategory;
  }

  public OBOtherFeeChargeDetailType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Long name associated with the code
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Long name associated with the code")
  @NotNull

@Size(min=1,max=70) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBOtherFeeChargeDetailType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description to describe the purpose of the code
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description to describe the purpose of the code")
  @NotNull

@Size(min=1,max=350) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBOtherFeeChargeDetailType otherFeeType1 = (OBOtherFeeChargeDetailType) o;
    return Objects.equals(this.code, otherFeeType1.code) &&
        Objects.equals(this.feeCategory, otherFeeType1.feeCategory) &&
        Objects.equals(this.name, otherFeeType1.name) &&
        Objects.equals(this.description, otherFeeType1.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, feeCategory, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBOtherFeeChargeDetailType {\n");

    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

