package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.List;
import java.util.Map;

/**
 * POJO representing the request object for 'bg.local.goods.partial.update' API call.
 * This class contains all the fields needed to partially update product information.
 */
public class BgLocalGoodsPartialUpdateRequest implements TemuRequestIf {

    private static final long serialVersionUID = 1L;

    /**
     * Language
     */
    private String language;

    /**
     * Product Number (Required)
     */
    private Long goodsId;

    /**
     * Goods basic information
     */
    private GoodsBasic goodsBasic;

    /**
     * Goods service promise
     */
    private GoodsServicePromise goodsServicePromise;

    /**
     * Goods property
     */
    private GoodsProperty goodsProperty;

    /**
     * Country/region of Origin
     */
    private GoodsOriginInfo goodsOriginInfo;

    /**
     * Bullet points
     */
    private List<String> bulletPoints;

    /**
     * Goods description
     */
    private String goodsDesc;

    /**
     * Guide file info
     */
    private GuideFileInfo guideFileInfo;

    /**
     * Goods size chart list
     */
    private GoodsSizeChartList goodsSizeChartList;

    /**
     * The URL of the size chart image
     */
    private List<String> goodsSizeImage;

    /**
     * SKU list (Required)
     */
    private List<SkuInfo> skuList;

    /**
     * Goods trademark
     */
    private GoodsTrademark goodsTrademark;

    /**
     * Tax code info
     */
    private TaxCodeInfo taxCodeInfo;

    /**
     * Goods association info
     */
    private GoodsAssociationInfo goodsAssociationInfo;

    /**
     * Vehicle data
     */
    private GoodsVehiclePropertyRelation goodsVehiclePropertyRelation;

    /**
     * Second hand info
     */
    private SecondHand secondHand;

    /**
     * Product information modification ID, goods is unique, and the corresponding 
     * audit results can be queried using this ID in the future
     */
    private String modifyId;

    /**
     * ERP product publish status: 1 = Submitted; 2 = Saved as draft
     */
    private Integer saveMode;

