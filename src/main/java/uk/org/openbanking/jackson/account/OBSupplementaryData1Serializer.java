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

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import uk.org.openbanking.datamodel.account.OBSupplementaryData1;

import java.io.IOException;

public class OBSupplementaryData1Serializer extends StdSerializer<OBSupplementaryData1> {

    public OBSupplementaryData1Serializer() {
        this(null);
    }

    public OBSupplementaryData1Serializer(Class<OBSupplementaryData1> t) {
        super(t);
    }

    @Override
    public void serialize(OBSupplementaryData1 supplementaryData1, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = mapper.readTree(supplementaryData1.getData());
        jsonGenerator.writeObject(actualObj);
    }
}
