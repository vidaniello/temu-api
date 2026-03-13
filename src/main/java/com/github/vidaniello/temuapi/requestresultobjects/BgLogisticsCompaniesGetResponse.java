package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Response object for the API call 'bg.logistics.companies.get'.
 * Contains the list of logistics providers that support shipping at the corresponding region.
 */
public class BgLogisticsCompaniesGetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Logistics companies information list.
	 */
	private List<LogisticsCompanies> logisticsCompaniesList;
		
	public BgLogisticsCompaniesGetResponse() {
		this.logisticsCompaniesList = new ArrayList<>();
	}
	
	/**
	 * @return the logistics companies information list
	 */
	public List<LogisticsCompanies> getLogisticsCompaniesList() {
		return logisticsCompaniesList;
	}
	
	/**
	 * @param logisticsCompaniesList the logistics companies information list
	 * @return this response object for method chaining
	 */
	public BgLogisticsCompaniesGetResponse setLogisticsCompaniesList(List<LogisticsCompanies> logisticsCompaniesList) {
		this.logisticsCompaniesList = logisticsCompaniesList;
		return this;
	}
	
	/**
	 * Inner class representing a logistics company.
	 */
	public static class LogisticsCompanies implements java.io.Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Logistics Service Provider Id.
		 */
		private Long logisticsServiceProviderId;
		
		/**
		 * Logistics Service Provider Name.
		 */
		private String logisticsServiceProviderName;
		
		/**
		 * Logistics Brand Name.
		 */
		private String logisticsBrandName;
			
		public LogisticsCompanies() {
		}
		
		/**
		 * @return the logistics service provider ID
		 */
		public Long getLogisticsServiceProviderId() {
			return logisticsServiceProviderId;
		}
		
		/**
		 * @param logisticsServiceProviderId the logistics service provider ID
		 * @return this object for method chaining
		 */
		public LogisticsCompanies setLogisticsServiceProviderId(Long logisticsServiceProviderId) {
			this.logisticsServiceProviderId = logisticsServiceProviderId;
			return this;
		}
		
		/**
		 * @return the logistics service provider name
		 */
		public String getLogisticsServiceProviderName() {
			return logisticsServiceProviderName;
		}
		
		/**
		 * @param logisticsServiceProviderName the logistics service provider name
		 * @return this object for method chaining
		 */
		public LogisticsCompanies setLogisticsServiceProviderName(String logisticsServiceProviderName) {
			this.logisticsServiceProviderName = logisticsServiceProviderName;
			return this;
		}
		
		/**
		 * @return the logistics brand name
		 */
		public String getLogisticsBrandName() {
			return logisticsBrandName;
		}
		
		/**
		 * @param logisticsBrandName the logistics brand name
		 * @return this object for method chaining
		 */
		public LogisticsCompanies setLogisticsBrandName(String logisticsBrandName) {
			this.logisticsBrandName = logisticsBrandName;
			return this;
		}
	}
}