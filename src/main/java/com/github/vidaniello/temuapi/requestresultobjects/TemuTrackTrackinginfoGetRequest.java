package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'temu.track.trackinginfo.get'.
 * Used to query logistics trajectory details.
 */
public class TemuTrackTrackinginfoGetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Package serial number.
	 */
	private String packageSn;
	
	/**
	 * Language for the response.
	 */
	private String language;
		
	public TemuTrackTrackinginfoGetRequest() {
	}
	
	/**
	 * @return the package serial number
	 */
	public String getPackageSn() {
		return packageSn;
	}
	
	/**
	 * @param packageSn the package serial number
	 * @return this request object for method chaining
	 */
	public TemuTrackTrackinginfoGetRequest setPackageSn(String packageSn) {
		this.packageSn = packageSn;
		return this;
	}
	
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	
	/**
	 * @param language the language
	 * @return this request object for method chaining
	 */
	public TemuTrackTrackinginfoGetRequest setLanguage(String language) {
		this.language = language;
		return this;
	}
}