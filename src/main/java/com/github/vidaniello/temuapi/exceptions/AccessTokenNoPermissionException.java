package com.github.vidaniello.temuapi.exceptions;

public class AccessTokenNoPermissionException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public AccessTokenNoPermissionException() {
        super("access_token don't have this api access, please ask for seller to authorize this api in seller center first, and share the new access_token with you.");
        this.errorCode = 3000032;
        this.errorMsg = "access_token don't have this api access, please ask for seller to authorize this api in seller center first, and share the new access_token with you.";
        this.description = "The access_token does not have permission to call the Type interface.";
    }
    
    public AccessTokenNoPermissionException(Exception exception) {
        super("access_token don't have this api access, please ask for seller to authorize this api in seller center first, and share the new access_token with you.", exception);
        this.errorCode = 3000032;
        this.errorMsg = "access_token don't have this api access, please ask for seller to authorize this api in seller center first, and share the new access_token with you.";
        this.description = "The access_token does not have permission to call the Type interface.";
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