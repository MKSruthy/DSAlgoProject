package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import junit.framework.Assert;
import pageObjectModel.LogInPage;

public class DsAlgoSignInStep extends BaseClass {

	@Given("The user opens Chrome Browser and  Enter the LogIn page url {string}")
	public void the_user_opens_chrome_browser_and_enter_the_log_in_page_url(String url) {
	    
	    driver.manage().window().maximize();
	    driver.get(url);
	 }

	@When("^user enter the (.*)and(.*)$")
	public void the_user_enter_the_user_name_and_password(String uname,String password) {
		lp=new LogInPage(driver);
		lp.enterUserName(uname);
	   lp.enterPassword(password);
	}

	@And("click on Login")
	public void click_on_login() {
	    lp.clickOnLogin();
	}

	@Then("It should navigate to the home page with a message {string}")
	public void it_should_navigate_to_the_home_page_with_a_message(String message) {
		String actualmesg=lp.alert();
	   Assert.assertTrue(message.contains(actualmesg));
	}
	
}
