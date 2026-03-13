package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'bg.order.amount.query'.
 * Contains order amount information.
 */
public class BgOrderAmountQueryResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Parent order information.
	 */
	private ParentOrderMap parentOrderMap;
	
	/**
	 * Order information list.
	 */
	private List<OrderInfo> orderList;
	
	/**
	 * Warning message list.
	 */
	private List<String> warning;
		
	public BgOrderAmountQueryResponse() {
		this.orderList = new ArrayList<>();
		this.warning = new ArrayList<>();
	}
	
	/**
	 * @return the parent order information
	 */
	public ParentOrderMap getParentOrderMap() {
		return parentOrderMap;
	}
	
	/**
	 * @param parentOrderMap the parent order information
	 * @return this response object for method chaining
	 */
	public BgOrderAmountQueryResponse setParentOrderMap(ParentOrderMap parentOrderMap) {
		this.parentOrderMap = parentOrderMap;
		return this;
	}
	
	/**
	 * @return the order information list
	 */
	public List<OrderInfo> getOrderList() {
		return orderList;
	}
	
	/**
	 * @param orderList the order information list
	 * @return this response object for method chaining
	 */
	public BgOrderAmountQueryResponse setOrderList(List<OrderInfo> orderList) {
		this.orderList = orderList;
		return this;
	}
	
	/**
	 * @return the warning message list
	 */
	public List<String> getWarning() {
		return warning;
	}
	
	/**
	 * @param warning the warning message list
	 * @return this response object for method chaining
	 */
	public BgOrderAmountQueryResponse setWarning(List<String> warning) {
		this.warning = warning;
		return this;
	}
	
	/**
	 * Inner class representing monetary amount.
	 */
	public static class Money implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Currency.
		 */
		private String currency;
		
		/**
		 * The minimum currency unit of the local currency.
		 * Example: United States: Cents.
		 */
		private Long amount;
		
		public Money() {
		}
		
		/**
		 * @return the currency
		 */
		public String getCurrency() {
			return currency;
		}
		
		/**
		 * @param currency the currency
		 * @return this object for method chaining
		 */
		public Money setCurrency(String currency) {
			this.currency = currency;
			return this;
		}
		
		/**
		 * @return the amount
		 */
		public Long getAmount() {
			return amount;
		}
		
		/**
		 * @param amount the amount
		 * @return this object for method chaining
		 */
		public Money setAmount(Long amount) {
			this.amount = amount;
			return this;
		}
	}
	
	/**
	 * Inner class representing parent order information.
	 */
	public static class ParentOrderMap implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Parent order number.
		 */
		private String parentOrderSn;
		
		/**
		 * Total base price.
		 */
		private Money basePriceTotal;
		
		/**
		 * Shipping fee (vat excl).
		 */
		private Money shippingAmountTotal;
		
		/**
		 * Consumer's paid tax: Calculated on realPrice.
		 */
		private Money taxTotal;
		
		/**
		 * Tax total after discount.
		 */
		private Money taxTotalAfterDiscount;
		
		/**
		 * Discount from seller.
		 */
		private Money discountFromSeller;
		
		/**
		 * Discount from Temu.
		 */
		private Money discountFromTEMU;
		
		/**
		 * Refunds total.
		 */
		private Money refundsTotal;
		
		/**
		 * Estimated revenue deduction.
		 */
		private Money estimatedRevenueDeduction;
		
		/**
		 * Estimated revenue.
		 */
		private Money estimatedRevenue;
		
		/**
		 * Payment of the order from the customer.
		 */
		private Money customerPaid;
		
		/**
		 * The amount of discount.
		 */
		private Money totalDiscount;
		
		/**
		 * Total promotional sale price of the products. (Vat Inc).
		 */
		private Money retailPriceTotalTaxIncl;
		
		/**
		 * Total promotional sale price of the products. (vat excl).
		 */
		private Money retailPriceTotalTaxExcl;
		
		/**
		 * Total product tax amount of this order.
		 */
		private Money productTaxAmount;
		
		/**
		 * Total ship tax amount of this order.
		 */
		private Money shipTaxAmount;
		
		/**
		 * Shipping fee (Vat Inc).
		 */
		private Money shipAmountTotalTaxIncl;
		
		/**
		 * When the platform subsidizes a product: the realPrice is lower than the basePrice.
		 */
		private Money temuTaxTotal;
		
		public ParentOrderMap() {
		}
		
		/**
		 * @return the parent order number
		 */
		public String getParentOrderSn() {
			return parentOrderSn;
		}
		
		/**
		 * @param parentOrderSn the parent order number
		 * @return this object for method chaining
		 */
		public ParentOrderMap setParentOrderSn(String parentOrderSn) {
			this.parentOrderSn = parentOrderSn;
			return this;
		}
		
		/**
		 * @return the total base price
		 */
		public Money getBasePriceTotal() {
			return basePriceTotal;
		}
		
		/**
		 * @param basePriceTotal the total base price
		 * @return this object for method chaining
		 */
		public ParentOrderMap setBasePriceTotal(Money basePriceTotal) {
			this.basePriceTotal = basePriceTotal;
			return this;
		}
		
		/**
		 * @return the shipping fee (vat excl)
		 */
		public Money getShippingAmountTotal() {
			return shippingAmountTotal;
		}
		
		/**
		 * @param shippingAmountTotal the shipping fee (vat excl)
		 * @return this object for method chaining
		 */
		public ParentOrderMap setShippingAmountTotal(Money shippingAmountTotal) {
			this.shippingAmountTotal = shippingAmountTotal;
			return this;
		}
		
		/**
		 * @return the consumer's paid tax
		 */
		public Money getTaxTotal() {
			return taxTotal;
		}
		
		/**
		 * @param taxTotal the consumer's paid tax
		 * @return this object for method chaining
		 */
		public ParentOrderMap setTaxTotal(Money taxTotal) {
			this.taxTotal = taxTotal;
			return this;
		}
		
		/**
		 * @return the tax total after discount
		 */
		public Money getTaxTotalAfterDiscount() {
			return taxTotalAfterDiscount;
		}
		
		/**
		 * @param taxTotalAfterDiscount the tax total after discount
		 * @return this object for method chaining
		 */
		public ParentOrderMap setTaxTotalAfterDiscount(Money taxTotalAfterDiscount) {
			this.taxTotalAfterDiscount = taxTotalAfterDiscount;
			return this;
		}
		
		/**
		 * @return the discount from seller
		 */
		public Money getDiscountFromSeller() {
			return discountFromSeller;
		}
		
		/**
		 * @param discountFromSeller the discount from seller
		 * @return this object for method chaining
		 */
		public ParentOrderMap setDiscountFromSeller(Money discountFromSeller) {
			this.discountFromSeller = discountFromSeller;
			return this;
		}
		
		/**
		 * @return the discount from Temu
		 */
		public Money getDiscountFromTEMU() {
			return discountFromTEMU;
		}
		
		/**
		 * @param discountFromTEMU the discount from Temu
		 * @return this object for method chaining
		 */
		public ParentOrderMap setDiscountFromTEMU(Money discountFromTEMU) {
			this.discountFromTEMU = discountFromTEMU;
			return this;
		}
		
		/**
		 * @return the refunds total
		 */
		public Money getRefundsTotal() {
			return refundsTotal;
		}
		
		/**
		 * @param refundsTotal the refunds total
		 * @return this object for method chaining
		 */
		public ParentOrderMap setRefundsTotal(Money refundsTotal) {
			this.refundsTotal = refundsTotal;
			return this;
		}
		
		/**
		 * @return the estimated revenue deduction
		 */
		public Money getEstimatedRevenueDeduction() {
			return estimatedRevenueDeduction;
		}
		
		/**
		 * @param estimatedRevenueDeduction the estimated revenue deduction
		 * @return this object for method chaining
		 */
		public ParentOrderMap setEstimatedRevenueDeduction(Money estimatedRevenueDeduction) {
			this.estimatedRevenueDeduction = estimatedRevenueDeduction;
			return this;
		}
		
		/**
		 * @return the estimated revenue
		 */
		public Money getEstimatedRevenue() {
			return estimatedRevenue;
		}
		
		/**
		 * @param estimatedRevenue the estimated revenue
		 * @return this object for method chaining
		 */
		public ParentOrderMap setEstimatedRevenue(Money estimatedRevenue) {
			this.estimatedRevenue = estimatedRevenue;
			return this;
		}
		
		/**
		 * @return the customer paid amount
		 */
		public Money getCustomerPaid() {
			return customerPaid;
		}
		
		/**
		 * @param customerPaid the customer paid amount
		 * @return this object for method chaining
		 */
		public ParentOrderMap setCustomerPaid(Money customerPaid) {
			this.customerPaid = customerPaid;
			return this;
		}
		
		/**
		 * @return the total discount
		 */
		public Money getTotalDiscount() {
			return totalDiscount;
		}
		
		/**
		 * @param totalDiscount the total discount
		 * @return this object for method chaining
		 */
		public ParentOrderMap setTotalDiscount(Money totalDiscount) {
			this.totalDiscount = totalDiscount;
			return this;
		}
		
		/**
		 * @return the retail price total tax incl
		 */
		public Money getRetailPriceTotalTaxIncl() {
			return retailPriceTotalTaxIncl;
		}
		
		/**
		 * @param retailPriceTotalTaxIncl the retail price total tax incl
		 * @return this object for method chaining
		 */
		public ParentOrderMap setRetailPriceTotalTaxIncl(Money retailPriceTotalTaxIncl) {
			this.retailPriceTotalTaxIncl = retailPriceTotalTaxIncl;
			return this;
		}
		
		/**
		 * @return the retail price total tax excl
		 */
		public Money getRetailPriceTotalTaxExcl() {
			return retailPriceTotalTaxExcl;
		}
		
		/**
		 * @param retailPriceTotalTaxExcl the retail price total tax excl
		 * @return this object for method chaining
		 */
		public ParentOrderMap setRetailPriceTotalTaxExcl(Money retailPriceTotalTaxExcl) {
			this.retailPriceTotalTaxExcl = retailPriceTotalTaxExcl;
			return this;
		}
		
		/**
		 * @return the product tax amount
		 */
		public Money getProductTaxAmount() {
			return productTaxAmount;
		}
		
		/**
		 * @param productTaxAmount the product tax amount
		 * @return this object for method chaining
		 */
		public ParentOrderMap setProductTaxAmount(Money productTaxAmount) {
			this.productTaxAmount = productTaxAmount;
			return this;
		}
		
		/**
		 * @return the ship tax amount
		 */
		public Money getShipTaxAmount() {
			return shipTaxAmount;
		}
		
		/**
		 * @param shipTaxAmount the ship tax amount
		 * @return this object for method chaining
		 */
		public ParentOrderMap setShipTaxAmount(Money shipTaxAmount) {
			this.shipTaxAmount = shipTaxAmount;
			return this;
		}
		
		/**
		 * @return the ship amount total tax incl
		 */
		public Money getShipAmountTotalTaxIncl() {
			return shipAmountTotalTaxIncl;
		}
		
		/**
		 * @param shipAmountTotalTaxIncl the ship amount total tax incl
		 * @return this object for method chaining
		 */
		public ParentOrderMap setShipAmountTotalTaxIncl(Money shipAmountTotalTaxIncl) {
			this.shipAmountTotalTaxIncl = shipAmountTotalTaxIncl;
			return this;
		}
		
		/**
		 * @return the temu tax total
		 */
		public Money getTemuTaxTotal() {
			return temuTaxTotal;
		}
		
		/**
		 * @param temuTaxTotal the temu tax total
		 * @return this object for method chaining
		 */
		public ParentOrderMap setTemuTaxTotal(Money temuTaxTotal) {
			this.temuTaxTotal = temuTaxTotal;
			return this;
		}
	}
	
	/**
	 * Inner class representing order information.
	 */
	public static class OrderInfo implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Order number (sub-order number).
		 */
		private String orderSn;
		
		/**
		 * Base Price.
		 */
		private Money basePrice;
		
		/**
		 * Unit base price.
		 */
		private Money unitBasePrice;
		
		/**
		 * Unit retail price (Vat Incl).
		 */
		private Money unitRetailPriceVatIncl;
		
		/**
		 * Unit retail price (vat excl).
		 */
		private Money unitRetailPriceVatExcl;
		
		/**
		 * The quantity of original single items in order.
		 */
		private Integer quantity;
		
		/**
		 * Total product tax amount of this product.
		 */
		private Money productTaxAmount;
		
		/**
		 * Total shipping tax amount of this product.
		 */
		private Money shipTaxAmount;
		
		/**
		 * Tax rate used for the shipping.
		 * To ensure accuracy, the tax rate will be multiplied by 10000000 based on the actual tax rate.
		 */
		private Long shipTaxRate;
		
		/**
		 * Total promotional sale price of this product. (Vat Inc).
		 */
		private Money retailPriceTotalTaxIncl;
		
		/**
		 * Shipping fee of this product. (Vat Inc).
		 */
		private Money shipAmountTotalTaxIncl;
		
		/**
		 * Tax rate used for the product.
		 * To ensure accuracy, the tax rate will be multiplied by 10000000 based on the actual tax rate.
		 */
		private Long productTaxRate;
		
		/**
		 * Discount from seller for this product.
		 */
		private Money discountFromSeller;
		
		/**
		 * Discount from TEMU for this product.
		 */
		private Money discountFromTEMU;
		
		public OrderInfo() {
		}
		
		/**
		 * @return the order number
		 */
		public String getOrderSn() {
			return orderSn;
		}
		
		/**
		 * @param orderSn the order number
		 * @return this object for method chaining
		 */
		public OrderInfo setOrderSn(String orderSn) {
			this.orderSn = orderSn;
			return this;
		}
		
		/**
		 * @return the base price
		 */
		public Money getBasePrice() {
			return basePrice;
		}
		
		/**
		 * @param basePrice the base price
		 * @return this object for method chaining
		 */
		public OrderInfo setBasePrice(Money basePrice) {
			this.basePrice = basePrice;
			return this;
		}
		
		/**
		 * @return the unit base price
		 */
		public Money getUnitBasePrice() {
			return unitBasePrice;
		}
		
		/**
		 * @param unitBasePrice the unit base price
		 * @return this object for method chaining
		 */
		public OrderInfo setUnitBasePrice(Money unitBasePrice) {
			this.unitBasePrice = unitBasePrice;
			return this;
		}
		
		/**
		 * @return the unit retail price vat incl
		 */
		public Money getUnitRetailPriceVatIncl() {
			return unitRetailPriceVatIncl;
		}
		
		/**
		 * @param unitRetailPriceVatIncl the unit retail price vat incl
		 * @return this object for method chaining
		 */
		public OrderInfo setUnitRetailPriceVatIncl(Money unitRetailPriceVatIncl) {
			this.unitRetailPriceVatIncl = unitRetailPriceVatIncl;
			return this;
		}
		
		/**
		 * @return the unit retail price vat excl
		 */
		public Money getUnitRetailPriceVatExcl() {
			return unitRetailPriceVatExcl;
		}
		
		/**
		 * @param unitRetailPriceVatExcl the unit retail price vat excl
		 * @return this object for method chaining
		 */
		public OrderInfo setUnitRetailPriceVatExcl(Money unitRetailPriceVatExcl) {
			this.unitRetailPriceVatExcl = unitRetailPriceVatExcl;
			return this;
		}
		
		/**
		 * @return the quantity
		 */
		public Integer getQuantity() {
			return quantity;
		}
		
		/**
		 * @param quantity the quantity
		 * @return this object for method chaining
		 */
		public OrderInfo setQuantity(Integer quantity) {
			this.quantity = quantity;
			return this;
		}
		
		/**
		 * @return the product tax amount
		 */
		public Money getProductTaxAmount() {
			return productTaxAmount;
		}
		
		/**
		 * @param productTaxAmount the product tax amount
		 * @return this object for method chaining
		 */
		public OrderInfo setProductTaxAmount(Money productTaxAmount) {
			this.productTaxAmount = productTaxAmount;
			return this;
		}
		
		/**
		 * @return the ship tax amount
		 */
		public Money getShipTaxAmount() {
			return shipTaxAmount;
		}
		
		/**
		 * @param shipTaxAmount the ship tax amount
		 * @return this object for method chaining
		 */
		public OrderInfo setShipTaxAmount(Money shipTaxAmount) {
			this.shipTaxAmount = shipTaxAmount;
			return this;
		}
		
		/**
		 * @return the ship tax rate
		 */
		public Long getShipTaxRate() {
			return shipTaxRate;
		}
		
		/**
		 * @param shipTaxRate the ship tax rate
		 * @return this object for method chaining
		 */
		public OrderInfo setShipTaxRate(Long shipTaxRate) {
			this.shipTaxRate = shipTaxRate;
			return this;
		}
		
		/**
		 * @return the retail price total tax incl
		 */
		public Money getRetailPriceTotalTaxIncl() {
			return retailPriceTotalTaxIncl;
		}
		
		/**
		 * @param retailPriceTotalTaxIncl the retail price total tax incl
		 * @return this object for method chaining
		 */
		public OrderInfo setRetailPriceTotalTaxIncl(Money retailPriceTotalTaxIncl) {
			this.retailPriceTotalTaxIncl = retailPriceTotalTaxIncl;
			return this;
		}
		
		/**
		 * @return the ship amount total tax incl
		 */
		public Money getShipAmountTotalTaxIncl() {
			return shipAmountTotalTaxIncl;
		}
		
		/**
		 * @param shipAmountTotalTaxIncl the ship amount total tax incl
		 * @return this object for method chaining
		 */
		public OrderInfo setShipAmountTotalTaxIncl(Money shipAmountTotalTaxIncl) {
			this.shipAmountTotalTaxIncl = shipAmountTotalTaxIncl;
			return this;
		}
		
		/**
		 * @return the product tax rate
		 */
		public Long getProductTaxRate() {
			return productTaxRate;
		}
		
		/**
		 * @param productTaxRate the product tax rate
		 * @return this object for method chaining
		 */
		public OrderInfo setProductTaxRate(Long productTaxRate) {
			this.productTaxRate = productTaxRate;
			return this;
		}
		
		/**
		 * @return the discount from seller
		 */
		public Money getDiscountFromSeller() {
			return discountFromSeller;
		}
		
		/**
		 * @param discountFromSeller the discount from seller
		 * @return this object for method chaining
		 */
		public OrderInfo setDiscountFromSeller(Money discountFromSeller) {
			this.discountFromSeller = discountFromSeller;
			return this;
		}
		
		/**
		 * @return the discount from TEMU
		 */
		public Money getDiscountFromTEMU() {
			return discountFromTEMU;
		}
		
		/**
		 * @param discountFromTEMU the discount from TEMU
		 * @return this object for method chaining
		 */
		public OrderInfo setDiscountFromTEMU(Money discountFromTEMU) {
			this.discountFromTEMU = discountFromTEMU;
			return this;
		}
	}
}