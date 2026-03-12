package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'bg.order.list.v2.get'.
 * Contains the list of parent orders and their details.
 */
public class BgOrderListV2GetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;

	/**
	 * Total number of matching records.
	 */
	private Integer totalItemNum;

	/**
	 * Page items containing parent order information and order lists.
	 */
	private List<PageItem> pageItems;

	public BgOrderListV2GetResponse() {
		this.pageItems = new ArrayList<>();
	}

	/**
	 * @return the total number of matching records
	 */
	public Integer getTotalItemNum() {
		return totalItemNum;
	}

	/**
	 * @param totalItemNum the total number of matching records
	 * @return this response object for method chaining
	 */
	public BgOrderListV2GetResponse setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
		return this;
	}

	/**
	 * @return the list of page items
	 */
	public List<PageItem> getPageItems() {
		return pageItems;
	}

	/**
	 * @param pageItems the list of page items
	 * @return this response object for method chaining
	 */
	public BgOrderListV2GetResponse setPageItems(List<PageItem> pageItems) {
		this.pageItems = pageItems;
		return this;
	}

	/**
	 * Represents a page item containing parent order map and order list.
	 */
	public static class PageItem {

		/**
		 * Parent order information.
		 */
		private ParentOrderMap parentOrderMap;

		/**
		 * Order information list.
		 */
		private List<Order> orderList;

		public PageItem() {
			this.orderList = new ArrayList<>();
		}

		/**
		 * @return the parent order map
		 */
		public ParentOrderMap getParentOrderMap() {
			return parentOrderMap;
		}

		/**
		 * @param parentOrderMap the parent order map
		 * @return this page item object for method chaining
		 */
		public PageItem setParentOrderMap(ParentOrderMap parentOrderMap) {
			this.parentOrderMap = parentOrderMap;
			return this;
		}

		/**
		 * @return the list of orders
		 */
		public List<Order> getOrderList() {
			return orderList;
		}

		/**
		 * @param orderList the list of orders
		 * @return this page item object for method chaining
		 */
		public PageItem setOrderList(List<Order> orderList) {
			this.orderList = orderList;
			return this;
		}
	}

	/**
	 * Parent order information.
	 */
	public static class ParentOrderMap {

		/**
		 * Parent order number.
		 */
		private String parentOrderSn;

		/**
		 * Status of the parent order.
		 * 1-PENDING; 2-UN_SHIPPING; 3-CANCELED; 4-SHIPPED; 41-PARTIALLY_SHIPPED;
		 * 5-DELIVERED; 51-PARTIALLY_DELIVERED.
		 */
		private Integer parentOrderStatus;

		/**
		 * Time when the parent order was placed.
		 */
		private Integer parentOrderTime;

		/**
		 * Latest shipment time.
		 */
		private Integer expectShipLatestTime;

		/**
		 * Time when the parent order finish pending.
		 */
		private Integer parentOrderPendingFinishTime;

		/**
		 * Latest delivery time.
		 */
		private Integer latestDeliveryTime;

		/**
		 * Time when the parent order was shipped.
		 */
		private Integer parentShippingTime;

		/**
		 * Site ID.
		 */
		private Long siteId;

		/**
		 * Region ID, e.g., USA - 211.
		 */
		private Long regionId;

		/**
		 * List of PO order status labels.
		 */
		private List<ParentOrderLabel> parentOrderLabel;

		/**
		 * Fulfillment Prompt.
		 * enum values:
		 * SUGGEST_SIGNATURE_ON_DELIVERY, CONFIRMED_CHANGED_ADDRESS,
		 * RESTRICT_FEDEX_SELF_SHIPPING, RESTRICT_USPS_SELF_SHIPPING,
		 * RESTRICT_CALL_SHIPPING, RESTRICT_SELF_SHIPPING,
		 * BLOCK_LOGISTICS_PROVIDERS_{Name1,Name2,……}
		 */
		private List<String> fulfillmentWarning;

		/**
		 * Is the actual shipping fee paid by the user for this parent order is zero.
		 * true: user paid zero, false: user paid not zero.
		 * (only for local mall)
		 */
		private Boolean hasShippingFee;

		/**
		 * Order update time, in seconds.
		 */
		private Long updateTime;

		/**
		 * Order payment type: COD, PPD.
		 */
		private String orderPaymentType;

		/**
		 * Batch order number list, only order fulfilled by cooperative warehouse
		 * will return with value, otherwise it will return with empty.
		 */
		private List<String> batchOrderNumberList;

		/**
		 * Delivery channel type.
		 * 1-Standard Shipping, 2-Store Delivery.
		 */
		private Integer shippingMethod;

		/**
		 * Confirmation time of parent order in seconds (timestamp).
		 */
		private Integer parentConfirmTime;

		public ParentOrderMap() {
			this.parentOrderLabel = new ArrayList<>();
			this.fulfillmentWarning = new ArrayList<>();
			this.batchOrderNumberList = new ArrayList<>();
		}

		/**
		 * @return the parent order number
		 */
		public String getParentOrderSn() {
			return parentOrderSn;
		}

		/**
		 * @param parentOrderSn the parent order number
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setParentOrderSn(String parentOrderSn) {
			this.parentOrderSn = parentOrderSn;
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
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setParentOrderStatus(Integer parentOrderStatus) {
			this.parentOrderStatus = parentOrderStatus;
			return this;
		}

		/**
		 * @return the time when the parent order was placed
		 */
		public Integer getParentOrderTime() {
			return parentOrderTime;
		}

		/**
		 * @param parentOrderTime the time when the parent order was placed
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setParentOrderTime(Integer parentOrderTime) {
			this.parentOrderTime = parentOrderTime;
			return this;
		}

		/**
		 * @return the latest shipment time
		 */
		public Integer getExpectShipLatestTime() {
			return expectShipLatestTime;
		}

		/**
		 * @param expectShipLatestTime the latest shipment time
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setExpectShipLatestTime(Integer expectShipLatestTime) {
			this.expectShipLatestTime = expectShipLatestTime;
			return this;
		}

		/**
		 * @return the time when the parent order finish pending
		 */
		public Integer getParentOrderPendingFinishTime() {
			return parentOrderPendingFinishTime;
		}

		/**
		 * @param parentOrderPendingFinishTime the time when the parent order finish pending
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setParentOrderPendingFinishTime(Integer parentOrderPendingFinishTime) {
			this.parentOrderPendingFinishTime = parentOrderPendingFinishTime;
			return this;
		}

		/**
		 * @return the latest delivery time
		 */
		public Integer getLatestDeliveryTime() {
			return latestDeliveryTime;
		}

		/**
		 * @param latestDeliveryTime the latest delivery time
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setLatestDeliveryTime(Integer latestDeliveryTime) {
			this.latestDeliveryTime = latestDeliveryTime;
			return this;
		}

		/**
		 * @return the time when the parent order was shipped
		 */
		public Integer getParentShippingTime() {
			return parentShippingTime;
		}

		/**
		 * @param parentShippingTime the time when the parent order was shipped
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setParentShippingTime(Integer parentShippingTime) {
			this.parentShippingTime = parentShippingTime;
			return this;
		}

		/**
		 * @return the site ID
		 */
		public Long getSiteId() {
			return siteId;
		}

		/**
		 * @param siteId the site ID
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setSiteId(Long siteId) {
			this.siteId = siteId;
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
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setRegionId(Long regionId) {
			this.regionId = regionId;
			return this;
		}

		/**
		 * @return the list of parent order labels
		 */
		public List<ParentOrderLabel> getParentOrderLabel() {
			return parentOrderLabel;
		}

		/**
		 * @param parentOrderLabel the list of parent order labels
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setParentOrderLabel(List<ParentOrderLabel> parentOrderLabel) {
			this.parentOrderLabel = parentOrderLabel;
			return this;
		}

		/**
		 * @return the list of fulfillment warnings
		 */
		public List<String> getFulfillmentWarning() {
			return fulfillmentWarning;
		}

		/**
		 * @param fulfillmentWarning the list of fulfillment warnings
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setFulfillmentWarning(List<String> fulfillmentWarning) {
			this.fulfillmentWarning = fulfillmentWarning;
			return this;
		}

		/**
		 * @return whether the shipping fee paid by user is zero
		 */
		public Boolean getHasShippingFee() {
			return hasShippingFee;
		}

		/**
		 * @param hasShippingFee whether the shipping fee paid by user is zero
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setHasShippingFee(Boolean hasShippingFee) {
			this.hasShippingFee = hasShippingFee;
			return this;
		}

		/**
		 * @return the order update time
		 */
		public Long getUpdateTime() {
			return updateTime;
		}

		/**
		 * @param updateTime the order update time
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
			return this;
		}

		/**
		 * @return the order payment type
		 */
		public String getOrderPaymentType() {
			return orderPaymentType;
		}

		/**
		 * @param orderPaymentType the order payment type
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setOrderPaymentType(String orderPaymentType) {
			this.orderPaymentType = orderPaymentType;
			return this;
		}

		/**
		 * @return the batch order number list
		 */
		public List<String> getBatchOrderNumberList() {
			return batchOrderNumberList;
		}

		/**
		 * @param batchOrderNumberList the batch order number list
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setBatchOrderNumberList(List<String> batchOrderNumberList) {
			this.batchOrderNumberList = batchOrderNumberList;
			return this;
		}

		/**
		 * @return the shipping method
		 */
		public Integer getShippingMethod() {
			return shippingMethod;
		}

		/**
		 * @param shippingMethod the shipping method
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setShippingMethod(Integer shippingMethod) {
			this.shippingMethod = shippingMethod;
			return this;
		}

		/**
		 * @return the parent confirm time
		 */
		public Integer getParentConfirmTime() {
			return parentConfirmTime;
		}

		/**
		 * @param parentConfirmTime the parent confirm time
		 * @return this parent order map object for method chaining
		 */
		public ParentOrderMap setParentConfirmTime(Integer parentConfirmTime) {
			this.parentConfirmTime = parentConfirmTime;
			return this;
		}
	}

	/**
	 * Parent order label.
	 */
	public static class ParentOrderLabel {

		/**
		 * Label name.
		 * Possible values: soon_to_be_overdue, past_due, pending_buyer_cancellation,
		 * pending_buyer_address_change, pending_risk_control_alert,
		 * signature_required_on_delivery.
		 */
		private String name;

		/**
		 * Whether the label exists: 0 = no label, 1 = label exists.
		 */
		private Integer value;

		/**
		 * @return the label name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the label name
		 * @return this parent order label object for method chaining
		 */
		public ParentOrderLabel setName(String name) {
			this.name = name;
			return this;
		}

		/**
		 * @return whether the label exists
		 */
		public Integer getValue() {
			return value;
		}

		/**
		 * @param value whether the label exists
		 * @return this parent order label object for method chaining
		 */
		public ParentOrderLabel setValue(Integer value) {
			this.value = value;
			return this;
		}
	}

	/**
	 * Order information.
	 */
	public static class Order {

		/**
		 * Order number (sub-order number).
		 */
		private String orderSn;

		/**
		 * The quantity of seller needs to fulfill.
		 * quantity = originalOrderQuantity - canceledQuantityBeforeShipment.
		 */
		private Integer quantity;

		/**
		 * The quantity of canceled before shipment.
		 */
		private Integer canceledQuantityBeforeShipment;

		/**
		 * The quantity of original single items in order.
		 */
		private Integer originalOrderQuantity;

		/**
		 * Goods ID.
		 */
		private Long goodsId;

		/**
		 * Sku id. It is only valid for LOCAL sellers not SEMI sellers.
		 */
		private Long skuId;

		/**
		 * Product specification description for customer.
		 */
		private String spec;

		/**
		 * Product specification description for seller.
		 * Only for orders whose confirmation time is within no more than six months.
		 */
		private String originalSpecName;

		/**
		 * Thumbnail image URL.
		 */
		private String thumbUrl;

		/**
		 * Product name for customer.
		 */
		private String goodsName;

		/**
		 * Product name for seller.
		 * Only for orders whose confirmation time is within no more than six months.
		 */
		private String originalGoodsName;

		/**
		 * Status of the order.
		 * 1-PENDING; 2-UN_SHIPPING; 3-CANCELED; 4-SHIPPED; 41-PARTIALLY_SHIPPED;
		 * 5-DELIVERED; 51-PARTIALLY_DELIVERED.
		 */
		private Integer orderStatus;

		/**
		 * List of products.
		 */
		private List<Product> productList;

		/**
		 * There may be logistics anomalies after the order is shipped.
		 * Possible values: WRONG_SHIPPING_ADDRESS, SUSPECTED_ERROR_PROVIDER, NO_TRACK,
		 * TRACK_TOO_EARLY, OVERTIME_COLLECTION, TRACK_COLLECT_FAIL, SIGNED_BUT_UNRECEIVED_TASK.
		 */
		private List<String> packageAbnormalTypeList;

		/**
		 * Label name.
		 * Possible values: customized_products, US_to_CA, pre_sale_order, made_to_order,
		 * vacation_order, Y2_advance_sale, second_hand_collectible_order, second_hand_luxury_order.
		 */
		private List<OrderLabel> orderLabel;

		/**
		 * Fulfillment Prompt.
		 * enum values: SAVE_SN_INFORMATION_FOR_RETURN, REQUIRES_AGE_VERIFICATION,
		 * SHIPPING_METHOD_SELF_DELIVERY, REQUIRES_AUTHENTICATION_REPORT_SUBMISSION.
		 */
		private List<String> fulfillmentWarning;

		/**
		 * The type of order fulfillment.
		 * enum values: fulfillBySeller, fulfillByCooperativeWarehouse.
		 */
		private String fulfillmentType;

		/**
		 * The id of inventory deduction warehouse.
		 */
		private String inventoryDeductionWarehouseId;

		/**
		 * The name of inventory deduction warehouse.
		 */
		private String inventoryDeductionWarehouseName;

		/**
		 * Order payment type: COD, PPD.
		 */
		private String orderPaymentType;

		/**
		 * Whether the order is completely cancelled during the pending period.
		 */
		private Boolean isCancelledDuringPending;

		/**
		 * Order can only get shipping document after this time.
		 */
		private Integer earliestTimeGetShippingDocument;

		/**
		 * Time when the order was shipped.
		 * If the order contains unshipped or delayed packages, the return value is null.
		 */
		private Integer orderShippingTime;

		/**
		 * The time when the order was created.
		 */
		private Integer orderCreateTime;

		/**
		 * Deadline for uploading order qualification documents.
		 */
		private Long qualificationUploadEndTime;

		public Order() {
			this.productList = new ArrayList<>();
			this.packageAbnormalTypeList = new ArrayList<>();
			this.orderLabel = new ArrayList<>();
			this.fulfillmentWarning = new ArrayList<>();
		}

		/**
		 * @return the order number
		 */
		public String getOrderSn() {
			return orderSn;
		}

		/**
		 * @param orderSn the order number
		 * @return this order object for method chaining
		 */
		public Order setOrderSn(String orderSn) {
			this.orderSn = orderSn;
			return this;
		}

		/**
		 * @return the quantity to fulfill
		 */
		public Integer getQuantity() {
			return quantity;
		}

		/**
		 * @param quantity the quantity to fulfill
		 * @return this order object for method chaining
		 */
		public Order setQuantity(Integer quantity) {
			this.quantity = quantity;
			return this;
		}

		/**
		 * @return the canceled quantity before shipment
		 */
		public Integer getCanceledQuantityBeforeShipment() {
			return canceledQuantityBeforeShipment;
		}

		/**
		 * @param canceledQuantityBeforeShipment the canceled quantity before shipment
		 * @return this order object for method chaining
		 */
		public Order setCanceledQuantityBeforeShipment(Integer canceledQuantityBeforeShipment) {
			this.canceledQuantityBeforeShipment = canceledQuantityBeforeShipment;
			return this;
		}

		/**
		 * @return the original order quantity
		 */
		public Integer getOriginalOrderQuantity() {
			return originalOrderQuantity;
		}

		/**
		 * @param originalOrderQuantity the original order quantity
		 * @return this order object for method chaining
		 */
		public Order setOriginalOrderQuantity(Integer originalOrderQuantity) {
			this.originalOrderQuantity = originalOrderQuantity;
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
		 * @return this order object for method chaining
		 */
		public Order setGoodsId(Long goodsId) {
			this.goodsId = goodsId;
			return this;
		}

		/**
		 * @return the sku ID
		 */
		public Long getSkuId() {
			return skuId;
		}

		/**
		 * @param skuId the sku ID
		 * @return this order object for method chaining
		 */
		public Order setSkuId(Long skuId) {
			this.skuId = skuId;
			return this;
		}

		/**
		 * @return the product specification description for customer
		 */
		public String getSpec() {
			return spec;
		}

		/**
		 * @param spec the product specification description for customer
		 * @return this order object for method chaining
		 */
		public Order setSpec(String spec) {
			this.spec = spec;
			return this;
		}

		/**
		 * @return the product specification description for seller
		 */
		public String getOriginalSpecName() {
			return originalSpecName;
		}

		/**
		 * @param originalSpecName the product specification description for seller
		 * @return this order object for method chaining
		 */
		public Order setOriginalSpecName(String originalSpecName) {
			this.originalSpecName = originalSpecName;
			return this;
		}

		/**
		 * @return the thumbnail image URL
		 */
		public String getThumbUrl() {
			return thumbUrl;
		}

		/**
		 * @param thumbUrl the thumbnail image URL
		 * @return this order object for method chaining
		 */
		public Order setThumbUrl(String thumbUrl) {
			this.thumbUrl = thumbUrl;
			return this;
		}

		/**
		 * @return the product name for customer
		 */
		public String getGoodsName() {
			return goodsName;
		}

		/**
		 * @param goodsName the product name for customer
		 * @return this order object for method chaining
		 */
		public Order setGoodsName(String goodsName) {
			this.goodsName = goodsName;
			return this;
		}

		/**
		 * @return the product name for seller
		 */
		public String getOriginalGoodsName() {
			return originalGoodsName;
		}

		/**
		 * @param originalGoodsName the product name for seller
		 * @return this order object for method chaining
		 */
		public Order setOriginalGoodsName(String originalGoodsName) {
			this.originalGoodsName = originalGoodsName;
			return this;
		}

		/**
		 * @return the order status
		 */
		public Integer getOrderStatus() {
			return orderStatus;
		}

		/**
		 * @param orderStatus the order status
		 * @return this order object for method chaining
		 */
		public Order setOrderStatus(Integer orderStatus) {
			this.orderStatus = orderStatus;
			return this;
		}

		/**
		 * @return the list of products
		 */
		public List<Product> getProductList() {
			return productList;
		}

		/**
		 * @param productList the list of products
		 * @return this order object for method chaining
		 */
		public Order setProductList(List<Product> productList) {
			this.productList = productList;
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
		 * @return this order object for method chaining
		 */
		public Order setPackageAbnormalTypeList(List<String> packageAbnormalTypeList) {
			this.packageAbnormalTypeList = packageAbnormalTypeList;
			return this;
		}

		/**
		 * @return the list of order labels
		 */
		public List<OrderLabel> getOrderLabel() {
			return orderLabel;
		}

		/**
		 * @param orderLabel the list of order labels
		 * @return this order object for method chaining
		 */
		public Order setOrderLabel(List<OrderLabel> orderLabel) {
			this.orderLabel = orderLabel;
			return this;
		}

		/**
		 * @return the list of fulfillment warnings
		 */
		public List<String> getFulfillmentWarning() {
			return fulfillmentWarning;
		}

		/**
		 * @param fulfillmentWarning the list of fulfillment warnings
		 * @return this order object for method chaining
		 */
		public Order setFulfillmentWarning(List<String> fulfillmentWarning) {
			this.fulfillmentWarning = fulfillmentWarning;
			return this;
		}

		/**
		 * @return the fulfillment type
		 */
		public String getFulfillmentType() {
			return fulfillmentType;
		}

		/**
		 * @param fulfillmentType the fulfillment type
		 * @return this order object for method chaining
		 */
		public Order setFulfillmentType(String fulfillmentType) {
			this.fulfillmentType = fulfillmentType;
			return this;
		}

		/**
		 * @return the inventory deduction warehouse ID
		 */
		public String getInventoryDeductionWarehouseId() {
			return inventoryDeductionWarehouseId;
		}

		/**
		 * @param inventoryDeductionWarehouseId the inventory deduction warehouse ID
		 * @return this order object for method chaining
		 */
		public Order setInventoryDeductionWarehouseId(String inventoryDeductionWarehouseId) {
			this.inventoryDeductionWarehouseId = inventoryDeductionWarehouseId;
			return this;
		}

		/**
		 * @return the inventory deduction warehouse name
		 */
		public String getInventoryDeductionWarehouseName() {
			return inventoryDeductionWarehouseName;
		}

		/**
		 * @param inventoryDeductionWarehouseName the inventory deduction warehouse name
		 * @return this order object for method chaining
		 */
		public Order setInventoryDeductionWarehouseName(String inventoryDeductionWarehouseName) {
			this.inventoryDeductionWarehouseName = inventoryDeductionWarehouseName;
			return this;
		}

		/**
		 * @return the order payment type
		 */
		public String getOrderPaymentType() {
			return orderPaymentType;
		}

		/**
		 * @param orderPaymentType the order payment type
		 * @return this order object for method chaining
		 */
		public Order setOrderPaymentType(String orderPaymentType) {
			this.orderPaymentType = orderPaymentType;
			return this;
		}

		/**
		 * @return whether the order is cancelled during pending
		 */
		public Boolean getIsCancelledDuringPending() {
			return isCancelledDuringPending;
		}

		/**
		 * @param isCancelledDuringPending whether the order is cancelled during pending
		 * @return this order object for method chaining
		 */
		public Order setIsCancelledDuringPending(Boolean isCancelledDuringPending) {
			this.isCancelledDuringPending = isCancelledDuringPending;
			return this;
		}

		/**
		 * @return the earliest time to get shipping document
		 */
		public Integer getEarliestTimeGetShippingDocument() {
			return earliestTimeGetShippingDocument;
		}

		/**
		 * @param earliestTimeGetShippingDocument the earliest time to get shipping document
		 * @return this order object for method chaining
		 */
		public Order setEarliestTimeGetShippingDocument(Integer earliestTimeGetShippingDocument) {
			this.earliestTimeGetShippingDocument = earliestTimeGetShippingDocument;
			return this;
		}

		/**
		 * @return the order shipping time
		 */
		public Integer getOrderShippingTime() {
			return orderShippingTime;
		}

		/**
		 * @param orderShippingTime the order shipping time
		 * @return this order object for method chaining
		 */
		public Order setOrderShippingTime(Integer orderShippingTime) {
			this.orderShippingTime = orderShippingTime;
			return this;
		}

		/**
		 * @return the order create time
		 */
		public Integer getOrderCreateTime() {
			return orderCreateTime;
		}

		/**
		 * @param orderCreateTime the order create time
		 * @return this order object for method chaining
		 */
		public Order setOrderCreateTime(Integer orderCreateTime) {
			this.orderCreateTime = orderCreateTime;
			return this;
		}

		/**
		 * @return the qualification upload end time
		 */
		public Long getQualificationUploadEndTime() {
			return qualificationUploadEndTime;
		}

		/**
		 * @param qualificationUploadEndTime the qualification upload end time
		 * @return this order object for method chaining
		 */
		public Order setQualificationUploadEndTime(Long qualificationUploadEndTime) {
			this.qualificationUploadEndTime = qualificationUploadEndTime;
			return this;
		}
	}

	/**
	 * Product information.
	 */
	public static class Product {

		/**
		 * Product ID.
		 */
		private Long productId;

		/**
		 * Product sku id. It is only valid for SEMI sellers not LOCAL sellers.
		 */
		private Long productSkuId;

		/**
		 * Conversion factor between product quantity and item quantity.
		 * The product quantity multiplied by this factor represents the item quantity.
		 */
		private Long soldFactor;

		/**
		 * Item code.
		 */
		private String extCode;

		/**
		 * @return the product ID
		 */
		public Long getProductId() {
			return productId;
		}

		/**
		 * @param productId the product ID
		 * @return this product object for method chaining
		 */
		public Product setProductId(Long productId) {
			this.productId = productId;
			return this;
		}

		/**
		 * @return the product sku ID
		 */
		public Long getProductSkuId() {
			return productSkuId;
		}

		/**
		 * @param productSkuId the product sku ID
		 * @return this product object for method chaining
		 */
		public Product setProductSkuId(Long productSkuId) {
			this.productSkuId = productSkuId;
			return this;
		}

		/**
		 * @return the sold factor
		 */
		public Long getSoldFactor() {
			return soldFactor;
		}

		/**
		 * @param soldFactor the sold factor
		 * @return this product object for method chaining
		 */
		public Product setSoldFactor(Long soldFactor) {
			this.soldFactor = soldFactor;
			return this;
		}

		/**
		 * @return the item code
		 */
		public String getExtCode() {
			return extCode;
		}

		/**
		 * @param extCode the item code
		 * @return this product object for method chaining
		 */
		public Product setExtCode(String extCode) {
			this.extCode = extCode;
			return this;
		}
	}

	/**
	 * Order label.
	 */
	public static class OrderLabel {

		/**
		 * Label name.
		 */
		private String name;

		/**
		 * Is there a label: 0 = no label, 1 = labeled.
		 */
		private Integer value;

		/**
		 * @return the label name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the label name
		 * @return this order label object for method chaining
		 */
		public OrderLabel setName(String name) {
			this.name = name;
			return this;
		}

		/**
		 * @return whether there is a label
		 */
		public Integer getValue() {
			return value;
		}

		/**
		 * @param value whether there is a label
		 * @return this order label object for method chaining
		 */
		public OrderLabel setValue(Integer value) {
			this.value = value;
			return this;
		}
	}
}