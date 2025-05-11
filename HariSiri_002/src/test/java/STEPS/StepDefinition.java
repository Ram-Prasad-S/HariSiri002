package STEPS;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGEFACTORY.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;
	
	HOMEPAGE hp;
	JOBSPAGE jp;
	LOGINPAGE lp;
	
	

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@When("User opens URL {string}")
	public void user_opens_url(String Required_URL) {

		driver.get(Required_URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String UserName, String PassWord) throws InterruptedException {
		
		lp= new LOGINPAGE();
		lp.LOGINPAGE(driver);
		lp.user_enters_username_as_and_password_as(UserName, PassWord);

		
	}

	@Then("Navigate to Job Page")
	public void go_to_job_page() {
		
		hp= new HOMEPAGE();
		hp.HOMEPAGE(driver);
		hp.Navigate_to_JobsPage();
	}
	
	@When("Add Job Records with Jobname as {string} and Jobdescription as {string} Jobnote {string}")
	public void add_job_records_with_jobname_as_and_jobdescription_as_jobnote(String JNAME, String JDESCR, String JNOTE) throws InterruptedException {
		
		jp= new JOBSPAGE();
		jp.JOBSPAGE(driver);
		jp.Add_JobRecords_Scenario(JNAME, JDESCR, JNOTE);
		
	}
	


	@When("Click on logout button")
	public void click_on_logout_button() {
		
		hp= new HOMEPAGE();
		hp.HOMEPAGE(driver);
		hp.click_on_logout_button();

		
	}

	@Then("Close Browser")
	public void close_browser() {
		
		hp= new HOMEPAGE();
		hp.HOMEPAGE(driver);
		hp.close_browser();

		
	}
	
	@When("User Enters Login Credinitials")
	public void user_enters_login_credinitials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		lp= new LOGINPAGE();
		lp.LOGINPAGE(driver);
		lp.user_enters_login_credinitials(dataTable);
		
	    
	}
	
	@When("Add Job Records")
	public void add_job_records(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		jp= new JOBSPAGE();
		jp.JOBSPAGE(driver);
		jp.Add_JobRecords_Data_Table_Without_Header(dataTable);
	}
		
		@When("User Enters Login using With Header")
		public void user_enters_login_using_with_header(io.cucumber.datatable.DataTable dataTable) throws InterruptedException{
			
			lp= new LOGINPAGE();
			lp.LOGINPAGE(driver);
			lp.user_enters_login_using_with_header(dataTable);
			
		    
		}
		
		
		@When("Add Job Records using With Header")
		public void add_job_records_using_with_header(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			jp= new JOBSPAGE();
			jp.JOBSPAGE(driver);
			jp.Add_JobRecords_Data_Table_With_Header(dataTable);
			
		
		   
		}
   
	}
