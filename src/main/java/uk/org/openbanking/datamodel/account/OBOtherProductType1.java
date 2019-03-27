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
 * This field provides extension to the ProductType enumeration. If ProductType - \&quot;Other\&quot; is chosen, this field must be populated with name, and description for ASPSP specific product type.
 */
@ApiModel(description = "This field provides extension to the ProductType enumeration. If ProductType - \"Other\" is chosen, this field must be populated with name, and description for ASPSP specific product type.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBOtherProductType1   {
  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Description")
  private String description = null;

  public OBOtherProductType1 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of \"Other\" product type.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of \"Other\" product type.")
  @NotNull

@Size(min=1,max=350) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBOtherProductType1 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of \"Other\" product type.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of \"Other\" product type.")
  @NotNull

@Size(min=1,max=350) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBOtherProductType1 obOtherProductType1 = (OBOtherProductType1) o;
    return Objects.equals(this.name, obOtherProductType1.name) &&
        Objects.equals(this.description, obOtherProductType1.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBOtherProductType1 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

