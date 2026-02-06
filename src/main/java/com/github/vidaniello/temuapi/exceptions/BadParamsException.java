package com.github.vidaniello.temuapi.exceptions;

public class BadParamsException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 3000000;
    private static final String ERROR_MSG = "BAD_PARAMS";
    private static final String DESCRIPTION = "BAD_PARAMS.";
    
    private final String errorMsgFromResponse;
    
    public BadParamsException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public BadParamsException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public BadParamsException(String errorMsgFromResponse) {
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