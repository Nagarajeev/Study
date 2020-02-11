package mycode;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class MainProgram extends BrowserInitialize{
	@AfterTest
	public void sample()
	{
		System.out.println("Quitting the browser");
		driver.quit();
	}
	
	@Test(enabled=false, priority = 1,dataProvider="Testdata", groups ={"sanity","Regression"})
	public void one(){
		System.out.println("method one");
	}
	@Test(enabled=false, priority = 1, groups ={"sanity", "smoke"})
	public void two(){
		System.out.println("method two");
	}

	@Test(enabled=false, priority = 1, groups ={"sanity", "Regression"})
	public void three(){
		System.out.println("method three");
	}
	
	@Test(enabled=true, priority = 1,dataProvider="Testdata", groups ={"sanity","Regression"})
	public void printxlshtvalues(String A, String B, String C )
	{
		System.out.println(A+B+C);
	}
	
	

}
