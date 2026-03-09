package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'temu.local.goods.v2.add'.
 * Contains the created goods ID and SKU information.
 */
public class TemuLocalGoodsV2AddResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Goods Id.
	 */
	private Long goodsId;
	
	/**
	 * Product type. It is used to describe the type of a product, a product can only belong to one type.
	 * The possible enumerated values are presented below.
	 * 1: Normal product
	 * 2: Custom product
	 * 3: Made-to-order product
	 */
	private Integer productType;
	
	/**
	 * Sku information list.
	 */
	private List<SkuInfoList> skuInfoList;
		
	public TemuLocalGoodsV2AddResponse() {
		this.skuInfoList = new ArrayList<>();
	}
	
	/**
	 * @return the goods Id
	 */
	public Long getGoodsId() {
		return goodsId;
	}
	
	/**
	 * @param goodsId the goods Id
	 * @return this response object for method chaining
	 */
	public TemuLocalGoodsV2AddResponse setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
		return this;
	}
	
	/**
	 * @return the product type
	 */
	public Integer getProductType() {
		return productType;
	}
	
	/**
	 * @param productType the product type
	 * @return this response object for method chaining
	 */
	public TemuLocalGoodsV2AddResponse setProductType(Integer productType) {
		this.productType = productType;
		return this;
	}
	
	/**
	 * @return the sku information list
	 */
	public List<SkuInfoList> getSkuInfoList() {
		return skuInfoList;
	}
	
	/**
	 * @param skuInfoList the sku information list
	 * @return this response object for method chaining
	 */
	public TemuLocalGoodsV2AddResponse setSkuInfoList(List<SkuInfoList> skuInfoList) {
		this.skuInfoList = skuInfoList;
		return this;
	}
	
	/**
	 * Sku information list.
	 */
	public static class SkuInfoList implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * SKU ID.
		 */
		private Long skuId;
		
		/**
		 * External SKU Code.
		 */
		private String outSkuSn;
		
		/**
		 * Specification information.
		 */
		private List<SpecList> specList;
			
		public SkuInfoList() {
			this.specList = new ArrayList<>();
		}
		
		/**
		 * @return the SKU ID
		 */
		public Long getSkuId() {
			return skuId;
		}
		
		/**
		 * @param skuId the SKU ID
		 * @return this object for method chaining
		 */
		public SkuInfoList setSkuId(Long skuId) {
			this.skuId = skuId;
			return this;
		}
		
		/**
		 * @return the external SKU Code
		 */
		public String getOutSkuSn() {
			return outSkuSn;
		}
		
		/**
		 * @param outSkuSn the external SKU Code
		 * @return this object for method chaining
		 */
		public SkuInfoList setOutSkuSn(String outSkuSn) {
			this.outSkuSn = outSkuSn;
			return this;
		}
		
		/**
		 * @return the specification information list
		 */
		public List<SpecList> getSpecList() {
			return specList;
		}
		
		/**
		 * @param specList the specification information list
		 * @return this object for method chaining
		 */
		public SkuInfoList setSpecList(List<SpecList> specList) {
			this.specList = specList;
			return this;
		}
		
		/**
		 * Specification information.
		 */
		public static class SpecList implements java.io.Serializable {
			
			private static final long serialVersionUID = 1L;
			
			/**
			 * Specification name.
			 */
			private String specName;
			
			/**
			 * Specification id.
			 */
			private Long specId;
			
			/**
			 * Parent Specification id.
			 */
			private Long parentSpecId;
				
			public SpecList() {
			}
			
			/**
			 * @return the specification name
			 */
			public String getSpecName() {
				return specName;
			}
			
			/**
			 * @param specName the specification name
			 * @return this object for method chaining
			 */
			public SpecList setSpecName(String specName) {
				this.specName = specName;
				return this;
			}
			
			/**
			 * @return the specification id
			 */
			public Long getSpecId() {
				return specId;
			}
			
			/**
			 * @param specId the specification id
			 * @return this object for method chaining
			 */
			public SpecList setSpecId(Long specId) {
				this.specId = specId;
				return this;
			}
			
			/**
			 * @return the parent Specification id
			 */
			public Long getParentSpecId() {
				return parentSpecId;
			}
			
			/**
			 * @param parentSpecId the parent Specification id
			 * @return this object for method chaining
			 */
			public SpecList setParentSpecId(Long parentSpecId) {
				this.parentSpecId = parentSpecId;
				return this;
			}
		}
	}
}