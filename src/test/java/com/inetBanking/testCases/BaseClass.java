package com.inetBanking.testCases;


import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetBanking.utilities.ReadConfig;

import freemarker.log.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfig readconfig= new ReadConfig();
	
	
	public String baseUrl=readconfig.getApplicationURL();
	public String username=readconfig.getUserName();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	

	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
//		Logger logger = Logger.getLogger("ebanking");
//		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
