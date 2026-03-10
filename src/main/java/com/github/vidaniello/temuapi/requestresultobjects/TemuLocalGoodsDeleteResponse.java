package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Response object for the API call 'temu.local.goods.delete'.
 * Contains the result of the goods deletion operation.
 */
public class TemuLocalGoodsDeleteResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * The result of the delete operation.
	 * Indicates whether the deletion was successful.
	 */
	private Boolean success;
	
	/**
	 * Error message if the operation failed.
	 * Contains details about any errors that occurred during deletion.
	 */
	private String errorMsg;
		
	public TemuLocalGoodsDeleteResponse() {
	}
	
	/**
	 * @return the delete result
	 */
	public Boolean getSuccess() {
		return success;
	}
	
	/**
	 * @param success the delete result
	 * @return this response object for method chaining
	 */
	public TemuLocalGoodsDeleteResponse setSuccess(Boolean success) {
		this.success = success;
		return this;
	}
	
	/**
	 * @return the error message
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	
	/**
	 * @param errorMsg the error message
	 * @return this response object for method chaining
	 */
	public TemuLocalGoodsDeleteResponse setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
		return this;
	}
}