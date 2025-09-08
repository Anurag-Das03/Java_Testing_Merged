package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "classpath:Features",
	    glue = "stepdefinitions",
	    plugin = {"pretty", "html:target/cucumber-reports.html"}
	)
public class TestRunner extends AbstractTestNGCucumberTests {

    }

