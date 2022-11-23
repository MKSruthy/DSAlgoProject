package stepDefinition;

import io.cucumber.java.en.When;
import pageObjectModel.StackPage;


public class DsAlgoStackStep extends BaseClass{
	@When("user click on Get Started button on Stack")
	public void user_click_on_get_started_button_on_stack() {
	    sp=new StackPage(driver);
	    sp.clickOnGetStartedStack();
	}

	@When("user click on Operations in Stack")
	public void user_click_on_operations_in_stack() {
	    sp.clickOnOperationsInStack();
	}
	@When("user click on Implementation")
	public void user_click_on_implementation() {
	   sp.clickOnImplementation();
	}

	@When("user click on Applications")
	public void user_click_on_applications() throws InterruptedException {
	    Thread.sleep(1000);
		sp.clickOnApplications();
	}
}
