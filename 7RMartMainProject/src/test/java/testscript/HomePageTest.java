package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends Base {
	HomePage homepage;
  @Test
  public void verifyWhetherTheUserIsAbleToLogout()
  {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass("admin123","admin");
	  homepage=loginpage.signing();
	  homepage.adminClick().logoutselection();
	  /*HomePage homepage=new HomePage(driver);
	  //boolean imagedisplay=homepage.isImageDisplayed();
	  //Assert.assertTrue(imagedisplay,"No image");
	  homepage.adminClick();
	  homepage.logoutselection();*/
	  //System.out.println(driver.getTitle());
	  String expected="Login | 7rmart supermarket";
	  String actual=driver.getTitle();
	  Assert.assertEquals(expected, actual,"logout failed");
  }
}
