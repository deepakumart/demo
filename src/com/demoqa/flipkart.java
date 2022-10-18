package com.demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		    driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			WebElement id = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			id.sendKeys("9788188673");
			
			WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
			pswd.sendKeys("9788188673");
			
			WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			login.click();
			Thread.sleep(2000);
			WebElement mob = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
			mob.click();
			
			WebElement shop = driver.findElement(By.xpath("(//p[@class='_1aqDWQ'])[2]"));
			shop.click();
			
			WebElement select = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
			select.click();
			Thread.sleep(2000);
			WebElement pin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
//			 JavascriptExecutor js5=(JavascriptExecutor)driver;
//		      js5.executeScript("arguments[0].value='612801';", pin);
		       
			//pin.sendKeys("612801");
			//driver.findElement(By.xpath("//button[@type='button']")).click();
			
			 JavascriptExecutor js5=(JavascriptExecutor)driver;
		        js5.executeScript("arguments[0].click();", pin);
		        
			
			

}
}
