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
import com.github.wnameless.aws.pricelist.api.PriceListApi;

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
public class SavingsPlanIndex {

  /**
   * Returns the current {@link SavingsPlanIndex} by calling
   * {@code PriceListApi.INSTANCE.savingsPlanIndex()}.
   * 
   * @return a {@link SavingsPlanIndex}
   * @throws IOException
   *           if any I/O exception happened during the API requesting
   */
  public static SavingsPlanIndex get() throws IOException {
    return PriceListApi.INSTANCE.savingsPlanIndex().execute().body();
  }

  String disclaimer;
  String publicationDate;
  String currentOfferVersionUrl;
  List<SavingsPlanVersionUrl> versions;
  String formatVersion;

  /**
   * Returns a {@link SavingsPlanVersion} by consuming the
   * {@link #currentOfferVersionUrl}.
   * 
   * @return a {@link SavingsPlanVersion}
   * @throws IOException
   *           if any I/O exception happened during the API requesting
   */
  public SavingsPlanVersion getCurrentSavingsPlanVersion() throws IOException {
    return PriceListApi.INSTANCE.savingsPlanVersion(currentOfferVersionUrl)
        .execute().body();
  }

}
