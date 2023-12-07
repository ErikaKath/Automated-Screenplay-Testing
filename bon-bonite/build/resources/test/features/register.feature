Feature: Register

  I as user, need register on the Bon-Bonite page to access its services

@RegisterSuccessful
  Scenario: Register Successful
    Given He user is on the page
    When He user register in the page
    Then He user could see his account

@RegisterFailed
Scenario: Register Failed
    Given He user is on the page
    When He user register incomplete data in the page
    Then He user continue in the page of register