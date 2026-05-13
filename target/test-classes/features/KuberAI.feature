Feature: Kuber.AI Deep Think Mode Validation

  Scenario: User asks a financial question in Kuber.AI

    Given User launches Simplify Money application

    When User opens Kuber.AI Deep Think Mode

    And User enters a financial question

    And User clicks on Send button

    Then AI response should be displayed successfully