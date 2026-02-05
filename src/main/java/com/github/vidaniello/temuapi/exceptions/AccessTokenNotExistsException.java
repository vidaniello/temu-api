package com.github.vidaniello.temuapi.exceptions;

public class AccessTokenNotExistsException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public AccessTokenNotExistsException() {
        super("access_token not exists.");
        this.errorCode = 3000031;
        this.errorMsg = "access_token not exists.";
        this.description = "access_token did not exist.";
    }
    
    public AccessTokenNotExistsException(Exception exception) {
        super("access_token not exists.", exception);
        this.errorCode = 3000031;
        this.errorMsg = "access_token not exists.";
        this.description = "access_token did not exist.";
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