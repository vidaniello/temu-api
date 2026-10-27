package com.github.vidaniello.temuapi.requestresultobjects;

import java.io.Serializable;
import java.util.List;

/**
 * Response object for the API call 'bg.local.goods.detail.query'.
 * Struttura rilevata empiricamente su ambiente di produzione (campi null
 * omessi da Gson quando assenti).
 */
public class BgLocalGoodsDetailQueryResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;

	private Long goodsId;
	private String goodsName;
	private String goodsDesc;
	private Long catId;
	private String catName;
	private String outGoodsSn;
	private Integer productType;
	private Integer subStatus;
	private Boolean customized;
	private String hsCode;
	private String importDesignation;
	private String secondHand;
	private List<SkuList> skuList;
	private GoodsServicePromise goodsServicePromise;
	private GoodsOriginInfo goodsOriginInfo;
	private List<GoodsProperty> goodsProperties;
	private GoodsGallery goodsGallery;
	private GoodsTrademark goodsTrademark;
	private Object goodsSizeChartList;
	private Object goodsSizeImage;
	private Object targetSiteInfo;
	private Object sourceSiteInfo;
	private Object bulletPoints;
	private Object itemTaxCode;
	private Object saveModeStatus;

	public Long getGoodsId() {
		return goodsId;
	}

	public BgLocalGoodsDetailQueryResponse setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
		return this;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public BgLocalGoodsDetailQueryResponse setGoodsName(String goodsName) {
		this.goodsName = goodsName;
		return this;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public BgLocalGoodsDetailQueryResponse setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
		return this;
	}

	public Long getCatId() {
		return catId;
	}

	public BgLocalGoodsDetailQueryResponse setCatId(Long catId) {
		this.catId = catId;
		return this;
	}

	public String getCatName() {
		return catName;
	}

	public BgLocalGoodsDetailQueryResponse setCatName(String catName) {
		this.catName = catName;
		return this;
	}

	public String getOutGoodsSn() {
		return outGoodsSn;
	}

	public BgLocalGoodsDetailQueryResponse setOutGoodsSn(String outGoodsSn) {
		this.outGoodsSn = outGoodsSn;
		return this;
	}

	public Integer getProductType() {
		return productType;
	}

	public BgLocalGoodsDetailQueryResponse setProductType(Integer productType) {
		this.productType = productType;
		return this;
	}

	public Integer getSubStatus() {
		return subStatus;
	}

	public BgLocalGoodsDetailQueryResponse setSubStatus(Integer subStatus) {
		this.subStatus = subStatus;
		return this;
	}

	public Boolean getCustomized() {
		return customized;
	}

	public BgLocalGoodsDetailQueryResponse setCustomized(Boolean customized) {
		this.customized = customized;
		return this;
	}

	public String getHsCode() {
		return hsCode;
	}

	public BgLocalGoodsDetailQueryResponse setHsCode(String hsCode) {
		this.hsCode = hsCode;
		return this;
	}

	public String getImportDesignation() {
		return importDesignation;
	}

	public BgLocalGoodsDetailQueryResponse setImportDesignation(String importDesignation) {
		this.importDesignation = importDesignation;
		return this;
	}

	public String getSecondHand() {
		return secondHand;
	}

	public BgLocalGoodsDetailQueryResponse setSecondHand(String secondHand) {
		this.secondHand = secondHand;
		return this;
	}

	public List<SkuList> getSkuList() {
		return skuList;
	}

	public BgLocalGoodsDetailQueryResponse setSkuList(List<SkuList> skuList) {
		this.skuList = skuList;
		return this;
	}

	public GoodsServicePromise getGoodsServicePromise() {
		return goodsServicePromise;
	}

	public BgLocalGoodsDetailQueryResponse setGoodsServicePromise(GoodsServicePromise goodsServicePromise) {
		this.goodsServicePromise = goodsServicePromise;
		return this;
	}

	public GoodsOriginInfo getGoodsOriginInfo() {
		return goodsOriginInfo;
	}

	public BgLocalGoodsDetailQueryResponse setGoodsOriginInfo(GoodsOriginInfo goodsOriginInfo) {
		this.goodsOriginInfo = goodsOriginInfo;
		return this;
	}

	public List<GoodsProperty> getGoodsProperties() {
		return goodsProperties;
	}

	public BgLocalGoodsDetailQueryResponse setGoodsProperties(List<GoodsProperty> goodsProperties) {
		this.goodsProperties = goodsProperties;
		return this;
	}

	public GoodsGallery getGoodsGallery() {
		return goodsGallery;
	}

	public BgLocalGoodsDetailQueryResponse setGoodsGallery(GoodsGallery goodsGallery) {
		this.goodsGallery = goodsGallery;
		return this;
	}

	public GoodsTrademark getGoodsTrademark() {
		return goodsTrademark;
	}

	public BgLocalGoodsDetailQueryResponse setGoodsTrademark(GoodsTrademark goodsTrademark) {
		this.goodsTrademark = goodsTrademark;
		return this;
	}

	/** SKU del good. */
	public static class SkuList implements Serializable {

		private static final long serialVersionUID = 1L;

		private Long skuId;
		private String outSkuSn;
		private String externalProductId;
		private Integer externalProductType;
		private List<String> images;
		private List<BarCode> barCodeList;
		private ProductExpressInfo productExpressInfo;
		private List<Long> specIdList;
		private List<String> specNameList;
		private Price price;
		private RetailPrice retailPrice;
		private RetailPrice listPrice;
		private Object multiplePackage;
		private Object referenceLink;

		public Long getSkuId() {
			return skuId;
		}

		public SkuList setSkuId(Long skuId) {
			this.skuId = skuId;
			return this;
		}

		public String getOutSkuSn() {
			return outSkuSn;
		}

		public SkuList setOutSkuSn(String outSkuSn) {
			this.outSkuSn = outSkuSn;
			return this;
		}

		public String getExternalProductId() {
			return externalProductId;
		}

		public SkuList setExternalProductId(String externalProductId) {
			this.externalProductId = externalProductId;
			return this;
		}

		public Integer getExternalProductType() {
			return externalProductType;
		}

		public SkuList setExternalProductType(Integer externalProductType) {
			this.externalProductType = externalProductType;
			return this;
		}

		public List<String> getImages() {
			return images;
		}

		public SkuList setImages(List<String> images) {
			this.images = images;
			return this;
		}

		public List<BarCode> getBarCodeList() {
			return barCodeList;
		}

		public SkuList setBarCodeList(List<BarCode> barCodeList) {
			this.barCodeList = barCodeList;
			return this;
		}

		public ProductExpressInfo getProductExpressInfo() {
			return productExpressInfo;
		}

		public SkuList setProductExpressInfo(ProductExpressInfo productExpressInfo) {
			this.productExpressInfo = productExpressInfo;
			return this;
		}

		public List<Long> getSpecIdList() {
			return specIdList;
		}

		public SkuList setSpecIdList(List<Long> specIdList) {
			this.specIdList = specIdList;
			return this;
		}

		public List<String> getSpecNameList() {
			return specNameList;
		}

		public SkuList setSpecNameList(List<String> specNameList) {
			this.specNameList = specNameList;
			return this;
		}

		public Price getPrice() {
			return price;
		}

		public SkuList setPrice(Price price) {
			this.price = price;
			return this;
		}

		public RetailPrice getRetailPrice() {
			return retailPrice;
		}

		public SkuList setRetailPrice(RetailPrice retailPrice) {
			this.retailPrice = retailPrice;
			return this;
		}

		public RetailPrice getListPrice() {
			return listPrice;
		}

		public SkuList setListPrice(RetailPrice listPrice) {
			this.listPrice = listPrice;
			return this;
		}

		/** Codice a barre (EAN ecc.) associato allo SKU. */
		public static class BarCode implements Serializable {

			private static final long serialVersionUID = 1L;

			private Integer barCodeType;
			private List<String> barCodeIdList;

			public Integer getBarCodeType() {
				return barCodeType;
			}

			public BarCode setBarCodeType(Integer barCodeType) {
				this.barCodeType = barCodeType;
				return this;
			}

			public List<String> getBarCodeIdList() {
				return barCodeIdList;
			}

			public BarCode setBarCodeIdList(List<String> barCodeIdList) {
				this.barCodeIdList = barCodeIdList;
				return this;
			}
		}

		/** Peso e volume di spedizione dello SKU. */
		public static class ProductExpressInfo implements Serializable {

			private static final long serialVersionUID = 1L;

			private UnitValue weightInfo;
			private UnitValue volumeInfo;

			public UnitValue getWeightInfo() {
				return weightInfo;
			}

			public ProductExpressInfo setWeightInfo(UnitValue weightInfo) {
				this.weightInfo = weightInfo;
				return this;
			}

			public UnitValue getVolumeInfo() {
				return volumeInfo;
			}

			public ProductExpressInfo setVolumeInfo(UnitValue volumeInfo) {
				this.volumeInfo = volumeInfo;
				return this;
			}

			public static class UnitValue implements Serializable {

				private static final long serialVersionUID = 1L;

				private String unit;
				private String weight;
				private String width;
				private String length;
				private String height;

				public String getUnit() {
					return unit;
				}

				public UnitValue setUnit(String unit) {
					this.unit = unit;
					return this;
				}

				public String getWeight() {
					return weight;
				}

				public UnitValue setWeight(String weight) {
					this.weight = weight;
					return this;
				}

				public String getWidth() {
					return width;
				}

				public UnitValue setWidth(String width) {
					this.width = width;
					return this;
				}

				public String getLength() {
					return length;
				}

				public UnitValue setLength(String length) {
					this.length = length;
					return this;
				}

				public String getHeight() {
					return height;
				}

				public UnitValue setHeight(String height) {
					this.height = height;
					return this;
				}
			}
		}

		/** Prezzo base e di listino dello SKU. */
		public static class Price implements Serializable {

			private static final long serialVersionUID = 1L;

			private RetailPrice retailPrice;
			private RetailPrice listPrice;

			public RetailPrice getRetailPrice() {
				return retailPrice;
			}

			public Price setRetailPrice(RetailPrice retailPrice) {
				this.retailPrice = retailPrice;
				return this;
			}

			public RetailPrice getListPrice() {
				return listPrice;
			}

			public Price setListPrice(RetailPrice listPrice) {
				this.listPrice = listPrice;
				return this;
			}
		}

		/** Importo con valuta. */
		public static class RetailPrice implements Serializable {

			private static final long serialVersionUID = 1L;

			private String amount;
			private String currency;

			public String getAmount() {
				return amount;
			}

			public RetailPrice setAmount(String amount) {
				this.amount = amount;
				return this;
			}

			public String getCurrency() {
				return currency;
			}

			public RetailPrice setCurrency(String currency) {
				this.currency = currency;
				return this;
			}
		}
	}

	/** Promesse di servizio (template spedizione, giorni di gestione). */
	public static class GoodsServicePromise implements Serializable {

		private static final long serialVersionUID = 1L;

		private Integer shipmentLimitDay;
		private String costTemplateId;
		private String costTemplateName;
		private Integer fulfillmentType;

		public Integer getShipmentLimitDay() {
			return shipmentLimitDay;
		}

		public GoodsServicePromise setShipmentLimitDay(Integer shipmentLimitDay) {
			this.shipmentLimitDay = shipmentLimitDay;
			return this;
		}

		public String getCostTemplateId() {
			return costTemplateId;
		}

		public GoodsServicePromise setCostTemplateId(String costTemplateId) {
			this.costTemplateId = costTemplateId;
			return this;
		}

		public String getCostTemplateName() {
			return costTemplateName;
		}

		public GoodsServicePromise setCostTemplateName(String costTemplateName) {
			this.costTemplateName = costTemplateName;
			return this;
		}

		public Integer getFulfillmentType() {
			return fulfillmentType;
		}

		public GoodsServicePromise setFulfillmentType(Integer fulfillmentType) {
			this.fulfillmentType = fulfillmentType;
			return this;
		}
	}

	/** Informazioni sull'origine del prodotto. */
	public static class GoodsOriginInfo implements Serializable {

		private static final long serialVersionUID = 1L;

		private String originRegionName1;
		private String originRegionName2;
		private Object manufacturingLocations;

		public String getOriginRegionName1() {
			return originRegionName1;
		}

		public GoodsOriginInfo setOriginRegionName1(String originRegionName1) {
			this.originRegionName1 = originRegionName1;
			return this;
		}

		public String getOriginRegionName2() {
			return originRegionName2;
		}

		public GoodsOriginInfo setOriginRegionName2(String originRegionName2) {
			this.originRegionName2 = originRegionName2;
			return this;
		}

		public Object getManufacturingLocations() {
			return manufacturingLocations;
		}

		public GoodsOriginInfo setManufacturingLocations(Object manufacturingLocations) {
			this.manufacturingLocations = manufacturingLocations;
			return this;
		}
	}

	/** Attributo (proprieta') del good, come registrato su TEMU. */
	public static class GoodsProperty implements Serializable {

		private static final long serialVersionUID = 1L;

		private Long pid;
		private Long templatePid;
		private Long vid;
		private Long refPid;
		private String value;
		private String attributeName;
		private Long specId;
		private Long templateModuleId;
		private Long parentSpecId;
		private String parentSpecName;
		private Long groupId;
		private Long subGroupId;
		private String valueUnit;
		private Long valueUnitId;
		private String imgUrl;
		private String note;
		private String numberInputValue;
		private String multiLineInputValue;

		public Long getPid() {
			return pid;
		}

		public GoodsProperty setPid(Long pid) {
			this.pid = pid;
			return this;
		}

		public Long getTemplatePid() {
			return templatePid;
		}

		public GoodsProperty setTemplatePid(Long templatePid) {
			this.templatePid = templatePid;
			return this;
		}

		public Long getVid() {
			return vid;
		}

		public GoodsProperty setVid(Long vid) {
			this.vid = vid;
			return this;
		}

		public Long getRefPid() {
			return refPid;
		}

		public GoodsProperty setRefPid(Long refPid) {
			this.refPid = refPid;
			return this;
		}

		public String getValue() {
			return value;
		}

		public GoodsProperty setValue(String value) {
			this.value = value;
			return this;
		}

		public String getAttributeName() {
			return attributeName;
		}

		public GoodsProperty setAttributeName(String attributeName) {
			this.attributeName = attributeName;
			return this;
		}

		public Long getSpecId() {
			return specId;
		}

		public GoodsProperty setSpecId(Long specId) {
			this.specId = specId;
			return this;
		}

		public Long getTemplateModuleId() {
			return templateModuleId;
		}

		public GoodsProperty setTemplateModuleId(Long templateModuleId) {
			this.templateModuleId = templateModuleId;
			return this;
		}

		public Long getParentSpecId() {
			return parentSpecId;
		}

		public GoodsProperty setParentSpecId(Long parentSpecId) {
			this.parentSpecId = parentSpecId;
			return this;
		}

		public String getParentSpecName() {
			return parentSpecName;
		}

		public GoodsProperty setParentSpecName(String parentSpecName) {
			this.parentSpecName = parentSpecName;
			return this;
		}

		public Long getGroupId() {
			return groupId;
		}

		public GoodsProperty setGroupId(Long groupId) {
			this.groupId = groupId;
			return this;
		}

		public Long getSubGroupId() {
			return subGroupId;
		}

		public GoodsProperty setSubGroupId(Long subGroupId) {
			this.subGroupId = subGroupId;
			return this;
		}

		public String getValueUnit() {
			return valueUnit;
		}

		public GoodsProperty setValueUnit(String valueUnit) {
			this.valueUnit = valueUnit;
			return this;
		}

		public Long getValueUnitId() {
			return valueUnitId;
		}

		public GoodsProperty setValueUnitId(Long valueUnitId) {
			this.valueUnitId = valueUnitId;
			return this;
		}

		public String getImgUrl() {
			return imgUrl;
		}

		public GoodsProperty setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
			return this;
		}

		public String getNote() {
			return note;
		}

		public GoodsProperty setNote(String note) {
			this.note = note;
			return this;
		}

		public String getNumberInputValue() {
			return numberInputValue;
		}

		public GoodsProperty setNumberInputValue(String numberInputValue) {
			this.numberInputValue = numberInputValue;
			return this;
		}

		public String getMultiLineInputValue() {
			return multiLineInputValue;
		}

		public GoodsProperty setMultiLineInputValue(String multiLineInputValue) {
			this.multiLineInputValue = multiLineInputValue;
			return this;
		}
	}

	/** Gallerie immagini/video del good. */
	public static class GoodsGallery implements Serializable {

		private static final long serialVersionUID = 1L;

		private Object detailVideo;
		private Object goodsCarouselImage;
		private Object carouselVideo;
		private Object detailImage;

		public Object getDetailVideo() {
			return detailVideo;
		}

		public GoodsGallery setDetailVideo(Object detailVideo) {
			this.detailVideo = detailVideo;
			return this;
		}

		public Object getGoodsCarouselImage() {
			return goodsCarouselImage;
		}

		public GoodsGallery setGoodsCarouselImage(Object goodsCarouselImage) {
			this.goodsCarouselImage = goodsCarouselImage;
			return this;
		}

		public Object getCarouselVideo() {
			return carouselVideo;
		}

		public GoodsGallery setCarouselVideo(Object carouselVideo) {
			this.carouselVideo = carouselVideo;
			return this;
		}

		public Object getDetailImage() {
			return detailImage;
		}

		public GoodsGallery setDetailImage(Object detailImage) {
			this.detailImage = detailImage;
			return this;
		}
	}

	/** Marchio registrato e brand del good. */
	public static class GoodsTrademark implements Serializable {

		private static final long serialVersionUID = 1L;

		private Long trademarkBizId;
		private String brandName;
		private Long trademarkId;
		private Long brandId;
		private String trademarkName;

		public Long getTrademarkBizId() {
			return trademarkBizId;
		}

		public GoodsTrademark setTrademarkBizId(Long trademarkBizId) {
			this.trademarkBizId = trademarkBizId;
			return this;
		}

		public String getBrandName() {
			return brandName;
		}

		public GoodsTrademark setBrandName(String brandName) {
			this.brandName = brandName;
			return this;
		}

		public Long getTrademarkId() {
			return trademarkId;
		}

		public GoodsTrademark setTrademarkId(Long trademarkId) {
			this.trademarkId = trademarkId;
			return this;
		}

		public Long getBrandId() {
			return brandId;
		}

		public GoodsTrademark setBrandId(Long brandId) {
			this.brandId = brandId;
			return this;
		}

		public String getTrademarkName() {
			return trademarkName;
		}

		public GoodsTrademark setTrademarkName(String trademarkName) {
			this.trademarkName = trademarkName;
			return this;
		}
	}
}
