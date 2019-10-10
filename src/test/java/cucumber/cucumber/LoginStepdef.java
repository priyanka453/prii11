package cucumber.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepdef {
	 WebDriver driver;
	@Given("^User is in home page$")
	public void user_is_in_home_page() throws Throwable {
	 driver = utilityclass.openBrowser("Chrome");
	 driver.get("http://demoaut.com/");
	}

	@When("^user enters credentials and perform login$")
	public void user_enters_credentials_and_perform_login() throws Throwable {
	    page page=new page(driver);
	    page.login("mercury","mercury");
	}

	@Then("^user is logged in$")
	public void user_is_logged_in() throws Throwable {
	    WebDriverWait wait=new WebDriverWait(driver,100);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.name("tripType")));
	    Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
	    System.out.println("Logged in successfully");
	    driver.close();
	}
}
