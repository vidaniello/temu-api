package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'temu.local.sku.list.retrieve'.
 * Contains the list of SKUs and pagination information.
 */
public class TemuLocalSkuListRetrieveResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * The total number of items found for the search criteria.
	 */
	private Long total;
	
	/**
	 * Pagination object containing tokens and the list of SKUs.
	 */
	private Pagination pagination;
	
	/**
	 * A list of SKU identifiers for the product
	 */
	private List<SkuInfo> skuList;
		
	public TemuLocalSkuListRetrieveResponse() {
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
	public TemuLocalSkuListRetrieveResponse setTotal(Long total) {
		this.total = total;
		return this;
	}
	
	/**
	 * @return the pagination object
	 */
	public Pagination getPagination() {
		return pagination;
	}
	
	/**
	 * @param pagination the pagination object
	 * @return this response object for method chaining
	 */
	public TemuLocalSkuListRetrieveResponse setPagination(Pagination pagination) {
		this.pagination = pagination;
		return this;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<SkuInfo> getSkuList() {
		return skuList;
	}
	
	/**
	 * 
	 * @param skuList
	 * @return
	 */
	public TemuLocalSkuListRetrieveResponse setSkuList(List<SkuInfo> skuList) {
		this.skuList = skuList;
		return this;
	}
	
	
	/**
	 * Inner class representing SKU information.
	 */
	public static class SkuInfo {
		
		/**
		 * Sku ID.
		 */
		private String skuId;
		
		/**
		 * Product ID.
		 */
		private String goodsId;
		
		/**
		 * The title or name of the product.
		 */
		private String goodsName;
		
		/**
		 * The URL for the product's thumbnail image.
		 */
		private String thumbUrl;
		
		/**
		 * Specification.
		 */
		private String specName;
		
		/**
		 * A list of external SKU (Stock Keeping Unit) codes or serial numbers for the product.
		 */
		private String outSkuSn;
		
		/**
		 * The external product code or serial number.
		 */
		private String outGoodsSn;
		
		/**
		 * The date the product was created.
		 */
		private Long goodsCreateTime;
		
		/**
		 * The date the status of sku were last updated.
		 */
		private Long skuStatusChangeTime;
		
		/**
		 * Sku status: Active, InActive, Deleted, Incomplete.
		 */
		private String skuStatus;
		
		/**
		 * Sku substatus.
		 */
		private String skuSubStatus;
		
		/**
		 * Category type: 0-Clothing category, 1-Other.
		 */
		private Integer catType;
		
		/**
		 * Leaf Category ID.
		 */
		private String catId;
		
		/**
		 * Package Volume Information.
		 */
		private VolumeInfo volumeInfo;
		
		/**
		 * Package Weight Information.
		 */
		private WeightInfo weightInfo;
		
		/**
		 * Specification List.
		 */
		private List<SpecInfo> specList;
		
		/**
		 * Is low traffic, 1-true 2-false.
		 */
		private Integer lowTrafficTag;
		
		/**
		 * Is restricted traffic, 1-true 2-false.
		 */
		private Integer restrictedTrafficTag;
		
		/**
		 * Multi-site information.
		 */
		private MultiSiteInfo multiSiteInfo;
		
		public SkuInfo() {
			this.specList = new ArrayList<>();
		}
		
		public String getSkuId() {
			return skuId;
		}
		
		public SkuInfo setSkuId(String skuId) {
			this.skuId = skuId;
			return this;
		}
		
		public String getGoodsId() {
			return goodsId;
		}
		
		public SkuInfo setGoodsId(String goodsId) {
			this.goodsId = goodsId;
			return this;
		}
		
		public String getGoodsName() {
			return goodsName;
		}
		
		public SkuInfo setGoodsName(String goodsName) {
			this.goodsName = goodsName;
			return this;
		}
		
		public String getThumbUrl() {
			return thumbUrl;
		}
		
		public SkuInfo setThumbUrl(String thumbUrl) {
			this.thumbUrl = thumbUrl;
			return this;
		}
		
		public String getSpecName() {
			return specName;
		}
		
		public SkuInfo setSpecName(String specName) {
			this.specName = specName;
			return this;
		}
		
		public String getOutSkuSn() {
			return outSkuSn;
		}
		
		public SkuInfo setOutSkuSn(String outSkuSn) {
			this.outSkuSn = outSkuSn;
			return this;
		}
		
		public String getOutGoodsSn() {
			return outGoodsSn;
		}
		
		public SkuInfo setOutGoodsSn(String outGoodsSn) {
			this.outGoodsSn = outGoodsSn;
			return this;
		}
		
		public Long getGoodsCreateTime() {
			return goodsCreateTime;
		}
		
		public SkuInfo setGoodsCreateTime(Long goodsCreateTime) {
			this.goodsCreateTime = goodsCreateTime;
			return this;
		}
		
		public Long getSkuStatusChangeTime() {
			return skuStatusChangeTime;
		}
		
		public SkuInfo setSkuStatusChangeTime(Long skuStatusChangeTime) {
			this.skuStatusChangeTime = skuStatusChangeTime;
			return this;
		}
		
		public String getSkuStatus() {
			return skuStatus;
		}
		
		public SkuInfo setSkuStatus(String skuStatus) {
			this.skuStatus = skuStatus;
			return this;
		}
		
		public String getSkuSubStatus() {
			return skuSubStatus;
		}
		
		public SkuInfo setSkuSubStatus(String skuSubStatus) {
			this.skuSubStatus = skuSubStatus;
			return this;
		}
		
		public Integer getCatType() {
			return catType;
		}
		
		public SkuInfo setCatType(Integer catType) {
			this.catType = catType;
			return this;
		}
		
		public String getCatId() {
			return catId;
		}
		
		public SkuInfo setCatId(String catId) {
			this.catId = catId;
			return this;
		}
		
		public VolumeInfo getVolumeInfo() {
			return volumeInfo;
		}
		
		public SkuInfo setVolumeInfo(VolumeInfo volumeInfo) {
			this.volumeInfo = volumeInfo;
			return this;
		}
		
		public WeightInfo getWeightInfo() {
			return weightInfo;
		}
		
		public SkuInfo setWeightInfo(WeightInfo weightInfo) {
			this.weightInfo = weightInfo;
			return this;
		}
		
		public List<SpecInfo> getSpecList() {
			return specList;
		}
		
		public SkuInfo setSpecList(List<SpecInfo> specList) {
			this.specList = specList;
			return this;
		}
		
		public Integer getLowTrafficTag() {
			return lowTrafficTag;
		}
		
		public SkuInfo setLowTrafficTag(Integer lowTrafficTag) {
			this.lowTrafficTag = lowTrafficTag;
			return this;
		}
		
		public Integer getRestrictedTrafficTag() {
			return restrictedTrafficTag;
		}
		
		public SkuInfo setRestrictedTrafficTag(Integer restrictedTrafficTag) {
			this.restrictedTrafficTag = restrictedTrafficTag;
			return this;
		}
		
		public MultiSiteInfo getMultiSiteInfo() {
			return multiSiteInfo;
		}
		
		public SkuInfo setMultiSiteInfo(MultiSiteInfo multiSiteInfo) {
			this.multiSiteInfo = multiSiteInfo;
			return this;
		}
	}
	
	/**
	 * Inner class representing package volume information.
	 */
	public static class VolumeInfo {
		
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
		
		/**
		 * Unit of Length, Width, and Height.
		 */
		private String unit;
		
		public String getLength() {
			return length;
		}
		
		public VolumeInfo setLength(String length) {
			this.length = length;
			return this;
		}
		
		public String getWidth() {
			return width;
		}
		
		public VolumeInfo setWidth(String width) {
			this.width = width;
			return this;
		}
		
		public String getHeight() {
			return height;
		}
		
		public VolumeInfo setHeight(String height) {
			this.height = height;
			return this;
		}
		
		public String getUnit() {
			return unit;
		}
		
		public VolumeInfo setUnit(String unit) {
			this.unit = unit;
			return this;
		}
	}
	
	/**
	 * Inner class representing package weight information.
	 */
	public static class WeightInfo {
		
		/**
		 * Cargo Weight.
		 */
		private String weight;
		
		/**
		 * Unit of Weight.
		 */
		private String unit;
		
		public String getWeight() {
			return weight;
		}
		
		public WeightInfo setWeight(String weight) {
			this.weight = weight;
			return this;
		}
		
		public String getUnit() {
			return unit;
		}
		
		public WeightInfo setUnit(String unit) {
			this.unit = unit;
			return this;
		}
	}
	
	/**
	 * Inner class representing specification information.
	 */
	public static class SpecInfo {
		
		/**
		 * Specification ID.
		 */
		private Long specId;
		
		/**
		 * Parent Specification ID.
		 */
		private Long parentSpecId;
		
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
		 * Site Type 1-Source Site 2-Target Site.
		 */
		private Integer siteType;
		
		/**
		 * Multi-site SKU information list.
		 */
		private List<MultiSiteSkuInfo> multiSiteSkuInfoList;
		
		public MultiSiteInfo() {
			this.multiSiteSkuInfoList = new ArrayList<>();
		}
		
		public Integer getSiteType() {
			return siteType;
		}
		
		public MultiSiteInfo setSiteType(Integer siteType) {
			this.siteType = siteType;
			return this;
		}
		
		public List<MultiSiteSkuInfo> getMultiSiteSkuInfoList() {
			return multiSiteSkuInfoList;
		}
		
		public MultiSiteInfo setMultiSiteSkuInfoList(List<MultiSiteSkuInfo> multiSiteSkuInfoList) {
			this.multiSiteSkuInfoList = multiSiteSkuInfoList;
			return this;
		}
	}
	
	/**
	 * Inner class representing multi-site SKU information.
	 */
	public static class MultiSiteSkuInfo {
		
		/**
		 * Product ID.
		 */
		private Long goodsId;
		
		/**
		 * Sku id.
		 */
		private Long skuId;
		
		/**
		 * Id for Site.
		 */
		private Long siteId;
		
		/**
		 * Site Type 1-Source Site 2-Target Site.
		 */
		private Integer siteType;
		
		public Long getGoodsId() {
			return goodsId;
		}
		
		public MultiSiteSkuInfo setGoodsId(Long goodsId) {
			this.goodsId = goodsId;
			return this;
		}
		
		public Long getSkuId() {
			return skuId;
		}
		
		public MultiSiteSkuInfo setSkuId(Long skuId) {
			this.skuId = skuId;
			return this;
		}
		
		public Long getSiteId() {
			return siteId;
		}
		
		public MultiSiteSkuInfo setSiteId(Long siteId) {
			this.siteId = siteId;
			return this;
		}
		
		public Integer getSiteType() {
			return siteType;
		}
		
		public MultiSiteSkuInfo setSiteType(Integer siteType) {
			this.siteType = siteType;
			return this;
		}
	}
}