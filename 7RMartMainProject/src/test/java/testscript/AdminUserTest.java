package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;
import utilities.PageUtility;

public class AdminUserTest extends Base {
	HomePage homepage;
	AdminUserPage adminuserpage;
	FakerUtility faker=new FakerUtility();
	PageUtility utility=new PageUtility();
	 
  @Test
  
  public void verifyWhetherTheUserIsAbleToCreateAdminUserInformation() throws IOException
  {
	  
	  
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass(ExcelUtility.getStringData(4,0,"LoginTest"),ExcelUtility.getStringData(4,1,"LoginTest"));
	  homepage=loginpage.signing();
	  adminuserpage=homepage.moreinfoClick();
	// String username=faker.getFakeFirstName();
	 //String password=faker.getPassword();
	  
	  adminuserpage.newClick().usertext(ExcelUtility.getStringData(1,0,"AdminUserText")).password(ExcelUtility.getStringData(1,1,"AdminUserText")).select().saveClick();
	/* AdminUserPage adminuserpage=new AdminUserPage(driver);
	  adminuserpage.moreinfoClick();
	  adminuserpage.newClick();
	  adminuserpage.usertext("Herb123");
	  adminuserpage.password("ab78");
	  adminuserpage.select();
	  adminuserpage.saveClick();*/
	  boolean isalertdisplayed=adminuserpage.adminUserisAlert();
	  Assert.assertTrue(isalertdisplayed,"alert not displayed");
	 
  }@Test
  public void verifyWhetherTheUserIsAbleToSearchAdminUserInformation() throws IOException
  {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass(ExcelUtility.getStringData(4,0,"LoginTest"),ExcelUtility.getStringData(4,1,"LoginTest"));
	  homepage=loginpage.signing();
	  adminuserpage=homepage.moreinfoClick();
	  adminuserpage.search().enterUsername(ExcelUtility.getStringData(1,0,"AdminUserSearch")).enteruserType().enteruserSearch();
  }
  @Test
  public void verifyWetherTheUserIsAbleToDeleteAdminUserInformation() throws IOException
  {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass(ExcelUtility.getStringData(4,0,"LoginTest"),ExcelUtility.getStringData(4,1,"LoginTest"));
	  homepage=loginpage.signing();
	  adminuserpage=homepage.moreinfoClick();
	  adminuserpage.deleteClick();
  }
}
