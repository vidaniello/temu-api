package com.github.vidaniello.temuapi.exceptions;

public class AccessTokenExpiredException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 3000034;
    private static final String ERROR_MSG = "access_token is expired or have been refreshed, please contact seller to share the new access_token with you.";
    private static final String DESCRIPTION = "The access_token status is abnormal.";
    
    private final String errorMsgFromResponse;
    
    public AccessTokenExpiredException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public AccessTokenExpiredException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public AccessTokenExpiredException(String errorMsgFromResponse) {
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