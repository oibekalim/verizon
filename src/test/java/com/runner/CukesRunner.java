package com.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "json:target/cucumber.json",
        features = "src/test/resources/com/features",
        glue = "com/step_def",
        dryRun = false,
        tags = "@preorder"
)

public class CukesRunner {
}
