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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.github.wnameless.aws.pricelist.api.model.product.ProductRegion;
import com.github.wnameless.aws.pricelist.api.model.product.ProductRegionIndex;

/**
 * 
 * {@link AWSRegion} contains the region codes of all Amazon AWS regions. It
 * allows you to get target {@link ProductRegion} directly with
 * {@link ProductRegionIndex#getProductRegion(AWSRegion)}.
 * 
 * @author Wei-Ming Wu
 *
 */
public enum AWSRegion {

  any("Any"),

  af_south_1("Africa (Cape Town)"),

  ap_east_1("Asia Pacific (Hong Kong)"), //
  ap_south_1("Asia Pacific (Mumbai)"), //
  ap_northeast_1("Asia Pacific (Tokyo)",
      // Wavelength Zones
      "Asia Pacific (KDDI) - Osaka", //
      "Asia Pacific (KDDI) - Tokyo"),
  ap_northeast_2("Asia Pacific (Seoul)",
      // Wavelength Zones
      "Asia Pacific (SKT) - Daejeon"),
  ap_northeast_3("Asia Pacific (Osaka-Local)", "Asia Pacific (Osaka)"),
  ap_southeast_1("Asia Pacific (Singapore)"),
  ap_southeast_2("Asia Pacific (Sydney)"),

  ca_central_1("Canada (Central)"),

  cn_north_1("China (Beijing)"), //
  cn_northwest_1("China (Ningxia)"),

  eu_central_1("EU (Frankfurt)"), //
  eu_north_1("EU (Stockholm)"), //
  eu_south_1("EU (Milan)"), //
  eu_west_1("EU (Ireland)"), //
  eu_west_2("EU (London)"), //
  eu_west_3("EU (Paris)"),

  me_south_1("Middle East (Bahrain)"),

  us_east_1("US East (N. Virginia)", "US East (Boston)", "US East (Houston)",
      "US East (Miami)", //
      // Wavelength Zones
      "US East (Verizon) - Atlanta", //
      "US East (Verizon) - Boston", //
      "US East (Verizon) - Dallas", //
      "US East (Verizon) - Miami", //
      "US East (Verizon) - New York", //
      "US East (Verizon) - Washington DC"),
  us_east_2("US East (Ohio)"), //
  us_west_1("US West (N. California)"), //
  us_west_2("US West (Oregon)", "US West (Los Angeles)", //
      // Wavelength Zones
      "US West (Verizon) - Denver", //
      "US West (Verizon) - Las Vegas", //
      "US West (Verizon) - San Francisco Bay Area", //
      "US West (Verizon) - Seattle"),

  us_gov_east_1("AWS GovCloud (US-East)"), //
  us_gov_west_1("AWS GovCloud (US)", "AWS GovCloud (US-West)"),

  sa_east_1("South America (Sao Paulo)");

  private final String[] locations;

  private AWSRegion(String... locations) {
    this.locations = locations;
  }

  /**
   * Returns the name [ex: af-south-1] of a AWS region.
   * 
   * @return the name of a AWS region
   */
  public String getName() {
    return toString().replace('_', '-');
  }

  /**
   * Returns the location [ex: Africa (Cape Town)] of a AWS region.
   * 
   * @return the location of a AWS region
   */
  public List<String> getLocations() {
    return new ArrayList<>(Arrays.asList(locations));
  }

  /**
   * Finds a {@link AWSRegion} by its name [ex: af-south-1].
   * 
   * @param name
   *          of a AWS region
   * @return a {@link AWSRegion} or null if the name is not found
   */
  public static AWSRegion fromName(String name) {
    for (AWSRegion awsRegion : AWSRegion.values()) {
      if (awsRegion.getName().equals(name)) return awsRegion;
    }
    return null;
  }

  /**
   * Finds a {@link AWSRegion} by its location [ex: Africa (Cape Town)].
   * 
   * @param location
   *          of a AWS region
   * @return a {@link AWSRegion} or null if the location is not found
   */
  public static AWSRegion fromLocation(String location) {
    for (AWSRegion awsRegion : AWSRegion.values()) {
      if (awsRegion.getLocations().contains(location)) return awsRegion;
    }
    return null;
  }

}
