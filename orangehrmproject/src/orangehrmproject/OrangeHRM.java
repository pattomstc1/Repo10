package orangehrmproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM {

	
		
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://localhost/orangehrm/orangehrm-5.7/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Thread.sleep(5000);
			driver.findElement(By.name("username")).sendKeys("Sneha123");
			driver.findElement(By.name("password")).sendKeys("Sneha@123");
		
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("firstName")).sendKeys("Sneha");
			driver.findElement(By.name("lastName")).sendKeys("Ratheesh");
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		}


}
