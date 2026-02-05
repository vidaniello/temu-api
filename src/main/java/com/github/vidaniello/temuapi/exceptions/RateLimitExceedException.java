package com.github.vidaniello.temuapi.exceptions;

public class RateLimitExceedException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public RateLimitExceedException() {
        super("RATE_LIMIT_EXCEED_EXCEPTION");
        this.errorCode = 4000004;
        this.errorMsg = "RATE_LIMIT_EXCEED_EXCEPTION";
        this.description = "The request exceeds the rate limit threshold.";
    }
    
    public RateLimitExceedException(Exception exception) {
        super("RATE_LIMIT_EXCEED_EXCEPTION", exception);
        this.errorCode = 4000004;
        this.errorMsg = "RATE_LIMIT_EXCEED_EXCEPTION";
        this.description = "The request exceeds the rate limit threshold.";
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