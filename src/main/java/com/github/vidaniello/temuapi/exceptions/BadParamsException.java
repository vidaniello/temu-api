package com.github.vidaniello.temuapi.exceptions;

public class BadParamsException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public BadParamsException() {
        super("BAD_PARAMS");
        this.errorCode = 3000000;
        this.errorMsg = "BAD_PARAMS";
        this.description = "BAD_PARAMS.";
    }
    
    public BadParamsException(Exception exception) {
        super("BAD_PARAMS", exception);
        this.errorCode = 3000000;
        this.errorMsg = "BAD_PARAMS";
        this.description = "BAD_PARAMS.";
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