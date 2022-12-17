package neostoxTestclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.neostoxbase;
import neostoxpomclasses.neostoxhomepage;
import neostoxpomclasses.neostoxpasswordpage;
import neostoxpomclasses.nestoxlogin;
import neostoxpomclasses.utility;

public class validateneostoxUsername extends neostoxbase {
	
	nestoxlogin login;
	neostoxpasswordpage password;
	neostoxhomepage home;
	@BeforeClass
	public void launchneostox() throws InterruptedException
	{
	launchBrowser();
	
	login=new nestoxlogin(driver);
	password=new neostoxpasswordpage(driver);
	
	home=new neostoxhomepage(driver);
	}
	@BeforeMethod
	
	public void loginintoneostox() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.entermobileno(driver,utility.readdatafromexcel(0, 0));
		
		login.clickonsigninbutton(driver);
		utility.wait(driver,1000);
		password.enterpassword(driver,utility.readdatafromexcel(0, 1));
		Thread.sleep(1000);
		password.clickonsubmitbutton(driver);
		Thread.sleep(1000);
		home.handlepopup(driver);
		
		}
	
	@Test
 public void validateaccountbalance() throws IOException
 {
	Assert.assertNotNull(home.getaccbalance(driver));
	utility.screenshot(driver, "accountbalnce");
 } 
  
}
