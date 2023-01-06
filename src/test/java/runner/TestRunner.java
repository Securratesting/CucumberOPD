package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(features="src/test/resources/feature",glue="stepDefinitions", tags="@Testingloginpage", monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests {
	TestNGCucumberRunner testNGrunner= new TestNGCucumberRunner(this.getClass());

}
