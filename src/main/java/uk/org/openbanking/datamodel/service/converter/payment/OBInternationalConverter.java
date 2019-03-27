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

public class OBInternationalConverter {

    public static OBInternational2 toOBInternational2(OBInternational1 obInternational1) {
        return new OBInternational2()
                .creditorAccount(obInternational1.getCreditorAccount())
                .debtorAccount(obInternational1.getDebtorAccount())
                .endToEndIdentification(obInternational1.getEndToEndIdentification())
                .instructedAmount(obInternational1.getInstructedAmount())
                .instructionIdentification(obInternational1.getInstructionIdentification())
                .localInstrument(obInternational1.getLocalInstrument())
                .remittanceInformation(obInternational1.getRemittanceInformation())
                .chargeBearer(obInternational1.getChargeBearer())
                .creditor(obInternational1.getCreditor())
                .creditorAgent(obInternational1.getCreditorAgent())
                .currencyOfTransfer(obInternational1.getCurrencyOfTransfer())
                .exchangeRateInformation(obInternational1.getExchangeRateInformation())
                .instructionPriority(obInternational1.getInstructionPriority())
                ;
    }

    public static OBInternational1 toOBInternational1(OBInternational2 obInternational2) {
        return new OBInternational1()
                .creditorAccount(obInternational2.getCreditorAccount())
                .debtorAccount(obInternational2.getDebtorAccount())
                .endToEndIdentification(obInternational2.getEndToEndIdentification())
                .instructedAmount(obInternational2.getInstructedAmount())
                .instructionIdentification(obInternational2.getInstructionIdentification())
                .localInstrument(obInternational2.getLocalInstrument())
                .remittanceInformation(obInternational2.getRemittanceInformation())
                .chargeBearer(obInternational2.getChargeBearer())
                .creditor(obInternational2.getCreditor())
                .creditorAgent(obInternational2.getCreditorAgent())
                .currencyOfTransfer(obInternational2.getCurrencyOfTransfer())
                .exchangeRateInformation(obInternational2.getExchangeRateInformation())
                .instructionPriority(obInternational2.getInstructionPriority())
                ;
    }

    public static OBWriteInternationalConsent2 toOBWriteInternationalConsent2(OBWriteInternationalConsent1 obWriteInternationalConsent1) {
        return new OBWriteInternationalConsent2()
                .data(new OBWriteDataInternationalConsent2()
                        .authorisation(obWriteInternationalConsent1.getData().getAuthorisation())
                        .initiation(toOBInternational2(obWriteInternationalConsent1.getData().getInitiation()))
                )
                .risk(obWriteInternationalConsent1.getRisk());
    }

    public static OBWriteInternationalConsent1 toOBWriteInternationalConsent1(OBWriteInternationalConsent2 obWriteInternationalConsent2) {
        return new OBWriteInternationalConsent1()
                .data(new OBWriteDataInternationalConsent1()
                        .authorisation(obWriteInternationalConsent2.getData().getAuthorisation())
                        .initiation(toOBInternational1(obWriteInternationalConsent2.getData().getInitiation()))
                )
                .risk(obWriteInternationalConsent2.getRisk());
    }

    public static OBWriteInternational2 toOBWriteInternational2(OBWriteInternational1 obWriteInternational1) {
        return new OBWriteInternational2()
                .data(new OBWriteDataInternational2()
                        .consentId(obWriteInternational1.getData().getConsentId())
                        .initiation(toOBInternational2(obWriteInternational1.getData().getInitiation()))
                )
                .risk(obWriteInternational1.getRisk());
    }

    public static OBWriteInternational1 toOBWriteInternational1(OBWriteInternational2 obWriteInternational2) {
        return new OBWriteInternational1()
                .data(new OBWriteDataInternational1()
                        .consentId(obWriteInternational2.getData().getConsentId())
                        .initiation(toOBInternational1(obWriteInternational2.getData().getInitiation()))
                )
                .risk(obWriteInternational2.getRisk());
    }
}
