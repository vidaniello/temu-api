package com.github.vidaniello.temuapi;

/**
 * <p>Some tests accounts</p>
 * <p><a href="https://partner-eu.temu.com/documentation?menu_code=85762c6ccc5a4dbc8c023ea5e10c6dc0&sub_menu_code=1f8b400b32854d34bf216ec245b9125c">Here other accounts </a></p>
 * 
 * @author Vincenzo D'Aniello (vidaniello@gmail.com) github.com/vidaniello
 */
public class TemuSandboxAccounts {

	
	public static final String US_APP_KEY 		= "4ebbc9190ae410443d65b4c2faca981f";
	public static final String US_APP_SECRET 	= "4782d2d827276688bf4758bed55dbdd4bbe79a79";
	public static final String US_APP_TOKEN 	= "uplv3hfyt5kcwoymrgnajnbl1ow5qxlz4sqhev6hl3xosz5dejrtyl2jre7";
	public static final String US_MALL_ID 		= "";
	public static final String US_ENDPOINT	 	= TemuEndpoints.US;
	public static final String US_SELLER_CENTRAL= "https://seller.temu.com";
	public static final String US_USERNAME 		= "Jacobfumail1024@gmail.com";
	public static final String US_PASSWORD 		= "ddd@123456";
	
	
	public static final String MX_APP_KEY 		= "4ebbc9190ae410443d65b4c2faca981f";
	public static final String MX_APP_SECRET 	= "4782d2d827276688bf4758bed55dbdd4bbe79a79";
	public static final String MX_APP_TOKEN 	= "uploo3upqmnyuiqrdqubexnfiq5kxoxhk19arplblqkpb8sjsx8sfdofqgd";
	public static final String MX_MALL_ID 		= "";
	public static final String MX_ENDPOINT	 	= TemuEndpoints.GLOBAL;
	public static final String MX_SELLER_CENTRAL= "https://mx.seller.temu.com";
	public static final String MX_USERNAME 		= "yisaiyamxg001@gmail.com";
	public static final String MX_PASSWORD 		= "123456a@b";
	
	
	public static final String IT_APP_KEY 		= "f860e759073f9d1e5c8bbeb7baac1dbf";
	public static final String IT_APP_SECRET 	= "121eac72693c6e587f7e15ce4721b42da5df2def";
	public static final String IT_APP_TOKEN 	= "eplof7kc4ve1jdjzwradljxxcxv3ujodk1oomaz1sw4gikq7esr9xad33gz";
	public static final String IT_MALL_ID 		= "670702092943551";
	public static final String IT_ENDPOINT	 	= TemuEndpoints.EU;
	public static final String IT_SELLER_CENTRAL= "https://seller-eu.temu.com";
	public static final String IT_USERNAME 		= "pddxjh@gmail.com";
	public static final String IT_PASSWORD 		= "55pwGg6dJ66Z$VN";
	
	public static final String DE_APP_KEY 		= IT_APP_KEY;
	public static final String DE_APP_SECRET 	= IT_APP_SECRET;
	public static final String DE_APP_TOKEN 	= "eplwmc9efqzy0rwenlz8jsmkumobexpyzhzy6qzfz6bpn8ygeq5hikzfeq7";
	public static final String DE_MALL_ID 		= "670702092943543";
	public static final String DE_ENDPOINT	 	= TemuEndpoints.EU;
	public static final String DE_SELLER_CENTRAL= IT_SELLER_CENTRAL;
	public static final String DE_USERNAME 		= IT_USERNAME;
	public static final String DE_PASSWORD 		= IT_PASSWORD;
	
	
	public static final TemuAuthParams getForIT() {
		return new TemuAuthParams()
				.setTestAccount(true)
				.setAppKey(IT_APP_KEY)
				.setAccessToken(IT_APP_TOKEN)
				.setAppSecret(IT_APP_SECRET)
				.setEndpoint(IT_ENDPOINT)
				.setMallId(IT_MALL_ID)
				;
	}
	
	public static final TemuAuthParams getForDE() {
		return new TemuAuthParams()
				.setTestAccount(true)
				.setAppKey(DE_APP_KEY)
				.setAccessToken(DE_APP_TOKEN)
				.setAppSecret(DE_APP_SECRET)
				.setEndpoint(DE_ENDPOINT)
				.setMallId(DE_MALL_ID)
				;
	}
	
	public static final TemuAuthParams getForMX() {
		return new TemuAuthParams()
				.setTestAccount(true)
				.setAppKey(MX_APP_KEY)
				.setAccessToken(MX_APP_TOKEN)
				.setAppSecret(MX_APP_SECRET)
				.setEndpoint(MX_ENDPOINT)
				.setMallId(MX_MALL_ID)
				;
	}
	
	public static final TemuAuthParams getForUS() {
		return new TemuAuthParams()
				.setTestAccount(true)
				.setAppKey(US_APP_KEY)
				.setAccessToken(US_APP_TOKEN)
				.setAppSecret(US_APP_SECRET)
				.setEndpoint(US_ENDPOINT)
				.setMallId(US_MALL_ID)
				;
	}
}
