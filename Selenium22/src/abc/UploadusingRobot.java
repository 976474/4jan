package abc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadusingRobot {

	public static void main(String[] args) throws AWTException
	{
		Robot robot = new Robot();
		System.setProperty("webdriver.gecko.driver", "F:\\jyoti\\firefox3\\geckodriver.exe");
	    FirefoxDriver d = new FirefoxDriver();
		 
		 d.get("http://demo.automationtesting.in/Register.html");
		 d.findElement(By.xpath("//input[@type='file'][@id='imagesrc']")).click();
		 
		 robot.setAutoDelay(2000);
		 
		 StringSelection stringSelection = new StringSelection("C:\\Users\\DOt.Softwares\\Desktop\\jyoti katre(1)(1) - Copy.docx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		 
		 robot.setAutoDelay(3000);
		//copy path 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 
		 robot.setAutoDelay(3000);
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 

	}

}
