package abc;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pops {

	private static Set<String> windows;

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\jyoti\\chrome\\chromedriver.exe");
		 WebDriver d = new ChromeDriver();
		 d.get("http://www.hdfcbank.com");
		 
		 d.manage().window().maximize();
		 //main window handle
		 String homepage = d.getWindowHandle();
		 System.out.println(homepage);
		 Thread.sleep(3000);
		 // click on login
		 d.findElement(By.xpath("//*[@id=\"cee_closeBtn\"]/img")).click();
		 d.findElement(By.xpath("//a[text()='Login']")).click();
		 //how many windows
		 Set<String> window = d.getWindowHandles();
		 System.out.println(window.size());
		//get the id of window
		 Thread.sleep(3000);
		Iterator iterator = windows.iterator();
		while(iterator.hasNext())
		{
			System.out.println();
		}
		 
		 
		 
		 
	}

}
