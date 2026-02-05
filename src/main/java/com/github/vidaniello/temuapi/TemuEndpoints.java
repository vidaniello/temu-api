package com.github.vidaniello.temuapi;

/**
 * Endpoint URLs for the Temu OpenAPI.
 *
 * <p>This class provides constants for the base URLs of the Temu OpenAPI
 * endpoints for the US, EU and Global regions. The URLs are used by the
 * client to construct requests to the Temu API.</p>
 *
 * <p>For detailed API documentation, see the official Temu partner
 * documentation:
 * <a href="https://partner-eu.temu.com/documentation?menu_code=85762c6ccc5a4dbc8c023ea5e10c6dc0&sub_menu_code=35deeadad62342cab02d94555ac3c1ea">link</a>
 * </p>
 *
 * @author Vincenzo D'Aniello (vidaniello@gmail.com) github.com/vidaniello
 */
public class TemuEndpoints {
	
	public static final String US 		= "https://openapi-b-us.temu.com/openapi/router";
	public static final String EU 		= "https://openapi-b-eu.temu.com/openapi/router";
	public static final String GLOBAL 	= "https://openapi-b-global.temu.com/openapi/router";

	public static final String getEndpointByArea(String area) {
		
		if(area.toUpperCase().equals("US"))
			return US;
		
		if(area.toUpperCase().equals("EU"))
			return EU;
		
		if(area.toUpperCase().equals("GLOBAL"))
			return GLOBAL;
		
		throw new NullPointerException("The area '"+area+"' provided is not configured!");
	}
}