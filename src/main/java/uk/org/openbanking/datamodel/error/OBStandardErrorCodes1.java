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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OBStandardErrorCodes1 implements StandardErrorCode {

    UK_OBIE_FIELD_EXPECTED("UK.OBIE.Field.Expected"),
    UK_OBIE_FIELD_INVALID("UK.OBIE.Field.Invalid"),
    UK_OBIE_FIELD_INVALID_DATE("UK.OBIE.Field.InvalidDate"),
    UK_OBIE_FIELD_MISSING("UK.OBIE.Field.Missing"),
    UK_OBIE_FIELD_UNEXPECTED("UK.OBIE.Field.Unexpected"),

    UK_OBIE_HEADER_INVALID("UK.OBIE.Header.Invalid"),
    UK_OBIE_HEADER_MISSING("UK.OBIE.Header.Missing"),

    UK_OBIE_PARAMETER_INVALID("UK.OBIE.Parameter.Invalid"),
    UK_OBIE_PARAMETER_MISSING("UK.OBIE.Parameter.Missing"),

    UK_OBIE_RESOURCE_CONSENT_MISMATCH("UK.OBIE.Resource.ConsentMismatch"),
    UK_OBIE_RESOURCE_INVALID_CONSENT_STATUS("UK.OBIE.Resource.InvalidConsentStatus"),
    UK_OBIE_RESOURCE_INVALID_FORMAT("UK.OBIE.Resource.InvalidFormat"),
    UK_OBIE_RESOURCE_NOT_FOUND("UK.OBIE.Resource.NotFound"),

    UK_OBIE_RULES_AFTER_CUT_OFF_DATE_TIME("UK.OBIE.rules.AfterCutOffDateTime"),

    UK_OBIE_SIGNATURE_INVALID("UK.OBIE.Signature.Invalid"),
    UK_OBIE_SIGNATURE_INVALID_CLAIM("UK.OBIE.Signature.InvalidClaim"),
    UK_OBIE_SIGNATURE_MISSING_CLAIM("UK.OBIE.Signature.MissingClaim"),
    UK_OBIE_SIGNATURE_MALFORMED("UK.OBIE.Signature.Malformed"),
    UK_OBIE_SIGNATURE_MISSING("UK.OBIE.Signature.Missing"),
    UK_OBIE_SIGNATURE_UNEXPECTED("UK.OBIE.Signature.Unexpected"),

    UK_OBIE_UNSUPPORTED_ACCOUNT_IDENTIFIER("UK.OBIE.Unsupported.AccountIdentifier"),
    UK_OBIE_UNSUPPORTED_ACCOUNT_SECONDARY_IDENTIFIER("UK.OBIE.Unsupported.AccountSecondaryIdentifier"),
    UK_OBIE_UNSUPPORTED_CURRENCY("UK.OBIE.Unsupported.Currency"),
    UK_OBIE_UNSUPPORTED_FREQUENCY("UK.OBIE.Unsupported.Frequency"),
    UK_OBIE_UNSUPPORTED_LOCAL_INSTRUMENT("UK.OBIE.Unsupported.LocalInstrument"),
    UK_OBIE_UNSUPPORTED_SCHEME("UK.OBIE.Unsupported.Scheme"),
    UK_OBIE_UNSUPPORTED_UNEXPECTED_ERROR("UK.OBIE.Unsupported.UnexpectedError"),
    ;

    private String value;

    OBStandardErrorCodes1(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static OBStandardErrorCodes1 fromValue(String text) {
        for (OBStandardErrorCodes1 b : OBStandardErrorCodes1.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}