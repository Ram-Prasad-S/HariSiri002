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
    
@Scenario2
Scenario Outline: TC02 Add Job - particular Test Object
    And User enters username as "Admin" and password as "admin123"
    Then Navigate to Job Page
    When Add Job Records with Jobname as <Job Title> and Jobdescription as <Job Descr> Jobnote <Job Note>
    When Click on logout button
    Then Close Browser
    
    Examples:
    
    |Job Title|Job Descr|Job Note|
    |"Selenium111"|"Test_Engineer111"|"1 Years of Exp"|
    |"Selenium222"|"Test_Engineer222"|"2 Years of Exp"|
    |"Selenium333"|"Test_Engineer333"|"3 Years of Exp"|
    |"Selenium444"|"Test_Engineer444"|"4 Years of Exp"|
    
@Scenario2 @Scenario3    
Scenario: TC03 Add Job - particular Test Object
    And User Enters Login Credinitials
    		|Admin|admin123|
    Then Navigate to Job Page
    When Add Job Records
    		|Selenium Java|Automation|3 Years Exp|
    		|Appium|Android Automation|2 Years Exp|
    		|Tosca|Automation|3 Years Exp|
    When Click on logout button
    Then Close Browser
       
@Scenario1  @Scenario3 @Scenario2 
Scenario: TC04 Add Job - particular Test Object
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