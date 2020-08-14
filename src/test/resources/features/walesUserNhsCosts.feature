Feature: Wales users into Checker tool about NHS costs
  Background:
    Given User is in landing page
    When user clicks start button
    Then user choose  "Wales" and click next button

  @smoke
  Scenario: The user should have partner and recieve Universal Credit

    Given user write a date of birth as "12" "11" "2000"
    Then user should live with a partner
    And user or user's partner claim any benefits or tax credits
    And user or user's partner recieve Universal Credit payments
    And user have as part of your joint Universal Credit
    And user and user's partner had a combined take-home pay of £935 or less in your last Universal Credit Period
    And user should recieve this message contains "Done"


  Scenario: The user should NOT have partner and no claim any benefit

    Given user write a date of birth as "07" "07" "1976"
    Then user should NOT live with a partner
    And user should NOT claim any benefits or tax
    And user should NOT pregnant or have you given birth in the last 12 months
    And user should NOT have an injury or illness caused by serving in he armed forces
    And user should NOT have diabetes
    And user should NOT have glaucoma
    And user should NOT live permanently in a care home
    And user should NOT have more than £16000 in savings, investments or property
    And user should recieve this message contains "You get help with NHS costs"
