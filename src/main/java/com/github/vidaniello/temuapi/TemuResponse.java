package com.github.vidaniello.temuapi;

import java.io.Serializable;

import com.google.gson.JsonObject;

public class TemuResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Boolean success;
	private String requestId;
	private Integer errorCode;
	private String errorMsg;

	/**
	 * Messaggio d'errore secondario di TEMU: contiene spesso il dettaglio
	 * specifico del parametro o della regola di validazione violata.
	 */
	private String subErrorMsg;
	private JsonObject result;

	/**
	 * Body RAW della risposta HTTP, valorizzato dal client al momento della
	 * chiamata: usato per comporre errori il piu' specifici possibile anche
	 * quando l'envelope non contiene tutti i campi attesi.
	 */
	private transient String rawBody;

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

	public String getSubErrorMsg() {
		return subErrorMsg;
	}

	public TemuResponse setSubErrorMsg(String subErrorMsg) {
		this.subErrorMsg = subErrorMsg;
		return this;
	}

	public String getRawBody() {
		return rawBody;
	}

	public TemuResponse setRawBody(String rawBody) {
		this.rawBody = rawBody;
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
