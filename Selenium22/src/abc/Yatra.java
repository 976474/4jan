package abc;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "F:\\jyoti\\chrome\\chromedriver.exe");
		 WebDriver d = new ChromeDriver();
		 d.get("http://www.yatra.com");
		
	}

}
