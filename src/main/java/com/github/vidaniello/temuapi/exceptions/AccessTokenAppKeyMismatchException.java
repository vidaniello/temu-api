package com.github.vidaniello.temuapi.exceptions;

public class AccessTokenAppKeyMismatchException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 3000033;
    private static final String ERROR_MSG = "access_token and app_key are not mapping.";
    private static final String DESCRIPTION = "The access_token does not match the app_key.";
    
    private final String errorMsgFromResponse;
    
    public AccessTokenAppKeyMismatchException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public AccessTokenAppKeyMismatchException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public AccessTokenAppKeyMismatchException(String errorMsgFromResponse) {
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