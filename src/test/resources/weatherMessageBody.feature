Feature: Validate response from the weather web services body

  Scenario: Validating response

    Given I launch the browser
    When I search for tomorrows weather on the web
    Then I validate the response body