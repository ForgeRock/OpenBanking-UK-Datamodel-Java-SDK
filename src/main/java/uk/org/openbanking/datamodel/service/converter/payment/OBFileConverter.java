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
package uk.org.openbanking.datamodel.service.converter.payment;

import uk.org.openbanking.datamodel.payment.*;

public class OBFileConverter {

    public static OBFile2 toOBFile2(OBFile1 obFile1) {
        return new OBFile2()
                .controlSum(obFile1.getControlSum())
                .debtorAccount(obFile1.getDebtorAccount())
                .fileHash(obFile1.getFileHash())
                .fileReference(obFile1.getFileReference())
                .fileType(obFile1.getFileType())
                .localInstrument(obFile1.getLocalInstrument())
                .numberOfTransactions(obFile1.getNumberOfTransactions())
                .requestedExecutionDateTime(obFile1.getRequestedExecutionDateTime())
                .remittanceInformation(obFile1.getRemittanceInformation());
    }

    public static OBFile1 toOBFile1(OBFile2 obFile2) {
        return new OBFile1()
                .controlSum(obFile2.getControlSum())
                .debtorAccount(obFile2.getDebtorAccount())
                .fileHash(obFile2.getFileHash())
                .fileReference(obFile2.getFileReference())
                .fileType(obFile2.getFileType())
                .localInstrument(obFile2.getLocalInstrument())
                .numberOfTransactions(obFile2.getNumberOfTransactions())
                .requestedExecutionDateTime(obFile2.getRequestedExecutionDateTime())
                .remittanceInformation(obFile2.getRemittanceInformation());
    }

    public static OBWriteFileConsent2 toOBWriteFileConsent2(OBWriteFileConsent1 obWriteFileConsent1) {
        return new OBWriteFileConsent2()
                .data(new OBWriteDataFileConsent2()
                        .authorisation(obWriteFileConsent1.getData().getAuthorisation())
                        .initiation(toOBFile2(obWriteFileConsent1.getData().getInitiation()))
                );
    }

    public static OBWriteFileConsent1 toOBWriteFileConsent1(OBWriteFileConsent2 obWriteFileConsent2) {
        return new OBWriteFileConsent1()
                .data(new OBWriteDataFileConsent1()
                        .authorisation(obWriteFileConsent2.getData().getAuthorisation())
                        .initiation(toOBFile1(obWriteFileConsent2.getData().getInitiation()))
                );
    }

    public static OBWriteFile2 toOBWriteFile2(OBWriteFile1 obWriteFile1) {
        return new OBWriteFile2()
                .data(new OBWriteDataFile2()
                        .consentId(obWriteFile1.getData().getConsentId())
                        .initiation(toOBFile2(obWriteFile1.getData().getInitiation()))
                );
    }

    public static OBWriteFile1 toOBWriteFile1(OBWriteFile2 obWriteFile2) {
        return new OBWriteFile1()
                .data(new OBWriteDataFile1()
                        .consentId(obWriteFile2.getData().getConsentId())
                        .initiation(toOBFile1(obWriteFile2.getData().getInitiation()))
                );
    }
}