    public BgLocalGoodsPartialUpdateRequest() {
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * @return the product number
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * @param goodsId the product number to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    /**
     * @return the goods basic information
     */
    public GoodsBasic getGoodsBasic() {
        return goodsBasic;
    }

    /**
     * @param goodsBasic the goods basic information to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setGoodsBasic(GoodsBasic goodsBasic) {
        this.goodsBasic = goodsBasic;
        return this;
    }

    /**
     * @return the goods service promise
     */
    public GoodsServicePromise getGoodsServicePromise() {
        return goodsServicePromise;
    }

    /**
     * @param goodsServicePromise the goods service promise to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setGoodsServicePromise(GoodsServicePromise goodsServicePromise) {
        this.goodsServicePromise = goodsServicePromise;
        return this;
    }

    /**
     * @return the goods property
     */
    public GoodsProperty getGoodsProperty() {
        return goodsProperty;
    }

    /**
     * @param goodsProperty the goods property to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setGoodsProperty(GoodsProperty goodsProperty) {
        this.goodsProperty = goodsProperty;
        return this;
    }

    /**
     * @return the goods origin info
     */
    public GoodsOriginInfo getGoodsOriginInfo() {
        return goodsOriginInfo;
    }

    /**
     * @param goodsOriginInfo the goods origin info to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setGoodsOriginInfo(GoodsOriginInfo goodsOriginInfo) {
        this.goodsOriginInfo = goodsOriginInfo;
        return this;
    }

    /**
     * @return the bullet points
     */
    public List<String> getBulletPoints() {
        return bulletPoints;
    }

    /**
     * @param bulletPoints the bullet points to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setBulletPoints(List<String> bulletPoints) {
        this.bulletPoints = bulletPoints;
        return this;
    }

    /**
     * @return the goods description
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * @param goodsDesc the goods description to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
        return this;
    }

    /**
     * @return the guide file info
     */
    public GuideFileInfo getGuideFileInfo() {
        return guideFileInfo;
    }

    /**
     * @param guideFileInfo the guide file info to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setGuideFileInfo(GuideFileInfo guideFileInfo) {
        this.guideFileInfo = guideFileInfo;
        return this;
    }

    /**
     * @return the goods size chart list
     */
    public GoodsSizeChartList getGoodsSizeChartList() {
        return goodsSizeChartList;
    }

    /**
     * @param goodsSizeChartList the goods size chart list to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setGoodsSizeChartList(GoodsSizeChartList goodsSizeChartList) {
        this.goodsSizeChartList = goodsSizeChartList;
        return this;
    }

    /**
     * @return the goods size image URLs
     */
    public List<String> getGoodsSizeImage() {
        return goodsSizeImage;
    }

    /**
     * @param goodsSizeImage the goods size image URLs to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setGoodsSizeImage(List<String> goodsSizeImage) {
        this.goodsSizeImage = goodsSizeImage;
        return this;
    }

    /**
     * @return the SKU list
     */
    public List<SkuInfo> getSkuList() {
        return skuList;
    }

    /**
     * @param skuList the SKU list to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setSkuList(List<SkuInfo> skuList) {
        this.skuList = skuList;
        return this;
    }

    /**
     * @return the goods trademark
     */
    public GoodsTrademark getGoodsTrademark() {
        return goodsTrademark;
    }

    /**
     * @param goodsTrademark the goods trademark to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setGoodsTrademark(GoodsTrademark goodsTrademark) {
        this.goodsTrademark = goodsTrademark;
        return this;
    }

    /**
     * @return the tax code info
     */
    public TaxCodeInfo getTaxCodeInfo() {
        return taxCodeInfo;
    }

    /**
     * @param taxCodeInfo the tax code info to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setTaxCodeInfo(TaxCodeInfo taxCodeInfo) {
        this.taxCodeInfo = taxCodeInfo;
        return this;
    }

    /**
     * @return the goods association info
     */
    public GoodsAssociationInfo getGoodsAssociationInfo() {
        return goodsAssociationInfo;
    }

    /**
     * @param goodsAssociationInfo the goods association info to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setGoodsAssociationInfo(GoodsAssociationInfo goodsAssociationInfo) {
        this.goodsAssociationInfo = goodsAssociationInfo;
        return this;
    }

    /**
     * @return the goods vehicle property relation
     */
    public GoodsVehiclePropertyRelation getGoodsVehiclePropertyRelation() {
        return goodsVehiclePropertyRelation;
    }

    /**
     * @param goodsVehiclePropertyRelation the goods vehicle property relation to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setGoodsVehiclePropertyRelation(GoodsVehiclePropertyRelation goodsVehiclePropertyRelation) {
        this.goodsVehiclePropertyRelation = goodsVehiclePropertyRelation;
        return this;
    }

    /**
     * @return the second hand info
     */
    public SecondHand getSecondHand() {
        return secondHand;
    }

    /**
     * @param secondHand the second hand info to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setSecondHand(SecondHand secondHand) {
        this.secondHand = secondHand;
        return this;
    }

    /**
     * @return the modify ID
     */
    public String getModifyId() {
        return modifyId;
    }

    /**
     * @param modifyId the modify ID to set
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setModifyId(String modifyId) {
        this.modifyId = modifyId;
        return this;
    }

    /**
     * @return the save mode
     */
    public Integer getSaveMode() {
        return saveMode;
    }

    /**
     * @param saveMode the save mode to set (1 = Submitted; 2 = Saved as draft)
     * @return this request object for method chaining
     */
    public BgLocalGoodsPartialUpdateRequest setSaveMode(Integer saveMode) {
        this.saveMode = saveMode;
        return this;
    }

    // ==================== INNER CLASSES ====================

    /**
     * Goods basic information
     */
    public static class GoodsBasic {

        private static final long serialVersionUID = 1L;

        /**
         * Goods name
         */
        private String goodsName;

        /**
         * Goods gallery
         */
        private GoodsGallery goodsGallery;

        /**
         * Import designation: Imported, Made in the USA, Made in the USA and Imported, Made in the USA or Imported
         */
        private String importDesignation;

        public GoodsBasic() {
        }

        /**
         * @return the goods name
         */
        public String getGoodsName() {
            return goodsName;
        }

        /**
         * @param goodsName the goods name to set
         * @return this object for method chaining
         */
        public GoodsBasic setGoodsName(String goodsName) {
            this.goodsName = goodsName;
            return this;
        }

        /**
         * @return the goods gallery
         */
        public GoodsGallery getGoodsGallery() {
            return goodsGallery;
        }

        /**
         * @param goodsGallery the goods gallery to set
         * @return this object for method chaining
         */
        public GoodsBasic setGoodsGallery(GoodsGallery goodsGallery) {
            this.goodsGallery = goodsGallery;
            return this;
        }

        /**
         * @return the import designation
         */
        public String getImportDesignation() {
            return importDesignation;
        }

        /**
         * @param importDesignation the import designation to set
         * @return this object for method chaining
         */
        public GoodsBasic setImportDesignation(String importDesignation) {
            this.importDesignation = importDesignation;
            return this;
        }
    }

    /**
     * Goods gallery containing videos and images
     */
    public static class GoodsGallery {

        private static final long serialVersionUID = 1L;

        /**
         * Detail Video
         */
        private VideoInfo detailVideo;

        /**
         * Product Detail Images
         */
        private List<String> detailImage;

        /**
         * Carousel Video - Product Video
         */
        private VideoInfo carouselVideo;

        public GoodsGallery() {
        }

        /**
         * @return the detail video
         */
        public VideoInfo getDetailVideo() {
            return detailVideo;
        }

        /**
         * @param detailVideo the detail video to set
         * @return this object for method chaining
         */
        public GoodsGallery setDetailVideo(VideoInfo detailVideo) {
            this.detailVideo = detailVideo;
            return this;
        }

        /**
         * @return the detail images
         */
        public List<String> getDetailImage() {
            return detailImage;
        }

        /**
         * @param detailImage the detail images to set
         * @return this object for method chaining
         */
        public GoodsGallery setDetailImage(List<String> detailImage) {
            this.detailImage = detailImage;
            return this;
        }

        /**
         * @return the carousel video
         */
        public VideoInfo getCarouselVideo() {
            return carouselVideo;
        }

        /**
         * @param carouselVideo the carousel video to set
         * @return this object for method chaining
         */
        public GoodsGallery setCarouselVideo(VideoInfo carouselVideo) {
            this.carouselVideo = carouselVideo;
            return this;
        }
    }

    /**
     * Video information
     */
    public static class VideoInfo {

        private static final long serialVersionUID = 1L;

        /**
         * Video ID
         */
        private String vid;

        /**
         * Video URL
         */
        private String videoUrl;

        public VideoInfo() {
        }

        /**
         * @return the video ID
         */
        public String getVid() {
            return vid;
        }

        /**
         * @param vid the video ID to set
         * @return this object for method chaining
         */
        public VideoInfo setVid(String vid) {
            this.vid = vid;
            return this;
        }

        /**
         * @return the video URL
         */
        public String getVideoUrl() {
            return videoUrl;
        }

        /**
         * @param videoUrl the video URL to set
         * @return this object for method chaining
         */
        public VideoInfo setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
    }

    /**
     * Goods service promise
     */
    public static class GoodsServicePromise {

        private static final long serialVersionUID = 1L;

        /**
         * Stock Preparation Time - Days, optional values: 1, 2
         */
        private Integer shipmentLimitDay;

        /**
         * Delivery Method, 1- Self-Delivery, 2- Platform Delivery
         */
        private Integer fulfillmentType;

        /**
         * Shipping Template ID
         */
        private String costTemplateId;

        public GoodsServicePromise() {
        }

        /**
         * @return the shipment limit day
         */
        public Integer getShipmentLimitDay() {
            return shipmentLimitDay;
        }

        /**
         * @param shipmentLimitDay the shipment limit day to set
         * @return this object for method chaining
         */
        public GoodsServicePromise setShipmentLimitDay(Integer shipmentLimitDay) {
            this.shipmentLimitDay = shipmentLimitDay;
            return this;
        }

        /**
         * @return the fulfillment type
         */
        public Integer getFulfillmentType() {
            return fulfillmentType;
        }

        /**
         * @param fulfillmentType the fulfillment type to set
         * @return this object for method chaining
         */
        public GoodsServicePromise setFulfillmentType(Integer fulfillmentType) {
            this.fulfillmentType = fulfillmentType;
            return this;
        }

        /**
         * @return the cost template ID
         */
        public String getCostTemplateId() {
            return costTemplateId;
        }

        /**
         * @param costTemplateId the cost template ID to set
         * @return this object for method chaining
         */
        public GoodsServicePromise setCostTemplateId(String costTemplateId) {
            this.costTemplateId = costTemplateId;
            return this;
        }
    }

    /**
     * Goods property
     */
    public static class GoodsProperty {

        private static final long serialVersionUID = 1L;

        /**
         * Goods properties list
         */
        private List<GoodsPropertyItem> goodsProperties;

        public GoodsProperty() {
        }

        /**
         * @return the goods properties
         */
        public List<GoodsPropertyItem> getGoodsProperties() {
            return goodsProperties;
        }

        /**
         * @param goodsProperties the goods properties to set
         * @return this object for method chaining
         */
        public GoodsProperty setGoodsProperties(List<GoodsPropertyItem> goodsProperties) {
            this.goodsProperties = goodsProperties;
            return this;
        }
    }

    /**
     * Individual goods property item
     */
    public static class GoodsPropertyItem {

        private static final long serialVersionUID = 1L;

        /**
         * The ID of the product attribute. If the specification values are not customized, the vid must be provided.
         */
        private Long vid;

        /**
         * Attribute Value
         */
        private String value;

        /**
         * Attribute Value Unit
         */
        private String valueUnit;

        /**
         * Attribute Value Unit ID
         */
        private Long valueUnitId;

        /**
         * Template Attribute Id
         */
        private Long templatePid;

        /**
         * Parent Specification ID, not required for non-sales attributes
         */
        private Long parentSpecId;

        /**
         * Specification ID, not required for non-sales attributes
         */
        private Long specId;

        /**
         * Note, not required for non-sales attributes
         */
        private String note;

        /**
         * Image URL, not required for non-sales attributes
         */
        private String imgUrl;

        /**
         * Attribute Value Group ID, not required for non-sales attributes
         */
        private Integer groupId;

        /**
         * Reference Property ID
         */
        private Long refPid;

        /**
         * Numeric Input
         */
        private String numberInputValue;

        public GoodsPropertyItem() {
        }

        /**
         * @return the vid
         */
        public Long getVid() {
            return vid;
        }

        /**
         * @param vid the vid to set
         * @return this object for method chaining
         */
        public GoodsPropertyItem setVid(Long vid) {
            this.vid = vid;
            return this;
        }

        /**
         * @return the value
         */
        public String getValue() {
            return value;
        }

        /**
         * @param value the value to set
         * @return this object for method chaining
         */
        public GoodsPropertyItem setValue(String value) {
            this.value = value;
            return this;
        }

        /**
         * @return the value unit
         */
        public String getValueUnit() {
            return valueUnit;
        }

        /**
         * @param valueUnit the value unit to set
         * @return this object for method chaining
         */
        public GoodsPropertyItem setValueUnit(String valueUnit) {
            this.valueUnit = valueUnit;
            return this;
        }

        /**
         * @return the value unit ID
         */
        public Long getValueUnitId() {
            return valueUnitId;
        }

        /**
         * @param valueUnitId the value unit ID to set
         * @return this object for method chaining
         */
        public GoodsPropertyItem setValueUnitId(Long valueUnitId) {
            this.valueUnitId = valueUnitId;
            return this;
        }

        /**
         * @return the template pid
         */
        public Long getTemplatePid() {
            return templatePid;
        }

        /**
         * @param templatePid the template pid to set
         * @return this object for method chaining
         */
        public GoodsPropertyItem setTemplatePid(Long templatePid) {
            this.templatePid = templatePid;
            return this;
        }

        /**
         * @return the parent spec ID
         */
        public Long getParentSpecId() {
            return parentSpecId;
        }

        /**
         * @param parentSpecId the parent spec ID to set
         * @return this object for method chaining
         */
        public GoodsPropertyItem setParentSpecId(Long parentSpecId) {
            this.parentSpecId = parentSpecId;
            return this;
        }

        /**
         * @return the spec ID
         */
        public Long getSpecId() {
            return specId;
        }

        /**
         * @param specId the spec ID to set
         * @return this object for method chaining
         */
        public GoodsPropertyItem setSpecId(Long specId) {
            this.specId = specId;
            return this;
        }

        /**
         * @return the note
         */
        public String getNote() {
            return note;
        }

        /**
         * @param note the note to set
         * @return this object for method chaining
         */
        public GoodsPropertyItem setNote(String note) {
            this.note = note;
            return this;
        }

        /**
         * @return the image URL
         */
        public String getImgUrl() {
            return imgUrl;
        }

        /**
         * @param imgUrl the image URL to set
         * @return this object for method chaining
         */
        public GoodsPropertyItem setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
            return this;
        }

        /**
         * @return the group ID
         */
        public Integer getGroupId() {
            return groupId;
        }

        /**
         * @param groupId the group ID to set
         * @return this object for method chaining
         */
        public GoodsPropertyItem setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * @return the ref pid
         */
        public Long getRefPid() {
            return refPid;
        }

        /**
         * @param refPid the ref pid to set
         * @return this object for method chaining
         */
        public GoodsPropertyItem setRefPid(Long refPid) {
            this.refPid = refPid;
            return this;
        }

        /**
         * @return the number input value
         */
        public String getNumberInputValue() {
            return numberInputValue;
        }

        /**
         * @param numberInputValue the number input value to set
         * @return this object for method chaining
         */
        public GoodsPropertyItem setNumberInputValue(String numberInputValue) {
            this.numberInputValue = numberInputValue;
            return this;
        }
    }

