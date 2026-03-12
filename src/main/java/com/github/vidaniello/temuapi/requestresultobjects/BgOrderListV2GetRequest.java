package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'bg.order.list.v2.get'.
 * Used to retrieve a list of parent orders based on various filters.
 */
public class BgOrderListV2GetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Page number for pagination, default is 1.
	 */
	private Integer pageNumber;
	
	/**
	 * Page size for pagination, default is 10, max is 100.
	 */
	private Integer pageSize;
	
	/**
	 * Parent order status, default is to query all. Enum values:
	 * 0 : All,
	 * 1 : PENDING, Pending status
	 * 2 : UN_SHIPPING, Awaiting shipment
	 * 3 : CANCELED, Order canceled,
	 * 4 : SHIPPED, Order shipped,
	 * 5 : RECEIPTED, Order received
	 * 41: Partially shipped (only for local mall),
	 * 51: Partially received (only for local mall).
	 */
	private Integer parentOrderStatus;
	
	/**
	 * List of parent order numbers, max 20 per request.
	 */
	private List<String> parentOrderSnList;
	
	/**
	 * Start time for querying parent order creation, in seconds (timestamp).
	 * Defines the starting range of the creation time when querying parent orders.
	 * Must be used in conjunction with createBefore.
	 */
	private Integer createAfter;
	
	/**
	 * End time for querying parent order creation, in seconds (timestamp).
	 * Defines the ending range (closed interval) of the creation time when querying parent orders.
	 * Must be used in conjunction with createAfter.
	 */
	private Integer createBefore;
	
	/**
	 * Start time for querying expected latest shipment, in seconds.
	 */
	private Integer expectShipLatestTimeStart;
	
	/**
	 * End time for querying expected latest shipment, in seconds.
	 */
	private Integer expectShipLatestTimeEnd;
	
	/**
	 * Start time for querying order update, in seconds (timestamp).
	 * Defines the starting range of the status change time when querying parent orders.
	 * Must be used in conjunction with updateAtEnd.
	 */
	private Integer updateAtStart;
	
	/**
	 * End time for querying order update, in seconds (timestamp).
	 * Defines the ending range (closed interval) of the status change time when querying parent orders.
	 * Must be used in conjunction with updateAtStart.
	 */
	private Integer updateAtEnd;
	
	/**
	 * Query the confirmed start time of the parent order, with the input parameter in seconds (timestamp).
	 * Define the starting range for the final confirmation time when querying the parent order.
	 * Must be used together with parentConfirmTimeEnd.
	 */
	private Integer parentConfirmTimeStart;
	
	/**
	 * Query the confirmation end time of the parent order in seconds (timestamp) as a parameter.
	 * Define the end range of confirmation time when querying parent order.
	 * Must be used together with parentConfirmTimeStart.
	 */
	private Integer parentConfirmTimeEnd;
	
	/**
	 * Region ID, e.g., USA - 211.
	 */
	private Long regionId;
	
	/**
	 * The type of order fulfillment. Enum values:
	 * fulfillBySeller : fulfill by seller,
	 * fulfillByCooperativeWarehouse : fulfill by CooperativeWarehouse.
	 */
	private List<String> fulfillmentTypeList;
	
	/**
	 * List of PO order status labels:
	 * soon_to_be_overdue
	 * past_due
	 * pending_buyer_cancellation
	 * pending_buyer_address_change
	 * pending_risk_control_alert
	 * signature_required_on_delivery
	 */
	private List<String> parentOrderLabel;
	
	/**
	 * There may be logistics anomalies after the order is shipped:
	 * WRONG_SHIPPING_ADDRESS
	 * SUSPECTED_ERROR_PROVIDER
	 * NO_TRACK
	 * TRACK_TOO_EARLY
	 * OVERTIME_COLLECTION
	 * TRACK_COLLECT_FAIL
	 */
	private List<String> packageAbnormalTypeList;
	
	/**
	 * Sort by, output in reverse order.
	 * By default, the order creation time is used.
	 * The corresponding enumeration is: updateTime, createTime.
	 */
	private String sortby;
	
	/**
	 * Whether the parent order contains presale orders for inventory in transit.
	 */
	private Boolean hasPreSaleOrder;
	
	/**
	 * Whether the parent order contains orders that require qualification upload.
	 */
	private Boolean hasQualificationRequiredOrder;
	
	/**
	 * SKU ID.
	 */
	private Long skuId;
		
	public BgOrderListV2GetRequest() {
		this.parentOrderSnList = new ArrayList<>();
		this.fulfillmentTypeList = new ArrayList<>();
		this.parentOrderLabel = new ArrayList<>();
		this.packageAbnormalTypeList = new ArrayList<>();
	}
	
	/**
	 * @return the page number
	 */
	public Integer getPageNumber() {
		return pageNumber;
	}
	
	/**
	 * @param pageNumber the page number
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		return this;
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
	public BgOrderListV2GetRequest setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		return this;
	}
	
	/**
	 * @return the parent order status
	 */
	public Integer getParentOrderStatus() {
		return parentOrderStatus;
	}
	
	/**
	 * @param parentOrderStatus the parent order status
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setParentOrderStatus(Integer parentOrderStatus) {
		this.parentOrderStatus = parentOrderStatus;
		return this;
	}
	
	/**
	 * @return the list of parent order numbers
	 */
	public List<String> getParentOrderSnList() {
		return parentOrderSnList;
	}
	
	/**
	 * @param parentOrderSnList the list of parent order numbers
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setParentOrderSnList(List<String> parentOrderSnList) {
		this.parentOrderSnList = parentOrderSnList;
		return this;
	}
	
	/**
	 * @return the start time for creation query
	 */
	public Integer getCreateAfter() {
		return createAfter;
	}
	
	/**
	 * @param createAfter the start time for creation query
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setCreateAfter(Integer createAfter) {
		this.createAfter = createAfter;
		return this;
	}
	
	/**
	 * @return the end time for creation query
	 */
	public Integer getCreateBefore() {
		return createBefore;
	}
	
	/**
	 * @param createBefore the end time for creation query
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setCreateBefore(Integer createBefore) {
		this.createBefore = createBefore;
		return this;
	}
	
	/**
	 * @return the start time for expected latest shipment
	 */
	public Integer getExpectShipLatestTimeStart() {
		return expectShipLatestTimeStart;
	}
	
	/**
	 * @param expectShipLatestTimeStart the start time for expected latest shipment
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setExpectShipLatestTimeStart(Integer expectShipLatestTimeStart) {
		this.expectShipLatestTimeStart = expectShipLatestTimeStart;
		return this;
	}
	
	/**
	 * @return the end time for expected latest shipment
	 */
	public Integer getExpectShipLatestTimeEnd() {
		return expectShipLatestTimeEnd;
	}
	
	/**
	 * @param expectShipLatestTimeEnd the end time for expected latest shipment
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setExpectShipLatestTimeEnd(Integer expectShipLatestTimeEnd) {
		this.expectShipLatestTimeEnd = expectShipLatestTimeEnd;
		return this;
	}
	
	/**
	 * @return the start time for update query
	 */
	public Integer getUpdateAtStart() {
		return updateAtStart;
	}
	
	/**
	 * @param updateAtStart the start time for update query
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setUpdateAtStart(Integer updateAtStart) {
		this.updateAtStart = updateAtStart;
		return this;
	}
	
	/**
	 * @return the end time for update query
	 */
	public Integer getUpdateAtEnd() {
		return updateAtEnd;
	}
	
	/**
	 * @param updateAtEnd the end time for update query
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setUpdateAtEnd(Integer updateAtEnd) {
		this.updateAtEnd = updateAtEnd;
		return this;
	}
	
	/**
	 * @return the start time for parent confirm time
	 */
	public Integer getParentConfirmTimeStart() {
		return parentConfirmTimeStart;
	}
	
	/**
	 * @param parentConfirmTimeStart the start time for parent confirm time
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setParentConfirmTimeStart(Integer parentConfirmTimeStart) {
		this.parentConfirmTimeStart = parentConfirmTimeStart;
		return this;
	}
	
	/**
	 * @return the end time for parent confirm time
	 */
	public Integer getParentConfirmTimeEnd() {
		return parentConfirmTimeEnd;
	}
	
	/**
	 * @param parentConfirmTimeEnd the end time for parent confirm time
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setParentConfirmTimeEnd(Integer parentConfirmTimeEnd) {
		this.parentConfirmTimeEnd = parentConfirmTimeEnd;
		return this;
	}
	
	/**
	 * @return the region ID
	 */
	public Long getRegionId() {
		return regionId;
	}
	
	/**
	 * @param regionId the region ID
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setRegionId(Long regionId) {
		this.regionId = regionId;
		return this;
	}
	
	/**
	 * @return the list of fulfillment types
	 */
	public List<String> getFulfillmentTypeList() {
		return fulfillmentTypeList;
	}
	
	/**
	 * @param fulfillmentTypeList the list of fulfillment types
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setFulfillmentTypeList(List<String> fulfillmentTypeList) {
		this.fulfillmentTypeList = fulfillmentTypeList;
		return this;
	}
	
	/**
	 * @return the list of parent order labels
	 */
	public List<String> getParentOrderLabel() {
		return parentOrderLabel;
	}
	
	/**
	 * @param parentOrderLabel the list of parent order labels
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setParentOrderLabel(List<String> parentOrderLabel) {
		this.parentOrderLabel = parentOrderLabel;
		return this;
	}
	
	/**
	 * @return the list of package abnormal types
	 */
	public List<String> getPackageAbnormalTypeList() {
		return packageAbnormalTypeList;
	}
	
	/**
	 * @param packageAbnormalTypeList the list of package abnormal types
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setPackageAbnormalTypeList(List<String> packageAbnormalTypeList) {
		this.packageAbnormalTypeList = packageAbnormalTypeList;
		return this;
	}
	
	/**
	 * @return the sort by field
	 */
	public String getSortby() {
		return sortby;
	}
	
	/**
	 * @param sortby the sort by field
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setSortby(String sortby) {
		this.sortby = sortby;
		return this;
	}
	
	/**
	 * @return whether the parent order contains presale orders
	 */
	public Boolean getHasPreSaleOrder() {
		return hasPreSaleOrder;
	}
	
	/**
	 * @param hasPreSaleOrder whether the parent order contains presale orders
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setHasPreSaleOrder(Boolean hasPreSaleOrder) {
		this.hasPreSaleOrder = hasPreSaleOrder;
		return this;
	}
	
	/**
	 * @return whether the parent order contains orders that require qualification upload
	 */
	public Boolean getHasQualificationRequiredOrder() {
		return hasQualificationRequiredOrder;
	}
	
	/**
	 * @param hasQualificationRequiredOrder whether the parent order contains orders that require qualification upload
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setHasQualificationRequiredOrder(Boolean hasQualificationRequiredOrder) {
		this.hasQualificationRequiredOrder = hasQualificationRequiredOrder;
		return this;
	}
	
	/**
	 * @return the SKU ID
	 */
	public Long getSkuId() {
		return skuId;
	}
	
	/**
	 * @param skuId the SKU ID
	 * @return this request object for method chaining
	 */
	public BgOrderListV2GetRequest setSkuId(Long skuId) {
		this.skuId = skuId;
		return this;
	}
}