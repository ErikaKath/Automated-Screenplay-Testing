Feature: Login
  I as user, need start login to make use their services
  @LoginSuccessful
  Scenario: Login Successful
    Given He user is on the page
    When He user enter credentials
      | username | password  |
      | 23456130 | aswdeq78* |
    Then He user could see his account

  @LoginFailed
  Scenario: Login failed
    Given He user is on the page
    When He user enter incorrect credentials
      | username | password  |
      | 416562   | ht1548T*   |
      | 23456130 | aswdeq78** |
    Then He user couldn't see the his account

  @LoginIncomplete
  Scenario: Login incomplete
    Given He user is on the page
    When He user enter credentials incomplete
      | username | password   |
      | 416562   |            |
      |          | aswdeq78** |
    Then He user couldn't see the his account