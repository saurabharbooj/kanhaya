package tutorial1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class demo1 {

	public static void main(String[] args) {
		
		
				//Specific base url
		        
				RestAssured.baseURI="https://www.google.com";
				
				//get Request Specifiction Object
				
				RequestSpecification httpRequest =RestAssured.given();
				
				//hit the Request
				
				Response resp =httpRequest.request(Method.GET);
				
				System.out.println(resp.getStatusCode());
				
				System.out.println(resp.getStatusLine());

	}

}