    /**
     * Country/region of Origin
     */
    public static class GoodsOriginInfo {

        private static final long serialVersionUID = 1L;

        /**
         * Primary Address, representing country or region.
         */
        private String originRegion1;

        /**
         * Secondary Address, representing province or state. 
         * Note: When the Primary Address is set to China, the Secondary Address is required; 
         * for other Primary Addresses, uploading the Secondary Address is not necessary.
         */
        private String originRegion2;

        /**
         * A flag for identifying the method of value retrieval:
         * - True: This modification will be automatically retrieved and entered by Temu based on the product 
         *   and the seller's certified information by default.
         * - False: This modification will read and input the value passed through the API.
         * Default: False
         */
        private Boolean agreeDefaultOriginRegion;

        /**
         * Photos of the product label for obtaining the origin label from Temu. 
         * This badge is only available for products originating from Germany, Spain, France, Italy, Poland, 
         * United Kingdom, Ireland, United States, Netherlands, Japan, Republic of Korea, Portugal, Sweden, 
         * Australia, Denmark, Türkiye or Lithuania.
         */
        private List<String> proofImageUrls;

        /**
         * Please upload a clear and readable close-up of the label. 
         * Includes origin label and manufacturer information. You can upload up to 5 images.
         */
        private List<String> labelManufacturerProofImageUrls;

