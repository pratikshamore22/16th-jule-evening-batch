package neostoxpomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import neostoxpomclasses.utility;

public class neostoxhomepage {

	
	@FindBy(xpath="(//a[text()='OK'])[2]") private WebElement okbutton;
	@FindBy(xpath="(//a[text()='Close'])[5]") private WebElement closebutton;
	
	
	@FindBy(id="lbl_username") private WebElement username;
	
	@FindBy(id="lbl_curbalancetop") private WebElement accbalance;
	
	@FindBy(xpath="//span[text()='Logout']") private WebElement logout;
	
	
	public neostoxhomepage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void handlepopup(WebDriver driver) throws InterruptedException {
		
	if(okbutton.isDisplayed())
	{
		
		okbutton.click();
		
		utility.wait(driver, 1000);
		closebutton.click();
	}
	else {
		
		Thread.sleep(1000);
	}
	
	}
	
	public String getaccbalance(WebDriver driver)
	{
		String acbalance=accbalance.getText();
		
		return acbalance;
		
	}
	}
