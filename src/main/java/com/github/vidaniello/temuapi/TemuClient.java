package com.github.vidaniello.temuapi;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class TemuClient {

    private final Gson gson = new Gson();

    /**
     * Sends a POST request to the specified endpoint with a JSON body.
     *
     * @param url the endpoint URL
     * @param request the request object to serialize as JSON
     * @return the response body as a String, or null if an error occurs
     * @throws IOException if an I/O error occurs during the request
     */
    public String postJson(String url, TemuCommonRequestParameters request) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-Type", "application/json");
        
        String jsonBody = gson.toJson(request);
        
        StringEntity entity = new StringEntity(jsonBody);
        httpPost.setEntity(entity);
        
        try (CloseableHttpClient client = HttpClients.createDefault();
             CloseableHttpResponse response = client.execute(httpPost)) {
            HttpEntity responseEntity = response.getEntity();
            if (responseEntity != null) {
                return EntityUtils.toString(responseEntity);
            }
        }
        return null;
    }
    
    public void bg_open_accesstoken_info_get() {
    	String type = "bg.open.accesstoken.info.get";
    	TemuCommonRequestParameters tcrp = TemuCommonRequestParameters.initDefault();
    	TemuAuthParams tap = TemuAuthParams.getDefault();
    	tcrp.setType(type);
    	
    	StringBuilder concat = new StringBuilder();
    	
    	concat.append(tap.getAppSecret());
    	
    	JsonElement json = gson.toJsonTree(tcrp);
    	json.getAsJsonObject()
    		.keySet()
    		.stream()
    		.sorted()
    		.forEach(key->{
    			concat.append(key+json.getAsJsonObject().get(key).toString());
    		});
    	
    	concat.append(tap.getAppSecret());
    }
}