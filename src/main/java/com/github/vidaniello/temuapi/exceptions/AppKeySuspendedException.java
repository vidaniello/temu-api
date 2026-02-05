package com.github.vidaniello.temuapi.exceptions;

public class AppKeySuspendedException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public AppKeySuspendedException() {
        super("app_key have been suspended, please contact temu product support team to recover your app status.");
        this.errorCode = 3000028;
        this.errorMsg = "app_key have been suspended, please contact temu product support team to recover your app status.";
        this.description = "The APP status is unavailable.";
    }
    
    public AppKeySuspendedException(Exception exception) {
        super("app_key have been suspended, please contact temu product support team to recover your app status.", exception);
        this.errorCode = 3000028;
        this.errorMsg = "app_key have been suspended, please contact temu product support team to recover your app status.";
        this.description = "The APP status is unavailable.";
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