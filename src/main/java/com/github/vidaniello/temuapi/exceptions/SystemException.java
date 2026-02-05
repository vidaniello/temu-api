package com.github.vidaniello.temuapi.exceptions;

public class SystemException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public SystemException() {
        super("SYSTEM_EXCEPTION");
        this.errorCode = 4000000;
        this.errorMsg = "SYSTEM_EXCEPTION";
        this.description = "SYSTEM_EXCEPTION.";
    }
    
    public SystemException(Exception exception) {
        super("SYSTEM_EXCEPTION", exception);
        this.errorCode = 4000000;
        this.errorMsg = "SYSTEM_EXCEPTION";
        this.description = "SYSTEM_EXCEPTION.";
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