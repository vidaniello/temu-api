package com.github.vidaniello.temuapi.exceptions;

import com.github.vidaniello.temuapi.TemuResponse;

public class TemuExceptionFactory {

    private TemuExceptionFactory() {
        // Utility class - no instantiation
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
                return new BusinessException();
            case 3000000:
                return new BadParamsException();
            case 3000001:
                return new SignUnvalidException();
            case 3000002:
                return new TypeMissingException();
            case 3000003:
                return new TypeNotExistsException();
            case 3000004:
                return new TypeSunsetException();
            case 3000010:
                return new TimestampMissingException();
            case 3000011:
                return new TimestampInvalidException();
            case 3000012:
                return new TimestampExpiredException();
            case 3000013:
                return new DataTypeMissingException();
            case 3000014:
                return new DataTypeInvalidException();
            case 3000019:
                return new ClientIdMissingException();
            case 3000020:
                return new ClientIdNotExistsException();
            case 3000021:
                return new ClientIdNoPermissionException();
            case 3000022:
                return new ClientIdSuspendedException();
            case 3000025:
                return new AppKeyMissingException();
            case 3000026:
                return new AppKeyNotExistsException();
            case 3000027:
                return new AppKeyNoPermissionException();
            case 3000028:
                return new AppKeySuspendedException();
            case 3000030:
                return new AccessTokenMissingException();
            case 3000031:
                return new AccessTokenNotExistsException();
            case 3000032:
                return new AccessTokenNoPermissionException();
            case 3000033:
                return new AccessTokenAppKeyMismatchException();
            case 3000034:
                return new AccessTokenExpiredException();
            case 3000040:
                return new SignMissingException();
            case 4000000:
                return new SystemException();
            case 4000004:
                return new RateLimitExceedException();
            case 5000000:
                return new AuthorizeNotAllowException();
            case 5000001:
                return new RouterNotAllowException();
            case 5000002:
                return new NotSupportStagingEnvException();
            case 5000003:
                return new NotInIpWhiteListException();
            case 6000001:
                return new RpcInterfaceNotFoundException();
            case 7000000:
                return new BusinessServiceErrorException();
            default:
                return new UnknownException(errorCode, errorMsg != null ? errorMsg : "Unknown error");
        }
    }
}