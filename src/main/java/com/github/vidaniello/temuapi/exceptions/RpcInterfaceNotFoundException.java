package com.github.vidaniello.temuapi.exceptions;

public class RpcInterfaceNotFoundException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private final int errorCode;
    private final String errorMsg;
    private final String description;
    
    public RpcInterfaceNotFoundException() {
        super("RPC_INTERFACE_NOT_FOUND");
        this.errorCode = 6000001;
        this.errorMsg = "RPC_INTERFACE_NOT_FOUND";
        this.description = "Internal api is missing.";
    }
    
    public RpcInterfaceNotFoundException(Exception exception) {
        super("RPC_INTERFACE_NOT_FOUND", exception);
        this.errorCode = 6000001;
        this.errorMsg = "RPC_INTERFACE_NOT_FOUND";
        this.description = "Internal api is missing.";
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