package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailrows {

	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\jyoti\\firefox3\\geckodriver.exe");
	    FirefoxDriver d = new FirefoxDriver();
		 
		 d.get("http://www.gmail.com");
		 d.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("jyotikatre974@gmail.com");
		 d.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		 
		 Thread.sleep(3000);
		 d.findElement(By.xpath("//input[@type='password'][@name='password']")).sendKeys("123");
		 Thread.sleep(3000);
		 d.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		 Thread.sleep(3000);
		
		 d.findElement(By.xpath("//span[contains(text(),'Samikhsa Verma')]")).click();
		
		
	}

}
