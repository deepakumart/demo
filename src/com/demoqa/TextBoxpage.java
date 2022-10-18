package com.demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxpage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\demoqa\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	    driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		 WebElement E1click = driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
	     JavascriptExecutor jsE=(JavascriptExecutor)driver;
	     jsE.executeScript("arguments[0].click();", E1click);
	     
	     driver.findElement(By.xpath("//span[@class='text']")).click();
	     
	     WebElement Name = driver.findElement(By.xpath("//input[@autocomplete='off']"));
	     Name.sendKeys("deepak");
	     
	     WebElement email = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
	     email.sendKeys("deepakumart21@gmail.com");
	     
	     WebElement Caddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
	     Caddress.sendKeys("5/53,agraharam st,amaravati");
	     
	     WebElement Paddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
	     Paddress.sendKeys("5/53,agraharam st,amaravati");
	     
	     WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
	     JavascriptExecutor jsS=(JavascriptExecutor)driver;
	     jsS.executeScript("arguments[0].click();", submit);
	     
	     
	     WebElement t = driver.findElement(By.xpath("//div[@id='output']/div"));
	     String text = t.getText();
	     System.out.println(text);
	    
	     
	     
	}
}
