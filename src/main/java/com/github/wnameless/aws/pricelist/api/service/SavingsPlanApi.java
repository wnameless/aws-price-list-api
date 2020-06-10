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

import com.github.wnameless.aws.pricelist.api.PriceListApiConstant;
import com.github.wnameless.aws.pricelist.api.model.savingsplan.SavingsPlanIndex;
import com.github.wnameless.aws.pricelist.api.model.savingsplan.SavingsPlanRegion;
import com.github.wnameless.aws.pricelist.api.model.savingsplan.SavingsPlanVersion;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SavingsPlanApi {

  @GET(PriceListApiConstant.SAVINGS_PLAN_INDEX)
  Call<SavingsPlanIndex> index();

  @GET("{url}")
  Call<SavingsPlanVersion> savingsPlanVersion(
      @Path(value = "url", encoded = true) String url);

  @GET("{url}")
  Call<SavingsPlanRegion> savingsPlanRegion(
      @Path(value = "url", encoded = true) String url);

}
