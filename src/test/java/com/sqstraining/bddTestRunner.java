package com.sqstraining;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//setting the path for the feature file
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:requestweather.feature")

public class bddTestRunner
{

}
