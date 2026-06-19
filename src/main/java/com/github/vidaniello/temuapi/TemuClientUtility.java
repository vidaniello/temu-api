package com.github.vidaniello.temuapi;

import java.util.ArrayList;
import java.util.List;

import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsBrandTrademarkV2GetRequest;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsBrandTrademarkV2GetResponse;
import com.github.vidaniello.temuapi.requestresultobjects.TemuLocalGoodsBrandTrademarkV2GetResponse.TrademarkInfo;

public class TemuClientUtility {

	/**
	 * Recupera tutti i marchi registrati (trademark) scorrendo tutte le pagine disponibili.
	 * 
	 * @return Una lista contenente tutti gli oggetti TrademarkInfo.
	 * @throws Exception In caso di errori durante la chiamata API.
	 */
	public static List<TrademarkInfo> getAllBrandTrademarks(TemuClient client) throws Exception {
			
		List<TrademarkInfo> allTrademarks = new ArrayList<>();
		int pageSize = 100;
		int currentPage = 1;
		Long totalNum = 0L;

		do {
			TemuLocalGoodsBrandTrademarkV2GetRequest request = new TemuLocalGoodsBrandTrademarkV2GetRequest()
					.setPage(currentPage)
					.setSize(pageSize);

			TemuLocalGoodsBrandTrademarkV2GetResponse response = client.temuLocalGoodsBrandTrademarkV2Get(request);

			if (response != null) {
				if (response.getTrademarkList() != null) {
					allTrademarks.addAll(response.getTrademarkList());
				}
				totalNum = response.getTotalNum();
			} else {
				break;
			}

			currentPage++;
		} while (allTrademarks.size() < (totalNum != null ? totalNum : 0));

		return allTrademarks;
	}

}