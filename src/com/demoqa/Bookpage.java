package com.demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookpage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	    driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		WebElement Bclick = driver.findElement(By.xpath("(//div[@class='card-body'])[6]"));
        JavascriptExecutor js5=(JavascriptExecutor)driver;
        js5.executeScript("arguments[0].click();", Bclick);
        
       
		WebElement Bvisible = driver.findElement(By.xpath("//div[@class='main-header']"));
		boolean displayed5 = Bvisible.isDisplayed();
		System.out.println("Book :"+displayed5);
	}
}
