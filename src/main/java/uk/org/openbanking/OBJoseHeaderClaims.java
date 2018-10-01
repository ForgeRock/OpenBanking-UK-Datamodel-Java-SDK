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
package uk.org.openbanking;

public class OBJoseHeaderClaims {

    /**
     * The algorithm that will be used for signing the JWS.
     *
     * The list of valid algorithms is here https://tools.ietf.org/html/rfc7518#section-3.1.
     *
     * The algorithms that will be supported by OB will be specified in the future.
     */
    public static final String ALG = "alg";

    /**
     * This must match the certificate id of the certificate selected in step 1.
     */
    public static final String KID = "kid";

    /**
     * This must have the boolean value false.
     *
     * This indicates that the message payload is not base64 url encoded.
     *
     * (See RFC 7797 – The “b64” header Parameter)
     */
    public static final String B64 = "b64";

    /**
     * This must be a JSON number representing the number of seconds from 1970-01-01T0:0:0Z as measured in UTC
     * until the date/time.
     *
     * This is a private header parameter name. (See RFC 7515 – Private Header Parameter Names)
     */
    public static final String OB_IAT = "http://openbanking.org.uk/iat";

    /**
     * This must be a string containing the id of the TPP. This must match the dn of the signing certificate.
     *
     * This is a private header parameter name. (See RFC 7515 – Private Header Parameter Names)
     */
    public static final String OB_ISS = "http://openbanking.org.uk/iss";

    /**
     *
     * This must be a string array consisting of the values “b64”, “http://openbanking.org.uk/iat“,
     * “http://openbanking.org.uk/iss“
     *
     * This indicates that the JWS signature validator must understand and process the three additional claims.
     */
    public static final String OB_CRIT = "crit";
}
