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
package com.github.wnameless.aws.pricelist.api.model.product;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 
 * @see <a href=
 *      "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/using-ppslong.html">Using
 *      the bulk API</a>
 * 
 * @author Wei-Ming Wu
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ProductAttributes {

  @JsonProperty
  String servicecode;
  @JsonProperty
  String location;
  @JsonProperty
  String locationType;
  @JsonProperty
  String group;
  @JsonProperty
  String groupDescription;
  @JsonProperty
  String usagetype;
  @JsonProperty
  String operation;
  @JsonProperty
  String servicename;
  @JsonProperty
  String description;
  @JsonProperty
  String includedEvents;
  @JsonProperty
  String type;
  @JsonProperty
  String protocol;
  @JsonProperty
  String eventType;
  @JsonProperty
  String newcode;
  @JsonProperty
  String feeCode;
  @JsonProperty
  String feeDescription;
  @JsonProperty
  String storageClass;
  @JsonProperty
  String maximumCapacity;
  @JsonProperty
  String storageDescription;
  @JsonProperty
  String supportedModes;
  @JsonProperty
  String flow;
  @JsonProperty
  String jobnshipp;
  @JsonProperty
  String releaseType;
  @JsonProperty
  String snowballType;
  @JsonProperty
  String transferType;
  @JsonProperty
  String fromLocation;
  @JsonProperty
  String fromLocationType;
  @JsonProperty
  String toLocation;
  @JsonProperty
  String toLocationType;
  @JsonProperty
  String feature;
  @JsonProperty
  String instanceType;
  @JsonProperty
  String currentGeneration;
  @JsonProperty
  String vcpu;
  @JsonProperty
  String memory;
  @JsonProperty
  String storage;
  @JsonProperty
  String io;
  @JsonProperty
  String ecu;
  @JsonProperty
  String usageFamily;
  @JsonProperty
  String concurrencyscalingfreeusage;
  @JsonProperty
  String storageMedia;
  @JsonProperty
  String dataType;
  @JsonProperty
  String alarmType;
  @JsonProperty
  String version;
  @JsonProperty
  String availability;
  @JsonProperty
  String ingestType;
  @JsonProperty
  String durability;
  @JsonProperty
  String storageclass;
  @JsonProperty
  String transcodingResult;
  @JsonProperty
  String videoResolution;
  @JsonProperty
  String instanceFamily;
  @JsonProperty
  String physicalProcessor;
  @JsonProperty
  String clockSpeed;
  @JsonProperty
  String networkPerformance;
  @JsonProperty
  String processorArchitecture;
  @JsonProperty
  String availabilityZone;
  @JsonProperty
  String dedicatedEbsThroughput;
  @JsonProperty
  String enhancedNetworkingSupported;
  @JsonProperty
  String processorFeatures;
  @JsonProperty
  String volumeType;
  @JsonProperty
  String minVolumeSize;
  @JsonProperty
  String maxVolumeSize;
  @JsonProperty
  String component;
  @JsonProperty
  String computeType;
  @JsonProperty
  String gpu;
  @JsonProperty
  String gpuMemory;
  @JsonProperty
  String instanceName;
  @JsonProperty
  String physicalCpu;
  @JsonProperty
  String physicalGpu;
  @JsonProperty
  String vCpu;
  @JsonProperty
  String maxThroughputvolume;
  @JsonProperty
  String automaticLabel;
  @JsonProperty
  String labelingTaskType;
  @JsonProperty
  String workforceType;
  @JsonProperty
  String integratingApi;
  @JsonProperty
  String integratingFeature;
  @JsonProperty
  String integratingService;
  @JsonProperty
  String directorySize;
  @JsonProperty
  String directoryType;
  @JsonProperty
  String directoryTypeDescription;
  @JsonProperty
  String pricingUnit;
  @JsonProperty
  String tenancy;
  @JsonProperty
  String cputype;
  @JsonProperty
  String memorytype;
  @JsonProperty
  String storageType;
  @JsonProperty
  String clientLocation;
  @JsonProperty
  String dominantnondominant;
  @JsonProperty
  String trafficDirection;
  @JsonProperty
  String cacheMemorySizeGb;
  @JsonProperty
  String routingType;
  @JsonProperty
  String routingTarget;
  @JsonProperty
  String resourceEndpoint;
  @JsonProperty
  String tiertype;
  @JsonProperty
  String computeFamily;
  @JsonProperty
  String storageFamily;
  @JsonProperty
  String freeTier;
  @JsonProperty
  String mailboxStorage;
  @JsonProperty
  String device;
  @JsonProperty
  String deviceType;
  @JsonProperty
  String frameworkType;
  @JsonProperty
  String messageDeliveryFrequency;
  @JsonProperty
  String messageDeliveryOrder;
  @JsonProperty
  String queueType;
  @JsonProperty
  String operatingSystem;
  @JsonProperty
  String instanceFunction;
  @JsonProperty
  String memoryGib;
  @JsonProperty
  String osLicenseModel;
  @JsonProperty
  String videoMemoryGib;
  @JsonProperty
  String licenseModel;
  @JsonProperty
  String comments;
  @JsonProperty
  String engineCode;
  @JsonProperty
  String databaseEngine;
  @JsonProperty
  String databaseEdition;
  @JsonProperty
  String deploymentOption;
  @JsonProperty
  String instanceTypeFamily;
  @JsonProperty
  String normalizationSizeFactor;
  @JsonProperty
  String standardGroup;
  @JsonProperty
  String standardStorage;
  @JsonProperty
  String findingGroup;
  @JsonProperty
  String findingSource;
  @JsonProperty
  String findingStorage;
  @JsonProperty
  String baseProductReferenceCode;
  @JsonProperty
  String dataTransfer;
  @JsonProperty
  String gets;
  @JsonProperty
  String parameterType;
  @JsonProperty
  String throughput;
  @JsonProperty
  String describes;
  @JsonProperty
  String opsItems;
  @JsonProperty
  String updates;
  @JsonProperty
  String instances;
  @JsonProperty
  String steps;
  @JsonProperty
  String capacitystatus;
  @JsonProperty
  String instancesku;
  @JsonProperty
  String intelAvxAvailable;
  @JsonProperty
  String intelAvx2Available;
  @JsonProperty
  String intelTurboAvailable;
  @JsonProperty
  String preInstalledSw;
  @JsonProperty
  String instance;
  @JsonProperty
  String instanceCapacity12xlarge;
  @JsonProperty
  String instanceCapacity2xlarge;
  @JsonProperty
  String instanceCapacityLarge;
  @JsonProperty
  String instanceCapacityXlarge;
  @JsonProperty
  String physicalCores;
  @JsonProperty
  String instanceCapacity10xlarge;
  @JsonProperty
  String instanceCapacity4xlarge;
  @JsonProperty
  String instanceCapacity16xlarge;
  @JsonProperty
  String instanceCapacity8xlarge;
  @JsonProperty
  String provisioned;
  @JsonProperty
  String volumeApiName;
  @JsonProperty
  String instanceCapacity24xlarge;
  @JsonProperty
  String instanceCapacityMetal;
  @JsonProperty
  String instanceCapacity18xlarge;
  @JsonProperty
  String instanceCapacity9xlarge;
  @JsonProperty
  String maxIopsvolume;
  @JsonProperty
  String maxIopsBurstPerformance;
  @JsonProperty
  String resourceType;
  @JsonProperty
  String ebsOptimized;
  @JsonProperty
  String instanceCapacity32xlarge;
  @JsonProperty
  String instanceCapacityMedium;
  @JsonProperty
  String productType;
  @JsonProperty
  String elasticGraphicsType;
  @JsonProperty
  String executionMode;
  @JsonProperty
  String meterMode;
  @JsonProperty
  String os;
  @JsonProperty
  String deviceOs;
  @JsonProperty
  String storagetype;
  @JsonProperty
  String ciType;
  @JsonProperty
  String category;
  @JsonProperty
  String endpointType;
  @JsonProperty
  String dataAction;
  @JsonProperty
  String executionFrequency;
  @JsonProperty
  String executionLocation;
  @JsonProperty
  String frequencyMode;
  @JsonProperty
  String cacheEngine;
  @JsonProperty
  String fileSystemType;
  @JsonProperty
  String throughputCapacity;
  @JsonProperty
  String withActiveUsers;
  @JsonProperty
  String activityType;
  @JsonProperty
  String classificationType;
  @JsonProperty
  String contentSource;
  @JsonProperty
  String contentType;
  @JsonProperty
  String logsSource;
  @JsonProperty
  String logsType;
  @JsonProperty
  String serverLocation;
  @JsonProperty
  String origin;
  @JsonProperty
  String recipient;
  @JsonProperty
  String machineLearningProcess;
  @JsonProperty
  String softwareType;
  @JsonProperty
  String instanceStorageGb;
  @JsonProperty
  String brokerEngine;
  @JsonProperty
  String enhancedNetworkingSupport;
  @JsonProperty
  String acceleratorSize;
  @JsonProperty
  String acceleratorType;
  @JsonProperty
  String apiType;
  @JsonProperty
  String entityType;
  @JsonProperty
  String groupDetails;
  @JsonProperty
  String cachememorysize;
  @JsonProperty
  String graphqloperation;
  @JsonProperty
  String realtimeoperation;
  @JsonProperty
  String trialProduct;
  @JsonProperty
  String upfrontCommitment;
  @JsonProperty
  String indexingSource;
  @JsonProperty
  String deploymentModel;
  @JsonProperty
  String country;
  @JsonProperty
  String outpostsUnit;
  @JsonProperty
  String paymentOption;
  @JsonProperty
  String paymentTerm;
  @JsonProperty
  String callingType;
  @JsonProperty
  String data;
  @JsonProperty
  String endpoint;
  @JsonProperty
  String licenseType;
  @JsonProperty
  String cloudSearchVersion;
  @JsonProperty
  String edition;
  @JsonProperty
  String subscriptionType;
  @JsonProperty
  String freeUsageIncluded;
  @JsonProperty
  String awsiotevents;
  @JsonProperty
  String instancetype;
  @JsonProperty
  String datatransferout;
  @JsonProperty
  String ioRequestType;
  @JsonProperty
  String georegioncode;
  @JsonProperty
  String virtualInterfaceType;
  @JsonProperty
  String directConnectLocation;
  @JsonProperty
  String portSpeed;
  @JsonProperty
  String inputMode;
  @JsonProperty
  String outputMode;
  @JsonProperty
  String deploymentModelDescription;
  @JsonProperty
  String codec;
  @JsonProperty
  String frameRate;
  @JsonProperty
  String resolution;
  @JsonProperty
  String singleOrDualPass;
  @JsonProperty
  String tier;
  @JsonProperty
  String vqSetting;
  @JsonProperty
  String videoCodec;
  @JsonProperty
  String videoFrameRate;
  @JsonProperty
  String videoQualitySetting;
  @JsonProperty
  String addonFeature;
  @JsonProperty
  String freeQueryTypes;
  @JsonProperty
  String tocountry;
  @JsonProperty
  String readtype;
  @JsonProperty
  String accountAssistance;
  @JsonProperty
  String architecturalReview;
  @JsonProperty
  String architectureSupport;
  @JsonProperty
  String bestPractices;
  @JsonProperty
  String caseSeverityresponseTimes;
  @JsonProperty
  String customerServiceAndCommunities;
  @JsonProperty
  String includedServices;
  @JsonProperty
  String launchSupport;
  @JsonProperty
  String operationsSupport;
  @JsonProperty
  String proactiveGuidance;
  @JsonProperty
  String programmaticCaseManagement;
  @JsonProperty
  String technicalSupport;
  @JsonProperty
  String thirdpartySoftwareSupport;
  @JsonProperty
  String training;
  @JsonProperty
  String whoCanOpenCases;
  @JsonProperty
  String tenancySupport;
  @JsonProperty
  String requestType;
  @JsonProperty
  String granularity;
  @JsonProperty
  String awsresource;
  @JsonProperty
  String deploymentLocation;
  @JsonProperty
  String insightstype;
  @JsonProperty
  String bundle;
  @JsonProperty
  String license;
  @JsonProperty
  String rootvolume;
  @JsonProperty
  String runningMode;
  @JsonProperty
  String softwareIncluded;
  @JsonProperty
  String uservolume;
  @JsonProperty
  String freeTrial;
  @JsonProperty
  String maximumStorageVolume;
  @JsonProperty
  String minimumStorageVolume;
  @JsonProperty
  String bitRate;
  @JsonProperty
  String input;
  @JsonProperty
  String output;
  @JsonProperty
  String pipeline;
  @JsonProperty
  String videoQuality;
  @JsonProperty
  String reserveType;
  @JsonProperty
  String maximumExtendedStorage;
  @JsonProperty
  String standardStorageRetentionIncluded;
  @JsonProperty
  String offer;
  @JsonProperty
  String dataTransferQuota;
  @JsonProperty
  String engine;
  @JsonProperty
  String highAvailability;
  @JsonProperty
  String overageType;
  @JsonProperty
  String countsAgainstQuota;
  @JsonProperty
  String freeOverage;
  @JsonProperty
  String channel;
  @JsonProperty
  String usageTier;
  @JsonProperty
  String productSchemaDescription;
  @JsonProperty
  String throughputClass;
  @JsonProperty
  String accessType;
  @JsonProperty
  String lineType;
  @JsonProperty
  String meteringType;
  @JsonProperty
  String flowType;
  @JsonProperty
  String fromcountry;
  @JsonProperty
  String messagetype;
  @JsonProperty
  String calltype;
  @JsonProperty
  String numbertype;
  @JsonProperty
  String requestDescription;
  @JsonProperty
  String attachmentType;
  @JsonProperty
  String bandwidth;
  @JsonProperty
  String groundstation;
  @JsonProperty
  String ondemand;
  @JsonProperty
  String planType;
  @JsonProperty
  String operationType;
  @JsonProperty
  String cloudformationresourceProvider;

  Map<String, Object> otherAttributes;

  @JsonAnySetter
  public void addOtherAttribute(String key, Object value) {
    if (otherAttributes == null) {
      otherAttributes = new LinkedHashMap<>();
    }
    otherAttributes.put(key, value);
  }

}
