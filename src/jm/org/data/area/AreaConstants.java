package jm.org.data.area;

public interface AreaConstants {
	
	/*
	 * Search Response Message Types
	 */
	public static final int SEARCH_FAIL = -1;
	public static final int SEARCH_SUCCESS = 0;
	public static final int SEARCH_API_SOME = 1;
	public static final int SEARCH_API_NONE = 2;

	public static final String WB_BASE_URL 		= "http://api.worldbank.org/";
	public static final String IDS_DASE_URL		= "http://api.ids.ac.uk/openapi/"; 
	public static final String BING_BASE_URL	= "";
	
	public static final int INDICATOR_LIST 		= 0; 
	public static final int COUNTRY_LIST 		= 1;
	public static final int COUNTRY_INFO		= 2;
	public static final int GLOBAl_SEARCH		= 3;
	public static final int GENERIC_SEARCH		= 4;
	
	
	// Data keys for APIs
	public static final String WB_IND_ID 		= "id" 			;
	public static final String WB_IND_NAME		= "name"		;
	public static final String WB_IND_DESC		= "sourceNote"	;
	public static final String[] WB_IND_LIST	= {WB_IND_ID, WB_IND_NAME, WB_IND_DESC};
}
