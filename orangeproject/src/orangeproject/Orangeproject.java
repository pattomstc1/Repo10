package orangeproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangeproject {

	public static void main(String[] args) throws InterruptedException  
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.findElement(By.name("username")).sendKeys("Admin");
Thread.sleep(1000);

        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
       
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a\n")).click();
        driver.findElement(By.name("firstName")).sendKeys("Sana");
        Thread.sleep(1000);

        driver.findElement(By.name("middleName")).sendKeys("Ann");
        Thread.sleep(1000);

        driver.findElement(By.name("lastName")).sendKeys("Maria");
        Thread.sleep(1000);


        driver.findElement(By.cssSelector("button[type='submit']")).click();

        Thread.sleep(2000);
driver.close();

	}


}
 //commit
