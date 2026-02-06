package com.github.vidaniello.temuapi.exceptions;

public class AuthorizeNotAllowException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 5000000;
    private static final String ERROR_MSG = "AUTHORIZE_NOT_ALLOW";
    private static final String DESCRIPTION = "The merchant is not authorized / access token verification failed / interface authentication failed.";
    
    private final String errorMsgFromResponse;
    
    public AuthorizeNotAllowException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public AuthorizeNotAllowException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public AuthorizeNotAllowException(String errorMsgFromResponse) {
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