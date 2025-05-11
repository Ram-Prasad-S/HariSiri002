package PAGEFACTORY;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JOBSPAGE {
	
	WebDriver driver;
	
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
	WebElement Add_Button;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	WebElement JobName_TextBox ;


	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
	WebElement JobDescr_TexBox;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")
	WebElement JobNote_TexBox ;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")
	WebElement Save_Button;


	
	public void JOBSPAGE(WebDriver driver1)
	{
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Add_JobRecords_Scenario(String JNAME, String JDESCR, String JNOTE) throws InterruptedException {
		
		Add_Button.click();
		JobName_TextBox.sendKeys(JNAME);
		JobDescr_TexBox.sendKeys(JDESCR);
		JobNote_TexBox.sendKeys(JNOTE);
		Save_Button.click();
		Thread.sleep(5000);
	}
	
	
	public void Add_JobRecords_Data_Table_Without_Header(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		List<List<String>> JobRecords= dataTable.cells();
		
		for (int i=0; i<JobRecords.size();i++)
		{
			String JOBNAME=  JobRecords.get(i).get(0);
			String JOBDESC= JobRecords.get(i).get(1);
			String JOBNOTE= JobRecords.get(i).get(2);
			
			Add_Button.click();
			JobName_TextBox.sendKeys(JOBNAME);
			JobDescr_TexBox.sendKeys(JOBDESC);
			JobNote_TexBox.sendKeys(JOBNOTE);
			Save_Button.click();
			Thread.sleep(5000);
		}
			
	}
		
	public void Add_JobRecords_Data_Table_With_Header(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		    
			
			List<Map<String, String>> JobDetails= dataTable.asMaps(String.class, String.class);
			
			for (int i=0; i<JobDetails.size();i++)
			{
				String JOBTITLE = JobDetails.get(i).get("Title");
				String JOBDESC  = JobDetails.get(i).get("Description");
				String JOBNOTE  = JobDetails.get(i).get("Years of Exp");
				
				Add_Button.click();
				JobName_TextBox.sendKeys(JOBTITLE);
				JobDescr_TexBox.sendKeys(JOBDESC);
				JobNote_TexBox.sendKeys(JOBNOTE);
				Save_Button.click();
				Thread.sleep(5000);
			}
		   
		}

}
