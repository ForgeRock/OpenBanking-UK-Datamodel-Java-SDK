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
import java.util.Objects;

/**
 * Specific error details
 */
@ApiModel(description = "Specific error details")
public class OBError1 {

    @JsonProperty("ErrorCode")
    private String errorCode = null;
    @JsonProperty("Message")
    private String message = null;
    @JsonProperty("Path")
    private String path = null;
    @JsonProperty("Url")
    private String url = null;


    public OBError1 errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Low level textual error code, e.g., UK.OBIE.Field.Missing
     * @return error code
     **/
    @ApiModelProperty(required = true, value = "Low level textual error code, e.g., UK.OBIE.Field.Missing")
    @NotNull
    @Size(min=1,max=40)
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public OBError1 message(String message) {
        this.message = message;
        return this;
    }

    /**
     * A description of the error that occurred. e.g., 'A mandatory field isn't supplied' or 'RequestedExecutionDateTime must be in future'
     OBIE doesn't standardise this field
     * @return message
     **/
    @ApiModelProperty(required = true, value = "A description of the error that occurred. e.g., 'A mandatory field isn't supplied' or 'RequestedExecutionDateTime must be in future'\n" +
            "OBIE doesn't standardise this field")
    @NotNull
    @Size(min=1,max=256)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OBError1 path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency
     * @return path
     **/
    @ApiModelProperty(required = true, value = "Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency")
    @Size(min=1,max=256)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public OBError1 url(String url) {
        this.url = url;
        return this;
    }

    /**
     * 	URL to help remediate the problem, or provide more information, or to API Reference, or help etc
     * @return url
     **/
    @ApiModelProperty(required = true, value = "URL to help remediate the problem, or provide more information, or to API Reference, or help etc")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OBError1)) return false;
        OBError1 obError1 = (OBError1) o;
        return Objects.equals(errorCode, obError1.errorCode) &&
                Objects.equals(message, obError1.message) &&
                Objects.equals(path, obError1.path) &&
                Objects.equals(url, obError1.url);
    }

    @Override
    public int hashCode() {

        return Objects.hash(errorCode, message, path, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBError1 {\n");

        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
