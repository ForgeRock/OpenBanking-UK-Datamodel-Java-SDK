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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBBCAProductDetails1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBBCAProductDetails1 {

  @JsonProperty("Segment")
  @Valid
  private List<OBBCAProductSegment1Code> segment = null;

  @JsonProperty("FeeFreeLength")
  private Float feeFreeLength = null;

  @JsonProperty("FeeFreeLengthPeriod")
  private OBPeriod1Code feeFreeLengthPeriod = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  public OBBCAProductDetails1 segment(List<OBBCAProductSegment1Code> segment) {
    this.segment = segment;
    return this;
  }

  public OBBCAProductDetails1 addSegmentItem(OBBCAProductSegment1Code segmentItem) {
    if (this.segment == null) {
      this.segment = new ArrayList<OBBCAProductSegment1Code>();
    }
    this.segment.add(segmentItem);
    return this;
  }

  /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to BCA products, they are segmented in relation to different markets that they wish to focus on. 
   * @return segment
  **/
  @ApiModelProperty(value = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to BCA products, they are segmented in relation to different markets that they wish to focus on. ")


  public List<OBBCAProductSegment1Code> getSegment() {
    return segment;
  }

  public void setSegment(List<OBBCAProductSegment1Code> segment) {
    this.segment = segment;
  }

  public OBBCAProductDetails1 feeFreeLength(Float feeFreeLength) {
    this.feeFreeLength = feeFreeLength;
    return this;
  }

  /**
   * The length/duration of the fee free period
   * @return feeFreeLength
  **/
  @ApiModelProperty(value = "The length/duration of the fee free period")


  public Float getFeeFreeLength() {
    return feeFreeLength;
  }

  public void setFeeFreeLength(Float feeFreeLength) {
    this.feeFreeLength = feeFreeLength;
  }

  public OBBCAProductDetails1 feeFreeLengthPeriod(OBPeriod1Code feeFreeLengthPeriod) {
    this.feeFreeLengthPeriod = feeFreeLengthPeriod;
    return this;
  }

  /**
   * The unit of period (days, weeks, months etc.) of the promotional length
   * @return feeFreeLengthPeriod
  **/
  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the promotional length")


  public OBPeriod1Code getFeeFreeLengthPeriod() {
    return feeFreeLengthPeriod;
  }

  public void setFeeFreeLengthPeriod(OBPeriod1Code feeFreeLengthPeriod) {
    this.feeFreeLengthPeriod = feeFreeLengthPeriod;
  }

  public OBBCAProductDetails1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBBCAProductDetails1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Core product details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the Core product details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBCAProductDetails1 productDetails1 = (OBBCAProductDetails1) o;
    return Objects.equals(this.segment, productDetails1.segment) &&
        Objects.equals(this.feeFreeLength, productDetails1.feeFreeLength) &&
        Objects.equals(this.feeFreeLengthPeriod, productDetails1.feeFreeLengthPeriod) &&
        Objects.equals(this.notes, productDetails1.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment, feeFreeLength, feeFreeLengthPeriod, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBCAProductDetails1 {\n");

    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    feeFreeLength: ").append(toIndentedString(feeFreeLength)).append("\n");
    sb.append("    feeFreeLengthPeriod: ").append(toIndentedString(feeFreeLengthPeriod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

