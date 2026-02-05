package com.github.vidaniello.temuapi.exceptions;

public class NotSupportStagingEnvException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public NotSupportStagingEnvException() {
        super("NOT_SUPPORT_STAGING_ENV");
        this.errorCode = 5000002;
        this.errorMsg = "NOT_SUPPORT_STAGING_ENV";
        this.description = "The current request environment is not the formal environment. Please check the request header information.";
    }
    
    public NotSupportStagingEnvException(Exception exception) {
        super("NOT_SUPPORT_STAGING_ENV", exception);
        this.errorCode = 5000002;
        this.errorMsg = "NOT_SUPPORT_STAGING_ENV";
        this.description = "The current request environment is not the formal environment. Please check the request header information.";
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