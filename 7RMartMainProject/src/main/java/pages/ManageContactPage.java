package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageContactPage {

	public WebDriver driver;
	WaitUtility wait=new WaitUtility();
	PageUtility page=new PageUtility();
	public ManageContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss']")WebElement edit;
	@FindBy(xpath="//input[@id='phone']")WebElement phonenumber;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//textarea[@name='address']")WebElement address;
	@FindBy(xpath="//textarea[@name='del_time']")WebElement deliverytime;
	@FindBy(xpath="//input[@name='del_limit']")WebElement deliverycharge;
	@FindBy(xpath="//button[@type='submit']")WebElement update;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;

	public ManageContactPage editClick()
	{
		edit.click();
		return this;
	}
	public ManageContactPage enterNumber(String number)
	{
		phonenumber.clear();
		phonenumber.sendKeys(number);
		return this;
	}
	public ManageContactPage enteremail(String mail)
	{
		email.clear();
		email.sendKeys(mail);
		return this;
	}
	public ManageContactPage enterAddress(String addr)
	{
		address.clear();
		address.sendKeys(addr);
		return this;
	}
	public ManageContactPage enterDeliveryTime(String time)
	{
		deliverytime.clear();
		deliverytime.sendKeys(time);
		return this;
	}
	public ManageContactPage enterDeliveryCharge(String charge)
	{
		deliverycharge.clear();
		deliverycharge.sendKeys(charge);
		return this;
	}
	public ManageContactPage clickUpdate()
	{
		wait.waitForElementToBeClickable(driver, update);
		page.javascript(update, driver);
		//wait.waitForElementToBeClickable(driver, update);
		update.click();
		return this;
	}
	public boolean isAlertDisplayed()
	 {
		 return alert.isDisplayed();
	 }
}
