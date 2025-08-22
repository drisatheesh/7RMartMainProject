package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {
     WaitUtility wait=new WaitUtility();
	 public WebDriver driver;
	 public LoginPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//input[@name='username']")WebElement username;
	 @FindBy(xpath="//input[@name='password']")WebElement password;
	 @FindBy(xpath="//button[text()='Sign In']")WebElement signin;
	 @FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	 @FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
	
	 
	 public LoginPage userpass(String user,String pass)
	 {
		 username.sendKeys(user);
		 password.sendKeys(pass);
		 return this;
	 }
	 public HomePage signing()
	 {
		 wait.waitForElementToBeClickable(driver, signin);
		 signin.click();
		 return new HomePage(driver);
	 }
	 public boolean isDashboardIsDisplayed()
	 {
		 return dashboard.isDisplayed();
	 }
	 public boolean isAlertDisplayed()
	 {
		 return alert.isDisplayed();
	 }
	
}
