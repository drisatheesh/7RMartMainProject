package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
 public void selectByIndex(WebElement element,int intex)
 {
	 Select select=new Select(element);
	 select.selectByIndex(intex);
 }
 public void selectByValue(WebElement element,String value) 
    {
		Select select =new Select(element);
		select.selectByValue(value);
		
	}
 public void selectByVisibleText(WebElement element,String text)
	{
		Select select =new Select(element);
		
		select.selectByVisibleText(text);
		
	}
 public void actionDoubleClick(WebElement element,WebDriver driver) 
	{
	   
		Actions actions=new Actions(driver);
		actions.doubleClick(element).build().perform();
		
	}
 public void contextClick(WebElement element,WebDriver driver) 
	{
	   
		Actions actions=new Actions(driver);
		actions.contextClick(element).build().perform();
		
	}
 public void mousehover(WebElement element,WebDriver driver) 
	{
	   
		Actions actions=new Actions(driver);
		actions.moveToElement(element).build().perform();
		
	}
 public void javascript(WebElement element,WebDriver driver)
 {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,1000)");
 }
 
}
