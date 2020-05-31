package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		/"src/test/resources/Features",
features= {"src/test/resources/ParallelFeatures"},
glue= {"stepDefinitions","hooks"},
plugin= {"html:target/report" }, strict=false
)
public class TestRunner {
	
	
}

