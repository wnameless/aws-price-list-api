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

import com.github.wnameless.aws.pricelist.api.service.OfferApi;
import com.github.wnameless.aws.pricelist.api.service.ProductApi;
import com.github.wnameless.aws.pricelist.api.service.SavingsPlanApi;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public enum PriceListApi {

  INSTANCE;

  public OfferApi offerApi;
  public ProductApi productApi;
  public SavingsPlanApi savingsPlanApi;

  private OkHttpClient.Builder defaultBuilder = new OkHttpClient.Builder();

  private PriceListApi() {
    OkHttpClient client = getDefaultBuilder().build();
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(PriceListApiConstant.ENDPOINT).client(client)
        .addConverterFactory(JacksonConverterFactory.create()).build();

    offerApi = retrofit.create(OfferApi.class);
    productApi = retrofit.create(ProductApi.class);
    savingsPlanApi = retrofit.create(SavingsPlanApi.class);
  }

  public OkHttpClient.Builder getDefaultBuilder() {
    return defaultBuilder;
  }

  public void setDefaultBuilder(OkHttpClient.Builder defaultBuilder) {
    this.defaultBuilder = defaultBuilder;
  }

  public void enableLogger() {
    HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
    interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    OkHttpClient client =
        getDefaultBuilder().addInterceptor(interceptor).build();
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(PriceListApiConstant.ENDPOINT).client(client)
        .addConverterFactory(JacksonConverterFactory.create()).build();

    offerApi = retrofit.create(OfferApi.class);
    productApi = retrofit.create(ProductApi.class);
    savingsPlanApi = retrofit.create(SavingsPlanApi.class);
  }

  public void disableLogger() {
    OkHttpClient client = getDefaultBuilder().build();
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(PriceListApiConstant.ENDPOINT).client(client)
        .addConverterFactory(JacksonConverterFactory.create()).build();

    offerApi = retrofit.create(OfferApi.class);
    productApi = retrofit.create(ProductApi.class);
    savingsPlanApi = retrofit.create(SavingsPlanApi.class);
  }

}
