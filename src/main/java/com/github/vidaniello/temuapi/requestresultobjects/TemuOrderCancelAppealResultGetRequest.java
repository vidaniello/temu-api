package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.List;

/**
 * Request object for the API call 'temu.order.cancel.appeal.result.get'.
 * Used to query the status of cancellation order appeal records.
 */
public class TemuOrderCancelAppealResultGetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Apply sn list.
	 * This field is required.
	 */
	private List<String> applySnList;
		
	public TemuOrderCancelAppealResultGetRequest() {
	}
	
	/**
	 * @return the apply sn list
	 */
	public List<String> getApplySnList() {
		return applySnList;
	}
	
	/**
	 * @param applySnList the apply sn list
	 * @return this request object for method chaining
	 */
	public TemuOrderCancelAppealResultGetRequest setApplySnList(List<String> applySnList) {
		this.applySnList = applySnList;
		return this;
	}
}