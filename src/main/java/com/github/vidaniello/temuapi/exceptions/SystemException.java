package com.github.vidaniello.temuapi.exceptions;

public class SystemException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 4000000;
    private static final String ERROR_MSG = "SYSTEM_EXCEPTION";
    private static final String DESCRIPTION = "SYSTEM_EXCEPTION.";
    
    private final String errorMsgFromResponse;
    
    public SystemException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public SystemException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public SystemException(String errorMsgFromResponse) {
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