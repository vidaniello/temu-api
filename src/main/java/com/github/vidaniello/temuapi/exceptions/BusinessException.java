package com.github.vidaniello.temuapi.exceptions;

public class BusinessException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 2000000;
    private static final String ERROR_MSG = "BUSINESS_EXCEPTION";
    private static final String DESCRIPTION = "Call Internal API failed.";
    
    private final String errorMsgFromResponse;
    
    public BusinessException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public BusinessException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public BusinessException(String errorMsgFromResponse) {
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