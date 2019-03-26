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
package uk.org.openbanking.jackson.account;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import uk.org.openbanking.datamodel.payment.OBSupplementaryData1;

import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OBSupplementarySerializerTest {

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void serialize() throws IOException {

        //Given
        String expectedValue = "{\"foo\":\"bar\"}";

        //When
        OBSupplementaryData1 obSupplementaryData1 = mapper.readValue(expectedValue, OBSupplementaryData1.class);
        String resultValue = mapper.writeValueAsString(obSupplementaryData1);

        //Then
        assertThat(expectedValue, is(resultValue));

    }
}