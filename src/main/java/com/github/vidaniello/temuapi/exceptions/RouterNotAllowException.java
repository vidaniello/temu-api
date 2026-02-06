package com.github.vidaniello.temuapi.exceptions;

public class RouterNotAllowException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 5000001;
    private static final String ERROR_MSG = "ROUTER_NOT_ALLOW";
    private static final String DESCRIPTION = "The file upload route must include \"upload\".";
    
    private final String errorMsgFromResponse;
    
    public RouterNotAllowException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public RouterNotAllowException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public RouterNotAllowException(String errorMsgFromResponse) {
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