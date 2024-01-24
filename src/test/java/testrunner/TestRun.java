package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
	    features = {".//features/Purchase.feature"},
	    glue = "Stepdefinition",
	    dryRun = false,
	    monochrome = true,
	    plugin = {"pretty", "html:target/cucumber-reports1.html"}
	)
	public class TestRun {

	}




