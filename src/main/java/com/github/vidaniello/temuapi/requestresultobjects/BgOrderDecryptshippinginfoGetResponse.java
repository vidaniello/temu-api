package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Response object for the API call 'bg.order.decryptshippinginfo.get'.
 * Contains sensitive shipping address information for a specific order.
 */
public class BgOrderDecryptshippinginfoGetResponse implements TemuResponseIf {

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
	 * Region Name 1.
	 */
	private String regionName1;
	
	/**
	 * Region Name 2.
	 */
	private String regionName2;
	
	/**
	 * Region Name 3.
	 */
	private String regionName3;
	
	/**
	 * Region Name 4.
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
	 * Post Code.
	 */
	private String postCode;
	
	/**
	 * Address Line All.
	 */
	private String addressLineAll;
	
	/**
	 * National Address.
	 */
	private String nationalAddress;
	
	/**
	 * Address Extra information.
	 */
	private AddressExtra addressExtra;
		
	public BgOrderDecryptshippinginfoGetResponse() {
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
	public BgOrderDecryptshippinginfoGetResponse setReceiptName(String receiptName) {
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
	public BgOrderDecryptshippinginfoGetResponse setReceiptAdditionalName(String receiptAdditionalName) {
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
	public BgOrderDecryptshippinginfoGetResponse setMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}
	
	/**
	 * @return the backup mobile phone number
	 */
	public String getBackupMobile() {
		return backupMobile;
	}
	
	/**
	 * @param backupMobile the backup mobile phone number
	 * @return this response object for method chaining
	 */
	public BgOrderDecryptshippinginfoGetResponse setBackupMobile(String backupMobile) {
		this.backupMobile = backupMobile;
		return this;
	}
	
	/**
	 * @return the virtual email
	 */
	public String getMail() {
		return mail;
	}
	
	/**
	 * @param mail the virtual email
	 * @return this response object for method chaining
	 */
	public BgOrderDecryptshippinginfoGetResponse setMail(String mail) {
		this.mail = mail;
		return this;
	}
	
	/**
	 * @return the region name 1
	 */
	public String getRegionName1() {
		return regionName1;
	}
	
	/**
	 * @param regionName1 the region name 1
	 * @return this response object for method chaining
	 */
	public BgOrderDecryptshippinginfoGetResponse setRegionName1(String regionName1) {
		this.regionName1 = regionName1;
		return this;
	}
	
	/**
	 * @return the region name 2
	 */
	public String getRegionName2() {
		return regionName2;
	}
	
	/**
	 * @param regionName2 the region name 2
	 * @return this response object for method chaining
	 */
	public BgOrderDecryptshippinginfoGetResponse setRegionName2(String regionName2) {
		this.regionName2 = regionName2;
		return this;
	}
	
	/**
	 * @return the region name 3
	 */
	public String getRegionName3() {
		return regionName3;
	}
	
	/**
	 * @param regionName3 the region name 3
	 * @return this response object for method chaining
	 */
	public BgOrderDecryptshippinginfoGetResponse setRegionName3(String regionName3) {
		this.regionName3 = regionName3;
		return this;
	}
	
	/**
	 * @return the region name 4
	 */
	public String getRegionName4() {
		return regionName4;
	}
	
	/**
	 * @param regionName4 the region name 4
	 * @return this response object for method chaining
	 */
	public BgOrderDecryptshippinginfoGetResponse setRegionName4(String regionName4) {
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
	public BgOrderDecryptshippinginfoGetResponse setAddressLine1(String addressLine1) {
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
	public BgOrderDecryptshippinginfoGetResponse setAddressLine2(String addressLine2) {
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
	public BgOrderDecryptshippinginfoGetResponse setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
		return this;
	}
	
	/**
	 * @return the post code
	 */
	public String getPostCode() {
		return postCode;
	}
	
	/**
	 * @param postCode the post code
	 * @return this response object for method chaining
	 */
	public BgOrderDecryptshippinginfoGetResponse setPostCode(String postCode) {
		this.postCode = postCode;
		return this;
	}
	
	/**
	 * @return the address line all
	 */
	public String getAddressLineAll() {
		return addressLineAll;
	}
	
	/**
	 * @param addressLineAll the address line all
	 * @return this response object for method chaining
	 */
	public BgOrderDecryptshippinginfoGetResponse setAddressLineAll(String addressLineAll) {
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
	public BgOrderDecryptshippinginfoGetResponse setNationalAddress(String nationalAddress) {
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
	public BgOrderDecryptshippinginfoGetResponse setAddressExtra(AddressExtra addressExtra) {
		this.addressExtra = addressExtra;
		return this;
	}
	
	/**
	 * Inner class representing additional address information.
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
}