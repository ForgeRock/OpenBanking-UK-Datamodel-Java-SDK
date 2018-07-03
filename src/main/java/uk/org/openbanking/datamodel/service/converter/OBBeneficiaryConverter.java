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
 *  Copyright 2018 ForgeRock AS.
 *
 */

package uk.org.openbanking.datamodel.service.converter;

import uk.org.openbanking.datamodel.account.OBBeneficiary1;
import uk.org.openbanking.datamodel.account.OBBeneficiary2;
import uk.org.openbanking.datamodel.account.OBBranchAndFinancialInstitutionIdentification2;
import uk.org.openbanking.datamodel.account.OBBranchAndFinancialInstitutionIdentification3;

/**
 * Convert OB beneficiary data-model in different version
 */
public class OBBeneficiaryConverter {

    /**
     * Convert a beneficiary V2 to V1
     * @param obBeneficiary2 beneficiary in V2 format
     * @return beneficiary in V1 format
     */
    public static OBBeneficiary1 toBeneficiary1(OBBeneficiary2 obBeneficiary2) {
        OBBeneficiary1 obBeneficiary1 = new OBBeneficiary1();
        if (obBeneficiary2.getAccountId() != null) {
            obBeneficiary1.accountId(obBeneficiary2.getAccountId());
        }
        if (obBeneficiary2.getBeneficiaryId() != null) {
            obBeneficiary1.beneficiaryId(obBeneficiary2.getBeneficiaryId());
        }
        if (obBeneficiary2.getReference() != null) {
            obBeneficiary1.reference(obBeneficiary2.getReference());
        }
        if (obBeneficiary2.getCreditorAgent() != null) {
            obBeneficiary1.servicer(new OBBranchAndFinancialInstitutionIdentification2()
                    .schemeName(obBeneficiary2.getCreditorAgent().getSchemeName())
                    .identification(obBeneficiary2.getCreditorAgent().getIdentification())
            );
        }
        if (obBeneficiary2.getCreditorAccount() != null) {
            obBeneficiary1.creditorAccount(obBeneficiary2.getCreditorAccount());
        }


        return obBeneficiary1;
    }

    /**
     * Convert a beneficiary V1 to V2
     * @param obBeneficiary1 beneficiary in V1 format
     * @return beneficiary in V2 format
     */
    public static OBBeneficiary2 toBeneficiary2(OBBeneficiary1 obBeneficiary1) {

        OBBeneficiary2 obBeneficiary2 = new OBBeneficiary2();
        if (obBeneficiary1.getAccountId() != null) {
            obBeneficiary2.accountId(obBeneficiary1.getAccountId());
        }
        if (obBeneficiary1.getBeneficiaryId() != null) {
            obBeneficiary2.beneficiaryId(obBeneficiary1.getBeneficiaryId());
        }
        if (obBeneficiary1.getReference() != null) {
            obBeneficiary2.reference(obBeneficiary1.getReference());
        }
        if (obBeneficiary1.getServicer() != null) {
            obBeneficiary2.creditorAgent(new OBBranchAndFinancialInstitutionIdentification3()
                    .schemeName(obBeneficiary1.getServicer().getSchemeName())
                    .identification(obBeneficiary1.getServicer().getIdentification())
            );
        }
        if (obBeneficiary1.getCreditorAccount() != null) {
            obBeneficiary2.creditorAccount(obBeneficiary1.getCreditorAccount());
        }
        return obBeneficiary2;
    }
}
