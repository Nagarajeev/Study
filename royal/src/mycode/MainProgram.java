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
		System.out.print(1);
	}
	@Test(enabled=false, priority = 1, groups ={"sanity", "smoke"})
	public void two(){
		System.out.println("method two");
<<<<<<< HEAD
=======
		System.out.println("Checking for conflict");
>>>>>>> branch 'master' of https://github.com/Nagarajeev/Study.git
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
