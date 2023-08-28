package com.DriverFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {

	public static WebDriver driver;
	
	// This method used for initalize the browser based on requirement
	
	public WebDriver init_Driver(String browser) 
	{
		System.out.println("Browser is: "+ browser);
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else {
			System.out.println("provide valide browser value :"+browser);
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
}
