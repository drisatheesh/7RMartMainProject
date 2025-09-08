package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.FileUploadUtility;

public class ManageCategoryTest extends Base {
	HomePage homepage;
	ManageCategoryPage managecategory;
	//FileUploadUtility file=new FileUploadUtility();
	//String path=Constants.CHOSEFILE1;
  @Test(retryAnalyzer = retry.Retry.class)
  public void verifyWhetherTheUserIsAbleToCreateACategory() throws AWTException, IOException 
  {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass(ExcelUtility.getStringData(4,0,"LoginTest"),ExcelUtility.getStringData(4,1,"LoginTest"));
	  homepage=loginpage.signing();
	  managecategory=homepage.managecategoryMoreinfoClick();
	  managecategory.newClick().category(Constants.CATEGORY).chooseFile().save();
	  
}
  @Test
  public void verifyWhetherTheUserIsAbleToDeleteCategory() throws IOException
  {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass(ExcelUtility.getStringData(4,0,"LoginTest"),ExcelUtility.getStringData(4,1,"LoginTest"));
	  homepage=loginpage.signing();
	  managecategory=homepage.managecategoryMoreinfoClick();
	  managecategory.deleteeClick();
  }
}
