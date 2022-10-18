package com.demoqa;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\demoqa\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	    driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
				
		WebElement Aclick = driver.findElement(By.xpath("(//div[@class='card-body'])[3]"));
        JavascriptExecutor js2=(JavascriptExecutor)driver;
        js2.executeScript("arguments[0].click();", Aclick);
        
       
		WebElement Avisible = driver.findElement(By.xpath("//div[@class='main-header']"));
		boolean displayed2 = Avisible.isDisplayed();
		System.out.println("Alerts :"+displayed2);
	}
}
