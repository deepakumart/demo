package com.demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amaon {
	
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("9976188853");
		WebElement continue1 = driver.findElement(By.xpath("//input[@id='continue']"));
		continue1.click();
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		pswd.sendKeys("9788188673");
		WebElement login = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		login.click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		Select m=new Select(dropdown);
		m.selectByIndex(0);
		WebElement sendface = driver.findElement(By.xpath("//input[@type='text']"));
		sendface.sendKeys("Men face wash");
		
        Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		element.click();
		
		Thread.sleep(3000);
		WebElement select = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]"));
		select.click();
		Thread.sleep(3000);
		WebElement buy = driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		buy.click();
        
		
		
	}

}
