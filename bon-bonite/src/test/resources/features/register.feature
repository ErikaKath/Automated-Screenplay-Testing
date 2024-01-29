#Author: Erika Olivera
Feature: Register

  I as user, need register on the Bon-Bonite page to access its services

@RegisterSuccessful
  Scenario: Register Successful
    Given He user is on the page
    When He user register in the page
      | iD       | email           | password  |
      | 416562   | lps@gmil.com    | ht1548*   |
      | 4578222  | klp@hotmail.com | asdec147* |
      | 23456130 | ased@yahoo.com  | aswdeq78* |
    Then He user could see his account

@RegisterFailed
Scenario: Register Failed
    Given He user is on the page
    When He user register incomplete data in the page
      | ID      | email            | password    |
      |         | kasjdn@yahoo.com | aswde1478*  |
      | 2344566 |                  | asdefrw147* |
      | 2478531 | tele@gmail.com   | asdd1478*   |
    Then He user continue in the page of register