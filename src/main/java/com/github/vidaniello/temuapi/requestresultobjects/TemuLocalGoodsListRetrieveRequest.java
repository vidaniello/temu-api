package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'temu.local.goods.list.retrieve'.
 * Used to retrieve a list of goods with various filters and pagination options.
 */
public class TemuLocalGoodsListRetrieveRequest implements TemuRequestIf {

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
	 * Example: "create_time" for sorting by creation time.
	 */
	private String orderField;
	
	/**
	 * The order in which to sort the result items.
	 * 0 for descending order, 1 for ascending order. Descending by default.
	 */
	private Integer orderType;
	
	/**
	 * Product status filter. Required.
	 * Values: ALL("ALL", "ALL = Active + InActive"), ACTIVE("ACTIVE", "Active"), 
	 * INACTIVE("INACTIVE", "InActive"), INCOMPLETE("INCOMPLETE", "Incomplete"), 
	 * DRAFT("DRAFT", "Draft"), DELETED("DELETED", "Deleted").
	 */
	private String goodsSearchType;
	
	/**
	 * Product ID list.
	 * Supports batch limit of 100.
	 */
	private List<String> goodsIdList;
	
	/**
	 * Out Goods Sn list.
	 * Supports batch limit of 100.
	 */
	private List<String> outGoodsSnList;
	
	/**
	 * Sku ID list.
	 * Supports batch limit of 200.
	 */
	private List<String> skuIdList;
	
	/**
	 * OutSkuSn list.
	 * Search limit of 200.
	 */
	private List<String> outSkuSnList;
	
	/**
	 * Category id list.
	 * Search limit of 100.
	 */
	private List<String> catIdList;
	
	/**
	 * The title or name of the product.
	 */
	private String goodsName;
	
	/**
	 * Filter for products created at or after this time.
	 * Unix timestamp, unit: ms.
	 */
	private Long goodsCreateTimeFrom;
	
	/**
	 * Filter for products created at or before this time.
	 * Unix timestamp, unit: ms.
	 */
	private Long goodsCreateTimeTo;
	
	/**
	 * Filter for products whose status was last updated at or after this time.
	 * Unix timestamp, unit: ms.
	 */
	private Long goodsStatusChangeTimeFrom;
	
	/**
	 * Filter for products whose status was last updated at or before this time.
	 * Unix timestamp, unit: ms.
	 */
	private Long goodsStatusChangeTimeTo;
	
	/**
	 * Goods search tags.
	 * 1 - Low traffic, 4 - Restricted traffic.
	 */
	private List<Integer> goodsSearchTags;
		
	public TemuLocalGoodsListRetrieveRequest() {
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
	public TemuLocalGoodsListRetrieveRequest setPageSize(Integer pageSize) {
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
	public TemuLocalGoodsListRetrieveRequest setPageToken(String pageToken) {
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
	public TemuLocalGoodsListRetrieveRequest setOrderField(String orderField) {
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
	public TemuLocalGoodsListRetrieveRequest setOrderType(Integer orderType) {
		this.orderType = orderType;
		return this;
	}
	
	/**
	 * @return the goods search type
	 */
	public String getGoodsSearchType() {
		return goodsSearchType;
	}
	
	/**
	 * @param goodsSearchType the goods search type
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsListRetrieveRequest setGoodsSearchType(String goodsSearchType) {
		this.goodsSearchType = goodsSearchType;
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
	public TemuLocalGoodsListRetrieveRequest setGoodsIdList(List<String> goodsIdList) {
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
	public TemuLocalGoodsListRetrieveRequest setOutGoodsSnList(List<String> outGoodsSnList) {
		this.outGoodsSnList = outGoodsSnList;
		return this;
	}
	
	/**
	 * @return the sku ID list
	 */
	public List<String> getSkuIdList() {
		return skuIdList;
	}
	
	/**
	 * @param skuIdList the sku ID list
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsListRetrieveRequest setSkuIdList(List<String> skuIdList) {
		this.skuIdList = skuIdList;
		return this;
	}
	
	/**
	 * @return the out sku sn list
	 */
	public List<String> getOutSkuSnList() {
		return outSkuSnList;
	}
	
	/**
	 * @param outSkuSnList the out sku sn list
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsListRetrieveRequest setOutSkuSnList(List<String> outSkuSnList) {
		this.outSkuSnList = outSkuSnList;
		return this;
	}
	
	/**
	 * @return the cat ID list
	 */
	public List<String> getCatIdList() {
		return catIdList;
	}
	
	/**
	 * @param catIdList the cat ID list
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsListRetrieveRequest setCatIdList(List<String> catIdList) {
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
	public TemuLocalGoodsListRetrieveRequest setGoodsName(String goodsName) {
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
	public TemuLocalGoodsListRetrieveRequest setGoodsCreateTimeFrom(Long goodsCreateTimeFrom) {
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
	public TemuLocalGoodsListRetrieveRequest setGoodsCreateTimeTo(Long goodsCreateTimeTo) {
		this.goodsCreateTimeTo = goodsCreateTimeTo;
		return this;
	}
	
	/**
	 * @return the goods status change time from
	 */
	public Long getGoodsStatusChangeTimeFrom() {
		return goodsStatusChangeTimeFrom;
	}
	
	/**
	 * @param goodsStatusChangeTimeFrom the goods status change time from
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsListRetrieveRequest setGoodsStatusChangeTimeFrom(Long goodsStatusChangeTimeFrom) {
		this.goodsStatusChangeTimeFrom = goodsStatusChangeTimeFrom;
		return this;
	}
	
	/**
	 * @return the goods status change time to
	 */
	public Long getGoodsStatusChangeTimeTo() {
		return goodsStatusChangeTimeTo;
	}
	
	/**
	 * @param goodsStatusChangeTimeTo the goods status change time to
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsListRetrieveRequest setGoodsStatusChangeTimeTo(Long goodsStatusChangeTimeTo) {
		this.goodsStatusChangeTimeTo = goodsStatusChangeTimeTo;
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
	public TemuLocalGoodsListRetrieveRequest setGoodsSearchTags(List<Integer> goodsSearchTags) {
		this.goodsSearchTags = goodsSearchTags;
		return this;
	}
}