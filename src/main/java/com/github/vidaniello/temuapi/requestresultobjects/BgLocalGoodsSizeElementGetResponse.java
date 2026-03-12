package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'bg.local.goods.size.element.get'.
 * Contains size specification element rules and information.
 */
public class BgLocalGoodsSizeElementGetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Size specification element rule.
	 */
	private SizeSpecElementRule sizeSpecElementRule;
		
	public BgLocalGoodsSizeElementGetResponse() {
	}
	
	/**
	 * @return the size specification element rule
	 */
	public SizeSpecElementRule getSizeSpecElementRule() {
		return sizeSpecElementRule;
	}
	
	/**
	 * @param sizeSpecElementRule the size specification element rule
	 * @return this response object for method chaining
	 */
	public BgLocalGoodsSizeElementGetResponse setSizeSpecElementRule(SizeSpecElementRule sizeSpecElementRule) {
		this.sizeSpecElementRule = sizeSpecElementRule;
		return this;
	}
	
	/**
	 * Inner class representing the size specification element rule.
	 */
	public static class SizeSpecElementRule {
		
		/**
		 * Category ID.
		 */
		private Integer catId;
		
		/**
		 * Size classification ID.
		 */
		private Integer classId;
		
		/**
		 * Flag to determine if a size chart is required for product in live.
		 */
		private Boolean isSizeChartRequired;
		
		/**
		 * Size classification name.
		 */
		private String className;
		
		/**
		 * Whether range intervals are supported.
		 */
		private Boolean allowRange;
		
		/**
		 * Current size specification element information.
		 */
		private Integer localCodeId;
		
		/**
		 * localCode Name.
		 */
		private String localCodeName;
		
		/**
		 * Size acquisition method: 0 = Get size from attribute template specifications, 1 = Predefined size.
		 */
		private Integer sizeSpecType;
		
		/**
		 * Current size specification element information.
		 */
		private List<SizeSpecElement> sizeSpecElementList;
		
		public SizeSpecElementRule() {
			this.sizeSpecElementList = new ArrayList<>();
		}
		
		public Integer getCatId() {
			return catId;
		}
		
		public SizeSpecElementRule setCatId(Integer catId) {
			this.catId = catId;
			return this;
		}
		
		public Integer getClassId() {
			return classId;
		}
		
		public SizeSpecElementRule setClassId(Integer classId) {
			this.classId = classId;
			return this;
		}
		
		public Boolean getIsSizeChartRequired() {
			return isSizeChartRequired;
		}
		
		public SizeSpecElementRule setIsSizeChartRequired(Boolean isSizeChartRequired) {
			this.isSizeChartRequired = isSizeChartRequired;
			return this;
		}
		
		public String getClassName() {
			return className;
		}
		
		public SizeSpecElementRule setClassName(String className) {
			this.className = className;
			return this;
		}
		
		public Boolean getAllowRange() {
			return allowRange;
		}
		
		public SizeSpecElementRule setAllowRange(Boolean allowRange) {
			this.allowRange = allowRange;
			return this;
		}
		
		public Integer getLocalCodeId() {
			return localCodeId;
		}
		
		public SizeSpecElementRule setLocalCodeId(Integer localCodeId) {
			this.localCodeId = localCodeId;
			return this;
		}
		
		public String getLocalCodeName() {
			return localCodeName;
		}
		
		public SizeSpecElementRule setLocalCodeName(String localCodeName) {
			this.localCodeName = localCodeName;
			return this;
		}
		
		public Integer getSizeSpecType() {
			return sizeSpecType;
		}
		
		public SizeSpecElementRule setSizeSpecType(Integer sizeSpecType) {
			this.sizeSpecType = sizeSpecType;
			return this;
		}
		
		public List<SizeSpecElement> getSizeSpecElementList() {
			return sizeSpecElementList;
		}
		
		public SizeSpecElementRule setSizeSpecElementList(List<SizeSpecElement> sizeSpecElementList) {
			this.sizeSpecElementList = sizeSpecElementList;
			return this;
		}
	}
	
	/**
	 * Inner class representing a size specification element.
	 */
	public static class SizeSpecElement {
		
		/**
		 * Element ID.
		 */
		private Integer elementId;
		
		/**
		 * Element name.
		 */
		private String elementName;
		
		/**
		 * Element type. 1 = Product element, 2 = Body element.
		 */
		private String type;
		
		/**
		 * Translated value of element name.
		 */
		private String value;
		
		/**
		 * Element measurement description.
		 */
		private String description;
		
		/**
		 * Whether the element is required (for sets).
		 */
		private Boolean necessary;
		
		/**
		 * Set size information.
		 */
		private List<SetElement> setElementList;
		
		public SizeSpecElement() {
			this.setElementList = new ArrayList<>();
		}
		
		public Integer getElementId() {
			return elementId;
		}
		
		public SizeSpecElement setElementId(Integer elementId) {
			this.elementId = elementId;
			return this;
		}
		
		public String getElementName() {
			return elementName;
		}
		
		public SizeSpecElement setElementName(String elementName) {
			this.elementName = elementName;
			return this;
		}
		
		public String getType() {
			return type;
		}
		
		public SizeSpecElement setType(String type) {
			this.type = type;
			return this;
		}
		
		public String getValue() {
			return value;
		}
		
		public SizeSpecElement setValue(String value) {
			this.value = value;
			return this;
		}
		
		public String getDescription() {
			return description;
		}
		
		public SizeSpecElement setDescription(String description) {
			this.description = description;
			return this;
		}
		
		public Boolean getNecessary() {
			return necessary;
		}
		
		public SizeSpecElement setNecessary(Boolean necessary) {
			this.necessary = necessary;
			return this;
		}
		
		public List<SetElement> getSetElementList() {
			return setElementList;
		}
		
		public SizeSpecElement setSetElementList(List<SetElement> setElementList) {
			this.setElementList = setElementList;
			return this;
		}
	}
	
	/**
	 * Inner class representing set size information.
	 */
	public static class SetElement {
		
		/**
		 * Category ID.
		 */
		private Integer catId;
		
		/**
		 * Size classification ID.
		 */
		private Integer classId;
		
		/**
		 * Size classification name.
		 */
		private String className;
		
		/**
		 * Whether range intervals are supported.
		 */
		private Boolean allowRange;
		
		/**
		 * Whether US size is required.
		 */
		private Boolean needUSSpec;
		
		/**
		 * localCode Id.
		 */
		private Integer localCodeId;
		
		/**
		 * localCode Name.
		 */
		private String localCodeName;
		
		/**
		 * Current size specification element information (for sets).
		 */
		private List<SizeSpecElement> sizeSpecElementList;
		
		public SetElement() {
			this.sizeSpecElementList = new ArrayList<>();
		}
		
		public Integer getCatId() {
			return catId;
		}
		
		public SetElement setCatId(Integer catId) {
			this.catId = catId;
			return this;
		}
		
		public Integer getClassId() {
			return classId;
		}
		
		public SetElement setClassId(Integer classId) {
			this.classId = classId;
			return this;
		}
		
		public String getClassName() {
			return className;
		}
		
		public SetElement setClassName(String className) {
			this.className = className;
			return this;
		}
		
		public Boolean getAllowRange() {
			return allowRange;
		}
		
		public SetElement setAllowRange(Boolean allowRange) {
			this.allowRange = allowRange;
			return this;
		}
		
		public Boolean getNeedUSSpec() {
			return needUSSpec;
		}
		
		public SetElement setNeedUSSpec(Boolean needUSSpec) {
			this.needUSSpec = needUSSpec;
			return this;
		}
		
		public Integer getLocalCodeId() {
			return localCodeId;
		}
		
		public SetElement setLocalCodeId(Integer localCodeId) {
			this.localCodeId = localCodeId;
			return this;
		}
		
		public String getLocalCodeName() {
			return localCodeName;
		}
		
		public SetElement setLocalCodeName(String localCodeName) {
			this.localCodeName = localCodeName;
			return this;
		}
		
		public List<SizeSpecElement> getSizeSpecElementList() {
			return sizeSpecElementList;
		}
		
		public SetElement setSizeSpecElementList(List<SizeSpecElement> sizeSpecElementList) {
			this.sizeSpecElementList = sizeSpecElementList;
			return this;
		}
	}
}