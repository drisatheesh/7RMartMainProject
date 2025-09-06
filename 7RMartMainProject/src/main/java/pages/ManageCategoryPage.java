package pages;

import java.awt.AWTException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategoryPage {
	public WebDriver driver;
	FileUploadUtility file=new FileUploadUtility();
	PageUtility page=new PageUtility();
	WaitUtility wait=new WaitUtility();
	String pathh=Constants.CHOSEFILE1;
 public ManageCategoryPage(WebDriver driver)
 {
	    this.driver=driver;
		PageFactory.initElements(driver, this);
 }
 @FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement categorynewclick;
 @FindBy(xpath="//input[@class='form-control']")WebElement category;
 @FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
 @FindBy(xpath="//button[@type='submit']")WebElement save;
 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/category/delete?del=2857&page_ad=1']")WebElement deletee;
 
 public ManageCategoryPage newClick()
 {
	 categorynewclick.click();
	 return this;
 }
 public ManageCategoryPage category(String categoryname)
 {
	 category.sendKeys(categoryname);
	 return this;
 }
 public ManageCategoryPage chooseFile() throws AWTException
 {
	
		    
		    choosefile.sendKeys(pathh);
		    return this;
		
 
 }

 public ManageCategoryPage save()
 {
	 page.javascript(save, driver);
		wait.waitForElementToBeClickable(driver, save);
		save.click();
		return this;
	 
 }
 public ManageCategoryPage deleteeClick()
 {
 	deletee.click();
 	driver.switchTo().alert().accept();
 	return this;
 }
	 
}
