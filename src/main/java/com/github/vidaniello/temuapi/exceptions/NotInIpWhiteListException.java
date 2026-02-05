package com.github.vidaniello.temuapi.exceptions;

public class NotInIpWhiteListException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public NotInIpWhiteListException() {
        super("NOT_IN_IP_WHITE_LIST");
        this.errorCode = 5000003;
        this.errorMsg = "NOT_IN_IP_WHITE_LIST";
        this.description = "The requesting IP address is not on the whitelist.";
    }
    
    public NotInIpWhiteListException(Exception exception) {
        super("NOT_IN_IP_WHITE_LIST", exception);
        this.errorCode = 5000003;
        this.errorMsg = "NOT_IN_IP_WHITE_LIST";
        this.description = "The requesting IP address is not on the whitelist.";
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