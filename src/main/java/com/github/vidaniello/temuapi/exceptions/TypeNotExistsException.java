package com.github.vidaniello.temuapi.exceptions;

public class TypeNotExistsException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public TypeNotExistsException() {
        super("type not exists");
        this.errorCode = 3000003;
        this.errorMsg = "type not exists";
        this.description = "API type status did not exist.";
    }
    
    public TypeNotExistsException(Exception exception) {
        super("type not exists", exception);
        this.errorCode = 3000003;
        this.errorMsg = "type not exists";
        this.description = "API type status did not exist.";
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