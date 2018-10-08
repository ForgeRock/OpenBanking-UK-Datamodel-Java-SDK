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

import uk.org.openbanking.datamodel.account.OBStandingOrder1;
import uk.org.openbanking.datamodel.account.OBStandingOrder2;
import uk.org.openbanking.datamodel.account.OBStandingOrder3;

/**
 * Convert OB standing order data-model in different version
 */
public class OBStandingOrderConverter {

    /**
     * Convert standing order from V2 to V1
     * @param obStandingOrder2 standing order in V2 format
     * @return standing order in V1 format
     */
    public static OBStandingOrder1 toStandingOrder1(OBStandingOrder2 obStandingOrder2) {
        OBStandingOrder1 standingOrder1 = new OBStandingOrder1()
                .accountId(obStandingOrder2.getAccountId())
                .frequency(obStandingOrder2.getFrequency())
                .nextPaymentDateTime(obStandingOrder2.getNextPaymentDateTime())
                .nextPaymentAmount(obStandingOrder2.getNextPaymentAmount());

        if (obStandingOrder2.getStandingOrderId() != null) {
            standingOrder1.standingOrderId(obStandingOrder2.getStandingOrderId());
        }
        if (obStandingOrder2.getReference() != null) {
            standingOrder1.reference(obStandingOrder2.getReference());
        }
        if (obStandingOrder2.getFirstPaymentDateTime() != null) {
            standingOrder1.firstPaymentDateTime(obStandingOrder2.getFirstPaymentDateTime());
        }
        if (obStandingOrder2.getFirstPaymentAmount() != null) {
            standingOrder1.firstPaymentAmount(obStandingOrder2.getFirstPaymentAmount());
        }
        if (obStandingOrder2.getFinalPaymentDateTime() != null) {
            standingOrder1.finalPaymentDateTime(obStandingOrder2.getFinalPaymentDateTime());
        }
        if (obStandingOrder2.getFinalPaymentAmount() != null) {
            standingOrder1.finalPaymentAmount(obStandingOrder2.getFinalPaymentAmount());
        }
        if (obStandingOrder2.getCreditorAgent() != null) {
            standingOrder1.servicer(obStandingOrder2.getCreditorAgent());
        }
        if (obStandingOrder2.getCreditorAccount() != null) {
            standingOrder1.creditorAccount(obStandingOrder2.getCreditorAccount());
        }
        return standingOrder1;
    }

    /**
     * Convert standing order from V3 to V1
     * @param obStandingOrder3 standing order in V3 format
     * @return standing order in V1 format
     */
    public static OBStandingOrder1 toStandingOrder1(OBStandingOrder3 obStandingOrder3) {
        OBStandingOrder1 standingOrder1 = new OBStandingOrder1()
                .accountId(obStandingOrder3.getAccountId())
                .frequency(obStandingOrder3.getFrequency())
                .nextPaymentDateTime(obStandingOrder3.getNextPaymentDateTime())
                .nextPaymentAmount(obStandingOrder3.getNextPaymentAmount());

        if (obStandingOrder3.getStandingOrderId() != null) {
            standingOrder1.standingOrderId(obStandingOrder3.getStandingOrderId());
        }
        if (obStandingOrder3.getReference() != null) {
            standingOrder1.reference(obStandingOrder3.getReference());
        }
        if (obStandingOrder3.getFirstPaymentDateTime() != null) {
            standingOrder1.firstPaymentDateTime(obStandingOrder3.getFirstPaymentDateTime());
        }
        if (obStandingOrder3.getFirstPaymentAmount() != null) {
            standingOrder1.firstPaymentAmount(obStandingOrder3.getFirstPaymentAmount());
        }
        if (obStandingOrder3.getFinalPaymentDateTime() != null) {
            standingOrder1.finalPaymentDateTime(obStandingOrder3.getFinalPaymentDateTime());
        }
        if (obStandingOrder3.getFinalPaymentAmount() != null) {
            standingOrder1.finalPaymentAmount(obStandingOrder3.getFinalPaymentAmount());
        }
        if (obStandingOrder3.getCreditorAgent() != null) {
            standingOrder1.servicer(OBBranchAndFinancialInstitutionIdentificationConverter.toOBBranchAndFinancialInstitutionIdentification2(obStandingOrder3.getCreditorAgent()));
        }
        if (obStandingOrder3.getCreditorAccount() != null) {
            standingOrder1.creditorAccount(OBCashAccountConverter.toOBCashAccount1(obStandingOrder3.getCreditorAccount()));
        }
        return standingOrder1;
    }

