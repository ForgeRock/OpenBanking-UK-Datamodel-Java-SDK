/*
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
 *  Copyright 2017 ForgeRock AS.
 *
 */

package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum  OBTransactionIndividualStatus1Code {
    /**
     * Preceding check of technical validation was successful. Customer profile check was also successful.
     */
    ACCEPTED_CUSTOMER_PROFILE("AcceptedCustomerProfile"),

    /**
     * Settlement on the debtor’s account has been completed.
     *
     * Usage : this can be used by the first agent to report to the debtor that the transaction has been completed.
     * Warning : this status is provided for transaction status reasons, not for financial information.
     * It can only be used after bilateral agreement.
     *
     * PISPs must not use this status as confirmation that settlement is complete on the creditor’s account.
     */
    ACCEPTED_SETTLEMENT_COMPLETED("AcceptedSettlementCompleted"),

    /**
     * All preceding checks such as technical validation and customer profile were successful and
     * therefore the payment initiation has been accepted for execution.
     */
    ACCEPTED_SETTLEMENT_IN_PROCESS("AcceptedSettlementInProcess"),

    /**
     * Authentication and syntactical and semantic validation are successful.
     */
    ACCEPTED_TECHNICAL_VALIDATION("AcceptedTechnicalValidation"),

    /**
     * Payment initiation or individual transaction included in the payment initiation is pending.
     * Further checks and status update will be performed.
     */
    PENDING("Pending"),

    /**
     * Payment initiation or individual transaction included in the payment initiation has been rejected.
     */
    REJECTED("Rejected");

    private String value;


    OBTransactionIndividualStatus1Code(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBTransactionIndividualStatus1Code fromValue(String text) {
        for (OBTransactionIndividualStatus1Code b : OBTransactionIndividualStatus1Code.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
