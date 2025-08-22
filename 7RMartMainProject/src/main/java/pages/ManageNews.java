package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNews {
	public WebDriver driver;
	public ManageNews(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath="//textarea[@id='news']")WebElement enternews;
	@FindBy(xpath="//button[@type='submit']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	public ManageNews newButtonClick()
	{
		newbutton.click();
		return this;
	}
	public ManageNews enterNews(String news)
	{
		
		enternews.sendKeys(news);
		return this;
	}
	public ManageNews saveButtonClick()
	{
		save.click();
		return this;
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}

}
