package com.github.vidaniello.temuapi.exceptions;

public class AccessTokenExpiredException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public AccessTokenExpiredException() {
        super("access_token is expired or have been refreshed, please contact seller to share the new access_token with you.");
        this.errorCode = 3000034;
        this.errorMsg = "access_token is expired or have been refreshed, please contact seller to share the new access_token with you.";
        this.description = "The access_token status is abnormal.";
    }
    
    public AccessTokenExpiredException(Exception exception) {
        super("access_token is expired or have been refreshed, please contact seller to share the new access_token with you.", exception);
        this.errorCode = 3000034;
        this.errorMsg = "access_token is expired or have been refreshed, please contact seller to share the new access_token with you.";
        this.description = "The access_token status is abnormal.";
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