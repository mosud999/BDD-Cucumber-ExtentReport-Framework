package cucumber_junit.extent_report.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver dr;
	@Given("^open browser and navigate to yahoo$")
	public void open_browser_and_navigate_to_yahoo() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Bittech\\Driver\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://www.google.com");
	   
	}

	@When("^give the username and pass$")
	public void give_the_username_and_pass(String username, String pass) throws Throwable {
	   //dr.findElement(By.xpath("//input[@id='userid']")).sendKeys(username);
	  // dr.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
	}

	@Then("^it should sign in and login to the yahoo page$")
	public void it_should_sign_in_and_login_to_the_yahoo_page() throws Throwable {
	   dr.close();
	}
}
