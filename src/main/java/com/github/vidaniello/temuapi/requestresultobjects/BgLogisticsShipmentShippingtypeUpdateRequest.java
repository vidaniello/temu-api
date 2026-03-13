package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'bg.logistics.shipment.shippingtype.update'.
 * Used by sellers to update logistics tracking numbers.
 */
public class BgLogisticsShipmentShippingtypeUpdateRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Edit package request list.
	 */
	private List<EditPackageRequest> editPackageRequestList;
		
	public BgLogisticsShipmentShippingtypeUpdateRequest() {
		this.editPackageRequestList = new ArrayList<>();
	}
	
	/**
	 * @return the edit package request list
	 */
	public List<EditPackageRequest> getEditPackageRequestList() {
		return editPackageRequestList;
	}
	
	/**
	 * @param editPackageRequestList the edit package request list
	 * @return this request object for method chaining
	 */
	public BgLogisticsShipmentShippingtypeUpdateRequest setEditPackageRequestList(List<EditPackageRequest> editPackageRequestList) {
		this.editPackageRequestList = editPackageRequestList;
		return this;
	}
	
	/**
	 * Inner class representing a single package edit request.
	 */
	public static class EditPackageRequest implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Package number.
		 */
		private String packageSn;
		
		/**
		 * Tracking number.
		 */
		private String trackingNumber;
		
		/**
		 * Logistics service provider ID.
		 * It's the same ID with the logisticsServiceProviderId you got from "bg.logistics.companies.get".
		 */
		private Long shipCompanyId;
		
		/**
		 * Shipment warehouse ID.
		 * Can be obtained from the bg.logistics.warehouse.list.get interface.
		 */
		private String selfShippingWarehouseId;
			
		public EditPackageRequest() {
		}
		
		/**
		 * @return the package number
		 */
		public String getPackageSn() {
			return packageSn;
		}
		
		/**
		 * @param packageSn the package number
		 * @return this object for method chaining
		 */
		public EditPackageRequest setPackageSn(String packageSn) {
			this.packageSn = packageSn;
			return this;
		}
		
		/**
		 * @return the tracking number
		 */
		public String getTrackingNumber() {
			return trackingNumber;
		}
		
		/**
		 * @param trackingNumber the tracking number
		 * @return this object for method chaining
		 */
		public EditPackageRequest setTrackingNumber(String trackingNumber) {
			this.trackingNumber = trackingNumber;
			return this;
		}
		
		/**
		 * @return the logistics service provider ID
		 */
		public Long getShipCompanyId() {
			return shipCompanyId;
		}
		
		/**
		 * @param shipCompanyId the logistics service provider ID
		 * @return this object for method chaining
		 */
		public EditPackageRequest setShipCompanyId(Long shipCompanyId) {
			this.shipCompanyId = shipCompanyId;
			return this;
		}
		
		/**
		 * @return the shipment warehouse ID
		 */
		public String getSelfShippingWarehouseId() {
			return selfShippingWarehouseId;
		}
		
		/**
		 * @param selfShippingWarehouseId the shipment warehouse ID
		 * @return this object for method chaining
		 */
		public EditPackageRequest setSelfShippingWarehouseId(String selfShippingWarehouseId) {
			this.selfShippingWarehouseId = selfShippingWarehouseId;
			return this;
		}
	}
}