package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'temu.order.cancel.outofstock.apply'.
 * Used to apply for order cancellation due to out of stock.<br>
 * The user takes the initiative to initiate a stock-out situation, 
 * which will be submitted to the risk control department for review.
 */
public class TemuOrderCancelOutofstockApplyRequest implements TemuRequestIf {

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
		
	public TemuOrderCancelOutofstockApplyRequest() {
		this.orderSnList = new ArrayList<>();
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
	public TemuOrderCancelOutofstockApplyRequest setParentOrderSn(String parentOrderSn) {
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
	public TemuOrderCancelOutofstockApplyRequest setOrderSnList(List<String> orderSnList) {
		this.orderSnList = orderSnList;
		return this;
	}
}