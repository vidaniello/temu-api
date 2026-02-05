package com.github.vidaniello.temuapi.exceptions;

public class SignMissingException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public SignMissingException() {
        super("there is no sign in body.");
        this.errorCode = 3000040;
        this.errorMsg = "there is no sign in body.";
        this.description = "sign is missing.";
    }
    
    public SignMissingException(Exception exception) {
        super("there is no sign in body.", exception);
        this.errorCode = 3000040;
        this.errorMsg = "there is no sign in body.";
        this.description = "sign is missing.";
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