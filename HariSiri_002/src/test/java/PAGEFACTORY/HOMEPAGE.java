package PAGEFACTORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOMEPAGE {
	
WebDriver driver;

@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
WebElement Admin_Button;

@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")
WebElement JobMenu_Button;

@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")
WebElement JobTitle_Button;

@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")
WebElement User_Button;


@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")
WebElement Logout_Button;

	
	public void HOMEPAGE(WebDriver driver1)
	{
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	public void Navigate_to_JobsPage() {
		
		Admin_Button.click();
		JobMenu_Button.click();
		JobTitle_Button.click();

	}
	
	
	public void click_on_logout_button() {

		User_Button.click();
		
		Logout_Button.click();
		
		System.out.println("Logged Out");

	}

	
	public void close_browser() {

		// driver.close();

		System.out.println("Browser Closed");

	}

}
