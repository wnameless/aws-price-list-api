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
package com.github.wnameless.aws.pricelist.api.service;

import com.github.wnameless.aws.pricelist.api.PriceListApi;
import com.github.wnameless.aws.pricelist.api.model.OfferIndex;
import com.github.wnameless.aws.pricelist.api.model.product.ProductIndex;
import com.github.wnameless.aws.pricelist.api.model.product.ProductRegionIndex;
import com.github.wnameless.aws.pricelist.api.model.product.ProductVersion;
import com.github.wnameless.aws.pricelist.api.model.savingsplan.SavingsPlanIndex;
import com.github.wnameless.aws.pricelist.api.model.savingsplan.SavingsPlanRegion;
import com.github.wnameless.aws.pricelist.api.model.savingsplan.SavingsPlanVersion;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PriceListApiService {

  /**
   * Makes a request to "/offers/v1.0/aws/index.json".
   * 
   * @return a {@link Call} can be execute to get an {@link OfferIndex}
   */
  @GET(PriceListApi.OFFER_INDEX_ENDPOINT)
  Call<OfferIndex> offerIndex();

  /**
   * Makes a request to the given url which has the pattern like
   * "/offers/v1.0/aws/{servicecode}/index.json".
   * 
   * @return a {@link Call} can be execute to get a {@link ProductIndex}
   */
  @GET("{url}")
  Call<ProductIndex> productIndex(
      @Path(value = "url", encoded = true) String url);

  /**
   * Makes a request to the given url which has the pattern like
   * "/offers/v1.0/aws/{servicecode}/current/index.json".
   * 
   * @return a {@link Call} can be execute to get a {@link ProductVersion}
   */
  @GET("{url}")
  Call<ProductVersion> productVersion(
      @Path(value = "url", encoded = true) String url);

  /**
   * Makes a request to the given url which has the pattern like
   * "/offers/v1.0/aws/{servicecode}/current/region_index.json".
   * 
   * @return a {@link Call} can be execute to get a {@link ProductRegionIndex}
   */
  @GET("{url}")
  Call<ProductRegionIndex> productRegionIndex(
      @Path(value = "url", encoded = true) String url);

  /**
   * Makes a request to
   * "/savingsPlan/v1.0/aws/AWSComputeSavingsPlan/current/index.json".
   * 
   * @return a {@link Call} can be execute to get a {@link SavingsPlanIndex}
   */
  @GET(PriceListApi.SAVINGS_PLAN_INDEX_ENDPOINT)
  Call<SavingsPlanIndex> savingsPlanIndex();

  /**
   * Makes a request to the given url which has the pattern like
   * "/savingsPlan/v1.0/aws/AWSComputeSavingsPlan/{version}/region_index.json".
   * 
   * @return a {@link Call} can be execute to get a {@link SavingsPlanVersion}
   */
  @GET("{url}")
  Call<SavingsPlanVersion> savingsPlanVersion(
      @Path(value = "url", encoded = true) String url);

  /**
   * Makes a request to the given url which has the pattern like
   * "/savingsPlan/v1.0/aws/AWSComputeSavingsPlan/{version}/{region}/index.json".
   * 
   * @return a {@link Call} can be execute to get a {@link SavingsPlanRegion}
   */
  @GET("{url}")
  Call<SavingsPlanRegion> savingsPlanRegion(
      @Path(value = "url", encoded = true) String url);

}
