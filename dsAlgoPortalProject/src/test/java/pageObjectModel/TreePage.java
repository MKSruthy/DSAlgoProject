package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TreePage {
	WebDriver driver;
	By getStartedTree = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[6]//a");
	By OverviewofTree = By.xpath("//a[contains(text(),'Overview of Trees')]");
	By terminologies = By.xpath("//a[contains(text(),'Terminologies')]");
	By typesoftree = By.xpath("//a[contains(text(),'Types of Trees')]");
	By treeTraversals = By.xpath("//div[@id='content']//li[4]");
	By illustration = By.xpath("//a[contains(text(),'Traversals-Illustration')]");
	By binaryTree = By.xpath("//*[@id='content']/li[6]/a");
	By typesofBT = By.xpath("//a[contains(text(),'Types of Binary Trees')]");
	By binarytreeTraversals = By.xpath("//a[contains(text(),'Binary Tree Traversals')]");
	By implemeentationofPython = By.xpath("//a[contains(text(),'Implementation in Python')]");
	By implementaionofBtree = By.xpath("//a[contains(text(),'Implementation of Binary Trees')]");
	By applicationofBtree = By.xpath("//a[contains(text(),'Applications of Binary trees')]");
	By binarysearchTree = By.xpath("//a[contains(text(),'Binary Search Trees')]");
	By implimenationofBST = By.xpath("//a[contains(text(),'Implementation Of BST')]");
	
	public TreePage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickOnGetStartedTree() {
		driver.findElement(getStartedTree).click();
	}
	public void clickOnOverviewofTree() {
		driver.findElement(OverviewofTree).click();
	}
	public void clickOnterminologies() {
		driver.findElement(terminologies).click();
	}
	public void clickOntypesoftree() {
		driver.findElement(typesoftree).click();
	}
	public void clickOntreeTraversals() {
		driver.findElement(treeTraversals).click();
	}
	public void clickOnillustration() {
		driver.findElement(illustration).click();
	}
	public void clickOnbinaryTree() {
		driver.findElement(binaryTree).click();
	}
	public void clickOntypesofBT() {
		driver.findElement(typesofBT).click();
	}
	public void clickOnbinarytreeTraversals() {
		driver.findElement(binarytreeTraversals).click();
	}
	public void clickOnimplemeentationofPython() {
		driver.findElement(implemeentationofPython).click();
	}
	public void clickOnimplementaionofBtree() {
		driver.findElement(implementaionofBtree).click();
	}
	public void clickOnapplicationofBtree() {
		driver.findElement(applicationofBtree).click();
	}
	public void clickOnbinarysearchTree() {
		driver.findElement(binarysearchTree).click();
	}
	public void clickOnimplimenationofBST() {
		driver.findElement(implimenationofBST).click();
	}
}
