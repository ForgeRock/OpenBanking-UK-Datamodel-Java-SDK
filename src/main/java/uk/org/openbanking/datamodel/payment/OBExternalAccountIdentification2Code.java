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
 *  Copyright 2018 ForgeRock AS.
 */
package uk.org.openbanking.datamodel.payment;

public enum OBExternalAccountIdentification2Code {
    /**
     * An identifier used internationally by financial institutions to uniquely identify the account of a customer at
     * a financial institution, as described in the latest edition of the international standard ISO 13616. “Banking
     * and related financial services – International Bank Account Number (IBAN)”.
     */
    IBAN("UK.OBIE.SortCodeAccountNumber"),
    /**
     * Sort Code and Account Number – identifier scheme used in the UK by financial institutions to identify the
     * account of a customer. The identifier is the concatenation of the 6 digit UK sort code and 8 digit account number.
     The regular expression for this identifier is: ^[0-9]{6}[0-9]{8}$
     */
    SortCodeAccountNumber("UK.OBIE.SortCodeAccountNumber");

    private String reference;

    OBExternalAccountIdentification2Code(String reference) {
        this.reference = reference;
    }

    /**
     * Get the Official reference like "UK.OBIE.SortCodeAccountNumber"
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * Parse from reference
     * @param reference the reference
     * @return null if not found
     */
    public static OBExternalAccountIdentification2Code valueOfReference(String reference) {
        for (OBExternalAccountIdentification2Code code : OBExternalAccountIdentification2Code.values()) {
            if (code.getReference().equals(reference)) {
                return code;
            }
        }
        return null;
    }
}
