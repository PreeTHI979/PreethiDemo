package bcdstepdefinitions1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BDC_Demo_04_defintions {
	WebDriver driver;
	@Given("User logins with valid credntials in DemoWebshop")
	public void user_logins_with_valid_credntials_in_DemoWebshop() {
		
		driver= Drivers.configureDriver("explorer");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demowebshop.tricentis.com/");
	   
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("Clicks on login buton")
	public void clicks_on_login_buton() {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("preethi123T@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("preethi123");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("user clicks on the books")
	public void user_clicks_on_the_books() {
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("user is able to add a book to the cart")
	public void user_is_able_to_add_a_book_to_the_cart() {
		
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("user clicks the logout button to close the window")
	public void user_clicks_the_logout_button_to_close_the_window() {
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("user clicks on the computers")
	public void user_clicks_on_the_computers() {
		
		driver.findElement(By.xpath("//a[@href='/jewelry']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("user adds computer to the cart")
	public void user_adds_computer_to_the_cart() {
		
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user clicks the logout button")
	public void user_clicks_the_logout_button() {
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
  
	 
	
}
