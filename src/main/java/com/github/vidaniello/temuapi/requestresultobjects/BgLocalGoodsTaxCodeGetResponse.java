package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'bg.local.goods.tax.code.get'.
 * Contains tax code information for a specific category.
 */
public class BgLocalGoodsTaxCodeGetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Item TaxCode List.
	 */
	private List<ItemTaxCodeInfo> itemTaxCodeList;
		
	public BgLocalGoodsTaxCodeGetResponse() {
		this.itemTaxCodeList = new ArrayList<>();
	}
	
	/**
	 * @return the list of item tax codes
	 */
	public List<ItemTaxCodeInfo> getItemTaxCodeList() {
		return itemTaxCodeList;
	}
	
	/**
	 * @param itemTaxCodeList the list of item tax codes
	 * @return this response object for method chaining
	 */
	public BgLocalGoodsTaxCodeGetResponse setItemTaxCodeList(List<ItemTaxCodeInfo> itemTaxCodeList) {
		this.itemTaxCodeList = itemTaxCodeList;
		return this;
	}
	
	/**
	 * Inner class representing item tax code information.
	 */
	public static class ItemTaxCodeInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Item TaxCode.
		 */
		private String itemTaxCode;
		
		/**
		 * The description of TaxCode.
		 */
		private String itemTaxCodeDesc;
		
		/**
		 * Whether a recommended product tax code.
		 */
		private Boolean isSuggest;
			
		public ItemTaxCodeInfo() {
		}
		
		/**
		 * @return the item TaxCode
		 */
		public String getItemTaxCode() {
			return itemTaxCode;
		}
		
		/**
		 * @param itemTaxCode the item TaxCode
		 * @return this object for method chaining
		 */
		public ItemTaxCodeInfo setItemTaxCode(String itemTaxCode) {
			this.itemTaxCode = itemTaxCode;
			return this;
		}
		
		/**
		 * @return the description of TaxCode
		 */
		public String getItemTaxCodeDesc() {
			return itemTaxCodeDesc;
		}
		
		/**
		 * @param itemTaxCodeDesc the description of TaxCode
		 * @return this object for method chaining
		 */
		public ItemTaxCodeInfo setItemTaxCodeDesc(String itemTaxCodeDesc) {
			this.itemTaxCodeDesc = itemTaxCodeDesc;
			return this;
		}
		
		/**
		 * @return whether a recommended product tax code
		 */
		public Boolean getIsSuggest() {
			return isSuggest;
		}
		
		/**
		 * @param isSuggest whether a recommended product tax code
		 * @return this object for method chaining
		 */
		public ItemTaxCodeInfo setIsSuggest(Boolean isSuggest) {
			this.isSuggest = isSuggest;
			return this;
		}
	}
}