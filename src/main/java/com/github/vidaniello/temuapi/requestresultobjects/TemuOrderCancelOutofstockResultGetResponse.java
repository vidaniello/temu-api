package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'temu.order.cancel.outofstock.result.get'.
 * Contains the list of out-of-stock apply result info.
 */
public class TemuOrderCancelOutofstockResultGetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Lack stock order apply result info list.
	 */
	private List<ApplyResultInfo> applyResultInfoList;
		
	public TemuOrderCancelOutofstockResultGetResponse() {
		this.applyResultInfoList = new ArrayList<>();
	}
	
	/**
	 * @return the apply result info list
	 */
	public List<ApplyResultInfo> getApplyResultInfoList() {
		return applyResultInfoList;
	}
	
	/**
	 * @param applyResultInfoList the apply result info list
	 * @return this response object for method chaining
	 */
	public TemuOrderCancelOutofstockResultGetResponse setApplyResultInfoList(List<ApplyResultInfo> applyResultInfoList) {
		this.applyResultInfoList = applyResultInfoList;
		return this;
	}
	
	/**
	 * Inner class representing apply result info.
	 */
	public static class ApplyResultInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Order sn.
		 */
		private String orderSn;
		
		/**
		 * Lack stock apply status.
		 */
		private Integer applyStatus;
			
		public ApplyResultInfo() {
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
		public ApplyResultInfo setOrderSn(String orderSn) {
			this.orderSn = orderSn;
			return this;
		}
		
		/**
		 * @return the apply status
		 */
		public Integer getApplyStatus() {
			return applyStatus;
		}
		
		/**
		 * @param applyStatus the apply status
		 * @return this object for method chaining
		 */
		public ApplyResultInfo setApplyStatus(Integer applyStatus) {
			this.applyStatus = applyStatus;
			return this;
		}
	}
}