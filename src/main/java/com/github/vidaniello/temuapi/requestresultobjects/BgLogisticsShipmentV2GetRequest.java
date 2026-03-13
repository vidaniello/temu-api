package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'bg.logistics.shipment.v2.get'.
 * Used for sellers to verify shipped info after self-fulfillment.
 */
public class BgLogisticsShipmentV2GetRequest implements TemuRequestIf {

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
		
	public BgLogisticsShipmentV2GetRequest() {
	}
	
	/**
	 * @return the parent order number
	 */
	public String getParentOrderSn() {
		return parentOrderSn;
	}
	
	/**
	 * @param parentOrderSn the parent order number
	 * @return this request object for method chaining
	 */
	public BgLogisticsShipmentV2GetRequest setParentOrderSn(String parentOrderSn) {
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
	 * @return this request object for method chaining
	 */
	public BgLogisticsShipmentV2GetRequest setOrderSn(String orderSn) {
		this.orderSn = orderSn;
		return this;
	}
}