        public GoodsOriginInfo() {
        }

        /**
         * @return the origin region 1
         */
        public String getOriginRegion1() {
            return originRegion1;
        }

        /**
         * @param originRegion1 the origin region 1 to set
         * @return this object for method chaining
         */
        public GoodsOriginInfo setOriginRegion1(String originRegion1) {
            this.originRegion1 = originRegion1;
            return this;
        }

        /**
         * @return the origin region 2
         */
        public String getOriginRegion2() {
            return originRegion2;
        }

        /**
         * @param originRegion2 the origin region 2 to set
         * @return this object for method chaining
         */
        public GoodsOriginInfo setOriginRegion2(String originRegion2) {
            this.originRegion2 = originRegion2;
            return this;
        }

        /**
         * @return the agree default origin region flag
         */
        public Boolean getAgreeDefaultOriginRegion() {
            return agreeDefaultOriginRegion;
        }

        /**
         * @param agreeDefaultOriginRegion the agree default origin region flag to set
         * @return this object for method chaining
         */
        public GoodsOriginInfo setAgreeDefaultOriginRegion(Boolean agreeDefaultOriginRegion) {
            this.agreeDefaultOriginRegion = agreeDefaultOriginRegion;
            return this;
        }

        /**
         * @return the proof image URLs
         */
        public List<String> getProofImageUrls() {
            return proofImageUrls;
        }

        /**
         * @param proofImageUrls the proof image URLs to set
         * @return this object for method chaining
         */
        public GoodsOriginInfo setProofImageUrls(List<String> proofImageUrls) {
            this.proofImageUrls = proofImageUrls;
            return this;
        }

        /**
         * @return the label manufacturer proof image URLs
         */
        public List<String> getLabelManufacturerProofImageUrls() {
            return labelManufacturerProofImageUrls;
        }

        /**
         * @param labelManufacturerProofImageUrls the label manufacturer proof image URLs to set
         * @return this object for method chaining
         */
        public GoodsOriginInfo setLabelManufacturerProofImageUrls(List<String> labelManufacturerProofImageUrls) {
            this.labelManufacturerProofImageUrls = labelManufacturerProofImageUrls;
            return this;
        }
    }

    /**
     * Guide file info
     */
    public static class GuideFileInfo {

        private static final long serialVersionUID = 1L;

        /**
         * Language-PDF Product Manual Mapping: key is the language, value is the file URL. 
         * The English version must be imported.
         */
        private Map<String, String> lang2GuideFileUrl;

        public GuideFileInfo() {
        }

        /**
         * @return the language to guide file URL mapping
         */
        public Map<String, String> getLang2GuideFileUrl() {
            return lang2GuideFileUrl;
        }

        /**
         * @param lang2GuideFileUrl the language to guide file URL mapping to set
         * @return this object for method chaining
         */
        public GuideFileInfo setLang2GuideFileUrl(Map<String, String> lang2GuideFileUrl) {
            this.lang2GuideFileUrl = lang2GuideFileUrl;
            return this;
        }
    }

    /**
     * Goods size chart list
     */
    public static class GoodsSizeChartList {

        private static final long serialVersionUID = 1L;

        /**
         * Product size information, with multiple size charts for suit sets
         */
        private List<SizeChart> goodsSizeChartList;

        public GoodsSizeChartList() {
        }

        /**
         * @return the goods size chart list
         */
        public List<SizeChart> getGoodsSizeChartList() {
            return goodsSizeChartList;
        }

        /**
         * @param goodsSizeChartList the goods size chart list to set
         * @return this object for method chaining
         */
        public GoodsSizeChartList setGoodsSizeChartList(List<SizeChart> goodsSizeChartList) {
            this.goodsSizeChartList = goodsSizeChartList;
            return this;
        }
    }

    /**
     * Individual size chart
     */
    public static class SizeChart {

        private static final long serialVersionUID = 1L;

        /**
         * Size Chart Category
         */
        private Integer classId;

        /**
         * Size Chart Metadata (Table Header)
         */
        private SizeChartMeta meta;

        /**
         * Size Chart Row Data
         */
        private List<SizeChartRecord> records;

        /**
         * Body Size Chart Metadata (Table Header)
         */
        private SizeChartMeta bodyMeta;

        /**
         * Body Size Chart Row Data
         */
        private List<SizeChartRecord> bodyRecords;

        public SizeChart() {
        }

        /**
         * @return the class ID
         */
        public Integer getClassId() {
            return classId;
        }

        /**
         * @param classId the class ID to set
         * @return this object for method chaining
         */
        public SizeChart setClassId(Integer classId) {
            this.classId = classId;
            return this;
        }

        /**
         * @return the meta
         */
        public SizeChartMeta getMeta() {
            return meta;
        }

