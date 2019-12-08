import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstProgram {
	
	public static void main(String[] args) {
		
	
		
		//com
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String str = driver.getTitle();
		
		System.out.println(str);
		
		//driver.findElementByXPath("");
	WebElement ele	= driver.findElement(By.xpath("//input[@name='firstname']"));
	ele.clear();
	ele.sendKeys("vignesh");

	 driver.findElement(By.xpath("//input[@name='firstname']")).clear();
	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vignesh");

	 WebElement nwe = driver.findElementByXPath("//input[@id='lastname']");
	 nwe.sendKeys("Name");
	 
	 
	String Linktext = driver.findElement(By.xpath("//strong[text()='Link Test']")).getText();
	System.out.println(Linktext);
	
		
		  driver.findElementById("sex-0").click();
		  JavascriptExecutor jse = ((JavascriptExecutor) driver); 
		  jse.executeScript("scroll(0,300)");
		 
		  
		  driver.navigate().back();
	
	//driver.quit();
	}

}
