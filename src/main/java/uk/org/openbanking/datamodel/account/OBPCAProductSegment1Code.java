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
 * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on.
 */
public enum OBPCAProductSegment1Code {
    BASIC("Basic"),

    BENEFITANDREWARD("BenefitAndReward"),

    CREDITINTEREST("CreditInterest"),

    CASHBACK("Cashback"),

    GENERAL("General"),

    GRADUATE("Graduate"),

    OTHER("Other"),

    OVERDRAFT("Overdraft"),

    PACKAGED("Packaged"),

    PREMIUM("Premium"),

    REWARD("Reward"),

    STUDENT("Student"),

    YOUNGADULT("YoungAdult"),

    YOUTH("Youth");

    private String value;

    OBPCAProductSegment1Code(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBPCAProductSegment1Code fromValue(String text) {
        for (OBPCAProductSegment1Code b : OBPCAProductSegment1Code.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}