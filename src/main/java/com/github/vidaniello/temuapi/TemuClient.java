package com.github.vidaniello.temuapi;

import com.github.vidaniello.temuapi.exceptions.TemuException;
import com.github.vidaniello.temuapi.exceptions.TemuExceptionFactory;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsCatsGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsCatsGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalMallInfoGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalMallInfoGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgOpenAccessTokenInfoGetResponse;
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
    public <T extends TemuResponseIf> T doPOST(TemuWorkflow<T> tw) throws  TemuException, IOException {
    	
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
    
    public BgOpenAccessTokenInfoGetResponse bgOpenAccesstokenInfoGet() throws IOException, TemuException {
    	String type = "bg.open.accesstoken.info.get";
    	
    	TemuWorkflow<BgOpenAccessTokenInfoGetResponse> tw = TemuWorkflow
    													.<BgOpenAccessTokenInfoGetResponse>init(getTemuAuthParams())
    													.setResponseType(BgOpenAccessTokenInfoGetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public BgLocalMallInfoGetResponse bgLocalMallInfoGet(BgLocalMallInfoGetRequest request) throws IOException, TemuException {
    	String type = "bg.local.mall.info.get";
    	
    	TemuWorkflow<BgLocalMallInfoGetResponse> tw = TemuWorkflow
    													.<BgLocalMallInfoGetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgLocalMallInfoGetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public BgLocalGoodsCatsGetResponse bgLocalGoodsCatsGet(BgLocalGoodsCatsGetRequest request) throws IOException, TemuException {
    	String type = "bg.local.goods.cats.get";
    	
    	TemuWorkflow<BgLocalGoodsCatsGetResponse> tw = TemuWorkflow
    													.<BgLocalGoodsCatsGetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgLocalGoodsCatsGetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
}