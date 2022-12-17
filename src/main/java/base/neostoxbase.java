package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class neostoxbase {
	protected WebDriver driver;
	public void launchBrowser() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\Velocity class\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		driver.get("https://neostox.com/sign-in");
		Thread.sleep(1000);
	}

}
