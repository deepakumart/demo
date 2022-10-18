package com.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formspage {
	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\demoqa\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
    driver.get("https://demoqa.com/");
	driver.manage().window().maximize();

	WebElement Fclick = driver.findElement(By.xpath("(//div[@class='card-body'])[2]"));
    JavascriptExecutor js1=(JavascriptExecutor)driver;
    js1.executeScript("arguments[0].click();", Fclick);
    
   
	WebElement Fvisible = driver.findElement(By.xpath("//div[@class='main-header']"));
	boolean displayed1 = Fvisible.isDisplayed();
	System.out.println("Forms :"+displayed1);

}
}
