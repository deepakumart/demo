package java_assesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_assessement {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\demoqa\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//a[@class='login']")).click();
	   
	    WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    email.sendKeys("dedee@gmail.com");
	    
	    driver.findElement(By.xpath("//i[@class='icon-user left']")).click();
	    
	    WebElement register1 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
	    JavascriptExecutor js5=(JavascriptExecutor)driver;
        js5.executeScript("arguments[0].click();", register1);
	    
//        String error = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
       
//        System.out.println( "Verify that error has been displayed" + error);
        
        
       
	}
}
