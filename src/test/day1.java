package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@AfterTest
	public void endData()
	{
		System.out.println("print this at last");
	}

	@Test
	public void Demo()
	{
		System.out.println("hello");
	}
	
	@Parameters({"URL"})
	@Test
	public void Demo2(String urlname)
	{
		System.out.println("hello2");
		System.out.println(urlname);
	}
	
	@Test(groups= {"Smoke"})
	public void secondTest()
	{
		System.out.println("how do u do?");
	}
	
	@BeforeTest
	public void preRequisite()
	{
		System.out.println("print first");
	}
	
	@AfterSuite()
	public void afSuite() 
	{
		System.out.println("The god from the last");
	}
}
