package com.github.vidaniello.temuapi.exceptions;

public class AppKeyNoPermissionException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public AppKeyNoPermissionException() {
        super("app_key don't have this api permission.");
        this.errorCode = 3000027;
        this.errorMsg = "app_key don't have this api permission.";
        this.description = "The app_key does not have permission to call the Type interface.";
    }
    
    public AppKeyNoPermissionException(Exception exception) {
        super("app_key don't have this api permission.", exception);
        this.errorCode = 3000027;
        this.errorMsg = "app_key don't have this api permission.";
        this.description = "The app_key does not have permission to call the Type interface.";
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