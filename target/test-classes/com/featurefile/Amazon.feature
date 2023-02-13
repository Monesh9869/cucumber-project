Feature: Amazonpage login functionalities

@login @smoke
  
  Scenario Outline: login detail
    Given user navigate to login page 
    When  enter "<username>" and enter "<password>"
    Then  user clicks login button
    
   Examples:
|username|password|
|+918508102350|monesh@98|

@searchproduct @smoke @Regression
Scenario: search and click
    Given user finds the searchbar and clear 
    When  user gives the input in searchbar
    Then  user click search icon
   
  