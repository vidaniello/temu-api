package com.github.vidaniello.temuapi.exceptions;

public class TypeSunsetException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public TypeSunsetException() {
        super("type has been sunset, please stop calling this type and change to use another one.");
        this.errorCode = 3000004;
        this.errorMsg = "type has been sunset, please stop calling this type and change to use another one.";
        this.description = "API type status is wrong.";
    }
    
    public TypeSunsetException(Exception exception) {
        super("type has been sunset, please stop calling this type and change to use another one.", exception);
        this.errorCode = 3000004;
        this.errorMsg = "type has been sunset, please stop calling this type and change to use another one.";
        this.description = "API type status is wrong.";
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