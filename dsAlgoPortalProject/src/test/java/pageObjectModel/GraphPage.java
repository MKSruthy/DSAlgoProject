package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphPage {
	WebDriver driver;
	By getStartedGraph=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[7]//a");
	By clickGraph=By.xpath("//ul/a[text()='Graph']");
	By clickGraphRepresentation=By.xpath("//li/a[text()='Graph Representations']");
	public GraphPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickGetStartedOnGraph() {
		driver.findElement(getStartedGraph).click();
	}
	public void clickOnGraph() {
		driver.findElement(clickGraph).click();
	}
	public void clickOnGraphRepresentation() {
		driver.findElement(clickGraphRepresentation).click();
	}
}
