package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QueuePage {
	WebDriver driver;
	By getStartedGraph=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[5]//a");
	By implementationOfQueue=By.xpath("//a[text()='Implementation of Queue in Python']");
	By implentationCollection=By.xpath("//a[text()='Implementation using collections.deque']");
	By implementationArray=By.xpath("//a[text()='Implementation using array']");
	By queueOperations=By.xpath("//a[text()='Queue Operations']");
	
	public QueuePage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickOnGetStartedGraph() {
		driver.findElement(getStartedGraph).click();
	}
	public void clickOnImplementationOfQueue() {
		driver.findElement(implementationOfQueue).click();
	}
	public void clickOnImplentationCollection() {
		driver.findElement(implentationCollection).click();
	}
	public void clickOnImplementationArray() {
		driver.findElement(implementationArray).click();
	}
	public void clickOnQueueOperations() {
		driver.findElement(queueOperations).click();
	}


}
