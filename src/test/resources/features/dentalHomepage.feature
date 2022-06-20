@SmokeTest
Feature: AllServicesShowOnWebsite

  
  Scenario: Navigate to Home Page and check all services are visible in 4 categories. Each category have list of services in there
    Given User is on HomePage
    When Under Dental Services In Thornhill" Verify that all services are visible

  
  Scenario Outline: Navigate to Home Page and check all services are clickable and verify with the page header
    Given User is on HomePage
    And Click on "<service>" under Dental Services In Thornhill
    Then You will go to the next page, verify with the header "<service_header>" is correct then go back to homepage use example list below

  
  Scenario Outline: On the top of menu button clicks on services then each categories of service are clickable, after clicked verify all services in that category are visible
    Given user is on HomePage
    Then On the top of menu button click on services then each categories of service are clickable, Click on service_catagory
    And Verify all services in this category are visible service_list
