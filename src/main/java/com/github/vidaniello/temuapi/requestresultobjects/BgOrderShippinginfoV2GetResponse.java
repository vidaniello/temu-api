package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Response object for the API call 'bg.order.shippinginfo.v2.get'.
 * Contains the shipping information for an order.
 */
public class BgOrderShippinginfoV2GetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Name.
	 */
	private String receiptName;
	
	/**
	 * Additional Name.
	 */
	private String receiptAdditionalName;
	
	/**
	 * Phone Number.
	 */
	private String mobile;
	
	/**
	 * Alternate Phone.
	 */
	private String backupMobile;
	
	/**
	 * Virtual Email.
	 */
	private String mail;
	
	/**
	 * First-Level Administrative Division Name.
	 */
	private String regionName1;
	
	/**
	 * Secondary Administrative Division Name.
	 */
	private String regionName2;
	
	/**
	 * Third-Level Administrative Division Name.
	 */
	private String regionName3;
	
	/**
	 * Fourth-Level Administrative Division Name.
	 */
	private String regionName4;
	
	/**
	 * Address Line 1.
	 */
	private String addressLine1;
	
	/**
	 * Address Line 2.
	 */
	private String addressLine2;
	
	/**
	 * Address Line 3.
	 */
	private String addressLine3;
	
	/**
	 * Postal Code.
	 */
	private String postCode;
	
	/**
	 * Address Line 1 + Line 2 + Line 3.
	 */
	private String addressLineAll;
	
	/**
	 * National Address.
	 */
	private String nationalAddress;
	
	/**
	 * Address extra information.
	 */
	private AddressExtra addressExtra;
	
	/**
	 * Warning information.
	 */
	private Warning warning;
		
	public BgOrderShippinginfoV2GetResponse() {
	}
	
	/**
	 * @return the receipt name
	 */
	public String getReceiptName() {
		return receiptName;
	}
	
	/**
	 * @param receiptName the receipt name
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setReceiptName(String receiptName) {
		this.receiptName = receiptName;
		return this;
	}
	
	/**
	 * @return the receipt additional name
	 */
	public String getReceiptAdditionalName() {
		return receiptAdditionalName;
	}
	
	/**
	 * @param receiptAdditionalName the receipt additional name
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setReceiptAdditionalName(String receiptAdditionalName) {
		this.receiptAdditionalName = receiptAdditionalName;
		return this;
	}
	
	/**
	 * @return the mobile phone number
	 */
	public String getMobile() {
		return mobile;
	}
	
	/**
	 * @param mobile the mobile phone number
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}
	
	/**
	 * @return the backup mobile number
	 */
	public String getBackupMobile() {
		return backupMobile;
	}
	
	/**
	 * @param backupMobile the backup mobile number
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setBackupMobile(String backupMobile) {
		this.backupMobile = backupMobile;
		return this;
	}
	
	/**
	 * @return the email
	 */
	public String getMail() {
		return mail;
	}
	
	/**
	 * @param mail the email
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setMail(String mail) {
		this.mail = mail;
		return this;
	}
	
	/**
	 * @return the first-level administrative division name
	 */
	public String getRegionName1() {
		return regionName1;
	}
	
	/**
	 * @param regionName1 the first-level administrative division name
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setRegionName1(String regionName1) {
		this.regionName1 = regionName1;
		return this;
	}
	
	/**
	 * @return the secondary administrative division name
	 */
	public String getRegionName2() {
		return regionName2;
	}
	
	/**
	 * @param regionName2 the secondary administrative division name
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setRegionName2(String regionName2) {
		this.regionName2 = regionName2;
		return this;
	}
	
	/**
	 * @return the third-level administrative division name
	 */
	public String getRegionName3() {
		return regionName3;
	}
	
	/**
	 * @param regionName3 the third-level administrative division name
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setRegionName3(String regionName3) {
		this.regionName3 = regionName3;
		return this;
	}
	
	/**
	 * @return the fourth-level administrative division name
	 */
	public String getRegionName4() {
		return regionName4;
	}
	
	/**
	 * @param regionName4 the fourth-level administrative division name
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setRegionName4(String regionName4) {
		this.regionName4 = regionName4;
		return this;
	}
	
	/**
	 * @return the address line 1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	
	/**
	 * @param addressLine1 the address line 1
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
		return this;
	}
	
	/**
	 * @return the address line 2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	
	/**
	 * @param addressLine2 the address line 2
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
		return this;
	}
	
	/**
	 * @return the address line 3
	 */
	public String getAddressLine3() {
		return addressLine3;
	}
	
	/**
	 * @param addressLine3 the address line 3
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
		return this;
	}
	
	/**
	 * @return the postal code
	 */
	public String getPostCode() {
		return postCode;
	}
	
	/**
	 * @param postCode the postal code
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setPostCode(String postCode) {
		this.postCode = postCode;
		return this;
	}
	
	/**
	 * @return the full address line
	 */
	public String getAddressLineAll() {
		return addressLineAll;
	}
	
	/**
	 * @param addressLineAll the full address line
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setAddressLineAll(String addressLineAll) {
		this.addressLineAll = addressLineAll;
		return this;
	}
	
	/**
	 * @return the national address
	 */
	public String getNationalAddress() {
		return nationalAddress;
	}
	
	/**
	 * @param nationalAddress the national address
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setNationalAddress(String nationalAddress) {
		this.nationalAddress = nationalAddress;
		return this;
	}
	
	/**
	 * @return the address extra information
	 */
	public AddressExtra getAddressExtra() {
		return addressExtra;
	}
	
	/**
	 * @param addressExtra the address extra information
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setAddressExtra(AddressExtra addressExtra) {
		this.addressExtra = addressExtra;
		return this;
	}
	
	/**
	 * @return the warning information
	 */
	public Warning getWarning() {
		return warning;
	}
	
	/**
	 * @param warning the warning information
	 * @return this response object for method chaining
	 */
	public BgOrderShippinginfoV2GetResponse setWarning(Warning warning) {
		this.warning = warning;
		return this;
	}
	
	/**
	 * Inner class representing address extra information.
	 */
	public static class AddressExtra implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * First Name.
		 */
		private String firstName;
		
		/**
		 * Last Name.
		 */
		private String lastName;
		
		/**
		 * Additional First Name.
		 */
		private String additionalFirstName;
		
		/**
		 * Additional Last Name.
		 */
		private String additionalLastName;
			
		public AddressExtra() {
		}
		
		/**
		 * @return the first name
		 */
		public String getFirstName() {
			return firstName;
		}
		
		/**
		 * @param firstName the first name
		 * @return this object for method chaining
		 */
		public AddressExtra setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		/**
		 * @return the last name
		 */
		public String getLastName() {
			return lastName;
		}
		
		/**
		 * @param lastName the last name
		 * @return this object for method chaining
		 */
		public AddressExtra setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		/**
		 * @return the additional first name
		 */
		public String getAdditionalFirstName() {
			return additionalFirstName;
		}
		
		/**
		 * @param additionalFirstName the additional first name
		 * @return this object for method chaining
		 */
		public AddressExtra setAdditionalFirstName(String additionalFirstName) {
			this.additionalFirstName = additionalFirstName;
			return this;
		}
		
		/**
		 * @return the additional last name
		 */
		public String getAdditionalLastName() {
			return additionalLastName;
		}
		
		/**
		 * @param additionalLastName the additional last name
		 * @return this object for method chaining
		 */
		public AddressExtra setAdditionalLastName(String additionalLastName) {
			this.additionalLastName = additionalLastName;
			return this;
		}
	}
	
	/**
	 * Inner class representing warning information.
	 */
	public static class Warning implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Is Restriction.
		 */
		private Boolean isRestriction;
		
		/**
		 * Restriction reason.
		 * When there is an address return restriction, it indicates the restriction scenario, 
		 * which may be enumerated as follows: 
		 * 1-COD, 
		 * 2-Restricting self shipment, 
		 * 3-promise only buy shipping, 
		 * 5-Store delivery orders.
		 */
		private Integer reason;
			
		public Warning() {
		}
		
		/**
		 * @return true if restriction, false otherwise
		 */
		public Boolean getIsRestriction() {
			return isRestriction;
		}
		
		/**
		 * @param isRestriction whether there is a restriction
		 * @return this object for method chaining
		 */
		public Warning setIsRestriction(Boolean isRestriction) {
			this.isRestriction = isRestriction;
			return this;
		}
		
		/**
		 * @return the restriction reason
		 */
		public Integer getReason() {
			return reason;
		}
		
		/**
		 * @param reason the restriction reason
		 * @return this object for method chaining
		 */
		public Warning setReason(Integer reason) {
			this.reason = reason;
			return this;
		}
	}
}