package ng;

import org.testng.annotations.*;

public class TC1 {

	@Test(groups = {"one"})
	void m1()
	{
		System.out.println("this is m1 from Testcase1");
	}
	
	@Test(groups= {"two"})
	void m2()
	{
		System.out.println("this is m2 from testcase1");
	}
	
	
	@Test (groups= {"one"})
	void mm()
	{
		System.out.println("this is mm");
	}
}
