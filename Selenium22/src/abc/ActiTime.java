package abc;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\jyoti\\firefox3\\geckodriver.exe");
	    FirefoxDriver driver = new FirefoxDriver();
		 driver.get("http://www.flipcart.com"); 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		 Thread.sleep(3000);
	WebElement rv = driver.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input"));
	rv.sendKeys("iphone");
	 rv.sendKeys(Keys.ARROW_DOWN);
	

	}

}
