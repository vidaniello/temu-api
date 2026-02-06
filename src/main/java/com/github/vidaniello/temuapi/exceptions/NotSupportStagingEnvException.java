package com.github.vidaniello.temuapi.exceptions;

public class NotSupportStagingEnvException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 5000002;
    private static final String ERROR_MSG = "NOT_SUPPORT_STAGING_ENV";
    private static final String DESCRIPTION = "The current request environment is not the formal environment. Please check the request header information.";
    
    private final String errorMsgFromResponse;
    
    public NotSupportStagingEnvException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public NotSupportStagingEnvException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public NotSupportStagingEnvException(String errorMsgFromResponse) {
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