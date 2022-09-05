package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPageObj;
	DatabasePage databasepage;

	@Before
	public void beforeRun() {
		initDriver();
		loginPageObj = PageFactory.initElements(driver, LoginPage.class);
		databasepage = new DatabasePage();
	}

	@Given("^User is on Techfios login page$")
	public void user_is_on_techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		loginPageObj.insertUserName(username);
	
	}
	@When("^User enters \"([^\"]*)\"$")
	public void user_enters_(String data) {
		
	if  (data.equalsIgnoreCase("username")) {
			loginPageObj.insertUserName("demo@techfios.com");
	}else if (data.equalsIgnoreCase("password")) {
			loginPageObj.insertPassword("abc123");
	}else {
	System.out.println("invalid data");
		}
	}
		
//		OR
//		
//		switch(data) {
//		case "username":
//			loginPageObj.insertUserName("username");
//			break;
//		case "password":
//			loginPageObj.insertPassword("password");
//			break;
//			default :
//				System.out.println("invalid data");
//		
//		}
//		
		
	
	

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginPageObj.insertPassword(password);
	}

	@When("^User clicks signin button$")
	public void user_clicks_signin_button() {
		loginPageObj.clickSigninButton();
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling", loginPageObj.getPageTitle());
		takeScreenshot(driver);
	
	}
	
	
	
	
	@When("^User enters \"([^\"]*)\" from Techfios database$")
	public void user_enters_from_Techfios_database(String data) {
		switch(data) {
		case "username":
		   System.out.println("Username from DB: " + databasepage.getDataFromDb("username"));
		   loginPageObj.insertUserName(databasepage.getDataFromDb("username"));
		   break;
		  case "password":
		   System.out.println("Password from DB: " + databasepage.getDataFromDb("password"));
		   loginPageObj.insertPassword(databasepage.getDataFromDb("password"));
		   break;
		  default:
		   System.out.println("invalid data");
		}
	   
	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();

	}

}
