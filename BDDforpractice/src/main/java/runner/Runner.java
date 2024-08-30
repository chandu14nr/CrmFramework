package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="featurefiles/Google.feature",
glue={"stepdefinitions"},dryRun = false,
plugin = {"html:target/output.html"},
monochrome = true)
public class Runner extends AbstractTestNGCucumberTests{
}
