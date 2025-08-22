package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;


public class LoginTest extends Base{
	HomePage homepage;
  @Test
  @Parameters({"username","password"})
  public void loginWithCorrectUsernameAndPassword(String username,String password) 
  {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass(username,password);
	  homepage=loginpage.signing();
	  
	  boolean ishomepageisloaded=loginpage.isDashboardIsDisplayed();
	  Assert.assertTrue(ishomepageisloaded, Constants.ERRORMESSAGEFORLOGIN);
	
  }
  @Test(dataProvider="credentials")
  public void loginWithCorrectUsernameAndIncorrectPassword(String username,String password)
  {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass(username,password);
	  loginpage.signing();
	  boolean isalertdisplayed=loginpage.isAlertDisplayed();
	  Assert.assertTrue(isalertdisplayed,"alert not displayed");
  }
  @Test
  public void loginWithIncorrectUsernameAndCorrectPassword() throws IOException
  {
	  String username=ExcelUtility.getStringData(1,0,"LoginTest");
		String password=ExcelUtility.getStringData(1,1,"LoginTest");

	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass(username, password);
	  loginpage.signing();
  }
  @Test
  public void loginWithIncorrectUsernameAndIncorrectPassword() throws IOException
  {
	  String username=ExcelUtility.getStringData(3,0,"LoginTest");
		String password=ExcelUtility.getStringData(3,1,"LoginTest");

	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass(username,password);
	  loginpage.signing();
	 
	  
  }
  
  @DataProvider(name="credentials")
  public Object[][] testdata()
  {
	  Object data[][]= {{"admin","admin"},{"aadmin","admin"},{"admin","addmin"},{"aadmin","addmik"}};
	  return data;
  }
}
