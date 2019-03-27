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
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadTransaction4Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-28T11:14:51.272Z")

public class OBReadTransaction4Data   {
  @JsonProperty("Transaction")
  @Valid
  private List<OBTransaction4> transaction = null;

  public OBReadTransaction4Data transaction(List<OBTransaction4> transaction) {
    this.transaction = transaction;
    return this;
  }

  public OBReadTransaction4Data addTransactionItem(OBTransaction4 transactionItem) {
    if (this.transaction == null) {
      this.transaction = new ArrayList<OBTransaction4>();
    }
    this.transaction.add(transactionItem);
    return this;
  }

  /**
   * Provides further details on an entry in the report.
   * @return transaction
  **/
  @ApiModelProperty(value = "Provides further details on an entry in the report.")

  @Valid

  public List<OBTransaction4> getTransaction() {
    return transaction;
  }

  public void setTransaction(List<OBTransaction4> transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadTransaction4Data obReadTransaction4Data = (OBReadTransaction4Data) o;
    return Objects.equals(this.transaction, obReadTransaction4Data.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadTransaction4Data {\n");
    
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