    /**
     * Convert standing order from V3 to V2
     * @param obStandingOrder3 standing order in V3 format
     * @return standing order in V2 format
     */
    public static OBStandingOrder2 toStandingOrder2(OBStandingOrder3 obStandingOrder3) {
        OBStandingOrder2 standingOrder2 = new OBStandingOrder2()
                .accountId(obStandingOrder3.getAccountId())
                .frequency(obStandingOrder3.getFrequency())
                .nextPaymentDateTime(obStandingOrder3.getNextPaymentDateTime())
                .nextPaymentAmount(obStandingOrder3.getNextPaymentAmount());

        if (obStandingOrder3.getStandingOrderId() != null) {
            standingOrder2.standingOrderId(obStandingOrder3.getStandingOrderId());
        }
        if (obStandingOrder3.getReference() != null) {
            standingOrder2.reference(obStandingOrder3.getReference());
        }
        if (obStandingOrder3.getFirstPaymentDateTime() != null) {
            standingOrder2.firstPaymentDateTime(obStandingOrder3.getFirstPaymentDateTime());
        }
        if (obStandingOrder3.getFirstPaymentAmount() != null) {
            standingOrder2.firstPaymentAmount(obStandingOrder3.getFirstPaymentAmount());
        }
        if (obStandingOrder3.getFinalPaymentDateTime() != null) {
            standingOrder2.finalPaymentDateTime(obStandingOrder3.getFinalPaymentDateTime());
        }
        if (obStandingOrder3.getFinalPaymentAmount() != null) {
            standingOrder2.finalPaymentAmount(obStandingOrder3.getFinalPaymentAmount());
        }
        if (obStandingOrder3.getCreditorAgent() != null) {
            standingOrder2.setCreditorAgent(OBBranchAndFinancialInstitutionIdentificationConverter.toOBBranchAndFinancialInstitutionIdentification2(obStandingOrder3.getCreditorAgent()));
        }
        if (obStandingOrder3.getCreditorAccount() != null) {
            standingOrder2.creditorAccount(OBCashAccountConverter.toOBCashAccount1(obStandingOrder3.getCreditorAccount()));
        }
        return standingOrder2;
    }

    /**
     * Convert standing order from V1 to V2
     * @param obStandingOrder1 standing order in V1 format
     * @return standing order in V2 format
     */
    public static OBStandingOrder2 toStandingOrder2(OBStandingOrder1 obStandingOrder1) {

        OBStandingOrder2 standingOrder2 = new OBStandingOrder2()
                .accountId(obStandingOrder1.getAccountId())
                .frequency(obStandingOrder1.getFrequency())
                .nextPaymentDateTime(obStandingOrder1.getNextPaymentDateTime())
                .nextPaymentAmount(obStandingOrder1.getNextPaymentAmount());

        if (obStandingOrder1.getStandingOrderId() != null) {
            standingOrder2.standingOrderId(obStandingOrder1.getStandingOrderId());
        }
        if (obStandingOrder1.getReference() != null) {
            standingOrder2.reference(obStandingOrder1.getReference());
        }
        if (obStandingOrder1.getFirstPaymentDateTime() != null) {
            standingOrder2.firstPaymentDateTime(obStandingOrder1.getFirstPaymentDateTime());
        }
        if (obStandingOrder1.getFirstPaymentAmount() != null) {
            standingOrder2.firstPaymentAmount(obStandingOrder1.getFirstPaymentAmount());
        }
        if (obStandingOrder1.getFinalPaymentDateTime() != null) {
            standingOrder2.finalPaymentDateTime(obStandingOrder1.getFinalPaymentDateTime());
        }
        if (obStandingOrder1.getFinalPaymentAmount() != null) {
            standingOrder2.finalPaymentAmount(obStandingOrder1.getFinalPaymentAmount());
        }
        if (obStandingOrder1.getServicer() != null) {
            standingOrder2.creditorAgent(obStandingOrder1.getServicer());
        }
        if (obStandingOrder1.getCreditorAccount() != null) {
            standingOrder2.creditorAccount(obStandingOrder1.getCreditorAccount());
        }
        return standingOrder2;
    }

    /**
     * Convert standing order from V2 to V3
     * @param obStandingOrder2 standing order in V2 format
     * @return standing order in V3 format
     */
    public static OBStandingOrder3 toStandingOrder3(OBStandingOrder2 obStandingOrder2) {

        OBStandingOrder3 standingOrder3 = new OBStandingOrder3()
                .accountId(obStandingOrder2.getAccountId())
                .frequency(obStandingOrder2.getFrequency())
                .nextPaymentDateTime(obStandingOrder2.getNextPaymentDateTime())
                .nextPaymentAmount(obStandingOrder2.getNextPaymentAmount());

        if (obStandingOrder2.getStandingOrderId() != null) {
            standingOrder3.standingOrderId(obStandingOrder2.getStandingOrderId());
        }
        if (obStandingOrder2.getReference() != null) {
            standingOrder3.reference(obStandingOrder2.getReference());
        }
        if (obStandingOrder2.getFirstPaymentDateTime() != null) {
            standingOrder3.firstPaymentDateTime(obStandingOrder2.getFirstPaymentDateTime());
        }
        if (obStandingOrder2.getFirstPaymentAmount() != null) {
            standingOrder3.firstPaymentAmount(obStandingOrder2.getFirstPaymentAmount());
        }
        if (obStandingOrder2.getFinalPaymentDateTime() != null) {
            standingOrder3.finalPaymentDateTime(obStandingOrder2.getFinalPaymentDateTime());
        }
        if (obStandingOrder2.getFinalPaymentAmount() != null) {
            standingOrder3.finalPaymentAmount(obStandingOrder2.getFinalPaymentAmount());
        }
        if (obStandingOrder2.getCreditorAgent() != null) {
            standingOrder3.creditorAgent(
                    OBBranchAndFinancialInstitutionIdentificationConverter.toOBBranchAndFinancialInstitutionIdentification2(obStandingOrder2.getCreditorAgent())
            );
        }
        if (obStandingOrder2.getCreditorAccount() != null) {
            standingOrder3.creditorAccount(OBCashAccountConverter.toOBCashAccount3(obStandingOrder2.getCreditorAccount()));
        }
        return standingOrder3;
    }
}
