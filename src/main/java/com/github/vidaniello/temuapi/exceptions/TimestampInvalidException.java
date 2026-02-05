package com.github.vidaniello.temuapi.exceptions;

public class TimestampInvalidException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public TimestampInvalidException() {
        super("timestamp is invalid.");
        this.errorCode = 3000011;
        this.errorMsg = "timestamp is invalid.";
        this.description = "timestamp is invalid, if timestamp>current_time+300s.";
    }
    
    public TimestampInvalidException(Exception exception) {
        super("timestamp is invalid.", exception);
        this.errorCode = 3000011;
        this.errorMsg = "timestamp is invalid.";
        this.description = "timestamp is invalid, if timestamp>current_time+300s.";
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