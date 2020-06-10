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
package com.github.wnameless.aws.pricelist.api.model.product;

import java.io.IOException;
import java.util.Map;

import lombok.Data;

@Data
public class ProductIndex {

  String formatVersion;
  String disclaimer;
  String publicationDate;
  String offerCode;
  String currentVersion;
  Map<String, ProductVersionUrl> versions;

  public ProductVersionUrl getCurrentProductVersionUrl() {
    return versions.get(currentVersion);
  }

  public ProductVersion getCurrentProductVersion() throws IOException {
    return getCurrentProductVersionUrl().getProductVersion();
  }

}
