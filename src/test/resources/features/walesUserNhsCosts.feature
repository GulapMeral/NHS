Feature: Wales users into Checker tool about NHS costs

@smoke
  Scenario: The user should have partner and recieve Universal Credit

    Given User is in landing page
    When user clicks start button
    Then user choose  "Wales" and click next button
    And user write a date of birth as "07" "07" "1976"
    And user shouldn't live with a partner
    And user or user's partner claim any benefits or tax credits
    And user or user's partner recieve Universal Credit payments
    And user have as part of your joint Universal Credit
    And user and user's partner had a combined take-home pay of £935 or less in your last Universal Credit Period
    And user recieve this message contains "your Universal Credit claim are also entitled to full help with NHS costs."

