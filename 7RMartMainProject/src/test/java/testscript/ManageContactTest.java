package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	HomePage homepage;
	ManageContactPage managecontactpage;
  @Test
  public void verifyWhetherTheUserIsAbleToUpdateManageContact() throws IOException 
  {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass(ExcelUtility.getStringData(4,0,"LoginTest"),ExcelUtility.getStringData(4,1,"LoginTest"));

	  homepage=loginpage.signing();
	  managecontactpage=homepage.manageContactMoreinfoClick();
	  managecontactpage.editClick().enterNumber(Constants.NUM).enteremail(Constants.EMAIL).enterAddress(Constants.ADDRESS).enterDeliveryTime(Constants.TIME).enterDeliveryCharge(Constants.CHARGE).clickUpdate();
	  //boolean isalertdisplayed=managecontactpage.isAlertDisplayed();
	  //Assert.assertTrue(isalertdisplayed,"alert not displayed");
	  
  }
}
