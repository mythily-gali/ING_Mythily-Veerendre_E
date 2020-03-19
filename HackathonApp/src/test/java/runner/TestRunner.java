package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\Features\\FirstCry.feature" ,
glue={"stepdefinition" }
, strict=true,
monochrome=true,
plugin={"pretty" ,"html:target-output"})

public class TestRunner {

}
