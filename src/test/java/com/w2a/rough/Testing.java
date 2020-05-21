package com.w2a.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Properties or=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		or.load(fis);
		driver.findElement(By.xpath(or.getProperty("bmlBtn_Xpath"))).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(or.getProperty("addCustBtn_CSS"))).click();
		//driver.findElement(By.xpath(or.getProperty("addCustBtn_Xpath"))).click();
		driver.findElement(By.cssSelector(or.getProperty("firstname_CSS"))).sendKeys("first");
		driver.findElement(By.cssSelector(or.getProperty("lastname_CSS"))).sendKeys("last");
		driver.findElement(By.cssSelector(or.getProperty("postcode_CSS"))).sendKeys("post");
		//driver.findElement(By.cssSelector(or.getProperty("addBtn_CSS"))).click();
	}
}
