package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'temu.local.goods.delete'.
 * Used to delete goods from the system.
 */
public class TemuLocalGoodsDeleteRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * The ID of the goods to delete.
	 * Required parameter for the delete operation.
	 */
	private Long goodsId;
		
	public TemuLocalGoodsDeleteRequest() {
	}
	
	/**
	 * @return the goods ID
	 */
	public Long getGoodsId() {
		return goodsId;
	}
	
	/**
	 * @param goodsId the goods ID to delete
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsDeleteRequest setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
		return this;
	}
}