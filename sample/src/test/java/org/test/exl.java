package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import test.XLUtils;

public class exl {
  public static void main(String[] args) throws Exception {
     
	  System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/eclipse-workspace1/nopCommerce/src/main/java/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement d=driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		Actions act=new Actions(driver);
		act.doubleClick(d).build().perform();
		
		
		
		
		
		
}}