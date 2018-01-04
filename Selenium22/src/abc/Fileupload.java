package abc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\jyoti\\chrome\\chromedriver.exe");
		 WebDriver d = new ChromeDriver();
		 d.get("file:///C:/Users/DOt.Softwares/Desktop/jyo/fileupload.html");
		 d.findElement(By.xpath("//*[@id=\"1\"]")).click();
		 Runtime.getRuntime().exec("C:\\Users\\DOt.Softwares\\Desktop\\autoit\\newtoday.exe");
		 
		
	}

}
