Feature: Register
  I as user, need register on the Bon-Bonite page to access its services.

  Scenario:Register successful
    Given He user is on the page
    When He user register in the page
#      | identification | email                    | password   |
#      | 1006822100     | ekolivera2@misena.edu.co | Kata12345** |
#      | 4562789001     | elquin@gmail.com         | 07008Elkin** |
    Then He user could see the his account

