[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.wnameless.aws/aws-price-list-api/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.wnameless.aws/aws-price-list-api)

aws-price-list-api
=============
A Java wrapper to Amazon AWS Price List (web) API.

## Maven Repo
```xml
<dependency>
	<groupId>com.github.wnameless.aws</groupId>
	<artifactId>aws-price-list-api</artifactId>
	<version>1.0.0</version>
</dependency>
```
## Important
It's only a Java wrapper to AWS AWS Price List API, aka the bulk API, and it has nothing to do with the AWS AWS Price List Service API, aka the query API. If you need the query API, you should go ask for the Amazon AWS Java SDK library.
# Quick Start

## OfferIndex
```java
// Get the OfferIndex which contains all offers of AWS
OfferIndex offerIndex = OfferIndex.get();

// Select an offer called AmazonA2I
Offer offer = offerIndex.getOffer(AWSOffer.AmazonA2I);

// Get all AmazonA2I products by region
ProductRegionIndex productRegionIndex = offer.getCurrentProductRegionIndex();

// Select products under region eu-central-1
ProductRegion productRegion = productRegionIndex.getProductRegion(AWSRegion.eu_central_1);

// Iterate all products
for (Product product : productRegion.getProductVersion().getProducts().values()) {
  product.getSku();
  product.getAttributes().getUsagetype();
  product.getAttributes().getOperation();
}

// Browse the OnDemand term under a product SKU
Map<String, OnDemandDetail> onDemandDetails = productVersion.getTerms().getOnDemand().get(product.getSku());
for (OnDemandDetail onDemandDetail : onDemandDetails.values()) {
  onDemandDetail.getSku();
  Map<String, PriceDimension> priceDimensions = onDemandDetail.getPriceDimensions();
  for (PriceDimension priceDimension : priceDimensions.values()) {
    priceDimension.getPricePerUnit().get("USD");
  }
}
```
## SavingsPlanIndex
```java
// Get the SavingsPlanIndex which contains all SavingsPlan of AWS
SavingsPlanIndex savingsPlanIndex = SavingsPlanIndex.get();

// Get current version of SavingsPlan
SavingsPlanVersion savingsPlanVersion = savingsPlanIndex.getCurrentSavingsPlanVersion();

// Get all SavingsPlan under region ap-northeast-1
SavingsPlanRegion savingsPlanRegion = savingsPlanVersion.getSavingsPlanRegion(AWSRegion.ap_northeast_1);

// Iterate all discounted rates under different sku, usageType and operation
for (SavingsPlan savingsPlan : savingsPlanRegion.getTerms().getSavingsPlan()) {
  for (SavingsPlanRate rate : savingsPlan.getRates()) {
    rate.getDiscountedSku();
    rate.getDiscountedUsageType();
    rate.getDiscountedOperation();
    rate.getDiscountedRate();
  }
}
```

### Logging Level
```java
// Log nothing
PriceListApi.INSTANCE.setLoggingLevel(Level.NONE);
// Log request and response lines
PriceListApi.INSTANCE.setLoggingLevel(Level.BASIC);
// Log request and response lines with header
PriceListApi.INSTANCE.setLoggingLevel(Level.HEADERS);
// Log request and response lines, header and body
PriceListApi.INSTANCE.setLoggingLevel(Level.BODY);
```
