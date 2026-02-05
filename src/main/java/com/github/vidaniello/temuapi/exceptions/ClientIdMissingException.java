package com.github.vidaniello.temuapi.exceptions;

public class ClientIdMissingException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public ClientIdMissingException() {
        super("there is no client_id in body.");
        this.errorCode = 3000019;
        this.errorMsg = "there is no client_id in body.";
        this.description = "app_key is missing.";
    }
    
    public ClientIdMissingException(Exception exception) {
        super("there is no client_id in body.", exception);
        this.errorCode = 3000019;
        this.errorMsg = "there is no client_id in body.";
        this.description = "app_key is missing.";
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