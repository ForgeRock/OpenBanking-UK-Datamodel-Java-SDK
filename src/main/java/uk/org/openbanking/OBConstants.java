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
 *  Copyright 2017 ForgeRock AS.
 *
 */

package uk.org.openbanking;

/**
 * All the constants defined by the Open Banking standard.
 */
public class OBConstants {
    public static final String JWT_BEARER_CLIENT_ASSERTION_TYPE =
            "urn:ietf:params:oauth:client-assertion-type:jwt-bearer";
    public static final String INTENT_ID_VALUE_PREFIX = "urn:alphabank:intent:";

    public static class IdTokenClaim {
        public static final String INTENT_ID = "openbanking_intent_id";
        public static final String ACR = "acr";
        public static final String C_HASH = "c_hash";
        public static final String S_HASH = "s_hash";
        public static final String ID_TOKEN = "id_token";
        public static final String USER_INFO = "user_info";
        public static final String CLAIMS = "claims";
    }

    public static class OIDCClaim {
        public static final String GRANT_TYPE = "grant_type";
        public static final String ID_TOKEN = "id_token";
        public static final String USER_INFO = "user_info";
        public static final String CLAIMS = "claims";
        public static final String CONSENT_APPROVAL_REDIRECT_URI = "consentApprovalRedirectUri";
        public static final String RESPONSE_TYPE = "response_type";
        public static final String CLIENT_ID = "client_id";
        public static final String REDIRECT_URI = "redirect_uri";
        public static final String REQUEST = "request";
        public static final String SCOPE = "scope";
        public static final String STATE = "state";
        public static final String NONCE = "nonce";
        public static final String SCOPE_REGISTER_PAYMENT = "registerPayment";
        public static final String SCOPE_OPENID = "openid";
        public static final String SCOPE_ACCOUNT = "account";
        public static final String CLIENT_ASSERTION_TYPE = "client_assertion_type";
        public static final String CLIENT_ASSERTION = "client_assertion";
        public static final String CODE = "code";
    }

    public static class Scope {
        public static final String REGISTER_PAYMENT = "registerPayment";
        public static final String OPENID = "openid";
        public static final String ACCOUNT = "account";
    }

    public static class ResponseType {
        public static final String CODE = "code";
        public static final String ID_TOKEN = "id_token";
    }

    public static class GrantType {
        public static final String CLIENT_CREDENTIAL = "client_credentials";
        public static final String AUTHORIZATION_CODE = "authorization_code";
    }
}
