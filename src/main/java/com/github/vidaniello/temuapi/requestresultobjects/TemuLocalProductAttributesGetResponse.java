package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'temu.local.product.attributes.get'.
 * Contains product attributes for a specific category.
 */
public class TemuLocalProductAttributesGetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Leaf category id.
	 */
	private Long catId;
	
	/**
	 * Language.
	 */
	private String language;
	
	/**
	 * Product attributes list.
	 */
	private List<AttributeInfo> attributeList;
		
	public TemuLocalProductAttributesGetResponse() {
		this.attributeList = new ArrayList<>();
	}
	
	/**
	 * @return the leaf category id
	 */
	public Long getCatId() {
		return catId;
	}
	
	/**
	 * @param catId the leaf category id
	 * @return this response object for method chaining
	 */
	public TemuLocalProductAttributesGetResponse setCatId(Long catId) {
		this.catId = catId;
		return this;
	}
	
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	
	/**
	 * @param language the language
	 * @return this response object for method chaining
	 */
	public TemuLocalProductAttributesGetResponse setLanguage(String language) {
		this.language = language;
		return this;
	}
	
	/**
	 * @return the product attributes list
	 */
	public List<AttributeInfo> getAttributeList() {
		return attributeList;
	}
	
	/**
	 * @param attributeList the product attributes list
	 * @return this response object for method chaining
	 */
	public TemuLocalProductAttributesGetResponse setAttributeList(List<AttributeInfo> attributeList) {
		this.attributeList = attributeList;
		return this;
	}
	
	/**
	 * Inner class representing product attribute information.
	 */
	public static class AttributeInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Attribute ID.
		 */
		private Long refPid;
		
		/**
		 * Attribute name.
		 */
		private String attributeName;
		
		/**
		 * True: This attribute is required; False: This attribute is optional.
		 */
		private Boolean required;
		
		/**
		 * Attribute rules.
		 */
		private AttributeRules attributeRules;
		
		/**
		 * Attribute value details.
		 */
		private List<AttributeValueDetail> attributeValueDetail;
		
		/**
		 * Attribute value unit.
		 */
		private List<AttributeValueUnit> attributeValueUnitList;
			
		public AttributeInfo() {
			this.attributeValueDetail = new ArrayList<>();
			this.attributeValueUnitList = new ArrayList<>();
		}
		
		/**
		 * @return the attribute ID
		 */
		public Long getRefPid() {
			return refPid;
		}
		
		/**
		 * @param refPid the attribute ID
		 * @return this object for method chaining
		 */
		public AttributeInfo setRefPid(Long refPid) {
			this.refPid = refPid;
			return this;
		}
		
		/**
		 * @return the attribute name
		 */
		public String getAttributeName() {
			return attributeName;
		}
		
		/**
		 * @param attributeName the attribute name
		 * @return this object for method chaining
		 */
		public AttributeInfo setAttributeName(String attributeName) {
			this.attributeName = attributeName;
			return this;
		}
		
		/**
		 * @return true if this attribute is required, false if optional
		 */
		public Boolean getRequired() {
			return required;
		}
		
		/**
		 * @param required true if this attribute is required, false if optional
		 * @return this object for method chaining
		 */
		public AttributeInfo setRequired(Boolean required) {
			this.required = required;
			return this;
		}
		
		/**
		 * @return the attribute rules
		 */
		public AttributeRules getAttributeRules() {
			return attributeRules;
		}
		
		/**
		 * @param attributeRules the attribute rules
		 * @return this object for method chaining
		 */
		public AttributeInfo setAttributeRules(AttributeRules attributeRules) {
			this.attributeRules = attributeRules;
			return this;
		}
		
		/**
		 * @return the attribute value details
		 */
		public List<AttributeValueDetail> getAttributeValueDetail() {
			return attributeValueDetail;
		}
		
		/**
		 * @param attributeValueDetail the attribute value details
		 * @return this object for method chaining
		 */
		public AttributeInfo setAttributeValueDetail(List<AttributeValueDetail> attributeValueDetail) {
			this.attributeValueDetail = attributeValueDetail;
			return this;
		}
		
		/**
		 * @return the attribute value unit list
		 */
		public List<AttributeValueUnit> getAttributeValueUnitList() {
			return attributeValueUnitList;
		}
		
		/**
		 * @param attributeValueUnitList the attribute value unit list
		 * @return this object for method chaining
		 */
		public AttributeInfo setAttributeValueUnitList(List<AttributeValueUnit> attributeValueUnitList) {
			this.attributeValueUnitList = attributeValueUnitList;
			return this;
		}
	}
	
	/**
	 * Inner class representing attribute rules.
	 */
	public static class AttributeRules implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Control Types:
		 * 0 – Input only: Users can only enter a value manually.
		 * 1 – Selection only: Users can only choose from predefined options.
		 * 5 – Single date (YYYY-MM-DD): Date format with year, month, and day.
		 * 6 – Date range (YYYY-MM-DD,YYYY-MM-DD): Date format with start and end date.
		 * 7 – Single month (YYYY-MM): Month format with year and month.
		 * 8 – Month range (YYYY-MM,YYYY-MM): Month format with start and end month.
		 * 16 – Input and selection required: Users must both enter a value and select an option.
		 * 19 – Input or selection (either one): Users can choose either to enter a value or select an option.
		 */
		private Integer controlType;
		
		/**
		 * Maximum number of attribute values that can be selected for this attribute.
		 */
		private Integer chooseMaxNum;
		
		/**
		 * This field has a value when costTemplateId is entered.
		 * True: This attribute is a cross-border attribute.
		 * False: This attribute is not a cross-border attribute.
		 * The cross-border attribute information must be filled in; if this information is missing,
		 * the product cannot be listed for sale.
		 */
		private Boolean transnationalAttribute;
		
		/**
		 * Attribute value rules.
		 */
		private AttributeValueRules attributeValueRules;
			
		public AttributeRules() {
		}
		
		/**
		 * @return the control type
		 */
		public Integer getControlType() {
			return controlType;
		}
		
		/**
		 * @param controlType the control type
		 * @return this object for method chaining
		 */
		public AttributeRules setControlType(Integer controlType) {
			this.controlType = controlType;
			return this;
		}
		
		/**
		 * @return the maximum number of attribute values that can be selected
		 */
		public Integer getChooseMaxNum() {
			return chooseMaxNum;
		}
		
		/**
		 * @param chooseMaxNum the maximum number of attribute values that can be selected
		 * @return this object for method chaining
		 */
		public AttributeRules setChooseMaxNum(Integer chooseMaxNum) {
			this.chooseMaxNum = chooseMaxNum;
			return this;
		}
		
		/**
		 * @return true if this attribute is a cross-border attribute
		 */
		public Boolean getTransnationalAttribute() {
			return transnationalAttribute;
		}
		
		/**
		 * @param transnationalAttribute true if this attribute is a cross-border attribute
		 * @return this object for method chaining
		 */
		public AttributeRules setTransnationalAttribute(Boolean transnationalAttribute) {
			this.transnationalAttribute = transnationalAttribute;
			return this;
		}
		
		/**
		 * @return the attribute value rules
		 */
		public AttributeValueRules getAttributeValueRules() {
			return attributeValueRules;
		}
		
		/**
		 * @param attributeValueRules the attribute value rules
		 * @return this object for method chaining
		 */
		public AttributeRules setAttributeValueRules(AttributeValueRules attributeValueRules) {
			this.attributeValueRules = attributeValueRules;
			return this;
		}
	}
	
	/**
	 * Inner class representing attribute value rules.
	 */
	public static class AttributeValueRules implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Maximum input value: text type represents the maximum length of text;
		 * numeric type represents the maximum numeric value;
		 * and time type represents the maximum time value.
		 */
		private String maxValue;
		
		/**
		 * Minimum input value: text type represents the minimum length of text;
		 * numeric type represents the minimum numeric value;
		 * and time type represents the minimum time value.
		 */
		private String minValue;
		
		/**
		 * The maximum number of decimal places allowed. A value of 0 means decimals are not allowed.
		 */
		private Integer valuePrecision;
		
		/**
		 * Numeric validation rules:
		 * 1. The sum of all input values must equal 100.
		 * 2. Only letters, numbers, and special characters are allowed.
		 */
		private Integer valueRule;
		
		/**
		 * The title of the attribute selection. Used to describe the name of the attribute itself,
		 * such as "Material" in a composition attribute.
		 */
		private String propertyChooseTitle;
		
		/**
		 * The title of the numeric input field. Used to describe the name of the value to be entered,
		 * such as "Percentage" in a composition attribute.
		 */
		private String numberInputTitle;
			
		public AttributeValueRules() {
		}
		
		/**
		 * @return the maximum input value
		 */
		public String getMaxValue() {
			return maxValue;
		}
		
		/**
		 * @param maxValue the maximum input value
		 * @return this object for method chaining
		 */
		public AttributeValueRules setMaxValue(String maxValue) {
			this.maxValue = maxValue;
			return this;
		}
		
		/**
		 * @return the minimum input value
		 */
		public String getMinValue() {
			return minValue;
		}
		
		/**
		 * @param minValue the minimum input value
		 * @return this object for method chaining
		 */
		public AttributeValueRules setMinValue(String minValue) {
			this.minValue = minValue;
			return this;
		}
		
		/**
		 * @return the maximum number of decimal places allowed
		 */
		public Integer getValuePrecision() {
			return valuePrecision;
		}
		
		/**
		 * @param valuePrecision the maximum number of decimal places allowed
		 * @return this object for method chaining
		 */
		public AttributeValueRules setValuePrecision(Integer valuePrecision) {
			this.valuePrecision = valuePrecision;
			return this;
		}
		
		/**
		 * @return the numeric validation rules
		 */
		public Integer getValueRule() {
			return valueRule;
		}
		
		/**
		 * @param valueRule the numeric validation rules
		 * @return this object for method chaining
		 */
		public AttributeValueRules setValueRule(Integer valueRule) {
			this.valueRule = valueRule;
			return this;
		}
		
		/**
		 * @return the title of the attribute selection
		 */
		public String getPropertyChooseTitle() {
			return propertyChooseTitle;
		}
		
		/**
		 * @param propertyChooseTitle the title of the attribute selection
		 * @return this object for method chaining
		 */
		public AttributeValueRules setPropertyChooseTitle(String propertyChooseTitle) {
			this.propertyChooseTitle = propertyChooseTitle;
			return this;
		}
		
		/**
		 * @return the title of the numeric input field
		 */
		public String getNumberInputTitle() {
			return numberInputTitle;
		}
		
		/**
		 * @param numberInputTitle the title of the numeric input field
		 * @return this object for method chaining
		 */
		public AttributeValueRules setNumberInputTitle(String numberInputTitle) {
			this.numberInputTitle = numberInputTitle;
			return this;
		}
	}
	
	/**
	 * Inner class representing attribute value detail.
	 */
	public static class AttributeValueDetail implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Attribute value group id.
		 */
		private String groupId;
		
		/**
		 * Attribute value list.
		 */
		private List<AttributeValue> attributeValueList;
			
		public AttributeValueDetail() {
			this.attributeValueList = new ArrayList<>();
		}
		
		/**
		 * @return the attribute value group id
		 */
		public String getGroupId() {
			return groupId;
		}
		
		/**
		 * @param groupId the attribute value group id
		 * @return this object for method chaining
		 */
		public AttributeValueDetail setGroupId(String groupId) {
			this.groupId = groupId;
			return this;
		}
		
		/**
		 * @return the attribute value list
		 */
		public List<AttributeValue> getAttributeValueList() {
			return attributeValueList;
		}
		
		/**
		 * @param attributeValueList the attribute value list
		 * @return this object for method chaining
		 */
		public AttributeValueDetail setAttributeValueList(List<AttributeValue> attributeValueList) {
			this.attributeValueList = attributeValueList;
			return this;
		}
	}
	
	/**
	 * Inner class representing attribute value.
	 */
	public static class AttributeValue implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Attribute value ID.
		 */
		private Long vid;
		
		/**
		 * Attribute value name.
		 */
		private String value;
		
		/**
		 * Child attribute information.
		 * When you select a parent attribute value, the available child attributes and the selectable values
		 * for those child attributes are determined by the selected parent value.
		 * Even if the same child attribute appears under different parent attribute values,
		 * the range of selectable child attribute values may differ.
		 */
		private List<ChildAttribute> childAttribute;
			
		public AttributeValue() {
			this.childAttribute = new ArrayList<>();
		}
		
		/**
		 * @return the attribute value ID
		 */
		public Long getVid() {
			return vid;
		}
		
		/**
		 * @param vid the attribute value ID
		 * @return this object for method chaining
		 */
		public AttributeValue setVid(Long vid) {
			this.vid = vid;
			return this;
		}
		
		/**
		 * @return the attribute value name
		 */
		public String getValue() {
			return value;
		}
		
		/**
		 * @param value the attribute value name
		 * @return this object for method chaining
		 */
		public AttributeValue setValue(String value) {
			this.value = value;
			return this;
		}
		
		/**
		 * @return the child attribute information
		 */
		public List<ChildAttribute> getChildAttribute() {
			return childAttribute;
		}
		
		/**
		 * @param childAttribute the child attribute information
		 * @return this object for method chaining
		 */
		public AttributeValue setChildAttribute(List<ChildAttribute> childAttribute) {
			this.childAttribute = childAttribute;
			return this;
		}
	}
	
	/**
	 * Inner class representing child attribute information.
	 */
	public static class ChildAttribute implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Child attributes id.
		 */
		private Long childAttributeId;
		
		/**
		 * Child attribute value group id.
		 */
		private String childAttributeValueGroupId;
			
		public ChildAttribute() {
		}
		
		/**
		 * @return the child attributes id
		 */
		public Long getChildAttributeId() {
			return childAttributeId;
		}
		
		/**
		 * @param childAttributeId the child attributes id
		 * @return this object for method chaining
		 */
		public ChildAttribute setChildAttributeId(Long childAttributeId) {
			this.childAttributeId = childAttributeId;
			return this;
		}
		
		/**
		 * @return the child attribute value group id
		 */
		public String getChildAttributeValueGroupId() {
			return childAttributeValueGroupId;
		}
		
		/**
		 * @param childAttributeValueGroupId the child attribute value group id
		 * @return this object for method chaining
		 */
		public ChildAttribute setChildAttributeValueGroupId(String childAttributeValueGroupId) {
			this.childAttributeValueGroupId = childAttributeValueGroupId;
			return this;
		}
	}
	
	/**
	 * Inner class representing attribute value unit.
	 */
	public static class AttributeValueUnit implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Unit Name.
		 */
		private String valueUnitName;
		
		/**
		 * The ID corresponding to the unit name.
		 */
		private Long valueUnitId;
			
		public AttributeValueUnit() {
		}
		
		/**
		 * @return the unit name
		 */
		public String getValueUnitName() {
			return valueUnitName;
		}
		
		/**
		 * @param valueUnitName the unit name
		 * @return this object for method chaining
		 */
		public AttributeValueUnit setValueUnitName(String valueUnitName) {
			this.valueUnitName = valueUnitName;
			return this;
		}
		
		/**
		 * @return the ID corresponding to the unit name
		 */
		public Long getValueUnitId() {
			return valueUnitId;
		}
		
		/**
		 * @param valueUnitId the ID corresponding to the unit name
		 * @return this object for method chaining
		 */
		public AttributeValueUnit setValueUnitId(Long valueUnitId) {
			this.valueUnitId = valueUnitId;
			return this;
		}
	}
}