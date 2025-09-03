package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class HomePage {
     WaitUtility wait=new WaitUtility();
	 public WebDriver driver;
	 public HomePage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements( driver,this);
	 }
	 @FindBy(xpath="//a[@class='nav-link' and@data-toggle='dropdown']")WebElement admin;
	 @FindBy(xpath="//a[@class='dropdown-item'][2]")WebElement logout;
	 @FindBy(xpath="//img[@style='width: 1.5rem;height: auto;']")WebElement image;
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and@class='small-box-footer']")WebElement moreinfo;
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and@class='small-box-footer']")WebElement moreinfomanage;
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and@class='small-box-footer']")WebElement managecategory;
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and@class='small-box-footer']")WebElement managecontact;

	 public AdminUserPage moreinfoClick()
	 {
	 	moreinfo.click();
	 	return new AdminUserPage(driver);
	 }
	 public ManageNews managenewsMoreinfoClick()
		{
			moreinfomanage.click();
			return new ManageNews(driver);
		}
	 public ManageCategoryPage managecategoryMoreinfoClick()
	 {
		 managecategory.click();
		 return new ManageCategoryPage(driver);
	 }
	 public ManageContactPage manageContactMoreinfoClick()
	 {
		 managecontact.click();
		 return new ManageContactPage(driver);
	 }
	 public HomePage adminClick()
	 {
		 wait.waitForElementToBeClickable(driver, admin);
		 admin.click();
		 return this;
	 }
	 public HomePage logoutselection()
	 {
		 wait.waitForElementToBeClickable(driver, logout);
		 logout.click();
		 return this;
	 }
	 public boolean isImageDisplayed()
	 {
		 return image.isDisplayed();
	 }
}
