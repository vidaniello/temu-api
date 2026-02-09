package com.github.vidaniello.temuapi;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

import com.github.vidaniello.temuapi.exceptions.TemuException;
import com.github.vidaniello.temuapi.requestresultobjects.TemuRequestIf;
import com.github.vidaniello.temuapi.requestresultobjects.TemuResponseIf;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class TemuWorkflow<T extends TemuResponseIf> {
	
	public static final String sign = "sign";
	
	private Gson gson;
	private Date requestDate;
	private TemuAuthParams temuAuthParams;
	private TemuCommonRequestParameters temuCommonRequestParameters;
	private TemuRequestIf requestObject;
	private JsonObject request;
	private TemuResponse temuResponse;
	private TemuException temuException;
	private Class<T> responseType;
	private T responseObject;
	
	public TemuWorkflow() {
		
	}


	public Gson getGson() {
		if(gson==null)
			gson = new Gson();
		return gson;
	}


	public TemuWorkflow<T> setGson(Gson gson) {
		this.gson = gson;
		return this;
	}


	public Date getRequestDate() {
		return requestDate;
	}


	public TemuWorkflow<T> setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
		return this;
	}


	public TemuAuthParams getTemuAuthParams() {
		return temuAuthParams;
	}


	public TemuWorkflow<T> setTemuAuthParams(TemuAuthParams temuAuthParams) {
		this.temuAuthParams = temuAuthParams;
		return this;
	}


	public TemuCommonRequestParameters getTemuCommonRequestParameters() {
		if(temuCommonRequestParameters==null)
			initNewTemuCommonRequestParameters();
		return temuCommonRequestParameters;
	}


	public TemuWorkflow<T> setTemuCommonRequestParameters(TemuCommonRequestParameters temuCommonRequestParameters) {
		this.temuCommonRequestParameters = temuCommonRequestParameters;
		return this;
	}
	
	private void initNewTemuCommonRequestParameters() {
		
		setTemuCommonRequestParameters(
			new TemuCommonRequestParameters()
			.setApp_key(getTemuAuthParams().getAppKey())
			.setAccess_token(getTemuAuthParams().getAccessToken())
			.setTimestamp(new Long( Instant.now().getEpochSecond() ).toString())
		);
		
	}

	public TemuRequestIf getRequestObject() {
		return requestObject;
	}
	
	public TemuWorkflow<T> setRequestObject(TemuRequestIf requestObject) {
		this.requestObject = requestObject;
		return this;
	}
	
	public JsonObject getRequest() {
		if(request==null)
			request = new JsonObject();
		return request;
	}
	
	public TemuWorkflow<T> setRequest(JsonObject request) {
		this.request = request;
		return this;
	}

	public TemuResponse getTemuResponse() {
		return temuResponse;
	}


	public TemuWorkflow<T> setTemuResponse(TemuResponse temuResponse) {
		this.temuResponse = temuResponse;
		return this;
	}


	public TemuException getTemuException() {
		return temuException;
	}


	public TemuWorkflow<T> setTemuException(TemuException temuException) {
		this.temuException = temuException;
		return this;
	}
	
	public Class<T> getResponseType() {
		return responseType;
	}

	public TemuWorkflow<T> setResponseType(Class<T> responseType) {
		this.responseType = responseType;
		return this;
	}
	
	public T getResponseObject() {
		if(getTemuResponse().getResult()!=null) 
			responseObject = getGson().fromJson(getTemuResponse().getResult(), getResponseType());
		return responseObject;
	}
	
	public TemuWorkflow<T> setResponseObject(T responseObject) {
		this.responseObject = responseObject;
		return this;
	}
	
	public TemuWorkflow<T> calculateSign() {
		
		StringBuilder concat = new StringBuilder();
    	
    	concat.append(getTemuAuthParams().getAppSecret());
    	
    	getTemuCommonRequestParameters().loadRequest(getGson(), getRequest());
    	
    	
    	if(getRequestObject()!=null) 
    		getGson()
    			.toJsonTree(getRequestObject())
    			.getAsJsonObject()
    			.asMap()
				.forEach(getRequest()::add);
    	
    	
    	getRequest()
    		.keySet()
    		.stream()
    		.sorted()
    		.forEach(key->{
    			JsonElement jsel = getRequest().get(key);
    			String concatStr = null;
    			if(jsel.isJsonPrimitive())
    				concatStr = jsel.getAsString();
    			else
    				concatStr = getGson().toJson(jsel);
    				
    			concat.append(key+concatStr);
    		});
    	
    	concat.append(getTemuAuthParams().getAppSecret());
		
    	//Calculate sign MD5
    	try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] digest = md.digest(concat.toString().getBytes("UTF-8"));
			StringBuilder hexString = new StringBuilder();
			for (byte b : digest) {
				String hex = Integer.toHexString(0xff & b);
				if (hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			getRequest().addProperty(sign, hexString.toString().toUpperCase());
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			throw new RuntimeException("Error calculating MD5 sign", e);
		}
    	
    	
		return this;
	}
	
	
	
	public static final <T extends TemuResponseIf> TemuWorkflow<T> initDefault() {
		return init(TemuAuthParams.getDefault());
	}
	
	public static final <T extends TemuResponseIf> TemuWorkflow<T> init(TemuAuthParams authParams) {
		return new TemuWorkflow<T>().setTemuAuthParams(authParams);
	}
}