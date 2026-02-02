package com.github.vidaniello.temuapi;

import java.io.Serializable;

public class TemuAuthParams implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String accessToken;
	private String appKey;
	private String sign;
	
	public TemuAuthParams() {
	
	}
	
	public String getAccessToken() {
		return accessToken;
	}
	
	public TemuAuthParams setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		return this;
	}
	
	public String getAppKey() {
		return appKey;
	}

	public TemuAuthParams setAppKey(String appKey) {
		this.appKey = appKey;
		return this;
	}

	public String getSign() {
		return sign;
	}

	public TemuAuthParams setSign(String sign) {
		this.sign = sign;
		return this;
	}

}
