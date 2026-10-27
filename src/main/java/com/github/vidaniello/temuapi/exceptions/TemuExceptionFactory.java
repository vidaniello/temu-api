package com.github.vidaniello.temuapi.exceptions;

import com.github.vidaniello.temuapi.TemuResponse;
import com.github.vidaniello.temuapi.TemuWorkflow;
import com.github.vidaniello.temuapi.requestresultobjects.TemuResponseIf;

public class TemuExceptionFactory {

    private TemuExceptionFactory() {
        // Utility class - no instantiation
    }
    
    public static <T extends TemuResponseIf> void checkAndThrowTemuException(TemuWorkflow<T> tw) throws TemuException {

    	TemuException tex = TemuExceptionFactory.createException(tw.getTemuResponse(), tw);

    	if(tex!=null) {
    		tw.setTemuException(tex);
    		throw tex;
    	}

    }

    public static TemuException createException(TemuResponse response) {
        return createException(response, null);
    }

    public static TemuException createException(TemuResponse response, TemuWorkflow<?> tw) {
        if (response == null || response.getErrorCode() == null) {
            return null;
        }

        return createException(response.getErrorCode(), composeErrorMessage(response, tw));
    }

    /**
     * Compone il messaggio d'errore il piu' specifico possibile: tipo di chiamata,
     * errorMsg, subErrorMsg, requestId, oggetto result, body RAW della risposta e
     * body JSON della richiesta che l'ha generata, tutti gli elementi presenti.
     */
    public static String composeErrorMessage(TemuResponse response, TemuWorkflow<?> tw) {

    	StringBuilder sb = new StringBuilder();

    	if (tw != null && tw.getTemuCommonRequestParameters() != null
    			&& hasText(tw.getTemuCommonRequestParameters().getType()))
    		sb.append("chiamata: ").append(tw.getTemuCommonRequestParameters().getType());

    	if (hasText(response.getErrorMsg()))
    		sb.append(sep(sb)).append(response.getErrorMsg());

    	if (hasText(response.getSubErrorMsg()))
    		sb.append(sep(sb)).append("subErrorMsg: ").append(response.getSubErrorMsg());

    	if (hasText(response.getRequestId()))
    		sb.append(sep(sb)).append("requestId: ").append(response.getRequestId());

    	if (response.getResult() != null && response.getResult().size() > 0)
    		sb.append(sep(sb)).append("result: ").append(response.getResult());

    	if (hasText(response.getRawBody()))
    		sb.append(sep(sb)).append("risposta: ").append(response.getRawBody());

    	if (tw != null && tw.getRequest() != null && tw.getRequest().size() > 0)
    		sb.append(sep(sb)).append("richiesta: ").append(tw.getRequest());

    	return sb.length() > 0 ? sb.toString() : "errore non specificato (senza errorMsg)";
    }

    /** Testo presente e non vuoto (compatibile Java 8, senza String.isBlank). */
    private static boolean hasText(String s) {
    	return s != null && !s.trim().isEmpty();
    }

    /** Separatore '|', senza prefisso iniziale. */
    private static String sep(StringBuilder sb) {
    	return sb.length() > 0 ? " | " : "";
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
                return new InvalidRequestException(errorCode, errorMsg != null ? "("+new Integer(errorCode).toString()+") "+errorMsg : "error code "+new Integer(errorCode).toString());
        }
    }
}