        /**
         * @param meta the meta to set
         * @return this object for method chaining
         */
        public SizeChart setMeta(SizeChartMeta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * @return the records
         */
        public List<SizeChartRecord> getRecords() {
            return records;
        }

        /**
         * @param records the records to set
         * @return this object for method chaining
         */
        public SizeChart setRecords(List<SizeChartRecord> records) {
            this.records = records;
            return this;
        }

        /**
         * @return the body meta
         */
        public SizeChartMeta getBodyMeta() {
            return bodyMeta;
        }

        /**
         * @param bodyMeta the body meta to set
         * @return this object for method chaining
         */
        public SizeChart setBodyMeta(SizeChartMeta bodyMeta) {
            this.bodyMeta = bodyMeta;
            return this;
        }

        /**
         * @return the body records
         */
        public List<SizeChartRecord> getBodyRecords() {
            return bodyRecords;
        }

        /**
         * @param bodyRecords the body records to set
         * @return this object for method chaining
         */
        public SizeChart setBodyRecords(List<SizeChartRecord> bodyRecords) {
            this.bodyRecords = bodyRecords;
            return this;
        }
    }

    /**
     * Size chart metadata (Table Header)
     */
    public static class SizeChartMeta {

        private static final long serialVersionUID = 1L;

        /**
         * Size Group
         */
        private List<SizeGroup> groups;

        /**
         * Size Chart Element
         */
        private List<SizeElement> elements;

        public SizeChartMeta() {
        }

        /**
         * @return the groups
         */
        public List<SizeGroup> getGroups() {
            return groups;
        }

        /**
         * @param groups the groups to set
         * @return this object for method chaining
         */
        public SizeChartMeta setGroups(List<SizeGroup> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * @return the elements
         */
        public List<SizeElement> getElements() {
            return elements;
        }

        /**
         * @param elements the elements to set
         * @return this object for method chaining
         */
        public SizeChartMeta setElements(List<SizeElement> elements) {
            this.elements = elements;
            return this;
        }
    }

    /**
     * Size group
     */
    public static class SizeGroup {

        private static final long serialVersionUID = 1L;

        /**
         * Size Group ID
         */
        private Integer id;

        /**
         * Size Group Name
         */
        private String name;

        public SizeGroup() {
        }

        /**
         * @return the id
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id the id to set
         * @return this object for method chaining
         */
        public SizeGroup setId(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name the name to set
         * @return this object for method chaining
         */
        public SizeGroup setName(String name) {
            this.name = name;
            return this;
        }
    }

    /**
     * Size chart element
     */
    public static class SizeElement {

        private static final long serialVersionUID = 1L;

        /**
         * Size Metadata ID
         */
        private Integer id;

        /**
         * Size Metadata Name
         */
        private String name;

        public SizeElement() {
        }

        /**
         * @return the id
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id the id to set
         * @return this object for method chaining
         */
        public SizeElement setId(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name the name to set
         * @return this object for method chaining
         */
        public SizeElement setName(String name) {
            this.name = name;
            return this;
        }
    }

    /**
     * Size chart row data
     */
    public static class SizeChartRecord {

        private static final long serialVersionUID = 1L;

        /**
         * Size Group and Size Table Element Value
         */
        private List<SizeChartValue> values;

        public SizeChartRecord() {
        }

        /**
         * @return the values
         */
        public List<SizeChartValue> getValues() {
            return values;
        }

        /**
         * @param values the values to set
         * @return this object for method chaining
         */
        public SizeChartRecord setValues(List<SizeChartValue> values) {
            this.values = values;
            return this;
        }
    }

    /**
     * Size group and size table element value
     */
    public static class SizeChartValue {

        private static final long serialVersionUID = 1L;

        /**
         * Local Code ID, Publish Code ID, or Element ID
         */
        private Integer id;

        /**
         * Corresponding Value
         */
        private String value;

        public SizeChartValue() {
        }

        /**
         * @return the id
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id the id to set
         * @return this object for method chaining
         */
        public SizeChartValue setId(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * @return the value
         */
        public String getValue() {
            return value;
        }

        /**
         * @param value the value to set
         * @return this object for method chaining
         */
        public SizeChartValue setValue(String value) {
            this.value = value;
            return this;
        }
    }

    /**
     * SKU information
     */
    public static class SkuInfo {

        private static final long serialVersionUID = 1L;

        /**
         * skuId; When modifying SKU, must input skuId; When adding a new SKU, do not input the skuId.
         */
        private Long skuId;

        /**
         * Base Price; When modifying SKU, do not input the basePrice; When adding a new SKU, you must input basePrice.
         */
        private PriceInfo basePrice;

        /**
         * Recommended Retail Price (must be higher than basePrice).
         */
        private PriceInfo listPrice;

        /**
         * Recommended Retail Price. If the parameter is empty or 0, then the listPrice field must be filled; 
         * if no value for listPrice is provided, an error will occur.
         */
        private Integer listPriceType;

        /**
         * Inventory quantity; When modifying SKU, do not input the quantity; 
         * When adding a new SKU, you must input quantity.
         */
        private Long quantity;

        /**
         * List of specification IDs; When modifying SKU, do not input the specIdList; 
         * When adding a new SKU, you must input specIdList.
         */
        private List<Long> specIdList;

        /**
         * External SKU code; When modifying a SKU, the outSkuSn field is optional. 
         * If omitted, the original value will be retained. If provided as empty, the existing outSkuSn will be cleared.
         */
        private String outSkuSn;

        /**
         * Weight (Required)
         */
        private String weight;

        /**
         * Weight unit (Required)
         */
        private String weightUnit;

        /**
         * Length (Required)
         */
        private String length;

        /**
         * Width (Required)
         */
        private String width;

        /**
         * Height (Required)
         */
        private String height;

        /**
         * Volume unit (Required)
         */
        private String volumeUnit;

        /**
         * Images (Required)
         */
        private List<String> images;

        /**
         * External product type
         */
        private Integer externalProductType;

        /**
         * External product id
         */
        private String externalProductId;

