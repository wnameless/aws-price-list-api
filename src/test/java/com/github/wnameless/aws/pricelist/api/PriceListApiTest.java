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

import java.io.IOException;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.github.wnameless.aws.pricelist.api.model.Offer;
import com.github.wnameless.aws.pricelist.api.model.OfferIndex;
import com.github.wnameless.aws.pricelist.api.model.product.OnDemandDetail;
import com.github.wnameless.aws.pricelist.api.model.product.PriceDimension;
import com.github.wnameless.aws.pricelist.api.model.product.Product;
import com.github.wnameless.aws.pricelist.api.model.product.ProductRegion;
import com.github.wnameless.aws.pricelist.api.model.product.ProductRegionIndex;
import com.github.wnameless.aws.pricelist.api.model.product.ProductVersion;
import com.github.wnameless.aws.pricelist.api.model.savingsplan.SavingsPlan;
import com.github.wnameless.aws.pricelist.api.model.savingsplan.SavingsPlanIndex;
import com.github.wnameless.aws.pricelist.api.model.savingsplan.SavingsPlanRate;
import com.github.wnameless.aws.pricelist.api.model.savingsplan.SavingsPlanRegion;
import com.github.wnameless.aws.pricelist.api.model.savingsplan.SavingsPlanVersion;

import okhttp3.logging.HttpLoggingInterceptor.Level;

public class PriceListApiTest {

  @Test
  public void test() throws IOException {
    PriceListApi.INSTANCE.setLoggingLevel(Level.NONE);
    PriceListApi.INSTANCE.setLoggingLevel(Level.BASIC);
    PriceListApi.INSTANCE.setLoggingLevel(Level.HEADERS);
    PriceListApi.INSTANCE.setLoggingLevel(Level.BODY);

    OfferIndex offerIndex = OfferIndex.get();

    Offer offer = offerIndex.getOffer(AWSOffer.AmazonA2I);

    ProductRegionIndex productRegionIndex =
        offer.getCurrentProductRegionIndex();

    ProductRegion productRegion =
        productRegionIndex.getProductRegion(AWSRegion.eu_central_1);

    ProductVersion productVersion = productRegion.getProductVersion();
    for (Product product : productVersion.getProducts().values()) {
      product.getSku();
      product.getAttributes().getUsagetype();
      product.getAttributes().getOperation();

      Map<String, OnDemandDetail> onDemandDetails =
          productVersion.getTerms().getOnDemand().get(product.getSku());
      for (OnDemandDetail onDemandDetail : onDemandDetails.values()) {
        onDemandDetail.getSku();
        Map<String, PriceDimension> priceDimensions =
            onDemandDetail.getPriceDimensions();
        for (PriceDimension priceDimension : priceDimensions.values()) {
          priceDimension.getPricePerUnit().get("USD");
        }
      }
    }

    SavingsPlanIndex savingsPlanIndex = SavingsPlanIndex.get();
    SavingsPlanVersion savingsPlanVersion =
        savingsPlanIndex.getCurrentSavingsPlanVersion();

    SavingsPlanRegion savingsPlanRegion =
        savingsPlanVersion.getSavingsPlanRegion(AWSRegion.ap_northeast_1);

    for (SavingsPlan savingsPlan : savingsPlanRegion.getTerms()
        .getSavingsPlan()) {
      for (SavingsPlanRate rate : savingsPlan.getRates()) {
        rate.getDiscountedSku();
        rate.getDiscountedUsageType();
        rate.getDiscountedOperation();
        rate.getDiscountedRate();
      }
    }
  }

}
