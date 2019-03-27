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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OBExternalAccountIdentification4Code {

    /** Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer. */
    BBAN("UK.OBIE.BBAN"),

    /** An identifier used internationally by financial institutions to uniquely identify the account of a customer at a financial institution, as described in the latest edition of the international standard ISO 13616. "Banking and related financial services - International Bank Account Number (IBAN)". */
    IBAN("UK.OBIE.IBAN"),

    /** Primary Account Number - identifier scheme used to identify a card account. */
    PAN("UK.OBIE.PAN"),

    /** Sort Code and Account Number - identifier scheme used in the UK by financial institutions to identify the account of a customer. The identifier is the concatenation of the 6 digit UK sort code and 8 digit account number.*/
    SORTCODEACCOUNTNUMBER("UK.OBIE.SortCodeAccountNumber"),

    /** Paym Scheme to make payments via mobile */
    PAYM("UK.OBIE.Paym");

    private String value;

    OBExternalAccountIdentification4Code(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBExternalAccountIdentification4Code fromValue(String text) {
        for (OBExternalAccountIdentification4Code b : OBExternalAccountIdentification4Code.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
