Feature: rest-assured

  Scenario: get weather
    When I search "Letters To Milena" on google books
    Then I should see that book author is "Franz Kafka"
    And I should see that books is not shipped to Montenegro