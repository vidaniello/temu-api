package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'bg.local.goods.cats.get'.
 * Contains the list of goods categories.
 */
public class BgLocalGoodsCatsGetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Category information list.
	 */
	private List<GoodsCats> goodsCatsList;
		
	public BgLocalGoodsCatsGetResponse() {
		this.goodsCatsList = new ArrayList<>();
	}
	
	/**
	 * @return the category information list
	 */
	public List<GoodsCats> getGoodsCatsList() {
		return goodsCatsList;
	}
	
	/**
	 * @param goodsCatsList the category information list
	 * @return this response object for method chaining
	 */
	public BgLocalGoodsCatsGetResponse setGoodsCatsList(List<GoodsCats> goodsCatsList) {
		this.goodsCatsList = goodsCatsList;
		return this;
	}
	
	/**
	 * Inner class representing category information.
	 */
	public static class GoodsCats implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Category ID.
		 */
		private Long catId;
		
		/**
		 * Category Name.
		 */
		private String catName;
		
		/**
		 * Category Level: 
		 * 1 - Primary Category, 
		 * 2 - Secondary Category, 
		 * 3 - Tertiary Category, 
		 * 4 - Quaternary Category.
		 */
		private Integer level;
		
		/**
		 * Parent Category ID: The ID of the parent category.
		 * parent_id=0 indicates a top-level node.
		 */
		private Long parentId;
		
		/**
		 * Is Leaf Category.
		 */
		private Boolean leaf;
		
		/**
		 * Category Type: 
		 * 0 - Apparel, 
		 * 1 - Other.
		 */
		private Integer catType;
		
		/**
		 * Category status: 
		 * 0 - Available, 
		 * 1 - Not available.
		 */
		private Integer availableStatus;
		
		/**
		 * Expand category type: 
		 * 0 - Apparel, 
		 * 1 - Others, 
		 * 2 - Books, 
		 * 3 - DVD, 
		 * 4 - CD, 
		 * 5 - Seed.
		 */
		private Integer expandCatType;
		
		/**
		 * Whether second hand category.
		 */
		private Boolean secondHandCategory;
			
		public GoodsCats() {
		}
		
		/**
		 * @return the category ID
		 */
		public Long getCatId() {
			return catId;
		}
		
		/**
		 * @param catId the category ID
		 * @return this object for method chaining
		 */
		public GoodsCats setCatId(Long catId) {
			this.catId = catId;
			return this;
		}
		
		/**
		 * @return the category name
		 */
		public String getCatName() {
			return catName;
		}
		
		/**
		 * @param catName the category name
		 * @return this object for method chaining
		 */
		public GoodsCats setCatName(String catName) {
			this.catName = catName;
			return this;
		}
		
		/**
		 * @return the category level
		 */
		public Integer getLevel() {
			return level;
		}
		
		/**
		 * @param level the category level
		 * @return this object for method chaining
		 */
		public GoodsCats setLevel(Integer level) {
			this.level = level;
			return this;
		}
		
		/**
		 * @return the parent category ID
		 */
		public Long getParentId() {
			return parentId;
		}
		
		/**
		 * @param parentId the parent category ID
		 * @return this object for method chaining
		 */
		public GoodsCats setParentId(Long parentId) {
			this.parentId = parentId;
			return this;
		}
		
		/**
		 * @return true if leaf category, false otherwise
		 */
		public Boolean getLeaf() {
			return leaf;
		}
		
		/**
		 * @param leaf whether it is a leaf category
		 * @return this object for method chaining
		 */
		public GoodsCats setLeaf(Boolean leaf) {
			this.leaf = leaf;
			return this;
		}
		
		/**
		 * @return the category type
		 */
		public Integer getCatType() {
			return catType;
		}
		
		/**
		 * @param catType the category type
		 * @return this object for method chaining
		 */
		public GoodsCats setCatType(Integer catType) {
			this.catType = catType;
			return this;
		}
		
		/**
		 * @return the category available status
		 */
		public Integer getAvailableStatus() {
			return availableStatus;
		}
		
		/**
		 * @param availableStatus the category status
		 * @return this object for method chaining
		 */
		public GoodsCats setAvailableStatus(Integer availableStatus) {
			this.availableStatus = availableStatus;
			return this;
		}
		
		/**
		 * @return the expand category type
		 */
		public Integer getExpandCatType() {
			return expandCatType;
		}
		
		/**
		 * @param expandCatType the expand category type
		 * @return this object for method chaining
		 */
		public GoodsCats setExpandCatType(Integer expandCatType) {
			this.expandCatType = expandCatType;
			return this;
		}
		
		/**
		 * @return true if second hand category, false otherwise
		 */
		public Boolean getSecondHandCategory() {
			return secondHandCategory;
		}
		
		/**
		 * @param secondHandCategory whether it is a second hand category
		 * @return this object for method chaining
		 */
		public GoodsCats setSecondHandCategory(Boolean secondHandCategory) {
			this.secondHandCategory = secondHandCategory;
			return this;
		}
	}
}