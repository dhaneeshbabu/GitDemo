package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	
	@Test(dataProvider = "getData")
	public void webloginCarLoan(String username, String passwd)
	{
		System.out.println("weblogincarloan");
		System.out.println(username);
		System.out.println(passwd);
	}
	
	
	@Test(dependsOnMethods= {"MobilelsigninCarLoan","webloginCarLoan"})
	public void MobileloginCarLoan()
	{
		System.out.println("Mobilelogincarloan");
	}
	
	
	@Test(groups = {"Smoke"})
	public void APIloginCarLoan()
	{
		System.out.println("APIlogincarloan");
	}
	
	@Parameters({"URL"})
	@Test
	public void MobilelsigninCarLoan(String website)
	{
		System.out.println("Mobilesignincarloan");
		System.out.println(website);
	}
	
	@Test
	public void MobilesignoutCarLoan()
	{
		System.out.println("Mobilesignoutcarloan");
		Assert.assertTrue(false);
	}
	
	
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("This is an intermediate before mthod step");
	}
	
	@AfterMethod
	public void afMethod()
	{
		System.out.println("This is an intermediate after method");
	}
	
	
@DataProvider
public Object[][] getData()
{
	Object[][] data = new Object[3][2];
	data[0][0] = "1stusrname";
	data[0][1] = "1psswd";
	data[1][0] = "2usernam";
	data[1][1] = "2ndpsswd";
	data[2][0] ="3username";
	data[2][1] = "3psswd";
	return data;
	
	
	}	
		
}

		
			
