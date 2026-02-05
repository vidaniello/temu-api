package com.github.vidaniello.temuapi.exceptions;

public class AccessTokenMissingException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public AccessTokenMissingException() {
        super("there is no access_token in body.");
        this.errorCode = 3000030;
        this.errorMsg = "there is no access_token in body.";
        this.description = "access_token is missing.";
    }
    
    public AccessTokenMissingException(Exception exception) {
        super("there is no access_token in body.", exception);
        this.errorCode = 3000030;
        this.errorMsg = "there is no access_token in body.";
        this.description = "access_token is missing.";
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