package stepDefinition;

import io.cucumber.java.en.When;
import pageObjectModel.GraphPage;
import pageObjectModel.RegisterPage;

public class GraphStep extends BaseClass {

	@When("user click on Get Started button on Graph")
	public void user_click_on_get_started_button_on_graph() {
		rp=new RegisterPage(driver);
		gp = new GraphPage(driver);
		gp.clickGetStartedOnGraph();
	}

	@When("user click on Graph")
	public void user_click_on_graph() {
		gp.clickOnGraph();
	}

	@When("user click on Graph Representations")
	public void user_click_on_graph_representations() {
		gp.clickOnGraphRepresentation();
	}

}
