package stepDefinition;

import io.cucumber.java.en.When;
import pageObjectModel.TreePage;


public class TreeStep extends BaseClass {
	
	@When("user click on Get Started button on Tree")
	public void user_click_on_get_started_button_on_tree() {
	   tp=new TreePage(driver);
	   tp.clickOnGetStartedTree();
	}

	@When("user click on Overview of Trees")
	public void user_click_on_overview_of_trees() {
	    tp.clickOnOverviewofTree();
	}
	@When("user click on Terminologies")
	public void user_click_on_terminologies() {
	   tp.clickOnterminologies();
	}

	@When("user click on Types of Trees")
	public void user_click_on_types_of_trees() {
	    tp.clickOntypesoftree();
	}

	@When("user click on Tree Traversals")
	public void user_click_on_tree_traversals() {
	    tp.clickOntreeTraversals();
	}

	@When("user click on Traversals-Illustration")
	public void user_click_on_traversals_illustration() {
	    tp.clickOnillustration();
	}

	@When("user click on Binary Trees")
	public void user_click_on_binary_trees() {
	   tp.clickOnbinaryTree();
	}

	@When("user click on Types of Binary Trees")
	public void user_click_on_types_of_binary_trees() {
	    tp.clickOntypesofBT();
	}

	@When("user click on Implementation in Python")
	public void user_click_on_implementation_in_python() {
	   tp.clickOnimplemeentationofPython();
	}

	@When("user click on Binary Tree Traversals")
	public void user_click_on_binary_tree_traversals() {
	    tp.clickOnbinarytreeTraversals();
	}

	@When("user click on Implementation of Binary Trees")
	public void user_click_on_implementation_of_binary_trees() {
	    tp.clickOnimplementaionofBtree();
	}

	@When("user click on Applications of Binary trees")
	public void user_click_on_applications_of_binary_trees() {
	    tp.clickOnapplicationofBtree();
	}

	@When("user click on Binary Search Trees")
	public void user_click_on_binary_search_trees() {
	   tp.clickOnbinarysearchTree();
	}

	@When("user click on Implementation Of BST")
	public void user_click_on_implementation_of_bst() {
	    tp.clickOnimplimenationofBST();
	}
}
