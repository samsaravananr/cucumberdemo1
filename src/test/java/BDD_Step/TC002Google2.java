package BDD_Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGEOBJECTS.HOMEPAGE;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC002Google2 
{
	WebDriver myD;
	
	 @Given("^User is navigated to Google.com Page$")
	    public void user_is_navigated_to_googlecom_page() throws Throwable 
	 	{
	        
	       	myD=Base.getDriver();
	        
	        myD.manage().window().maximize();
	        Thread.sleep(4000);
	    }

	    @When("^User Enters \"([^\"]*)\" and click Search Button$")
	    public void user_enters_something_and_click_search_button(String strArg1) throws Throwable 
	    {
	    	Thread.sleep(4000);
	    	HOMEPAGE HP=new HOMEPAGE(myD);
	    	HP.getGoogleSearch().sendKeys(strArg1);
	    	Thread.sleep(4000);
	    	HP.getGoogleSubmit().click();
	    	Thread.sleep(4000);
	    }

	    @Then("^\"([^\"]*)\" Search page is Displayed$")
	    public void something_search_page_is_displayed(String strArg1) throws Throwable 
	    {
	    String vCheck=myD.getTitle();
	    if (vCheck.contains(strArg1))
	    {
	    	System.out.println("TESTCASE PASS");
	    }
	    else
	    	System.out.println("TESTCASE FAIL");
	    }

	    @And("^Browser Closed$")
	    public void browser_closed() throws Throwable 
	    {
	    myD.close();
	    }
	    
	    @Then("^All IPL Videos Displayed$")
	    public void all_ipl_videos_displayed() throws Throwable 
	    {
	       String vText=myD.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3/span")).getText();
	       System.out.println(vText);
	    }

	    @And("^User Clicks on the videos$")
	    public void user_clicks_on_the_videos() throws Throwable 
	    {
	    myD.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[5]/a")).click();
	    Thread.sleep(2000);
	    }
	    
	    @When("^User Enters (.+) and click Search$")
	    public void user_enters_and_click_search(String team) throws Throwable {
	    {
	    	HOMEPAGE HP=new HOMEPAGE(myD);
	    	HP.getGoogleSearch().sendKeys(team);
	    	Thread.sleep(4000);
	    	HP.getGoogleSubmit().click();
	    	Thread.sleep(4000);
	       
	    }

}
}