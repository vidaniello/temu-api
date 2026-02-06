package com.github.vidaniello.temuapi;

import com.github.vidaniello.temuapi.exceptions.TemuException;
import com.github.vidaniello.temuapi.exceptions.TemuExceptionFactory;
import com.github.vidaniello.temuapi.requestresultobjects.AccessTokenInfoGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuResponseIf;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.time.Instant;
import java.util.Date;

public class TemuClient {
	
	private TemuAuthParams temuAuthParams;
	
	public TemuClient() {
		
	}
	
	public TemuClient(TemuAuthParams temuAuthParams) {
		this.temuAuthParams = temuAuthParams;
	}
	
	public TemuAuthParams getTemuAuthParams() {
		if(temuAuthParams==null)
			temuAuthParams = TemuAuthParams.getDefault();
		return temuAuthParams;
	}
	
	public TemuClient setTemuAuthParams(TemuAuthParams temuAuthParams) {
		this.temuAuthParams = temuAuthParams;
		return this;
	}

    /**
     * Sends a POST request to the specified endpoint with a JSON body.
     *
     * @param url the endpoint URL
     * @param request the request object to serialize as JSON
     * @return the response body as a String, or null if an error occurs
     * @throws  
     * @throws IOException if an I/O error occurs during the request
     */
    public <T extends TemuResponseIf> T postWorkflow(TemuWorkflow<T> tw) throws  TemuException, IOException {
    	
    	tw.setRequestDate(new Date());
    	
        HttpPost httpPost = new HttpPost(tw.getTemuAuthParams().getEndpoint());
        httpPost.setHeader("Content-Type", "application/json");
        
        tw.calculateSign();
        String jsonBody = tw.getRequest().toString();
        
        StringEntity entity = new StringEntity(jsonBody);
        httpPost.setEntity(entity);
        
        try (CloseableHttpClient client = HttpClients.createDefault();
             CloseableHttpResponse response = client.execute(httpPost)) {
            HttpEntity responseEntity = response.getEntity();
            if (responseEntity != null) {
            	
            	String responseString = EntityUtils.toString(responseEntity);
            	
            	TemuResponse temuResponse = tw.getGson().fromJson(responseString, TemuResponse.class);
            	
            	tw.setTemuResponse(temuResponse);
            	
            	TemuExceptionFactory.checkAndThrowTemuException(tw);
            	
                return tw.getResponseObject();
            }
        }
        return null;
    }
    
    public AccessTokenInfoGetResponse bgOpenAccesstokenInfoGet() throws IOException, TemuException {
    	String type = "bg.open.accesstoken.info.get";
    	
    	TemuWorkflow<AccessTokenInfoGetResponse> tw = TemuWorkflow
    													.<AccessTokenInfoGetResponse>init(getTemuAuthParams())
    													.setResponseType(AccessTokenInfoGetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type)
    	  ;
    	
    	return postWorkflow(tw);
    	
    }
}