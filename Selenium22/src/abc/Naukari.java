package abc;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\jyoti\\chrome\\chromedriver.exe");
		 WebDriver d = new ChromeDriver();
		 d.get("http://www.naukri.com");
		 Set<String> str = d.getWindowHandles();
		 System.out.println(str);
		 int size =str.size();
		 System.out.println(size);
		 int i=0;
		 for(String string:str)
		 {
			 d.switchTo().window(string);
			 if(i<0)
			 {
				 String title = d.getTitle();
				 System.out.println(title);
				 
			 }
		 }
	}

}
