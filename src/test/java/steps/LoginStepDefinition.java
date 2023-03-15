package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;

	@Before
	public void BeforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}
	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		
		driver.get("https://techfios.com/billing/?ng=admin/");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		
		loginPage.enterUserName(username);
	   
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
	
		loginPage.enterPassword(password);
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignInButton();
		takeScreenshot(driver);
	  
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		takeScreenshot(driver);
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
