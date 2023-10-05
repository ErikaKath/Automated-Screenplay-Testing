Feature: Add product
  I as user, need register on the Demoblanze page to access its services.
@AddProduct
  Scenario: Add product successful
  Given He user is on the page
  When He user selection the category
  And He user add product
  Then He user  could see his product