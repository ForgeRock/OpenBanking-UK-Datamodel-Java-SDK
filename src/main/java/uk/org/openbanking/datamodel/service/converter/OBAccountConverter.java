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
import uk.org.openbanking.datamodel.payment.OBExternalAccountIdentification2Code;

import java.util.Collections;

/**
 * Convert OB account data-model in different version
 */
public class OBAccountConverter {

    /**
     * Transform an account of V2 format to V1 format
     * @param account2 the account in V2 format
     * @return the corresponding account in V1 format
     */
    public static OBAccount1 toAccount1(OBAccount2 account2) {

        OBAccount1 account1 = new OBAccount1()
                .accountId(account2.getAccountId())
                .currency(account2.getCurrency());
        if (account2.getNickname() != null) {
            account1.nickname(account2.getNickname());
        }

        //account
        if (account2.getAccount() != null && account2.getAccount().size() > 0) {
            OBCashAccount3 obAccount2Account = account2.getAccount().get(0);

            OBCashAccount1 obCashAccount1 = new OBCashAccount1()
                    .schemeName(toOBExternalAccountIdentification2Code(obAccount2Account.getSchemeName()))
                    .identification(obAccount2Account.getIdentification());

            if (obAccount2Account.getName() != null) {
                obCashAccount1.name(obAccount2Account.getName());
            }
            if (obAccount2Account.getSecondaryIdentification() != null) {
                obCashAccount1.secondaryIdentification(obAccount2Account.getSecondaryIdentification());
            }
            account1.account(obCashAccount1);
        }

        //servicer
        if (account2.getServicer() != null) {
            account1.servicer(new OBBranchAndFinancialInstitutionIdentification2()
                    .schemeName(OBExternalFinancialInstitutionIdentification2Code.valueOf(account2.getServicer().getSchemeName()))
                    .identification(account2.getServicer().getIdentification())
            );
        }
        return account1;
    }

    /**
     * Transform an account from V2 to V1. As V2 is more exhaustive than V1, the account would be full-filled with
     * some random data, for the mandatory values. In particular
     * - account sub type would be current account
     * - account type would be personal
     * It's expecting that the consumer of this function would be able to know the appropriate value and do the
     * necessary changes
     * @param account1 the account in V1 format
     * @return the account in V2 format
     */
    public static OBAccount2 toAccount2(OBAccount1 account1) {
        OBAccount2 account2 = new OBAccount2()
                .accountId(account1.getAccountId())
                .currency(account1.getCurrency())
                .accountSubType(OBExternalAccountSubType1Code.CURRENTACCOUNT)
                .accountType(OBExternalAccountType1Code.PERSONAL);;
        if (account1.getNickname() != null) {
            account2.nickname(account1.getNickname());
        }

        //account
        OBCashAccount3 account2Account = new OBCashAccount3()
                .schemeName(account1.getAccount().getSchemeName().toString())
                .identification(account1.getAccount().getIdentification());
        if (account1.getAccount().getName() != null) {
            account2Account.name(account1.getAccount().getName());
        }
        if (account1.getAccount().getSecondaryIdentification() != null) {
            account2Account.secondaryIdentification(account1.getAccount().getSecondaryIdentification());
        }
        account2.account(Collections.singletonList(account2Account));

        //servicer
        if (account2.getServicer() != null) {
            account1.servicer(new OBBranchAndFinancialInstitutionIdentification2()
                    .schemeName(OBExternalFinancialInstitutionIdentification2Code.valueOf(account2.getServicer().getSchemeName()))
                    .identification(account2.getServicer().getIdentification())
            );
        }
        return account2;
    }

    private static OBExternalAccountIdentification2Code toOBExternalAccountIdentification2Code(String obExternalAccountIdentification3Code) {
        return OBExternalAccountIdentification2Code.valueOfReference(obExternalAccountIdentification3Code);
    }



}
