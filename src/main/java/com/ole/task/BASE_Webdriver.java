package com.ole.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




	public class BASE_Webdriver {
	    protected WebDriver driver;
		@BeforeMethod
		public void setup() throws InterruptedException {
		
			System.setProperty(Constants.CHROMEDRIVER, Constants.CHROMEDRIVER_EXE);
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("disable-infobars");
			 driver = new ChromeDriver(options);
			 driver.manage().window().maximize();
			 driver.get(Constants.URL);
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 Thread.sleep(3000);
			
		}
//		 @AfterMethod()
//		  public void close(){
//			  driver.quit();
//		  }

	}


