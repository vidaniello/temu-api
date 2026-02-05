package com.github.vidaniello.temuapi.exceptions;

public class TimestampExpiredException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public TimestampExpiredException() {
        super("timestamp is expired.");
        this.errorCode = 3000012;
        this.errorMsg = "timestamp is expired.";
        this.description = "timestamp is expired.";
    }
    
    public TimestampExpiredException(Exception exception) {
        super("timestamp is expired.", exception);
        this.errorCode = 3000012;
        this.errorMsg = "timestamp is expired.";
        this.description = "timestamp is expired.";
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