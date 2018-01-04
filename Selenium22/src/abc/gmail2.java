package abc;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail2 {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException
    {
		
		System.setProperty("webdriver.gecko.driver", "F:\\jyoti\\firefox3\\geckodriver.exe");
	    FirefoxDriver d = new FirefoxDriver();
		 d.get("http://www.gmail.com");
		 d.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("jyotikatre974@gmail.com");
		 d.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		 
		 Thread.sleep(4000);
		d.findElement(By.xpath("//input[@type='password'][@name='password']")).sendKeys("9764749674");
		
		 d.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		 
		 Thread.sleep(4000);
		 
		d.findElement(By.xpath("//*[@id=\":h4\"]")).click();
		 Thread.sleep(4000);
		
		WebElement rv1 = d.findElement(By.xpath("//textarea[@name='to']"));
		rv1.sendKeys("udgirkaronkar94@gmail.com");
		rv1.sendKeys(Keys.ENTER);
		
		
	    Thread.sleep(3000);
	    
		d.findElement(By.xpath("//*[@id=\":n9\"]")).sendKeys("hello");
		  
		 Thread.sleep(3000);
		  
		d.findElement(By.xpath("//*[@id=\":nv\"]")).click();
		
		Robot robot = new Robot();
		
		StringSelection stringSelection = new StringSelection("C:\\Users\\DOt.Softwares\\Desktop\\jyo\\jyoti katre(1)(1) - Copy.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		 robot.setAutoDelay(3000);
		 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 
		 robot.setAutoDelay(3000);
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.setAutoDelay(3000);
		 d.findElement(By.xpath("//*[@id=\":ly\"]")).click();
		
		
		
	   
				
				
		
		
		

	}

}
