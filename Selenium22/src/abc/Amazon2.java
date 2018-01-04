package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\jyoti\\chrome\\chromedriver.exe");
		 WebDriver d = new ChromeDriver();
		 d.get("http://www.amazon.com");
		Thread.sleep(3000);
		WebElement rv2 = d.findElement(By.xpath("//img[@alt='Shop at Amazon.in']"));
	Actions action = new Actions(d);
		action.moveToElement(rv2);
		action.contextClick().perform();
		action.sendKeys("I").perform();
	}

}
