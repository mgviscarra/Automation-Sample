Feature: Github Example


  @web @android
  Scenario: Github wrong login
    Given 'Github' page is loaded
    When I try to log on Github with invalid credentials
    Then I verify that credentials error message is displayed


  @web @android
  Scenario: Github successful login
    Given 'Github' page is loaded
    When I log on Github with valid credentials
    Then I verify that I am logged in Github


  @web @android
  Scenario: Github navigation
    Given 'Github' page is loaded
    When I log on Github with valid credentials
    Then I verify that I am logged in Github
    And I go to issues
    Then I verify the issues page
    And I go to pull requests
    Then I verify the pull request page
    And I go to organizations
    Then I verify the organizations page
    And I go to repositories
    Then I verify the repositories page