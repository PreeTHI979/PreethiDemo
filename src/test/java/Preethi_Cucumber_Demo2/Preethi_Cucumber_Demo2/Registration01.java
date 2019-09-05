package Preethi_Cucumber_Demo2.Preethi_Cucumber_Demo2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Registration01 {
	
	
	WebDriver driver;
	
	@Given("Application is launched by guest user")
	public void application_is_launched_by_guest_user() {
		driver = Drivers.configureDriver("explorer");
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("User clicks on sign In Link available")
	public void user_clicks_on_sign_In_Link_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}

	@When("provides the required data in the form")
	public void provides_the_required_data_in_the_form() {
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("ThyagarajTHR");
		  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("ABCDE");
		  driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("XYZAB");
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Preethi123");
		  driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("Preethi123");
		  
		  driver.findElement(By.xpath("//input[@value='Female']")).click();
		  driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("abc123@gmail.com");
		  driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9036390939");
		  
		  driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		  
		  Select month= new Select(driver.findElement(By.className("ui-datepicker-month")));
		  month.selectByVisibleText("Jan");
		  
		  Select year= new Select(driver.findElement(By.className("ui-datepicker-year")));
		  year.selectByVisibleText("1997");
		 
		  driver.findElement(By.linkText("9")).click();	  
		  
		  driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Bangalore");	  
		  
		  Select sq= new Select(driver.findElement(By.xpath("//select[@id='securityQuestion']")));
		  sq.selectByVisibleText("What is your Birth Place?");
		  

		  driver.findElement(By.xpath("//input[@id='answer']")).sendKeys("Casper");
		  
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user submits the data")
	public void user_submits_the_data() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("verifies for the account creation")
	public void verifies_for_the_account_creation() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}






