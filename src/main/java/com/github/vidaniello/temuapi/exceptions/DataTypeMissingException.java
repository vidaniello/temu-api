package com.github.vidaniello.temuapi.exceptions;

public class DataTypeMissingException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public DataTypeMissingException() {
        super("there is no data_type in body.");
        this.errorCode = 3000013;
        this.errorMsg = "there is no data_type in body.";
        this.description = "data_type type is missing.";
    }
    
    public DataTypeMissingException(Exception exception) {
        super("there is no data_type in body.", exception);
        this.errorCode = 3000013;
        this.errorMsg = "there is no data_type in body.";
        this.description = "data_type type is missing.";
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