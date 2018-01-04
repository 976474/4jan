package abc;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookjyoo {

	public static void main(String[] args) throws IOException, InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", "F:\\jyoti\\firefox3\\geckodriver.exe");
	    FirefoxDriver d = new FirefoxDriver();
		 
		 d.get("http://www.facebook.com");
		 d.manage().window().maximize();
		 d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9923665967");
         d.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123");
         d.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
         Thread.sleep(4000);

         //d.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[21]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/a[1]")).click();
         //Thread.sleep(3000);
        
         d.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[3]/div/div/div[2]/div/div/div/form/div/div[2]/span/div[1]/div/a/div[1]")).click();
         d.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[2]/span/div[1]/div/a/div[1]")).click();
         Thread.sleep(3000);//*[@id="u_0_1g"]/div[2]
         Thread.sleep(2000);
         Runtime.getRuntime().exec("C:\\Users\\DOt.Softwares\\Desktop\\autoit\\newimage.exe");
         Thread.sleep(3000);
         d.findElement(By.xpath("//text()[.='Post']/ancestor::button[1]")).click();
	}

}
