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
package uk.org.openbanking.datamodel.service.converter.payment;

import uk.org.openbanking.datamodel.payment.*;

public class OBInternationalStandingOrderConverter {

    public static OBInternationalStandingOrder2 toOBInternationalStandingOrder2(OBInternationalStandingOrder1 obInternationalStandingOrder1) {
        return new OBInternationalStandingOrder2()
                .chargeBearer(obInternationalStandingOrder1.getChargeBearer())
                .creditor(obInternationalStandingOrder1.getCreditor())
                .creditorAccount(obInternationalStandingOrder1.getCreditorAccount())
                .creditorAgent(obInternationalStandingOrder1.getCreditorAgent())
                .currencyOfTransfer(obInternationalStandingOrder1.getCurrencyOfTransfer())
                .debtorAccount(obInternationalStandingOrder1.getDebtorAccount())
                .finalPaymentDateTime(obInternationalStandingOrder1.getFinalPaymentDateTime())
                .firstPaymentDateTime(obInternationalStandingOrder1.getFirstPaymentDateTime())
                .frequency(obInternationalStandingOrder1.getFrequency())
                .instructedAmount(obInternationalStandingOrder1.getInstructedAmount())
                .numberOfPayments(obInternationalStandingOrder1.getNumberOfPayments())
                .purpose(obInternationalStandingOrder1.getPurpose())
                .reference(obInternationalStandingOrder1.getReference())
                ;
    }


    public static OBInternationalStandingOrder1 toOBInternationalStandingOrder1(OBInternationalStandingOrder2 obInternationalStandingOrder2) {
        return new OBInternationalStandingOrder1()
                .chargeBearer(obInternationalStandingOrder2.getChargeBearer())
                .creditor(obInternationalStandingOrder2.getCreditor())
                .creditorAccount(obInternationalStandingOrder2.getCreditorAccount())
                .creditorAgent(obInternationalStandingOrder2.getCreditorAgent())
                .currencyOfTransfer(obInternationalStandingOrder2.getCurrencyOfTransfer())
                .debtorAccount(obInternationalStandingOrder2.getDebtorAccount())
                .finalPaymentDateTime(obInternationalStandingOrder2.getFinalPaymentDateTime())
                .firstPaymentDateTime(obInternationalStandingOrder2.getFirstPaymentDateTime())
                .frequency(obInternationalStandingOrder2.getFrequency())
                .instructedAmount(obInternationalStandingOrder2.getInstructedAmount())
                .numberOfPayments(obInternationalStandingOrder2.getNumberOfPayments())
                .purpose(obInternationalStandingOrder2.getPurpose())
                .reference(obInternationalStandingOrder2.getReference())
                ;
    }

    public static OBWriteInternationalStandingOrderConsent2 toOBWriteInternationalStandingOrderConsent2(OBWriteInternationalStandingOrderConsent1 obWriteInternationalStandingOrderConsent1) {
        return new OBWriteInternationalStandingOrderConsent2()
                .data(new OBWriteDataInternationalStandingOrderConsent2()
                        .authorisation(obWriteInternationalStandingOrderConsent1.getData().getAuthorisation())
                        .initiation(toOBInternationalStandingOrder2(obWriteInternationalStandingOrderConsent1.getData().getInitiation()))
                )
                .risk(obWriteInternationalStandingOrderConsent1.getRisk());
    }

    public static OBWriteInternationalStandingOrderConsent1 toOBWriteInternationalStandingOrderConsent1(OBWriteInternationalStandingOrderConsent2 obWriteInternationalStandingOrderConsent2) {
        return new OBWriteInternationalStandingOrderConsent1()
                .data(new OBWriteDataInternationalStandingOrderConsent1()
                        .authorisation(obWriteInternationalStandingOrderConsent2.getData().getAuthorisation())
                        .initiation(toOBInternationalStandingOrder1(obWriteInternationalStandingOrderConsent2.getData().getInitiation()))
                )
                .risk(obWriteInternationalStandingOrderConsent2.getRisk());
    }

    public static OBWriteInternationalStandingOrder2 toOBWriteInternationalStandingOrder2(OBWriteInternationalStandingOrder1 obWriteInternationalStandingOrder1) {
        return new OBWriteInternationalStandingOrder2()
                .data(new OBWriteDataInternationalStandingOrder2()
                        .consentId(obWriteInternationalStandingOrder1.getData().getConsentId())
                        .initiation(toOBInternationalStandingOrder2(obWriteInternationalStandingOrder1.getData().getInitiation()))
                )
                .risk(obWriteInternationalStandingOrder1.getRisk());
    }

    public static OBWriteInternationalStandingOrder1 toOBWriteInternationalStandingOrder1(OBWriteInternationalStandingOrder2 obWriteInternationalStandingOrder2) {
        return new OBWriteInternationalStandingOrder1()
                .data(new OBWriteDataInternationalStandingOrder1()
                        .consentId(obWriteInternationalStandingOrder2.getData().getConsentId())
                        .initiation(toOBInternationalStandingOrder1(obWriteInternationalStandingOrder2.getData().getInitiation()))
                )
                .risk(obWriteInternationalStandingOrder2.getRisk());
    }

}
