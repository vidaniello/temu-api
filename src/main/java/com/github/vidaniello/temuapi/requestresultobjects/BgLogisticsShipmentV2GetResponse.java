package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'bg.logistics.shipment.v2.get'.
 * Contains shipping information result for self-fulfillment verification.
 */
public class BgLogisticsShipmentV2GetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Shipping Information Result.
	 */
	private List<ShipmentInfoDTO> shipmentInfoDTO;
		
	public BgLogisticsShipmentV2GetResponse() {
		this.shipmentInfoDTO = new ArrayList<>();
	}
	
	/**
	 * @return the shipping information list
	 */
	public List<ShipmentInfoDTO> getShipmentInfoDTO() {
		return shipmentInfoDTO;
	}
	
	/**
	 * @param shipmentInfoDTO the shipping information list
	 * @return this response object for method chaining
	 */
	public BgLogisticsShipmentV2GetResponse setShipmentInfoDTO(List<ShipmentInfoDTO> shipmentInfoDTO) {
		this.shipmentInfoDTO = shipmentInfoDTO;
		return this;
	}
	
	/**
	 * Inner class representing shipping information.
	 */
	public static class ShipmentInfoDTO implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Carrier ID, it's the same ID with the logisticsServiceProviderId 
		 * you got from "bg.logistics.companies.get".
		 */
		private Long carrierId;
		
		/**
		 * Carrier name, it's the same name with the logisticsServiceProviderId 
		 * you got from "bg.logistics.companies.get".
		 */
		private String carrierName;
		
		/**
		 * Tracking Number.
		 */
		private String trackingNumber;
		
		/**
		 * SKU ID.
		 */
		private Long skuId;
		
		/**
		 * Quantity of the product.
		 */
		private Integer quantity;
		
		/**
		 * Package number.
		 */
		private String packageSn;
		
		/**
		 * Package delivery type:
		 * 1 - Seller fulfills this order by non-integrated channel,
		 * 2 - Seller fulfills this order by Temu-integrated channel,
		 * 3 - Cooperative warehouse fulfills this order by non-integrated channel,
		 * 4 - Cooperative warehouse fulfills this order by Temu-integrated channel.
		 */
		private Integer packageDeliveryType;
		
		/**
		 * Tracking warning labels:
		 * 0 - No Issues,
		 * 1 - No Tracking Information,
		 * 2 - Potentially Incorrect,
		 * 4 - Inconsistent Shipping Address.
		 */
		private Integer trackingWarningLabel;
		
		/**
		 * Cooperative warehouse information.
		 * Only when this order is fulfilled by the cooperative warehouse, 
		 * this parameter may return DTO information.
		 * If this order is fulfilled by the seller, this parameter may return empty.
		 */
		private CooperativeWarehouseDTO cooperativeWarehouseDTO;
		
		/**
		 * Subsidiary package list.
		 */
		private List<SubPackageShipmentInfo> subPackageShipmentInfoList;
			
		public ShipmentInfoDTO() {
			this.subPackageShipmentInfoList = new ArrayList<>();
		}
		
		/**
		 * @return the carrier ID
		 */
		public Long getCarrierId() {
			return carrierId;
		}
		
		/**
		 * @param carrierId the carrier ID
		 * @return this object for method chaining
		 */
		public ShipmentInfoDTO setCarrierId(Long carrierId) {
			this.carrierId = carrierId;
			return this;
		}
		
		/**
		 * @return the carrier name
		 */
		public String getCarrierName() {
			return carrierName;
		}
		
		/**
		 * @param carrierName the carrier name
		 * @return this object for method chaining
		 */
		public ShipmentInfoDTO setCarrierName(String carrierName) {
			this.carrierName = carrierName;
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
		public ShipmentInfoDTO setTrackingNumber(String trackingNumber) {
			this.trackingNumber = trackingNumber;
			return this;
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
		public ShipmentInfoDTO setSkuId(Long skuId) {
			this.skuId = skuId;
			return this;
		}
		
		/**
		 * @return the quantity
		 */
		public Integer getQuantity() {
			return quantity;
		}
		
		/**
		 * @param quantity the quantity
		 * @return this object for method chaining
		 */
		public ShipmentInfoDTO setQuantity(Integer quantity) {
			this.quantity = quantity;
			return this;
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
		public ShipmentInfoDTO setPackageSn(String packageSn) {
			this.packageSn = packageSn;
			return this;
		}
		
		/**
		 * @return the package delivery type
		 */
		public Integer getPackageDeliveryType() {
			return packageDeliveryType;
		}
		
		/**
		 * @param packageDeliveryType the package delivery type
		 * @return this object for method chaining
		 */
		public ShipmentInfoDTO setPackageDeliveryType(Integer packageDeliveryType) {
			this.packageDeliveryType = packageDeliveryType;
			return this;
		}
		
		/**
		 * @return the tracking warning label
		 */
		public Integer getTrackingWarningLabel() {
			return trackingWarningLabel;
		}
		
		/**
		 * @param trackingWarningLabel the tracking warning label
		 * @return this object for method chaining
		 */
		public ShipmentInfoDTO setTrackingWarningLabel(Integer trackingWarningLabel) {
			this.trackingWarningLabel = trackingWarningLabel;
			return this;
		}
		
		/**
		 * @return the cooperative warehouse DTO
		 */
		public CooperativeWarehouseDTO getCooperativeWarehouseDTO() {
			return cooperativeWarehouseDTO;
		}
		
		/**
		 * @param cooperativeWarehouseDTO the cooperative warehouse DTO
		 * @return this object for method chaining
		 */
		public ShipmentInfoDTO setCooperativeWarehouseDTO(CooperativeWarehouseDTO cooperativeWarehouseDTO) {
			this.cooperativeWarehouseDTO = cooperativeWarehouseDTO;
			return this;
		}
		
		/**
		 * @return the sub-package shipment info list
		 */
		public List<SubPackageShipmentInfo> getSubPackageShipmentInfoList() {
			return subPackageShipmentInfoList;
		}
		
		/**
		 * @param subPackageShipmentInfoList the sub-package shipment info list
		 * @return this object for method chaining
		 */
		public ShipmentInfoDTO setSubPackageShipmentInfoList(List<SubPackageShipmentInfo> subPackageShipmentInfoList) {
			this.subPackageShipmentInfoList = subPackageShipmentInfoList;
			return this;
		}
	}
	
	/**
	 * Inner class representing cooperative warehouse information.
	 */
	public static class CooperativeWarehouseDTO implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Warehouse Provider Code.
		 */
		private String warehouseProviderCode;
		
		/**
		 * Warehouse Provider Brand Name.
		 */
		private String warehouseProviderBrandName;
		
		/**
		 * Warehouse Code.
		 */
		private String warehouseCode;
		
		/**
		 * Warehouse Name.
		 */
		private String warehouseName;
			
		public CooperativeWarehouseDTO() {
		}
		
		/**
		 * @return the warehouse provider code
		 */
		public String getWarehouseProviderCode() {
			return warehouseProviderCode;
		}
		
		/**
		 * @param warehouseProviderCode the warehouse provider code
		 * @return this object for method chaining
		 */
		public CooperativeWarehouseDTO setWarehouseProviderCode(String warehouseProviderCode) {
			this.warehouseProviderCode = warehouseProviderCode;
			return this;
		}
		
		/**
		 * @return the warehouse provider brand name
		 */
		public String getWarehouseProviderBrandName() {
			return warehouseProviderBrandName;
		}
		
		/**
		 * @param warehouseProviderBrandName the warehouse provider brand name
		 * @return this object for method chaining
		 */
		public CooperativeWarehouseDTO setWarehouseProviderBrandName(String warehouseProviderBrandName) {
			this.warehouseProviderBrandName = warehouseProviderBrandName;
			return this;
		}
		
		/**
		 * @return the warehouse code
		 */
		public String getWarehouseCode() {
			return warehouseCode;
		}
		
		/**
		 * @param warehouseCode the warehouse code
		 * @return this object for method chaining
		 */
		public CooperativeWarehouseDTO setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
			return this;
		}
		
		/**
		 * @return the warehouse name
		 */
		public String getWarehouseName() {
			return warehouseName;
		}
		
		/**
		 * @param warehouseName the warehouse name
		 * @return this object for method chaining
		 */
		public CooperativeWarehouseDTO setWarehouseName(String warehouseName) {
			this.warehouseName = warehouseName;
			return this;
		}
	}
	
	/**
	 * Inner class representing sub-package shipment information.
	 */
	public static class SubPackageShipmentInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Carrier ID, it's the same ID with the logisticsServiceProviderId 
		 * you got from "bg.logistics.companies.get".
		 */
		private Long carrierId;
		
		/**
		 * Carrier name, it's the same name with the logisticsServiceProviderId 
		 * you got from "bg.logistics.companies.get".
		 */
		private String carrierName;
		
		/**
		 * Package number.
		 */
		private String packageSn;
		
		/**
		 * Package delivery type:
		 * 1 - Seller fulfills this order by non-integrated channel,
		 * 2 - Seller fulfills this order by Temu-integrated channel,
		 * 3 - Cooperative warehouse fulfills this order by non-integrated channel,
		 * 4 - Cooperative warehouse fulfills this order by Temu-integrated channel.
		 */
		private Integer packageDeliveryType;
		
		/**
		 * Tracking Number.
		 */
		private String trackingNumber;
			
		public SubPackageShipmentInfo() {
		}
		
		/**
		 * @return the carrier ID
		 */
		public Long getCarrierId() {
			return carrierId;
		}
		
		/**
		 * @param carrierId the carrier ID
		 * @return this object for method chaining
		 */
		public SubPackageShipmentInfo setCarrierId(Long carrierId) {
			this.carrierId = carrierId;
			return this;
		}
		
		/**
		 * @return the carrier name
		 */
		public String getCarrierName() {
			return carrierName;
		}
		
		/**
		 * @param carrierName the carrier name
		 * @return this object for method chaining
		 */
		public SubPackageShipmentInfo setCarrierName(String carrierName) {
			this.carrierName = carrierName;
			return this;
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
		public SubPackageShipmentInfo setPackageSn(String packageSn) {
			this.packageSn = packageSn;
			return this;
		}
		
		/**
		 * @return the package delivery type
		 */
		public Integer getPackageDeliveryType() {
			return packageDeliveryType;
		}
		
		/**
		 * @param packageDeliveryType the package delivery type
		 * @return this object for method chaining
		 */
		public SubPackageShipmentInfo setPackageDeliveryType(Integer packageDeliveryType) {
			this.packageDeliveryType = packageDeliveryType;
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
		public SubPackageShipmentInfo setTrackingNumber(String trackingNumber) {
			this.trackingNumber = trackingNumber;
			return this;
		}
	}
}