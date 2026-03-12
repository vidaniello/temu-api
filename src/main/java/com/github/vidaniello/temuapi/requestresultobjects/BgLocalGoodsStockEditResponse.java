package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'bg.local.goods.stock.edit'.
 * Contains the result of the goods stock edit operation.
 */
public class BgLocalGoodsStockEditResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Goods Id.
	 */
	private Long goodsId;
	
	/**
	 * SKU stock edit status info list.
	 * Contains the status of each SKU stock modification.
	 */
	private List<SkuStockEditStatusInfo> skuStockEditStatusInfoList;
	
	/**
	 * Stock change result.
	 * If true, means the operation was successful.
	 */
	private Boolean operateResult;
	
	/**
	 * Result detail information.
	 */
	private String msg;
		
	public BgLocalGoodsStockEditResponse() {
		this.skuStockEditStatusInfoList = new ArrayList<>();
	}
	
	/**
	 * @return the goods ID
	 */
	public Long getGoodsId() {
		return goodsId;
	}
	
	/**
	 * @param goodsId the goods ID
	 * @return this response object for method chaining
	 */
	public BgLocalGoodsStockEditResponse setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
		return this;
	}
	
	/**
	 * @return the SKU stock edit status info list
	 */
	public List<SkuStockEditStatusInfo> getSkuStockEditStatusInfoList() {
		return skuStockEditStatusInfoList;
	}
	
	/**
	 * @param skuStockEditStatusInfoList the SKU stock edit status info list
	 * @return this response object for method chaining
	 */
	public BgLocalGoodsStockEditResponse setSkuStockEditStatusInfoList(List<SkuStockEditStatusInfo> skuStockEditStatusInfoList) {
		this.skuStockEditStatusInfoList = skuStockEditStatusInfoList;
		return this;
	}
	
	/**
	 * @return the operate result
	 */
	public Boolean getOperateResult() {
		return operateResult;
	}
	
	/**
	 * @param operateResult the operate result
	 * @return this response object for method chaining
	 */
	public BgLocalGoodsStockEditResponse setOperateResult(Boolean operateResult) {
		this.operateResult = operateResult;
		return this;
	}
	
	/**
	 * @return the result detail message
	 */
	public String getMsg() {
		return msg;
	}
	
	/**
	 * @param msg the result detail message
	 * @return this response object for method chaining
	 */
	public BgLocalGoodsStockEditResponse setMsg(String msg) {
		this.msg = msg;
		return this;
	}
	
	/**
	 * Inner class representing the status info of a SKU stock edit operation.
	 */
	public static class SkuStockEditStatusInfo {
		
		/**
		 * Goods Sku Id.
		 */
		private Long skuId;
		
		/**
		 * Stock Edit Status.
		 * If true, means successful stock modification.
		 */
		private Boolean stockEditStatus;
		
		/**
		 * Error code.
		 */
		private Integer errorCode;
		
		/**
		 * Error message.
		 */
		private String errorMsg;
		
		public SkuStockEditStatusInfo() {
		}
		
		/**
		 * @return the SKU ID
		 */
		public Long getSkuId() {
			return skuId;
		}
		
		/**
		 * @param skuId the SKU ID
		 * @return this object for method chaining
		 */
		public SkuStockEditStatusInfo setSkuId(Long skuId) {
			this.skuId = skuId;
			return this;
		}
		
		/**
		 * @return the stock edit status
		 */
		public Boolean getStockEditStatus() {
			return stockEditStatus;
		}
		
		/**
		 * @param stockEditStatus the stock edit status
		 * @return this object for method chaining
		 */
		public SkuStockEditStatusInfo setStockEditStatus(Boolean stockEditStatus) {
			this.stockEditStatus = stockEditStatus;
			return this;
		}
		
		/**
		 * @return the error code
		 */
		public Integer getErrorCode() {
			return errorCode;
		}
		
		/**
		 * @param errorCode the error code
		 * @return this object for method chaining
		 */
		public SkuStockEditStatusInfo setErrorCode(Integer errorCode) {
			this.errorCode = errorCode;
			return this;
		}
		
		/**
		 * @return the error message
		 */
		public String getErrorMsg() {
			return errorMsg;
		}
		
		/**
		 * @param errorMsg the error message
		 * @return this object for method chaining
		 */
		public SkuStockEditStatusInfo setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
			return this;
		}
	}
}