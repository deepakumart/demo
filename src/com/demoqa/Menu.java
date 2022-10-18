package com.demoqa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\demoqa\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	    driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		WebElement Wclick = driver.findElement(By.xpath("(//div[@class='card-body'])[4]"));
        JavascriptExecutor js3=(JavascriptExecutor)driver;
        js3.executeScript("arguments[0].click();", Wclick);
        WebElement menu = driver.findElement(By.xpath("(//span[@class='text'])[23]"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", menu);
        
        WebElement click = driver.findElement(By.xpath("(//a[@href='#'])[2]"));
       
        
        Actions builder=new Actions(driver);
        builder.moveToElement(click).build().perform();
       
        Robot r=new Robot();
        
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
       
     
      
     WebElement click1 = driver.findElement(By.xpath("(//a[@href='#'])[7]"));
     
     WebDriverWait ref=new WebDriverWait(driver,10);
     ref.until(ExpectedConditions.visibilityOf(click1));
        String text = click1.getText();
        System.out.println(text);
        
	}
}
