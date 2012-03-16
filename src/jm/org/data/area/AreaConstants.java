package jm.org.data.area;

public interface AreaConstants {
	
	/*
	 * Search Response Message Types
	 */
	public static final int FATAL_ERROR		= -2;
	public static final int SEARCH_FAIL 	= -1;
	public static final int SEARCH_SUCCESS 	=  0;
	public static final int SEARCH_API_SOME =  1;
	public static final int SEARCH_API_NONE =  2;

	public static final String WB_BASE_URL 		= "http://api.worldbank.org/"		;
	public static final String IDS_DASE_URL		= "http://api.ids.ac.uk/openapi/"	; 
	public static final String BING_BASE_URL	= "http://api.bing.net/"			;
	
	public static final int INDICATOR_LIST 		= 0; 
	public static final int COUNTRY_LIST 		= 1;
	public static final int API_LIST			= 2;
	public static final int PERIOD_LIST			= 3;
	public static final int SEARCH_DATA			= 4;
	public static final int COUNTRY_SEARCH_DATA = 5;
	public static final int WB_SEARCH_DATA		= 6;
	public static final int COUNTRY_INFO		= 7;
	public static final int IDS_SEARCH_DATA		= 8;
	public static final int IDS_PARAM_DATA		= 9;
	public static final int IDS_RESULT_DATA		= 10;
	public static final int BING_SEARCH_DATA	= 11;
	public static final int BING_RESULT_DATA	= 12;
	
	
	/*
	 * API CODE
	 */
	public static final int WORLD_SEARCH = 0;
	public static final int IDS_SEARCH = 1;
	public static final int BING_SEARCH = 2;
	
	//Broadcast Receivers
	public static final String ACTION_WORLD_UPDATE = "Area.WorldBank.Update";
	public static final String ACTION_IDS_UPDATE = "Area.IDS.Update";
	public static final String ACTION_BING_UPDATE = "Area.Bing.Update";
	public static final String ACTION_FAIL_UPDATE = "Area.Fail.Update";
	
	// Data keys for World Bank API Calls
	public static final String WB_IND_ID 		= "id" 			;
	public static final String WB_IND_NAME		= "name"		;
	public static final String WB_IND_DESC		= "sourceNote"	;
	public static final String[] WB_IND_LIST	= {WB_IND_ID, WB_IND_NAME, WB_IND_DESC};
	
	public static final String WB_COUNTRY_ID 				= "id" 					;
	public static final String WB_COUNTRY_ISOCODE			= "iso2Code"			;
	public static final String WB_COUNTRY_NAME				= "name"				;
	public static final String WB_COUNTRY_REGION_ID			= "region: id"			;
	public static final String WB_COUNTRY_REGION_NAME		= "region: value"		;
	public static final String WB_COUNTRY_INCOME_LEVEL_ID	= "incomeLevel: id"		;
	public static final String WB_COUNTRY_INCOME_LEVEL_NAME = "incomeLevel: value"	;
	public static final String WB_COUNTRY_CAPITAL			= "capitalCity"			;
	public static final String[] WB_COUNTRY_LIST	= {WB_COUNTRY_ID, WB_COUNTRY_ISOCODE, WB_COUNTRY_NAME, WB_COUNTRY_CAPITAL, 
														WB_COUNTRY_INCOME_LEVEL_ID, WB_COUNTRY_INCOME_LEVEL_NAME,
														WB_COUNTRY_REGION_ID, WB_COUNTRY_REGION_NAME };
	
	public static final String WB_IND_VALUE		= "value"	;
	public static final String WB_IND_DECIMAL	= "decimal"	;
	public static final String WB_IND_YEAR		= "date"	;
	public static final String[] WB_DATA_LIST = {WB_IND_VALUE, WB_IND_DECIMAL, WB_IND_YEAR};
	
	// Data keys for IDS API Calls
	public static final String IDS_SEARCH_DOC_URL 		= "metadata_url"	;
	public static final String IDS_SEARCH_DOC_ID		= "object_id"		;
	public static final String IDS_SEARCH_DOC_TYPE		= "object_type"		;
	public static final String IDS_SEARCH_DOC_TITLE		= "title"			;
	public static final String[] IDS_SEARCH_LIST	= { IDS_SEARCH_DOC_URL, IDS_SEARCH_DOC_ID, IDS_SEARCH_DOC_TYPE, IDS_SEARCH_DOC_TITLE};
	
	//Data keys for the BING API calls
	public static final String BING_SEARCH_TITLE 	= "Title"		;
	public static final String BING_SEARCH_DESC		= "Description"	;
	public static final String BING_SEARCH_URL		= "Url"	 		;
	public static final String BING_SEARCH_DISP_URL	= "DisplayUrl"	;
	public static final String BING_SEARCH_DATE		= "DateTime"	;
	public static final String[] BING_SEARCH_LIST = {BING_SEARCH_TITLE, BING_SEARCH_DESC, BING_SEARCH_URL, BING_SEARCH_DISP_URL, BING_SEARCH_DATE};
	//public static final String[] FROM_BING_SEARCH_RESULTS	= {_ID, B_S_ID, BING_TITLE, BING_DESC, BING_URL, BING_DISP_URL, BING_DATE_TIME	};
	
	
	// list of words to remove from indicator names
	public static final String[] KEYWORD_LIST = {"and", "land", "under", "area", "index", "in", "at", "the", "on", "for", };
	// Synchronous vs Singular Searching
	public static boolean SEARCH_SYNC = true;
}
