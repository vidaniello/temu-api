package com.github.vidaniello.temuapi.exceptions;

public class NotInIpWhiteListException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 5000003;
    private static final String ERROR_MSG = "NOT_IN_IP_WHITE_LIST";
    private static final String DESCRIPTION = "The requesting IP address is not on the whitelist.";
    
    private final String errorMsgFromResponse;
    
    public NotInIpWhiteListException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public NotInIpWhiteListException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public NotInIpWhiteListException(String errorMsgFromResponse) {
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