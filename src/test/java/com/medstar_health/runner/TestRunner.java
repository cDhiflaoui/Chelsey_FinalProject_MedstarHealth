package com.medstar_health.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"com.medstar_health.stepdefinitions", "com.medstar_health.hooks"},
        plugin = {"pretty", "html:target/Medstar_Health-report-final.html",
                "rerun:target/failed_scenarios.txt"},
        dryRun = true, // make sre to chnage this to false if you want to really execute  your tests
        tags= "@smoke"

)
public class TestRunner {

}
