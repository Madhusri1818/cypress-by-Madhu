package MytestRunner;

import java.io.FileNotFoundException;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.DriverFactory.BaseDriver;
import com.utilities.ReadDataFromConfig;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="Features",
glue= {"StepDefinition","Hooks"},
tags= "@tag13",
plugin= {"pretty","html:target/Actitime.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome=true,
dryRun=false,
publish=true
)

public class runner {
	
	public static ReadDataFromConfig data;
	public static Properties pro;
	public static WebDriver driver;
	public static	BaseDriver driverinstant;
	
	@BeforeClass
	public static  void getBrowser() {                                            
		 data=new ReadDataFromConfig();
			try {
				pro=data.init_cofig();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String browser=pro.getProperty("Browser");
		System.out.println(browser);
	 driverinstant=new BaseDriver();
	driver=driverinstant.init_Driver(browser);
	System.out.println(pro.getProperty("ActiTimeUrl"));
	
	}
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}
