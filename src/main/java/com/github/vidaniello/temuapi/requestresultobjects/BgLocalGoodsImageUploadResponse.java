package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Response object for the API call 'bg.local.goods.image.upload'.
 * Contains the URL of the uploaded file.
 */
public class BgLocalGoodsImageUploadResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * URL for file.
	 */
	private String url;
		
	public BgLocalGoodsImageUploadResponse() {
	}
	
	/**
	 * @return the URL for file
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * @param url the URL for file
	 * @return this response object for method chaining
	 */
	public BgLocalGoodsImageUploadResponse setUrl(String url) {
		this.url = url;
		return this;
	}
}