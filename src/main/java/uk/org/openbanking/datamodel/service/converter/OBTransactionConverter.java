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
     * Convert a transaction from V3 to V1
     * @param obTransaction3 transaction in V3 format
     * @return transaction in V1 format
     */
    public static OBTransaction1 toTransaction1(OBTransaction3 obTransaction3) {

        OBTransaction1 transaction1 = new OBTransaction1()
                .accountId(obTransaction3.getAccountId())
                .amount(obTransaction3.getAmount())
                .creditDebitIndicator(obTransaction3.getCreditDebitIndicator())
                .status(obTransaction3.getStatus())
                .bookingDateTime(obTransaction3.getBookingDateTime());

        if (obTransaction3.getTransactionId() != null) {
            transaction1.transactionId(obTransaction3.getTransactionId());
        }
        if (obTransaction3.getTransactionReference() != null) {
            transaction1.transactionReference(obTransaction3.getTransactionReference());
        }
        if (obTransaction3.getValueDateTime() != null) {
            transaction1.valueDateTime(obTransaction3.getValueDateTime());
        }
        if (obTransaction3.getTransactionInformation() != null) {
            transaction1.transactionInformation(obTransaction3.getTransactionInformation());
        }
        if (obTransaction3.getAddressLine() != null) {
            transaction1.addressLine(obTransaction3.getAddressLine());
        }
        if (obTransaction3.getBankTransactionCode() != null) {
            transaction1.bankTransactionCode(obTransaction3.getBankTransactionCode());
        }
        if (obTransaction3.getProprietaryBankTransactionCode() != null) {
            transaction1.proprietaryBankTransactionCode(
                    new ProprietaryBankTransactionCodeStructure1()
                            .code(obTransaction3.getProprietaryBankTransactionCode().getCode())
                            .issuer(obTransaction3.getProprietaryBankTransactionCode().getIssuer())
                    );
        }
        if (obTransaction3.getBalance() != null) {
            transaction1.balance(obTransaction3.getBalance());
        }
        if (obTransaction3.getMerchantDetails() != null) {
            transaction1.merchantDetails(obTransaction3.getMerchantDetails());
        }
        return transaction1;
    }

    /**
     * Convert a transaction from V3 to V2
     * @param obTransaction3 transaction in V3 format
     * @return transaction in V2 format
     */
    public static OBTransaction2 toTransaction2(OBTransaction3 obTransaction3) {

        OBTransaction2 transaction2 = new OBTransaction2()
                .accountId(obTransaction3.getAccountId())
                .amount(obTransaction3.getAmount())
                .creditDebitIndicator(obTransaction3.getCreditDebitIndicator())
                .status(obTransaction3.getStatus())
                .bookingDateTime(obTransaction3.getBookingDateTime());

        if (obTransaction3.getTransactionId() != null) {
            transaction2.transactionId(obTransaction3.getTransactionId());
        }
        if (obTransaction3.getTransactionReference() != null) {
            transaction2.transactionReference(obTransaction3.getTransactionReference());
        }
        if (obTransaction3.getValueDateTime() != null) {
            transaction2.valueDateTime(obTransaction3.getValueDateTime());
        }
        if (obTransaction3.getTransactionInformation() != null) {
            transaction2.transactionInformation(obTransaction3.getTransactionInformation());
        }
        if (obTransaction3.getAddressLine() != null) {
            transaction2.addressLine(obTransaction3.getAddressLine());
        }
        if (obTransaction3.getBankTransactionCode() != null) {
            transaction2.bankTransactionCode(obTransaction3.getBankTransactionCode());
        }
        if (obTransaction3.getProprietaryBankTransactionCode() != null) {
            transaction2.proprietaryBankTransactionCode(
                    new ProprietaryBankTransactionCodeStructure1()
                            .code(obTransaction3.getProprietaryBankTransactionCode().getCode())
                            .issuer(obTransaction3.getProprietaryBankTransactionCode().getIssuer())
            );
        }
        if (obTransaction3.getBalance() != null) {
            transaction2.balance(obTransaction3.getBalance());
        }
        if (obTransaction3.getMerchantDetails() != null) {
            transaction2.merchantDetails(obTransaction3.getMerchantDetails());
        }
        return transaction2;
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

    /**
     * Convert a transaction from V2 to V3
     * @param obTransaction2 transaction in V2 format
     * @return transaction in V3 format
     */
    public static OBTransaction3 toTransaction3(OBTransaction2 obTransaction2) {
        OBTransaction3 OBTransaction3 = new OBTransaction3()
                .accountId(obTransaction2.getAccountId())
                .amount(obTransaction2.getAmount())
                .creditDebitIndicator(obTransaction2.getCreditDebitIndicator())
                .status(obTransaction2.getStatus())
                .bookingDateTime(obTransaction2.getBookingDateTime());

        if (obTransaction2.getTransactionId() != null) {
            OBTransaction3.transactionId(obTransaction2.getTransactionId());
        }
        if (obTransaction2.getTransactionReference() != null) {
            OBTransaction3.transactionReference(obTransaction2.getTransactionReference());
        }
        if (obTransaction2.getValueDateTime() != null) {
            OBTransaction3.valueDateTime(obTransaction2.getValueDateTime());
        }
        if (obTransaction2.getTransactionInformation() != null) {
            OBTransaction3.transactionInformation(obTransaction2.getTransactionInformation());
        }
        if (obTransaction2.getAddressLine() != null) {
            OBTransaction3.addressLine(obTransaction2.getAddressLine());
        }
        if (obTransaction2.getBankTransactionCode() != null) {
            OBTransaction3.bankTransactionCode(obTransaction2.getBankTransactionCode());
        }
        if (obTransaction2.getProprietaryBankTransactionCode() != null) {
            OBTransaction3.proprietaryBankTransactionCode(
                    new OBTransaction3ProprietaryBankTransactionCode()
                            .code(obTransaction2.getProprietaryBankTransactionCode().getCode())
                            .issuer(obTransaction2.getProprietaryBankTransactionCode().getIssuer()));
        }
        if (obTransaction2.getBalance() != null) {
            OBTransaction3.balance(obTransaction2.getBalance());
        }
        if (obTransaction2.getMerchantDetails() != null) {
            OBTransaction3.merchantDetails(obTransaction2.getMerchantDetails());
        }
        return OBTransaction3;
    }

    /**
     * Convert a transaction from V3 to V4
     * @param obTransaction3 transaction in V3 format
     * @return transaction in V4 format
     */
    public static OBTransaction4 toTransaction4(OBTransaction3 obTransaction3) {

        return new OBTransaction4()
                .accountId(obTransaction3.getAccountId())
                .amount(obTransaction3.getAmount())
                .creditDebitIndicator(obTransaction3.getCreditDebitIndicator())
                .status(obTransaction3.getStatus())
                .bookingDateTime(obTransaction3.getBookingDateTime())
                .bankTransactionCode(obTransaction3.getBankTransactionCode())
                .proprietaryBankTransactionCode(obTransaction3.getProprietaryBankTransactionCode())
                .transactionId(obTransaction3.getTransactionId())
                .transactionInformation(obTransaction3.getTransactionInformation())
                .transactionReference(obTransaction3.getTransactionReference())
                .addressLine(obTransaction3.getAddressLine())
                .amount(obTransaction3.getAmount())
                .balance(obTransaction3.getBalance())
                .bookingDateTime(obTransaction3.getBookingDateTime())
                .cardInstrument(obTransaction3.getCardInstrument())
                .chargeAmount(obTransaction3.getChargeAmount())
                .creditDebitIndicator(obTransaction3.getCreditDebitIndicator())
                .creditorAccount(obTransaction3.getCreditorAccount())
                .creditorAgent(obTransaction3.getCreditorAgent())
                .currencyExchange(obTransaction3.getCurrencyExchange())
                .debtorAccount(obTransaction3.getDebtorAccount())
                .debtorAgent(obTransaction3.getDebtorAgent())
                .merchantDetails(obTransaction3.getMerchantDetails())
                .statementReference(obTransaction3.getStatementReference())
                .status(obTransaction3.getStatus())
                .valueDateTime(obTransaction3.getValueDateTime());
    }

    /**
     * Convert a transaction from V4 to V3
     * @param obTransaction4 transaction in V4 format
     * @return transaction in V3 format
     */
    public static OBTransaction3 toTransaction3(OBTransaction4 obTransaction4) {

        return new OBTransaction3()
                .accountId(obTransaction4.getAccountId())
                .amount(obTransaction4.getAmount())
                .creditDebitIndicator(obTransaction4.getCreditDebitIndicator())
                .status(obTransaction4.getStatus())
                .bookingDateTime(obTransaction4.getBookingDateTime())
                .bankTransactionCode(obTransaction4.getBankTransactionCode())
                .proprietaryBankTransactionCode(obTransaction4.getProprietaryBankTransactionCode())
                .transactionId(obTransaction4.getTransactionId())
                .transactionInformation(obTransaction4.getTransactionInformation())
                .transactionReference(obTransaction4.getTransactionReference())
                .addressLine(obTransaction4.getAddressLine())
                .amount(obTransaction4.getAmount())
                .balance(obTransaction4.getBalance())
                .bookingDateTime(obTransaction4.getBookingDateTime())
                .cardInstrument(obTransaction4.getCardInstrument())
                .chargeAmount(obTransaction4.getChargeAmount())
                .creditDebitIndicator(obTransaction4.getCreditDebitIndicator())
                .creditorAccount(obTransaction4.getCreditorAccount())
                .creditorAgent(obTransaction4.getCreditorAgent())
                .currencyExchange(obTransaction4.getCurrencyExchange())
                .debtorAccount(obTransaction4.getDebtorAccount())
                .debtorAgent(obTransaction4.getDebtorAgent())
                .merchantDetails(obTransaction4.getMerchantDetails())
                .statementReference(obTransaction4.getStatementReference())
                .status(obTransaction4.getStatus())
                .valueDateTime(obTransaction4.getValueDateTime());
    }
    /**
     * Convert a transaction from V4 to V2
     * @param obTransaction4 transaction in V4 format
     * @return transaction in V2 format
     */
    public static OBTransaction2 toTransaction2(OBTransaction4 obTransaction4) {

        OBTransaction2 transaction2 = new OBTransaction2()
                .accountId(obTransaction4.getAccountId())
                .amount(obTransaction4.getAmount())
                .creditDebitIndicator(obTransaction4.getCreditDebitIndicator())
                .status(obTransaction4.getStatus())
                .bookingDateTime(obTransaction4.getBookingDateTime());

        if (obTransaction4.getTransactionId() != null) {
            transaction2.transactionId(obTransaction4.getTransactionId());
        }
        if (obTransaction4.getTransactionReference() != null) {
            transaction2.transactionReference(obTransaction4.getTransactionReference());
        }
        if (obTransaction4.getValueDateTime() != null) {
            transaction2.valueDateTime(obTransaction4.getValueDateTime());
        }
        if (obTransaction4.getTransactionInformation() != null) {
            transaction2.transactionInformation(obTransaction4.getTransactionInformation());
        }
        if (obTransaction4.getAddressLine() != null) {
            transaction2.addressLine(obTransaction4.getAddressLine());
        }
        if (obTransaction4.getBankTransactionCode() != null) {
            transaction2.bankTransactionCode(obTransaction4.getBankTransactionCode());
        }
        if (obTransaction4.getProprietaryBankTransactionCode() != null) {
            transaction2.proprietaryBankTransactionCode(
                    new ProprietaryBankTransactionCodeStructure1()
                            .code(obTransaction4.getProprietaryBankTransactionCode().getCode())
                            .issuer(obTransaction4.getProprietaryBankTransactionCode().getIssuer())
            );
        }
        if (obTransaction4.getBalance() != null) {
            transaction2.balance(obTransaction4.getBalance());
        }
        if (obTransaction4.getMerchantDetails() != null) {
            transaction2.merchantDetails(obTransaction4.getMerchantDetails());
        }
        return transaction2;
    }

    /**
     * Convert a transaction from V4 to V1
     * @param obTransaction4 transaction in V4 format
     * @return transaction in V1 format
     */
    public static OBTransaction1 toTransaction1(OBTransaction4 obTransaction4) {

        OBTransaction1 transaction1 = new OBTransaction1()
                .accountId(obTransaction4.getAccountId())
                .amount(obTransaction4.getAmount())
                .creditDebitIndicator(obTransaction4.getCreditDebitIndicator())
                .status(obTransaction4.getStatus())
                .bookingDateTime(obTransaction4.getBookingDateTime());

        if (obTransaction4.getTransactionId() != null) {
            transaction1.transactionId(obTransaction4.getTransactionId());
        }
        if (obTransaction4.getTransactionReference() != null) {
            transaction1.transactionReference(obTransaction4.getTransactionReference());
        }
        if (obTransaction4.getValueDateTime() != null) {
            transaction1.valueDateTime(obTransaction4.getValueDateTime());
        }
        if (obTransaction4.getTransactionInformation() != null) {
            transaction1.transactionInformation(obTransaction4.getTransactionInformation());
        }
        if (obTransaction4.getAddressLine() != null) {
            transaction1.addressLine(obTransaction4.getAddressLine());
        }
        if (obTransaction4.getBankTransactionCode() != null) {
            transaction1.bankTransactionCode(obTransaction4.getBankTransactionCode());
        }
        if (obTransaction4.getProprietaryBankTransactionCode() != null) {
            transaction1.proprietaryBankTransactionCode(
                    new ProprietaryBankTransactionCodeStructure1()
                            .code(obTransaction4.getProprietaryBankTransactionCode().getCode())
                            .issuer(obTransaction4.getProprietaryBankTransactionCode().getIssuer())
            );
        }
        if (obTransaction4.getBalance() != null) {
            transaction1.balance(obTransaction4.getBalance());
        }
        if (obTransaction4.getMerchantDetails() != null) {
            transaction1.merchantDetails(obTransaction4.getMerchantDetails());
        }
        return transaction1;
    }

}
