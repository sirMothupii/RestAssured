package com.sqstraining;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//setting the path for the feature file
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features"
        , glue = "com.sqstraining.stepDefs")

public class bddTestRunner
{

}
