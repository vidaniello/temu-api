package com.github.vidaniello.temuapi.exceptions;

public class AccessTokenAppKeyMismatchException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public AccessTokenAppKeyMismatchException() {
        super("access_token and app_key are not mapping.");
        this.errorCode = 3000033;
        this.errorMsg = "access_token and app_key are not mapping.";
        this.description = "The access_token does not match the app_key.";
    }
    
    public AccessTokenAppKeyMismatchException(Exception exception) {
        super("access_token and app_key are not mapping.", exception);
        this.errorCode = 3000033;
        this.errorMsg = "access_token and app_key are not mapping.";
        this.description = "The access_token does not match the app_key.";
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