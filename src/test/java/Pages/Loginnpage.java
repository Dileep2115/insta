package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginnpage 
{
	//Define Element locators
@FindBy(name="username")
public WebElement Username;
@FindBy(name="password")
public WebElement Password;
@FindBy(xpath="//div[text()='Log In']")
public WebElement Login;
@FindBy(xpath="//button[text()='Not Now']")
public WebElement Notnow;
// constructor method
public Loginnpage(RemoteWebDriver driver)
{
//connect "driver" object to above defined locators
PageFactory.initElements(driver,this);
}
//operational and observation methods
public void fillUserName(String x)
{
	//locate and operate element
	Username.sendKeys(x);
}
public void fillPassword(String x)
{
	Password.sendKeys(x);
	
}
public void clickLogin() throws Exception
{
	Login.click();
	Thread.sleep(5000);
}
public void clickNotNow() throws Exception
{
	Notnow.click();
	Thread.sleep(3000);
}
}