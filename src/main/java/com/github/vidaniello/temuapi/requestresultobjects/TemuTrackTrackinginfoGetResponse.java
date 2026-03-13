package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'temu.track.trackinginfo.get'.
 * Contains the logistics trajectory details.
 */
public class TemuTrackTrackinginfoGetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Package serial number.
	 */
	private String packageSn;
	
	/**
	 * Tracking number. Returns only the last-mile tracking number 
	 * if the parcel is transported in multiple segments.
	 */
	private String trackingNum;
	
	/**
	 * The tracking info of the package.
	 */
	private List<TrackingInfo> trackingInfo;
		
	public TemuTrackTrackinginfoGetResponse() {
		this.trackingInfo = new ArrayList<>();
	}
	
	/**
	 * @return the package serial number
	 */
	public String getPackageSn() {
		return packageSn;
	}
	
	/**
	 * @param packageSn the package serial number
	 * @return this response object for method chaining
	 */
	public TemuTrackTrackinginfoGetResponse setPackageSn(String packageSn) {
		this.packageSn = packageSn;
		return this;
	}
	
	/**
	 * @return the tracking number
	 */
	public String getTrackingNum() {
		return trackingNum;
	}
	
	/**
	 * @param trackingNum the tracking number
	 * @return this response object for method chaining
	 */
	public TemuTrackTrackinginfoGetResponse setTrackingNum(String trackingNum) {
		this.trackingNum = trackingNum;
		return this;
	}
	
	/**
	 * @return the tracking info list
	 */
	public List<TrackingInfo> getTrackingInfo() {
		return trackingInfo;
	}
	
	/**
	 * @param trackingInfo the tracking info list
	 * @return this response object for method chaining
	 */
	public TemuTrackTrackinginfoGetResponse setTrackingInfo(List<TrackingInfo> trackingInfo) {
		this.trackingInfo = trackingInfo;
		return this;
	}
	
	/**
	 * Inner class representing tracking information.
	 */
	public static class TrackingInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Core logistics node status: defaults to English 
		 * if the requested language is not supported.
		 */
		private String logisticsStatus;
		
		/**
		 * The time when the tracking information was last updated, 
		 * in seconds (timestamp).
		 */
		private String logisticsUpdatedAt;
		
		/**
		 * Core logistics node description: defaults to the carrier's language 
		 * if the requested language is not supported.
		 */
		private String statusText;
			
		public TrackingInfo() {
		}
		
		/**
		 * @return the logistics status
		 */
		public String getLogisticsStatus() {
			return logisticsStatus;
		}
		
		/**
		 * @param logisticsStatus the logistics status
		 * @return this object for method chaining
		 */
		public TrackingInfo setLogisticsStatus(String logisticsStatus) {
			this.logisticsStatus = logisticsStatus;
			return this;
		}
		
		/**
		 * @return the logistics updated at timestamp
		 */
		public String getLogisticsUpdatedAt() {
			return logisticsUpdatedAt;
		}
		
		/**
		 * @param logisticsUpdatedAt the logistics updated at timestamp
		 * @return this object for method chaining
		 */
		public TrackingInfo setLogisticsUpdatedAt(String logisticsUpdatedAt) {
			this.logisticsUpdatedAt = logisticsUpdatedAt;
			return this;
		}
		
		/**
		 * @return the status text
		 */
		public String getStatusText() {
			return statusText;
		}
		
		/**
		 * @param statusText the status text
		 * @return this object for method chaining
		 */
		public TrackingInfo setStatusText(String statusText) {
			this.statusText = statusText;
			return this;
		}
	}
}