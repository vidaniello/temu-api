package com.github.vidaniello.temuapi.exceptions;

public class RpcInterfaceNotFoundException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 6000001;
    private static final String ERROR_MSG = "RPC_INTERFACE_NOT_FOUND";
    private static final String DESCRIPTION = "Internal api is missing.";
    
    private final String errorMsgFromResponse;
    
    public RpcInterfaceNotFoundException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public RpcInterfaceNotFoundException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public RpcInterfaceNotFoundException(String errorMsgFromResponse) {
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