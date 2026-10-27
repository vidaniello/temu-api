package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'temu.local.goods.missing.attributes.get'.
 * Recupera gli attributi obbligatori ancora mancanti di un good (utile per
 * capire perche' un good risulta incompleto). Il parametro 'goodsId' e'
 * stato verificato empiricamente; la struttura della risposta non e' ancora
 * modellata: usare l'invocazione generica con risposta envelope.
 *
 * <p>Nota: TEMU rifiuta la richiesta (150011130) se il good e' in revisione.</p>
 */
public class TemuLocalGoodsMissingAttributesGetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;

	private Long goodsId;

	public Long getGoodsId() {
		return goodsId;
	}

	public TemuLocalGoodsMissingAttributesGetRequest setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
		return this;
	}
}
