Feature: to test the application
  Scenario Outline: to test the login and book tghe laptop
    Given user on loginpage "<username>" and "<password>"
    When user search a laptop
    Then user select the laptop and add to cart
    Examples:
      | username                   | password  |
      | jaggumulamraju36@gmail.com | jaggu@789 |





