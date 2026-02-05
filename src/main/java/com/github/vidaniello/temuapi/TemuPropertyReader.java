package com.github.vidaniello.temuapi;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class TemuPropertyReader {
	
	public static final String endpointArea_EnvVarName 			= "TEMU_ENDPOINT_AEREA";
	public static final String accessToken_EnvVarName 			= "TEMU_ACCESS_TOKEN";
	public static final String appKey_EnvVarName 				= "TEMU_APPKEY";
	public static final String appSecret_EnvVarName 			= "TEMU_APP_SECRET";
	
	public static final String temuPropertieFilePath_EnvVarName = "TEMU_PROPERTIES_FILE_PATH";
	public static final String temuPropertieFileName_EnvVarName = "TEMU_PROPERTIES_FILE_NAME";

	public static final String temuPropertiesDefaultFilePath	= System.getProperty("user.home");
	public static final String temuPropertiesDefaultFileName	= "temu.properties";
	
	private static final TemuPropertyReader singleton = new TemuPropertyReader();
	public static final TemuPropertyReader getInstance() {
		return singleton;
	}
	
	public TemuPropertyReader() {
	
	}

	private TemuAuthParams calcualtedTemuAuthParams;
	
	public synchronized TemuAuthParams getAuthParams() {
		if(calcualtedTemuAuthParams==null) {
			
			TemuAuthParams ret = new TemuAuthParams();
			
			ret.setAccessToken(System.getenv(accessToken_EnvVarName));
			ret.setAppKey(System.getenv(appKey_EnvVarName));
			ret.setAppSecret(System.getenv(appSecret_EnvVarName));
			
			String endpoint = null;
			try {
				endpoint = TemuEndpoints.getEndpointByArea(System.getenv(endpointArea_EnvVarName));
			} catch (NullPointerException npex) {}
			ret.setEndpoint(endpoint);
			
			String temuPropFilePath = System.getenv(temuPropertieFilePath_EnvVarName);
			String temuPropFileName = System.getenv(temuPropertieFileName_EnvVarName);
			
			if(temuPropFilePath==null)
				temuPropFilePath = temuPropertiesDefaultFilePath;
			
			if(temuPropFileName==null)
				temuPropFileName = temuPropertiesDefaultFileName;
			
			File temuPropFile = new File(temuPropFilePath+File.separator+temuPropFileName);
			if(temuPropFile.exists()) {
				
				Properties temuProps = new Properties();
				
				try(FileInputStream fileInputStream = new FileInputStream(temuPropFile)) {
					
					temuProps.load(fileInputStream);
					
				} catch (Exception e) { }
				
				if(!temuProps.isEmpty()) {
					ret.setAccessToken(temuProps.getProperty(accessToken_EnvVarName, System.getenv(accessToken_EnvVarName)));
					ret.setAppKey(temuProps.getProperty(appKey_EnvVarName, System.getenv(appKey_EnvVarName)));
					ret.setAppSecret(temuProps.getProperty(appSecret_EnvVarName, System.getenv(appSecret_EnvVarName)));
					try {
						ret.setEndpoint(TemuEndpoints.getEndpointByArea(temuProps.getProperty(endpointArea_EnvVarName)));
					} catch (NullPointerException npex) {
						ret.setEndpoint(endpoint);
					}
				}
				
			}
			calcualtedTemuAuthParams = ret;
		}
		
		return calcualtedTemuAuthParams;
	}


	

}
