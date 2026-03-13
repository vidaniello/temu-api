package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'bg.order.amount.query'.
 * Used to query order amount information.
 */
public class BgOrderAmountQueryRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Parent order number.
	 * This field is required.
	 */
	private String parentOrderSn;
		
	public BgOrderAmountQueryRequest() {
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
	public BgOrderAmountQueryRequest setParentOrderSn(String parentOrderSn) {
		this.parentOrderSn = parentOrderSn;
		return this;
	}
}