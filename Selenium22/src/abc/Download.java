package abc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Download {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
	 
		System.setProperty("webdriver.gecko.driver", "F:\\jyoti\\firefox3\\geckodriver.exe");
	    FirefoxDriver d = new FirefoxDriver();
		 
		 d.get("http://www.google.com");
	WebElement rv  =	 d.findElement(By.xpath("//*[@id=\"sb_ifc0\"]"));
	rv.sendKeys("java download");
	rv.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	d.findElement(By.xpath("//a[text()='Download Free Java Software']")).click();
	d.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/a/span")).click();
	d.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/a/span")).click();
	Robot robotobj = new Robot();
	robotobj.keyPress(KeyEvent.VK_TAB);
	robotobj.keyPress(KeyEvent.VK_ENTER);
		
	}

}
