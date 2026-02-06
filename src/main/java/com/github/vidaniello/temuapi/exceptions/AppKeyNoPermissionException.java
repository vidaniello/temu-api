package com.github.vidaniello.temuapi.exceptions;

public class AppKeyNoPermissionException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 3000027;
    private static final String ERROR_MSG = "app_key don't have this api permission.";
    private static final String DESCRIPTION = "The app_key does not have permission to call the Type interface.";
    
    private final String errorMsgFromResponse;
    
    public AppKeyNoPermissionException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public AppKeyNoPermissionException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public AppKeyNoPermissionException(String errorMsgFromResponse) {
        super(errorMsgFromResponse);
        this.errorMsgFromResponse = errorMsgFromResponse;
    }
    
    public int getErrorCode() {
        return ERROR_CODE;
    }
    
    public String getErrorMsg() {
        return ERROR_MSG;
    }
    
    public String getDescription() {
        return DESCRIPTION;
    }
    
    public String getErrorMsgFromResponse() {
        return errorMsgFromResponse;
    }
}