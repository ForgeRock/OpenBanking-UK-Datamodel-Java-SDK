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

public class OBDomesticScheduledConverter {

    public static OBDomesticScheduled2 toOBDomesticScheduled2(OBDomesticScheduled1 domesticScheduled1) {
        return new OBDomesticScheduled2()
                .creditorAccount(domesticScheduled1.getCreditorAccount())
                .creditorPostalAddress(domesticScheduled1.getCreditorPostalAddress())
                .debtorAccount(domesticScheduled1.getDebtorAccount())
                .endToEndIdentification(domesticScheduled1.getEndToEndIdentification())
                .instructedAmount(domesticScheduled1.getInstructedAmount())
                .instructionIdentification(domesticScheduled1.getInstructionIdentification())
                .localInstrument(domesticScheduled1.getLocalInstrument())
                .remittanceInformation(domesticScheduled1.getRemittanceInformation())
                .requestedExecutionDateTime(domesticScheduled1.getRequestedExecutionDateTime());
    }

    public static OBDomesticScheduled1 toOBDomesticScheduled1(OBDomesticScheduled2 domesticScheduled2) {
        return new OBDomesticScheduled1()
                .creditorAccount(domesticScheduled2.getCreditorAccount())
                .creditorPostalAddress(domesticScheduled2.getCreditorPostalAddress())
                .debtorAccount(domesticScheduled2.getDebtorAccount())
                .endToEndIdentification(domesticScheduled2.getEndToEndIdentification())
                .instructedAmount(domesticScheduled2.getInstructedAmount())
                .instructionIdentification(domesticScheduled2.getInstructionIdentification())
                .localInstrument(domesticScheduled2.getLocalInstrument())
                .remittanceInformation(domesticScheduled2.getRemittanceInformation())
                .requestedExecutionDateTime(domesticScheduled2.getRequestedExecutionDateTime());
    }


    public static OBWriteDomesticScheduledConsent2 toOBWriteDomesticScheduledConsent2(OBWriteDomesticScheduledConsent1 obWriteDomesticScheduledConsent1) {
        return new OBWriteDomesticScheduledConsent2()
                .data(new OBWriteDataDomesticScheduledConsent2()
                        .authorisation(obWriteDomesticScheduledConsent1.getData().getAuthorisation())
                        .initiation(toOBDomesticScheduled2(obWriteDomesticScheduledConsent1.getData().getInitiation()))
                        .permission(obWriteDomesticScheduledConsent1.getData().getPermission())
                )
                .risk(obWriteDomesticScheduledConsent1.getRisk());
    }

    public static OBWriteDomesticScheduledConsent1 toOBWriteDomesticScheduledConsent1(OBWriteDomesticScheduledConsent2 obWriteDomesticScheduledConsent2) {
        return new OBWriteDomesticScheduledConsent1()
                .data(new OBWriteDataDomesticScheduledConsent1()
                        .authorisation(obWriteDomesticScheduledConsent2.getData().getAuthorisation())
                        .initiation(toOBDomesticScheduled1(obWriteDomesticScheduledConsent2.getData().getInitiation()))
                        .permission(obWriteDomesticScheduledConsent2.getData().getPermission())
                )
                .risk(obWriteDomesticScheduledConsent2.getRisk());
    }

    public static OBWriteDomesticScheduled2 toOBWriteDomesticScheduled2(OBWriteDomesticScheduled1 obWriteDomesticScheduled1) {
        return new OBWriteDomesticScheduled2()
                .data(new OBWriteDataDomesticScheduled2()
                        .consentId(obWriteDomesticScheduled1.getData().getConsentId())
                        .initiation(toOBDomesticScheduled2(obWriteDomesticScheduled1.getData().getInitiation()))
                )
                .risk(obWriteDomesticScheduled1.getRisk());
    }

    public static OBWriteDomesticScheduled1 toOBWriteDomesticScheduled1(OBWriteDomesticScheduled2 obWriteDomesticScheduled2) {
        return new OBWriteDomesticScheduled1()
                .data(new OBWriteDataDomesticScheduled1()
                        .consentId(obWriteDomesticScheduled2.getData().getConsentId())
                        .initiation(toOBDomesticScheduled1(obWriteDomesticScheduled2.getData().getInitiation()))
                )
                .risk(obWriteDomesticScheduled2.getRisk());
    }
}
