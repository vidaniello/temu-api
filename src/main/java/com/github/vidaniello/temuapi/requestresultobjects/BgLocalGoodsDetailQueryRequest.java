package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'bg.local.goods.detail.query'.
 * Recupera il dettaglio completo di un good pubblicato su TEMU.
 */
public class BgLocalGoodsDetailQueryRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;

	/**
	 * Identificativo del good su TEMU.
	 */
	private Long goodsId;

	public Long getGoodsId() {
		return goodsId;
	}

	public BgLocalGoodsDetailQueryRequest setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
		return this;
	}
}
