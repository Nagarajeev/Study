package mycode;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MousehoverandGettext extends BrowserInitialize {
	
	@Test(enabled=false)
	public void mousehoversafeco(){
	
		driver.get("https://quote.safeco.com/consumer/home/safeco/contactinfoco.aspx?product=Home&zip=98126&bid=b4d161c5-0ff1-4b60-9c3c-ac13d417312d");
		Actions a = new Actions(driver);
		WebElement voicebtn = driver.findElement(By.xpath("//img[@src='shared/images/question.gif']"));
		a.moveToElement(voicebtn);
		a.build().perform();
		//Thread.sleep(40000);
		WebElement Msg = driver.findElement(By.xpath("//td[@class='jquerybubblepopup-innerHtml']")); 
		String S = Msg.getText();
		System.out.println(S);
	}
}
