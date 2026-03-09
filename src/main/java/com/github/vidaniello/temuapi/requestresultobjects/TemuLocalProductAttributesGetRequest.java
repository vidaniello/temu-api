package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'temu.local.product.attributes.get'.
 * Used to retrieve product attributes for a specific category.
 */
public class TemuLocalProductAttributesGetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Language.
	 */
	private String language;
	
	/**
	 * Leaf Node Category ID.
	 * Required field.
	 */
	private Long catId;
	
	/**
	 * Some attributes will become mandatory fields when selling across borders.
	 * At this point, input costTemplateId, obtained from the bg.freight.template.list.query.
	 */
	private String costTemplateId;
		
	public TemuLocalProductAttributesGetRequest() {
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
	public TemuLocalProductAttributesGetRequest setLanguage(String language) {
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
	public TemuLocalProductAttributesGetRequest setCatId(Long catId) {
		this.catId = catId;
		return this;
	}
	
	/**
	 * @return the cost template ID
	 */
	public String getCostTemplateId() {
		return costTemplateId;
	}
	
	/**
	 * @param costTemplateId the cost template ID
	 * @return this request object for method chaining
	 */
	public TemuLocalProductAttributesGetRequest setCostTemplateId(String costTemplateId) {
		this.costTemplateId = costTemplateId;
		return this;
	}
}