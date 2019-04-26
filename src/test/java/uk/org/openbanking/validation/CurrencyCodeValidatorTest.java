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
package uk.org.openbanking.validation;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CurrencyCodeValidatorTest {

    private final CurrencyCodeValidator currencyCodeValidator = new CurrencyCodeValidator();

    @Test
    public void isValid() {
        assertThat(currencyCodeValidator.isValid("GBP", null), is(true));
        assertThat(currencyCodeValidator.isValid("EUR", null), is(true));
        assertThat(currencyCodeValidator.isValid("USD", null), is(true));
        assertThat(currencyCodeValidator.isValid("TRY", null), is(true));
        assertThat(currencyCodeValidator.isValid("XTS", null), is(true));

        assertThat(currencyCodeValidator.isValid("", null), is(false));
        assertThat(currencyCodeValidator.isValid(null, null), is(false));
        assertThat(currencyCodeValidator.isValid("A", null), is(false));
        assertThat(currencyCodeValidator.isValid("AB", null), is(false));
        assertThat(currencyCodeValidator.isValid("NCC", null), is(false));
        assertThat(currencyCodeValidator.isValid("ABCD", null), is(false));
        assertThat(currencyCodeValidator.isValid("1234", null), is(false));
    }
}