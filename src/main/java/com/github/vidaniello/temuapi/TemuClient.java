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
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsStockEditRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsStockEditResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsTaxCodeGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsTaxCodeGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalMallInfoGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalMallInfoGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLogisticsCompaniesGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLogisticsCompaniesGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLogisticsShipmentShippingtypeUpdateRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLogisticsShipmentV2ConfirmRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLogisticsShipmentV2ConfirmResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLogisticsShipmentV2GetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLogisticsShipmentV2GetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgOpenAccessTokenInfoGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgOrderAmountQueryRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgOrderAmountQueryResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgOrderDecryptshippinginfoGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgOrderDecryptshippinginfoGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgOrderDetailV2GetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgOrderDetailV2GetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgOrderListV2GetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgOrderListV2GetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgOrderShippinginfoV2GetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgOrderShippinginfoV2GetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.VoidResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsBrandTrademarkV2GetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsBrandTrademarkV2GetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsDeleteRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsDeleteResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsListRetrieveRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsListRetrieveResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsSkuStockQueryRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsSkuStockQueryResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsV2AddRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsV2AddResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalOrderVerificationUploadRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalProductAttributesGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalProductAttributesGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalProductVariationGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalProductVariationGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalSkuListRetrieveRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalSkuListRetrieveResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuOrderCancelAppealApplyRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuOrderCancelAppealApplyResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuOrderCancelAppealResultGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuOrderCancelAppealResultGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuOrderCancelOutofstockApplyRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuOrderCancelOutofstockApplyResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuOrderCancelOutofstockResultGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuOrderCancelOutofstockResultGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuResponseIf;
import com.github.vidaniello.temuapi.requestresultobjects.TemuTrackTrackinginfoGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuTrackTrackinginfoGetResponse;
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
    
    public BgLocalGoodsStockEditResponse bgLocalGoodsStockEdit(BgLocalGoodsStockEditRequest request) throws IOException, TemuException {
    	String type = "bg.local.goods.stock.edit";
    	
    	TemuWorkflow<BgLocalGoodsStockEditResponse> tw = TemuWorkflow
    													.<BgLocalGoodsStockEditResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgLocalGoodsStockEditResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public TemuLocalGoodsSkuStockQueryResponse temuLocalGoodsSkuStockQuery(TemuLocalGoodsSkuStockQueryRequest request) throws IOException, TemuException {
    	String type = "temu.local.goods.sku.stock.query";
    	
    	TemuWorkflow<TemuLocalGoodsSkuStockQueryResponse> tw = TemuWorkflow
    													.<TemuLocalGoodsSkuStockQueryResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(TemuLocalGoodsSkuStockQueryResponse.class);
    	
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
    
    
    
    public BgOrderAmountQueryResponse bgOrderAmountQuery(BgOrderAmountQueryRequest request) throws IOException, TemuException {
    	String type = "bg.order.amount.query";
    	
    	TemuWorkflow<BgOrderAmountQueryResponse> tw = TemuWorkflow
    													.<BgOrderAmountQueryResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgOrderAmountQueryResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public void temuLocalOrderVerificationUpload(TemuLocalOrderVerificationUploadRequest request) throws IOException, TemuException {
    	String type = "temu.local.order.verification.upload";
    	
    	TemuWorkflow<VoidResponse> tw = TemuWorkflow
    													.<VoidResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(VoidResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	doPOST(tw);
    	
    }
    
    public TemuOrderCancelAppealApplyResponse temuOrderCancelAppealApply(TemuOrderCancelAppealApplyRequest request) throws IOException, TemuException {
    	String type = "temu.order.cancel.appeal.apply";
    	
    	TemuWorkflow<TemuOrderCancelAppealApplyResponse> tw = TemuWorkflow
    													.<TemuOrderCancelAppealApplyResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(TemuOrderCancelAppealApplyResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public TemuOrderCancelAppealResultGetResponse temuOrderCancelAppealResultGet(TemuOrderCancelAppealResultGetRequest request) throws IOException, TemuException {
    	String type = "temu.order.cancel.appeal.result.get";
    	
    	TemuWorkflow<TemuOrderCancelAppealResultGetResponse> tw = TemuWorkflow
    													.<TemuOrderCancelAppealResultGetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(TemuOrderCancelAppealResultGetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public TemuOrderCancelOutofstockApplyResponse temuOrderCancelOutofstockApply(TemuOrderCancelOutofstockApplyRequest request) throws IOException, TemuException {
    	String type = "temu.order.cancel.outofstock.apply";
    	
    	TemuWorkflow<TemuOrderCancelOutofstockApplyResponse> tw = TemuWorkflow
    													.<TemuOrderCancelOutofstockApplyResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(TemuOrderCancelOutofstockApplyResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public TemuOrderCancelOutofstockResultGetResponse temuOrderCancelOutofstockResultGet(TemuOrderCancelOutofstockResultGetRequest request) throws IOException, TemuException {
    	String type = "temu.order.cancel.outofstock.result.get";
    	
    	TemuWorkflow<TemuOrderCancelOutofstockResultGetResponse> tw = TemuWorkflow
    													.<TemuOrderCancelOutofstockResultGetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(TemuOrderCancelOutofstockResultGetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
  
    
    
    
    
    
    
    
    public BgOrderListV2GetResponse bgOrderListV2Get(BgOrderListV2GetRequest request) throws IOException, TemuException {
    	String type = "bg.order.list.v2.get";
    	
    	TemuWorkflow<BgOrderListV2GetResponse> tw = TemuWorkflow
    													.<BgOrderListV2GetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgOrderListV2GetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    
    

    public BgOrderDetailV2GetResponse bgOrderListV2Get(BgOrderDetailV2GetRequest request) throws IOException, TemuException {
    	String type = "bg.order.detail.v2.get";
    	
    	TemuWorkflow<BgOrderDetailV2GetResponse> tw = TemuWorkflow
    													.<BgOrderDetailV2GetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgOrderDetailV2GetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public BgOrderShippinginfoV2GetResponse bgOrderShippinginfoV2Get(BgOrderShippinginfoV2GetRequest request) throws IOException, TemuException {
    	String type = "bg.order.shippinginfo.v2.get";
    	
    	TemuWorkflow<BgOrderShippinginfoV2GetResponse> tw = TemuWorkflow
    													.<BgOrderShippinginfoV2GetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgOrderShippinginfoV2GetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    
    public BgOrderDecryptshippinginfoGetResponse bgOrderDecryptshippinginfoGet(BgOrderDecryptshippinginfoGetRequest request) throws IOException, TemuException {
    	String type = "bg.order.decryptshippinginfo.get";
    	
    	TemuWorkflow<BgOrderDecryptshippinginfoGetResponse> tw = TemuWorkflow
    													.<BgOrderDecryptshippinginfoGetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgOrderDecryptshippinginfoGetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public BgLogisticsCompaniesGetResponse bgLogisticsCompaniesGet(BgLogisticsCompaniesGetRequest request) throws IOException, TemuException {
    	String type = "bg.logistics.companies.get";
    	
    	TemuWorkflow<BgLogisticsCompaniesGetResponse> tw = TemuWorkflow
    													.<BgLogisticsCompaniesGetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgLogisticsCompaniesGetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    public BgLogisticsShipmentV2ConfirmResponse bgLogisticsShipmentV2Cofirm(BgLogisticsShipmentV2ConfirmRequest request) throws IOException, TemuException {
    	String type = "bg.logistics.shipment.v2.confirm";
    	
    	TemuWorkflow<BgLogisticsShipmentV2ConfirmResponse> tw = TemuWorkflow
    													.<BgLogisticsShipmentV2ConfirmResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgLogisticsShipmentV2ConfirmResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }

    public BgLogisticsShipmentV2GetResponse bgLogisticsShipmentV2Get(BgLogisticsShipmentV2GetRequest request) throws IOException, TemuException {
    	String type = "bg.logistics.shipment.v2.get";
    	
    	TemuWorkflow<BgLogisticsShipmentV2GetResponse> tw = TemuWorkflow
    													.<BgLogisticsShipmentV2GetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgLogisticsShipmentV2GetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }


    public void bgLogisticsShipmentShippingtypeUpdate(BgLogisticsShipmentShippingtypeUpdateRequest request) throws IOException, TemuException {
    	String type = "bg.logistics.shipment.shippingtype.update";
    	
    	TemuWorkflow<VoidResponse> tw = TemuWorkflow
    													.<VoidResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(VoidResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	doPOST(tw);
    }
    
    
    public TemuTrackTrackinginfoGetResponse temuTrackTrackinginfoGet(TemuTrackTrackinginfoGetRequest request) throws IOException, TemuException {
    	String type = "temu.track.trackinginfo.get";
    	
    	TemuWorkflow<TemuTrackTrackinginfoGetResponse> tw = TemuWorkflow
    													.<TemuTrackTrackinginfoGetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(TemuTrackTrackinginfoGetResponse.class);
    	
    	tw.getTemuCommonRequestParameters()
    	  .setType(type);
    	
    	return doPOST(tw);
    	
    }
    
    
   

    
    
    
}