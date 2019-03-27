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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBWriteDataInternationalConsent2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-28T11:15:38.268Z")

public class OBWriteDataInternationalConsent2   {
  @JsonProperty("Initiation")
  private OBInternational2 initiation = null;

  @JsonProperty("Authorisation")
  private OBAuthorisation1 authorisation = null;

  public OBWriteDataInternationalConsent2 initiation(OBInternational2 initiation) {
    this.initiation = initiation;
    return this;
  }

  /**
   * Get initiation
   * @return initiation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBInternational2 getInitiation() {
    return initiation;
  }

  public void setInitiation(OBInternational2 initiation) {
    this.initiation = initiation;
  }

  public OBWriteDataInternationalConsent2 authorisation(OBAuthorisation1 authorisation) {
    this.authorisation = authorisation;
    return this;
  }

  /**
   * Get authorisation
   * @return authorisation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBAuthorisation1 getAuthorisation() {
    return authorisation;
  }

  public void setAuthorisation(OBAuthorisation1 authorisation) {
    this.authorisation = authorisation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteDataInternationalConsent2 obWriteDataInternationalConsent2 = (OBWriteDataInternationalConsent2) o;
    return Objects.equals(this.initiation, obWriteDataInternationalConsent2.initiation) &&
        Objects.equals(this.authorisation, obWriteDataInternationalConsent2.authorisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initiation, authorisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDataInternationalConsent2 {\n");

    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
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

