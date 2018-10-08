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

public class OBBranchAndFinancialInstitutionIdentificationConverter {

    /**
     * Convert institution identification from V3 to V1
     * @param institutionIdentification4 institution identification in V3 format
     * @return institution identification in V1 format
     */
    public static OBBranchAndFinancialInstitutionIdentification2 toOBBranchAndFinancialInstitutionIdentification2(OBBranchAndFinancialInstitutionIdentification4 institutionIdentification4) {
        return new OBBranchAndFinancialInstitutionIdentification2()
                .identification(institutionIdentification4.getIdentification())
                .schemeName(OBExternalFinancialInstitutionIdentification2Code.valueOf(institutionIdentification4.getSchemeName()));
    }

    /**
     * Convert institution identification from V2 to V3
     * @param institutionIdentification2 institution identification in V2 format
     * @return institution identification in V3 format
     */
    public static OBBranchAndFinancialInstitutionIdentification4 toOBBranchAndFinancialInstitutionIdentification2(OBBranchAndFinancialInstitutionIdentification2 institutionIdentification2) {
        return new OBBranchAndFinancialInstitutionIdentification4()
                .identification(institutionIdentification2.getIdentification())
                .schemeName(institutionIdentification2.getSchemeName().toString());
    }
}
