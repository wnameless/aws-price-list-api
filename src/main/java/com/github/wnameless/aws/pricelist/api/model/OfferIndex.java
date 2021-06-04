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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.wnameless.aws.pricelist.api.AWSOffer;
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
public class OfferIndex {

  /**
   * Returns the current {@link OfferIndex} by calling
   * {@code PriceListApi.INSTANCE.offerIndex()}.
   * 
   * @return an {@link OfferIndex}
   * @throws IOException
   *           if any I/O exception happened during the API requesting
   */
  public static OfferIndex get() throws IOException {
    return PriceListApi.INSTANCE.offerIndex().execute().body();
  }

  String formatVersion;
  String disclaimer;
  String publicationDate;
  Map<String, Offer> offers;

  /**
   * Returns a list contains all offers with savings plan existed.
   * 
   * @return a list of {@link Offer}
   */
  public List<Offer> getOffersWithSavingsPlan() {
    return offers.entrySet().stream()
        .filter(o -> o.getValue().getCurrentSavingsPlanIndexUrl() != null)
        .map(Entry::getValue).collect(Collectors.toList());
  }

  /**
   * Returns an {@link Offer} which matches the product described by the given
   * {@link AWSOffer}.
   * 
   * @param awsOffer
   *          used to find the target {@link Offer}
   * @return an {@link Offer} or null if the given {@link AWSOffer} is not
   *         matched any {@link Offer}
   */
  public Offer getOffer(AWSOffer awsOffer) {
    return offers.get(awsOffer.toString());
  }

}
