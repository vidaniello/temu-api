package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'bg.local.goods.out.sn.check'.
 * Verifica se i codici prodotto (OutGoodsSn, a livello di good) sono gia'
 * utilizzati sul marketplace TEMU.
 */
public class BgLocalGoodsOutSnCheckRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;

	/**
	 * Lista di codici prodotto esterni (OutGoodsSn) da verificare.
	 */
	private List<String> outGoodsSnList;

	public BgLocalGoodsOutSnCheckRequest() {
		this.outGoodsSnList = new ArrayList<>();
	}

	public List<String> getOutGoodsSnList() {
		return outGoodsSnList;
	}

	public BgLocalGoodsOutSnCheckRequest setOutGoodsSnList(List<String> outGoodsSnList) {
		this.outGoodsSnList = outGoodsSnList;
		return this;
	}
}
