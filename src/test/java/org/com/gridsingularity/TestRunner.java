package org.com.gridsingularity;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
                 features = "src/test/java/org/com/gridsingularity/resources",
                 glue = {"org.com.gridsingularity"})
public class TestRunner {
}
