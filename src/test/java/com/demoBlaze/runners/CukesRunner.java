package com.demoBlaze.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = "com/demoBlaze/stepDefinitions",
        dryRun = true,
        tags = ""
)

public class CukesRunner {




}
