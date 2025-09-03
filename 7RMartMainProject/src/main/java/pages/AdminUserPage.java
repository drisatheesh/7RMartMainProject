package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUserPage {
public WebDriver driver;
PageUtility utility=new PageUtility();
WaitUtility wait=new WaitUtility();
public AdminUserPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
@FindBy(xpath="//input[@id='username']")WebElement usernamefield;
@FindBy(xpath="//input[@id='password']")WebElement passwordfield;
@FindBy(xpath="//select[@id='user_type']")WebElement sel;
@FindBy(xpath="//button[@class='btn btn-block-sm btn-danger' and@name='Create']")private WebElement save;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement search;
@FindBy(xpath="@FindBy(xpath=//a[@class='btn btn-rounded btn-primary']")WebElement reset;
@FindBy(xpath="//input[@id='un']")WebElement username;
@FindBy(xpath="//select[@id='ut']")WebElement usertype;
@FindBy(xpath="//button[@class='btn btn-block-sm btn-danger' and@value='sr']")WebElement searchuser;

public AdminUserPage newClick()
{
	wait.waitForElementToBeClickable(driver, newbutton);
	newbutton.click();
	return this;
}
public AdminUserPage usertext(String username)
{
	
	usernamefield.sendKeys(username);
	return this;
}
public AdminUserPage password(String password)
{
	
	passwordfield.sendKeys(password);
	return this;
}
public AdminUserPage select()
{
	utility.selectByIndex(sel, 2);
	return this;
}
public AdminUserPage saveClick()
{
	wait.waitForElementToBeClickable(driver, save);
	save.click();
	return this;
}
public boolean isAlert()
{
	return alert.isDisplayed();
}
public AdminUserPage search()
{
	search.click();
	return this;
}
public AdminUserPage enterUsername(String user)
{
	username.sendKeys(user);
	return this;
}
public AdminUserPage enteruserType()
{
	utility.selectByIndex(usertype, 2);
	return this;
}

public AdminUserPage enteruserSearch()
{
	wait.waitForElementToBeClickable(driver, searchuser);
	searchuser.click();
	return this;
}

}
