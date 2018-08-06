package com.sqstraining.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class clientReqStepDefs
{
    //declare variables here
    RequestSpecification httpRequest;
    Response response;

    @Given("^I launch a browser$")
    public void i_launch_a_browser()
    {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

        // Get the RequestSpecification of the request that you want to sent
        // to the server. The server is specified by the BaseURI that we have
        // specified in the above step.
        httpRequest = RestAssured.given();
        response = httpRequest.get(); //.request(Method.GET, "/Hyderabad");
        JsonPath jpath= response.jsonPath();
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);
    }

    @When("^I open web Homepage$")
    public void i_open_web_Homepage()
    {
        //Here I'll send the GET Request to get the weather info of a specific vicinity

        // Make a request to the server by specifying the method Type and the method URL.
        // This will return the Response from the server. Store the response in a variable.
        response = httpRequest.request(Method.GET, "/Johannesburg");

    }

    @Then("^I search for tomorrows weather$")
    public void i_search_for_tomorrows_weather()
    {
        // Now let us print the body of the message to see what response
        // we have recieved from the server
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);

        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/Johannesburg");

        // Get the status code from the Response. In case of
        // a successfull interaction with the web service, we
        // should get a status code of 200.
        int statusCode = response.getStatusCode();

        // Assert that correct status code is returned.
        //Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");

    }

}
