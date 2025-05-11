package PAGEFACTORY;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGINPAGE {
	
	
WebDriver driver;


@FindBy(name="username")
WebElement UserName_TextBox;

@FindBy(name="password")
WebElement Password_TexBox;

@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
WebElement Login_Button;

	
	public void LOGINPAGE(WebDriver driver1)
	{
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	public void user_enters_username_as_and_password_as(String UserName, String PassWord) throws InterruptedException {

		UserName_TextBox.sendKeys(UserName);
		Password_TexBox.sendKeys(PassWord);
		Thread.sleep(2000);
		Login_Button.click();
		

	}
	
	public void user_enters_login_credinitials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		String USERNAME = dataTable.cell(0, 0);
		String PASSWORD = dataTable.cell(0, 1);
		
		UserName_TextBox.sendKeys(USERNAME);
		Password_TexBox.sendKeys(PASSWORD);
		Thread.sleep(2000);
		Login_Button.click();
		    
	}

	public void user_enters_login_using_with_header(io.cucumber.datatable.DataTable dataTable) throws InterruptedException{
	
	List<Map<String, String>> LoginDetails= dataTable.asMaps(String.class, String.class);
	
	for (int i=0; i<LoginDetails.size();i++)
	{
		String USERNAME= LoginDetails.get(i).get("admIN");
		
		String PASSWORD= LoginDetails.get(i).get("passwoRD");
		
		UserName_TextBox.sendKeys(USERNAME);
		Password_TexBox.sendKeys(PASSWORD);
		Thread.sleep(2000);
		Login_Button.click();
		
		
		
	}
		
		
	}

}
