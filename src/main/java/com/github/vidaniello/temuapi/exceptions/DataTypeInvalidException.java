package com.github.vidaniello.temuapi.exceptions;

public class DataTypeInvalidException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 3000014;
    private static final String ERROR_MSG = "data_type is invalid";
    private static final String DESCRIPTION = "The data_type parameter value is invalid (other characters besides \"Json\" (case-insensitive) were passed).";
    
    private final String errorMsgFromResponse;
    
    public DataTypeInvalidException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public DataTypeInvalidException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public DataTypeInvalidException(String errorMsgFromResponse) {
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