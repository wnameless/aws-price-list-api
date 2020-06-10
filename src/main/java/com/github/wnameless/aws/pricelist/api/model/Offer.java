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

import com.github.wnameless.aws.pricelist.api.PriceListApi;
import com.github.wnameless.aws.pricelist.api.model.product.ProductIndex;
import com.github.wnameless.aws.pricelist.api.model.product.ProductRegionIndex;
import com.github.wnameless.aws.pricelist.api.model.product.ProductVersion;

import lombok.Data;

@Data
public class Offer {

  String offerCode;
  String versionIndexUrl;
  String currentVersionUrl;
  String currentRegionIndexUrl;
  String savingsPlanVersionIndexUrl;
  String currentSavingsPlanIndexUrl;

  public ProductIndex getProductIndex() throws IOException {
    return PriceListApi.INSTANCE.productIndex(versionIndexUrl).execute().body();
  }

  public ProductVersion getProductVersion() throws IOException {
    return PriceListApi.INSTANCE.productVersion(currentVersionUrl).execute()
        .body();
  }

  public ProductRegionIndex getProductRegionIndex() throws IOException {
    return PriceListApi.INSTANCE.productRegionIndex(currentRegionIndexUrl)
        .execute().body();
  }

}
