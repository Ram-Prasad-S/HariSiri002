@Reg
Feature: Create Job Record automatiom in openorange hrm 
	
Background: common steps 
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    
@Scenario2    
Scenario Outline: TC01 Add Job - particular Test Object
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