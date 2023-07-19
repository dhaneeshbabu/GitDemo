package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {

	@Test
	public void webloginHomeLoan()
	{
		System.out.println("webloginHomeLoan");
	}
	
	
	@Test(timeOut=4000)
	public void MobileloginHomeLoan()
	{
		System.out.println("MobileloginHomeLoan");
	}
	
	
	@Test(groups= {"Smoke"})
	public void APIloginHomeLoan()
	{
		System.out.println("APIloginHomeLoan");
	}
	
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("The god from the begining");
	}
}
