package test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel1 {
  public static void main(String[] args) throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace1\\nopCommerce\\src\\main\\java\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	  
	  String path="C:\\Users\\Dell\\eclipse-workspace1\\sample\\src\\test\\java\\test\\Registration.xlsx";
	  String path1= "C:\\Users\\Dell\\eclipse-workspace1\\sample\\src\\test\\java\\test\\samp.xlsx";


driver.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
Thread.sleep(2000);


for(int x=2;x<6;x++)
	for(int y=1;y<4;y++)
{ String yy=driver.findElement(By.xpath("//table/tbody/tr[]/td[3]")).getText();

  XLUtils.setCellData(path1, "Sheet1",7, x, y, yy);

  
}
//for(int i=1;i<6;i++) {
//
//	{
//		String data=driver.findElement(By.xpath("//*[@id=\'HTML1\']/div[1]/table/tbody/tr["+i+"]/td[1]")).getText();
//	            //   	driver.findElement(By.xpath(" //*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+x+"]/td[1]")).getText();
////String data1=XLUtils.getCellData(path, "Sheet1", i, j);
////XLUtils.setCellData(path1, "Sheet1",7, i, j, data);
////System.out.println(data+ "  ");	}}
//   

  }}
