package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'temu.order.cancel.appeal.result.get'.
 * Contains the status of cancellation order appeal records.
 */
public class TemuOrderCancelAppealResultGetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Result item list.
	 */
	private List<ResultItem> itemList;
		
	public TemuOrderCancelAppealResultGetResponse() {
		this.itemList = new ArrayList<>();
	}
	
	/**
	 * @return the result item list
	 */
	public List<ResultItem> getItemList() {
		return itemList;
	}
	
	/**
	 * @param itemList the result item list
	 * @return this response object for method chaining
	 */
	public TemuOrderCancelAppealResultGetResponse setItemList(List<ResultItem> itemList) {
		this.itemList = itemList;
		return this;
	}
	
	/**
	 * Inner class representing an appeal result item.
	 */
	public static class ResultItem implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Apply sn.
		 */
		private String applySn;
		
		/**
		 * Apply cancel status:
		 * 1 - Auditing,
		 * 2 - Approved,
		 * 3 - Rejected,
		 * 4 - Apply failed,
		 * 5 - Canceled.
		 */
		private Integer status;
			
		public ResultItem() {
		}
		
		/**
		 * @return the apply sn
		 */
		public String getApplySn() {
			return applySn;
		}
		
		/**
		 * @param applySn the apply sn
		 * @return this object for method chaining
		 */
		public ResultItem setApplySn(String applySn) {
			this.applySn = applySn;
			return this;
		}
		
		/**
		 * @return the apply cancel status
		 */
		public Integer getStatus() {
			return status;
		}
		
		/**
		 * @param status the apply cancel status
		 * @return this object for method chaining
		 */
		public ResultItem setStatus(Integer status) {
			this.status = status;
			return this;
		}
	}
}