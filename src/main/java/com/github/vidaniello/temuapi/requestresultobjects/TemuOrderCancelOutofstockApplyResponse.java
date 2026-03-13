package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'temu.order.cancel.outofstock.apply'.
 * Contains the result of the out of stock cancellation application.
 */
public class TemuOrderCancelOutofstockApplyResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Lack stock apply result.
	 * true: apply success
	 * false: apply fail
	 */
	private Boolean applyResult;
	
	/**
	 * Apply fail reason list.
	 */
	private List<FailReason> failReasonList;
		
	public TemuOrderCancelOutofstockApplyResponse() {
		this.failReasonList = new ArrayList<>();
	}
	
	/**
	 * @return the apply result
	 */
	public Boolean getApplyResult() {
		return applyResult;
	}
	
	/**
	 * @param applyResult the apply result
	 * @return this response object for method chaining
	 */
	public TemuOrderCancelOutofstockApplyResponse setApplyResult(Boolean applyResult) {
		this.applyResult = applyResult;
		return this;
	}
	
	/**
	 * @return the fail reason list
	 */
	public List<FailReason> getFailReasonList() {
		return failReasonList;
	}
	
	/**
	 * @param failReasonList the fail reason list
	 * @return this response object for method chaining
	 */
	public TemuOrderCancelOutofstockApplyResponse setFailReasonList(List<FailReason> failReasonList) {
		this.failReasonList = failReasonList;
		return this;
	}
	
	/**
	 * Inner class representing a fail reason entry.
	 */
	public static class FailReason implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Parent order sn.
		 */
		private String parentOrderSn;
		
		/**
		 * Order sn.
		 */
		private String orderSn;
		
		/**
		 * Apply fail reason code list.
		 */
		private List<String> reasonList;
		
		public FailReason() {
			this.reasonList = new ArrayList<>();
		}
		
		/**
		 * @return the parent order sn
		 */
		public String getParentOrderSn() {
			return parentOrderSn;
		}
		
		/**
		 * @param parentOrderSn the parent order sn
		 * @return this object for method chaining
		 */
		public FailReason setParentOrderSn(String parentOrderSn) {
			this.parentOrderSn = parentOrderSn;
			return this;
		}
		
		/**
		 * @return the order sn
		 */
		public String getOrderSn() {
			return orderSn;
		}
		
		/**
		 * @param orderSn the order sn
		 * @return this object for method chaining
		 */
		public FailReason setOrderSn(String orderSn) {
			this.orderSn = orderSn;
			return this;
		}
		
		/**
		 * @return the reason code list
		 */
		public List<String> getReasonList() {
			return reasonList;
		}
		
		/**
		 * @param reasonList the reason code list
		 * @return this object for method chaining
		 */
		public FailReason setReasonList(List<String> reasonList) {
			this.reasonList = reasonList;
			return this;
		}
	}
}