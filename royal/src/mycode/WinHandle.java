package mycode;

import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class WinHandle extends BrowserInitialize
{
	@Test(enabled = false)
	public static WinHandle win2handle()
	{

		driver.get("http://demo.guru99.com/popup.php");			
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
	    String MainWindow = driver.getWindowHandle();	
	    Set<String> s1= driver.getWindowHandles();	
	    Iterator<String> i1=s1.iterator();		
			
	   	while(i1.hasNext())
	   	{
	         String ChildWindow=i1.next();		
	         		
	         if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	         {    		
	              
	                 // Switching to Child window
	                 driver.switchTo().window(ChildWindow);	                                                                                                           
	                 driver.findElement(By.name("emailid"))
	                 .sendKeys("gaurav.3n@gmail.com");                			
	                 
	                 driver.findElement(By.name("btnLogin")).click();			
	                              
				// Closing the Child Window.
	                     driver.close();		
	         }		
	   	
	   	}// Switching to Parent window i.e Main Window.
	     driver.switchTo().window(MainWindow);
		//return null;
		return null;
	}
	
	@Test(enabled=true)
	public void sysprint(){
		System.out.println("Browser Check");
	}
}

