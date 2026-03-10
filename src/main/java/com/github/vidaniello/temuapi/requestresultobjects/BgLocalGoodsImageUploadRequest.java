package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Request object for the API call 'bg.local.goods.image.upload'.
 * Used to upload and process product images with optional scaling, compression, and format conversion.
 */
public class BgLocalGoodsImageUploadRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Scaling Target:
	 * 0 - Original size
	 * 1 - 800*800 (1:1)
	 * 2 - 1350*1800 (3:4)
	 */
	private Integer scalingType;
	
	/**
	 * URL for file.
	 */
	private String fileUrl;
	
	/**
	 * Compression:
	 * 0 - false (no compression)
	 * 1 - true (enable compression)
	 */
	private Integer compressionType;
	
	/**
	 * Format conversion:
	 * 0 - jpg
	 * 1 - jpeg
	 * 2 - png
	 * Note: While compressionType=1 and formatConversionType=0 or 1, 
	 * the image compression will be completed.
	 */
	private Integer formatConversionType;
		
	public BgLocalGoodsImageUploadRequest() {
	}
	
	/**
	 * @return the scaling target type
	 */
	public Integer getScalingType() {
		return scalingType;
	}
	
	/**
	 * @param scalingType the scaling target type
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsImageUploadRequest setScalingType(Integer scalingType) {
		this.scalingType = scalingType;
		return this;
	}
	
	/**
	 * @return the URL for file
	 */
	public String getFileUrl() {
		return fileUrl;
	}
	
	/**
	 * @param fileUrl the URL for file
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsImageUploadRequest setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
		return this;
	}
	
	/**
	 * @return the compression type
	 */
	public Integer getCompressionType() {
		return compressionType;
	}
	
	/**
	 * @param compressionType the compression type
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsImageUploadRequest setCompressionType(Integer compressionType) {
		this.compressionType = compressionType;
		return this;
	}
	
	/**
	 * @return the format conversion type
	 */
	public Integer getFormatConversionType() {
		return formatConversionType;
	}
	
	/**
	 * @param formatConversionType the format conversion type
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsImageUploadRequest setFormatConversionType(Integer formatConversionType) {
		this.formatConversionType = formatConversionType;
		return this;
	}
}