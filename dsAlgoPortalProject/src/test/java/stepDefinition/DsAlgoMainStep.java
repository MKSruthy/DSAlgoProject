package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import junit.framework.Assert;
import pageObjectModel.MainPage;


public class DsAlgoMainStep extends BaseClass{
	

	@Given("User open Chrome Browser")
	public void user_open_chrome_browser() {
		
		 mp=new MainPage(driver);
		driver.manage().window().maximize();
	}

	@And("User Open Url {string}")
	public void user_open_url(String url) {
	   driver.get(url);
	}
	@When("User clicks on Get Started button")
	public void user_clicks_on_get_started_button() {
	    mp.clickOnGetStarted();
	    
	}
	@Then("The user redirected to home page as the title {string}")
	public  void  the_user_redirected_to_home_page_as_the_title(String title) {
		String actualtitle=driver.getTitle();
		Assert.assertEquals(title, actualtitle);
	}

	
	@Then("The user clicks on data structure dropdown")
	public void the_user_clicks_on_data_structure_dropdown() {
		mp.clickOnDropDown();
	}

	@When("The user select one of the dropdown menu")
	public void the_user_select_one_of_the_dropdown_menu() {
		mp.selectFromDropDown();
	}

	@Then("It should Alert the user with the message {string}")
	public void it_should_alert_the_user_with_the_message(String mesg) {
		String actualmesg=mp.alertMesg();
		Assert.assertTrue(actualmesg.contains(mesg));
	}
	@When("The user click any of thr Get started button in home page")
	public void the_user_click_any_of_thr_get_started_button_in_home_page() {
	   mp.clickGetStartedBtnHome();
	}
	@When("The user click on Register")
	public void the_user_click_on_register() {
		mp.clickOnRegister();
	}

	@Then("The user should be redirected to Register page as title {string}")
	public void the_user_should_be_redirected_to_register_page_as_title(String titlereg) {
	    String actualtitle=driver.getTitle();
	    Assert.assertEquals(titlereg, actualtitle);
	    
	}
	
	
}
