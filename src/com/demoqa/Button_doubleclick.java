package com.demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button_doubleclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\demoqa\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	    driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		 WebElement Eclick = driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click();", Eclick);
	        
	        WebElement ClickDouble = driver.findElement(By.xpath("(//span[@class='text'])[5]"));
	        JavascriptExecutor js1=(JavascriptExecutor)driver;
	        js1.executeScript("arguments[0].click();", ClickDouble);
	        
	        WebElement Dclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	        Actions d=new Actions(driver);
	        d.doubleClick(Dclick).perform();
	        
	        WebElement name = driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
	        String text = name.getText();
	        System.out.println(text);
	        
	        
	        

}
}
