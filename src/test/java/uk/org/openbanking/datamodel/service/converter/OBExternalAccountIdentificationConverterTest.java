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

import org.junit.Test;
import uk.org.openbanking.datamodel.account.OBExternalAccountIdentification3Code;
import uk.org.openbanking.datamodel.account.OBExternalAccountIdentification4Code;
import uk.org.openbanking.datamodel.payment.OBExternalAccountIdentification2Code;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class OBExternalAccountIdentificationConverterTest {

    @Test
    public void toOBExternalAccountIdentification3_fromOBExternalAccountIdentification4Code() {
        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.SORTCODEACCOUNTNUMBER),
                is(OBExternalAccountIdentification3Code.SORTCODEACCOUNTNUMBER));

        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.IBAN),
                is(OBExternalAccountIdentification3Code.IBAN));


        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.PAN),
                is(OBExternalAccountIdentification3Code.PAN));

        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.BBAN),
                nullValue());

        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.PAYM),
                nullValue());
    }

    @Test
    public void toOBExternalAccountIdentification3_fromOBExternalAccountIdentification2Code() {
        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(OBExternalAccountIdentification2Code.SortCodeAccountNumber),
                is(OBExternalAccountIdentification3Code.SORTCODEACCOUNTNUMBER));

        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(OBExternalAccountIdentification2Code.IBAN),
                is(OBExternalAccountIdentification3Code.IBAN));
    }

    @Test
    public void toOBExternalAccountIdentification4_fromOBExternalAccountIdentification2Code() {
        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification4(OBExternalAccountIdentification2Code.SortCodeAccountNumber),
                is(OBExternalAccountIdentification4Code.SORTCODEACCOUNTNUMBER));

        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification4(OBExternalAccountIdentification2Code.IBAN),
                is(OBExternalAccountIdentification4Code.IBAN));

    }

    @Test
    public void toOBExternalAccountIdentification4_fromOBExternalAccountIdentification3Code() {
        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification4(OBExternalAccountIdentification3Code.SORTCODEACCOUNTNUMBER),
                is(OBExternalAccountIdentification4Code.SORTCODEACCOUNTNUMBER));

        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification4(OBExternalAccountIdentification3Code.IBAN),
                is(OBExternalAccountIdentification4Code.IBAN));


        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification4(OBExternalAccountIdentification3Code.PAN),
                is(OBExternalAccountIdentification4Code.PAN));
    }
}