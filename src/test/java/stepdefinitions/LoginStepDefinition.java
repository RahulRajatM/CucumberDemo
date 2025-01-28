package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	static WebDriver driver;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {

		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String username, String password) {
		driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);

	}

	@And("Clicks on the login button")
	public void clicks_on_the_login_button() {
		driver.findElement(By.cssSelector("#login-button")).submit();

	}

	@Then("User should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {

		boolean flag=		driver.findElement(By.cssSelector("[data-icon='shopping-cart']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@And("Close the browser")
	public void close_the_browser() {

		driver.close();
	}



}
