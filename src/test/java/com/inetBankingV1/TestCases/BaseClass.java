package com.inetBankingV1.TestCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseurl="https://demo.guru99.com/V1/index.php";
	public String username = "mngr516121";
    public String password = "nerAjYg";
	
    WebDriver driver;
	
	
	@BeforeClass
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Chromedriver_32(114)//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
	}
	
    @AfterClass
    
     public void teardown() {
     	driver.quit();
    }
	
	
	
	
}
