package com.sqstraining.stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class weatherMessageBody
{
    @Given("^I launch the browser$")
    public void i_launch_the_browser()
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I search for tomorrows weather on the web$")
    public void i_search_for_tomorrows_weather_on_the_web()
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Test
    @Then("^I validate the response body$")
    public void i_validate_the_response_body()
    {
        // Write code here that turns the phrase above into concrete actions
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/Johannesburg");

        // Retrieve the body of the Response
        ResponseBody body = response.getBody();

        // By using the ResponseBody.asString() method, we can convert the  body
        // into the string representation.
        System.out.println("Response Body is: " + body.asString());
    }

}
