package com.demoqa;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assessment {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		    driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
			search.sendKeys("Ikigai: The Japanese secret to a long and happy life");
			WebElement click = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
			click.click();
			
			
			WebElement rating = driver.findElement(By.xpath("//span[contains(text(),'Rating: 4.6')]"));
			String St = rating.getText();
					
			System.out.println("Rating :"+ St);
            
			
			WebElement review = driver.findElement(By.xpath("//span[contains(text(),'36,788 reviews')]"));
			
			String rt=review.getText();
			System.out.println("Review :"+ rt);
			
       WebElement name = driver.findElement(By.xpath("//span[@role='text']"));
			
			String nm=name.getText();
			System.out.println("NAME :"+ nm);
			
  }
}
