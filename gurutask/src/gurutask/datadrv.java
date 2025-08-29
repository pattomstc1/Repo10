package gurutask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import gurutask.ReadExcelFile.*;

public class datadrv {

WebDriver driver;
@Test(dataProvider ="testdata")

public void dataregister(String fname,String lname,String pnumber,String email,String address,String cty,String stte,String pcode,String cntry,String uname,String pwd,String cpwd)
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/newtours/register.php");


driver.findElement(By.name("firstName")).sendKeys(fname);
driver.findElement(By.name("lastName")).sendKeys(lname);
driver.findElement(By.cssSelector("input[name=phone]")).sendKeys(pnumber);

driver.findElement(By.name("userName")).sendKeys(email);
driver.findElement(By.name("address1")).sendKeys(address);
driver.findElement(By.name("city")).sendKeys(cty);
driver.findElement(By.name("state")).sendKeys(stte);
driver.findElement(By.name("postalCode")).sendKeys(pcode);



WebElement countryDropdown = driver.findElement(By.name("country"));
Select select = new Select(countryDropdown);
select.selectByVisibleText(cntry);


driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(uname);
driver.findElement(By.name("password")).sendKeys(pwd);
driver.findElement(By.name("confirmPassword")).sendKeys(cpwd);
driver.findElement(By.name("submit")).click();
}

/*@DataProvider(name="testdata")

public Object[][] testDataFeed()
{
ReadExcelFile config = new ReadExcelFile("C:\\Users\\Admin\\Documents\\example\\GuruTest.xlsx");
int rows= config.getRowCount(0);

Object[][] data = new Object[rows][2];

for(int i=0;i<rows;i++)
{

data[i][0]=config.getData(0,i,0);
data[i][1]=config.getData(0,i,1);
}

return data;
}*/

@DataProvider(name="testdata")
public Object[][] testDataFeed() {
   ReadExcelFile config = new ReadExcelFile("C:\\Users\\Admin\\Documents\\example\\GuruTest2.xlsx");
   /*int rows = config.getRowCount(0);    // number of rows
        int cols = config.getColumnCount(0); // should be 12 for your test

        Object[][] data = new Object[rows-1][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = config.getData(0, i, j);
            }
        }
        return data;
    }*/
   
   int rows = config.getRowCount(0);  // should be 12
   Object[][] data = new Object[1][rows]; // 1 test case, 12 parameters

   for (int i = 0; i < rows; i++) {
       data[0][i] = config.getData(0, i, 0);  // column = 0
   }
   return data;
}
}
