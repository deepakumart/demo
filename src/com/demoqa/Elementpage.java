package com.demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Elementpage {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	    driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
	
		
        WebElement Eclick = driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", Eclick);
        
        
        
       
		WebElement Evisible = driver.findElement(By.xpath("//div[@class='main-header']"));
		
		String text = Evisible.getText();
		System.out.println(text);
	
		
		boolean displayed = Evisible.isDisplayed();
		System.out.println("Elements :"+displayed);

}
}
