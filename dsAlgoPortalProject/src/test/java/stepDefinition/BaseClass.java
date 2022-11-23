package stepDefinition;

import static stepDefinition.DriverManager.getDriver;
import org.openqa.selenium.WebDriver;

import pageObjectModel.ArrayPage;
import pageObjectModel.DataStructurePage;
import pageObjectModel.GraphPage;
import pageObjectModel.LinklistPage;
import pageObjectModel.LogInPage;
import pageObjectModel.MainPage;
import pageObjectModel.QueuePage;
import pageObjectModel.RegisterPage;
import pageObjectModel.StackPage;
import pageObjectModel.TreePage;
public class BaseClass {
	
	public static WebDriver driver;
	public static MainPage mp;
	public static RegisterPage rp;
    public	static LogInPage lp;
    public static ArrayPage ap;
    public  static DataStructurePage dp;
    public static LinklistPage ll;
    public static StackPage sp;
    public static TreePage tp;
    public static QueuePage qp;
    public static GraphPage gp;

	static
	{
		driver=getDriver();
	}
    

}
