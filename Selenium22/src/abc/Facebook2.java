package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "F:\\jyoti\\chrome\\chromedriver.exe");
		 WebDriver d = new ChromeDriver();
		 d.get("http://www.facebook.com");
		 WebElement rv = d.findElement(By.xpath("//input[@type='email'][@name='email']"));
		 rv.sendKeys("9923665967");
		 Thread.sleep(3000);
		WebElement rv1 = d.findElement(By.xpath("//input[@type='password'][@name='pass']"));
				rv1.sendKeys("123");
				rv1.sendKeys(Keys.ENTER);
		
		// d.findElement(By.xpath("//input[@type='submit'][@id='u_0_5']")).click();
				//pop window
				d.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[21]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/a[2]")).click();
				Thread.sleep(3000);
				d.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[21]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/a[1]")).click();
				Thread.sleep(3000);
                //click on profile			
				d.findElement(By.xpath("//span[text()='Jyoti']")).click();
				Thread.sleep(3000);
				//click on add photo
				d.findElement(By.xpath("//input[@type='file'][@name='composer_photo[]']")).click();
				

	
	}

}
