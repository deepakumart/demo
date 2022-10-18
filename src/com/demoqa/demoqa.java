package com.demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\demoqa\\driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		    driver.get("https://demoqa.com/");
			driver.manage().window().maximize();
		
			
	        WebElement Eclick = driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click();", Eclick);
	        
	       
			WebElement Evisible = driver.findElement(By.xpath("//div[@class='main-header']"));
			boolean displayed = Evisible.isDisplayed();
			System.out.println("Elements :"+displayed);
			driver.navigate().back();
			
			WebElement Fclick = driver.findElement(By.xpath("(//div[@class='card-body'])[2]"));
	        JavascriptExecutor js1=(JavascriptExecutor)driver;
	        js1.executeScript("arguments[0].click();", Fclick);
	        
	       
			WebElement Fvisible = driver.findElement(By.xpath("//div[@class='main-header']"));
			boolean displayed1 = Fvisible.isDisplayed();
			System.out.println("Forms :"+displayed1);
			driver.navigate().back();
			
			WebElement Aclick = driver.findElement(By.xpath("(//div[@class='card-body'])[3]"));
	        JavascriptExecutor js2=(JavascriptExecutor)driver;
	        js2.executeScript("arguments[0].click();", Aclick);
	        
	       
			WebElement Avisible = driver.findElement(By.xpath("//div[@class='main-header']"));
			boolean displayed2 = Avisible.isDisplayed();
			System.out.println("Alerts :"+displayed2);
			driver.navigate().back();
			
			WebElement Wclick = driver.findElement(By.xpath("(//div[@class='card-body'])[4]"));
	        JavascriptExecutor js3=(JavascriptExecutor)driver;
	        js3.executeScript("arguments[0].click();", Wclick);
	        
	       
			WebElement Wvisible = driver.findElement(By.xpath("//div[@class='main-header']"));
			boolean displayed3 = Wvisible.isDisplayed();
			System.out.println("Widgets :"+displayed3);
			driver.navigate().back();
			
			WebElement Iclick = driver.findElement(By.xpath("(//div[@class='card-body'])[5]"));
	        JavascriptExecutor js4=(JavascriptExecutor)driver;
	        js4.executeScript("arguments[0].click();", Iclick);
	        
	       
			WebElement Ivisible = driver.findElement(By.xpath("//div[@class='main-header']"));
			boolean displayed4 = Ivisible.isDisplayed();
			System.out.println("Interactions :"+displayed4);
			driver.navigate().back();
			
			WebElement Bclick = driver.findElement(By.xpath("(//div[@class='card-body'])[5]"));
	        JavascriptExecutor js5=(JavascriptExecutor)driver;
	        js5.executeScript("arguments[0].click();", Bclick);
	        
	       
			WebElement Bvisible = driver.findElement(By.xpath("//div[@class='main-header']"));
			boolean displayed5 = Bvisible.isDisplayed();
			System.out.println("Book :"+displayed5);
			driver.navigate().back();
			
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
		     
		     System.out.println(driver.findElement(By.xpath("//div[@id='output']/div")).getText());
		    
		     
		     
			
			
			

		}

}
