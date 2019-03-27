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
package uk.org.openbanking.datamodel.service.converter.payment;

import uk.org.openbanking.datamodel.payment.*;

public class OBDomesticConverter {

    public static OBDomestic2 toOBDomestic2(OBDomestic1 domestic1) {
        return new OBDomestic2()
                .creditorAccount(domestic1.getCreditorAccount())
                .creditorPostalAddress(domestic1.getCreditorPostalAddress())
                .debtorAccount(domestic1.getDebtorAccount())
                .endToEndIdentification(domestic1.getEndToEndIdentification())
                .instructedAmount(domestic1.getInstructedAmount())
                .instructionIdentification(domestic1.getInstructionIdentification())
                .localInstrument(domestic1.getLocalInstrument())
                .remittanceInformation(domestic1.getRemittanceInformation());
    }

    public static OBDomestic1 toOBDomestic1(OBDomestic2 domestic2) {
        return new OBDomestic1()
                .creditorAccount(domestic2.getCreditorAccount())
                .creditorPostalAddress(domestic2.getCreditorPostalAddress())
                .debtorAccount(domestic2.getDebtorAccount())
                .endToEndIdentification(domestic2.getEndToEndIdentification())
                .instructedAmount(domestic2.getInstructedAmount())
                .instructionIdentification(domestic2.getInstructionIdentification())
                .localInstrument(domestic2.getLocalInstrument())
                .remittanceInformation(domestic2.getRemittanceInformation());
    }

    public static OBWriteDomesticConsent2 toOBWriteDomesticConsent2(OBWriteDomesticConsent1 obWriteDomesticConsent1) {
        return new OBWriteDomesticConsent2()
                .data(new OBWriteDataDomesticConsent2()
                        .authorisation(obWriteDomesticConsent1.getData().getAuthorisation())
                        .initiation(toOBDomestic2(obWriteDomesticConsent1.getData().getInitiation()))
                )
                .risk(obWriteDomesticConsent1.getRisk());
    }

    public static OBWriteDomesticConsent1 toOBWriteDomesticConsent1(OBWriteDomesticConsent2 obWriteDomesticConsent2) {
        return new OBWriteDomesticConsent1()
                .data(new OBWriteDataDomesticConsent1()
                        .authorisation(obWriteDomesticConsent2.getData().getAuthorisation())
                        .initiation(toOBDomestic1(obWriteDomesticConsent2.getData().getInitiation()))
                )
                .risk(obWriteDomesticConsent2.getRisk());
    }

    public static OBWriteDomestic2 toOBWriteDomestic2(OBWriteDomestic1 obWriteDomestic1) {
        return new OBWriteDomestic2()
                .data(new OBWriteDataDomestic2()
                        .consentId(obWriteDomestic1.getData().getConsentId())
                        .initiation(toOBDomestic2(obWriteDomestic1.getData().getInitiation()))
                )
                .risk(obWriteDomestic1.getRisk());
    }

    public static OBWriteDomestic1 toOBWriteDomestic1(OBWriteDomestic2 obWriteDomestic2) {
        return new OBWriteDomestic1()
                .data(new OBWriteDataDomestic1()
                        .consentId(obWriteDomestic2.getData().getConsentId())
                        .initiation(toOBDomestic1(obWriteDomestic2.getData().getInitiation()))
                )
                .risk(obWriteDomestic2.getRisk());
    }
}
