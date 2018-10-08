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
package uk.org.openbanking.datamodel.service.converter;

import uk.org.openbanking.datamodel.account.*;
import uk.org.openbanking.datamodel.payment.OBExternalAccountIdentification2Code;


public class OBCashAccountConverter {

    /**
     * Convert cash account from V3 to V1
     * @param cashAccount3 cash account in V3 format
     * @return cash account in V1 format
     */
    public static OBCashAccount1 toOBCashAccount1(OBCashAccount3 cashAccount3) {
        return new OBCashAccount1()
                .identification(cashAccount3.getIdentification())
                .name(cashAccount3.getName())
                .schemeName(OBExternalAccountIdentification2Code.valueOf(cashAccount3.getSchemeName()))
                .secondaryIdentification(cashAccount3.getSecondaryIdentification());
    }

    /**
     * Convert cash account from V3 to V2
     * @param cashAccount3 cash account in V3 format
     * @return cash account in V2 format
     */
    public static OBCashAccount2 toOBCashAccount2(OBCashAccount3 cashAccount3) {
        return new OBCashAccount2()
                .identification(cashAccount3.getIdentification())
                .name(cashAccount3.getName())
                .schemeName(OBExternalAccountIdentification3Code.valueOf(cashAccount3.getSchemeName()))
                .secondaryIdentification(cashAccount3.getSecondaryIdentification());
    }

    /**
     * Convert cash account from V1 to V3
     * @param cashAccount1 cash account in V1 format
     * @return cash account in V3 format
     */
    public static OBCashAccount3 toOBCashAccount3(OBCashAccount1 cashAccount1) {
        return new OBCashAccount3()
                .identification(cashAccount1.getIdentification())
                .name(cashAccount1.getName())
                .schemeName(cashAccount1.getSchemeName().toString())
                .secondaryIdentification(cashAccount1.getSecondaryIdentification());
    }
}
