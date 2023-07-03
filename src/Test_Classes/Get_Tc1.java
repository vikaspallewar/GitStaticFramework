package Test_Classes;


import Common_API_Methods.API_Methods_Get;

import RequestRepository.Get_Req_Repository;



public class Get_Tc1 {
	public static void extractor() {
		
	int statusCode = API_Methods_Get.ResponsestatusCode(Get_Req_Repository.BaseURI(),Get_Req_Repository.Get_Resource());
	
	System.out.println(statusCode);
	
	String ResponseBody = API_Methods_Get.ResponseBody(Get_Req_Repository.BaseURI(),Get_Req_Repository.Get_Resource());
	
	System.out.println(ResponseBody);
	
	
	
	
	}

}
