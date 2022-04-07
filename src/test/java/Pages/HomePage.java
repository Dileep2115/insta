package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//Define Element locators
	@FindBy(xpath="//button[text()='Not Now']")
	public WebElement Notnow1;
	@FindBy(xpath="//img[@alt='Instagram']")
	public WebElement Instagram;
	@FindBy(xpath="//*[name()='svg' and @aria-label='Messenger']")
	public WebElement Messanger;
	// constructor method
	public HomePage(RemoteWebDriver driver)
	{
	//connect "driver" object to above defined locators
	PageFactory.initElements(driver,this);
	}
	//operational and observation methods
	public void clickNotNow1() throws Exception
	{
		Notnow1.click();
		Thread.sleep(5000);
	}
	public boolean isInstagramdisplayed()
	{
		try
		{
			if(Instagram.isDisplayed())
			{
				return(true);
			}
			else
			{
				return(false);
			}
		}
		 catch(Exception ex)
		{
		return(false);
		}
	}
	public void clickMessageIcon() throws Exception
	{
		Messanger.click();
		Thread.sleep(10000);
	}
}
