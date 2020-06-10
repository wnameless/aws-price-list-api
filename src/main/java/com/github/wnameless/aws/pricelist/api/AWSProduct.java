/*
 *
 * Copyright 2020 Wei-Ming Wu
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package com.github.wnameless.aws.pricelist.api;

import com.github.wnameless.aws.pricelist.api.model.Offer;
import com.github.wnameless.aws.pricelist.api.model.OfferIndex;

/**
 * 
 * {@link AWSProduct} contains the service codes of all Amazon AWS products. It
 * allows you to get target {@link Offer} directly with
 * {@link OfferIndex#getOffer(AWSProduct)}.
 * 
 * @author Wei-Ming Wu
 *
 */
public enum AWSProduct {

  comprehend, mobileanalytics, AWSCertificateManager, AWSIoT, AmazonPersonalize,
  AWSStorageGatewayDeepArchive, transcribe, AppFlow, IngestionServiceSnowball,
  IoTDeviceDefender, AmazonRedshift, AmazonDetective, AmazonCloudWatch,
  AWSElementalMediaPackage, AWSElementalMediaStore, AmazonETS,
  AWSDatabaseMigrationSvc, AmazonGuardDuty, AmazonMCS, AmazonSageMaker,
  AWSDirectoryService, AmazonCognito, AmazonECS, AmazonECR, AmazonDAX, AWSGlue,
  AWSGlobalAccelerator, AmazonApiGateway, AmazonRoute53, AmazonCognitoSync,
  AmazonKinesisAnalytics, AmazonEKS, AmazonKendra, AmazonMSK, AmazonWorkMail,
  AWSIoT1Click, AmazonManagedBlockchain, AWSQueueService, AmazonAppStream,
  AmazonGlacier, AmazonSWF, AmazonRDS, AWSSecurityHub, CodeGuru,
  AWSSystemsManager, AmazonEC2, AWSDeviceFarm, AWSBackup, AWSConfig, AmazonSNS,
  AmazonA2I, IngestionService, datapipeline, AmazonElastiCache, AWSCodeCommit,
  AmazonFSx, AWSServiceCatalog, AmazonMacie, OpsWorks, AmazonSES, AmazonML,
  AlexaWebInfoService, ElasticMapReduce, AmazonDynamoDB, AmazonGameLift,
  AmazonMQ, AmazonEI, AmazonTextract, AmazonForecast, AmazonPolly, AWSAppSync,
  AWSIoTSiteWise, AmazonS3GlacierDeepArchive, CloudHSM, IoTDeviceManagement,
  AmazonES, AWSDataExchange, awskms, AmazonWorkLink, AWSOutposts,
  AmazonChimeDialin, AWSTransfer, AmazonChime, AmazonSimpleDB,
  AWSSecretsManager, AmazonCloudSearch, AmazonQuickSight, AmazonInspector,
  AWSIoTEvents, AWSAmplify, AmazonQLDB, AWSDirectConnect, translate, A4B,
  AmazonNeptune, AWSRoboMaker, AWSElementalMediaConvert, AWSIoTThingsGraph,
  AmazonAthena, AmazonLex, AmazonChimeCallMe, AWSStorageGateway, AWSELB,
  AmazonKinesisVideo, AWSSupportEnterprise, AWSXRay, AWSCloudMap, AWSBudgets,
  AWSEvents, AWSIoTAnalytics, AWSGreengrass, AWSCostExplorer, AWSFMS,
  AWSCodeDeploy, AWSCloudTrail, SnowballExtraDays, AWSCodePipeline,
  AmazonWorkSpaces, AmazonWorkDocs, AWSElementalMediaLive, AWSShield,
  AmazonKinesis, AmazonS3, AWSLambda, AmazonSumerian, AmazonLightsail,
  AmazonConnect, CodeBuild, AmazonHoneycode, AWSDataSync, AmazonEFS,
  ContactCenterTelecomm, AmazonPinpoint, AWSMediaConnect, comprehendmedical,
  AmazonChimeVoiceConnector, AmazonCloudFront, AmazonVPC, AlexaTopSites,
  AWSGroundStation, AWSDataTransfer, AmazonChimeBusinessCalling, AmazonWAM,
  AWSSupportBusiness, AmazonStates, AWSElementalMediaTailor, AWSCloudFormation,
  AWSDeveloperSupport, awswaf, AmazonRekognition, AmazonCloudDirectory,
  AmazonDocDB, AmazonKinesisFirehose;

}
