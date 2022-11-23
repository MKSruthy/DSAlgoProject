package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjectModel.DataStructurePage;


public class DsAlgoDataStructureStep extends BaseClass {
	
	@Given("The user is in home page as title {string}")
	public void the_user_is_in_home_page_as_title(String title) {
	    Assert.assertEquals(title, driver.getTitle());
		dp=new DataStructurePage(driver);
	}

	@When("user click on Get started button in Data Structure")
	public void user_click_on_get_started_button_in_data_structure() {
	
	   dp.clickOnGetstartedDataStructure();
	}

	@When("user click on Time Complexity")
	public void user_click_on_time_complexity() {
	    dp.clickTimeComplexity();
	  	}
	@Then("user is navigated to home page {string}")
	public void user_is_navigated_to_home_page(String url) {
	   driver.get(url);
	}

}
