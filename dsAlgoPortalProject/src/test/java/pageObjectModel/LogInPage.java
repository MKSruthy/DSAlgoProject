package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

	WebDriver driver;
	By userName=By.id("id_username");
	By password=By.id("id_password");
	By login=By.xpath("//input[@value='Login']");
	By alert=By.xpath("//div[@class='alert alert-primary']");

	public LogInPage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterUserName(String uName) {
		driver.findElement(userName).sendKeys(uName);
	}
	public void enterPassword(String pswd) {
		driver.findElement(password).sendKeys(pswd);
	}
	public void clickOnLogin() {
		driver.findElement(login).click();
	}
	public String alert() {
		String mesg=driver.findElement(alert).getText();
		return mesg;
	}

}
