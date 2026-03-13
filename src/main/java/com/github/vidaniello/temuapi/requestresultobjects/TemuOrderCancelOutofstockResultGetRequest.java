package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.List;

/**
 * Request object for the API call 'temu.order.cancel.outofstock.result.get'.
 * Used to obtain the latest out-of-stock review status.
 */
public class TemuOrderCancelOutofstockResultGetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Parent order sn.
	 * This field is required.
	 */
	private String parentOrderSn;
	
	/**
	 * Order sn list.
	 * This field is required.
	 */
	private List<String> orderSnList;
		
	public TemuOrderCancelOutofstockResultGetRequest() {
	}
	
	/**
	 * @return the parent order sn
	 */
	public String getParentOrderSn() {
		return parentOrderSn;
	}
	
	/**
	 * @param parentOrderSn the parent order sn
	 * @return this request object for method chaining
	 */
	public TemuOrderCancelOutofstockResultGetRequest setParentOrderSn(String parentOrderSn) {
		this.parentOrderSn = parentOrderSn;
		return this;
	}
	
	/**
	 * @return the order sn list
	 */
	public List<String> getOrderSnList() {
		return orderSnList;
	}
	
	/**
	 * @param orderSnList the order sn list
	 * @return this request object for method chaining
	 */
	public TemuOrderCancelOutofstockResultGetRequest setOrderSnList(List<String> orderSnList) {
		this.orderSnList = orderSnList;
		return this;
	}
}