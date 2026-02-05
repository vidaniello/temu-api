package com.github.vidaniello.temuapi.exceptions;

public class AppKeyMissingException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public AppKeyMissingException() {
        super("there is no app_key in body.");
        this.errorCode = 3000025;
        this.errorMsg = "there is no app_key in body.";
        this.description = "app_key is missing.";
    }
    
    public AppKeyMissingException(Exception exception) {
        super("there is no app_key in body.", exception);
        this.errorCode = 3000025;
        this.errorMsg = "there is no app_key in body.";
        this.description = "app_key is missing.";
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