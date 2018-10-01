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

import uk.org.openbanking.datamodel.account.OBTransaction1;
import uk.org.openbanking.datamodel.account.OBTransaction2;

/**
 * Convert OB transaction data-model in different version
 */
public class OBTransactionConverter {

    /**
     * Convert a transaction from V2 to V1
     * @param obTransaction2 transaction in V2 format
     * @return transaction in V1 format
     */
    public static OBTransaction1 toTransaction1(OBTransaction2 obTransaction2) {

        OBTransaction1 transaction1 = new OBTransaction1()
                .accountId(obTransaction2.getAccountId())
                .amount(obTransaction2.getAmount())
                .creditDebitIndicator(obTransaction2.getCreditDebitIndicator())
                .status(obTransaction2.getStatus())
                .bookingDateTime(obTransaction2.getBookingDateTime());

        if (obTransaction2.getTransactionId() != null) {
            transaction1.transactionId(obTransaction2.getTransactionId());
        }
        if (obTransaction2.getTransactionReference() != null) {
            transaction1.transactionReference(obTransaction2.getTransactionReference());
        }
        if (obTransaction2.getValueDateTime() != null) {
            transaction1.valueDateTime(obTransaction2.getValueDateTime());
        }
        if (obTransaction2.getTransactionInformation() != null) {
            transaction1.transactionInformation(obTransaction2.getTransactionInformation());
        }
        if (obTransaction2.getAddressLine() != null) {
            transaction1.addressLine(obTransaction2.getAddressLine());
        }
        if (obTransaction2.getBankTransactionCode() != null) {
            transaction1.bankTransactionCode(obTransaction2.getBankTransactionCode());
        }
        if (obTransaction2.getProprietaryBankTransactionCode() != null) {
            transaction1.proprietaryBankTransactionCode(obTransaction2.getProprietaryBankTransactionCode());
        }
        if (obTransaction2.getBalance() != null) {
            transaction1.balance(obTransaction2.getBalance());
        }
        if (obTransaction2.getMerchantDetails() != null) {
            transaction1.merchantDetails(obTransaction2.getMerchantDetails());
        }
        return transaction1;
    }

    /**
     * Convert a transaction from V1 to V2
     * @param obTransaction1 transaction in V1 format
     * @return transaction in V2 format
     */
    public static OBTransaction2 toTransaction2(OBTransaction1 obTransaction1) {
        OBTransaction2 OBTransaction2 = new OBTransaction2()
                .accountId(obTransaction1.getAccountId())
                .amount(obTransaction1.getAmount())
                .creditDebitIndicator(obTransaction1.getCreditDebitIndicator())
                .status(obTransaction1.getStatus())
                .bookingDateTime(obTransaction1.getBookingDateTime());

        if (obTransaction1.getTransactionId() != null) {
            OBTransaction2.transactionId(obTransaction1.getTransactionId());
        }
        if (obTransaction1.getTransactionReference() != null) {
            OBTransaction2.transactionReference(obTransaction1.getTransactionReference());
        }
        if (obTransaction1.getValueDateTime() != null) {
            OBTransaction2.valueDateTime(obTransaction1.getValueDateTime());
        }
        if (obTransaction1.getTransactionInformation() != null) {
            OBTransaction2.transactionInformation(obTransaction1.getTransactionInformation());
        }
        if (obTransaction1.getAddressLine() != null) {
            OBTransaction2.addressLine(obTransaction1.getAddressLine());
        }
        if (obTransaction1.getBankTransactionCode() != null) {
            OBTransaction2.bankTransactionCode(obTransaction1.getBankTransactionCode());
        }
        if (obTransaction1.getProprietaryBankTransactionCode() != null) {
            OBTransaction2.proprietaryBankTransactionCode(obTransaction1.getProprietaryBankTransactionCode());
        }
        if (obTransaction1.getBalance() != null) {
            OBTransaction2.balance(obTransaction1.getBalance());
        }
        if (obTransaction1.getMerchantDetails() != null) {
            OBTransaction2.merchantDetails(obTransaction1.getMerchantDetails());
        }
        return OBTransaction2;
    }
}
