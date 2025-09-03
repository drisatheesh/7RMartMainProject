package pages;

import java.awt.AWTException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;

public class ManageCategoryPage {
	public WebDriver driver;
	FileUploadUtility file=new FileUploadUtility();
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
	 choosefile.click();
	 file.fileUploadForSendKeys(choosefile, pathh);;
	//file.fileUploadForRobotClass(choosefile,pathh);
	return this;
 
 }

 public ManageCategoryPage save()
 {
	 save.click();
	 return this;
 }
	 
}
