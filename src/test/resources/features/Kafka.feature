Feature: rest-assured

  Scenario: Is Letters To Milena shipped to MNE
    When I search "Letters To Milena" on google books
    Then I should see that book author is "Franz Kafka"
    And I should see that books is not shipped to Montenegro

  Scenario: Is The Trial shipped to MNE
    When I search "The Trial" on google books
    Then I should see that book author is "Franz Kafka"
    And I should see that books is not shipped to Montenegro


  Scenario Outline: Not shipped to MNE
    Given I search "<bookName>" on google books
    Then I should see that book author is "Franz Kafka"
    And I should see that books is not shipped to Montenegro

    Examples:
      | bookName          |
      | The Metamorphosis |
      | TheCastle         |