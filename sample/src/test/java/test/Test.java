package test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

public static void main(String[] args) throws Exception {
	

	System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/eclipse-workspace1/nopCommerce/src/main/java/Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	String g=driver.getWindowHandle();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
 	driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("science");
 	driver.findElement(By.className("wikipedia-search-button")).click();
 	WebElement search=driver.findElement(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']"));
 	List <WebElement> result = search.findElements(By.tagName("a"));
 	for(WebElement h : result )
 	{
 		h.click();
 	}
 	Set<String> f=driver.getWindowHandles();
 	for(String j:f)
 	{   
 		String vv= 	driver.switchTo().window(j).getTitle();
 		if(!vv.equals("Automation Testing Practice"))
 		{
 		driver.close();
 		}
   }
 	
 	driver.switchTo().window(g);
 	driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
 	driver.switchTo().alert().accept();
 	driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
 	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a")).click();
 	WebElement y=driver.findElement(By.xpath("//select[@id='speed']"));
 	Select speed=new Select(y);
    speed.selectByVisibleText("Slow");
    String a=driver.findElement(By.xpath("//span[contains(text(),'Message_12')]")).getText();
    System.out.println(a);
    WebElement z=driver.findElement(By.xpath("//*[@id='age']")) ;
    		System.out.println(z.getAttribute("title"));
    WebElement l= driver.findElement(By.xpath("//iframe[@id='frame-one1434677811']"));
    driver.switchTo().frame(l);
    driver.findElement(By.name("RESULT_TextField-1")).sendKeys("jim");
    driver.findElement(By.name("RESULT_TextField-2")).sendKeys("raja");
    driver.findElement(By.name("RESULT_TextField-3")).sendKeys("9677516359");
    driver.findElement(By.name("RESULT_TextField-4")).sendKeys("india");
    driver.findElement(By.name("RESULT_TextField-5")).sendKeys("chennai");
    driver.findElement(By.name("RESULT_TextField-6")).sendKeys("frty.gmail.com");
    driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[2]/td/label")).click();
    driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label")).click();
    Select drop=new Select(driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]")));
    drop.selectByIndex(1);
    driver.findElement(By.linkText("Software Testing Tutorials")).click();
   // JavascriptExecutor js=(JavascriptExecutor)driver;
	//WebElement flag=driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
	//js.executeScript("arguments[0].scrollIntoView();",flag);
    driver.switchTo().defaultContent();
    Thread.sleep(2000);
	WebElement d=driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
    Actions act=new Actions(driver);
    act.doubleClick(d).build().perform();
    WebElement source=driver.findElement(By.xpath("//*[@id='draggable']/p"));
    WebElement dest=driver.findElement(By.xpath("//*[@id='droppable']"));
    act.dragAndDrop(source, dest).build().perform();
    WebElement q=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
    act.moveToElement(q).build().perform();
    act.dragAndDropBy(q, 200, 0).build().perform();
    WebElement u=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
    act.dragAndDropBy(u, 200, 200).build().perform();
    WebElement table= driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table"));
    int col=table.findElements(By.tagName("th")).size();
    int row=table.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr")).size();
     System.out.println(row);
   for(int x=2;x<row;x++)
   { String yy=driver.findElement(By.xpath(" //*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+x+"]/td[1]")).getText();
     String tt=driver.findElement(By.xpath(" //*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+x+"]/td[2]")).getText();
     String uu=driver.findElement(By.xpath(" //*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+x+"]/td[3]")).getText();
     String aa=driver.findElement(By.xpath(" //*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+x+"]/td[4]")).getText();
   
     System.out.println(yy+"    "+tt+"     "+uu+"     "+aa);
   }
      }
    
    
    
    
    
    
    
 	
 	
 	
 	
 	
 		
 		
 		
    //driver.close();

	} 
	

	
	



