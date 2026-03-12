package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'bg.order.detail.v2.get'.
 * Used to retrieve order details.
 */
public class BgOrderDetailV2GetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Parent order number.
	 * This field is required.
	 */
	private String parentOrderSn;
	
	/**
	 * The type of order fulfillment.
	 * Enum values:
	 * fulfillBySeller - fulfill by seller,
	 * fulfillByCooperativeWarehouse - fulfill by CooperativeWarehouse.
	 */
	private List<String> fulfillmentTypeList;
		
	public BgOrderDetailV2GetRequest() {
		this.fulfillmentTypeList = new ArrayList<>();
	}
	
	/**
	 * @return the parent order number
	 */
	public String getParentOrderSn() {
		return parentOrderSn;
	}
	
	/**
	 * @param parentOrderSn the parent order number
	 * @return this request object for method chaining
	 */
	public BgOrderDetailV2GetRequest setParentOrderSn(String parentOrderSn) {
		this.parentOrderSn = parentOrderSn;
		return this;
	}
	
	/**
	 * @return the fulfillment type list
	 */
	public List<String> getFulfillmentTypeList() {
		return fulfillmentTypeList;
	}
	
	/**
	 * @param fulfillmentTypeList the fulfillment type list
	 * @return this request object for method chaining
	 */
	public BgOrderDetailV2GetRequest setFulfillmentTypeList(List<String> fulfillmentTypeList) {
		this.fulfillmentTypeList = fulfillmentTypeList;
		return this;
	}
}