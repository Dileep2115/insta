package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
	//Define Element locators
		@FindBy(xpath="//span[@role='link' and @style='width: 24px; height: 24px;']/img[@crossorigin='anonymous']")
		public WebElement profilepic;
		@FindBy(xpath="//div[text()='Log Out']")
		public WebElement signout;
		@FindBy(xpath="//h1[text()='Instagram']")
		public WebElement relogin;
		// constructor method
		public LogoutPage(RemoteWebDriver driver)
		{
		//connect "driver" object to above defined locators
		PageFactory.initElements(driver,this);
		}
		//operational and observation methods
		public void clickprofilepic() throws Exception
		{
			//locate and operate element
			profilepic.click();
			Thread.sleep(5000);
		}
		public void clicksignout() throws Exception
		{
			signout.click();
			Thread.sleep(30000);
		}
		public boolean isLoginReDisplayed()
		{
			try
			{
			if(relogin.isDisplayed())
			{
				return(true);
			}
			else
			{
				return(false);
			}
			}
			catch(Exception x)
			{
				return(false);
			}
		}
}
