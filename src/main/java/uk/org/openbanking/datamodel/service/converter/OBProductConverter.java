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

import uk.org.openbanking.datamodel.account.OBExternalProductType1Code;
import uk.org.openbanking.datamodel.account.OBExternalProductType2Code;
import uk.org.openbanking.datamodel.account.OBProduct1;
import uk.org.openbanking.datamodel.account.OBProduct2;

/**
 * Convert OB product data-model in different version
 */
public class OBProductConverter {

    /**
     * Convert a product in V2 to V1
     * @param obProduct2 product in V2 format
     * @return product in V1 format
     */
    public static OBProduct1 toProduct1(OBProduct2 obProduct2) {
        OBProduct1 product1 = new OBProduct1()
                .accountId(obProduct2.getAccountId())
                .productType(OBExternalProductType1Code.valueOf(obProduct2.getProductType().toString()));


        if (obProduct2.getProductId() != null) {
            product1.productIdentifier(obProduct2.getProductId());
        }
        if (obProduct2.getProductName() != null) {
            product1.productName(obProduct2.getProductName());
        }
        if (obProduct2.getSecondaryProductId() != null) {
            product1.secondaryProductIdentifier(obProduct2.getSecondaryProductId());
        }

        return product1;
    }

    /**
     * Convert a product in V1 to V2
     * @param obProduct1 product in V1 format
     * @return product in V2 format
     */
    public static OBProduct2 toProduct2(OBProduct1 obProduct1) {
        OBProduct2 product2 = new OBProduct2()
                .accountId(obProduct1.getAccountId())
                .productType(OBExternalProductType2Code.valueOf(obProduct1.getProductType().toString()));

        if (obProduct1.getProductIdentifier() != null) {
            product2.productId(obProduct1.getProductIdentifier());
        }
        if (obProduct1.getProductName() != null) {
            product2.productName(obProduct1.getProductName());
        }
        if (obProduct1.getSecondaryProductIdentifier() != null) {
            product2.secondaryProductId(obProduct1.getSecondaryProductIdentifier());
        }

        return product2;
    }
}
