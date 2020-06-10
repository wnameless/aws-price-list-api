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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.github.wnameless.aws.pricelist.api.AWSProduct;
import com.github.wnameless.aws.pricelist.api.PriceListApi;

import lombok.Data;

@Data
public class OfferIndex {

  public static OfferIndex get() throws IOException {
    return PriceListApi.INSTANCE.offerIndex().execute().body();
  }

  String formatVersion;
  String disclaimer;
  String publicationDate;
  Map<String, Offer> offers;

  public List<Offer> getOffersWithSavingsPlan() {
    return offers.entrySet().stream()
        .filter(o -> o.getValue().getCurrentSavingsPlanIndexUrl() != null)
        .map(Entry::getValue).collect(Collectors.toList());
  }

  public Offer getOffer(AWSProduct awsProduct) {
    return offers.get(awsProduct.toString());
  }

}
