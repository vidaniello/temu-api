package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'bg.local.goods.compliance.rules.get'.
 * Recupera le regole di conformita' (CE, GPSR, etichettatura, certificati...)
 * richieste da TEMU per una categoria di prodotti.
 */
public class BgLocalGoodsComplianceRulesGetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;

	/**
	 * Identificativo della categoria TEMU (catId).
	 */
	private Long catId;

	public Long getCatId() {
		return catId;
	}

	public BgLocalGoodsComplianceRulesGetRequest setCatId(Long catId) {
		this.catId = catId;
		return this;
	}
}
