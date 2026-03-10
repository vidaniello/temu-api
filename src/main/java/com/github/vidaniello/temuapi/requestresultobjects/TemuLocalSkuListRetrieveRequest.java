package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'temu.local.sku.list.retrieve'.
 * Used to retrieve a list of SKUs based on various filters and search criteria.
 */
public class TemuLocalSkuListRetrieveRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Page size, indicating the number of records returned per page.
	 * Limit of 100 per page, defaults to 25 per page.
	 */
	private Integer pageSize;
	
	/**
	 * The token used to fetch a specific page when there are multiple pages of results.
	 */
	private String pageToken;
	
	/**
	 * Attribute by which to sort the returned listing items.
	 * Example: create_time for sorting by creation time.
	 */
	private String orderField;
	
	/**
	 * The order in which to sort the result items.
	 * 0 for descending order, 1 for ascending order. Defaults to descending order.
	 */
	private Integer orderType;
	
	/**
	 * SKU status filter.
	 * Required. Possible values: ACTIVE, INACTIVE, INCOMPLETE, DRAFT, DELETED.
	 */
	private String skuSearchType;
	
	/**
	 * Product ID for search.
	 * Limit of 100.
	 */
	private List<String> goodsIdList;
	
	/**
	 * OutGoodsSn for search.
	 * Limit of 100.
	 */
	private List<String> outGoodsSnList;
	
	/**
	 * Sku ID for search.
	 * Limit of 200.
	 */
	private List<String> skuIdList;
	
	/**
	 * OutSkuSn for search.
	 * Limit of 200.
	 */
	private List<String> outSkuSnList;
	
	/**
	 * Category id for search.
	 * Limit of 100.
	 */
	private List<String> catIdList;
	
	/**
	 * The title or name of the product.
	 */
	private String goodsName;
	
	/**
	 * A date and time that is used to filter listing product.
	 * The response includes product that were created at or after this time.
	 * Unix timestamp, unit: ms.
	 */
	private Long goodsCreateTimeFrom;
	
	/**
	 * A date and time that is used to filter listing product.
	 * The response includes product that were created at or before this time.
	 * Unix timestamp, unit: ms.
	 */
	private Long goodsCreateTimeTo;
	
	/**
	 * A date and time that is used to filter SKU.
	 * The response includes status of SKU that were last updated at or after this time.
	 * Unix timestamp, unit: ms.
	 */
	private Long skuStatusChangeTimeFrom;
	
	/**
	 * A date and time that is used to filter SKU.
	 * The response includes status of SKU that were last updated at or before this time.
	 * Unix timestamp, unit: ms.
	 */
	private Long skuStatusChangeTimeTo;
	
	/**
	 * Goods search tags.
	 * 1-Low traffic, 4-Restricted traffic.
	 */
	private List<Integer> goodsSearchTags;
		
	public TemuLocalSkuListRetrieveRequest() {
		this.goodsIdList = new ArrayList<>();
		this.outGoodsSnList = new ArrayList<>();
		this.skuIdList = new ArrayList<>();
		this.outSkuSnList = new ArrayList<>();
		this.catIdList = new ArrayList<>();
		this.goodsSearchTags = new ArrayList<>();
	}
	
	/**
	 * @return the page size
	 */
	public Integer getPageSize() {
		return pageSize;
	}
	
	/**
	 * @param pageSize the page size
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		return this;
	}
	
	/**
	 * @return the page token
	 */
	public String getPageToken() {
		return pageToken;
	}
	
	/**
	 * @param pageToken the page token
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setPageToken(String pageToken) {
		this.pageToken = pageToken;
		return this;
	}
	
	/**
	 * @return the order field
	 */
	public String getOrderField() {
		return orderField;
	}
	
	/**
	 * @param orderField the order field
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setOrderField(String orderField) {
		this.orderField = orderField;
		return this;
	}
	
	/**
	 * @return the order type
	 */
	public Integer getOrderType() {
		return orderType;
	}
	
	/**
	 * @param orderType the order type
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setOrderType(Integer orderType) {
		this.orderType = orderType;
		return this;
	}
	
	/**
	 * @return the SKU search type
	 */
	public String getSkuSearchType() {
		return skuSearchType;
	}
	
	/**
	 * @param skuSearchType the SKU search type
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setSkuSearchType(String skuSearchType) {
		this.skuSearchType = skuSearchType;
		return this;
	}
	
	/**
	 * @return the goods ID list
	 */
	public List<String> getGoodsIdList() {
		return goodsIdList;
	}
	
	/**
	 * @param goodsIdList the goods ID list
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setGoodsIdList(List<String> goodsIdList) {
		this.goodsIdList = goodsIdList;
		return this;
	}
	
	/**
	 * @return the out goods sn list
	 */
	public List<String> getOutGoodsSnList() {
		return outGoodsSnList;
	}
	
	/**
	 * @param outGoodsSnList the out goods sn list
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setOutGoodsSnList(List<String> outGoodsSnList) {
		this.outGoodsSnList = outGoodsSnList;
		return this;
	}
	
	/**
	 * @return the SKU ID list
	 */
	public List<String> getSkuIdList() {
		return skuIdList;
	}
	
	/**
	 * @param skuIdList the SKU ID list
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setSkuIdList(List<String> skuIdList) {
		this.skuIdList = skuIdList;
		return this;
	}
	
	/**
	 * @return the out SKU sn list
	 */
	public List<String> getOutSkuSnList() {
		return outSkuSnList;
	}
	
	/**
	 * @param outSkuSnList the out SKU sn list
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setOutSkuSnList(List<String> outSkuSnList) {
		this.outSkuSnList = outSkuSnList;
		return this;
	}
	
	/**
	 * @return the category ID list
	 */
	public List<String> getCatIdList() {
		return catIdList;
	}
	
	/**
	 * @param catIdList the category ID list
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setCatIdList(List<String> catIdList) {
		this.catIdList = catIdList;
		return this;
	}
	
	/**
	 * @return the goods name
	 */
	public String getGoodsName() {
		return goodsName;
	}
	
	/**
	 * @param goodsName the goods name
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setGoodsName(String goodsName) {
		this.goodsName = goodsName;
		return this;
	}
	
	/**
	 * @return the goods create time from
	 */
	public Long getGoodsCreateTimeFrom() {
		return goodsCreateTimeFrom;
	}
	
	/**
	 * @param goodsCreateTimeFrom the goods create time from
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setGoodsCreateTimeFrom(Long goodsCreateTimeFrom) {
		this.goodsCreateTimeFrom = goodsCreateTimeFrom;
		return this;
	}
	
	/**
	 * @return the goods create time to
	 */
	public Long getGoodsCreateTimeTo() {
		return goodsCreateTimeTo;
	}
	
	/**
	 * @param goodsCreateTimeTo the goods create time to
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setGoodsCreateTimeTo(Long goodsCreateTimeTo) {
		this.goodsCreateTimeTo = goodsCreateTimeTo;
		return this;
	}
	
	/**
	 * @return the SKU status change time from
	 */
	public Long getSkuStatusChangeTimeFrom() {
		return skuStatusChangeTimeFrom;
	}
	
	/**
	 * @param skuStatusChangeTimeFrom the SKU status change time from
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setSkuStatusChangeTimeFrom(Long skuStatusChangeTimeFrom) {
		this.skuStatusChangeTimeFrom = skuStatusChangeTimeFrom;
		return this;
	}
	
	/**
	 * @return the SKU status change time to
	 */
	public Long getSkuStatusChangeTimeTo() {
		return skuStatusChangeTimeTo;
	}
	
	/**
	 * @param skuStatusChangeTimeTo the SKU status change time to
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setSkuStatusChangeTimeTo(Long skuStatusChangeTimeTo) {
		this.skuStatusChangeTimeTo = skuStatusChangeTimeTo;
		return this;
	}
	
	/**
	 * @return the goods search tags
	 */
	public List<Integer> getGoodsSearchTags() {
		return goodsSearchTags;
	}
	
	/**
	 * @param goodsSearchTags the goods search tags
	 * @return this request object for method chaining
	 */
	public TemuLocalSkuListRetrieveRequest setGoodsSearchTags(List<Integer> goodsSearchTags) {
		this.goodsSearchTags = goodsSearchTags;
		return this;
	}
}