package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'temu.local.product.variation.get'.
 * Contains product variation information for a specific category.
 */
public class TemuLocalProductVariationGetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Category id.
	 */
	private Long catId;
	
	/**
	 * Language.
	 */
	private String language;
	
	/**
	 * Variant information. Each product needs to have 1-2 parent specifications.
	 */
	private List<Variation> variations;
		
	public TemuLocalProductVariationGetResponse() {
		this.variations = new ArrayList<>();
	}
	
	/**
	 * @return the category id
	 */
	public Long getCatId() {
		return catId;
	}
	
	/**
	 * @param catId the category id
	 * @return this response object for method chaining
	 */
	public TemuLocalProductVariationGetResponse setCatId(Long catId) {
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
	public TemuLocalProductVariationGetResponse setLanguage(String language) {
		this.language = language;
		return this;
	}
	
	/**
	 * @return the list of variant information
	 */
	public List<Variation> getVariations() {
		return variations;
	}
	
	/**
	 * @param variations the list of variant information
	 * @return this response object for method chaining
	 */
	public TemuLocalProductVariationGetResponse setVariations(List<Variation> variations) {
		this.variations = variations;
		return this;
	}
	
	/**
	 * Inner class representing variant information.
	 * Each product needs to have 1-2 parent specifications.
	 */
	public static class Variation implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Parent specification ID.
		 */
		private Long parentSpecId;
		
		/**
		 * Parent specification name.
		 */
		private String parentSpecName;
		
		/**
		 * True: This parent specification is required; False: This parent specification is optional.
		 * When all parent specifications under a category are optional, you still need to select one 
		 * parent specification as the variant information.
		 */
		private Boolean required;
		
		/**
		 * Specification value type:
		 * 0 - Only preset values can be selected;
		 * 1 - Custom input specifications can be selected;
		 * 2 - Both preset and custom input specifications can be selected.
		 */
		private Integer variationType;
		
		/**
		 * Specification Value List.
		 */
		private List<SpecListItem> specList;
			
		public Variation() {
			this.specList = new ArrayList<>();
		}
		
		/**
		 * @return the parent specification ID
		 */
		public Long getParentSpecId() {
			return parentSpecId;
		}
		
		/**
		 * @param parentSpecId the parent specification ID
		 * @return this object for method chaining
		 */
		public Variation setParentSpecId(Long parentSpecId) {
			this.parentSpecId = parentSpecId;
			return this;
		}
		
		/**
		 * @return the parent specification name
		 */
		public String getParentSpecName() {
			return parentSpecName;
		}
		
		/**
		 * @param parentSpecName the parent specification name
		 * @return this object for method chaining
		 */
		public Variation setParentSpecName(String parentSpecName) {
			this.parentSpecName = parentSpecName;
			return this;
		}
		
		/**
		 * @return whether this parent specification is required
		 */
		public Boolean getRequired() {
			return required;
		}
		
		/**
		 * @param required whether this parent specification is required
		 * @return this object for method chaining
		 */
		public Variation setRequired(Boolean required) {
			this.required = required;
			return this;
		}
		
		/**
		 * @return the specification value type
		 */
		public Integer getVariationType() {
			return variationType;
		}
		
		/**
		 * @param variationType the specification value type
		 * @return this object for method chaining
		 */
		public Variation setVariationType(Integer variationType) {
			this.variationType = variationType;
			return this;
		}
		
		/**
		 * @return the specification value list
		 */
		public List<SpecListItem> getSpecList() {
			return specList;
		}
		
		/**
		 * @param specList the specification value list
		 * @return this object for method chaining
		 */
		public Variation setSpecList(List<SpecListItem> specList) {
			this.specList = specList;
			return this;
		}
	}
	
	/**
	 * Inner class representing a specification value item.
	 */
	public static class SpecListItem implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Specification value id.
		 */
		private Long specId;
		
		/**
		 * Specification value name.
		 */
		private String specName;
		
		/**
		 * Specification value group id.
		 */
		private Integer groupId;
		
		/**
		 * Specification value group name.
		 */
		private String groupName;
		
		/**
		 * Specification value subgroup id.
		 */
		private Integer subGroupId;
		
		/**
		 * Specification Value Subgroup Name.
		 */
		private String subGroupName;
			
		public SpecListItem() {
		}
		
		/**
		 * @return the specification value id
		 */
		public Long getSpecId() {
			return specId;
		}
		
		/**
		 * @param specId the specification value id
		 * @return this object for method chaining
		 */
		public SpecListItem setSpecId(Long specId) {
			this.specId = specId;
			return this;
		}
		
		/**
		 * @return the specification value name
		 */
		public String getSpecName() {
			return specName;
		}
		
		/**
		 * @param specName the specification value name
		 * @return this object for method chaining
		 */
		public SpecListItem setSpecName(String specName) {
			this.specName = specName;
			return this;
		}
		
		/**
		 * @return the specification value group id
		 */
		public Integer getGroupId() {
			return groupId;
		}
		
		/**
		 * @param groupId the specification value group id
		 * @return this object for method chaining
		 */
		public SpecListItem setGroupId(Integer groupId) {
			this.groupId = groupId;
			return this;
		}
		
		/**
		 * @return the specification value group name
		 */
		public String getGroupName() {
			return groupName;
		}
		
		/**
		 * @param groupName the specification value group name
		 * @return this object for method chaining
		 */
		public SpecListItem setGroupName(String groupName) {
			this.groupName = groupName;
			return this;
		}
		
		/**
		 * @return the specification value subgroup id
		 */
		public Integer getSubGroupId() {
			return subGroupId;
		}
		
		/**
		 * @param subGroupId the specification value subgroup id
		 * @return this object for method chaining
		 */
		public SpecListItem setSubGroupId(Integer subGroupId) {
			this.subGroupId = subGroupId;
			return this;
		}
		
		/**
		 * @return the specification value subgroup name
		 */
		public String getSubGroupName() {
			return subGroupName;
		}
		
		/**
		 * @param subGroupName the specification value subgroup name
		 * @return this object for method chaining
		 */
		public SpecListItem setSubGroupName(String subGroupName) {
			this.subGroupName = subGroupName;
			return this;
		}
	}
}