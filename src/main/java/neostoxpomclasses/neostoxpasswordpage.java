package neostoxpomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import neostoxpomclasses.utility;

public class neostoxpasswordpage {

	
	@FindBy(xpath="//input[@name='ctl00$MainContent$_wp_enteraccesspin$txt_accesspin']")private WebElement password;

@FindBy(xpath="//a[text()='Submit']")private WebElement submitbutton;
public neostoxpasswordpage (WebDriver driver)
{
	
	PageFactory.initElements(driver,this);
	
}
public void enterpassword(WebDriver driver,String pwd)
{    utility.wait(driver, 1000);
	password.sendKeys(pwd);
}

public void clickonsubmitbutton(WebDriver driver)
{   utility.wait(driver, 1000);
	submitbutton.click();
}



}