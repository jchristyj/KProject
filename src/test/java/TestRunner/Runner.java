package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/khols.feature",
glue="stepDefinition" ,plugin = {"html:target/cucumber-reports.html"})
public class Runner {

}
