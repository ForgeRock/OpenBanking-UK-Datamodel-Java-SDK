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

public class OBInternationalScheduledConverter {

    public static OBInternationalScheduled2 toOBInternationalScheduled2(OBInternationalScheduled1 obInternationalScheduled1) {
        return new OBInternationalScheduled2()
                .creditorAccount(obInternationalScheduled1.getCreditorAccount())
                .debtorAccount(obInternationalScheduled1.getDebtorAccount())
                .endToEndIdentification(obInternationalScheduled1.getEndToEndIdentification())
                .instructedAmount(obInternationalScheduled1.getInstructedAmount())
                .instructionIdentification(obInternationalScheduled1.getInstructionIdentification())
                .localInstrument(obInternationalScheduled1.getLocalInstrument())
                .remittanceInformation(obInternationalScheduled1.getRemittanceInformation())
                .chargeBearer(obInternationalScheduled1.getChargeBearer())
                .creditor(obInternationalScheduled1.getCreditor())
                .creditorAgent(obInternationalScheduled1.getCreditorAgent())
                .currencyOfTransfer(obInternationalScheduled1.getCurrencyOfTransfer())
                .exchangeRateInformation(obInternationalScheduled1.getExchangeRateInformation())
                .instructionPriority(obInternationalScheduled1.getInstructionPriority())
                .requestedExecutionDateTime(obInternationalScheduled1.getRequestedExecutionDateTime())
                ;
    }


    public static OBInternationalScheduled1 toOBInternationalScheduled1(OBInternationalScheduled2 obInternationalScheduled2) {
        return new OBInternationalScheduled1()
                .creditorAccount(obInternationalScheduled2.getCreditorAccount())
                .debtorAccount(obInternationalScheduled2.getDebtorAccount())
                .endToEndIdentification(obInternationalScheduled2.getEndToEndIdentification())
                .instructedAmount(obInternationalScheduled2.getInstructedAmount())
                .instructionIdentification(obInternationalScheduled2.getInstructionIdentification())
                .localInstrument(obInternationalScheduled2.getLocalInstrument())
                .remittanceInformation(obInternationalScheduled2.getRemittanceInformation())
                .chargeBearer(obInternationalScheduled2.getChargeBearer())
                .creditor(obInternationalScheduled2.getCreditor())
                .creditorAgent(obInternationalScheduled2.getCreditorAgent())
                .currencyOfTransfer(obInternationalScheduled2.getCurrencyOfTransfer())
                .exchangeRateInformation(obInternationalScheduled2.getExchangeRateInformation())
                .instructionPriority(obInternationalScheduled2.getInstructionPriority())
                .requestedExecutionDateTime(obInternationalScheduled2.getRequestedExecutionDateTime())
                ;
    }

    public static OBWriteInternationalScheduledConsent2 toOBWriteInternationalScheduledConsent2(OBWriteInternationalScheduledConsent1 obWriteInternationalScheduledConsent1) {
        return new OBWriteInternationalScheduledConsent2()
                .data(new OBWriteDataInternationalScheduledConsent2()
                        .authorisation(obWriteInternationalScheduledConsent1.getData().getAuthorisation())
                        .initiation(toOBInternationalScheduled2(obWriteInternationalScheduledConsent1.getData().getInitiation()))
                )
                .risk(obWriteInternationalScheduledConsent1.getRisk());
    }

    public static OBWriteInternationalScheduledConsent1 toOBWriteInternationalScheduledConsent1(OBWriteInternationalScheduledConsent2 obWriteInternationalScheduledConsent2) {
        return new OBWriteInternationalScheduledConsent1()
                .data(new OBWriteDataInternationalScheduledConsent1()
                        .authorisation(obWriteInternationalScheduledConsent2.getData().getAuthorisation())
                        .initiation(toOBInternationalScheduled1(obWriteInternationalScheduledConsent2.getData().getInitiation()))
                )
                .risk(obWriteInternationalScheduledConsent2.getRisk());
    }

    public static OBWriteInternationalScheduled2 toOBWriteInternationalScheduled2(OBWriteInternationalScheduled1 obWriteInternationalScheduled1) {
        return new OBWriteInternationalScheduled2()
                .data(new OBWriteDataInternationalScheduled2()
                        .consentId(obWriteInternationalScheduled1.getData().getConsentId())
                        .initiation(toOBInternationalScheduled2(obWriteInternationalScheduled1.getData().getInitiation()))
                )
                .risk(obWriteInternationalScheduled1.getRisk());
    }

    public static OBWriteInternationalScheduled1 toOBWriteInternationalScheduled1(OBWriteInternationalScheduled2 obWriteInternationalScheduled2) {
        return new OBWriteInternationalScheduled1()
                .data(new OBWriteDataInternationalScheduled1()
                        .consentId(obWriteInternationalScheduled2.getData().getConsentId())
                        .initiation(toOBInternationalScheduled1(obWriteInternationalScheduled2.getData().getInitiation()))
                )
                .risk(obWriteInternationalScheduled2.getRisk());
    }

}
