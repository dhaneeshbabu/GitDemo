package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {

	@Parameters({"WEB","APIKey/username"})
	@Test(groups= {"Smoke"})
	public void test2method(String urlnamesd,String username)
	{
		System.out.println("test 2 class");
		System.out.println(urlnamesd);
		System.out.println(username);
	}
	
}
