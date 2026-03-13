package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'temu.local.order.verification.upload'.
 * Used to upload serial numbers (SN) / International Mobile Equipment Identity (IMEI) 
 * of high-value goods, or authentication information for second-hand goods.
 */
public class TemuLocalOrderVerificationUploadRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Order unique info list.
	 */
	private List<OrderInfo> orderList;
		
	public TemuLocalOrderVerificationUploadRequest() {
		this.orderList = new ArrayList<>();
	}
	
	/**
	 * @return the order unique info list
	 */
	public List<OrderInfo> getOrderList() {
		return orderList;
	}
	
	/**
	 * @param orderList the order unique info list
	 * @return this request object for method chaining
	 */
	public TemuLocalOrderVerificationUploadRequest setOrderList(List<OrderInfo> orderList) {
		this.orderList = orderList;
		return this;
	}
	
	/**
	 * Inner class representing order unique info.
	 */
	public static class OrderInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Order sn.
		 */
		private String orderSn;
		
		/**
		 * Electronic ams open unique info list.
		 */
		private List<VerificationInfo> verificationInfo;
		
		/**
		 * Second hand ams open verification info.
		 */
		private List<SecondHandVerificationInfo> secondHandVerificationInfo;
			
		public OrderInfo() {
			this.verificationInfo = new ArrayList<>();
			this.secondHandVerificationInfo = new ArrayList<>();
		}
		
		/**
		 * @return the order sn
		 */
		public String getOrderSn() {
			return orderSn;
		}
		
		/**
		 * @param orderSn the order sn
		 * @return this object for method chaining
		 */
		public OrderInfo setOrderSn(String orderSn) {
			this.orderSn = orderSn;
			return this;
		}
		
		/**
		 * @return the electronic ams open unique info list
		 */
		public List<VerificationInfo> getVerificationInfo() {
			return verificationInfo;
		}
		
		/**
		 * @param verificationInfo the electronic ams open unique info list
		 * @return this object for method chaining
		 */
		public OrderInfo setVerificationInfo(List<VerificationInfo> verificationInfo) {
			this.verificationInfo = verificationInfo;
			return this;
		}
		
		/**
		 * @return the second hand ams open verification info
		 */
		public List<SecondHandVerificationInfo> getSecondHandVerificationInfo() {
			return secondHandVerificationInfo;
		}
		
		/**
		 * @param secondHandVerificationInfo the second hand ams open verification info
		 * @return this object for method chaining
		 */
		public OrderInfo setSecondHandVerificationInfo(List<SecondHandVerificationInfo> secondHandVerificationInfo) {
			this.secondHandVerificationInfo = secondHandVerificationInfo;
			return this;
		}
	}
	
	/**
	 * Inner class representing electronic ams open unique info.
	 */
	public static class VerificationInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Serial number.
		 */
		private String serialNumber;
		
		/**
		 * Imei number list.
		 */
		private List<String> imeiNumberList;
			
		public VerificationInfo() {
			this.imeiNumberList = new ArrayList<>();
		}
		
		/**
		 * @return the serial number
		 */
		public String getSerialNumber() {
			return serialNumber;
		}
		
		/**
		 * @param serialNumber the serial number
		 * @return this object for method chaining
		 */
		public VerificationInfo setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
			return this;
		}
		
		/**
		 * @return the imei number list
		 */
		public List<String> getImeiNumberList() {
			return imeiNumberList;
		}
		
		/**
		 * @param imeiNumberList the imei number list
		 * @return this object for method chaining
		 */
		public VerificationInfo setImeiNumberList(List<String> imeiNumberList) {
			this.imeiNumberList = imeiNumberList;
			return this;
		}
	}
	
	/**
	 * Inner class representing second hand ams open verification info.
	 */
	public static class SecondHandVerificationInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Second hand proof certificate code.
		 */
		private String secondHandProofCertificateCode;
			
		public SecondHandVerificationInfo() {
		}
		
		/**
		 * @return the second hand proof certificate code
		 */
		public String getSecondHandProofCertificateCode() {
			return secondHandProofCertificateCode;
		}
		
		/**
		 * @param secondHandProofCertificateCode the second hand proof certificate code
		 * @return this object for method chaining
		 */
		public SecondHandVerificationInfo setSecondHandProofCertificateCode(String secondHandProofCertificateCode) {
			this.secondHandProofCertificateCode = secondHandProofCertificateCode;
			return this;
		}
	}
}