package stepDefinition;

import io.cucumber.java.en.When;
import pageObjectModel.LinklistPage;


public class DsAlgoLinklistStep extends BaseClass {
	@When("user click on Get Started button on Linklist")
	public void user_click_on_get_started_button_on_linklist() {
	    ll=new LinklistPage(driver);
	    ll.clickOnGetStartedBtnLInkList();
	}
	@When("user click on Introduction")
	public void user_click_on_introduction() {
	    ll.clickOnIntroduction();
	}
	@When("user click on Creating Linked LIst")
	public void user_click_on_creating_linked_l_ist() {
	   ll.clickOncreateLinkedList();
	}

	@When("user click on Types of Linked List")
	public void user_click_on_types_of_linked_list() {
	    ll.clickOntypesOfLinkedList();
	}

	@When("user click on Implement Linked List in Python")
	public void user_click_on_implement_linked_list_in_python() {
	    ll.clickOnLinkedListPython();
	}

	@When("user click on Traversal")
	public void user_click_on_traversal() {
	   ll.clickOnTraversal();
	}

	@When("user click on Insertion")
	public void user_click_on_insertion() {
	    ll.clickOnInsertion();
	}

	@When("user click on Deletion")
	public void user_click_on_deletion() {
	    ll.clickOnDeletion();
	}

}
