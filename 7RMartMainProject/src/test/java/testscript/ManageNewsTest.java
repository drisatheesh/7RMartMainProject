package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNews;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	HomePage homepage;
	ManageNews managenews;
  @Test
  public void verifyWhetherTheUserIsAbleToCreateNews() throws IOException
  {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass(ExcelUtility.getStringData(4,0,"LoginTest"),ExcelUtility.getStringData(4,1,"LoginTest"));

	  homepage=loginpage.signing();
	  managenews=homepage.managenewsMoreinfoClick();
	  managenews.newButtonClick().enterNews("Hello").saveButtonClick();
	  boolean isalert=managenews.isAlertDisplayed();
	  Assert.assertTrue(isalert,"alert not displayed");
  }
}
