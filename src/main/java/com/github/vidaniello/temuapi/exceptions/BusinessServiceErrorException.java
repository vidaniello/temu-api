package com.github.vidaniello.temuapi.exceptions;

public class BusinessServiceErrorException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public BusinessServiceErrorException() {
        super("BUSINESS_SERVICE_ERROR");
        this.errorCode = 7000000;
        this.errorMsg = "BUSINESS_SERVICE_ERROR";
        this.description = "BUSINESS_SERVICE_ERROR.";
    }
    
    public BusinessServiceErrorException(Exception exception) {
        super("BUSINESS_SERVICE_ERROR", exception);
        this.errorCode = 7000000;
        this.errorMsg = "BUSINESS_SERVICE_ERROR";
        this.description = "BUSINESS_SERVICE_ERROR.";
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