        /**
         * Links to other platforms
         */
        private String referenceLink;

        /**
         * SKU classification(type) and packaging
         */
        private MultiplePackage multiplePackage;

        public SkuInfo() {
        }

        /**
         * @return the sku ID
         */
        public Long getSkuId() {
            return skuId;
        }

        /**
         * @param skuId the sku ID to set
         * @return this object for method chaining
         */
        public SkuInfo setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }

        /**
         * @return the base price
         */
        public PriceInfo getBasePrice() {
            return basePrice;
        }

        /**
         * @param basePrice the base price to set
         * @return this object for method chaining
         */
        public SkuInfo setBasePrice(PriceInfo basePrice) {
            this.basePrice = basePrice;
            return this;
        }

        /**
         * @return the list price
         */
        public PriceInfo getListPrice() {
            return listPrice;
        }

        /**
         * @param listPrice the list price to set
         * @return this object for method chaining
         */
        public SkuInfo setListPrice(PriceInfo listPrice) {
            this.listPrice = listPrice;
            return this;
        }

        /**
         * @return the list price type
         */
        public Integer getListPriceType() {
            return listPriceType;
        }

        /**
         * @param listPriceType the list price type to set
         * @return this object for method chaining
         */
        public SkuInfo setListPriceType(Integer listPriceType) {
            this.listPriceType = listPriceType;
            return this;
        }

        /**
         * @return the quantity
         */
        public Long getQuantity() {
            return quantity;
        }

        /**
         * @param quantity the quantity to set
         * @return this object for method chaining
         */
        public SkuInfo setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * @return the spec ID list
         */
        public List<Long> getSpecIdList() {
            return specIdList;
        }

        /**
         * @param specIdList the spec ID list to set
         * @return this object for method chaining
         */
        public SkuInfo setSpecIdList(List<Long> specIdList) {
            this.specIdList = specIdList;
            return this;
        }

        /**
         * @return the out SKU SN
         */
        public String getOutSkuSn() {
            return outSkuSn;
        }

        /**
         * @param outSkuSn the out SKU SN to set
         * @return this object for method chaining
         */
        public SkuInfo setOutSkuSn(String outSkuSn) {
            this.outSkuSn = outSkuSn;
            return this;
        }

        /**
         * @return the weight
         */
        public String getWeight() {
            return weight;
        }

        /**
         * @param weight the weight to set
         * @return this object for method chaining
         */
        public SkuInfo setWeight(String weight) {
            this.weight = weight;
            return this;
        }

        /**
         * @return the weight unit
         */
        public String getWeightUnit() {
            return weightUnit;
        }

        /**
         * @param weightUnit the weight unit to set
         * @return this object for method chaining
         */
        public SkuInfo setWeightUnit(String weightUnit) {
            this.weightUnit = weightUnit;
            return this;
        }

        /**
         * @return the length
         */
        public String getLength() {
            return length;
        }

        /**
         * @param length the length to set
         * @return this object for method chaining
         */
        public SkuInfo setLength(String length) {
            this.length = length;
            return this;
        }

        /**
         * @return the width
         */
        public String getWidth() {
            return width;
        }

        /**
         * @param width the width to set
         * @return this object for method chaining
         */
        public SkuInfo setWidth(String width) {
            this.width = width;
            return this;
        }

        /**
         * @return the height
         */
        public String getHeight() {
            return height;
        }

        /**
         * @param height the height to set
         * @return this object for method chaining
         */
        public SkuInfo setHeight(String height) {
            this.height = height;
            return this;
        }

        /**
         * @return the volume unit
         */
        public String getVolumeUnit() {
            return volumeUnit;
        }

        /**
         * @param volumeUnit the volume unit to set
         * @return this object for method chaining
         */
        public SkuInfo setVolumeUnit(String volumeUnit) {
            this.volumeUnit = volumeUnit;
            return this;
        }

        /**
         * @return the images
         */
        public List<String> getImages() {
            return images;
        }

        /**
         * @param images the images to set
         * @return this object for method chaining
         */
        public SkuInfo setImages(List<String> images) {
            this.images = images;
            return this;
        }

        /**
         * @return the external product type
         */
        public Integer getExternalProductType() {
            return externalProductType;
        }

        /**
         * @param externalProductType the external product type to set
         * @return this object for method chaining
         */
        public SkuInfo setExternalProductType(Integer externalProductType) {
            this.externalProductType = externalProductType;
            return this;
        }

        /**
         * @return the external product ID
         */
        public String getExternalProductId() {
            return externalProductId;
        }

        /**
         * @param externalProductId the external product ID to set
         * @return this object for method chaining
         */
        public SkuInfo setExternalProductId(String externalProductId) {
            this.externalProductId = externalProductId;
            return this;
        }

        /**
         * @return the reference link
         */
        public String getReferenceLink() {
            return referenceLink;
        }

        /**
         * @param referenceLink the reference link to set
         * @return this object for method chaining
         */
        public SkuInfo setReferenceLink(String referenceLink) {
            this.referenceLink = referenceLink;
            return this;
        }

        /**
         * @return the multiple package info
         */
        public MultiplePackage getMultiplePackage() {
            return multiplePackage;
        }

        /**
         * @param multiplePackage the multiple package info to set
         * @return this object for method chaining
         */
        public SkuInfo setMultiplePackage(MultiplePackage multiplePackage) {
            this.multiplePackage = multiplePackage;
            return this;
        }
    }

    /**
     * Price information
     */
    public static class PriceInfo {

        private static final long serialVersionUID = 1L;

        /**
         * Amount; Required when the current SKU is newly added.
         */
        private String amount;

        /**
         * Currency; Required when the current SKU is newly added.
         */
        private String currency;

        public PriceInfo() {
        }

        /**
         * @return the amount
         */
        public String getAmount() {
            return amount;
        }

        /**
         * @param amount the amount to set
         * @return this object for method chaining
         */
        public PriceInfo setAmount(String amount) {
            this.amount = amount;
            return this;
        }

        /**
         * @return the currency
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * @param currency the currency to set
         * @return this object for method chaining
         */
        public PriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
    }

