package com.github.vidaniello.temuapi.exceptions;

import com.github.vidaniello.temuapi.TemuResponse;
import com.github.vidaniello.temuapi.TemuWorkflow;

public class TemuExceptionFactory {

    private TemuExceptionFactory() {
        // Utility class - no instantiation
    }
    
    public static void checkAndThrowTemuException(TemuWorkflow tw) throws TemuException {
    	
    	TemuException tex = TemuExceptionFactory.createException(tw.getTemuResponse());
    	
    	if(tex!=null) {
    		tw.setTemuException(tex);
    		throw tex;
    	}
    	
    }
    
    public static TemuException createException(TemuResponse response) {
        if (response == null || response.getErrorCode() == null) {
            return null;
        }
        
        int errorCode = response.getErrorCode();
        String errorMsg = response.getErrorMsg();
        
        return createException(errorCode, errorMsg);
 
    }
    
    public static TemuException createException(int errorCode, String errorMsg) {
    	
        // Success code - no exception needed
        if (errorCode == 1000000) {
            return null;
        }
        
        switch (errorCode) {
            case 2000000:
                return new BusinessException(errorMsg);
            case 3000000:
                return new BadParamsException(errorMsg);
            case 3000001:
                return new SignUnvalidException(errorMsg);
            case 3000002:
                return new TypeMissingException(errorMsg);
            case 3000003:
                return new TypeNotExistsException(errorMsg);
            case 3000004:
                return new TypeSunsetException(errorMsg);
            case 3000010:
                return new TimestampMissingException(errorMsg);
            case 3000011:
                return new TimestampInvalidException(errorMsg);
            case 3000012:
                return new TimestampExpiredException(errorMsg);
            case 3000013:
                return new DataTypeMissingException(errorMsg);
            case 3000014:
                return new DataTypeInvalidException(errorMsg);
            case 3000019:
                return new ClientIdMissingException(errorMsg);
            case 3000020:
                return new ClientIdNotExistsException(errorMsg);
            case 3000021:
                return new ClientIdNoPermissionException(errorMsg);
            case 3000022:
                return new ClientIdSuspendedException(errorMsg);
            case 3000025:
                return new AppKeyMissingException(errorMsg);
            case 3000026:
                return new AppKeyNotExistsException(errorMsg);
            case 3000027:
                return new AppKeyNoPermissionException(errorMsg);
            case 3000028:
                return new AppKeySuspendedException(errorMsg);
            case 3000030:
                return new AccessTokenMissingException(errorMsg);
            case 3000031:
                return new AccessTokenNotExistsException(errorMsg);
            case 3000032:
                return new AccessTokenNoPermissionException(errorMsg);
            case 3000033:
                return new AccessTokenAppKeyMismatchException(errorMsg);
            case 3000034:
                return new AccessTokenExpiredException(errorMsg);
            case 3000040:
                return new SignMissingException(errorMsg);
            case 4000000:
                return new SystemException(errorMsg);
            case 4000004:
                return new RateLimitExceedException(errorMsg);
            case 5000000:
                return new AuthorizeNotAllowException(errorMsg);
            case 5000001:
                return new RouterNotAllowException(errorMsg);
            case 5000002:
                return new NotSupportStagingEnvException(errorMsg);
            case 5000003:
                return new NotInIpWhiteListException(errorMsg);
            case 6000001:
                return new RpcInterfaceNotFoundException(errorMsg);
            case 7000000:
                return new BusinessServiceErrorException(errorMsg);
            default:
                return new InvalidRequestException(errorCode, errorMsg != null ? errorMsg : "error code "+new Integer(errorCode).toString());
        }
    }
}