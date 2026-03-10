package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'bg.local.goods.tax.code.get'.
 * Used to retrieve tax code information for a specific category.
 */
public class BgLocalGoodsTaxCodeGetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Leaf Category ID.
	 */
	private Long catId;
		
	public BgLocalGoodsTaxCodeGetRequest() {
	
	}
	
	/**
	 * @return the leaf Category ID
	 */
	public Long getCatId() {
		return catId;
	}
	
	/**
	 * @param catId the leaf Category ID
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsTaxCodeGetRequest setCatId(Long catId) {
		this.catId = catId;
		return this;
	}
}