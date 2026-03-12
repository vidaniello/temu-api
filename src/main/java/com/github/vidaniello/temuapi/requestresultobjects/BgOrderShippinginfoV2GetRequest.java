package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'bg.order.shippinginfo.v2.get'.
 * Used to retrieve shipping information for an order.
 */
public class BgOrderShippinginfoV2GetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Parent Order SN.
	 */
	private String parentOrderSn;
		
	public BgOrderShippinginfoV2GetRequest() {
	}
	
	/**
	 * @return the parent order SN
	 */
	public String getParentOrderSn() {
		return parentOrderSn;
	}
	
	/**
	 * @param parentOrderSn the parent order SN
	 * @return this request object for method chaining
	 */
	public BgOrderShippinginfoV2GetRequest setParentOrderSn(String parentOrderSn) {
		this.parentOrderSn = parentOrderSn;
		return this;
	}
}