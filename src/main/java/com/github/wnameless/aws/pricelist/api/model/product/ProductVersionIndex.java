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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
public class ProductVersionIndex {

  String formatVersion;
  String disclaimer;
  String publicationDate;
  String offerCode;
  String currentVersion;
  Map<String, ProductVersionUrl> versions;

  /**
   * Returns the current {@link ProductVersionUrl}.
   * 
   * @return the current {@link ProductVersionUrl}
   */
  public ProductVersionUrl getCurrentProductVersionUrl() {
    return versions.get(currentVersion);
  }

  /**
   * Returns a {@link ProductVersion} by executing
   * {@link ProductVersionUrl#getProductVersion()} from the
   * {@link ProductVersionUrl} returning by
   * {@link #getCurrentProductVersionUrl()}.
   * 
   * @return a {@link ProductVersion}
   * @throws IOException
   *           if any I/O exception happened during the API requesting
   */
  public ProductVersion getCurrentProductVersion() throws IOException {
    return getCurrentProductVersionUrl().getProductVersion();
  }

}
