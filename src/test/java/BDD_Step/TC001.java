package BDD_Step;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001 
{
    @Given("^User is Navigated to Gmail Login Page$")
    public void user_is_navigated_to_gmail_login_page() throws Throwable {
        System.out.println("Customer Navigated to Gmail");
    }

    @When("^User Enters Username and Password$")
    public void user_enters_username_and_password() throws Throwable {
    	System.out.println("Customer Enetered Username as Sam and Password As 1234");
    }

    
    @When("^User Enters Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void user_enters_username_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable 
    {
     System.out.println(strArg1+"   "+strArg2);   
    }    
    
    @Then("^Welcome Mesage is Displayed$")
    public void welcome_mesage_is_displayed() throws Throwable {
        
    	System.out.println("Welcome Message is Displayed");
    }

    @And("^User clicks on Login$")
    public void user_clicks_on_login() throws Throwable {
    	System.out.println("User Clicked on the Login Page");
    }

    @And("^Test End$")
    public void test_end() throws Throwable 
    {
    
    	System.out.println("Test End");
    }

    @Then("^Welcome Mesage is Displayed \"([^\"]*)\"$")
    public void welcome_mesage_is_displayed_something(String strArg1) throws Throwable {
     System.out.println("Welcome Mesage is Displayed "+strArg1);
    }
    
    @Given("^User is Navigated to Gmail Signup Page$")
    public void user_is_navigated_to_gmail_signup_page() throws Throwable {
        System.out.println("User is Navigated to Gmail Signup Page");
    }

    @When("^User Enters the following signup details$")
    public void user_enters_the_following_signup_details(DataTable data) throws Throwable {
    	System.out.println("User Entered the following details");
    	
    	List<List<String>> obj= data.asLists();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	
    }

    @And("^User clicks on Create an account$")
    public void user_clicks_on_create_an_account() throws Throwable {
        System.out.println("USER ACCOUNT IS CREATED");
    }
    
    @When("^User Enters into Username (.+) and Password (.+)$")
    public void user_enters_username_and_password(String username, String password) throws Throwable 
    {
    System.out.println(username);
    System.out.println(password);
    }

    
    @Given("^Browser Chrome$")
    public void browser_chrome() throws Throwable {
       System.out.println("Browser Chrome");
    }

    @When("^Launch Browser$")
    public void launch_browser() throws Throwable 
    {
    	System.out.println("Launching Browser");
    }

    @Then("^Browser Launches with default URL$")
    public void browser_launches_with_default_url() throws Throwable 
    {
    	System.out.println("Browser Opened");    
    }
    
    @And("^Test Starts$")
    public void test_starts() throws Throwable {
        System.out.println("Test Starts");
    }

    
}
