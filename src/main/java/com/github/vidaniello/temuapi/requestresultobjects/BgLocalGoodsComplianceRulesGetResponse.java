package com.github.vidaniello.temuapi.requestresultobjects;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Response object for the API call 'bg.local.goods.compliance.rules.get'.
 * Struttura rilevata empiricamente su ambiente di produzione: elenco dei
 * controlli di conformita' della categoria, certificati richiesti e requisiti
 * delle foto reali del prodotto.
 */
public class BgLocalGoodsComplianceRulesGetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;

	private List<CheckInfo> checkInfoList;
	private List<GoodsCert> goodsCertList;
	private Boolean mustHaveActualPhoto;
	private List<ActualPhotoRequirement> actualPhotoRequirement;

	public List<CheckInfo> getCheckInfoList() {
		return checkInfoList;
	}

	public BgLocalGoodsComplianceRulesGetResponse setCheckInfoList(List<CheckInfo> checkInfoList) {
		this.checkInfoList = checkInfoList;
		return this;
	}

	public List<GoodsCert> getGoodsCertList() {
		return goodsCertList;
	}

	public BgLocalGoodsComplianceRulesGetResponse setGoodsCertList(List<GoodsCert> goodsCertList) {
		this.goodsCertList = goodsCertList;
		return this;
	}

	public Boolean getMustHaveActualPhoto() {
		return mustHaveActualPhoto;
	}

	public BgLocalGoodsComplianceRulesGetResponse setMustHaveActualPhoto(Boolean mustHaveActualPhoto) {
		this.mustHaveActualPhoto = mustHaveActualPhoto;
		return this;
	}

	public List<ActualPhotoRequirement> getActualPhotoRequirement() {
		return actualPhotoRequirement;
	}

	public BgLocalGoodsComplianceRulesGetResponse setActualPhotoRequirement(List<ActualPhotoRequirement> actualPhotoRequirement) {
		this.actualPhotoRequirement = actualPhotoRequirement;
		return this;
	}

	/** Singolo controllo di conformita' (es. CE Marking, GPSR, batch number). */
	public static class CheckInfo implements Serializable {

		private static final long serialVersionUID = 1L;

		private Long checkType;
		private String checkName;
		private String checkShowName;
		private Integer complianceType;
		private String exampleDesc;
		private List<String> examplePicList;
		private List<Object> guideFileLanguageList;
		private Object checkResult;
		private Object checkResultDesc;
		private Object checkFailCode;
		private Object checkFailReason;
		private Object checkStyle;

		public Long getCheckType() {
			return checkType;
		}

		public CheckInfo setCheckType(Long checkType) {
			this.checkType = checkType;
			return this;
		}

		public String getCheckName() {
			return checkName;
		}

		public CheckInfo setCheckName(String checkName) {
			this.checkName = checkName;
			return this;
		}

		public String getCheckShowName() {
			return checkShowName;
		}

		public CheckInfo setCheckShowName(String checkShowName) {
			this.checkShowName = checkShowName;
			return this;
		}

		public Integer getComplianceType() {
			return complianceType;
		}

		public CheckInfo setComplianceType(Integer complianceType) {
			this.complianceType = complianceType;
			return this;
		}

		public String getExampleDesc() {
			return exampleDesc;
		}

		public CheckInfo setExampleDesc(String exampleDesc) {
			this.exampleDesc = exampleDesc;
			return this;
		}

		public List<String> getExamplePicList() {
			return examplePicList;
		}

		public CheckInfo setExamplePicList(List<String> examplePicList) {
			this.examplePicList = examplePicList;
			return this;
		}

		public List<Object> getGuideFileLanguageList() {
			return guideFileLanguageList;
		}

		public CheckInfo setGuideFileLanguageList(List<Object> guideFileLanguageList) {
			this.guideFileLanguageList = guideFileLanguageList;
			return this;
		}

		public Object getCheckResult() {
			return checkResult;
		}

		public CheckInfo setCheckResult(Object checkResult) {
			this.checkResult = checkResult;
			return this;
		}

		public Object getCheckResultDesc() {
			return checkResultDesc;
		}

		public CheckInfo setCheckResultDesc(Object checkResultDesc) {
			this.checkResultDesc = checkResultDesc;
			return this;
		}

		public Object getCheckFailCode() {
			return checkFailCode;
		}

		public CheckInfo setCheckFailCode(Object checkFailCode) {
			this.checkFailCode = checkFailCode;
			return this;
		}

		public Object getCheckFailReason() {
			return checkFailReason;
		}

		public CheckInfo setCheckFailReason(Object checkFailReason) {
			this.checkFailReason = checkFailReason;
			return this;
		}

		public Object getCheckStyle() {
			return checkStyle;
		}

		public CheckInfo setCheckStyle(Object checkStyle) {
			this.checkStyle = checkStyle;
			return this;
		}
	}

	/** Certificato richiesto per la categoria (es. EU DoC, test report). */
	public static class GoodsCert implements Serializable {

		private static final long serialVersionUID = 1L;

		private Boolean isRequired;
		private Integer certType;
		private String certName;
		private Integer matchType;
		private Integer uploadStatus;
		private Map<String, Integer> uploadStatusLanguageMap;
		private Object strongCheckItems;
		private List<Object> goodsCertNeedUploadItemList;

		public Boolean getIsRequired() {
			return isRequired;
		}

		public GoodsCert setIsRequired(Boolean isRequired) {
			this.isRequired = isRequired;
			return this;
		}

		public Integer getCertType() {
			return certType;
		}

		public GoodsCert setCertType(Integer certType) {
			this.certType = certType;
			return this;
		}

		public String getCertName() {
			return certName;
		}

		public GoodsCert setCertName(String certName) {
			this.certName = certName;
			return this;
		}

		public Integer getMatchType() {
			return matchType;
		}

		public GoodsCert setMatchType(Integer matchType) {
			this.matchType = matchType;
			return this;
		}

		public Integer getUploadStatus() {
			return uploadStatus;
		}

		public GoodsCert setUploadStatus(Integer uploadStatus) {
			this.uploadStatus = uploadStatus;
			return this;
		}

		public Map<String, Integer> getUploadStatusLanguageMap() {
			return uploadStatusLanguageMap;
		}

		public GoodsCert setUploadStatusLanguageMap(Map<String, Integer> uploadStatusLanguageMap) {
			this.uploadStatusLanguageMap = uploadStatusLanguageMap;
			return this;
		}

		public Object getStrongCheckItems() {
			return strongCheckItems;
		}

		public GoodsCert setStrongCheckItems(Object strongCheckItems) {
			this.strongCheckItems = strongCheckItems;
			return this;
		}

		public List<Object> getGoodsCertNeedUploadItemList() {
			return goodsCertNeedUploadItemList;
		}

		public GoodsCert setGoodsCertNeedUploadItemList(List<Object> goodsCertNeedUploadItemList) {
			this.goodsCertNeedUploadItemList = goodsCertNeedUploadItemList;
			return this;
		}
	}

	/** Requisito fotografico reale del prodotto (imballo/etichette). */
	public static class ActualPhotoRequirement implements Serializable {

		private static final long serialVersionUID = 1L;

		private Integer maxPhotoSize;
		private Integer position;
		private List<PhotoRequirement> photoRequirementList;

		public Integer getMaxPhotoSize() {
			return maxPhotoSize;
		}

		public ActualPhotoRequirement setMaxPhotoSize(Integer maxPhotoSize) {
			this.maxPhotoSize = maxPhotoSize;
			return this;
		}

		public Integer getPosition() {
			return position;
		}

		public ActualPhotoRequirement setPosition(Integer position) {
			this.position = position;
			return this;
		}

		public List<PhotoRequirement> getPhotoRequirementList() {
			return photoRequirementList;
		}

		public ActualPhotoRequirement setPhotoRequirementList(List<PhotoRequirement> photoRequirementList) {
			this.photoRequirementList = photoRequirementList;
			return this;
		}

		public static class PhotoRequirement implements Serializable {

			private static final long serialVersionUID = 1L;

			private String requirement;
			private String exampleDesc;
			private List<String> examplePicList;

			public String getRequirement() {
				return requirement;
			}

			public PhotoRequirement setRequirement(String requirement) {
				this.requirement = requirement;
				return this;
			}

			public String getExampleDesc() {
				return exampleDesc;
			}

			public PhotoRequirement setExampleDesc(String exampleDesc) {
				this.exampleDesc = exampleDesc;
				return this;
			}

			public List<String> getExamplePicList() {
				return examplePicList;
			}

			public PhotoRequirement setExamplePicList(List<String> examplePicList) {
				this.examplePicList = examplePicList;
				return this;
			}
		}
	}
}
