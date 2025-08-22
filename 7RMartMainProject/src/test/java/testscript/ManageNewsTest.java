package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNews;

public class ManageNewsTest extends Base {
	HomePage homepage;
	ManageNews managenews;
  @Test
  public void verifyWhetherTheUserIsAbleToCreateNews()
  {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass("admin","admin");
	  homepage=loginpage.signing();
	  managenews=homepage.managenewsMoreinfoClick();
	  managenews.newButtonClick().enterNews("Hello").saveButtonClick();
	  boolean isalert=managenews.isAlertDisplayed();
	  Assert.assertTrue(isalert,"alert not displayed");
  }
}