    /**
     * SKU classification(type) and packaging
     */
    public static class MultiplePackage {

        private static final long serialVersionUID = 1L;

        /**
         * SKU classification(type): 1 Single set 2 Multi-piece set 3 Mixed set
         * Single set: The SKU only contains 1 item. If there is no code on the item, the minimum sellable unit is 1. 
         * If there is a code on the item, the minimum inventory unit is 1.
         * Multi-piece set: The SKU contains multiple identical items. Multi-piece set = Product A + Product A + Product A
         * Mixed set: The items in the set are of the different types or specifications. Mixed set = Item A + Item B + Item C.
         */
        private Integer skuClassification;

        /**
         * 1 Mixed set of different products 2 Mixed set of different specifications
         * Mixed set of different products: The SKU contains different types of products, such as a main product and a free gift 
         * (e.g., a phone and a phone case), or a main product and an auxiliary product (e.g., a razor and shaving foam).
         * Mixed set of different products = Product A + Product B + Product C
         * Mixed set of different specifications: The SKU contains the same type of product but in different specifications, 
         * such as the main product and a sample (e.g., 200 ml perfume + 10 ml perfume).
         * Mixed set of different specifications = Product A (Size 1) + Product A (Size 2)
         */
        private Integer mixedSetType;

        /**
         * The amount of products that can be sold separately(aka CSU) in the SKU.
         * The Consumer Sales Unit (CSU) refers to the smallest unit of a product on the market sold to consumers, 
         * such as a bag of potato chips or a drinks bottle. The smallest sales unit has a unique barcode and product information, 
         * meeting the requirements for independent sale. Items in a SKU that cannot be sold individually are considered 
         * accessories to the main product and are not included in the CSU quantity.
         */
        private Integer numberOfPieces;

        /**
         * The unit of "numberOfPieces" field. The available units include: piece (enumeration 1)
         */
        private Integer pieceUnitCode;

        /**
         * This field can only be filled in for "Single set" and "Multi-piece set", indicating the net content 
         * of each packaged item within the SKU. Total Net Content of items in the SKU = "numberOfPieces" * "originNetContentNumber".
         */
        private String originNetContentNumber;

        /**
         * This field can only be filled in for "Mixed set of different products" and "Mixed set of different specifications", 
         * indicating the total net content of all items in the SKU.
         */
        private String originTotalNetContentNumber;

        /**
         * The physical units corresponding to "originNetContentNumber" or "originTotalNetContentNumber". 
         * This can be weight, volume, length or area.
         */
        private Integer netContentUnitCode;

        /**
         * Describes whether each SKU item is individually packed. If each SKU item is a CSU, select [Yes] for "Individually packed" 
         * for this SKU. If not, select [No/0]. For a single set, "Individually packed" can only be set to [Yes/1].
         * The Consumer Sales Unit (CSU) refers to the smallest unit of a product on the market sold to consumers, 
         * such as a bag of potato chips or a drinks bottle. The smallest sales unit has a unique barcode and product information, 
         * meeting the requirements for independent sale. EPR fees are typically calculated based on the CSU. 
         * The fees may vary depending on the product category (such as electronic equipment, furniture, etc.), 
         * material type (such as glass, metal, plastic, etc.), and the difficulty of recycling the CSU.
         * For products such as water, juice, and milk that can be sold in separate packaging, the CSU is generally calculated 
         * per bottle, can, or box, even if the product is designed to be sold in units of 12 bottles or 6 boxes.
         */
        private Integer individuallyPacked;

        public MultiplePackage() {
        }

        /**
         * @return the SKU classification
         */
        public Integer getSkuClassification() {
            return skuClassification;
        }

        /**
         * @param skuClassification the SKU classification to set
         * @return this object for method chaining
         */
        public MultiplePackage setSkuClassification(Integer skuClassification) {
            this.skuClassification = skuClassification;
            return this;
        }

        /**
         * @return the mixed set type
         */
        public Integer getMixedSetType() {
            return mixedSetType;
        }

        /**
         * @param mixedSetType the mixed set type to set
         * @return this object for method chaining
         */
        public MultiplePackage setMixedSetType(Integer mixedSetType) {
            this.mixedSetType = mixedSetType;
            return this;
        }

        /**
         * @return the number of pieces
         */
        public Integer getNumberOfPieces() {
            return numberOfPieces;
        }

        /**
         * @param numberOfPieces the number of pieces to set
         * @return this object for method chaining
         */
        public MultiplePackage setNumberOfPieces(Integer numberOfPieces) {
            this.numberOfPieces = numberOfPieces;
            return this;
        }

        /**
         * @return the piece unit code
         */
        public Integer getPieceUnitCode() {
            return pieceUnitCode;
        }

        /**
         * @param pieceUnitCode the piece unit code to set
         * @return this object for method chaining
         */
        public MultiplePackage setPieceUnitCode(Integer pieceUnitCode) {
            this.pieceUnitCode = pieceUnitCode;
            return this;
        }

        /**
         * @return the origin net content number
         */
        public String getOriginNetContentNumber() {
            return originNetContentNumber;
        }

        /**
         * @param originNetContentNumber the origin net content number to set
         * @return this object for method chaining
         */
        public MultiplePackage setOriginNetContentNumber(String originNetContentNumber) {
            this.originNetContentNumber = originNetContentNumber;
            return this;
        }

        /**
         * @return the origin total net content number
         */
        public String getOriginTotalNetContentNumber() {
            return originTotalNetContentNumber;
        }

        /**
         * @param originTotalNetContentNumber the origin total net content number to set
         * @return this object for method chaining
         */
        public MultiplePackage setOriginTotalNetContentNumber(String originTotalNetContentNumber) {
            this.originTotalNetContentNumber = originTotalNetContentNumber;
            return this;
        }

        /**
         * @return the net content unit code
         */
        public Integer getNetContentUnitCode() {
            return netContentUnitCode;
        }

