package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'bg.order.decryptshippinginfo.get'.
 * Used to retrieve sensitive shipping address information for a specific order.
 */
public class BgOrderDecryptshippinginfoGetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Parent Order SN: the parent order serial number.
	 * This field is required.
	 */
	private String parentOrderSn;
		
	public BgOrderDecryptshippinginfoGetRequest() {
	}
	
	/**
	 * @return the parent order serial number
	 */
	public String getParentOrderSn() {
		return parentOrderSn;
	}
	
	/**
	 * @param parentOrderSn the parent order serial number
	 * @return this request object for method chaining
	 */
	public BgOrderDecryptshippinginfoGetRequest setParentOrderSn(String parentOrderSn) {
		this.parentOrderSn = parentOrderSn;
		return this;
	}
}