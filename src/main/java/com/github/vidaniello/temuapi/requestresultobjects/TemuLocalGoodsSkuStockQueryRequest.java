package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'temu.local.goods.sku.stock.query'.
 * Used to query SKU stock information for goods.
 */
public class TemuLocalGoodsSkuStockQueryRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Language for the response.
	 * Optional parameter.
	 */
	private String language;
	
	/**
	 * List of external SKU codes.
	 * Optional parameter used to identify SKUs by their external codes.
	 */
	private List<String> outSkuSnList;
	
	/**
	 * List of SKU IDs.
	 * Optional parameter used to identify SKUs by their internal IDs.
	 */
	private List<Long> skuIdList;
	
	/**
	 * Goods ID.
	 * Optional parameter to filter SKUs by goods ID.
	 */
	private Long goodsId;
		
	public TemuLocalGoodsSkuStockQueryRequest() {
		this.outSkuSnList = new ArrayList<>();
		this.skuIdList = new ArrayList<>();
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
	public TemuLocalGoodsSkuStockQueryRequest setLanguage(String language) {
		this.language = language;
		return this;
	}
	
	/**
	 * @return the list of external SKU codes
	 */
	public List<String> getOutSkuSnList() {
		return outSkuSnList;
	}
	
	/**
	 * @param outSkuSnList the list of external SKU codes
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsSkuStockQueryRequest setOutSkuSnList(List<String> outSkuSnList) {
		this.outSkuSnList = outSkuSnList;
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
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsSkuStockQueryRequest setSkuIdList(List<Long> skuIdList) {
		this.skuIdList = skuIdList;
		return this;
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
	public TemuLocalGoodsSkuStockQueryRequest setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
		return this;
	}
}