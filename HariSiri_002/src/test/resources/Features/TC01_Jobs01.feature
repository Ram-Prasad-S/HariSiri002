@Smoke
Feature: Create Job Record automatiom in openorange hrm 
	
Background: common steps 
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
@Scenario1
Scenario: TC01 Add Job - particular Test Object
    And User enters username as "Admin" and password as "admin123"
    Then Navigate to Job Page
    When Add Job Records with Jobname as "Selenium_BDD" and Jobdescription as "Test_Engineer" Jobnote "5 Years of Exp"
    When Click on logout button
    Then Close Browser