package Test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day1 {
	
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		System.out.println("execute after test");
	}
	@Parameters({"url","username","password"})	
@Test
	public void Demo(String urlstring,String user,String pass)
	{
		System.out.println(urlstring);
		System.out.println(user);
		System.out.println(pass);
	}
@Test
public void lastexecution()
{
	System.out.println("Last execution");
	Assert.assertTrue(false);
}
@Test(dataProvider="getData")
public void Demo2Test(String username,String Password)
{
	System.out.println(username);
	System.out.println(Password);
}
@DataProvider
public Object getData()
{
	Object[][] data=new Object[3][2];
	data[0][0]="0firstusername";
	data[0][1]="0firstpassword";
	data[1][0]="1firstusername";
	data[1][1]="1firstpassword";
	data[2][0]="2firstusername";
	data[2][1]="2firstpassword";
	return data;
}
}


