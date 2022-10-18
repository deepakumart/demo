package com.demoqa;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class W_O_Dragdrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\demoqa\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	    driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		WebElement Iclick = driver.findElement(By.xpath("(//div[@class='card-body'])[5]"));
        JavascriptExecutor js4=(JavascriptExecutor)driver;
        js4.executeScript("arguments[0].click();", Iclick);
        
        WebElement drop = driver.findElement(By.xpath("(//span[@class='text'])[28]"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", drop);
        
        Actions d=new Actions(driver);
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        
        WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
        
        d.clickAndHold(drag).moveToElement(droppable).release().build().perform();
        
	}
}
