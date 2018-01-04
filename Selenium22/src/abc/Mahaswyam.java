package abc;





import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Mahaswyam {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\jyoti\\firefox3\\geckodriver.exe");
	    FirefoxDriver d = new FirefoxDriver();
		 
		 d.get("https://rojgar.mahaswayam.in/#/home/index");
		 Thread.sleep(2000);
	   d.manage().window().maximize();
	 

	  
	   Thread.sleep(2000);
	   	WebElement rv =d.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div/div/section/div[2]/form/div[1]/div[1]"));
	   	rv.sendKeys("455543789714");
	   	rv.sendKeys(Keys.TAB);
	   	WebElement rv2=d.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div/div/section/div[2]/form/div[1]/div[3]"));
	   	rv2.sendKeys("jyoti123");
	   	rv.sendKeys(Keys.ENTER);
	   	
	   	 d.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[3]/div/div[1]/div/div/div[1]/ul/li[3]/a/span"));
	   
	}

}
