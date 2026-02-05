package com.github.vidaniello.temuapi.exceptions;

public class RouterNotAllowException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public RouterNotAllowException() {
        super("ROUTER_NOT_ALLOW");
        this.errorCode = 5000001;
        this.errorMsg = "ROUTER_NOT_ALLOW";
        this.description = "The file upload route must include \"upload\".";
    }
    
    public RouterNotAllowException(Exception exception) {
        super("ROUTER_NOT_ALLOW", exception);
        this.errorCode = 5000001;
        this.errorMsg = "ROUTER_NOT_ALLOW";
        this.description = "The file upload route must include \"upload\".";
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