package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'bg.logistics.shipment.v2.confirm'.
 * Contains the result of the shipment confirmation request.
 */
public class BgLogisticsShipmentV2ConfirmResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Enables intelligent trajectory assistant to detect and correct 
	 * potential mistakes in carrier entries.
	 */
	private String assistantAgreementText;
	
	/**
	 * Provides relevant prompts related to the current shipping request.
	 */
	private List<String> warningMessage;
		
	public BgLogisticsShipmentV2ConfirmResponse() {
		this.warningMessage = new ArrayList<>();
	}
	
	/**
	 * @return the assistant agreement text
	 */
	public String getAssistantAgreementText() {
		return assistantAgreementText;
	}
	
	/**
	 * @param assistantAgreementText the assistant agreement text
	 * @return this response object for method chaining
	 */
	public BgLogisticsShipmentV2ConfirmResponse setAssistantAgreementText(String assistantAgreementText) {
		this.assistantAgreementText = assistantAgreementText;
		return this;
	}
	
	/**
	 * @return the warning message list
	 */
	public List<String> getWarningMessage() {
		return warningMessage;
	}
	
	/**
	 * @param warningMessage the warning message list
	 * @return this response object for method chaining
	 */
	public BgLogisticsShipmentV2ConfirmResponse setWarningMessage(List<String> warningMessage) {
		this.warningMessage = warningMessage;
		return this;
	}
}