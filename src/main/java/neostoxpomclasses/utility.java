package neostoxpomclasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class utility {
	
	public static String readdatafromexcel(int row,int cell) throws EncryptedDocumentException, IOException
	
	{
		File myFile=new File("E:\\Velocity class\\Book1.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		
			return value;
		}
	
	
	public static void screenshot(WebDriver driver,String screenshotname) throws IOException
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\Velocity class\\screenshot\\"+screenshotname+".png");
		FileHandler.copy(src, dest);
	}
	
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoview(true)",element);
		 
		
	}
	
	public static void wait(WebDriver driver,int waitTime)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		
	}

}
