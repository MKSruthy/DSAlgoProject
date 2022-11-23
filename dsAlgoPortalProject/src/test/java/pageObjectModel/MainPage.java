package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

	public WebDriver driver;
	
	By getStart=By.xpath ("//button[@class='btn']");
	By dropdownItem=By.	xpath("//div[@class='nav-item dropdown']");
	By selectdropdown=By.	xpath("//div[@class='dropdown-menu show']/a[3]");
	By mesg=By.	xpath("//div[@class='alert alert-primary']");
	By getStartedbtn=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[2]//a");
	By register=By.	xpath("//div[@class='navbar-nav'][2]/ul/a[2]");
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnGetStarted() {
	 driver.findElement(getStart).isDisplayed();
	 driver.findElement(getStart).click();
	}

	public void clickOnDropDown() {
	driver.findElement(dropdownItem).click();
	}

	public void selectFromDropDown() {
	driver.findElement(selectdropdown).click();
	}

	public String alertMesg() {
		String message =driver.findElement(mesg).getText();
		return message;
	}

	public void clickGetStartedBtnHome() {
	driver.findElement(getStartedbtn).isDisplayed();
	driver.findElement(getStartedbtn).click();
	}

	public void clickOnRegister() {
	driver.findElement(register).isDisplayed();
	driver.findElement(register).click();

	}
}
