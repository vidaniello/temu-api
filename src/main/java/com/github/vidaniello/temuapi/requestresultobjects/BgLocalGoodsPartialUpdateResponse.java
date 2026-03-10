package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.List;

/**
 * POJO representing the response object for 'bg.local.goods.partial.update' API call.
 * This class contains the updated product information after a partial update operation.
 */
public class BgLocalGoodsPartialUpdateResponse implements TemuResponseIf {

    private static final long serialVersionUID = 1L;

    /**
     * Product ID
     */
    private Long goodsId;

    /**
     * Product type. It is used to describe the type of a product, a product can only belong to one type.
     * The possible enumerated values are:
     * 1: Normal product
     * 2: Custom product
     * 3: Made-to-order product
     */
    private Integer productType;

    /**
     * SKU information list
     */
    private List<SkuInfoResponse> skuInfoList;

    public BgLocalGoodsPartialUpdateResponse() {
    }

    /**
     * @return the goods ID
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * @param goodsId the goods ID to set
     * @return this response object for method chaining
     */
    public BgLocalGoodsPartialUpdateResponse setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    /**
     * @return the product type (1: Normal product, 2: Custom product, 3: Made-to-order product)
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * @param productType the product type to set
     * @return this response object for method chaining
     */
    public BgLocalGoodsPartialUpdateResponse setProductType(Integer productType) {
        this.productType = productType;
        return this;
    }

    /**
     * @return the SKU information list
     */
    public List<SkuInfoResponse> getSkuInfoList() {
        return skuInfoList;
    }

    /**
     * @param skuInfoList the SKU information list to set
     * @return this response object for method chaining
     */
    public BgLocalGoodsPartialUpdateResponse setSkuInfoList(List<SkuInfoResponse> skuInfoList) {
        this.skuInfoList = skuInfoList;
        return this;
    }

    // ==================== INNER CLASSES ====================

    /**
     * SKU information in the response
     */
    public static class SkuInfoResponse {

        private static final long serialVersionUID = 1L;

        /**
         * SKU ID
         */
        private Long skuId;

        /**
         * External SKU code
         */
        private String outSkuSn;

        /**
         * Specification information list
         */
        private List<SpecificationInfo> specList;

        public SkuInfoResponse() {
        }

        /**
         * @return the SKU ID
         */
        public Long getSkuId() {
            return skuId;
        }

        /**
         * @param skuId the SKU ID to set
         * @return this object for method chaining
         */
        public SkuInfoResponse setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }

        /**
         * @return the external SKU code
         */
        public String getOutSkuSn() {
            return outSkuSn;
        }

        /**
         * @param outSkuSn the external SKU code to set
         * @return this object for method chaining
         */
        public SkuInfoResponse setOutSkuSn(String outSkuSn) {
            this.outSkuSn = outSkuSn;
            return this;
        }

        /**
         * @return the specification list
         */
        public List<SpecificationInfo> getSpecList() {
            return specList;
        }

        /**
         * @param specList the specification list to set
         * @return this object for method chaining
         */
        public SkuInfoResponse setSpecList(List<SpecificationInfo> specList) {
            this.specList = specList;
            return this;
        }
    }

    /**
     * Specification information
     */
    public static class SpecificationInfo {

        private static final long serialVersionUID = 1L;

        /**
         * Specification ID
         */
        private Long specId;

        /**
         * Parent Specification ID
         */
        private Long parentSpecId;

        public SpecificationInfo() {
        }

        /**
         * @return the specification ID
         */
        public Long getSpecId() {
            return specId;
        }

        /**
         * @param specId the specification ID to set
         * @return this object for method chaining
         */
        public SpecificationInfo setSpecId(Long specId) {
            this.specId = specId;
            return this;
        }

        /**
         * @return the parent specification ID
         */
        public Long getParentSpecId() {
            return parentSpecId;
        }

        /**
         * @param parentSpecId the parent specification ID to set
         * @return this object for method chaining
         */
        public SpecificationInfo setParentSpecId(Long parentSpecId) {
            this.parentSpecId = parentSpecId;
            return this;
        }
    }
}