package com.github.vidaniello.temuapi.exceptions;

public class TypeMissingException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public TypeMissingException() {
        super("there is no type in body.");
        this.errorCode = 3000002;
        this.errorMsg = "there is no type in body.";
        this.description = "API type is missing.";
    }
    
    public TypeMissingException(Exception exception) {
        super("there is no type in body.", exception);
        this.errorCode = 3000002;
        this.errorMsg = "there is no type in body.";
        this.description = "API type is missing.";
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