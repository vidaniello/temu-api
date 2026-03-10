package com.github.vidaniello.temuapi.requestresultobjects;

/**
 * Pagination information for responses that support paging.
 * When a request produces a response that exceeds the pageSize, pagination occurs.
 */
public class Pagination {

	/**
	 * A token that can be used to fetch the next page.
	 */
	private String nextToken;
	
	/**
	 * A token that can be used to fetch the previous page.
	 */
	private String previousToken;
		
	public Pagination() {
	}
	
	/**
	 * @return the next token
	 */
	public String getNextToken() {
		return nextToken;
	}
	
	/**
	 * @param nextToken the next token
	 * @return this object for method chaining
	 */
	public Pagination setNextToken(String nextToken) {
		this.nextToken = nextToken;
		return this;
	}
	
	/**
	 * @return the previous token
	 */
	public String getPreviousToken() {
		return previousToken;
	}
	
	/**
	 * @param previousToken the previous token
	 * @return this object for method chaining
	 */
	public Pagination setPreviousToken(String previousToken) {
		this.previousToken = previousToken;
		return this;
	}
}