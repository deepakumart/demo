package com.demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_from_dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\demoqa\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	    driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		WebElement Wclick = driver.findElement(By.xpath("(//div[@class='card-body'])[4]"));
        JavascriptExecutor js3=(JavascriptExecutor)driver;
        js3.executeScript("arguments[0].click();", Wclick);
        
        WebElement menu = driver.findElement(By.xpath("(//span[@class='text'])[24]"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", menu);
        
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
        
        Select s=new Select(dropdown);
        s.selectByIndex(2);
        
	}
}
