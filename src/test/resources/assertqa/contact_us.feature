Feature: Contact us form


  Scenario Outline: Sending a message via Contact us form
    Given I am on homepage
    When I click on the CONTACT US button
      And I enter "<full_name>" in Full Name field
      And I enter "<email>" in Email field
      And I enter "<message>" in Message field
      And I click on the SEND MESSAGE button
    Then I should be told "<answer>"


    Examples:
      | full_name        | email                    | message | answer                                                                                  |
      | Jovan Jovanovic  | jjovanovictest@gmail.com | Test    | Thank You! Your message has been sent.                                                  |
      |                  | jjovanovictest@gmail.com | Test    | Invalid name                                                                            |
      | Jovan Jovanovic  |                          | Test    | Incorrect mail                                                                          |
      | Jovan Jovanovic  | jjovanovictest@gmail.com |         | Oops! There was a problem with your submission. Please complete the form and try again. |