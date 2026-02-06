package com.github.vidaniello.temuapi;

import java.io.Serializable;

import com.google.gson.JsonObject;

public class TemuResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Boolean success;
	private String requestId;
	private Integer errorCode;
	private String errorMsg;
	private JsonObject result;
	
	public TemuResponse() {
		
	}

	public Boolean getSuccess() {
		return success;
	}

	public TemuResponse setSuccess(Boolean success) {
		this.success = success;
		return this;
	}

	public String getRequestId() {
		return requestId;
	}

	public TemuResponse setRequestId(String requestId) {
		this.requestId = requestId;
		return this;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public TemuResponse setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
		return this;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public TemuResponse setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
		return this;
	}
	
	public JsonObject getResult() {
		return result;
	}
	
	public TemuResponse setResult(JsonObject result) {
		this.result = result;
		return this;
	}
	
}
