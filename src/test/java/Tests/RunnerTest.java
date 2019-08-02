package Tests;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"C:\\Users\\User\\workspace\\CucumberPratcingRemove\\feature.feature"},
		plugin={"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"},
		glue="tt"
		
		)
public class RunnerTest {
	
	@AfterClass
	public static void setup()
	{
	Reporter.loadXMLConfig(new File("C:\\Users\\User\\workspace\\ExtentReport-in-BDD-Cucumber-Junit\\src\\test\\java\\Tests\\extent-config.xml"));
	//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "AJ");
	Reporter.setSystemInfo("Application Name", "Test App ");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "Production");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}

}
