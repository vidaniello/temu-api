package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'temu.local.goods.illegal.vocabulary.check'.
 * Used to check goods content for illegal vocabulary.
 */
public class TemuLocalGoodsIllegalVocabularyCheckRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Goods name content to check.
	 * Optional parameter.
	 */
	private String goodsName;
	
	/**
	 * Goods description content to check.
	 * Optional parameter.
	 */
	private String goodsDesc;
	
	/**
	 * Bullet points content to check.
	 * Optional parameter.
	 */
	private List<String> bulletPoints;
		
	public TemuLocalGoodsIllegalVocabularyCheckRequest() {
		this.bulletPoints = new ArrayList<>();
	}
	
	/**
	 * @return the goods name content
	 */
	public String getGoodsName() {
		return goodsName;
	}
	
	/**
	 * @param goodsName the goods name content
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsIllegalVocabularyCheckRequest setGoodsName(String goodsName) {
		this.goodsName = goodsName;
		return this;
	}
	
	/**
	 * @return the goods description content
	 */
	public String getGoodsDesc() {
		return goodsDesc;
	}
	
	/**
	 * @param goodsDesc the goods description content
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsIllegalVocabularyCheckRequest setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
		return this;
	}
	
	/**
	 * @return the bullet points content
	 */
	public List<String> getBulletPoints() {
		return bulletPoints;
	}
	
	/**
	 * @param bulletPoints the bullet points content
	 * @return this request object for method chaining
	 */
	public TemuLocalGoodsIllegalVocabularyCheckRequest setBulletPoints(List<String> bulletPoints) {
		this.bulletPoints = bulletPoints;
		return this;
	}
}