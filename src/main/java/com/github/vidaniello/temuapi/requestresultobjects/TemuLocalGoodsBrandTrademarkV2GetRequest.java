package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'temu.local.goods.brand.trademark.V2.get'.
 * Used to retrieve brand trademark information with pagination support.
 */
public class TemuLocalGoodsBrandTrademarkV2GetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Page number, used for pagination.
	 * Required field.
	 */
	private Integer page;
	
	/**
	 * Page size, indicating the number of records returned per page.
	 * Maximum limit of 100 records per page.
	 * Required field.
	 */
	private Integer size;
		
	public TemuLocalGoodsBrandTrademarkV2GetRequest() {
	}
	
	/**
	 * @return the page number for pagination
	 */
	public Integer getPage() {
		return page;
	}
	
	/**
	 * @param page the page number for pagination
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsBrandTrademarkV2GetRequest setPage(Integer page) {
		this.page = page;
		return this;
	}
	
	/**
	 * @return the page size (number of records per page)
	 */
	public Integer getSize() {
		return size;
	}
	
	/**
	 * @param size the page size (number of records per page, max 100)
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsBrandTrademarkV2GetRequest setSize(Integer size) {
		this.size = size;
		return this;
	}
}