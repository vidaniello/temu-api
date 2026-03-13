package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'bg.logistics.shipment.v2.confirm'.
 * Used to synchronize and return order fulfillment information.
 * Switches the order status from pending shipment to shipped.
 */
public class BgLogisticsShipmentV2ConfirmRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * SendType:
	 * 0 - All the products in one parent order are shipped in one package with one tracking number.
	 * 1 - Partial products in one parent order are shipped in multiple packages with multiple tracking numbers 
	 *     and all the products in one order should be shipped in one API call.
	 * 2 - All the products in multiple parent orders are shipped in one package with one tracking number.
	 * This field is required.
	 */
	private Integer sendType;
	
	/**
	 * Shipment package details.
	 * This field is required.
	 */
	private List<SendRequest> sendRequestList;
		
	public BgLogisticsShipmentV2ConfirmRequest() {
		this.sendRequestList = new ArrayList<>();
	}
	
	/**
	 * @return the send type
	 */
	public Integer getSendType() {
		return sendType;
	}
	
	/**
	 * @param sendType the send type
	 * @return this request object for method chaining
	 */
	public BgLogisticsShipmentV2ConfirmRequest setSendType(Integer sendType) {
		this.sendType = sendType;
		return this;
	}
	
	/**
	 * @return the shipment package details list
	 */
	public List<SendRequest> getSendRequestList() {
		return sendRequestList;
	}
	
	/**
	 * @param sendRequestList the shipment package details list
	 * @return this request object for method chaining
	 */
	public BgLogisticsShipmentV2ConfirmRequest setSendRequestList(List<SendRequest> sendRequestList) {
		this.sendRequestList = sendRequestList;
		return this;
	}
	
	/**
	 * Inner class representing shipment package details.
	 */
	public static class SendRequest implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Carrier ID, it's the same ID with the logisticsServiceProviderId 
		 * obtained from "bg.logistics.companies.get".
		 * This field is required.
		 */
		private Long carrierId;
		
		/**
		 * Tracking Number.
		 */
		private String trackingNumber;
		
		/**
		 * The shipment warehouse ID can be obtained from the bg.logistics.warehouse.list.get interface.
		 * This field is required.
		 */
		private String selfShippingWarehouseId;
		
		/**
		 * Product List in this package.
		 * This field is required.
		 */
		private List<OrderSendInfo> orderSendInfoList;
		
		/**
		 * Confirmation matters for this shipment:
		 * DENY_CANCELLATION - Reject the cancellation request for this order.
		 * DENY_ADDRESS_CHANGE - Reject the address change request for this order.
		 * DENY_PARENT_RISK_WARNING - Reject the risk warning for this order.
		 */
		private List<String> confirmAcceptance;
		
		/**
		 * Sub Send Requests.
		 */
		private List<SubSendRequest> subSendRequests;
			
		public SendRequest() {
			this.orderSendInfoList = new ArrayList<>();
			this.confirmAcceptance = new ArrayList<>();
			this.subSendRequests = new ArrayList<>();
		}
		
		/**
		 * @return the carrier ID
		 */
		public Long getCarrierId() {
			return carrierId;
		}
		
		/**
		 * @param carrierId the carrier ID
		 * @return this object for method chaining
		 */
		public SendRequest setCarrierId(Long carrierId) {
			this.carrierId = carrierId;
			return this;
		}
		
		/**
		 * @return the tracking number
		 */
		public String getTrackingNumber() {
			return trackingNumber;
		}
		
		/**
		 * @param trackingNumber the tracking number
		 * @return this object for method chaining
		 */
		public SendRequest setTrackingNumber(String trackingNumber) {
			this.trackingNumber = trackingNumber;
			return this;
		}
		
		/**
		 * @return the self shipping warehouse ID
		 */
		public String getSelfShippingWarehouseId() {
			return selfShippingWarehouseId;
		}
		
		/**
		 * @param selfShippingWarehouseId the self shipping warehouse ID
		 * @return this object for method chaining
		 */
		public SendRequest setSelfShippingWarehouseId(String selfShippingWarehouseId) {
			this.selfShippingWarehouseId = selfShippingWarehouseId;
			return this;
		}
		
		/**
		 * @return the product list in this package
		 */
		public List<OrderSendInfo> getOrderSendInfoList() {
			return orderSendInfoList;
		}
		
		/**
		 * @param orderSendInfoList the product list in this package
		 * @return this object for method chaining
		 */
		public SendRequest setOrderSendInfoList(List<OrderSendInfo> orderSendInfoList) {
			this.orderSendInfoList = orderSendInfoList;
			return this;
		}
		
		/**
		 * @return the confirmation matters list
		 */
		public List<String> getConfirmAcceptance() {
			return confirmAcceptance;
		}
		
		/**
		 * @param confirmAcceptance the confirmation matters list
		 * @return this object for method chaining
		 */
		public SendRequest setConfirmAcceptance(List<String> confirmAcceptance) {
			this.confirmAcceptance = confirmAcceptance;
			return this;
		}
		
		/**
		 * @return the sub send requests list
		 */
		public List<SubSendRequest> getSubSendRequests() {
			return subSendRequests;
		}
		
		/**
		 * @param subSendRequests the sub send requests list
		 * @return this object for method chaining
		 */
		public SendRequest setSubSendRequests(List<SubSendRequest> subSendRequests) {
			this.subSendRequests = subSendRequests;
			return this;
		}
	}
	
	/**
	 * Inner class representing product information in a package.
	 */
	public static class OrderSendInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Parent Order Number.
		 * This field is required.
		 */
		private String parentOrderSn;
		
		/**
		 * Order Number.
		 * This field is required.
		 */
		private String orderSn;
		
		/**
		 * Goods ID.
		 */
		private Long goodsId;
		
		/**
		 * SKU ID.
		 */
		private Long skuId;
		
		/**
		 * Quantity of the product.
		 * This field is required.
		 */
		private Integer quantity;
			
		public OrderSendInfo() {
		}
		
		/**
		 * @return the parent order number
		 */
		public String getParentOrderSn() {
			return parentOrderSn;
		}
		
		/**
		 * @param parentOrderSn the parent order number
		 * @return this object for method chaining
		 */
		public OrderSendInfo setParentOrderSn(String parentOrderSn) {
			this.parentOrderSn = parentOrderSn;
			return this;
		}
		
		/**
		 * @return the order number
		 */
		public String getOrderSn() {
			return orderSn;
		}
		
		/**
		 * @param orderSn the order number
		 * @return this object for method chaining
		 */
		public OrderSendInfo setOrderSn(String orderSn) {
			this.orderSn = orderSn;
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
		 * @return this object for method chaining
		 */
		public OrderSendInfo setGoodsId(Long goodsId) {
			this.goodsId = goodsId;
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
		 * @return this object for method chaining
		 */
		public OrderSendInfo setSkuId(Long skuId) {
			this.skuId = skuId;
			return this;
		}
		
		/**
		 * @return the quantity of the product
		 */
		public Integer getQuantity() {
			return quantity;
		}
		
		/**
		 * @param quantity the quantity of the product
		 * @return this object for method chaining
		 */
		public OrderSendInfo setQuantity(Integer quantity) {
			this.quantity = quantity;
			return this;
		}
	}
	
	/**
	 * Inner class representing sub send request information.
	 */
	public static class SubSendRequest implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Logistics Company ID.
		 * This field is required.
		 */
		private Long carrierId;
		
		/**
		 * Waybill Number.
		 * This field is required.
		 */
		private String trackingNumber;
		
		/**
		 * Self-Delivery Warehouse ID.
		 * This field is required.
		 */
		private String selfShippingWarehouseId;
			
		public SubSendRequest() {
		}
		
		/**
		 * @return the carrier ID
		 */
		public Long getCarrierId() {
			return carrierId;
		}
		
		/**
		 * @param carrierId the carrier ID
		 * @return this object for method chaining
		 */
		public SubSendRequest setCarrierId(Long carrierId) {
			this.carrierId = carrierId;
			return this;
		}
		
		/**
		 * @return the tracking number
		 */
		public String getTrackingNumber() {
			return trackingNumber;
		}
		
		/**
		 * @param trackingNumber the tracking number
		 * @return this object for method chaining
		 */
		public SubSendRequest setTrackingNumber(String trackingNumber) {
			this.trackingNumber = trackingNumber;
			return this;
		}
		
		/**
		 * @return the self shipping warehouse ID
		 */
		public String getSelfShippingWarehouseId() {
			return selfShippingWarehouseId;
		}
		
		/**
		 * @param selfShippingWarehouseId the self shipping warehouse ID
		 * @return this object for method chaining
		 */
		public SubSendRequest setSelfShippingWarehouseId(String selfShippingWarehouseId) {
			this.selfShippingWarehouseId = selfShippingWarehouseId;
			return this;
		}
	}
}