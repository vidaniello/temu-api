package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'bg.local.goods.cats.get'.
 * Used to retrieve goods categories.
 */
public class BgLocalGoodsCatsGetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Language for the category names.
	 */
	private String language;
	
	/**
	 * Parent Category ID: if not provided, all primary categories will be queried.
	 * This field is required.
	 */
	private Long parentCatId;
		
	public BgLocalGoodsCatsGetRequest() {
	}
	
	/**
	 * @return the language for category names
	 */
	public String getLanguage() {
		return language;
	}
	
	/**
	 * @param language the language for category names
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsCatsGetRequest setLanguage(String language) {
		this.language = language;
		return this;
	}
	
	/**
	 * @return the parent Category ID
	 */
	public Long getParentCatId() {
		return parentCatId;
	}
	
	/**
	 * @param parentCatId the parent Category ID
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsCatsGetRequest setParentCatId(Long parentCatId) {
		this.parentCatId = parentCatId;
		return this;
	}
}