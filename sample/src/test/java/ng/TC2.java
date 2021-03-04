package ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TC2 {
WebDriver driver;

	@BeforeSuite
	@Parameters("browser")
	void web(String brow)
	{
		 if(brow.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Dell\\eclipse-workspace1\\sample\\src\\test\\java\\ng\\geckodriver.exe");
						 driver=new FirefoxDriver();}
		 else if(brow.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Dell\\eclipse-workspace1\\nopCommerce\\src\\main\\java\\Drivers\\chromedriver.exe");
								 driver=new ChromeDriver();}
	}
	@Test(priority=1)
	@Parameters("name")
	void login1(String name_of_me)
	{
		driver.get("http://www.learnautomationonline.site/2017/10/how-to-write-first-code-using-testng.html");
		System.out.println(name_of_me);
		System.out.println("two");
	}
	@Test(priority=2)
	void login2()
	{
			driver.get("https://stackoverflow.com/questions/31663652/using-selenium-with-testng-cannot-find-dtd-file-for-testng");
	System.out.println("one");
	}
	
	@AfterSuite
	void quit()
	{
		driver.quit();
	}
//    @Test(priority=2) 
//	void log()
//	{
//		System.out.println("1");
//	}
//    @Test(priority=3) 
//	void pas()
//	{
//		System.out.println("2");
//	}
//    @Test(priority=1) 
//	void sub()
//	{
//		System.out.println("3");
//	}
	}
	

