package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prabi\\Documents\\SRUTHY\\sruthy-eclipse-workspace\\dsAlgoPortalProject\\src\\test\\resources\\Features",
glue={"stepDefinition"},
plugin= {"pretty","junit:target/cucumber-reports/Cucumber.xml","html:target/HtmlReports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class TestRunnerdsalgo {

}
