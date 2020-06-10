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

import com.github.wnameless.aws.pricelist.api.model.OfferIndex;
import com.github.wnameless.aws.pricelist.api.model.product.ProductIndex;
import com.github.wnameless.aws.pricelist.api.model.product.ProductRegionIndex;
import com.github.wnameless.aws.pricelist.api.model.product.ProductVersion;
import com.github.wnameless.aws.pricelist.api.model.savingsplan.SavingsPlanIndex;
import com.github.wnameless.aws.pricelist.api.model.savingsplan.SavingsPlanRegion;
import com.github.wnameless.aws.pricelist.api.model.savingsplan.SavingsPlanVersion;
import com.github.wnameless.aws.pricelist.api.service.PriceListApiService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public enum PriceListApi implements PriceListApiService {

  INSTANCE;

  public static final String BASE_URL =
      "https://pricing.us-east-1.amazonaws.com";
  public static final String OFFER_INDEX_ENDPOINT = //
      "/offers/v1.0/aws/index.json";
  public static final String SAVINGS_PLAN_INDEX_ENDPOINT =
      "/savingsPlan/v1.0/aws/AWSComputeSavingsPlan/current/index.json";

  private final HttpLoggingInterceptor interceptor =
      new HttpLoggingInterceptor();
  private final PriceListApiService service;

  public Level getLoggingLevel() {
    return interceptor.getLevel();
  }

  public void setLoggingLevel(Level level) {
    interceptor.setLevel(level);
  }

  private PriceListApi() {
    OkHttpClient client =
        new OkHttpClient.Builder().addInterceptor(interceptor).build();
    Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).client(client)
        .addConverterFactory(JacksonConverterFactory.create()).build();

    service = retrofit.create(PriceListApiService.class);
  }

  @Override
  public Call<OfferIndex> offerIndex() {
    return service.offerIndex();
  }

  @Override
  public Call<ProductIndex> productIndex(String url) {
    return service.productIndex(url);
  }

  @Override
  public Call<ProductVersion> productVersion(String url) {
    return service.productVersion(url);
  }

  @Override
  public Call<ProductRegionIndex> productRegionIndex(String url) {
    return service.productRegionIndex(url);
  }

  @Override
  public Call<SavingsPlanIndex> savingsPlanIndex() {
    return service.savingsPlanIndex();
  }

  @Override
  public Call<SavingsPlanVersion> savingsPlanVersion(String url) {
    return service.savingsPlanVersion(url);
  }

  @Override
  public Call<SavingsPlanRegion> savingsPlanRegion(String url) {
    return service.savingsPlanRegion(url);
  }

}
