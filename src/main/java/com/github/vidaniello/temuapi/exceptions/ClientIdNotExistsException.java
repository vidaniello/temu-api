package com.github.vidaniello.temuapi.exceptions;

public class ClientIdNotExistsException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public ClientIdNotExistsException() {
        super("client_id not exists.");
        this.errorCode = 3000020;
        this.errorMsg = "client_id not exists.";
        this.description = "app_key did not exist.";
    }
    
    public ClientIdNotExistsException(Exception exception) {
        super("client_id not exists.", exception);
        this.errorCode = 3000020;
        this.errorMsg = "client_id not exists.";
        this.description = "app_key did not exist.";
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