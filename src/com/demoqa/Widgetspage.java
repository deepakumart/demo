package com.demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Widgetspage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\demoqa\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	    driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		WebElement Wclick = driver.findElement(By.xpath("(//div[@class='card-body'])[4]"));
        JavascriptExecutor js3=(JavascriptExecutor)driver;
        js3.executeScript("arguments[0].click();", Wclick);
        
       
		WebElement Wvisible = driver.findElement(By.xpath("//div[@class='main-header']"));
		 String t = Wvisible.getText();
	        System.out.println(t);
		boolean displayed3 = Wvisible.isDisplayed();
		System.out.println("Widgets :"+displayed3);
	}
}
