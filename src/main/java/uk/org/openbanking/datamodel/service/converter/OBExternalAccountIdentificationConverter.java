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
package uk.org.openbanking.datamodel.service.converter;

import uk.org.openbanking.datamodel.account.OBExternalAccountIdentification3Code;
import uk.org.openbanking.datamodel.account.OBExternalAccountIdentification4Code;
import uk.org.openbanking.datamodel.payment.OBExternalAccountIdentification2Code;

public class OBExternalAccountIdentificationConverter {

    public static OBExternalAccountIdentification3Code toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code obExternalAccountIdentification4Code) {
        if (obExternalAccountIdentification4Code==null) {
            return null;
        }
        switch (obExternalAccountIdentification4Code) {
            case PAN:
                return OBExternalAccountIdentification3Code.PAN;
            case IBAN:
                return OBExternalAccountIdentification3Code.IBAN;
            case SORTCODEACCOUNTNUMBER:
                return OBExternalAccountIdentification3Code.SORTCODEACCOUNTNUMBER;
            case BBAN:
            case PAYM:
            default:
                return null;
        }
    }

    public static OBExternalAccountIdentification3Code toOBExternalAccountIdentification3(OBExternalAccountIdentification2Code obExternalAccountIdentification2Code) {
        if (obExternalAccountIdentification2Code==null) {
            return null;
        }
        switch (obExternalAccountIdentification2Code) {
            case SortCodeAccountNumber:
                return OBExternalAccountIdentification3Code.SORTCODEACCOUNTNUMBER;
            default:
                return OBExternalAccountIdentification3Code.IBAN; // Existing default behaviour on 1.1
        }
    }

    public static OBExternalAccountIdentification4Code toOBExternalAccountIdentification4(OBExternalAccountIdentification3Code obExternalAccountIdentification3Code) {
        if (obExternalAccountIdentification3Code==null) {
            return null;
        }
        switch (obExternalAccountIdentification3Code) {
            case SORTCODEACCOUNTNUMBER:
                return OBExternalAccountIdentification4Code.SORTCODEACCOUNTNUMBER;
            case PAN:
                return OBExternalAccountIdentification4Code.PAN;
            default:
                return OBExternalAccountIdentification4Code.IBAN;
        }
    }

    public static OBExternalAccountIdentification4Code toOBExternalAccountIdentification4(OBExternalAccountIdentification2Code obExternalAccountIdentification2Code) {
        if (obExternalAccountIdentification2Code==null) {
            return null;
        }
        switch (obExternalAccountIdentification2Code) {
            case SortCodeAccountNumber:
                return OBExternalAccountIdentification4Code.SORTCODEACCOUNTNUMBER;
            default:
                return OBExternalAccountIdentification4Code.IBAN;
        }
    }

}
