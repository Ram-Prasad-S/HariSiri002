Feature: Create Job Record automatiom in orange hrm 
	
Background: common steps 
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: TC01 Add Job - particular Test Object
    And User Enters Login using With Header
    		|admIN|passwoRD|
    		|Admin|admin123|
    Then Navigate to Job Page
    When Add Job Records using With Header
    		|Title|Description|Years of Exp|
    		|Selenium Automation|Automation|3 Years Exp|
    		|Mobile Automation|Android Automation|2 Years Exp|
    		|Tosca Automation|Automation|3 Years Exp|
    When Click on logout button
    Then Close Browser