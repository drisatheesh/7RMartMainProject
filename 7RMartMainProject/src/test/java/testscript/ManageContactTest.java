package testscript;

import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;

public class ManageContactTest extends Base {
	HomePage homepage;
	ManageContactPage managecontactpage;
  @Test
  public void verifyWhetherTheUserIsAbleToUpdateManageContact() 
  {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.userpass("admin123","admin");
	  homepage=loginpage.signing();
	  managecontactpage=homepage.manageContactMoreinfoClick();
	  managecontactpage.editClick().enterNumber("98654712").enteremail("satheesh@gmail.com").enterAddress("Malavila").enterDeliveryTime("4pm").enterDeliveryCharge("50").clickUpdate();
	  
  }
}
