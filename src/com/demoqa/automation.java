package com.demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TZ167UZ\\eclipse-workspace\\demoqa\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	    driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

}
