package ng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC3 {

String a[][]= { {"admi","adminr"},
		{"admin","admin"},{"dmin","admin123"},{"Ami","admin123"}};


@DataProvider(name="mm")
String [][] data() {
	return a;
}

	
@Test(dataProvider="mm")
void m1(String name ,String pw) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace1\\nopCommerce\\src\\main\\java\\Drivers\\chromedriver.exe");
						WebDriver	 driver=new ChromeDriver();
						driver.get("https://opensource-demo.orangehrmlive.com/");
						driver.findElement(By.id("txtUsername")).sendKeys("name");
						driver.findElement(By.id("txtPassword")).sendKeys("pw");
						driver.findElement(By.id("btnLogin")).click();
						driver.close();
						}
}
