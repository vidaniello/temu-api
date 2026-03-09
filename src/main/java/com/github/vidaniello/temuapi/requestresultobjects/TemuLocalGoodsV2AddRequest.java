package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'temu.local.goods.v2.add'.
 * Used to add a new product.
 */
public class TemuLocalGoodsV2AddRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Language.
	 */
	private String language;
	
	/**
	 * Basic product information.
	 */
	private GoodsBasic goodsBasic;
	
	/**
	 * Seller Service Information.
	 */
	private GoodsServicePromise goodsServicePromise;
	
	/**
	 * Product attribute.
	 */
	private List<GoodsProperty> goodsProperty;
	
	/**
	 * Country/region of Origin.
	 */
	private GoodsOriginInfo goodsOriginInfo;
	
	/**
	 * Size chart information.
	 */
	private GoodsSize goodsSize;
	
	/**
	 * List of SKUs. There must be at least one SKU.
	 */
	private List<SkuList> skuList;
		
	public TemuLocalGoodsV2AddRequest() {
		this.goodsProperty = new ArrayList<>();
		this.skuList = new ArrayList<>();
	}
	
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	
	/**
	 * @param language the language
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsV2AddRequest setLanguage(String language) {
		this.language = language;
		return this;
	}
	
	/**
	 * @return the basic product information
	 */
	public GoodsBasic getGoodsBasic() {
		return goodsBasic;
	}
	
	/**
	 * @param goodsBasic the basic product information
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsV2AddRequest setGoodsBasic(GoodsBasic goodsBasic) {
		this.goodsBasic = goodsBasic;
		return this;
	}
	
	/**
	 * @return the seller service information
	 */
	public GoodsServicePromise getGoodsServicePromise() {
		return goodsServicePromise;
	}
	
	/**
	 * @param goodsServicePromise the seller service information
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsV2AddRequest setGoodsServicePromise(GoodsServicePromise goodsServicePromise) {
		this.goodsServicePromise = goodsServicePromise;
		return this;
	}
	
	/**
	 * @return the list of product attributes
	 */
	public List<GoodsProperty> getGoodsProperty() {
		return goodsProperty;
	}
	
	/**
	 * @param goodsProperty the list of product attributes
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsV2AddRequest setGoodsProperty(List<GoodsProperty> goodsProperty) {
		this.goodsProperty = goodsProperty;
		return this;
	}
	
	/**
	 * @return the country/region of origin
	 */
	public GoodsOriginInfo getGoodsOriginInfo() {
		return goodsOriginInfo;
	}
	
	/**
	 * @param goodsOriginInfo the country/region of origin
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsV2AddRequest setGoodsOriginInfo(GoodsOriginInfo goodsOriginInfo) {
		this.goodsOriginInfo = goodsOriginInfo;
		return this;
	}
	
	/**
	 * @return the size chart information
	 */
	public GoodsSize getGoodsSize() {
		return goodsSize;
	}
	
	/**
	 * @param goodsSize the size chart information
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsV2AddRequest setGoodsSize(GoodsSize goodsSize) {
		this.goodsSize = goodsSize;
		return this;
	}
	
	/**
	 * @return the list of SKUs
	 */
	public List<SkuList> getSkuList() {
		return skuList;
	}
	
	/**
	 * @param skuList the list of SKUs
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsV2AddRequest setSkuList(List<SkuList> skuList) {
		this.skuList = skuList;
		return this;
	}
	
	/**
	 * Basic product information.
	 */
	public static class GoodsBasic implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * The product name.
		 */
		private String goodsName;
		
		/**
		 * Leaf category ID. It can be obtained through bg.local.goods.cats.get.
		 */
		private Long catId;
		
		/**
		 * Product Description: For detailed product display decoration.
		 */
		private String goodsDesc;
		
		/**
		 * Brand Information.
		 */
		private Brand brand;
		
		/**
		 * Bullet Points.
		 */
		private List<String> bulletPoints;
		
		/**
		 * A list of images and video to display in the product gallery.
		 */
		private GoodsGallery goodsGallery;
		
		/**
		 * This is used to associate the SKU between TEMU and the external ecommerce platform.
		 * Must be unique within the store. Max length: 40 characters.
		 */
		private String externalGoodsId;
		
		/**
		 * Product type. 1: Normal product, 2: Custom product, 3: Made-to-order product.
		 */
		private Integer productType;
		
		/**
		 * Product tax code.
		 */
		private String itemTaxCode;
		
		/**
		 * Second-hand information.
		 */
		private SecondHand secondHand;
			
		public GoodsBasic() {
			this.bulletPoints = new ArrayList<>();
		}
		
		public String getGoodsName() {
			return goodsName;
		}
		
		public GoodsBasic setGoodsName(String goodsName) {
			this.goodsName = goodsName;
			return this;
		}
		
		public Long getCatId() {
			return catId;
		}
		
		public GoodsBasic setCatId(Long catId) {
			this.catId = catId;
			return this;
		}
		
		public String getGoodsDesc() {
			return goodsDesc;
		}
		
		public GoodsBasic setGoodsDesc(String goodsDesc) {
			this.goodsDesc = goodsDesc;
			return this;
		}
		
		public Brand getBrand() {
			return brand;
		}
		
		public GoodsBasic setBrand(Brand brand) {
			this.brand = brand;
			return this;
		}
		
		public List<String> getBulletPoints() {
			return bulletPoints;
		}
		
		public GoodsBasic setBulletPoints(List<String> bulletPoints) {
			this.bulletPoints = bulletPoints;
			return this;
		}
		
		public GoodsGallery getGoodsGallery() {
			return goodsGallery;
		}
		
		public GoodsBasic setGoodsGallery(GoodsGallery goodsGallery) {
			this.goodsGallery = goodsGallery;
			return this;
		}
		
		public String getExternalGoodsId() {
			return externalGoodsId;
		}
		
		public GoodsBasic setExternalGoodsId(String externalGoodsId) {
			this.externalGoodsId = externalGoodsId;
			return this;
		}
		
		public Integer getProductType() {
			return productType;
		}
		
		public GoodsBasic setProductType(Integer productType) {
			this.productType = productType;
			return this;
		}
		
		public String getItemTaxCode() {
			return itemTaxCode;
		}
		
		public GoodsBasic setItemTaxCode(String itemTaxCode) {
			this.itemTaxCode = itemTaxCode;
			return this;
		}
		
		public SecondHand getSecondHand() {
			return secondHand;
		}
		
		public GoodsBasic setSecondHand(SecondHand secondHand) {
			this.secondHand = secondHand;
			return this;
		}
		
		/**
		 * Brand Information.
		 */
		public static class Brand implements java.io.Serializable {
			
			private static final long serialVersionUID = 1L;
			
			/**
			 * Trademark ID.
			 */
			private Long trademarkId;
			
			/**
			 * True: The product does not have brand or trademark information.
			 * False: The product has brand and trademark information.
			 */
			private Boolean noTrademark;
				
			public Brand() {
			}
			
			public Long getTrademarkId() {
				return trademarkId;
			}
			
			public Brand setTrademarkId(Long trademarkId) {
				this.trademarkId = trademarkId;
				return this;
			}
			
			public Boolean getNoTrademark() {
				return noTrademark;
			}
			
			public Brand setNoTrademark(Boolean noTrademark) {
				this.noTrademark = noTrademark;
				return this;
			}
		}
		
		/**
		 * A list of images and video to display in the product gallery.
		 */
		public static class GoodsGallery implements java.io.Serializable {
			
			private static final long serialVersionUID = 1L;
			
			/**
			 * Detail video. The id of the video.
			 */
			private String detailVideoId;
			
			/**
			 * The product video will be displayed at the top of the product page.
			 */
			private List<String> detailImage;
			
			/**
			 * The product video will be displayed at the top of the product page at the first of the carousel.
			 */
			private String carouselVideoId;
				
			public GoodsGallery() {
				this.detailImage = new ArrayList<>();
			}
			
			public String getDetailVideoId() {
				return detailVideoId;
			}
			
			public GoodsGallery setDetailVideoId(String detailVideoId) {
				this.detailVideoId = detailVideoId;
				return this;
			}
			
			public List<String> getDetailImage() {
				return detailImage;
			}
			
			public GoodsGallery setDetailImage(List<String> detailImage) {
				this.detailImage = detailImage;
				return this;
			}
			
			public String getCarouselVideoId() {
				return carouselVideoId;
			}
			
			public GoodsGallery setCarouselVideoId(String carouselVideoId) {
				this.carouselVideoId = carouselVideoId;
				return this;
			}
		}
		
		/**
		 * Second-hand information.
		 */
		public static class SecondHand implements java.io.Serializable {
			
			private static final long serialVersionUID = 1L;
			
			/**
			 * Business Scope: 0 - Regular items; 1 - Collectibles; 2 - Luxury Items.
			 */
			private Integer businessScope;
			
			/**
			 * Temu rating of the item's secondhand condition.
			 */
			private Integer level;
			
			/**
			 * External agency name.
			 */
			private String insName;
			
			/**
			 * External agency rating of the item's secondhand condition.
			 */
			private String grade;
				
			public SecondHand() {
			}
			
			public Integer getBusinessScope() {
				return businessScope;
			}
			
			public SecondHand setBusinessScope(Integer businessScope) {
				this.businessScope = businessScope;
				return this;
			}
			
			public Integer getLevel() {
				return level;
			}
			
			public SecondHand setLevel(Integer level) {
				this.level = level;
				return this;
			}
			
			public String getInsName() {
				return insName;
			}
			
			public SecondHand setInsName(String insName) {
				this.insName = insName;
				return this;
			}
			
			public String getGrade() {
				return grade;
			}
			
			public SecondHand setGrade(String grade) {
				this.grade = grade;
				return this;
			}
		}
	}
	
	/**
	 * Seller Service Information.
	 */
	public static class GoodsServicePromise implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Indicates the time, in days, between when you receive an order and when you can ship the item.
		 */
		private Integer shipmentLimitDay;
		
		/**
		 * Delivery Method: 1 - Self-fulfillment.
		 */
		private Integer fulfillmentType;
		
		/**
		 * Shipping template ID.
		 */
		private String costTemplateId;
			
		public GoodsServicePromise() {
		}
		
		public Integer getShipmentLimitDay() {
			return shipmentLimitDay;
		}
		
		public GoodsServicePromise setShipmentLimitDay(Integer shipmentLimitDay) {
			this.shipmentLimitDay = shipmentLimitDay;
			return this;
		}
		
		public Integer getFulfillmentType() {
			return fulfillmentType;
		}
		
		public GoodsServicePromise setFulfillmentType(Integer fulfillmentType) {
			this.fulfillmentType = fulfillmentType;
			return this;
		}
		
		public String getCostTemplateId() {
			return costTemplateId;
		}
		
		public GoodsServicePromise setCostTemplateId(String costTemplateId) {
			this.costTemplateId = costTemplateId;
			return this;
		}
	}
	
	/**
	 * Product attribute.
	 */
	public static class GoodsProperty implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Attribute ID.
		 */
		private Long refPid;
		
		/**
		 * Attribute value ID.
		 */
		private Long vid;
		
		/**
		 * Custom attribute values.
		 */
		private String value;
		
		/**
		 * Numerical values of attributes.
		 */
		private String numberInputValue;
		
		/**
		 * Unit for the product attribute.
		 */
		private Long valueUnitId;
			
		public GoodsProperty() {
		}
		
		public Long getRefPid() {
			return refPid;
		}
		
		public GoodsProperty setRefPid(Long refPid) {
			this.refPid = refPid;
			return this;
		}
		
		public Long getVid() {
			return vid;
		}
		
		public GoodsProperty setVid(Long vid) {
			this.vid = vid;
			return this;
		}
		
		public String getValue() {
			return value;
		}
		
		public GoodsProperty setValue(String value) {
			this.value = value;
			return this;
		}
		
		public String getNumberInputValue() {
			return numberInputValue;
		}
		
		public GoodsProperty setNumberInputValue(String numberInputValue) {
			this.numberInputValue = numberInputValue;
			return this;
		}
		
		public Long getValueUnitId() {
			return valueUnitId;
		}
		
		public GoodsProperty setValueUnitId(Long valueUnitId) {
			this.valueUnitId = valueUnitId;
			return this;
		}
	}
	
	/**
	 * Country/region of Origin.
	 */
	public static class GoodsOriginInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Primary Address, representing country or region.
		 */
		private String originRegion1;
		
		/**
		 * Secondary Address, representing province or state.
		 */
		private String originRegion2;
			
		public GoodsOriginInfo() {
		}
		
		public String getOriginRegion1() {
			return originRegion1;
		}
		
		public GoodsOriginInfo setOriginRegion1(String originRegion1) {
			this.originRegion1 = originRegion1;
			return this;
		}
		
		public String getOriginRegion2() {
			return originRegion2;
		}
		
		public GoodsOriginInfo setOriginRegion2(String originRegion2) {
			this.originRegion2 = originRegion2;
			return this;
		}
	}
	
	/**
	 * Size chart information.
	 */
	public static class GoodsSize implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * The URL of the size chart image.
		 */
		private List<String> goodsSizeImage;
		
		/**
		 * Grouping of size specification values.
		 */
		private Integer groupId;
			
		public GoodsSize() {
			this.goodsSizeImage = new ArrayList<>();
		}
		
		public List<String> getGoodsSizeImage() {
			return goodsSizeImage;
		}
		
		public GoodsSize setGoodsSizeImage(List<String> goodsSizeImage) {
			this.goodsSizeImage = goodsSizeImage;
			return this;
		}
		
		public Integer getGroupId() {
			return groupId;
		}
		
		public GoodsSize setGroupId(Integer groupId) {
			this.groupId = groupId;
			return this;
		}
	}
	
	/**
	 * List of SKUs.
	 */
	public static class SkuList implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * SKU images.
		 */
		private List<String> images;
		
		/**
		 * Pricing information.
		 */
		private Price price;
		
		/**
		 * Inventory quantity.
		 */
		private Long quantity;
		
		/**
		 * External SKU code.
		 */
		private String externalSkuId;
		
		/**
		 * Product Package Information.
		 */
		private PackageInfo packageInfo;
		
		/**
		 * Specifications used for this SKU.
		 */
		private List<SpecDetails> specDetails;
		
		/**
		 * External product code type, 1=EAN 2=UPC 3=ISBN 4=GTIN-14.
		 */
		private Integer barCodeType;
		
		/**
		 * External goods code.
		 */
		private String barCodeId;
		
		/**
		 * Product links on external platforms.
		 */
		private String referenceLink;
			
		public SkuList() {
			this.images = new ArrayList<>();
			this.specDetails = new ArrayList<>();
		}
		
		public List<String> getImages() {
			return images;
		}
		
		public SkuList setImages(List<String> images) {
			this.images = images;
			return this;
		}
		
		public Price getPrice() {
			return price;
		}
		
		public SkuList setPrice(Price price) {
			this.price = price;
			return this;
		}
		
		public Long getQuantity() {
			return quantity;
		}
		
		public SkuList setQuantity(Long quantity) {
			this.quantity = quantity;
			return this;
		}
		
		public String getExternalSkuId() {
			return externalSkuId;
		}
		
		public SkuList setExternalSkuId(String externalSkuId) {
			this.externalSkuId = externalSkuId;
			return this;
		}
		
		public PackageInfo getPackageInfo() {
			return packageInfo;
		}
		
		public SkuList setPackageInfo(PackageInfo packageInfo) {
			this.packageInfo = packageInfo;
			return this;
		}
		
		public List<SpecDetails> getSpecDetails() {
			return specDetails;
		}
		
		public SkuList setSpecDetails(List<SpecDetails> specDetails) {
			this.specDetails = specDetails;
			return this;
		}
		
		public Integer getBarCodeType() {
			return barCodeType;
		}
		
		public SkuList setBarCodeType(Integer barCodeType) {
			this.barCodeType = barCodeType;
			return this;
		}
		
		public String getBarCodeId() {
			return barCodeId;
		}
		
		public SkuList setBarCodeId(String barCodeId) {
			this.barCodeId = barCodeId;
			return this;
		}
		
		public String getReferenceLink() {
			return referenceLink;
		}
		
		public SkuList setReferenceLink(String referenceLink) {
			this.referenceLink = referenceLink;
			return this;
		}
		
		/**
		 * Pricing information.
		 */
		public static class Price implements java.io.Serializable {
			
			private static final long serialVersionUID = 1L;
			
			/**
			 * Base Price.
			 */
			private PriceInfo basePrice;
			
			/**
			 * Market price (must be higher than basePrice).
			 */
			private PriceInfo listPrice;
				
			public Price() {
			}
			
			public PriceInfo getBasePrice() {
				return basePrice;
			}
			
			public Price setBasePrice(PriceInfo basePrice) {
				this.basePrice = basePrice;
				return this;
			}
			
			public PriceInfo getListPrice() {
				return listPrice;
			}
			
			public Price setListPrice(PriceInfo listPrice) {
				this.listPrice = listPrice;
				return this;
			}
		}
		
		/**
		 * Price information (amount and currency).
		 */
		public static class PriceInfo implements java.io.Serializable {
			
			private static final long serialVersionUID = 1L;
			
			/**
			 * Amount.
			 */
			private String amount;
			
			/**
			 * Currency.
			 */
			private String currency;
				
			public PriceInfo() {
			}
			
			public String getAmount() {
				return amount;
			}
			
			public PriceInfo setAmount(String amount) {
				this.amount = amount;
				return this;
			}
			
			public String getCurrency() {
				return currency;
			}
			
			public PriceInfo setCurrency(String currency) {
				this.currency = currency;
				return this;
			}
		}
		
		/**
		 * Product Package Information.
		 */
		public static class PackageInfo implements java.io.Serializable {
			
			private static final long serialVersionUID = 1L;
			
			/**
			 * Weight.
			 */
			private String weight;
			
			/**
			 * Length.
			 */
			private String length;
			
			/**
			 * Width.
			 */
			private String width;
			
			/**
			 * Height.
			 */
			private String height;
				
			public PackageInfo() {
			}
			
			public String getWeight() {
				return weight;
			}
			
			public PackageInfo setWeight(String weight) {
				this.weight = weight;
				return this;
			}
			
			public String getLength() {
				return length;
			}
			
			public PackageInfo setLength(String length) {
				this.length = length;
				return this;
			}
			
			public String getWidth() {
				return width;
			}
			
			public PackageInfo setWidth(String width) {
				this.width = width;
				return this;
			}
			
			public String getHeight() {
				return height;
			}
			
			public PackageInfo setHeight(String height) {
				this.height = height;
				return this;
			}
		}
		
		/**
		 * Specifications used for this SKU.
		 */
		public static class SpecDetails implements java.io.Serializable {
			
			private static final long serialVersionUID = 1L;
			
			/**
			 * Parent specification ID.
			 */
			private Long parentSpecId;
			
			/**
			 * Specification ID.
			 */
			private Long specId;
			
			/**
			 * Custom specification values.
			 */
			private String specName;
				
			public SpecDetails() {
			}
			
			public Long getParentSpecId() {
				return parentSpecId;
			}
			
			public SpecDetails setParentSpecId(Long parentSpecId) {
				this.parentSpecId = parentSpecId;
				return this;
			}
			
			public Long getSpecId() {
				return specId;
			}
			
			public SpecDetails setSpecId(Long specId) {
				this.specId = specId;
				return this;
			}
			
			public String getSpecName() {
				return specName;
			}
			
			public SpecDetails setSpecName(String specName) {
				this.specName = specName;
				return this;
			}
		}
	}
}