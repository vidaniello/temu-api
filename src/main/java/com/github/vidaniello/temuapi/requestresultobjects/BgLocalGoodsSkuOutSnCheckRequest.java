package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'bg.local.goods.sku.out.sn.check'.
 * Verifica se i codici SKU esterni (OutSkuSn, a livello di SKU) sono gia'
 * utilizzati sul marketplace TEMU.
 */
public class BgLocalGoodsSkuOutSnCheckRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;

	/**
	 * Lista di codici SKU esterni (OutSkuSn) da verificare.
	 */
	private List<String> outSkuSnList;

	public BgLocalGoodsSkuOutSnCheckRequest() {
		this.outSkuSnList = new ArrayList<>();
	}

	public List<String> getOutSkuSnList() {
		return outSkuSnList;
	}

	public BgLocalGoodsSkuOutSnCheckRequest setOutSkuSnList(List<String> outSkuSnList) {
		this.outSkuSnList = outSkuSnList;
		return this;
	}
}
