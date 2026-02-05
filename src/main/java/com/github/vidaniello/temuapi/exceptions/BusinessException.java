package com.github.vidaniello.temuapi.exceptions;

public class BusinessException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public BusinessException() {
        super("BUSINESS_EXCEPTION");
        this.errorCode = 2000000;
        this.errorMsg = "BUSINESS_EXCEPTION";
        this.description = "Call Internal API failed.";
    }
    
    public BusinessException(Exception exception) {
        super("BUSINESS_EXCEPTION", exception);
        this.errorCode = 2000000;
        this.errorMsg = "BUSINESS_EXCEPTION";
        this.description = "Call Internal API failed.";
    }
    
    public int getErrorCode() {
        return errorCode;
    }
    
    public String getErrorMsg() {
        return errorMsg;
    }
    
    public String getDescription() {
        return description;
    }
}