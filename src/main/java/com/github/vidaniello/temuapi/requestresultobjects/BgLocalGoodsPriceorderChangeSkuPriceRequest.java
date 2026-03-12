package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'bg.local.goods.priceorder.change.sku.price'.
 * Used to change SKU prices for a goods item.
 */
public class BgLocalGoodsPriceorderChangeSkuPriceRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * The ID of the goods.
	 * Required parameter.
	 */
	private Long goodsId;
	
	/**
	 * List of SKU information and reasons for price adjustment.
	 * Required parameter.
	 */
	private List<ChangeSkuPriceDTO> changeSkuPriceDTOList;
	
	/**
	 * Whether to reject if price order is waiting for merchant confirmation.
	 * Optional parameter.
	 */
	private Boolean rejectSkuPricing;
		
	public BgLocalGoodsPriceorderChangeSkuPriceRequest() {
		this.changeSkuPriceDTOList = new ArrayList<>();
	}
	
	/**
	 * @return the goods ID
	 */
	public Long getGoodsId() {
		return goodsId;
	}
	
	/**
	 * @param goodsId the goods ID
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsPriceorderChangeSkuPriceRequest setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
		return this;
	}
	
	/**
	 * @return the list of SKU price change information
	 */
	public List<ChangeSkuPriceDTO> getChangeSkuPriceDTOList() {
		return changeSkuPriceDTOList;
	}
	
	/**
	 * @param changeSkuPriceDTOList the list of SKU price change information
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsPriceorderChangeSkuPriceRequest setChangeSkuPriceDTOList(List<ChangeSkuPriceDTO> changeSkuPriceDTOList) {
		this.changeSkuPriceDTOList = changeSkuPriceDTOList;
		return this;
	}
	
	/**
	 * @return whether to reject if price order is waiting for merchant confirmation
	 */
	public Boolean getRejectSkuPricing() {
		return rejectSkuPricing;
	}
	
	/**
	 * @param rejectSkuPricing whether to reject if price order is waiting for merchant confirmation
	 * @return this request object for method chaining
	 */
	public BgLocalGoodsPriceorderChangeSkuPriceRequest setRejectSkuPricing(Boolean rejectSkuPricing) {
		this.rejectSkuPricing = rejectSkuPricing;
		return this;
	}
	
	/**
	 * Inner class representing SKU information and reason for price adjustment.
	 */
	public static class ChangeSkuPriceDTO {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * The reason for adjusting the price.
		 * Optional parameter.
		 */
		private String reason;
		
		/**
		 * List of SKU information for price change.
		 * Required parameter.
		 */
		private List<SkuChangePriceBaseDTO> skuChangePriceBaseDTOList;
		
		public ChangeSkuPriceDTO() {
			this.skuChangePriceBaseDTOList = new ArrayList<>();
		}
		
		/**
		 * @return the reason for price adjustment
		 */
		public String getReason() {
			return reason;
		}
		
		/**
		 * @param reason the reason for price adjustment
		 * @return this DTO object for method chaining
		 */
		public ChangeSkuPriceDTO setReason(String reason) {
			this.reason = reason;
			return this;
		}
		
		/**
		 * @return the list of SKU information
		 */
		public List<SkuChangePriceBaseDTO> getSkuChangePriceBaseDTOList() {
			return skuChangePriceBaseDTOList;
		}
		
		/**
		 * @param skuChangePriceBaseDTOList the list of SKU information
		 * @return this DTO object for method chaining
		 */
		public ChangeSkuPriceDTO setSkuChangePriceBaseDTOList(List<SkuChangePriceBaseDTO> skuChangePriceBaseDTOList) {
			this.skuChangePriceBaseDTOList = skuChangePriceBaseDTOList;
			return this;
		}
	}
	
	/**
	 * Inner class representing SKU information for price change.
	 */
	public static class SkuChangePriceBaseDTO {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * The SKU ID.
		 * Required parameter.
		 */
		private Long skuId;
		
		/**
		 * The new supplier price.
		 * Required parameter.
		 */
		private NewSupplierPrice newSupplierPrice;
		
		public SkuChangePriceBaseDTO() {
		}
		
		/**
		 * @return the SKU ID
		 */
		public Long getSkuId() {
			return skuId;
		}
		
		/**
		 * @param skuId the SKU ID
		 * @return this DTO object for method chaining
		 */
		public SkuChangePriceBaseDTO setSkuId(Long skuId) {
			this.skuId = skuId;
			return this;
		}
		
		/**
		 * @return the new supplier price
		 */
		public NewSupplierPrice getNewSupplierPrice() {
			return newSupplierPrice;
		}
		
		/**
		 * @param newSupplierPrice the new supplier price
		 * @return this DTO object for method chaining
		 */
		public SkuChangePriceBaseDTO setNewSupplierPrice(NewSupplierPrice newSupplierPrice) {
			this.newSupplierPrice = newSupplierPrice;
			return this;
		}
	}
	
	/**
	 * Inner class representing the base price information.
	 */
	public static class NewSupplierPrice {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * The amount.
		 * Optional parameter.
		 */
		private String amount;
		
		/**
		 * The currency type.
		 * Optional parameter.
		 */
		private String currency;
		
		public NewSupplierPrice() {
		}
		
		/**
		 * @return the amount
		 */
		public String getAmount() {
			return amount;
		}
		
		/**
		 * @param amount the amount
		 * @return this price object for method chaining
		 */
		public NewSupplierPrice setAmount(String amount) {
			this.amount = amount;
			return this;
		}
		
		/**
		 * @return the currency type
		 */
		public String getCurrency() {
			return currency;
		}
		
		/**
		 * @param currency the currency type
		 * @return this price object for method chaining
		 */
		public NewSupplierPrice setCurrency(String currency) {
			this.currency = currency;
			return this;
		}
	}
}