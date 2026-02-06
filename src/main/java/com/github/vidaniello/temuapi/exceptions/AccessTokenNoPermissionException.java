package com.github.vidaniello.temuapi.exceptions;

public class AccessTokenNoPermissionException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 3000032;
    private static final String ERROR_MSG = "access_token don't have this api access, please ask for seller to authorize this api in seller center first, and share the new access_token with you.";
    private static final String DESCRIPTION = "The access_token does not have permission to call the Type interface.";
    
    private final String errorMsgFromResponse;
    
    public AccessTokenNoPermissionException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public AccessTokenNoPermissionException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public AccessTokenNoPermissionException(String errorMsgFromResponse) {
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