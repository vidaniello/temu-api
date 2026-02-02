package com.github.vidaniello.temuapi;

import java.io.Serializable;

/**
 * Represents a request parameter object for the Temu API.
 *
 * <p>This class encapsulates the common parameters required by the Temu API
 * endpoints, including authentication credentials, request metadata, and
 * optional data specifications. It provides a structured way to build API
 * requests with consistent parameter formatting.</p>
 *
 * <p>For detailed API documentation, see the official Temu partner
 * documentation:
 * <a href="https://partner-eu.temu.com/documentation?menu_code=85762c6ccc5a4dbc8c023ea5e10c6dc0&sub_menu_code=01ce2b3813e14219b9f9f55aa92ea571">link</a></p>
 *
 * @author Vincenzo D'Aniello (vidaniello@gmail.com) github.com/vidaniello
 */
public class TemuRequestParam implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String type;
	
	private String app_key;
	
	private String timestamp;
	
	private String sign;
	
	private String access_token;
	
	private String data_type;
	
	private String version;
	
	public TemuRequestParam() {
		
	}
	
	public String getType() {
		return type;
	}
	
	public TemuRequestParam setType(String type) {
		this.type = type;
		return this;
	}

	public String getApp_key() {
		return app_key;
	}

	public TemuRequestParam setApp_key(String app_key) {
		this.app_key = app_key;
		return this;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public TemuRequestParam setTimestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	public String getSign() {
		return sign;
	}

	public TemuRequestParam setSign(String sign) {
		this.sign = sign;
		return this;
	}

	public String getAccess_token() {
		return access_token;
	}

	public TemuRequestParam setAccess_token(String access_token) {
		this.access_token = access_token;
		return this;
	}

	public String getData_type() {
		return data_type;
	}

	public TemuRequestParam setData_type(String data_type) {
		this.data_type = data_type;
		return this;
	}

	public String getVersion() {
		return version;
	}

	public TemuRequestParam setVersion(String version) {
		this.version = version;
		return this;
	}
	
	

}