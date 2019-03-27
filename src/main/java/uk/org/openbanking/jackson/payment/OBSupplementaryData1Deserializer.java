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
package uk.org.openbanking.jackson.payment;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import uk.org.openbanking.datamodel.payment.OBSupplementaryData1;

import java.io.IOException;

public class OBSupplementaryData1Deserializer extends StdDeserializer<OBSupplementaryData1> {

    public OBSupplementaryData1Deserializer() {
        this(null);
    }

    public OBSupplementaryData1Deserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public OBSupplementaryData1 deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        String data = jsonParser.readValueAsTree().toString();
        OBSupplementaryData1 obSupplementaryData1 = new OBSupplementaryData1();
        obSupplementaryData1.setData(data);
        return obSupplementaryData1;
    }
}
