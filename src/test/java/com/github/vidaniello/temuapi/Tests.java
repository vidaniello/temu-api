package com.github.vidaniello.temuapi;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.github.vidaniello.temuapi.exceptions.TemuException;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsCatsGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsCatsGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsCatsGetResponse.GoodsCats;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalMallInfoGetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.BgLocalMallInfoGetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.BgOpenAccessTokenInfoGetResponse;

public class Tests {
	static {
		// Log4j from 2.17.>
		//System.setProperty("log4j2.Configuration.allowedProtocols", "http");

		// URL file di configurazione Log4j2
		System.setProperty("log4j.configurationFile", "https://gist.github.com/vidaniello/c20e29cdffb407ec5d3c773fb92786b9/raw/92c8e809f51133ef56e4867a6cabb0744ee6b9b6/log4j2.xml");

		// Tips per java.util.logging
		System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");

		// private org.apache.logging.log4j.Logger log =
		// org.apache.logging.log4j.LogManager.getLogger();
	}
	
	private Logger log = LogManager.getLogger();
	
	@Test
	public void testTemplate() {
		try {
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new AssertionError(e);
		}
	}
	
	@Test
	public void testCatsRequest() {
		try {
			
			TemuClient client = new TemuClient(TemuSandboxAccounts.getForIT());
			
			
			BgLocalGoodsCatsGetResponse resp = client.bgLocalGoodsCatsGet(new BgLocalGoodsCatsGetRequest());

			
			Assert.assertTrue(resp!=null);
			
			iterateCategories(client, resp.getGoodsCatsList(), "");
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new AssertionError(e);
		}
	}
	
	public void iterateCategories(TemuClient client, List<GoodsCats> categoryList, String identitation) throws IOException, TemuException {
		for(GoodsCats cat : categoryList) {
			log.trace(identitation+cat.getCatId()+" - "+cat.getCatName());
			if(!cat.getLeaf())
				iterateCategory(client, cat, identitation+"\t");
		}
	}
	
	public void iterateCategory(TemuClient client, GoodsCats parentCat, String identitation) throws IOException, TemuException {
		iterateCategories(client, client.bgLocalGoodsCatsGet(new BgLocalGoodsCatsGetRequest().setParentCatId(parentCat.getCatId())).getGoodsCatsList(),identitation);
	}
	
	
	
	
	@Test
	public void testApiRequestMethods() {
		try {
			
			TemuClient client = new TemuClient(TemuSandboxAccounts.getForIT());
			
			
			
			BgOpenAccessTokenInfoGetResponse accessTokenResp = client.bgOpenAccesstokenInfoGet();
			
			Assert.assertTrue(accessTokenResp!=null);
			
			Assert.assertTrue(!accessTokenResp.getApiScopeList().isEmpty());
			
			log.debug("Shop id: "+accessTokenResp.getMallId());
			
			
			
			BgLocalMallInfoGetResponse mallResp = client
					.bgLocalMallInfoGet(
							new BgLocalMallInfoGetRequest()
								.setBranchesMallId( Arrays.asList(accessTokenResp.getMallId()) )
							);
			
			Assert.assertTrue(mallResp!=null);
			
			log.debug("Site id: "+mallResp.getSiteId());
			
			
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new AssertionError(e);
		}
	}
	
	@Test
	public void testReadingTemuAuthParameter() {
		try {
			TemuAuthParams tap = TemuAuthParams.getDefault();
			Assert.assertTrue(tap!=null);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new AssertionError(e);
		}
	}
}
