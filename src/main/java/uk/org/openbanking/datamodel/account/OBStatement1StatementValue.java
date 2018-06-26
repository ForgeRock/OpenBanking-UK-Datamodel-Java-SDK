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
import java.util.Objects;

/**
 * Set of elements used to provide details of a generic number value related to the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a generic number value related to the statement resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBStatement1StatementValue   {
  @JsonProperty("Value")
  private Integer value = null;

  /**
   * Statement value type, in a coded form.
   */
  public enum TypeEnum {
    AIRMILESPOINTS("AirMilesPoints"),
    
    AIRMILESPOINTSBALANCE("AirMilesPointsBalance"),
    
    CREDITS("Credits"),
    
    DEBITS("Debits"),
    
    HOTELPOINTS("HotelPoints"),
    
    HOTELPOINTSBALANCE("HotelPointsBalance"),
    
    RETAILSHOPPINGPOINTS("RetailShoppingPoints"),
    
    RETAILSHOPPINGPOINTSBALANCE("RetailShoppingPointsBalance");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Type")
  private TypeEnum type = null;

  public OBStatement1StatementValue value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * Value associated with the statement value type.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Value associated with the statement value type.")
  @NotNull


  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public OBStatement1StatementValue type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Statement value type, in a coded form.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Statement value type, in a coded form.")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement1StatementValue obStatement1StatementValue = (OBStatement1StatementValue) o;
    return Objects.equals(this.value, obStatement1StatementValue.value) &&
        Objects.equals(this.type, obStatement1StatementValue.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement1StatementValue {\n");

    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

