package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ArrayPage {
	WebDriver driver;
	By getStart =By.xpath("//button[@class='btn']");
	By signIn=By.xpath("//ul/a[3]");
	By logIn=By.xpath("//input[@value='Login']");
	By userNameSignIn=By.id("id_username");
	By passwordSignIn=By.id("id_password");
	By getStartedArray=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[2]//a");
	By header=By.xpath("//div[2]/h4");
	By alertMessage =By.xpath("//div[@class='alert alert-primary']");
	By clkArrayPython=By.xpath("//a[text()='Arrays in Python']");
	By clkTryHere=By.xpath("//a[text()='Try here>>>']");
	By enterPythonText=By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By runBtn=By.xpath("//form[@id='answer_form']//button");
	By pythonOutPut=By.id("output");
	By clickonEntercode=By.xpath("//div[@class='CodeMirror-code']");
	By clickOnArraysUsingList=By.xpath("//a[text()='Arrays Using List']");
	By clickOnBasicOperation=By.xpath("//a[text()='Basic Operations in Lists']");
	By clickOnApplicationsOfArray=By.xpath("//a[text()='Applications of Array']");
	By clickOnPracticeQuest=By.xpath("//div[@id='content']//a[text()='Practice Questions']");
	By clickOnSearchArray=By.xpath("//div[@class='list-group'][1]/a");
	By clickOnMaxConsecutiveOne=By.xpath("//div[@class='list-group'][2]/a");
	By clickOnFindNum=By.xpath("//div[@class='list-group'][3]/a");
	By clickOnSquares=By.xpath("//div[@class='list-group'][4]/a");
	//By clearcode=By.xpath("//form[@id='answer_form']//div[6]/div[1]//div[5]//pre/span");
	
	public ArrayPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickOnGetStarted()  {
		driver.findElement(getStart).isDisplayed();
		driver.findElement(getStart).click();
		
	}
	public void clickOnSignIn() {
		driver.findElement(signIn).isDisplayed();
		driver.findElement(signIn).click();
	}
	
	public void enterUserNameSignIn(String user) {
		driver.findElement(userNameSignIn).sendKeys(user);
	}
	public void enterPasswordSignIn(String pswdsignIn) {
		driver.findElement(passwordSignIn).sendKeys(pswdsignIn);
		
	}
	public void clickOnLogIn() {
		driver.findElement(logIn).isDisplayed();
		driver.findElement(logIn).click();
		
	}
	public String alertMessage() {
		String alert=driver.findElement(alertMessage).getText();
		System.out.println(alert);
		return alert;
	}
	
	public String header() {
		String headermesg=driver.findElement(header).getText();
		return headermesg;
	}
	public void clickOnArraysOnPhython() {
		driver.findElement(clkArrayPython).click();
	}
	public void clickOnTryHere() {
		 driver.findElement(clkTryHere).isEnabled();
		 driver.findElement(clkTryHere).click();
	}
	
	public void clickOnRun() {
		driver.findElement(runBtn).isEnabled();
		driver.findElement(runBtn).click();		
	}
	public void enterPythonCode(String pythoncode) {
		System.out.println("***************************************Phython code**************************");
		driver.findElement(enterPythonText).sendKeys(pythoncode);
	}
	public void clickOnArrayUsingList() {
		driver.findElement(clickOnArraysUsingList).click();
	}
	public void clickOnBasicOperations() {
		driver.findElement(clickOnBasicOperation).click();
	}
	public void clickOnApplicationsOfArray() {
		driver.findElement(clickOnApplicationsOfArray).click();
		
	}
	public void clickOnPracticeQues() {
		driver.findElement(clickOnPracticeQuest).click();
		
	}
	public void clickOnGetStartedArray() {
		
		driver.findElement(getStartedArray).click();
	}
	
	public void clickOnSearchArray() {
		driver.findElement(clickOnSearchArray).click();
		
	}
	public void cliclOnMaxConsecutiveOnes() {
		driver.findElement(clickOnMaxConsecutiveOne).click();
	}
	public void clickOnFindEvenNum() {
		driver.findElement(clickOnFindNum).click();
		
	}
	
	public void clickOnFindSquares() {
		driver.findElement(clickOnSquares).click();		
	}
	public void clearPythoncode() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("************************************clear Code*************************");
		driver.findElement(enterPythonText).sendKeys(Keys.CONTROL,"a");
		driver.findElement(enterPythonText).sendKeys(Keys.DELETE);

	}
}
