package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataStructurePage {
	WebDriver driver;
	By getstartedDS=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[1]//a");
	By timecomplexity=By.xpath("//a[text()='Time Complexity']");
	public DataStructurePage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickOnGetstartedDataStructure() {
		driver.findElement(getstartedDS).click();
	}
	public void clickTimeComplexity() {
		driver.findElement(timecomplexity).click();
	}
}
