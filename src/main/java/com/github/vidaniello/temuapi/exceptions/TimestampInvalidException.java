package com.github.vidaniello.temuapi.exceptions;

public class TimestampInvalidException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 3000011;
    private static final String ERROR_MSG = "timestamp is invalid.";
    private static final String DESCRIPTION = "timestamp is invalid, if timestamp>current_time+300s.";
    
    private final String errorMsgFromResponse;
    
    public TimestampInvalidException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public TimestampInvalidException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public TimestampInvalidException(String errorMsgFromResponse) {
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