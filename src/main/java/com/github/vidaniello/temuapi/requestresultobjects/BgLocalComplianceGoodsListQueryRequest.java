package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'bg.local.compliance.goods.list.query'.
 * Elenco dei good con unresolved compliance (utile per un report all'operatore
 * su cosa occorre produrre per rendere pubblicabili gli articoli). Parametri di
 * paginazione ipotizzati (page/pageSize); la struttura della risposta non e'
 * ancora modellata: usare l'invocazione generica con risposta envelope
 * ('result' e' null quando non ci sono good non conformi).
 */
public class BgLocalComplianceGoodsListQueryRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;

	private Integer page;
	private Integer pageSize;

	public Integer getPage() {
		return page;
	}

	public BgLocalComplianceGoodsListQueryRequest setPage(Integer page) {
		this.page = page;
		return this;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public BgLocalComplianceGoodsListQueryRequest setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		return this;
	}
}
