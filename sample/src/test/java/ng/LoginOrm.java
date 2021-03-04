package ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;




public class LoginOrm {
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/eclipse-workspace1/nopCommerce/src/main/java/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		PageFactory.initElements(driver, PomLogin.class);
		PomLogin.username.sendKeys("Admin");
		PomLogin.password.sendKeys("admin123");
		PomLogin.login.click();
		Actions act=new Actions(driver);
		act.moveToElement(PomLogin.admin).build().perform();
		act.moveToElement(PomLogin.menu).build().perform();
		act.moveToElement(PomLogin.users).build().perform();
		PomLogin.users.click();
       
		
	}

}
