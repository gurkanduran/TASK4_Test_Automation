package com.automationpractice.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                 "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/automationpractice/step_definitions",
        dryRun = false,
        tags = "@summerDress"
)
public class CukesRunner {
}
