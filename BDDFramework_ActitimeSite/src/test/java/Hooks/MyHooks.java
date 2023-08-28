package Hooks;


import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.DriverFactory.BaseDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class MyHooks {
	@After(order=1)
	public void screenshot(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			
			String screenshot=scenario.getName().replaceAll(" ", "_");
			
			byte[] srcfile=((TakesScreenshot)BaseDriver.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcfile, "image/png", screenshot);
			
			
			File src=((TakesScreenshot)BaseDriver.driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\user\\Downloads\\BDDFramework_ActitimeSite\\screenshot"
					+screenshot);
			FileUtils.copyFile(src,dest);
		}
	}
}
	
	/*public static ReadDataFromConfig data;
public static Properties p;
public static WebDriver driver;
public static	BaseDriver driverinstant;
	
	
	
	// used to get user defined browser from property file
	@BeforeClass
	public static  void getBrowser() {
		 data=new ReadDataFromConfig();
			try {
				p=data.init_cofig();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String browser=p.getProperty("Browser");
		System.out.println(browser);
	 driverinstant=new BaseDriver();
	driver=driverinstant.init_Driver(browser);
	driver.get(p.getProperty("ActiTimeUrl"));
	*/
	


