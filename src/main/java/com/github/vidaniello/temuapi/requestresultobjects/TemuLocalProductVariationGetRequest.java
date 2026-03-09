package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'temu.local.product.variation.get'.
 * Used to retrieve product variation information.
 */
public class TemuLocalProductVariationGetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Language.
	 */
	private String language;
	
	/**
	 * Leaf Node Category ID.
	 */
	private Long catId;
		
	public TemuLocalProductVariationGetRequest() {
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
	public TemuLocalProductVariationGetRequest setLanguage(String language) {
		this.language = language;
		return this;
	}
	
	/**
	 * @return the leaf Node Category ID
	 */
	public Long getCatId() {
		return catId;
	}
	
	/**
	 * @param catId the leaf Node Category ID
	 * @return this request object for method chaining
	 */
	public TemuLocalProductVariationGetRequest setCatId(Long catId) {
		this.catId = catId;
		return this;
	}
}