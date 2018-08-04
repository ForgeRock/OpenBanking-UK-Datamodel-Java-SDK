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

package uk.org.openbanking.datamodel.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

/**
 * Package the errors in a consistent format
 */
@ApiModel(description = "Package the errors in a consistent format")
public class OBErrorResponse1 {

    @JsonProperty("Code")
    private String code = null;
    @JsonProperty("Id")
    private String id = null;
    @JsonProperty("Message")
    private String message = null;
    @JsonProperty("Errors")
    private List<OBError1> errors = null;

    public OBErrorResponse1 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * High level textual error code, to help categorize the errors. An extendable list of generic codes.
     * @return code
     **/
    @ApiModelProperty(required = true, value = "High level textual error code, to help categorize the errors. An extendable list of generic codes.")
    @NotNull
    @Size(min=1,max=40)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OBErrorResponse1 id(String id) {
        this.id = id;
        return this;
    }

    /**
     * A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.
     * @return id
     **/
    @ApiModelProperty(required = true, value = "A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.")
    @Size(min=1,max=40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OBErrorResponse1 message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Brief Error message, e.g., 'There is something wrong with the request parameters provided'
     * @return message
     **/
    @ApiModelProperty(required = true, value = "Brief Error message, e.g., 'There is something wrong with the request parameters provided'")
    @NotNull
    @Size(min=1,max=256)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OBErrorResponse1 errors(List<OBError1> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * An array of detail error codes, and messages, and URLs to documentation to help remediation.
     * @return errors
     **/
    @ApiModelProperty(required = true, value = "An array of detail error codes, and messages, and URLs to documentation to help remediation.")
    @NotNull
    @Size(min=1)
    public List<OBError1> getErrors() {
        return errors;
    }

    public void setErrors(List<OBError1> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OBErrorResponse1)) return false;
        OBErrorResponse1 that = (OBErrorResponse1) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(id, that.id) &&
                Objects.equals(message, that.message) &&
                Objects.equals(errors, that.errors);
    }

    @Override
    public int hashCode() {

        return Objects.hash(code, id, message, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBErrorResponse1 {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
