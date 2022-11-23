package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinklistPage {
	WebDriver driver;
	By getstartedlinklist =By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[3]//a");
	By introLink = By.xpath("//a[@href='introduction']");
	By createLinkedListLink = By.xpath("//a[text()='Creating Linked LIst']");
	By typesOfLinkedListLink = By.xpath("//a[text()='Types of Linked List']");
	By linkedListPython = By.xpath("//a[text()='Implement Linked List in Python']");
	By traversal = By.xpath("//a[text()='Traversal']");
	By insertion = By.xpath("//a[text()='Insertion']");
	By deletion = By.xpath("//a[text()='Deletion']");
	public LinklistPage(WebDriver driver) {
			this.driver=driver;
	}
	public void clickOnGetStartedBtnLInkList() {
			driver.findElement(getstartedlinklist).click();
	}
	public void clickOnIntroduction() {
		driver.findElement(introLink).click();
	}
	public void clickOncreateLinkedList() {
		driver.findElement(createLinkedListLink).click();
	}
	public void clickOntypesOfLinkedList() {
		driver.findElement(typesOfLinkedListLink).click();
	}
	public void clickOnLinkedListPython() {
		driver.findElement(linkedListPython).click();
	}
	public void clickOnTraversal() {
		driver.findElement(traversal).click();
	}
	public void clickOnInsertion() {
		driver.findElement(insertion).click();
	}
	public void clickOnDeletion() {
		driver.findElement(deletion).click();
	}
	
}
