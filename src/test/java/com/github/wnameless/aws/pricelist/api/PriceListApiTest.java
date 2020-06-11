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

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.github.wnameless.aws.pricelist.api.model.Offer;
import com.github.wnameless.aws.pricelist.api.model.OfferIndex;
import com.github.wnameless.aws.pricelist.api.service.PriceListApiService;

import net.sf.rubycollect4j.Ruby;

public class PriceListApiTest {

  @Test
  public void testPriceListApiInterface() throws IOException {
    assertTrue(PriceListApi.INSTANCE instanceof PriceListApi);
    assertTrue(PriceListApi.INSTANCE instanceof PriceListApiService);
  }

  @Disabled
  @Test
  public void testAllApi() throws IOException {
    OfferIndex offerIndex = OfferIndex.get();

    for (AWSOffer awsOffer : AWSOffer.values()) {
      Offer offer = offerIndex.getOffer(awsOffer);

      Ruby.Array
          .copyOf(offer.getCurrentProductVersion().getTerms().getOnDemand()
              .values())
          .lazy().flatMap(m -> Ruby.Array.copyOf(m.values()))
          .each(onDemandDetail -> {
            if (!onDemandDetail.getTermAttributes().isEmpty()) {
              onDemandDetail.getTermAttributes().entrySet().forEach(e -> {
                System.out.println(e.getKey().getClass().getName());
                System.out.println(e.getValue().getClass().getName());
              });
            }
          });
    }
  }

}
