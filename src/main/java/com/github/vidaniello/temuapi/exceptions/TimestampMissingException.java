package com.github.vidaniello.temuapi.exceptions;

public class TimestampMissingException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public TimestampMissingException() {
        super("there is no timestamp in body.");
        this.errorCode = 3000010;
        this.errorMsg = "there is no timestamp in body.";
        this.description = "timestamp is missing.";
    }
    
    public TimestampMissingException(Exception exception) {
        super("there is no timestamp in body.", exception);
        this.errorCode = 3000010;
        this.errorMsg = "there is no timestamp in body.";
        this.description = "timestamp is missing.";
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