package abc;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Myntra {

	public static void main(String[] args) 
	{
		
		 System.setProperty("webdriver.gecko.driver", "F:\\jyoti\\firefox3\\geckodriver.exe");
	     FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.mynta.com"); 

	}

}
