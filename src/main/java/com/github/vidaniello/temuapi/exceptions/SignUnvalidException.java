package com.github.vidaniello.temuapi.exceptions;

public class SignUnvalidException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public SignUnvalidException() {
        super("SIGN_UNVALID");
        this.errorCode = 3000001;
        this.errorMsg = "SIGN_UNVALID";
        this.description = "Sign invalid.";
    }
    
    public SignUnvalidException(Exception exception) {
        super("SIGN_UNVALID", exception);
        this.errorCode = 3000001;
        this.errorMsg = "SIGN_UNVALID";
        this.description = "Sign invalid.";
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