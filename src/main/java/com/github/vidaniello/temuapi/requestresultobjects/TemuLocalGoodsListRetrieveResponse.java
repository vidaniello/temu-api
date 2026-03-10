package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'temu.local.goods.list.retrieve'.
 * Contains a list of goods with pagination information.
 */
public class TemuLocalGoodsListRetrieveResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Pagination information.
	 * When a request produces a response that exceeds the pageSize, pagination occurs.
	 */
	private Pagination pagination;
	
	/**
	 * The total number of items found for the search criteria.
	 */
	private Long total;
	
	/**
	 * A list of goods/products in the result set.
	 */
	private List<GoodsInfo> goodsList;
		
	public TemuLocalGoodsListRetrieveResponse() {
		this.goodsList = new ArrayList<>();
	}
	
	/**
	 * @return the pagination information
	 */
	public Pagination getPagination() {
		return pagination;
	}
	
	/**
	 * @param pagination the pagination information
	 * @return this response object for method chaining
	 */
	public TemuLocalGoodsListRetrieveResponse setPagination(Pagination pagination) {
		this.pagination = pagination;
		return this;
	}
	
	/**
	 * @return the total number of items found
	 */
	public Long getTotal() {
		return total;
	}
	
	/**
	 * @param total the total number of items found
	 * @return this response object for method chaining
	 */
	public TemuLocalGoodsListRetrieveResponse setTotal(Long total) {
		this.total = total;
		return this;
	}
	
	/**
	 * @return the list of goods
	 */
	public List<GoodsInfo> getGoodsList() {
		return goodsList;
	}
	
	/**
	 * @param goodsList the list of goods
	 * @return this response object for method chaining
	 */
	public TemuLocalGoodsListRetrieveResponse setGoodsList(List<GoodsInfo> goodsList) {
		this.goodsList = goodsList;
		return this;
	}
	
	/**
	 * Inner class representing a goods/product item in the result set.
	 */
	public static class GoodsInfo {
		
		/**
		 * Product ID.
		 */
		private String goodsId;
		
		/**
		 * The title or name of the product.
		 */
		private String goodsName;
		
		/**
		 * Product status: Active, InActive, Deleted, Draft, Incomplete.
		 */
		private String goodsStatus;
		
		/**
		 * The URL for the product's thumbnail image.
		 */
		private String thumbUrl;
		
		/**
		 * The external product code or serial number.
		 */
		private String outGoodsSn;
		
		/**
		 * Count for SKU.
		 */
		private Integer variationsCount;
		
		/**
		 * Category type: 0-Clothing category, 1-Other.
		 */
		private Integer catType;
		
		/**
		 * Leaf Category ID.
		 */
		private String catId;
		
		/**
		 * The date the product was created.
		 */
		private Long goodsCreateTime;
		
		/**
		 * The date the status of product were last updated.
		 */
		private Long goodsStatusChangeTime;
		
		/**
		 * Brand id.
		 */
		private String brandId;
		
		/**
		 * Trademark Authorization ID.
		 */
		private String trademarkId;
		
		/**
		 * The ID of the delivery options available for your product, delimited by commas.
		 */
		private String costTemplateId;
		
		/**
		 * Indicates the time, in days, between when you receive an order for an item and when you can ship the item.
		 */
		private Long shipmentLimitSecond;
		
		/**
		 * A list of SKU identifiers for the product.
		 */
		private List<SkuInfo> skuInfoList;
		
		/**
		 * Tag for Low traffic: 1- true, 2- false.
		 */
		private Integer lowTrafficTag;
		
		/**
		 * Tag for Restricted traffic: 1- true, 2- false.
		 */
		private Integer restrictedTrafficTag;
		
		/**
		 * Multi-site information.
		 */
		private MultiSiteInfo multiSiteInfo;
			
		public GoodsInfo() {
			this.skuInfoList = new ArrayList<>();
		}
		
		public String getGoodsId() {
			return goodsId;
		}
		
		public GoodsInfo setGoodsId(String goodsId) {
			this.goodsId = goodsId;
			return this;
		}
		
		public String getGoodsName() {
			return goodsName;
		}
		
		public GoodsInfo setGoodsName(String goodsName) {
			this.goodsName = goodsName;
			return this;
		}
		
		public String getGoodsStatus() {
			return goodsStatus;
		}
		
		public GoodsInfo setGoodsStatus(String goodsStatus) {
			this.goodsStatus = goodsStatus;
			return this;
		}
		
		public String getThumbUrl() {
			return thumbUrl;
		}
		
		public GoodsInfo setThumbUrl(String thumbUrl) {
			this.thumbUrl = thumbUrl;
			return this;
		}
		
		public String getOutGoodsSn() {
			return outGoodsSn;
		}
		
		public GoodsInfo setOutGoodsSn(String outGoodsSn) {
			this.outGoodsSn = outGoodsSn;
			return this;
		}
		
		public Integer getVariationsCount() {
			return variationsCount;
		}
		
		public GoodsInfo setVariationsCount(Integer variationsCount) {
			this.variationsCount = variationsCount;
			return this;
		}
		
		public Integer getCatType() {
			return catType;
		}
		
		public GoodsInfo setCatType(Integer catType) {
			this.catType = catType;
			return this;
		}
		
		public String getCatId() {
			return catId;
		}
		
		public GoodsInfo setCatId(String catId) {
			this.catId = catId;
			return this;
		}
		
		public Long getGoodsCreateTime() {
			return goodsCreateTime;
		}
		
		public GoodsInfo setGoodsCreateTime(Long goodsCreateTime) {
			this.goodsCreateTime = goodsCreateTime;
			return this;
		}
		
		public Long getGoodsStatusChangeTime() {
			return goodsStatusChangeTime;
		}
		
		public GoodsInfo setGoodsStatusChangeTime(Long goodsStatusChangeTime) {
			this.goodsStatusChangeTime = goodsStatusChangeTime;
			return this;
		}
		
		public String getBrandId() {
			return brandId;
		}
		
		public GoodsInfo setBrandId(String brandId) {
			this.brandId = brandId;
			return this;
		}
		
		public String getTrademarkId() {
			return trademarkId;
		}
		
		public GoodsInfo setTrademarkId(String trademarkId) {
			this.trademarkId = trademarkId;
			return this;
		}
		
		public String getCostTemplateId() {
			return costTemplateId;
		}
		
		public GoodsInfo setCostTemplateId(String costTemplateId) {
			this.costTemplateId = costTemplateId;
			return this;
		}
		
		public Long getShipmentLimitSecond() {
			return shipmentLimitSecond;
		}
		
		public GoodsInfo setShipmentLimitSecond(Long shipmentLimitSecond) {
			this.shipmentLimitSecond = shipmentLimitSecond;
			return this;
		}
		
		public List<SkuInfo> getSkuInfoList() {
			return skuInfoList;
		}
		
		public GoodsInfo setSkuInfoList(List<SkuInfo> skuInfoList) {
			this.skuInfoList = skuInfoList;
			return this;
		}
		
		public Integer getLowTrafficTag() {
			return lowTrafficTag;
		}
		
		public GoodsInfo setLowTrafficTag(Integer lowTrafficTag) {
			this.lowTrafficTag = lowTrafficTag;
			return this;
		}
		
		public Integer getRestrictedTrafficTag() {
			return restrictedTrafficTag;
		}
		
		public GoodsInfo setRestrictedTrafficTag(Integer restrictedTrafficTag) {
			this.restrictedTrafficTag = restrictedTrafficTag;
			return this;
		}
		
		public MultiSiteInfo getMultiSiteInfo() {
			return multiSiteInfo;
		}
		
		public GoodsInfo setMultiSiteInfo(MultiSiteInfo multiSiteInfo) {
			this.multiSiteInfo = multiSiteInfo;
			return this;
		}
	}
	
	/**
	 * Inner class representing SKU information.
	 */
	public static class SkuInfo {
		
		/**
		 * SKU id.
		 */
		private Long skuId;
		
		/**
		 * A list of external SKU (Stock Keeping Unit) codes or serial numbers for the product.
		 */
		private String skuSn;
		
		/**
		 * Specification List.
		 */
		private List<SpecInfo> specList;
			
		public SkuInfo() {
			this.specList = new ArrayList<>();
		}
		
		public Long getSkuId() {
			return skuId;
		}
		
		public SkuInfo setSkuId(Long skuId) {
			this.skuId = skuId;
			return this;
		}
		
		public String getSkuSn() {
			return skuSn;
		}
		
		public SkuInfo setSkuSn(String skuSn) {
			this.skuSn = skuSn;
			return this;
		}
		
		public List<SpecInfo> getSpecList() {
			return specList;
		}
		
		public SkuInfo setSpecList(List<SpecInfo> specList) {
			this.specList = specList;
			return this;
		}
	}
	
	/**
	 * Inner class representing specification information.
	 */
	public static class SpecInfo {
		
		/**
		 * Specification id.
		 */
		private Long specId;
		
		/**
		 * Parent specification id.
		 */
		private Long parentSpecId;
			
		public SpecInfo() {
		}
		
		public Long getSpecId() {
			return specId;
		}
		
		public SpecInfo setSpecId(Long specId) {
			this.specId = specId;
			return this;
		}
		
		public Long getParentSpecId() {
			return parentSpecId;
		}
		
		public SpecInfo setParentSpecId(Long parentSpecId) {
			this.parentSpecId = parentSpecId;
			return this;
		}
	}
	
	/**
	 * Inner class representing multi-site information.
	 */
	public static class MultiSiteInfo {
		
		/**
		 * Site Type: 1-Source Site, 2-Target Site.
		 */
		private Integer siteType;
		
		/**
		 * Multi-site Goods information list.
		 */
		private List<MultiSiteGoodsInfo> multiSiteGoodsInfoList;
			
		public MultiSiteInfo() {
			this.multiSiteGoodsInfoList = new ArrayList<>();
		}
		
		public Integer getSiteType() {
			return siteType;
		}
		
		public MultiSiteInfo setSiteType(Integer siteType) {
			this.siteType = siteType;
			return this;
		}
		
		public List<MultiSiteGoodsInfo> getMultiSiteGoodsInfoList() {
			return multiSiteGoodsInfoList;
		}
		
		public MultiSiteInfo setMultiSiteGoodsInfoList(List<MultiSiteGoodsInfo> multiSiteGoodsInfoList) {
			this.multiSiteGoodsInfoList = multiSiteGoodsInfoList;
			return this;
		}
	}
	
	/**
	 * Inner class representing multi-site goods information.
	 */
	public static class MultiSiteGoodsInfo {
		
		/**
		 * Product ID.
		 */
		private Long goodsId;
		
		/**
		 * Id for Site.
		 */
		private Long siteId;
		
		/**
		 * Site Type: 1-Source Site, 2-Target Site.
		 */
		private Integer siteType;
			
		public MultiSiteGoodsInfo() {
		}
		
		public Long getGoodsId() {
			return goodsId;
		}
		
		public MultiSiteGoodsInfo setGoodsId(Long goodsId) {
			this.goodsId = goodsId;
			return this;
		}
		
		public Long getSiteId() {
			return siteId;
		}
		
		public MultiSiteGoodsInfo setSiteId(Long siteId) {
			this.siteId = siteId;
			return this;
		}
		
		public Integer getSiteType() {
			return siteType;
		}
		
		public MultiSiteGoodsInfo setSiteType(Integer siteType) {
			this.siteType = siteType;
			return this;
		}
	}
}