package com.github.vidaniello.temuapi.requestresultobjects;

import java.io.Serializable;
import java.util.List;

import com.github.vidaniello.temuapi.requestresultobjects.BgLocalGoodsOutSnCheckRequest;

/**
 * Response object for the API call 'bg.local.goods.out.sn.check'.
 * Per ogni OutGoodsSn richiesto indica se e' gia' duplicato su TEMU e, in tal
 * caso, il goodId che lo utilizza.
 */
public class BgLocalGoodsOutSnCheckResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;

	private List<Item> resultList;

	public List<Item> getResultList() {
		return resultList;
	}

	public BgLocalGoodsOutSnCheckResponse setResultList(List<Item> resultList) {
		this.resultList = resultList;
		return this;
	}

	public static class Item implements Serializable {

		private static final long serialVersionUID = 1L;

		private String outGoodsSn;
		private Boolean isDuplicate;
		private Long duplicateGoodsId;

		public String getOutGoodsSn() {
			return outGoodsSn;
		}

		public Item setOutGoodsSn(String outGoodsSn) {
			this.outGoodsSn = outGoodsSn;
			return this;
		}

		public Boolean getIsDuplicate() {
			return isDuplicate;
		}

		public Item setIsDuplicate(Boolean isDuplicate) {
			this.isDuplicate = isDuplicate;
			return this;
		}

		public Long getDuplicateGoodsId() {
			return duplicateGoodsId;
		}

		public Item setDuplicateGoodsId(Long duplicateGoodsId) {
			this.duplicateGoodsId = duplicateGoodsId;
			return this;
		}
	}
}
