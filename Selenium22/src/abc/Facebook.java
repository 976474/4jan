package abc;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\jyoti\\chrome\\chromedriver.exe");
		 WebDriver d = new ChromeDriver();
		 d.get("http://www.facebook.com");
		 WebElement rv = d.findElement(By.xpath("//input[@type='email'][@name='email']"));
		 rv.sendKeys("9923665967");
		 Thread.sleep(3000);
		 rv.clear();
		 rv.sendKeys("admin@gmail.com");
		 rv.sendKeys(Keys.CONTROL+"a");
		 rv.sendKeys(Keys.CONTROL+"c");
		 Thread.sleep(3000);
		 d.findElement(By.xpath("//input[@type='password'][@name='pass']")).sendKeys(Keys.CONTROL+"v");
		 Thread.sleep(3000);
		 d.findElement(By.xpath("//input[@type='submit'][@id='u_0_5']")).click();

	}

}
