package com.github.vidaniello.temuapi;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class TemuPropertyReader {
	
	
	public static final String accessToken_EnvVarName 			= "TEMU_ACCESS_TOKEN";
	public static final String appKey_EnvVarName 				= "TEMU_APPKEY";
	public static final String sign_EnvVarName 					= "TEMU_SIGN";
	
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
			ret.setSign(System.getenv(sign_EnvVarName));
			
			String temuPropFilePath = System.getenv(temuPropertieFilePath_EnvVarName);
			String temuPropFileName = System.getenv(temuPropertieFileName_EnvVarName);
			
			if(temuPropFilePath==null)
				temuPropFilePath = temuPropertiesDefaultFilePath;
			
			if(temuPropFileName==null)
				temuPropFileName = temuPropertiesDefaultFileName;
			
			File temuPropFile = new File(temuPropFilePath+File.pathSeparator+temuPropFileName);
			if(temuPropFile.exists()) {
				
				Properties temuProps = new Properties();
				
				try(FileInputStream fileInputStream = new FileInputStream(temuPropFile)) {
					
					temuProps.load(fileInputStream);
					
				} catch (Exception e) { }
				
				if(!temuProps.isEmpty()) {
					
					ret.setAccessToken(temuProps.getProperty(accessToken_EnvVarName, System.getenv(accessToken_EnvVarName)));
					ret.setAppKey(temuProps.getProperty(appKey_EnvVarName, System.getenv(appKey_EnvVarName)));
					ret.setSign(temuProps.getProperty(sign_EnvVarName, System.getenv(sign_EnvVarName)));
				}
				
			}
			calcualtedTemuAuthParams = ret;
		}
		
		return calcualtedTemuAuthParams;
	}


	

}
