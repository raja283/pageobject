package test;

import java.io.IOException;

import org.testng.xml.XmlUtils;

public class Excel2 {
public static void main(String[] args) throws IOException {
	  String path1= "C:\\Users\\Dell\\eclipse-workspace1\\sample\\src\\test\\java\\test\\samp.xlsx";
	  for(int i=1;i<5;i++) {
	 	  {
		XLUtils.setCellData(path1, "Sheet1", 8, i, 1, "data");
		XLUtils.setCellData(path1, "Sheet1", 8, i, 2, "data");
		XLUtils.setCellData(path1, "Sheet1", 8, i, 3, "data");
	  }
}}}

