package bcdstepdefinitions1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDC_Demo_05_definitions {
	WebDriver driver;
	@Given("I am launching the webshop url")
	public void i_am_launching_the_webshop_url() {
		driver= Drivers.configureDriver("explorer");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("I will check on Login")
	public void i_will_check_on_Login() {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("I enter username {string} and password {string}")
	public void i_enter_username_and_password(String string, String string2) {
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(string2);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("verify for user account status")
	public void verify_for_user_account_status() {
		System.out.println("Status");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
