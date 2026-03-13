package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'temu.order.cancel.appeal.apply'.
 * Support merchants to initiate cancellation requests through the interface.
 */
public class TemuOrderCancelAppealApplyRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * The types of application for cancellation:
	 * 2: Suspected batch refund
	 * 3: Incorrect address
	 */
	private Integer cancelType;
	
	/**
	 * Details of the application to cancel the order.
	 */
	private ApplyOrder applyOrder;
	
	/**
	 * Explanation of Application Reasons.
	 */
	private Reason reason;
		
	public TemuOrderCancelAppealApplyRequest() {
		this.applyOrder = new ApplyOrder();
		this.reason = new Reason();
	}
	
	/**
	 * @return the cancel type
	 */
	public Integer getCancelType() {
		return cancelType;
	}
	
	/**
	 * @param cancelType the cancel type
	 * @return this request object for method chaining
	 */
	public TemuOrderCancelAppealApplyRequest setCancelType(Integer cancelType) {
		this.cancelType = cancelType;
		return this;
	}
	
	/**
	 * @return the apply order details
	 */
	public ApplyOrder getApplyOrder() {
		return applyOrder;
	}
	
	/**
	 * @param applyOrder the apply order details
	 * @return this request object for method chaining
	 */
	public TemuOrderCancelAppealApplyRequest setApplyOrder(ApplyOrder applyOrder) {
		this.applyOrder = applyOrder;
		return this;
	}
	
	/**
	 * @return the reason for cancellation
	 */
	public Reason getReason() {
		return reason;
	}
	
	/**
	 * @param reason the reason for cancellation
	 * @return this request object for method chaining
	 */
	public TemuOrderCancelAppealApplyRequest setReason(Reason reason) {
		this.reason = reason;
		return this;
	}
	
	/**
	 * Inner class representing the apply order details.
	 */
	public static class ApplyOrder implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Parent order sn.
		 */
		private String parentOrderSn;
			
		public ApplyOrder() {
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
		public ApplyOrder setParentOrderSn(String parentOrderSn) {
			this.parentOrderSn = parentOrderSn;
			return this;
		}
	}
	
	/**
	 * Inner class representing the reason for cancellation.
	 */
	public static class Reason implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Explanation of the reason for cancellation initiated.
		 */
		private String description;
		
		/**
		 * Related screenshots serve as supplementary evidence to illustrate 
		 * the rationality of the application. The image needs to be converted 
		 * into URL information and sent in through temu.order.query.signature
		 */
		private List<String> proofUrlList;
			
		public Reason() {
			this.proofUrlList = new ArrayList<>();
		}
		
		/**
		 * @return the description of the reason
		 */
		public String getDescription() {
			return description;
		}
		
		/**
		 * @param description the description of the reason
		 * @return this object for method chaining
		 */
		public Reason setDescription(String description) {
			this.description = description;
			return this;
		}
		
		/**
		 * @return the list of proof URLs
		 */
		public List<String> getProofUrlList() {
			return proofUrlList;
		}
		
		/**
		 * @param proofUrlList the list of proof URLs
		 * @return this object for method chaining
		 */
		public Reason setProofUrlList(List<String> proofUrlList) {
			this.proofUrlList = proofUrlList;
			return this;
		}
	}
}