package com.github.vidaniello.temuapi.exceptions;

public class BusinessServiceErrorException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 7000000;
    private static final String ERROR_MSG = "BUSINESS_SERVICE_ERROR";
    private static final String DESCRIPTION = "BUSINESS_SERVICE_ERROR.";
    
    private final String errorMsgFromResponse;
    
    public BusinessServiceErrorException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public BusinessServiceErrorException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public BusinessServiceErrorException(String errorMsgFromResponse) {
        super(errorMsgFromResponse);
        this.errorMsgFromResponse = errorMsgFromResponse;
    }
    
    public int getErrorCode() {
        return ERROR_CODE;
    }
    
    public String getErrorMsg() {
        return ERROR_MSG;
    }
    
    public String getDescription() {
        return DESCRIPTION;
    }
    
    public String getErrorMsgFromResponse() {
        return errorMsgFromResponse;
    }
}