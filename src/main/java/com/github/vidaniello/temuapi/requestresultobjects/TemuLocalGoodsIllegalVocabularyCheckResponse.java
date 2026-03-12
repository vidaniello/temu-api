package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'temu.local.goods.illegal.vocabulary.check'.
 * Contains the result of the illegal vocabulary check operation.
 */
public class TemuLocalGoodsIllegalVocabularyCheckResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * The result of illegal vocabulary check.
	 * Possible values: PASS, FAILED
	 */
	private String checkResult;
	
	/**
	 * A list of failure reasons if checkResult is FAILED.
	 */
	private List<FailReason> failReasonList;
		
	public TemuLocalGoodsIllegalVocabularyCheckResponse() {
		this.failReasonList = new ArrayList<>();
	}
	
	/**
	 * @return the check result
	 */
	public String getCheckResult() {
		return checkResult;
	}
	
	/**
	 * @param checkResult the check result
	 * @return this response object for method chaining
	 */
	public TemuLocalGoodsIllegalVocabularyCheckResponse setCheckResult(String checkResult) {
		this.checkResult = checkResult;
		return this;
	}
	
	/**
	 * @return the list of failure reasons
	 */
	public List<FailReason> getFailReasonList() {
		return failReasonList;
	}
	
	/**
	 * @param failReasonList the list of failure reasons
	 * @return this response object for method chaining
	 */
	public TemuLocalGoodsIllegalVocabularyCheckResponse setFailReasonList(List<FailReason> failReasonList) {
		this.failReasonList = failReasonList;
		return this;
	}
	
	/**
	 * Inner class representing a failure reason.
	 */
	public static class FailReason {
		
		/**
		 * Violation item.
		 * Possible values: GOODS_NAME, GOODS_DESCRIPTION, BULLET_POINTS
		 */
		private String violationItem;
		
		/**
		 * Violation warning content list.
		 */
		private List<ViolationWarningContent> violationWarningContentList;
		
		public FailReason() {
			this.violationWarningContentList = new ArrayList<>();
		}
		
		/**
		 * @return the violation item
		 */
		public String getViolationItem() {
			return violationItem;
		}
		
		/**
		 * @param violationItem the violation item
		 * @return this fail reason object for method chaining
		 */
		public FailReason setViolationItem(String violationItem) {
			this.violationItem = violationItem;
			return this;
		}
		
		/**
		 * @return the violation warning content list
		 */
		public List<ViolationWarningContent> getViolationWarningContentList() {
			return violationWarningContentList;
		}
		
		/**
		 * @param violationWarningContentList the violation warning content list
		 * @return this fail reason object for method chaining
		 */
		public FailReason setViolationWarningContentList(List<ViolationWarningContent> violationWarningContentList) {
			this.violationWarningContentList = violationWarningContentList;
			return this;
		}
	}
	
	/**
	 * Inner class representing a violation warning content.
	 */
	public static class ViolationWarningContent {
		
		/**
		 * Violation type.
		 * Possible values: Potentially Infringing Terms, Environmental Claims, Doctor-Endorsed Claims
		 */
		private String violationType;
		
		/**
		 * Warning text.
		 */
		private String warning;
		
		public ViolationWarningContent() {
		}
		
		/**
		 * @return the violation type
		 */
		public String getViolationType() {
			return violationType;
		}
		
		/**
		 * @param violationType the violation type
		 * @return this violation warning content object for method chaining
		 */
		public ViolationWarningContent setViolationType(String violationType) {
			this.violationType = violationType;
			return this;
		}
		
		/**
		 * @return the warning text
		 */
		public String getWarning() {
			return warning;
		}
		
		/**
		 * @param warning the warning text
		 * @return this violation warning content object for method chaining
		 */
		public ViolationWarningContent setWarning(String warning) {
			this.warning = warning;
			return this;
		}
	}
}