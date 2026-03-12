package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'bg.local.goods.stock.edit'.
 * Used to edit goods stock information.
 */
public class BgLocalGoodsStockEditRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Goods Id.
	 * Required parameter.
	 */
	private Long goodsId;
	
	/**
	 * Stock type.
	 * Enumeration values: 0 - self ordinary stock, 1 - self Pre-sale stock.
	 * Default is self ordinary stock if not filled.
	 */
	private Integer stockType;
	
	/**
	 * SKU stock change list.
	 * Allows modifying stock by diff stock (increment/decrement).
	 */
	private List<SkuStockChange> skuStockChangeList;
	
	/**
	 * SKU stock target list.
	 * Allows modifying stock by fully updating the stock to a target level.
	 */
	private List<SkuStockTarget> skuStockTargetList;
	
	/**
	 * Unique Request Id.
	 * If set, the request will be rejected if duplicated.
	 */
	private String requestUniqueKey;
		
	public BgLocalGoodsStockEditRequest() {
		this.skuStockChangeList = new ArrayList<>();
		this.skuStockTargetList = new ArrayList<>();
	}
	
	/**
	 * @return the goods ID
	 */
	public Long getGoodsId() {
		return goodsId;
	}
	
	/**
	 * @param goodsId the goods ID
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsStockEditRequest setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
		return this;
	}
	
	/**
	 * @return the stock type
	 */
	public Integer getStockType() {
		return stockType;
	}
	
	/**
	 * @param stockType the stock type
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsStockEditRequest setStockType(Integer stockType) {
		this.stockType = stockType;
		return this;
	}
	
	/**
	 * @return the SKU stock change list
	 */
	public List<SkuStockChange> getSkuStockChangeList() {
		return skuStockChangeList;
	}
	
	/**
	 * @param skuStockChangeList the SKU stock change list
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsStockEditRequest setSkuStockChangeList(List<SkuStockChange> skuStockChangeList) {
		this.skuStockChangeList = skuStockChangeList;
		return this;
	}
	
	/**
	 * @return the SKU stock target list
	 */
	public List<SkuStockTarget> getSkuStockTargetList() {
		return skuStockTargetList;
	}
	
	/**
	 * @param skuStockTargetList the SKU stock target list
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsStockEditRequest setSkuStockTargetList(List<SkuStockTarget> skuStockTargetList) {
		this.skuStockTargetList = skuStockTargetList;
		return this;
	}
	
	/**
	 * @return the unique request key
	 */
	public String getRequestUniqueKey() {
		return requestUniqueKey;
	}
	
	/**
	 * @param requestUniqueKey the unique request key
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsStockEditRequest setRequestUniqueKey(String requestUniqueKey) {
		this.requestUniqueKey = requestUniqueKey;
		return this;
	}
	
	/**
	 * Inner class representing an item in the SKU stock change list.
	 * Used to modify stock by applying a difference.
	 */
	public static class SkuStockChange {
		
		/**
		 * Goods Sku Id.
		 * Required.
		 */
		private Long skuId;
		
		/**
		 * Diff stock.
		 * If successful, the stock will execute the += stockDiff operation.
		 * Required.
		 */
		private Integer stockDiff;
		
		public SkuStockChange() {
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
		public SkuStockChange setSkuId(Long skuId) {
			this.skuId = skuId;
			return this;
		}
		
		/**
		 * @return the stock difference
		 */
		public Integer getStockDiff() {
			return stockDiff;
		}
		
		/**
		 * @param stockDiff the stock difference
		 * @return this object for method chaining
		 */
		public SkuStockChange setStockDiff(Integer stockDiff) {
			this.stockDiff = stockDiff;
			return this;
		}
	}
	
	/**
	 * Inner class representing an item in the SKU stock target list.
	 * Used to modify stock by setting a target value.
	 */
	public static class SkuStockTarget {
		
		/**
		 * Goods Sku Id.
		 * Required.
		 */
		private Long skuId;
		
		/**
		 * Stock target value.
		 * When set, the SKU's stock will be updated to the target level.
		 * Required.
		 */
		private Integer stockTarget;
		
		public SkuStockTarget() {
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
		public SkuStockTarget setSkuId(Long skuId) {
			this.skuId = skuId;
			return this;
		}
		
		/**
		 * @return the stock target value
		 */
		public Integer getStockTarget() {
			return stockTarget;
		}
		
		/**
		 * @param stockTarget the stock target value
		 * @return this object for method chaining
		 */
		public SkuStockTarget setStockTarget(Integer stockTarget) {
			this.stockTarget = stockTarget;
			return this;
		}
	}
}