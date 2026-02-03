package com.github.vidaniello.temuapi;

import java.io.Serializable;

public class TemuResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Boolean success;
	private Integer errorCode;
	private String errorMsg;
	private TemuResultObject result;
	
	public TemuResponse() {
		
	}
	

}
