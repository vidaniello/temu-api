package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'temu.local.goods.brand.trademark.V2.get'.
 * Contains brand trademark information with pagination details.
 */
public class TemuLocalGoodsBrandTrademarkV2GetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * The page number of the result set.
	 */
	private Integer pageNo;
	
	/**
	 * Total number of trademarks.
	 */
	private Long totalNum;
	
	/**
	 * List of trademarks.
	 */
	private List<TrademarkInfo> trademarkList;
		
	public TemuLocalGoodsBrandTrademarkV2GetResponse() {
		this.trademarkList = new ArrayList<>();
	}
	
	/**
	 * @return the page number of the result set
	 */
	public Integer getPageNo() {
		return pageNo;
	}
	
	/**
	 * @param pageNo the page number of the result set
	 * @return this response object for method chaining
	 */
	public TemuLocalGoodsBrandTrademarkV2GetResponse setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		return this;
	}
	
	/**
	 * @return the total number of trademarks
	 */
	public Long getTotalNum() {
		return totalNum;
	}
	
	/**
	 * @param totalNum the total number of trademarks
	 * @return this response object for method chaining
	 */
	public TemuLocalGoodsBrandTrademarkV2GetResponse setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
		return this;
	}
	
	/**
	 * @return the list of trademarks
	 */
	public List<TrademarkInfo> getTrademarkList() {
		return trademarkList;
	}
	
	/**
	 * @param trademarkList the list of trademarks
	 * @return this response object for method chaining
	 */
	public TemuLocalGoodsBrandTrademarkV2GetResponse setTrademarkList(List<TrademarkInfo> trademarkList) {
		this.trademarkList = trademarkList;
		return this;
	}
	
	/**
	 * Inner class representing trademark information.
	 */
	public static class TrademarkInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * ID of the brand.
		 */
		private Long brandId;
		
		/**
		 * Name of the brand.
		 */
		private String brandName;
		
		/**
		 * ID of the trademark.
		 */
		private Long trademarkId;
		
		/**
		 * Name of the trademark.
		 */
		private String trademarkName;
			
		public TrademarkInfo() {
		}
		
		/**
		 * @return the ID of the brand
		 */
		public Long getBrandId() {
			return brandId;
		}
		
		/**
		 * @param brandId the ID of the brand
		 * @return this object for method chaining
		 */
		public TrademarkInfo setBrandId(Long brandId) {
			this.brandId = brandId;
			return this;
		}
		
		/**
		 * @return the name of the brand
		 */
		public String getBrandName() {
			return brandName;
		}
		
		/**
		 * @param brandName the name of the brand
		 * @return this object for method chaining
		 */
		public TrademarkInfo setBrandName(String brandName) {
			this.brandName = brandName;
			return this;
		}
		
		/**
		 * @return the ID of the trademark
		 */
		public Long getTrademarkId() {
			return trademarkId;
		}
		
		/**
		 * @param trademarkId the ID of the trademark
		 * @return this object for method chaining
		 */
		public TrademarkInfo setTrademarkId(Long trademarkId) {
			this.trademarkId = trademarkId;
			return this;
		}
		
		/**
		 * @return the name of the trademark
		 */
		public String getTrademarkName() {
			return trademarkName;
		}
		
		/**
		 * @param trademarkName the name of the trademark
		 * @return this object for method chaining
		 */
		public TrademarkInfo setTrademarkName(String trademarkName) {
			this.trademarkName = trademarkName;
			return this;
		}
	}
}