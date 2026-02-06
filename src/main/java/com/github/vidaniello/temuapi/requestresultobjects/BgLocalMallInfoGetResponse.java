package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'bg.local.mall.info.get'.
 * Contains mall information including associated mall details.
 */
public class BgLocalMallInfoGetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Temu's unique identifier for a mall.
	 */
	private Long mallId;
	
	/**
	 * Marketplace ID of Mall.
	 */
	private Long siteId;
	
	/**
	 * Associated Mall Information.
	 */
	private List<BranchesMallInfo> branchesMallInfo;
		
	public BgLocalMallInfoGetResponse() {
		this.branchesMallInfo = new ArrayList<>();
	}
	
	/**
	 * @return Temu's unique identifier for a mall
	 */
	public Long getMallId() {
		return mallId;
	}
	
	/**
	 * @param mallId Temu's unique identifier for a mall
	 * @return this response object for method chaining
	 */
	public BgLocalMallInfoGetResponse setMallId(Long mallId) {
		this.mallId = mallId;
		return this;
	}
	
	/**
	 * @return the marketplace ID of Mall
	 */
	public Long getSiteId() {
		return siteId;
	}
	
	/**
	 * @param siteId the marketplace ID of Mall
	 * @return this response object for method chaining
	 */
	public BgLocalMallInfoGetResponse setSiteId(Long siteId) {
		this.siteId = siteId;
		return this;
	}
	
	/**
	 * @return the list of associated mall information
	 */
	public List<BranchesMallInfo> getBranchesMallInfo() {
		return branchesMallInfo;
	}
	
	/**
	 * @param branchesMallInfo the list of associated mall information
	 * @return this response object for method chaining
	 */
	public BgLocalMallInfoGetResponse setBranchesMallInfo(List<BranchesMallInfo> branchesMallInfo) {
		this.branchesMallInfo = branchesMallInfo;
		return this;
	}
	
	/**
	 * Inner class representing associated mall information.
	 */
	public static class BranchesMallInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Associated Mall ID (returned regardless of whether the mall is open or not).
		 */
		private Long branchesMallId;
		
		/**
		 * Associated Marketplace ID of Mall.
		 */
		private Long branchesMallSiteId;
			
		public BranchesMallInfo() {
		}
		
		/**
		 * @return the associated Mall ID
		 */
		public Long getBranchesMallId() {
			return branchesMallId;
		}
		
		/**
		 * @param branchesMallId the associated Mall ID
		 * @return this object for method chaining
		 */
		public BranchesMallInfo setBranchesMallId(Long branchesMallId) {
			this.branchesMallId = branchesMallId;
			return this;
		}
		
		/**
		 * @return the associated Marketplace ID of Mall
		 */
		public Long getBranchesMallSiteId() {
			return branchesMallSiteId;
		}
		
		/**
		 * @param branchesMallSiteId the associated Marketplace ID of Mall
		 * @return this object for method chaining
		 */
		public BranchesMallInfo setBranchesMallSiteId(Long branchesMallSiteId) {
			this.branchesMallSiteId = branchesMallSiteId;
			return this;
		}
	}
}