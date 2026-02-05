package com.github.vidaniello.temuapi.exceptions;

public class DataTypeInvalidException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public DataTypeInvalidException() {
        super("data_type is invalid");
        this.errorCode = 3000014;
        this.errorMsg = "data_type is invalid";
        this.description = "The data_type parameter value is invalid (other characters besides \"Json\" (case-insensitive) were passed).";
    }
    
    public DataTypeInvalidException(Exception exception) {
        super("data_type is invalid", exception);
        this.errorCode = 3000014;
        this.errorMsg = "data_type is invalid";
        this.description = "The data_type parameter value is invalid (other characters besides \"Json\" (case-insensitive) were passed).";
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