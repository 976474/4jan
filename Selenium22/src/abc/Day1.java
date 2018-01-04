package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1 {

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.gecko.driver", "F:\\jyoti\\firefox3\\geckodriver.exe");
		     FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://www.facebook.com"); 
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9923665967");
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123");
			driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();

	}

}
