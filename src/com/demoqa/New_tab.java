package com.demoqa;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_tab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\demoqa\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		
		WebElement Aclick = driver.findElement(By.xpath("(//div[@class='card-body'])[3]"));
        JavascriptExecutor js2=(JavascriptExecutor)driver;
        js2.executeScript("arguments[0].click();", Aclick);
        
        WebElement Browser = driver.findElement(By.xpath("(//span[@class='text'])[11] "));
        JavascriptExecutor js3=(JavascriptExecutor)driver;
        js3.executeScript("arguments[0].click();", Browser);
        
        WebElement tab = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        tab.click();
        
       Set<String> windowHandles = driver.getWindowHandles();
       String child="ToolsQA";
       for(String title1: windowHandles) {
       if(driver.switchTo().window(title1).getTitle().equalsIgnoreCase(child));
       }
       
        WebElement f = driver.findElement(By.id("sampleHeading"));
        
        String t = f.getText();
        System.out.println(t);
	}
}
