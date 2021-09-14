package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.example.StepDefinitions"},
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber_reports/cucumber.json"},
        tags = "@nsw"
)
public class TestRunner extends AbstractTestNGCucumberTests {

    }
