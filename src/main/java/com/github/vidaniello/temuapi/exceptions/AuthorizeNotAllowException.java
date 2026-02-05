package com.github.vidaniello.temuapi.exceptions;

public class AuthorizeNotAllowException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public AuthorizeNotAllowException() {
        super("AUTHORIZE_NOT_ALLOW");
        this.errorCode = 5000000;
        this.errorMsg = "AUTHORIZE_NOT_ALLOW";
        this.description = "The merchant is not authorized / access token verification failed / interface authentication failed.";
    }
    
    public AuthorizeNotAllowException(Exception exception) {
        super("AUTHORIZE_NOT_ALLOW", exception);
        this.errorCode = 5000000;
        this.errorMsg = "AUTHORIZE_NOT_ALLOW";
        this.description = "The merchant is not authorized / access token verification failed / interface authentication failed.";
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