package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'bg.order.detail.v2.get'.
 * Contains order details information.
 */
public class BgOrderDetailV2GetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Parent order information.
	 */
	private ParentOrderMap parentOrderMap;
	
	/**
	 * Order information list.
	 */
	private List<OrderInfo> orderList;
		
	public BgOrderDetailV2GetResponse() {
		this.orderList = new ArrayList<>();
	}
	
	/**
	 * @return the parent order information
	 */
	public ParentOrderMap getParentOrderMap() {
		return parentOrderMap;
	}
	
	/**
	 * @param parentOrderMap the parent order information
	 * @return this response object for method chaining
	 */
	public BgOrderDetailV2GetResponse setParentOrderMap(ParentOrderMap parentOrderMap) {
		this.parentOrderMap = parentOrderMap;
		return this;
	}
	
	/**
	 * @return the order information list
	 */
	public List<OrderInfo> getOrderList() {
		return orderList;
	}
	
	/**
	 * @param orderList the order information list
	 * @return this response object for method chaining
	 */
	public BgOrderDetailV2GetResponse setOrderList(List<OrderInfo> orderList) {
		this.orderList = orderList;
		return this;
	}
	
	/**
	 * Inner class representing parent order information.
	 */
	public static class ParentOrderMap implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Parent order number.
		 */
		private String parentOrderSn;
		
		/**
		 * Status of the parent order.
		 * 1-PENDING; 2-UN_SHIPPING; 3-CANCELED; 4-SHIPPED; 41-PARTIALLY_SHIPPED; 5-DELIVERED; 51-PARTIALLY_DELIVERED.
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
		 */
		private List<String> fulfillmentWarning;
		
		/**
		 * Is the actual shipping fee paid by the user for this parent order is zero.
		 * true: user paid zero, false: user paid not zero. (only for local mall)
		 */
		private Boolean hasShippingFee;
		
		/**
		 * Address region 1.
		 */
		private String regionName1;
		
		/**
		 * Address region 2.
		 */
		private String regionName2;
		
		/**
		 * Address region 3.
		 */
		private String regionName3;
		
		/**
		 * Order payment type: COD, PPD.
		 */
		private String orderPaymentType;
		
		/**
		 * Batch order number list, only order fulfilled by cooperative warehouse will return with value.
		 */
		private List<String> batchOrderNumberList;
		
		/**
		 * Delivery channel type: 1-Standard Shipping, 2-Store Delivery.
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
		
		public String getParentOrderSn() {
			return parentOrderSn;
		}
		
		public ParentOrderMap setParentOrderSn(String parentOrderSn) {
			this.parentOrderSn = parentOrderSn;
			return this;
		}
		
		public Integer getParentOrderStatus() {
			return parentOrderStatus;
		}
		
		public ParentOrderMap setParentOrderStatus(Integer parentOrderStatus) {
			this.parentOrderStatus = parentOrderStatus;
			return this;
		}
		
		public Integer getParentOrderTime() {
			return parentOrderTime;
		}
		
		public ParentOrderMap setParentOrderTime(Integer parentOrderTime) {
			this.parentOrderTime = parentOrderTime;
			return this;
		}
		
		public Integer getExpectShipLatestTime() {
			return expectShipLatestTime;
		}
		
		public ParentOrderMap setExpectShipLatestTime(Integer expectShipLatestTime) {
			this.expectShipLatestTime = expectShipLatestTime;
			return this;
		}
		
		public Integer getParentOrderPendingFinishTime() {
			return parentOrderPendingFinishTime;
		}
		
		public ParentOrderMap setParentOrderPendingFinishTime(Integer parentOrderPendingFinishTime) {
			this.parentOrderPendingFinishTime = parentOrderPendingFinishTime;
			return this;
		}
		
		public Integer getLatestDeliveryTime() {
			return latestDeliveryTime;
		}
		
		public ParentOrderMap setLatestDeliveryTime(Integer latestDeliveryTime) {
			this.latestDeliveryTime = latestDeliveryTime;
			return this;
		}
		
		public Integer getParentShippingTime() {
			return parentShippingTime;
		}
		
		public ParentOrderMap setParentShippingTime(Integer parentShippingTime) {
			this.parentShippingTime = parentShippingTime;
			return this;
		}
		
		public Long getSiteId() {
			return siteId;
		}
		
		public ParentOrderMap setSiteId(Long siteId) {
			this.siteId = siteId;
			return this;
		}
		
		public Long getRegionId() {
			return regionId;
		}
		
		public ParentOrderMap setRegionId(Long regionId) {
			this.regionId = regionId;
			return this;
		}
		
		public List<ParentOrderLabel> getParentOrderLabel() {
			return parentOrderLabel;
		}
		
		public ParentOrderMap setParentOrderLabel(List<ParentOrderLabel> parentOrderLabel) {
			this.parentOrderLabel = parentOrderLabel;
			return this;
		}
		
		public List<String> getFulfillmentWarning() {
			return fulfillmentWarning;
		}
		
		public ParentOrderMap setFulfillmentWarning(List<String> fulfillmentWarning) {
			this.fulfillmentWarning = fulfillmentWarning;
			return this;
		}
		
		public Boolean getHasShippingFee() {
			return hasShippingFee;
		}
		
		public ParentOrderMap setHasShippingFee(Boolean hasShippingFee) {
			this.hasShippingFee = hasShippingFee;
			return this;
		}
		
		public String getRegionName1() {
			return regionName1;
		}
		
		public ParentOrderMap setRegionName1(String regionName1) {
			this.regionName1 = regionName1;
			return this;
		}
		
		public String getRegionName2() {
			return regionName2;
		}
		
		public ParentOrderMap setRegionName2(String regionName2) {
			this.regionName2 = regionName2;
			return this;
		}
		
		public String getRegionName3() {
			return regionName3;
		}
		
		public ParentOrderMap setRegionName3(String regionName3) {
			this.regionName3 = regionName3;
			return this;
		}
		
		public String getOrderPaymentType() {
			return orderPaymentType;
		}
		
		public ParentOrderMap setOrderPaymentType(String orderPaymentType) {
			this.orderPaymentType = orderPaymentType;
			return this;
		}
		
		public List<String> getBatchOrderNumberList() {
			return batchOrderNumberList;
		}
		
		public ParentOrderMap setBatchOrderNumberList(List<String> batchOrderNumberList) {
			this.batchOrderNumberList = batchOrderNumberList;
			return this;
		}
		
		public Integer getShippingMethod() {
			return shippingMethod;
		}
		
		public ParentOrderMap setShippingMethod(Integer shippingMethod) {
			this.shippingMethod = shippingMethod;
			return this;
		}
		
		public Integer getParentConfirmTime() {
			return parentConfirmTime;
		}
		
		public ParentOrderMap setParentConfirmTime(Integer parentConfirmTime) {
			this.parentConfirmTime = parentConfirmTime;
			return this;
		}
	}
	
	/**
	 * Inner class representing parent order label.
	 */
	public static class ParentOrderLabel implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Label name.
		 */
		private String name;
		
		/**
		 * Whether the label exists: 0 = no label, 1 = label exists.
		 */
		private Integer value;
			
		public ParentOrderLabel() {
		}
		
		public String getName() {
			return name;
		}
		
		public ParentOrderLabel setName(String name) {
			this.name = name;
			return this;
		}
		
		public Integer getValue() {
			return value;
		}
		
		public ParentOrderLabel setValue(Integer value) {
			this.value = value;
			return this;
		}
	}
	
	/**
	 * Inner class representing order information.
	 */
	public static class OrderInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Order number (sub-order number).
		 */
		private String orderSn;
		
		/**
		 * The quantity of saler needs to fulfill.
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
		 * Package information.
		 */
		private List<PackageSnInfo> packageSnInfo;
		
		/**
		 * There may be logistics anomalies after the order is shipped.
		 */
		private List<String> packageAbnormalTypeList;
		
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
		 */
		private String originalGoodsName;
		
		/**
		 * Status of the order.
		 * 1-PENDING; 2-UN_SHIPPING; 3-CANCELED; 4-SHIPPED; 41-PARTIALLY_SHIPPED; 5-DELIVERED; 51-PARTIALLY_DELIVERED.
		 */
		private Integer orderStatus;
		
		/**
		 * Product information.
		 */
		private List<ProductInfo> productList;
		
		/**
		 * Label name.
		 */
		private List<OrderLabel> orderLabel;
		
		/**
		 * Fulfillment Prompt.
		 */
		private List<String> fulfillmentWarning;
		
		/**
		 * The type of order fulfillment.
		 * fulfillBySeller, fulfillByCooperativeWarehouse.
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
		
		/**
		 * Whether the merchant has uploaded verification information such as SN, IMEI, and appraisal report.
		 */
		private Boolean hasUploadedEvidence;
			
		public OrderInfo() {
			this.packageSnInfo = new ArrayList<>();
			this.packageAbnormalTypeList = new ArrayList<>();
			this.productList = new ArrayList<>();
			this.orderLabel = new ArrayList<>();
			this.fulfillmentWarning = new ArrayList<>();
		}
		
		public String getOrderSn() {
			return orderSn;
		}
		
		public OrderInfo setOrderSn(String orderSn) {
			this.orderSn = orderSn;
			return this;
		}
		
		public Integer getQuantity() {
			return quantity;
		}
		
		public OrderInfo setQuantity(Integer quantity) {
			this.quantity = quantity;
			return this;
		}
		
		public Integer getCanceledQuantityBeforeShipment() {
			return canceledQuantityBeforeShipment;
		}
		
		public OrderInfo setCanceledQuantityBeforeShipment(Integer canceledQuantityBeforeShipment) {
			this.canceledQuantityBeforeShipment = canceledQuantityBeforeShipment;
			return this;
		}
		
		public Integer getOriginalOrderQuantity() {
			return originalOrderQuantity;
		}
		
		public OrderInfo setOriginalOrderQuantity(Integer originalOrderQuantity) {
			this.originalOrderQuantity = originalOrderQuantity;
			return this;
		}
		
		public Long getGoodsId() {
			return goodsId;
		}
		
		public OrderInfo setGoodsId(Long goodsId) {
			this.goodsId = goodsId;
			return this;
		}
		
		public List<PackageSnInfo> getPackageSnInfo() {
			return packageSnInfo;
		}
		
		public OrderInfo setPackageSnInfo(List<PackageSnInfo> packageSnInfo) {
			this.packageSnInfo = packageSnInfo;
			return this;
		}
		
		public List<String> getPackageAbnormalTypeList() {
			return packageAbnormalTypeList;
		}
		
		public OrderInfo setPackageAbnormalTypeList(List<String> packageAbnormalTypeList) {
			this.packageAbnormalTypeList = packageAbnormalTypeList;
			return this;
		}
		
		public Long getSkuId() {
			return skuId;
		}
		
		public OrderInfo setSkuId(Long skuId) {
			this.skuId = skuId;
			return this;
		}
		
		public String getSpec() {
			return spec;
		}
		
		public OrderInfo setSpec(String spec) {
			this.spec = spec;
			return this;
		}
		
		public String getOriginalSpecName() {
			return originalSpecName;
		}
		
		public OrderInfo setOriginalSpecName(String originalSpecName) {
			this.originalSpecName = originalSpecName;
			return this;
		}
		
		public String getThumbUrl() {
			return thumbUrl;
		}
		
		public OrderInfo setThumbUrl(String thumbUrl) {
			this.thumbUrl = thumbUrl;
			return this;
		}
		
		public String getGoodsName() {
			return goodsName;
		}
		
		public OrderInfo setGoodsName(String goodsName) {
			this.goodsName = goodsName;
			return this;
		}
		
		public String getOriginalGoodsName() {
			return originalGoodsName;
		}
		
		public OrderInfo setOriginalGoodsName(String originalGoodsName) {
			this.originalGoodsName = originalGoodsName;
			return this;
		}
		
		public Integer getOrderStatus() {
			return orderStatus;
		}
		
		public OrderInfo setOrderStatus(Integer orderStatus) {
			this.orderStatus = orderStatus;
			return this;
		}
		
		public List<ProductInfo> getProductList() {
			return productList;
		}
		
		public OrderInfo setProductList(List<ProductInfo> productList) {
			this.productList = productList;
			return this;
		}
		
		public List<OrderLabel> getOrderLabel() {
			return orderLabel;
		}
		
		public OrderInfo setOrderLabel(List<OrderLabel> orderLabel) {
			this.orderLabel = orderLabel;
			return this;
		}
		
		public List<String> getFulfillmentWarning() {
			return fulfillmentWarning;
		}
		
		public OrderInfo setFulfillmentWarning(List<String> fulfillmentWarning) {
			this.fulfillmentWarning = fulfillmentWarning;
			return this;
		}
		
		public String getFulfillmentType() {
			return fulfillmentType;
		}
		
		public OrderInfo setFulfillmentType(String fulfillmentType) {
			this.fulfillmentType = fulfillmentType;
			return this;
		}
		
		public String getInventoryDeductionWarehouseId() {
			return inventoryDeductionWarehouseId;
		}
		
		public OrderInfo setInventoryDeductionWarehouseId(String inventoryDeductionWarehouseId) {
			this.inventoryDeductionWarehouseId = inventoryDeductionWarehouseId;
			return this;
		}
		
		public String getInventoryDeductionWarehouseName() {
			return inventoryDeductionWarehouseName;
		}
		
		public OrderInfo setInventoryDeductionWarehouseName(String inventoryDeductionWarehouseName) {
			this.inventoryDeductionWarehouseName = inventoryDeductionWarehouseName;
			return this;
		}
		
		public String getOrderPaymentType() {
			return orderPaymentType;
		}
		
		public OrderInfo setOrderPaymentType(String orderPaymentType) {
			this.orderPaymentType = orderPaymentType;
			return this;
		}
		
		public Boolean getIsCancelledDuringPending() {
			return isCancelledDuringPending;
		}
		
		public OrderInfo setIsCancelledDuringPending(Boolean isCancelledDuringPending) {
			this.isCancelledDuringPending = isCancelledDuringPending;
			return this;
		}
		
		public Integer getEarliestTimeGetShippingDocument() {
			return earliestTimeGetShippingDocument;
		}
		
		public OrderInfo setEarliestTimeGetShippingDocument(Integer earliestTimeGetShippingDocument) {
			this.earliestTimeGetShippingDocument = earliestTimeGetShippingDocument;
			return this;
		}
		
		public Integer getOrderShippingTime() {
			return orderShippingTime;
		}
		
		public OrderInfo setOrderShippingTime(Integer orderShippingTime) {
			this.orderShippingTime = orderShippingTime;
			return this;
		}
		
		public Integer getOrderCreateTime() {
			return orderCreateTime;
		}
		
		public OrderInfo setOrderCreateTime(Integer orderCreateTime) {
			this.orderCreateTime = orderCreateTime;
			return this;
		}
		
		public Long getQualificationUploadEndTime() {
			return qualificationUploadEndTime;
		}
		
		public OrderInfo setQualificationUploadEndTime(Long qualificationUploadEndTime) {
			this.qualificationUploadEndTime = qualificationUploadEndTime;
			return this;
		}
		
		public Boolean getHasUploadedEvidence() {
			return hasUploadedEvidence;
		}
		
		public OrderInfo setHasUploadedEvidence(Boolean hasUploadedEvidence) {
			this.hasUploadedEvidence = hasUploadedEvidence;
			return this;
		}
	}
	
	/**
	 * Inner class representing package information.
	 */
	public static class PackageSnInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Package number of this order.
		 */
		private String packageSn;
		
		/**
		 * Package delivery type.
		 * 1: Seller fulfills this order by non-integrated channel
		 * 2: Seller fulfills this order by Temu-integrated channel
		 * 3: Cooperative warehouse fulfills this order by non-integrated channel
		 * 4: Cooperative warehouse fulfills this order by Temu-integrated channel
		 */
		private Integer packageDeliveryType;
		
		/**
		 * Whether the latest request "bg.logistics.shipment.create" is successful.
		 */
		private Boolean callSuccess;
		
		/**
		 * Whether a POD needs to be uploaded for the package.
		 */
		private Boolean needPod;
		
		/**
		 * POD apply number.
		 */
		private String applySn;
			
		public PackageSnInfo() {
		}
		
		public String getPackageSn() {
			return packageSn;
		}
		
		public PackageSnInfo setPackageSn(String packageSn) {
			this.packageSn = packageSn;
			return this;
		}
		
		public Integer getPackageDeliveryType() {
			return packageDeliveryType;
		}
		
		public PackageSnInfo setPackageDeliveryType(Integer packageDeliveryType) {
			this.packageDeliveryType = packageDeliveryType;
			return this;
		}
		
		public Boolean getCallSuccess() {
			return callSuccess;
		}
		
		public PackageSnInfo setCallSuccess(Boolean callSuccess) {
			this.callSuccess = callSuccess;
			return this;
		}
		
		public Boolean getNeedPod() {
			return needPod;
		}
		
		public PackageSnInfo setNeedPod(Boolean needPod) {
			this.needPod = needPod;
			return this;
		}
		
		public String getApplySn() {
			return applySn;
		}
		
		public PackageSnInfo setApplySn(String applySn) {
			this.applySn = applySn;
			return this;
		}
	}
	
	/**
	 * Inner class representing product information.
	 */
	public static class ProductInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Product Id.
		 */
		private Long productId;
		
		/**
		 * Product sku id. It is only valid for SEMI sellers not LOCAL sellers.
		 */
		private Long productSkuId;
		
		/**
		 * Conversion factor between product quantity and item quantity.
		 */
		private Long soldFactor;
		
		/**
		 * Item code.
		 */
		private String extCode;
			
		public ProductInfo() {
		}
		
		public Long getProductId() {
			return productId;
		}
		
		public ProductInfo setProductId(Long productId) {
			this.productId = productId;
			return this;
		}
		
		public Long getProductSkuId() {
			return productSkuId;
		}
		
		public ProductInfo setProductSkuId(Long productSkuId) {
			this.productSkuId = productSkuId;
			return this;
		}
		
		public Long getSoldFactor() {
			return soldFactor;
		}
		
		public ProductInfo setSoldFactor(Long soldFactor) {
			this.soldFactor = soldFactor;
			return this;
		}
		
		public String getExtCode() {
			return extCode;
		}
		
		public ProductInfo setExtCode(String extCode) {
			this.extCode = extCode;
			return this;
		}
	}
	
	/**
	 * Inner class representing order label.
	 */
	public static class OrderLabel implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Label name.
		 */
		private String name;
		
		/**
		 * Is there a label: 0=no label, 1=labeled.
		 */
		private Integer value;
			
		public OrderLabel() {
		}
		
		public String getName() {
			return name;
		}
		
		public OrderLabel setName(String name) {
			this.name = name;
			return this;
		}
		
		public Integer getValue() {
			return value;
		}
		
		public OrderLabel setValue(Integer value) {
			this.value = value;
			return this;
		}
	}
}