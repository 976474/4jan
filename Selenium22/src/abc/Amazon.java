package abc;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class Amazon {

	//private static WebElement departments;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\jyoti\\chrome\\chromedriver.exe");
		 WebDriver d = new ChromeDriver();
		 d.get("http://www.amazon.com");
		Thread.sleep(3000);
		 d.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
		 Thread.sleep(3000);
		WebElement rv = d.findElement(By.xpath("//text()[.='Account & Lists']/ancestor::span[1]"));
		Actions action = new Actions(d);
		action.moveToElement(rv).perform();
		Thread.sleep(3000);
		WebElement rv1 = d.findElement(By.xpath("//text()[.='Departments']/ancestor::span[1]"));
		action.moveToElement(rv1).perform();
		Thread.sleep(3000);
		WebElement rv2 = d.findElement(By.xpath("//img[@alt='Shop at Amazon.in']"));
		action.moveToElement(rv2);
		action.contextClick().perform();
		action.sendKeys("I").perform();
	}

}
