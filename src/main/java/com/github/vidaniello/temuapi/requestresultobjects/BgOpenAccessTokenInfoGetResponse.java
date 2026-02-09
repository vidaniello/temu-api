package com.github.vidaniello.temuapi.requestresultobjects;

import java.io.Serializable;
import java.util.List;

/**
 * Response object for the API 'bg.open.accesstoken.info.get'.
 * Contains information about the access token including expiration time,
 * mall details, and authorized API scopes.
 */
public class BgOpenAccessTokenInfoGetResponse implements TemuResponseIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Expiration timestamp in seconds for access token.
	 * The unix timestamp represents the date and time the access token will expire.
	 */
	private Long expiredTime;
	
	/**
	 * Temu's unique identifier for a mall.
	 * Required param for most APIs.
	 */
	private Long mallId;
	
	/**
	 * Mall type indicator.
	 * Possible values: 1-SEMI, 100-LOCAL
	 */
	private Integer mallType;
	
	/**
	 * Unique identifier for semi-managed stores.
	 */
	private String semiUniqueId;
	
	/**
	 * The region which the mall belongs to, e.g. USA-211.
	 */
	private Long regionId;
	
	/**
	 * A list of APIs that the current token has been authorized for,
	 * presented in the form of API names (e.g. xx.yyy.zz).
	 */
	private List<String> apiScopeList;
	
	/**
	 * A list of event codes you have subscribed.
	 */
	private List<String> appSubscribeEventCodeList;
	
	/**
	 * Indicates the status of pushing for your application.
	 * Possible values:
	 * 0: events are pushed normally.
	 * 1: events pushing is stopped for reasons (e.g. callback errors).
	 */
	private Integer appSubscribeStatus;
	
	/**
	 * A list of events your access token is authorized to receive.
	 */
	private List<AuthEventCode> authEventCodeList;
	
	public BgOpenAccessTokenInfoGetResponse() {
	
	}
	
	/**
	 * @return the expiration timestamp in seconds for access token
	 */
	public Long getExpiredTime() {
		return expiredTime;
	}
	
	/**
	 * @param expiredTime the expiration timestamp in seconds for access token
	 * @return this response object for method chaining
	 */
	public BgOpenAccessTokenInfoGetResponse setExpiredTime(Long expiredTime) {
		this.expiredTime = expiredTime;
		return this;
	}
	
	/**
	 * @return Temu's unique identifier for a mall
	 */
	public Long getMallId() {
		return mallId;
	}
	
	/**
	 * @param mallId Temu's unique identifier for a mall
	 * @return this response object for method chaining
	 */
	public BgOpenAccessTokenInfoGetResponse setMallId(Long mallId) {
		this.mallId = mallId;
		return this;
	}
	
	/**
	 * @return the mall type (1-SEMI, 100-LOCAL)
	 */
	public Integer getMallType() {
		return mallType;
	}
	
	/**
	 * @param mallType the mall type to set
	 * @return this response object for method chaining
	 */
	public BgOpenAccessTokenInfoGetResponse setMallType(Integer mallType) {
		this.mallType = mallType;
		return this;
	}
	
	/**
	 * @return the unique identifier for semi-managed stores
	 */
	public String getSemiUniqueId() {
		return semiUniqueId;
	}
	
	/**
	 * @param semiUniqueId the unique identifier for semi-managed stores
	 * @return this response object for method chaining
	 */
	public BgOpenAccessTokenInfoGetResponse setSemiUniqueId(String semiUniqueId) {
		this.semiUniqueId = semiUniqueId;
		return this;
	}
	
	/**
	 * @return the region which the mall belongs to
	 */
	public Long getRegionId() {
		return regionId;
	}
	
	/**
	 * @param regionId the region which the mall belongs to
	 * @return this response object for method chaining
	 */
	public BgOpenAccessTokenInfoGetResponse setRegionId(Long regionId) {
		this.regionId = regionId;
		return this;
	}
	
	/**
	 * @return the list of APIs that the current token has been authorized for
	 */
	public List<String> getApiScopeList() {
		return apiScopeList;
	}
	
	/**
	 * @param apiScopeList the list of APIs that the current token has been authorized for
	 * @return this response object for method chaining
	 */
	public BgOpenAccessTokenInfoGetResponse setApiScopeList(List<String> apiScopeList) {
		this.apiScopeList = apiScopeList;
		return this;
	}
	
	/**
	 * @return the list of event codes you have subscribed
	 */
	public List<String> getAppSubscribeEventCodeList() {
		return appSubscribeEventCodeList;
	}
	
	/**
	 * @param appSubscribeEventCodeList the list of event codes you have subscribed
	 * @return this response object for method chaining
	 */
	public BgOpenAccessTokenInfoGetResponse setAppSubscribeEventCodeList(List<String> appSubscribeEventCodeList) {
		this.appSubscribeEventCodeList = appSubscribeEventCodeList;
		return this;
	}
	
	/**
	 * @return the status of pushing for your application
	 */
	public Integer getAppSubscribeStatus() {
		return appSubscribeStatus;
	}
	
	/**
	 * @param appSubscribeStatus the status of pushing for your application
	 * @return this response object for method chaining
	 */
	public BgOpenAccessTokenInfoGetResponse setAppSubscribeStatus(Integer appSubscribeStatus) {
		this.appSubscribeStatus = appSubscribeStatus;
		return this;
	}
	
	/**
	 * @return the list of events your access token is authorized to receive
	 */
	public List<AuthEventCode> getAuthEventCodeList() {
		return authEventCodeList;
	}
	
	/**
	 * @param authEventCodeList the list of events your access token is authorized to receive
	 * @return this response object for method chaining
	 */
	public BgOpenAccessTokenInfoGetResponse setAuthEventCodeList(List<AuthEventCode> authEventCodeList) {
		this.authEventCodeList = authEventCodeList;
		return this;
	}
	
	/**
	 * Inner class representing an authorized event code.
	 * Contains the event code identifier and its permits status.
	 */
	public static class AuthEventCode implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		/**
		 * Unique identifier for each event.
		 */
		private String eventCode;
		
		/**
		 * Indicates the status of receiving this event for your application.
		 * Possible values:
		 * 0: events receiving is disabled.
		 * 1: events receiving is enabled.
		 */
		private Integer permitsStatus;
		
		public AuthEventCode() {
		
		}
		
		/**
		 * @return the unique identifier for each event
		 */
		public String getEventCode() {
			return eventCode;
		}
		
		/**
		 * @param eventCode the unique identifier for each event
		 * @return this AuthEventCode object for method chaining
		 */
		public AuthEventCode setEventCode(String eventCode) {
			this.eventCode = eventCode;
			return this;
		}
		
		/**
		 * @return the status of receiving this event for your application
		 */
		public Integer getPermitsStatus() {
			return permitsStatus;
		}
		
		/**
		 * @param permitsStatus the status of receiving this event for your application
		 * @return this AuthEventCode object for method chaining
		 */
		public AuthEventCode setPermitsStatus(Integer permitsStatus) {
			this.permitsStatus = permitsStatus;
			return this;
		}
		
	}
	
}