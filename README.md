<!--
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2017 ForgeRock AS.
-->
[![Build Status](https://travis-ci.org/ForgeRock/OpenBanking-Java-SDK.svg?branch=master)](https://travis-ci.org/ForgeRock/OpenBanking-Java-SDK)
# OpenBanking-Java-SDK
A Java SDK to help implementing the Open Banking standard : https://www.openbanking.org.uk/read-write-apis/  .
This project is compiled with JDK 8.

## Usage
```
<dependency>
    <groupId>com.forgerock.openbanking</groupId>
    <artifactId>openbanking-sdk</artifactId>
    <version>3.1.2.0</version>
</dependency>

```

## Class generation
Many of the classes are generated from OB Swagger documentation. When a new version of OB API is released, 
the following steps are performed:
1. Download the Swagger json files from OB Spec pages (e.g. for 3.1.1 accounts: https://openbanking.atlassian.net/wiki/spaces/DZ/pages/999622968/Account+and+Transaction+API+Specification+-+v3.1.1#AccountandTransactionAPISpecification-v3.1.1-SwaggerSpecification)
>Note: there are currently swagger files for Accounts, Payments, Funds Confirmation, ASPSP Callback and TPP Events - more may be available in future releases).
1. Download `swagger-codegen-cli-2.4.5.jar`
1. Run ```
java -jar swagger-codegen-cli-2.4.5.jar generate \
  -i {your_json_file} \
  -DuseBeanValidation=true \
  -Dmodels \
  --model-package uk.org.openbanking.datamodel \
  --group-id com.forgerock.openbanking \
  --artifact-id openbanking-sdk \
  -l java \
  --library resttemplate \
  -o generated```
 1. Check the generated files and copy them into appropriate source directory. Do not overwrite existing files.
 1. Remove Links, Meta, OBError1 and OBErrorResponse1 - we use shared generic versions of these classes.
 1. Repeat generation for each new swagger json file
 1. If using Intelij, run format and optimise imports on newly generated files. 
 1. Increment the major or minor version in pom.xml
 1. Run build to ensure everything compiles and copyrights are generated for new source files.
 1. Commit and raise PR.  

## Release to maven central 
This project is built and released to maven using Travis CI. When a change is merged to master branch, Travis CI will increment the version, build the project, sign the release artifacts and release it to maven central (https://oss.sonatype.org).
We no longer use Bintray in this project.

## Licence
License:	CDDLv1.0 \
License URL	: https://opensource.org/licenses/CDDL-1.0
