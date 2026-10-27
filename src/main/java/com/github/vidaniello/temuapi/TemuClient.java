package com.github.vidaniello.temuapi;

import com.github.vidaniello.temuapi.exceptions.TemuException;
import com.github.vidaniello.temuapi.exceptions.TemuExceptionFactory;
import com.github.vidaniello.temuapi.requestresultobjects.BgFreightTemplateListQueryResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalComplianceGoodsListQueryRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsComplianceRulesGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsComplianceRulesGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsDetailQueryRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsDetailQueryResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsOutSnCheckRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsOutSnCheckResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsSkuOutSnCheckRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsSkuOutSnCheckResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsCatsGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsCatsGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsImageUploadRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsImageUploadResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsPartialUpdateRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsPartialUpdateResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsPriceorderChangeSkuPriceRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsPriceorderChangeSkuPriceResponse;
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
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsMissingAttributesGetRequest;
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
        //Body serializzato senza escape HTML, coerente con il calcolo del sign
        //(JsonElement.toString() escapano i caratteri HTML inutilmente)
        String jsonBody = tw.getRequestBodyJson();

        //Il body DEVE essere inviato in UTF-8: StringEntity(String) userebbe il
        //charset di default (ISO-8859-1) e i caratteri non ASCII (à, è, ×, ecc.)
        //arriverebbero a TEMU corrotti, invalidando il calcolo del sign
        //'sign is invalid' e il contenuto stesso dei prodotti
        StringEntity entity = new StringEntity(jsonBody, org.apache.http.entity.ContentType.APPLICATION_JSON);
        httpPost.setEntity(entity);
        
        try (CloseableHttpClient client = HttpClients.custom()
                .disableCookieManagement()
                .build();
             CloseableHttpResponse response = client.execute(httpPost)) {
            HttpEntity responseEntity = response.getEntity();
            if (responseEntity != null) {

            	String responseString = EntityUtils.toString(responseEntity);

            	TemuResponse temuResponse = tw.getGson().fromJson(responseString, TemuResponse.class);

            	//Conserva il body RAW della risposta per comporre errori
            	//il piu' specifici possibile (vedi TemuExceptionFactory)
            	if (temuResponse != null)
            		temuResponse.setRawBody(responseString);

            	tw.setTemuResponse(temuResponse);
            	
            	TemuExceptionFactory.checkAndThrowTemuException(tw);
            	
                return tw.getResponseObject();
            }
        }
        return null;
    }
    
    /**
     * Invocazione generica di una qualunque API TEMU documentata nella guida
     * (vedi {@link TemuApiTypes} per l'elenco completo dei 'type' disponibili).
     *
     * <p>Utile per le API per cui non esistono ancora classi Request/Response
     * tipizzate: il body si compone come {@link com.google.gson.JsonObject}
     * con i nomi campo attesi dalla documentazione TEMU (camelCase).</p>
     *
     * @param type         il 'type' dell'API (es. "bg.local.goods.out.sn.check")
     * @param requestBody  i parametri della richiesta, o null se l'API non ne prevede
     * @param responseClass classe del risultato: il JsonObject 'result' della
     *                     risposta viene deserializzato in questa classe
     * @return l'oggetto risposta deserializzato, o null se 'result' e' assente
     */
    public <T extends TemuResponseIf> T doPOSTByType(String type, JsonObject requestBody, Class<T> responseClass) throws IOException, TemuException {

    	TemuWorkflow<T> tw = TemuWorkflow
    													.<T>init(getTemuAuthParams())
    													.setResponseType(responseClass);

    	if(requestBody!=null)
    		tw.setRequest(requestBody);

    	tw.getTemuCommonRequestParameters()
    	  .setType(type);

    	return doPOST(tw);

    }

    /**
     * Come {@link #doPOSTByType(String, JsonObject, Class)} ma restituisce la
     * busta risposta INTERA ({@link TemuResponse}), utile per ispezionare il
     * 'result' come JsonObject generico o il body RAW quando la forma della
     * risposta non e' nota a priori.
     */
    public TemuResponse doPOSTEnvelopeByType(String type, JsonObject requestBody) throws IOException, TemuException {

    	TemuWorkflow<VoidResponse> tw = TemuWorkflow
    													.<VoidResponse>init(getTemuAuthParams())
    													.setResponseType(VoidResponse.class);

    	if(requestBody!=null)
    		tw.setRequest(requestBody);

    	tw.getTemuCommonRequestParameters()
    	  .setType(type);

    	doPOST(tw);

    	return tw.getTemuResponse();

    }

    /**
     * 'bg.local.goods.out.sn.check': verifica se codici prodotto esterni
     * (OutGoodsSn, livello good) sono gia' utilizzati su TEMU.
     */
    public BgLocalGoodsOutSnCheckResponse bgLocalGoodsOutSnCheck(BgLocalGoodsOutSnCheckRequest request) throws IOException, TemuException {
    	String type = TemuApiTypes.BG_LOCAL_GOODS_OUT_SN_CHECK;

    	TemuWorkflow<BgLocalGoodsOutSnCheckResponse> tw = TemuWorkflow
    													.<BgLocalGoodsOutSnCheckResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgLocalGoodsOutSnCheckResponse.class);

    	tw.getTemuCommonRequestParameters()
    	  .setType(type);

    	return doPOST(tw);

    }

    /**
     * 'bg.local.goods.sku.out.sn.check': verifica se codici SKU esterni
     * (OutSkuSn, livello SKU) sono gia' utilizzati su TEMU. Alternativa ad una
     * sola chiamata delle 5 chiamate 'temu.local.sku.list.retrieve' con i vari
     * stati (ACTIVE/INACTIVE/INCOMPLETE/DRAFT/DELETED).
     */
    public BgLocalGoodsSkuOutSnCheckResponse bgLocalGoodsSkuOutSnCheck(BgLocalGoodsSkuOutSnCheckRequest request) throws IOException, TemuException {
    	String type = TemuApiTypes.BG_LOCAL_GOODS_SKU_OUT_SN_CHECK;

    	TemuWorkflow<BgLocalGoodsSkuOutSnCheckResponse> tw = TemuWorkflow
    													.<BgLocalGoodsSkuOutSnCheckResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgLocalGoodsSkuOutSnCheckResponse.class);

    	tw.getTemuCommonRequestParameters()
    	  .setType(type);

    	return doPOST(tw);

    }

    /**
     * 'bg.local.goods.detail.query': dettaglio completo di un good pubblicato
     * su TEMU (SKU, prezzi, attributi registrati, gallerie, marchio).
     */
    public BgLocalGoodsDetailQueryResponse bgLocalGoodsDetailQuery(BgLocalGoodsDetailQueryRequest request) throws IOException, TemuException {
    	String type = TemuApiTypes.BG_LOCAL_GOODS_DETAIL_QUERY;

    	TemuWorkflow<BgLocalGoodsDetailQueryResponse> tw = TemuWorkflow
    													.<BgLocalGoodsDetailQueryResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgLocalGoodsDetailQueryResponse.class);

    	tw.getTemuCommonRequestParameters()
    	  .setType(type);

    	return doPOST(tw);

    }

    /**
     * 'bg.local.goods.compliance.rules.get': regole di conformita' richieste
     * da TEMU per una categoria (CE, GPSR, etichettatura, certificati, foto reali).
     */
    public BgLocalGoodsComplianceRulesGetResponse bgLocalGoodsComplianceRulesGet(BgLocalGoodsComplianceRulesGetRequest request) throws IOException, TemuException {
    	String type = TemuApiTypes.BG_LOCAL_GOODS_COMPLIANCE_RULES_GET;

    	TemuWorkflow<BgLocalGoodsComplianceRulesGetResponse> tw = TemuWorkflow
    													.<BgLocalGoodsComplianceRulesGetResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgLocalGoodsComplianceRulesGetResponse.class);

    	tw.getTemuCommonRequestParameters()
    	  .setType(type);

    	return doPOST(tw);

    }

    /**
     * 'temu.local.goods.missing.attributes.get': attributi obbligatori ancora
     * mancanti di un good. La risposta non e' ancora modellata: restituisce la
     * busta {@link TemuResponse} completa (campo 'result' come JsonObject).
     * Rifiutata con 150011130 se il good e' in revisione.
     */
    public TemuResponse temuLocalGoodsMissingAttributesGetEnvelope(TemuLocalGoodsMissingAttributesGetRequest request) throws IOException, TemuException {
    	String type = TemuApiTypes.TEMU_LOCAL_GOODS_MISSING_ATTRIBUTES_GET;

    	TemuWorkflow<VoidResponse> tw = TemuWorkflow
    													.<VoidResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(VoidResponse.class);

    	tw.getTemuCommonRequestParameters()
    	  .setType(type);

    	doPOST(tw);

    	return tw.getTemuResponse();

    }

    /**
     * 'bg.local.compliance.goods.list.query': elenco dei good con unresolved
     * compliance (base per un report all'operatore). La risposta non e' ancora
     * modellata: restituisce la busta {@link TemuResponse} completa ('result'
     * e' null quando non ci sono good non conformi).
     */
    public TemuResponse bgLocalComplianceGoodsListQueryEnvelope(BgLocalComplianceGoodsListQueryRequest request) throws IOException, TemuException {
    	String type = TemuApiTypes.BG_LOCAL_COMPLIANCE_GOODS_LIST_QUERY;

    	TemuWorkflow<VoidResponse> tw = TemuWorkflow
    													.<VoidResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(VoidResponse.class);

    	tw.getTemuCommonRequestParameters()
    	  .setType(type);

    	doPOST(tw);

    	return tw.getTemuResponse();

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
    
    public BgLocalGoodsPriceorderChangeSkuPriceResponse bgLocalGoodsPriceorderChangeSkuPrice(BgLocalGoodsPriceorderChangeSkuPriceRequest request) throws IOException, TemuException {
    	String type = "bg.local.goods.priceorder.change.sku.price";
    	
    	TemuWorkflow<BgLocalGoodsPriceorderChangeSkuPriceResponse> tw = TemuWorkflow
    													.<BgLocalGoodsPriceorderChangeSkuPriceResponse>init(getTemuAuthParams())
    													.setRequestObject(request)
    													.setResponseType(BgLocalGoodsPriceorderChangeSkuPriceResponse.class);
    	
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