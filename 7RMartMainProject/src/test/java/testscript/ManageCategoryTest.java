package testscript;

import java.awt.AWTException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.FileUploadUtility;

public class ManageCategoryTest extends Base {
	HomePage homepage;
	ManageCategoryPage managecategory;
	//FileUploadUtility file=new FileUploadUtility();
	//String path=Constants.CHOSEFILE1;
  @Test(retryAnalyzer = retry.Retry.class)
  public void verifyWhetherTheUserIsAbleToCreateACategory() throws AWTException 
  {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass("admin","admin");
	  homepage=loginpage.signing();
	  managecategory=homepage.managecategoryMoreinfoClick();
	  managecategory.newClick().category("Biscut").chooseFile().save();
	  
}
}
