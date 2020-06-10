module com.github.wnameless.aws.pricelist.api {
  requires static lombok;

  requires okhttp3;
  requires transitive okhttp3.logging;
  requires retrofit2;
  requires retrofit2.converter.jackson;
  requires com.fasterxml.jackson.annotation;

  exports com.github.wnameless.aws.pricelist.api;
  exports com.github.wnameless.aws.pricelist.api.model;
  exports com.github.wnameless.aws.pricelist.api.model.product;
  exports com.github.wnameless.aws.pricelist.api.model.savingsplan;
  exports com.github.wnameless.aws.pricelist.api.service;
}