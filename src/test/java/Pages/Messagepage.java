package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Messagepage 
{
	//Define Element locators
	@FindBy(xpath="((//div[text()='nameisnvn'])[1]/ancestor::div)[12]")
	public WebElement naveen;
	
	@FindBy(xpath="//textarea[contains(@placeholder,'Message')]")
	public WebElement msg;
	@FindBy(xpath="//button[text()='Send']")
	public WebElement send;
	
	public Messagepage(RemoteWebDriver driver)
	{
	//connect "driver" object to above defined locators
	PageFactory.initElements(driver,this);
	}
	//operational and observation methods
	public void clickNaveen() throws Exception
	{
		naveen.click();
		Thread.sleep(5000);
	}
	public void fillMsg(String x) 
	{
		msg.sendKeys("Rice aindhi rara\nPulihora raja");
			
	}
		
	
	public void clickSend() throws Exception
	{
		send.click();
		Thread.sleep(5000);
	}
	
}
