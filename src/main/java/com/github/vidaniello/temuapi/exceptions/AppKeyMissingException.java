package com.github.vidaniello.temuapi.exceptions;

public class AppKeyMissingException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 3000025;
    private static final String ERROR_MSG = "there is no app_key in body.";
    private static final String DESCRIPTION = "app_key is missing.";
    
    private final String errorMsgFromResponse;
    
    public AppKeyMissingException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public AppKeyMissingException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public AppKeyMissingException(String errorMsgFromResponse) {
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