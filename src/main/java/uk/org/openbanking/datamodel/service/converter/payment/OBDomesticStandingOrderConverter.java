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

public class OBDomesticStandingOrderConverter {

    public static OBDomesticStandingOrder2 toOBDomesticStandingOrder2(OBDomesticStandingOrder1 domesticStandingOrder1) {
        return new OBDomesticStandingOrder2()
                .creditorAccount(domesticStandingOrder1.getCreditorAccount())
                .debtorAccount(domesticStandingOrder1.getDebtorAccount())
                .finalPaymentAmount(domesticStandingOrder1.getFinalPaymentAmount())
                .finalPaymentDateTime(domesticStandingOrder1.getFinalPaymentDateTime())
                .firstPaymentAmount(domesticStandingOrder1.getFirstPaymentAmount())
                .firstPaymentDateTime(domesticStandingOrder1.getFirstPaymentDateTime())
                .recurringPaymentAmount(domesticStandingOrder1.getRecurringPaymentAmount())
                .recurringPaymentDateTime(domesticStandingOrder1.getRecurringPaymentDateTime())
                .frequency(domesticStandingOrder1.getFrequency())
                .numberOfPayments(domesticStandingOrder1.getNumberOfPayments())
                .reference(domesticStandingOrder1.getReference());
    }

    public static OBDomesticStandingOrder1 toOBDomesticStandingOrder1(OBDomesticStandingOrder2 domesticStandingOrder2) {
        return new OBDomesticStandingOrder1()
                .creditorAccount(domesticStandingOrder2.getCreditorAccount())
                .debtorAccount(domesticStandingOrder2.getDebtorAccount())
                .finalPaymentAmount(domesticStandingOrder2.getFinalPaymentAmount())
                .finalPaymentDateTime(domesticStandingOrder2.getFinalPaymentDateTime())
                .firstPaymentAmount(domesticStandingOrder2.getFirstPaymentAmount())
                .firstPaymentDateTime(domesticStandingOrder2.getFirstPaymentDateTime())
                .recurringPaymentAmount(domesticStandingOrder2.getRecurringPaymentAmount())
                .recurringPaymentDateTime(domesticStandingOrder2.getRecurringPaymentDateTime())
                .frequency(domesticStandingOrder2.getFrequency())
                .numberOfPayments(domesticStandingOrder2.getNumberOfPayments())
                .reference(domesticStandingOrder2.getReference());
    }

    public static OBWriteDomesticStandingOrderConsent2 toOBWriteDomesticStandingOrderConsent2(OBWriteDomesticStandingOrderConsent1 obWriteDomesticStandingOrderConsent1) {
        return new OBWriteDomesticStandingOrderConsent2()
                .data(new OBWriteDataDomesticStandingOrderConsent2()
                        .authorisation(obWriteDomesticStandingOrderConsent1.getData().getAuthorisation())
                        .initiation(toOBDomesticStandingOrder2(obWriteDomesticStandingOrderConsent1.getData().getInitiation()))
                        .permission(obWriteDomesticStandingOrderConsent1.getData().getPermission())
                )
                .risk(obWriteDomesticStandingOrderConsent1.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent1 toOBWriteDomesticStandingOrderConsent1(OBWriteDomesticStandingOrderConsent2 obWriteDomesticStandingOrderConsent2) {
        return new OBWriteDomesticStandingOrderConsent1()
                .data(new OBWriteDataDomesticStandingOrderConsent1()
                        .authorisation(obWriteDomesticStandingOrderConsent2.getData().getAuthorisation())
                        .initiation(toOBDomesticStandingOrder1(obWriteDomesticStandingOrderConsent2.getData().getInitiation()))
                        .permission(obWriteDomesticStandingOrderConsent2.getData().getPermission())
                )
                .risk(obWriteDomesticStandingOrderConsent2.getRisk());
    }

    public static OBWriteDomesticStandingOrder2 toOBWriteDomesticStandingOrder2(OBWriteDomesticStandingOrder1 obWriteDomesticStandingOrder1) {
        return new OBWriteDomesticStandingOrder2()
                .data(new OBWriteDataDomesticStandingOrder2()
                        .consentId(obWriteDomesticStandingOrder1.getData().getConsentId())
                        .initiation(toOBDomesticStandingOrder2(obWriteDomesticStandingOrder1.getData().getInitiation()))
                )
                .risk(obWriteDomesticStandingOrder1.getRisk());
    }

    public static OBWriteDomesticStandingOrder1 toOBWriteDomesticStandingOrder1(OBWriteDomesticStandingOrder2 obWriteDomesticStandingOrder2) {
        return new OBWriteDomesticStandingOrder1()
                .data(new OBWriteDataDomesticStandingOrder1()
                        .consentId(obWriteDomesticStandingOrder2.getData().getConsentId())
                        .initiation(toOBDomesticStandingOrder1(obWriteDomesticStandingOrder2.getData().getInitiation()))
                )
                .risk(obWriteDomesticStandingOrder2.getRisk());
    }
}
