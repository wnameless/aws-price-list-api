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

import com.github.wnameless.aws.pricelist.api.model.OfferIndex;
import com.github.wnameless.aws.pricelist.api.model.product.Product;
import com.github.wnameless.aws.pricelist.api.model.product.ProductVersion;

public class PriceListApiApp {

  public static void main(String[] args) throws IOException {
    // PriceListApi.INSTANCE.enableLogger();

    // Set<String> attrs = new LinkedHashSet<>();

    for (var pn : AWSProduct.values()) {
      System.out.println(pn);

      ProductVersion pv = OfferIndex.get().getOffer(pn).getProductIndex()
          .getCurrentProductVersion();

      for (Product p : pv.getProducts().values()) {
        System.out.println(p.getAttributes().getOtherAttributes());
      }
    }

    // System.out.println(attrs);
  }

}
