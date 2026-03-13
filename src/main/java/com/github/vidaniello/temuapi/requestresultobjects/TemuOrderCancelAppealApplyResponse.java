package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Response object for the API call 'temu.order.cancel.appeal.apply'.
 * Contains the apply sn for the cancellation appeal.
 */
public class TemuOrderCancelAppealApplyResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Apply sn.
	 */
	private String applySn;
		
	public TemuOrderCancelAppealApplyResponse() {
	}
	
	/**
	 * @return the apply sn
	 */
	public String getApplySn() {
		return applySn;
	}
	
	/**
	 * @param applySn the apply sn
	 * @return this response object for method chaining
	 */
	public TemuOrderCancelAppealApplyResponse setApplySn(String applySn) {
		this.applySn = applySn;
		return this;
	}
}