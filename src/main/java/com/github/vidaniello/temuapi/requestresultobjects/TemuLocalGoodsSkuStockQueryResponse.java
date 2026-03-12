package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'temu.local.goods.sku.stock.query'.
 * Contains stock details for goods and SKUs.
 */
public class TemuLocalGoodsSkuStockQueryResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * List of stock details grouped by goods.
	 */
	private List<StockInfo> stockList;
		
	public TemuLocalGoodsSkuStockQueryResponse() {
		this.stockList = new ArrayList<>();
	}
	
	/**
	 * @return the list of stock details
	 */
	public List<StockInfo> getStockList() {
		return stockList;
	}
	
	/**
	 * @param stockList the list of stock details
	 * @return this response object for method chaining
	 */
	public TemuLocalGoodsSkuStockQueryResponse setStockList(List<StockInfo> stockList) {
		this.stockList = stockList;
		return this;
	}
	
	/**
	 * Inner class representing stock information for a goods item.
	 */
	public static class StockInfo {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Goods ID.
		 */
		private Long goodsId;
		
		/**
		 * List of SKU stock details for this goods.
		 */
		private List<SkuStockInfo> skuStockInfoList;
		
		public StockInfo() {
			this.skuStockInfoList = new ArrayList<>();
		}
		
		/**
		 * @return the goods ID
		 */
		public Long getGoodsId() {
			return goodsId;
		}
		
		/**
		 * @param goodsId the goods ID
		 * @return this object for method chaining
		 */
		public StockInfo setGoodsId(Long goodsId) {
			this.goodsId = goodsId;
			return this;
		}
		
		/**
		 * @return the list of SKU stock details
		 */
		public List<SkuStockInfo> getSkuStockInfoList() {
			return skuStockInfoList;
		}
		
		/**
		 * @param skuStockInfoList the list of SKU stock details
		 * @return this object for method chaining
		 */
		public StockInfo setSkuStockInfoList(List<SkuStockInfo> skuStockInfoList) {
			this.skuStockInfoList = skuStockInfoList;
			return this;
		}
	}
	
	/**
	 * Inner class representing SKU stock information.
	 */
	public static class SkuStockInfo {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * SKU ID.
		 */
		private Long skuId;
		
		/**
		 * External SKU code.
		 */
		private String outSkuSn;
		
		/**
		 * Self ordinary stock details.
		 */
		private StockDetail selfOrdinaryStock;
		
		/**
		 * Self pre-sale stock details.
		 */
		private StockDetail selfPreSaleStock;
		
		/**
		 * Cert ordinary stock details.
		 */
		private StockDetail certOrdinaryStock;
		
		public SkuStockInfo() {
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
		public SkuStockInfo setSkuId(Long skuId) {
			this.skuId = skuId;
			return this;
		}
		
		/**
		 * @return the external SKU code
		 */
		public String getOutSkuSn() {
			return outSkuSn;
		}
		
		/**
		 * @param outSkuSn the external SKU code
		 * @return this object for method chaining
		 */
		public SkuStockInfo setOutSkuSn(String outSkuSn) {
			this.outSkuSn = outSkuSn;
			return this;
		}
		
		/**
		 * @return the self ordinary stock details
		 */
		public StockDetail getSelfOrdinaryStock() {
			return selfOrdinaryStock;
		}
		
		/**
		 * @param selfOrdinaryStock the self ordinary stock details
		 * @return this object for method chaining
		 */
		public SkuStockInfo setSelfOrdinaryStock(StockDetail selfOrdinaryStock) {
			this.selfOrdinaryStock = selfOrdinaryStock;
			return this;
		}
		
		/**
		 * @return the self pre-sale stock details
		 */
		public StockDetail getSelfPreSaleStock() {
			return selfPreSaleStock;
		}
		
		/**
		 * @param selfPreSaleStock the self pre-sale stock details
		 * @return this object for method chaining
		 */
		public SkuStockInfo setSelfPreSaleStock(StockDetail selfPreSaleStock) {
			this.selfPreSaleStock = selfPreSaleStock;
			return this;
		}
		
		/**
		 * @return the cert ordinary stock details
		 */
		public StockDetail getCertOrdinaryStock() {
			return certOrdinaryStock;
		}
		
		/**
		 * @param certOrdinaryStock the cert ordinary stock details
		 * @return this object for method chaining
		 */
		public SkuStockInfo setCertOrdinaryStock(StockDetail certOrdinaryStock) {
			this.certOrdinaryStock = certOrdinaryStock;
			return this;
		}
	}
	
	/**
	 * Inner class representing stock detail information.
	 * Used for self ordinary stock, self pre-sale stock, and cert ordinary stock.
	 */
	public static class StockDetail {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Inventory type.
		 * Enumeration values: 0 - self ordinary stock, 1 - self Pre-sale stock, 2 - cert ordinary stock
		 */
		private Integer stockType;
		
		/**
		 * Inventory quantity.
		 */
		private Long stock;
		
		/**
		 * Pre-sale end time.
		 * Only applicable for self pre-sale stock.
		 */
		private Long preSaleEndTime;
		
		/**
		 * Store-level pre-sale inventory limit.
		 * Only applicable for self pre-sale stock.
		 */
		private Integer mallPreSaleSkuNumLimit;
		
		/**
		 * SKU-level pre-sale inventory limit.
		 * Only applicable for self pre-sale stock.
		 */
		private Long skuPreSaleStockLimit;
		
		public StockDetail() {
		}
		
		/**
		 * @return the inventory type
		 */
		public Integer getStockType() {
			return stockType;
		}
		
		/**
		 * @param stockType the inventory type
		 * @return this object for method chaining
		 */
		public StockDetail setStockType(Integer stockType) {
			this.stockType = stockType;
			return this;
		}
		
		/**
		 * @return the inventory quantity
		 */
		public Long getStock() {
			return stock;
		}
		
		/**
		 * @param stock the inventory quantity
		 * @return this object for method chaining
		 */
		public StockDetail setStock(Long stock) {
			this.stock = stock;
			return this;
		}
		
		/**
		 * @return the pre-sale end time
		 */
		public Long getPreSaleEndTime() {
			return preSaleEndTime;
		}
		
		/**
		 * @param preSaleEndTime the pre-sale end time
		 * @return this object for method chaining
		 */
		public StockDetail setPreSaleEndTime(Long preSaleEndTime) {
			this.preSaleEndTime = preSaleEndTime;
			return this;
		}
		
		/**
		 * @return the store-level pre-sale inventory limit
		 */
		public Integer getMallPreSaleSkuNumLimit() {
			return mallPreSaleSkuNumLimit;
		}
		
		/**
		 * @param mallPreSaleSkuNumLimit the store-level pre-sale inventory limit
		 * @return this object for method chaining
		 */
		public StockDetail setMallPreSaleSkuNumLimit(Integer mallPreSaleSkuNumLimit) {
			this.mallPreSaleSkuNumLimit = mallPreSaleSkuNumLimit;
			return this;
		}
		
		/**
		 * @return the SKU-level pre-sale inventory limit
		 */
		public Long getSkuPreSaleStockLimit() {
			return skuPreSaleStockLimit;
		}
		
		/**
		 * @param skuPreSaleStockLimit the SKU-level pre-sale inventory limit
		 * @return this object for method chaining
		 */
		public StockDetail setSkuPreSaleStockLimit(Long skuPreSaleStockLimit) {
			this.skuPreSaleStockLimit = skuPreSaleStockLimit;
			return this;
		}
	}
}