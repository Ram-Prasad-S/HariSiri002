@tag
Feature: Create Job Record automatiom in orange hrm 
	
Background: common steps 
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: TC01 Add Job - particular Test Object
    And User Enters Login Credinitials
    		|Admin|admin123|
    Then Navigate to Job Page
    When Add Job Records
    		|Selenium Java|Automation|3 Years Exp|
    		|Appium|Android Automation|2 Years Exp|
    		|Tosca|Automation|3 Years Exp|
    When Click on logout button
    Then Close Browser