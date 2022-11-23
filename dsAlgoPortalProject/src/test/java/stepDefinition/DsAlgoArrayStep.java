package stepDefinition;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import junit.framework.Assert;
import pageObjectModel.ArrayPage;

public class DsAlgoArrayStep extends BaseClass{
	
	//Scenario
	
	@Given("The user is in home page with title {string}")
	public void the_user_is_in_home_page_with_title(String title) {
		ap=new ArrayPage(driver);
		String actualtitle=driver.getTitle();
		Assert.assertEquals(title, actualtitle);
		System.out.println("###############################33333"+actualtitle);
	}
	@Then("click on Get started button in array")
	public void click_on_get_started_button_in_array() throws InterruptedException {
		Thread.sleep(500);
	    ap.clickOnGetStartedArray();
	}
	@And("It should navigate to corresponing page with header {string}")
	public void it_should_navigated_to_array_page_with_header(String title) throws InterruptedException {
		Thread.sleep(500);
		String actualtitle=driver.getTitle();
		   Assert.assertEquals(title, actualtitle);
	}
	
	@When("user click on Arrays in Phython")
	public void user_click_on_arrays_in_phython() throws InterruptedException {
		Thread.sleep(500);
	    ap.clickOnArraysOnPhython();
	}
	@Then("user click on Try here")
	public void user_click_on_try_here() throws InterruptedException {
		ap=new ArrayPage(driver);
		Thread.sleep(500);
		ap.clickOnTryHere();
	}

	@And("It should navigate to corresponding page with title {string}")
	public void it_should_navigate_to_corresponding_page_with_title(String title) {
	   Assert.assertEquals(title, driver.getTitle());
	}
	@When("^user enter the Python code$")
	public void user_enter_the_python_code(DataTable Pythoncode) throws InterruptedException {
		ap=new ArrayPage(driver);
		 List<List<String>>data=Pythoncode.cells();
		   ap.enterPythonCode(data.get(0).get(0));
		
	}
	@And("click on run button")
	public void click_on_run_button() {
		ap=new ArrayPage(driver);
		ap.clickOnRun();
	    
	}
	@Then("The result should be displayed below the run button")
	public void the_result_should_be_displayed_below_the_run_button() {
		 Allure.addAttachment("Python output", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		    driver.navigate().back();

	}
    @Then("User navigate back")
    public void user_navigate_back() {
	    driver.navigate().back();

    }

	
	@When("User click on Arrays using list")
	public void user_click_on_arrays_usin_list() {
		ap=new ArrayPage(driver);
		ap.clickOnArrayUsingList();
	}
	@When("User click on Basic Operations in list")
	public void user_click_on_basic_operations_in_list() {
		ap=new ArrayPage(driver);
		ap.clickOnBasicOperations();
	}
	@When("User click on Applications of Array")
	public void user_click_on_applications_of_array() {
		ap=new ArrayPage(driver);
		ap.clickOnApplicationsOfArray();
		}
	@When("user click on Practice Questions")
	public void user_click_on_pratice_questions() {
		ap=new ArrayPage(driver);
		ap.clickOnPracticeQues();
	}
	@When("user click on Search the array")
	public void user_click_on_search_the_array() {
		ap=new ArrayPage(driver);
		ap.clickOnSearchArray();
	}

	@When("user click on Max Consecutive Ones")
	public void user_click_on_max_consecutive_ones() {
		ap=new ArrayPage(driver);
		ap.cliclOnMaxConsecutiveOnes();
	}

	@When("user click on Find Numbers with Even Number of Digits")
	public void user_click_on_find_numbers_with_even_number_of_digits() {
		ap=new ArrayPage(driver);
		ap.clickOnFindEvenNum();
	}

	@When("user click on Find Numbers with Squares of  a Sorted Array")
	public void user_click_on_find_numbers_with_squares_of_a_sorted_array() {
		ap=new ArrayPage(driver);
		ap.clickOnFindSquares();
	}
	
	@When("^user clear the text and enter the Python code (.*)$")
	public void user_clear_the_text_and_enter_the_python_code_python_code(String code) throws InterruptedException {
		ap.clearPythoncode();
		ap.enterPythonCode(code);
	}

}
