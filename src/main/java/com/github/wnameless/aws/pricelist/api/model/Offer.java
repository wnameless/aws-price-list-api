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
package com.github.wnameless.aws.pricelist.api.model;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.wnameless.aws.pricelist.api.PriceListApi;
import com.github.wnameless.aws.pricelist.api.model.product.ProductRegionIndex;
import com.github.wnameless.aws.pricelist.api.model.product.ProductVersion;
import com.github.wnameless.aws.pricelist.api.model.product.ProductVersionIndex;

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
public class Offer {

  String offerCode;
  String versionIndexUrl;
  String currentVersionUrl;
  String currentRegionIndexUrl;
  String savingsPlanVersionIndexUrl;
  String currentSavingsPlanIndexUrl;

  /**
   * Returns a {@link ProductVersionIndex} by consuming the
   * {@link #versionIndexUrl}.
   * 
   * @return a {@link ProductVersionIndex}
   * @throws IOException
   *           if any I/O exception happened during the API requesting
   */
  public ProductVersionIndex getProductVersionIndex() throws IOException {
    return PriceListApi.INSTANCE.productVersionIndex(versionIndexUrl).execute()
        .body();
  }

  /**
   * Returns a {@link ProductVersion} by consuming the
   * {@link #currentVersionUrl}.
   * 
   * @return a {@link ProductVersion}
   * @throws IOException
   *           if any I/O exception happened during the API requesting
   */
  public ProductVersion getCurrentProductVersion() throws IOException {
    return PriceListApi.INSTANCE.productVersion(currentVersionUrl).execute()
        .body();
  }

  /**
   * Returns a {@link ProductRegionIndex} by consuming the
   * {@link #currentRegionIndexUrl}.
   * 
   * @return a {@link ProductRegionIndex}
   * @throws IOException
   *           if any I/O exception happened during the API requesting
   */
  public ProductRegionIndex getCurrentProductRegionIndex() throws IOException {
    return PriceListApi.INSTANCE.productRegionIndex(currentRegionIndexUrl)
        .execute().body();
  }

}
