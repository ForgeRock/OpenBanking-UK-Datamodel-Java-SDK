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

package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * How often is credit interest calculated for the account.
 */
public enum OBFrequency1Code {
    DAILY("Daily"),

    HALFYEARLY("HalfYearly"),

    MONTHLY("Monthly"),

    OTHER("Other"),

    QUARTERLY("Quarterly"),

    PERSTATEMENTDATE("PerStatementDate"),

    WEEKLY("Weekly"),

    YEARLY("Yearly");

    private String value;

    OBFrequency1Code(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBFrequency1Code fromValue(String text) {
        for (OBFrequency1Code b : OBFrequency1Code.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
