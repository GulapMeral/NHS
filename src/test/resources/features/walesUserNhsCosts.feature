Feature: Wales users into Checker tool about NHS costs
  Background:
    Given User is in landing page
    When user clicks start button
    Then user choose  "Wales" and click next button

  @smoke
  Scenario: The user should have partner and recieve Universal Credit

    Given user write a date of birth as "12" "11" "2000"
    When user lives with a partner
    And user or user's partner claim any benefits or tax credits
    And user or user's partner recieve Universal Credit payments
    And user have as part of your joint Universal Credit
    And user and user's partner had a combined take-home pay of "£935" or less in your last Universal Credit Period
    Then user should recieve this message contains "Done"

  @smoke
  Scenario: The user should NOT have partner and no claim any benefit

    Given user write a date of birth as "07" "07" "1976"
    When user does NOT live with a partner
    And user does NOT claim any benefits or tax
    And user is NOT pregnant or have you given birth in the last "12" months
    And user does NOT have an injury or illness caused by serving in he armed forces
    And user does NOT have diabetes
    And user does NOT have glaucoma
    And user does NOT live permanently in a care home
    And user does NOT have more than "£16,000" in savings, investments or property
    Then user should recieve this message contains "You get help with NHS costs"
