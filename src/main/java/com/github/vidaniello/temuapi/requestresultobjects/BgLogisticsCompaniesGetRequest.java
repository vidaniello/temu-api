package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'bg.logistics.companies.get'.
 * Used to obtain full logistics providers that support shipping at the corresponding region.<br>
 * Full encoding can be obtained through the following link:
 * <a href="https://partner.temu.com/documentation?menu_code=38e79b35d2cb463d85619c1c786dd303&sub_menu_code=97bf9f5f4f454a589fb3192725bfeb7a">qui</a>
 */
public class BgLogisticsCompaniesGetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Region ID.
	 * Full encoding can be obtained through the documentation.
	 * This field is required.
	 */
	private Long regionId;
		
	public BgLogisticsCompaniesGetRequest() {
	}
	
	/**
	 * @return the region ID
	 */
	public Long getRegionId() {
		return regionId;
	}
	
	/**
	 * @param regionId the region ID
	 * @return this request object for method chaining
	 */
	public BgLogisticsCompaniesGetRequest setRegionId(Long regionId) {
		this.regionId = regionId;
		return this;
	}
}