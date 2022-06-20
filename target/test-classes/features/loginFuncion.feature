@Smoke
Feature: Verify login funcion

  Background: Navigate to home page

  Scenario Outline: Login funcinality
    Given Navigate to home page
    And Click on My Account Menu
    When Enter registered "<username>" username textbox
    And Enter "<password>" in password textbox
    And Click on login button
    Then User on home page
    Then Click on sign out button
    Then Verify the page header

    Examples: 
      | username           | password     |
      | Yusan410@gmail.com | Yusan8559693 |

 
