package com.github.vidaniello.temuapi.requestresultobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Request object for the API call 'bg.local.mall.info.get'.
 * Used to retrieve mall IDs and site information.
 */
public class BgLocalMallInfoGetRequest implements TemuRequestIf {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Associated mall ID.
	 * Required for Query;
	 * Optional – if provided, it will only return mall IDs and site information 
	 * for malls under the same entity as the current mall, within the range of 
	 * the specified branchesMallId.
	 */
	private List<Long> branchesMallId;
		
	public BgLocalMallInfoGetRequest() {
		this.branchesMallId = new ArrayList<>();
	}
	
	/**
	 * @return the list of associated mall IDs
	 */
	public List<Long> getBranchesMallId() {
		return branchesMallId;
	}
	
	/**
	 * @param branchesMallId the list of associated mall IDs
	 * @return this request object for method chaining
	 */
	public BgLocalMallInfoGetRequest setBranchesMallId(List<Long> branchesMallId) {
		this.branchesMallId = branchesMallId;
		return this;
	}
}