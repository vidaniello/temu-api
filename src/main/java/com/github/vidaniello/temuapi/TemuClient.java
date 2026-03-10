package com.github.vidaniello.temuapi;

import com.github.vidaniello.temuapi.exceptions.TemuException;
import com.github.vidaniello.temuapi.exceptions.TemuExceptionFactory;
import com.github.vidaniello.temuapi.requestresultobjects.BgFreightTemplateListQueryResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsCatsGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsCatsGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsImageUploadRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsImageUploadResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsPartialUpdateRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsPartialUpdateResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsTaxCodeGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsTaxCodeGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalMallInfoGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalMallInfoGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgOpenAccessTokenInfoGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsBrandTrademarkV2GetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsBrandTrademarkV2GetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsDeleteRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsDeleteResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsListRetrieveRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsListRetrieveResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsV2AddRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsV2AddResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalProductAttributesGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalProductAttributesGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalProductVariationGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalProductVariationGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalSkuListRetrieveRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalSkuListRetrieveResponse;
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
    
    public TemuLocalProductAttributesGetResponse temuLocalProductAttributesGet(TemuLocalProductAttributesGetRequest request) throws IOException, TemuException {
    	String type = "temu.local.product.attributes.get";
    	
    	TemuWorkflow<TemuLocalProductAttributesGetResponse> tw = TemuWorkflow
    													.<TemuLocalProductAttributesGetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(TemuLocalProductAttributesGetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public TemuLocalProductVariationGetResponse temuLocalProductVariationGet(TemuLocalProductVariationGetRequest request) throws IOException, TemuException {
    	String type = "temu.local.product.variation.get";
    	
    	TemuWorkflow<TemuLocalProductVariationGetResponse> tw = TemuWorkflow
    													.<TemuLocalProductVariationGetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(TemuLocalProductVariationGetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public BgFreightTemplateListQueryResponse bgFreightTemplateListQuery() throws IOException, TemuException {
    	String type = "bg.freight.template.list.query";
    	
    	TemuWorkflow<BgFreightTemplateListQueryResponse> tw = TemuWorkflow
    													.<BgFreightTemplateListQueryResponse>init(getTemuAuthParams())
    													.setResponseType(BgFreightTemplateListQueryResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public TemuLocalGoodsBrandTrademarkV2GetResponse temuLocalGoodsBrandTrademarkV2Get(TemuLocalGoodsBrandTrademarkV2GetRequest request) throws IOException, TemuException {
    	String type = "temu.local.goods.brand.trademark.V2.get";
    	
    	TemuWorkflow<TemuLocalGoodsBrandTrademarkV2GetResponse> tw = TemuWorkflow
    													.<TemuLocalGoodsBrandTrademarkV2GetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(TemuLocalGoodsBrandTrademarkV2GetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public BgLocalGoodsTaxCodeGetResponse bgLocalGoodsTaxCodeGet(BgLocalGoodsTaxCodeGetRequest request) throws IOException, TemuException {
    	String type = "bg.local.goods.tax.code.get";
    	
    	TemuWorkflow<BgLocalGoodsTaxCodeGetResponse> tw = TemuWorkflow
    													.<BgLocalGoodsTaxCodeGetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgLocalGoodsTaxCodeGetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public BgLocalGoodsImageUploadResponse bgLocalGoodsImageUpload(BgLocalGoodsImageUploadRequest request) throws IOException, TemuException {
    	String type = "bg.local.goods.image.upload";
    	
    	TemuWorkflow<BgLocalGoodsImageUploadResponse> tw = TemuWorkflow
    													.<BgLocalGoodsImageUploadResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgLocalGoodsImageUploadResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public TemuLocalGoodsV2AddResponse temuLocalGoodsV2Add(TemuLocalGoodsV2AddRequest request) throws IOException, TemuException {
    	String type = "temu.local.goods.v2.add";
    	
    	TemuWorkflow<TemuLocalGoodsV2AddResponse> tw = TemuWorkflow
    													.<TemuLocalGoodsV2AddResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(TemuLocalGoodsV2AddResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public BgLocalGoodsPartialUpdateResponse bgLocalGoodsPartialUpdate(BgLocalGoodsPartialUpdateRequest request) throws IOException, TemuException {
    	String type = "bg.local.goods.partial.update";
    	
    	TemuWorkflow<BgLocalGoodsPartialUpdateResponse> tw = TemuWorkflow
    													.<BgLocalGoodsPartialUpdateResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgLocalGoodsPartialUpdateResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public TemuLocalGoodsDeleteResponse temuLocalGoodsDelete(TemuLocalGoodsDeleteRequest request) throws IOException, TemuException {
    	String type = "temu.local.goods.delete";
    	
    	TemuWorkflow<TemuLocalGoodsDeleteResponse> tw = TemuWorkflow
    													.<TemuLocalGoodsDeleteResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(TemuLocalGoodsDeleteResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public TemuLocalSkuListRetrieveResponse temuLocalSkuListRetrieve(TemuLocalSkuListRetrieveRequest request) throws IOException, TemuException {
    	String type = "temu.local.sku.list.retrieve";
    	
    	TemuWorkflow<TemuLocalSkuListRetrieveResponse> tw = TemuWorkflow
    													.<TemuLocalSkuListRetrieveResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(TemuLocalSkuListRetrieveResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public TemuLocalGoodsListRetrieveResponse temuLocalGoodsListRetrieve(TemuLocalGoodsListRetrieveRequest request) throws IOException, TemuException {
    	String type = "temu.local.goods.list.retrieve";
    	
    	TemuWorkflow<TemuLocalGoodsListRetrieveResponse> tw = TemuWorkflow
    													.<TemuLocalGoodsListRetrieveResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(TemuLocalGoodsListRetrieveResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    
}