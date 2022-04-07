package Class;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Pages.HomePage;
import Pages.Loginnpage;
import Pages.LogoutPage;
import Pages.Messagepage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef
{
	public RemoteWebDriver driver;
	public Loginnpage obj1;
	public HomePage obj2;
	public Messagepage obj3;
	public LogoutPage obj4;
	@Given("open {string} browserr")
	public void method1(String x)
    {
		//open browser
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    obj1=new Loginnpage(driver);
	    obj2=new HomePage(driver);
	    obj3=new Messagepage(driver);
	    obj4=new LogoutPage(driver);
	}

	@Given("launch site usingg {string}")
	public void launch_site_usingg(String url) throws Exception
	{
	    driver.get(url);
	    Thread.sleep(5000);
	}

	@When("do login usingg {string} and {string} credentials")
	public void do_login_usingg_and_credentials(String uid, String pw) throws Exception 
	{
	   obj1.fillUserName(uid);
	   obj1.fillPassword(pw);
	   obj1.clickLogin();
	   obj1.clickNotNow();
	   obj2.clickNotNow1();
	}

	@Then("Instagram is displayedd")
	public void instagram_is_displayedd() 
	{
	    if(obj2.isInstagramdisplayed())
	    {
	    	System.out.println("instagram page opened");
	    }
	    else
	    {
	    	System.out.println("instagram page not opened");
	    	
	    }
	    
	}

	@When("click on message icon and send message")
	public void click_on_message_icon_and_send_message(DataTable dt) throws Exception 
	{
		List<Map<String,String>> b=dt.asMaps();
		for(int i=0; i<b.size(); i++)
		{
	   obj2.clickMessageIcon();
	   obj3.fillMsg(b.get(i).get("message"));
	  // obj3.clickNaveen();
	//obj3.fillMsg(x);
	   obj3.clickSend();
		}
	   
	}

	@When("do logoutt")
	public void do_logoutt() throws Exception 
	{
	    obj4.clickprofilepic();
	    obj4.clicksignout();
	    
	}

	@Then("Login page should be redisplayedd")
	public void login_page_should_be_redisplayedd()  
	{
	   if(obj4.isLoginReDisplayed())
	   {
		   System.out.println("Successfully redisplyed");
	   }
	   else
	   {
		   System.out.println("UnSuccessfully redisplyed");
	   }
	}

	@When("close sitee")
	public void close_sitee() 
	{
		//close site
	    driver.close();
	}

}
