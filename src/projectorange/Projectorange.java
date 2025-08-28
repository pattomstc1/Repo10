package projectorange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Projectorange {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
        System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
       driver=new FirefoxDriver();
       driver.get("http://localhost/orangehrm/orangehrm-5.7/web/index.php/auth/login");
       //wait until found
      
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       //enter username and password
Thread.sleep(5000);

       driver.findElement(By.name("username")).sendKeys("chinnu");
       driver.findElement(By.name("password")).sendKeys("Chinnu@850349");
     //login
       driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
      
Thread.sleep(5000);

      
      
       //click pim
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
        
 Thread.sleep(3000);

        ///click add employee
         driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
   Thread.sleep(3000);

         //enter first name
          driver.findElement(By.name("firstName")).sendKeys("deepthi");
          driver.findElement(By.name("middleName")).sendKeys("M");
          driver.findElement(By.name("lastName")).sendKeys("George");
          driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
        
         //go back to dashbooard
     Thread.sleep(3000);

        
         driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span")).click();
	}
}

	
