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
package com.github.wnameless.aws.pricelist.api.model.savingsplan;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.wnameless.aws.pricelist.api.AWSRegion;

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
public class SavingsPlanVersion {

  String disclaimer;
  String publicationDate;
  List<SavingsPlanRegionUrl> regions;
  String formatVersion;

  /**
   * Returns a {@link SavingsPlanRegion} which matches the region described by
   * the given {@link AWSRegion} by searching in this.{@link #regions}.
   * 
   * @param awsRegion
   *          used to find the target {@link SavingsPlanRegion}
   * @return a {@link SavingsPlanRegion} or null if he given {@link AWSRegion}
   *         is not matched any {@link SavingsPlanRegion}
   * @throws IOException
   *           if any I/O exception happened during the API requesting
   */
  public SavingsPlanRegion getSavingsPlanRegion(AWSRegion awsRegion)
      throws IOException {
    for (SavingsPlanRegionUrl region : regions) {
      if (AWSRegion.fromName(region.getRegionCode()) != null) {
        return region.getSavingsPlanRegion();
      }
    }
    return null;
  }

}
