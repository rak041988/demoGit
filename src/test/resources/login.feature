Feature: Login
  As a Admin
  I want to login into Orange HRM
  So that I want to acess HRM application

  Background: 
    And I am on Login page

  @smoke
  Scenario: Valid Login
    When I enter "Admin" "Xwq3qYaY"
    And I click on Submit button
    Then I should be logged into HRM
    And I should see Logout
    And I should see Welcome

  @e2e
  Scenario Outline: Invalid Login
    When I enter "<UserName>" "<Password>"
    And I click on Submit button
    Then I should not be logged into HRM

    Examples: 
      | UserName | Password    |
      | lkdjfglk | slkgjfgklkd |
