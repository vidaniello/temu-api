package com.github.vidaniello.temuapi.exceptions;

public class TimestampExpiredException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 3000012;
    private static final String ERROR_MSG = "timestamp is expired.";
    private static final String DESCRIPTION = "timestamp is expired.";
    
    private final String errorMsgFromResponse;
    
    public TimestampExpiredException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public TimestampExpiredException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public TimestampExpiredException(String errorMsgFromResponse) {
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