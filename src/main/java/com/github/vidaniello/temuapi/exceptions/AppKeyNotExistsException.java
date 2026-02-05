package com.github.vidaniello.temuapi.exceptions;

public class AppKeyNotExistsException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public AppKeyNotExistsException() {
        super("app_key not exists.");
        this.errorCode = 3000026;
        this.errorMsg = "app_key not exists.";
        this.description = "app_key did not exist.";
    }
    
    public AppKeyNotExistsException(Exception exception) {
        super("app_key not exists.", exception);
        this.errorCode = 3000026;
        this.errorMsg = "app_key not exists.";
        this.description = "app_key did not exist.";
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