        /**
         * @param netContentUnitCode the net content unit code to set
         * @return this object for method chaining
         */
        public MultiplePackage setNetContentUnitCode(Integer netContentUnitCode) {
            this.netContentUnitCode = netContentUnitCode;
            return this;
        }

        /**
         * @return the individually packed flag
         */
        public Integer getIndividuallyPacked() {
            return individuallyPacked;
        }

        /**
         * @param individuallyPacked the individually packed flag to set
         * @return this object for method chaining
         */
        public MultiplePackage setIndividuallyPacked(Integer individuallyPacked) {
            this.individuallyPacked = individuallyPacked;
            return this;
        }
    }

    /**
     * Goods trademark
     */
    public static class GoodsTrademark {

        private static final long serialVersionUID = 1L;

        /**
         * Brand ID
         */
        private Long brandId;

        /**
         * Trademark ID
         */
        private Long trademarkId;

        /**
         * - True: The product does not have brand or trademark information. You do not need to provide brandId and trademarkId.
         * - False: The product has brand and trademark information. You may choose whether to provide brandId and trademarkId.
         * - The default value is False.
         */
        private Boolean noTrademark;

        public GoodsTrademark() {
        }

        /**
         * @return the brand ID
         */
        public Long getBrandId() {
            return brandId;
        }

        /**
         * @param brandId the brand ID to set
         * @return this object for method chaining
         */
        public GoodsTrademark setBrandId(Long brandId) {
            this.brandId = brandId;
            return this;
        }

        /**
         * @return the trademark ID
         */
        public Long getTrademarkId() {
            return trademarkId;
        }

        /**
         * @param trademarkId the trademark ID to set
         * @return this object for method chaining
         */
        public GoodsTrademark setTrademarkId(Long trademarkId) {
            this.trademarkId = trademarkId;
            return this;
        }

        /**
         * @return the no trademark flag
         */
        public Boolean getNoTrademark() {
            return noTrademark;
        }

        /**
         * @param noTrademark the no trademark flag to set
         * @return this object for method chaining
         */
        public GoodsTrademark setNoTrademark(Boolean noTrademark) {
            this.noTrademark = noTrademark;
            return this;
        }
    }

    /**
     * Tax code info
     */
    public static class TaxCodeInfo {

        private static final long serialVersionUID = 1L;

        /**
         * Goods tax code
         */
        private String itemTaxCode;

        public TaxCodeInfo() {
        }

        /**
         * @return the item tax code
         */
        public String getItemTaxCode() {
            return itemTaxCode;
        }

        /**
         * @param itemTaxCode the item tax code to set
         * @return this object for method chaining
         */
        public TaxCodeInfo setItemTaxCode(String itemTaxCode) {
            this.itemTaxCode = itemTaxCode;
            return this;
        }
    }

    /**
     * Goods association info
     */
    public static class GoodsAssociationInfo {

        private static final long serialVersionUID = 1L;

        /**
         * No charger goods ID list
         */
        private List<Long> noChargerGoodsList;

        public GoodsAssociationInfo() {
        }

        /**
         * @return the no charger goods list
         */
        public List<Long> getNoChargerGoodsList() {
            return noChargerGoodsList;
        }

        /**
         * @param noChargerGoodsList the no charger goods list to set
         * @return this object for method chaining
         */
        public GoodsAssociationInfo setNoChargerGoodsList(List<Long> noChargerGoodsList) {
            this.noChargerGoodsList = noChargerGoodsList;
            return this;
        }
    }

    /**
     * Vehicle data
     */
    public static class GoodsVehiclePropertyRelation {

        private static final long serialVersionUID = 1L;

        /**
         * For relation type, select "1" to query the database of compatible vehicle models.
         */
        private Long relationId;

        /**
         * The compatible vehicle models of different countries and categories are different. 
         * You can use relation id, the Id for compatible vehicle models database, to query.
         */
        private Integer relationType;

        /**
         * The dependency id of property value at the last/lowest level.
         */
        private List<Long> leafPropertyValueDependencyIdList;

        public GoodsVehiclePropertyRelation() {
        }

        /**
         * @return the relation ID
         */
        public Long getRelationId() {
            return relationId;
        }

        /**
         * @param relationId the relation ID to set
         * @return this object for method chaining
         */
        public GoodsVehiclePropertyRelation setRelationId(Long relationId) {
            this.relationId = relationId;
            return this;
        }

        /**
         * @return the relation type
         */
        public Integer getRelationType() {
            return relationType;
        }

        /**
         * @param relationType the relation type to set
         * @return this object for method chaining
         */
        public GoodsVehiclePropertyRelation setRelationType(Integer relationType) {
            this.relationType = relationType;
            return this;
        }

        /**
         * @return the leaf property value dependency ID list
         */
        public List<Long> getLeafPropertyValueDependencyIdList() {
            return leafPropertyValueDependencyIdList;
        }

        /**
         * @param leafPropertyValueDependencyIdList the leaf property value dependency ID list to set
         * @return this object for method chaining
         */
        public GoodsVehiclePropertyRelation setLeafPropertyValueDependencyIdList(List<Long> leafPropertyValueDependencyIdList) {
            this.leafPropertyValueDependencyIdList = leafPropertyValueDependencyIdList;
            return this;
        }
    }

    /**
     * Second hand info
     */
    public static class SecondHand {

        private static final long serialVersionUID = 1L;

        /**
         * Whether it's second hand
         */
        private Boolean secondHandGoods;

        /**
         * Condition
         */
        private Integer level;

        public SecondHand() {
        }

        /**
         * @return the second hand goods flag
         */
        public Boolean getSecondHandGoods() {
            return secondHandGoods;
        }

        /**
         * @param secondHandGoods the second hand goods flag to set
         * @return this object for method chaining
         */
        public SecondHand setSecondHandGoods(Boolean secondHandGoods) {
            this.secondHandGoods = secondHandGoods;
            return this;
        }

        /**
         * @return the level
         */
        public Integer getLevel() {
            return level;
        }

        /**
         * @param level the level to set
         * @return this object for method chaining
         */
        public SecondHand setLevel(Integer level) {
            this.level = level;
            return this;
        }
    }
}