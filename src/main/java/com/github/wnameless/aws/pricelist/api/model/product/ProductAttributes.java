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

import lombok.Data;

@Data
public class ProductAttributes {

  String servicecode;
  String location;
  String locationType;
  String instanceType;
  String currentGeneration;
  String instanceFamily;
  String cputype;
  String vcpu;
  String physicalProcessor;
  String clockSpeed;
  String memory;
  String memorytype;
  String storage;
  String networkPerformance;
  String processorArchitecture;
  String tenancy;
  String operatingSystem;
  String licenseModel;
  String usagetype;
  String operation;
  String capacitystatus;
  String dedicatedEbsThroughput;
  String ecu;
  String enhancedNetworkingSupported;
  String instancesku;
  String intelAvxAvailable;
  String intelAvx2Available;
  String intelTurboAvailable;
  String normalizationSizeFactor;
  String preInstalledSw;
  String processorFeatures;
  String servicename;
  String group;
  String groupDescription;
  String description;
  String includedEvents;
  String type;
  String protocol;
  String eventType;
  String newcode;
  String feeCode;
  String feeDescription;
  String storageClass;
  String maximumCapacity;
  String storageDescription;
  String supportedModes;
  String flow;
  String jobnshipp;
  String releaseType;
  String snowballType;
  String transferType;
  String fromLocation;
  String fromLocationType;
  String toLocation;
  String toLocationType;
  String feature;
  String io;
  String usageFamily;
  String concurrencyscalingfreeusage;
  String storageMedia;
  String dataType;
  String alarmType;
  String version;
  String availability;
  String ingestType;
  String durability;

  String storageclass;

  public String getStorageclass() {
    return storageclass;
  }

  public void setStorageclass(String storageclass) {
    this.storageclass = storageclass;
  }

}
