package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'bg.local.goods.size.element.get'.
 * Used to retrieve size element information for goods.
 */
public class BgLocalGoodsSizeElementGetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Language for the response.
	 * Optional parameter.
	 */
	private String language;
	
	/**
	 * Leaf category ID.
	 * Required parameter to identify the category for size elements.
	 */
	private Long catId;
		
	public BgLocalGoodsSizeElementGetRequest() {
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
	public BgLocalGoodsSizeElementGetRequest setLanguage(String language) {
		this.language = language;
		return this;
	}
	
	/**
	 * @return the leaf category ID
	 */
	public Long getCatId() {
		return catId;
	}
	
	/**
	 * @param catId the leaf category ID
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsSizeElementGetRequest setCatId(Long catId) {
		this.catId = catId;
		return this;
	}
}