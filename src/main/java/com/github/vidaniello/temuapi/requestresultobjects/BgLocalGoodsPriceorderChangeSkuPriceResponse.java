package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Response object for the API call 'bg.local.goods.priceorder.change.sku.price'.
 * Contains the results of the SKU price change operation.
 */
public class BgLocalGoodsPriceorderChangeSkuPriceResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * List of SKU IDs with successfully changed prices.
	 */
	private List<Long> successSkuList;
	
	/**
	 * List of SKU IDs with failed price changes.
	 */
	private List<Long> failedSkuList;
	
	/**
	 * Map containing reasons for price adjustment failures.
	 * Key: SKU ID (as String)
	 * Value: Failure reason
	 */
	private Map<String, String> failedSkuReasonMap;
	
	/**
	 * List of price orders that successfully requested price changes.
	 */
	private List<SuccessPriceOrder> successPriceOrderList;
		
	public BgLocalGoodsPriceorderChangeSkuPriceResponse() {
		this.successSkuList = new ArrayList<>();
		this.failedSkuList = new ArrayList<>();
		this.failedSkuReasonMap = new HashMap<>();
		this.successPriceOrderList = new ArrayList<>();
	}
	
	/**
	 * @return the list of successfully changed SKU IDs
	 */
	public List<Long> getSuccessSkuList() {
		return successSkuList;
	}
	
	/**
	 * @param successSkuList the list of successfully changed SKU IDs
	 * @return this response object for method chaining
	 */
	public BgLocalGoodsPriceorderChangeSkuPriceResponse setSuccessSkuList(List<Long> successSkuList) {
		this.successSkuList = successSkuList;
		return this;
	}
	
	/**
	 * @return the list of failed SKU IDs
	 */
	public List<Long> getFailedSkuList() {
		return failedSkuList;
	}
	
	/**
	 * @param failedSkuList the list of failed SKU IDs
	 * @return this response object for method chaining
	 */
	public BgLocalGoodsPriceorderChangeSkuPriceResponse setFailedSkuList(List<Long> failedSkuList) {
		this.failedSkuList = failedSkuList;
		return this;
	}
	
	/**
	 * @return the map of failure reasons by SKU ID
	 */
	public Map<String, String> getFailedSkuReasonMap() {
		return failedSkuReasonMap;
	}
	
	/**
	 * @param failedSkuReasonMap the map of failure reasons by SKU ID
	 * @return this response object for method chaining
	 */
	public BgLocalGoodsPriceorderChangeSkuPriceResponse setFailedSkuReasonMap(Map<String, String> failedSkuReasonMap) {
		this.failedSkuReasonMap = failedSkuReasonMap;
		return this;
	}
	
	/**
	 * @return the list of successful price orders
	 */
	public List<SuccessPriceOrder> getSuccessPriceOrderList() {
		return successPriceOrderList;
	}
	
	/**
	 * @param successPriceOrderList the list of successful price orders
	 * @return this response object for method chaining
	 */
	public BgLocalGoodsPriceorderChangeSkuPriceResponse setSuccessPriceOrderList(List<SuccessPriceOrder> successPriceOrderList) {
		this.successPriceOrderList = successPriceOrderList;
		return this;
	}
	
	/**
	 * Inner class representing a successful price order.
	 */
	public static class SuccessPriceOrder {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * The price order serial number.
		 */
		private String priceOrderSn;
		
		/**
		 * List of SKU IDs corresponding to the price order.
		 */
		private List<Long> skuIdList;
		
		public SuccessPriceOrder() {
			this.skuIdList = new ArrayList<>();
		}
		
		/**
		 * @return the price order serial number
		 */
		public String getPriceOrderSn() {
			return priceOrderSn;
		}
		
		/**
		 * @param priceOrderSn the price order serial number
		 * @return this object for method chaining
		 */
		public SuccessPriceOrder setPriceOrderSn(String priceOrderSn) {
			this.priceOrderSn = priceOrderSn;
			return this;
		}
		
		/**
		 * @return the list of SKU IDs
		 */
		public List<Long> getSkuIdList() {
			return skuIdList;
		}
		
		/**
		 * @param skuIdList the list of SKU IDs
		 * @return this object for method chaining
		 */
		public SuccessPriceOrder setSkuIdList(List<Long> skuIdList) {
			this.skuIdList = skuIdList;
			return this;
		}
	}
}