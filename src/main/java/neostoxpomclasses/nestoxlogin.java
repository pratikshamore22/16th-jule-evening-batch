package neostoxpomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import neostoxpomclasses.utility;

public class nestoxlogin {

	@FindBy(xpath="(//a[text()='Sign In'])[2]")private WebElement signinbutton;
@FindBy(xpath="//input[@id='MainContent_signinsignup_txt_mobilenumber']")private WebElement mobileno;
	
	
	
	
	
	public nestoxlogin (WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void entermobileno(WebDriver driver,String mn)
	{   utility.wait(driver, 1000);
	   mobileno.sendKeys(mn);
	}
	
	public void clickonsigninbutton(WebDriver driver)
	{    utility.wait(driver, 1000);
		signinbutton.click();
	}



		
	}


