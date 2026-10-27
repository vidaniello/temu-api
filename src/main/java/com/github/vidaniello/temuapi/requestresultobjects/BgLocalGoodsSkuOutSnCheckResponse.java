package com.github.vidaniello.temuapi.requestresultobjects;

import java.io.Serializable;
import java.util.List;

/**
 * Response object for the API call 'bg.local.goods.sku.out.sn.check'.
 * Per ogni OutSkuSn richiesto indica se e' gia' duplicato su TEMU e, in tal
 * caso, lo SKU/good che lo utilizza.
 */
public class BgLocalGoodsSkuOutSnCheckResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;

	private List<Item> resultList;

	public List<Item> getResultList() {
		return resultList;
	}

	public BgLocalGoodsSkuOutSnCheckResponse setResultList(List<Item> resultList) {
		this.resultList = resultList;
		return this;
	}

	public static class Item implements Serializable {

		private static final long serialVersionUID = 1L;

		private String outSkuSn;
		private Boolean isDuplicate;
		private Long duplicateSkuId;
		private Long duplicateGoodsId;

		public String getOutSkuSn() {
			return outSkuSn;
		}

		public Item setOutSkuSn(String outSkuSn) {
			this.outSkuSn = outSkuSn;
			return this;
		}

		public Boolean getIsDuplicate() {
			return isDuplicate;
		}

		public Item setIsDuplicate(Boolean isDuplicate) {
			this.isDuplicate = isDuplicate;
			return this;
		}

		public Long getDuplicateSkuId() {
			return duplicateSkuId;
		}

		public Item setDuplicateSkuId(Long duplicateSkuId) {
			this.duplicateSkuId = duplicateSkuId;
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
