package com.github.vidaniello.temuapi;

import java.io.Serializable;

public class TemuAuthParams implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private boolean testAccount;
	private String endpoint;
	private String accessToken;
	private String appKey;
	private String appSecret;
	
	public TemuAuthParams() {
	
	}
	
	public String getEndpoint() {
		return endpoint;
	}
	
	public TemuAuthParams setEndpoint(String endpoint) {
		this.endpoint = endpoint;
		return this;
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
	
	public String getAppSecret() {
		return appSecret;
	}
	
	public TemuAuthParams setAppSecret(String appSecret) {
		this.appSecret = appSecret;
		return this;
	}
	
	public boolean isTestAccount() {
		return testAccount;
	}
	
	public TemuAuthParams setTestAccount(boolean testAccount) {
		this.testAccount = testAccount;
		return this;
	}

	public static TemuAuthParams getDefault() {
		return TemuPropertyReader.getInstance().getAuthParams();
	}
	
}
